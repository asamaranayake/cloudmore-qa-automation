package com.cloudmore.listener;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

/**
 * This is the Testng Retry Analyzer class with implementing the IRetryAnalyzer
 * So we can run Failed Test scenarios for avoid the False positive errors in Automation
 */
public class TestRetryAnalyzer implements IRetryAnalyzer {
    int counter = 1;
    int retryMaxLimit = 1;

    /**
     * This method use to run Failed Tests for Given number of times
     *
     * @param result need to Pass ITestResults instance as parameter
     * @return :  boolean value to check iteration count is exceed or not
     */
    public boolean retry(ITestResult result) {
        if (counter <= retryMaxLimit) {
            counter++;
            return true;
        }
        return false;
    }
}

