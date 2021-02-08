package com.yus.reportutil;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.yus.constants.FrameworkConstants;

import java.util.Objects;

public class ExtentReportBase {
    private static ExtentReports extent;


    public static void initReports() throws Exception {
        if(Objects.isNull(extent)) {
            extent = new ExtentReports();
            ExtentSparkReporter spark = new ExtentSparkReporter(FrameworkConstants.getEXTENTREPORTPATH());
            extent.attachReporter(spark);
            spark.config().setTheme(Theme.DARK);
            spark.config().setDocumentTitle("Nehal Automation Report");
            spark.config().setReportName("Nehal Automation Report Name");
        }

    }
    public static void flushReports()
    {
        if(Objects.nonNull(extent)) {
            extent.flush();
        }

    }
    public static void createReportTest(String testname)
    {
       ExtentTest test = extent.createTest(testname).assignAuthor("Nehal").assignCategory("Regression");
       ExtentReportManager.setExtenttest(test);

    }
}
