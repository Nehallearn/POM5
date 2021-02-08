package com.yus.reportutil;

import com.aventstack.extentreports.ExtentTest;

public class ExtentReportManager {

    private static ThreadLocal<ExtentTest> etest = new ThreadLocal<>();

    public static ExtentTest getExtentest()
    {
        return etest.get();
    }
    public static void setExtenttest(ExtentTest extenttestrefrence)
    {
        etest.set(extenttestrefrence);

    }
    public static void teardownExtenttest()
    {
        etest.remove();
    }
}
