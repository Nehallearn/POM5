package com.yus.listeners;
import com.yus.reportutil.ExtentLogger;
import com.yus.reportutil.ExtentReportBase;
import org.testng.*;

public class TestListeners implements ITestListener, ISuiteListener{


    @Override
    public void onStart(ISuite suite) {
        try {
            ExtentReportBase.initReports();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void onFinish(ISuite suite) {
        ExtentReportBase.flushReports();

    }

    @Override
    public void onTestStart(ITestResult result) {
        ExtentReportBase.createReportTest(result.getMethod().getMethodName());

    }

    @Override
    public void onTestSuccess(ITestResult result) {
        try {
            ExtentLogger.pass(result.getMethod().getMethodName()+" is passed",true);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    @Override
    public void onTestFailure(ITestResult result) {
        try {
            ExtentLogger.fail(result.getMethod().getMethodName()+" is failed",true);
            ExtentLogger.fail(result.getThrowable().toString());
            ExtentLogger.fail(result.getThrowable().getStackTrace().toString());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void onTestSkipped(ITestResult result) {
        ExtentLogger.skip(result.getMethod().getMethodName()+ "is skipped");

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onStart(ITestContext context) {

    }

    @Override
    public void onFinish(ITestContext context) {

    }
}
