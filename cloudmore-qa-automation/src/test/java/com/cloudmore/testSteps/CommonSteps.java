package com.cloudmore.testSteps;

import com.cloudmore.driverFactory.WebDriverFactory;
import com.cloudmore.driverFactory.WebDriverHolder;
import com.cloudmore.listener.ScreenShotListener;
import com.cloudmore.pageobjects.BasePage;
import com.cloudmore.utils.PropertyFileReader;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

public class CommonSteps {

    private static final Logger logger = LoggerFactory.getLogger(CommonSteps.class);
    Scenario scenario;

    @Before
    public synchronized void beforeScenario(Scenario scenario) {
        this.scenario = scenario;
        logger.info(">>>>>>>>> beforeScenario called");
        if (WebDriverHolder.getDriver() == null && !scenario.getSourceTagNames().toString().contains("API")) {
            WebDriver driver = WebDriverFactory.getDriverInstance(PropertyFileReader.getInstance().getProperty("browser"));
            logger.info("Set Default Web Browser ");
            WebDriverHolder.setDriver(driver);
            WebDriverHolder.getDriver().manage().window().maximize();

        } else if (scenario.getSourceTagNames().toString().contains("API")) {
            System.out.println(">>>>>>>>> beforeScenario called " + scenario.getSourceTagNames());
            try {
                if (WebDriverHolder.getDriver() != null) {
                    WebDriverHolder.getDriver().quit();
                }
            } catch (Exception e) {
                logger.info(">>>>>>>>> org.openqa.selenium.NoSuchSessionException: Session ID is null ");
            }
        }
    }

    @After
    public synchronized void afterScenario() {
        logger.info(">>>>>>>>> beforeScenario called");
        System.out.println(">>>>>>>>> beforeScenario called " + scenario.getSourceTagNames());
        if (scenario.isFailed()) {
            if (!scenario.getSourceTagNames().toString().contains("API")) {
                ScreenShotListener.takeScreenshot(scenario);
            }
        }
    }

    @Given("User direct to the {string} URL")
    public void userDirectToTheURL(String url) {
        BasePage.getToUrl(url);
        Assert.assertEquals(BasePage.getPageURL(), url);
    }

    @When("User set the Web Page resolution into {string} size")
    public void userSetWindwSize(String windowSize) {
        Dimension dim;
        switch (windowSize) {
            case "DESKTOP":
                dim = new Dimension(1920, 1080);
                WebDriverHolder.getDriver().manage().window().setSize(dim);
                break;
            case "LAPTOP":
                dim = new Dimension(1366, 768);
                WebDriverHolder.getDriver().manage().window().setSize(dim);
                break;
            case "MOBILE":
                dim = new Dimension(414, 896);
                WebDriverHolder.getDriver().manage().window().setSize(dim);
                break;
            case "TAB":
                dim = new Dimension(768, 1024);
                WebDriverHolder.getDriver().manage().window().setSize(dim);
                break;

        }
    }

    @When("Take a screenshot")
    public void userTakeScreenshot() {
        logger.info("UserObject taken screenshot");
        ScreenShotListener.takeScreenshot(scenario);
    }

    @Given("Close the Browser")
    public void userCloseTheBrowser() {
        if (WebDriverHolder.getDriver() != null) {
            WebDriverHolder.getDriver().quit();
        } else {
            Assert.fail("Browser instance is null");
        }
    }


}
