package com.cloudmore.listener;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.model.Media;
import com.cloudmore.runner.TestRunner;
import com.cloudmore.utils.ExtentReportManager;
import io.cucumber.plugin.ConcurrentEventListener;
import io.cucumber.plugin.event.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * This is Cucumber Event listener Class
 * We use this is to Create Extent Report with supports to parallel test runs
 * TO generate Extent Report for UI Automation Please run TestNG.XML Otherwise cucumber Report only executed
 */


public class DryRunPlugin implements ConcurrentEventListener {

    private static final Logger logger = LoggerFactory.getLogger(DryRunPlugin.class);
    public static ExtentReports extent;
    public static ThreadLocal<String> testname = TestRunner.tests;

    private static ThreadLocal<ExtentTest> parentTest = new ThreadLocal();
    private Map<String, ExtentTest> featureExtentMap = new HashMap<>();
    public static String tempFeatureName ="null";
    private ExtentTest scenarioNodes;
    private ExtentTest stepNodes;

    @Override
    public void setEventPublisher(EventPublisher eventPublisher) {
        eventPublisher.registerHandlerFor(TestRunFinished.class, teardown);
        eventPublisher.registerHandlerFor(TestRunStarted.class, this::featureStarted);
        eventPublisher.registerHandlerFor(TestCaseStarted.class, this::scenarioStarted);
        eventPublisher.registerHandlerFor(TestStepStarted.class, this::stepStarted);
        eventPublisher.registerHandlerFor(TestStepFinished.class, this::stepFinished);
    }

    /**
     * @param event
     */
    private synchronized void featureStarted(TestRunStarted event) {
        try {
            extent = ExtentReportManager.getInstance();
        } catch (Exception e) {
            logger.error("Error getting :" + e.getMessage());
        }
        String featureName = event.toString();
        logger.info("Test Name: " + testname.get());
        ExtentTest testClassObj;
        testClassObj = extent.createTest("Test Name: " + testname.get());
        logger.info("Create TestNG Test in Extent Report : Test Name: " + testname.get());
        parentTest.set(testClassObj);
    }

    /**
     * @param event
     */
    private synchronized void scenarioStarted(TestCaseStarted event) {
        try {

            String featureName = event.getTestCase().getUri().toString().split("featureFiles/")[1];
            logger.info("<b>featureName:</b> " + featureName);
            //Creating Feature Extent Node
            if(!tempFeatureName.equalsIgnoreCase(featureName)||tempFeatureName.equalsIgnoreCase("null")){
                ExtentTest featureNode = parentTest.get().createNode(featureName);
                featureExtentMap.put(featureName, featureNode);
            }

            //Creating Scenario Extent Node
            logger.info("Scenario : " + event.getTestCase().getName());
            scenarioNodes = featureExtentMap.get(featureName).createNode("<b>Scenario :</b> " + event.getTestCase().getName());
            tempFeatureName =featureName;

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * @param event
     */
    private synchronized void stepStarted(TestStepStarted event) {
        if (event.getTestStep() instanceof PickleStepTestStep) {
            PickleStepTestStep steps = (PickleStepTestStep) event.getTestStep();
            if (steps.getStep().getKeyword().equalsIgnoreCase("Given ")) {
                stepNodes = scenarioNodes.createNode(com.aventstack.extentreports.gherkin.model.Given.class, "<b>Given</b> " + steps.getStep().getText());
            } else if (steps.getStep().getKeyword().equalsIgnoreCase("Then ")) {
                stepNodes = scenarioNodes.createNode(com.aventstack.extentreports.gherkin.model.Then.class, "<b>Then</b> " + steps.getStep().getText());
            } else if (steps.getStep().getKeyword().equalsIgnoreCase("When ")) {
                stepNodes = scenarioNodes.createNode(com.aventstack.extentreports.gherkin.model.When.class, "<b>When</b> " + steps.getStep().getText());
            } else if (steps.getStep().getKeyword().equalsIgnoreCase("And ")) {
                stepNodes = scenarioNodes.createNode(com.aventstack.extentreports.gherkin.model.And.class, "<b>And</b> " + steps.getStep().getText());
            } else {
                stepNodes = scenarioNodes.createNode(steps.getStep().getText());
            }
        }
    }

    /**
     * @param event
     */
    private synchronized void stepFinished(TestStepFinished event) {
        if (event.getTestStep() instanceof PickleStepTestStep) {
            if (((PickleStepTestStep) event.getTestStep()).getStep().getText().contains("Take a screenshot")) {
                stepNodes.info("Take a screenshot");
                stepNodes.addScreenCaptureFromPath(ScreenShotListener.takeScreenshot(event.getTestStep().toString()));
            } else if (event.getResult().getStatus().toString().equals("PASSED")) {
                stepNodes.pass("PASSED");
            } else if (event.getResult().getStatus().toString().equals("FAILED")) {
                stepNodes.fail(event.getResult().getError().fillInStackTrace());
                if(!event.getTestCase().getTags().toString().contains("API")) {
                    stepNodes.addScreenCaptureFromPath(ScreenShotListener.takeScreenshot(event.getTestStep().toString()));
                }
                logger.error(event.getResult().getError().fillInStackTrace().toString());
            } else {
                stepNodes.skip("Test steps is SKIPPED ");
            }
        }
    }

    /**
     *
     */
    private EventHandler<TestRunFinished> teardown = event -> {
        //run code after all tests
        extent.flush();
    };

}
