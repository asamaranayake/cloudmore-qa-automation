package com.cloudmore.utils;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Protocol;
import com.aventstack.extentreports.reporter.configuration.Theme;

/**
 * Extent Report management Class
 */

public class ExtentReportManager {

    private static ExtentReports extentReport;
    private ExtentReportManager(){}



    //to get Singleton ExtentReports instance
    public static ExtentReports getInstance() throws Exception {
        if (extentReport == null) {
            return createReportInstance();
        } else {
            return extentReport;
        }
    }

    //Create ExtentReports instance
    public static ExtentReports createReportInstance() throws Exception {

        //Create Extent Spark Report instance
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter(PropertyFileReader.getInstance().getProperty("extent.report.path"));

        //set all the Report configuration
        sparkReporter.config().setEncoding("UTF-8");
        sparkReporter.config().setCss("css-string");
        sparkReporter.config().setJs("js-string");
        sparkReporter.config().setTimelineEnabled(true);
        sparkReporter.config().setProtocol(Protocol.HTTPS);
        sparkReporter.config().setTheme(Theme.STANDARD);
        sparkReporter.config().setReportName("cloudmore-automations-Report");
        sparkReporter.config().setOfflineMode(true);
        sparkReporter.config().setDocumentTitle("cloudmore-automations");
        sparkReporter.config().setTimeStampFormat("MMM dd, yyyy HH:mm:ss");

        extentReport = new ExtentReports();
        extentReport.attachReporter(sparkReporter);
        return extentReport;
    }

}
