package com.yus.reportutil;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.yus.drivers.DriverManager;
import com.yus.enums.ConfigProperties;
import com.yus.utils.PropertyReader;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ExtentLogger {

    public static void pass(String message)
    {
        ExtentReportManager.getExtentest().pass(message);

    }
    public static void fail(String message)
    {
        ExtentReportManager.getExtentest().fail(message);

    }
    public static void skip(String message)
    {
        ExtentReportManager.getExtentest().skip(message);

    }
    public static void info(String message)
    {
        ExtentReportManager.getExtentest().info(message);

    }
    public static void pass(String message,boolean isScreenshotRequired) throws Exception {
        if(PropertyReader.getPropertyValue(ConfigProperties.SCREENSHOTFORPASSEDTESTS).equalsIgnoreCase("yes") && isScreenshotRequired)
        {
            ExtentReportManager.getExtentest().pass(message, MediaEntityBuilder.createScreenCaptureFromBase64String(getScreenshotasBase64()).build());
        }
        else
        {
            pass(message);

        }

    }
    public static void fail(String message,boolean isScreenshotRequired) throws Exception {
        if(PropertyReader.getPropertyValue(ConfigProperties.SCREENSHOTFORFAILEDTESTS).equalsIgnoreCase("yes") && isScreenshotRequired)
        {
            ExtentReportManager.getExtentest().fail(message, MediaEntityBuilder.createScreenCaptureFromBase64String(getScreenshotasBase64()).build());
        }
        else
        {
            fail(message);

        }

    }

    public static String getScreenshotasBase64()
    {
        return ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.BASE64);
    }
}
