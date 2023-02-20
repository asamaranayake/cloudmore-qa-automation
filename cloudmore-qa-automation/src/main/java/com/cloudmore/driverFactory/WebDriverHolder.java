package com.cloudmore.driverFactory;

import org.openqa.selenium.WebDriver;

/**
 * Web Driver Holder class - To handle Parallel WebDriver instance Creation
 */

public class WebDriverHolder {

    private static final ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    /**
     * Can use to get webdriver instance of the current running Thread
     * @return
     */
    public static WebDriver getDriver(){
        return driver.get();
    }

    /**
     * Can set WebDriver instance into thread
     * @param driver
     */
    public static void setDriver(WebDriver driver){
        WebDriverHolder.driver.set(driver);
    }

}
