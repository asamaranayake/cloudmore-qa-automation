package com.cloudmore.listener;


import com.cloudmore.driverFactory.WebDriverHolder;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import java.io.File;
import java.io.IOException;

public class ScreenShotListener {

    static int index = 0;

    /**
     * Can Use for attached the Screen Shots into Cucumber Report
     * @param scenario
     */
    public static void takeScreenshot(Scenario scenario) {
        // Take a screenshot as byte array and return
        final byte[] screenshot = ((TakesScreenshot) WebDriverHolder.getDriver()).getScreenshotAs(OutputType.BYTES);
        // embed it in the report.
        scenario.attach(screenshot, "image/png", scenario.getName());
    }

    /**
     * Can Use for attached the Screen Shots into Extent Report
     * @param testDescription
     * @return
     */
    public static String takeScreenshot(String testDescription) {

        String FileName = testDescription + index + ".jpg";
        String path = "target/extent-output/" + FileName;

        try {
            File e = ((TakesScreenshot) WebDriverHolder.getDriver()).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(e, new File(path));
        } catch (WebDriverException | IOException var5) {
            var5.printStackTrace();
        }

        String relativePath =FileName;
        index++;
        return relativePath;
    }


}
