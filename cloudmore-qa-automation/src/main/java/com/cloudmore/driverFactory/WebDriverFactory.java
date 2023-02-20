package com.cloudmore.driverFactory;

import com.cloudmore.utils.PropertyFileReader;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.FirefoxDriverManager;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * WebDriver Factory Class
 */

public class WebDriverFactory {

    private static final Logger logger = LoggerFactory.getLogger(WebDriverFactory.class);


    /**
     * Can use to create Selenium WebDriver creation with given browser
     * @param browserName
     * @return WebDriver Instance based on the @param browserName
     */
    public static WebDriver getDriverInstance(String browserName) {

        switch (browserName.toLowerCase()) {
            case "chrome-headless" :
                ChromeOptions headlessChromeOptions = new ChromeOptions();
                headlessChromeOptions.addArguments("enable-automation");
                headlessChromeOptions.addArguments("--no-sandbox");
                headlessChromeOptions.addArguments("--disable-extensions");
                headlessChromeOptions.addArguments("--dns-prefetch-disable");
                headlessChromeOptions.addArguments("--disable-gpu");
                headlessChromeOptions.addArguments("--disable-notifications");
                headlessChromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
                headlessChromeOptions.setHeadless(true);
                WebDriverManager.chromedriver().setup();
                return new ChromeDriver(headlessChromeOptions);
            case "firefox":
                FirefoxDriverManager.firefoxdriver().setup();
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                firefoxOptions.addArguments("--disable-notifications");
                firefoxOptions.addArguments(PropertyFileReader.getInstance().getProperty("browser.resolution"));
                return new FirefoxDriver(firefoxOptions);
            case "msedge":
                WebDriverManager.edgedriver().setup();
                EdgeOptions edgeOptions = new EdgeOptions();
                edgeOptions.addArguments("--disable-notifications");
                edgeOptions.addArguments(PropertyFileReader.getInstance().getProperty("browser.resolution"));
                return new EdgeDriver();
            default:
                logger.info("Default WebDriver (Google Chrome) is selected");
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("enable-automation");
                chromeOptions.addArguments("--no-sandbox");
                chromeOptions.addArguments("--disable-extensions");
                chromeOptions.addArguments("--dns-prefetch-disable");
                chromeOptions.addArguments("--disable-gpu");
                chromeOptions.addArguments("--disable-notifications");
                chromeOptions.addArguments(PropertyFileReader.getInstance().getProperty("browser.resolution"));
                chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
                WebDriverManager.chromedriver().setup();
                return new ChromeDriver(chromeOptions);


        }

    }


}
