package com.cloudmore.runner;


import com.cloudmore.driverFactory.WebDriverFactory;
import com.cloudmore.driverFactory.WebDriverHolder;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ITestContext;
import org.testng.annotations.*;


@CucumberOptions(
        plugin = {
                "pretty","json:target/cucumber-report/cucumber-output.json",
                "html:target/cucumber-report/cucumber-output.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "com.cloudmore.listener.DryRunPlugin",
                "io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm"
        },
        features = {"src/test/resources/featureFiles/"},
        glue = {"com.cloudmore.testSteps"},
        tags = "@assignment")


public class TestRunner extends AbstractTestNGCucumberTests {

    public static ThreadLocal<String> tests = new ThreadLocal<>();
    private static final Logger logger = LoggerFactory.getLogger(TestRunner.class);

    @BeforeTest
    public synchronized void tearUp(ITestContext iTestContext) {
        tests.set(iTestContext.getName());
        logger.info(">>>>>>>>> Test Suite Name"+tests.get());
    }

    @BeforeClass
    @Parameters("browser")
    public synchronized void beforeClassMethods(@Optional("") String browser) {
        logger.info(">>>>>>>>> beforeClassMethods called");
        try {
            if (!browser.isEmpty()) {
                WebDriver driver = WebDriverFactory.getDriverInstance(browser);
                logger.info("Web Browser is initialized "+ browser);
                WebDriverHolder.setDriver(driver);
                WebDriverHolder.getDriver().manage().window().maximize();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @AfterTest
    public void tearDown() {
        if(WebDriverHolder.getDriver() != null) {
            WebDriverHolder.getDriver().quit();
        }

    }





}
