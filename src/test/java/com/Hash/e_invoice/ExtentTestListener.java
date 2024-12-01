package com.Hash.e_invoice;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class ExtentTestListener implements ITestListener {
	    ExtentReports extent = new ExtentReports();
	    ExtentTest test;

	    @Override
	    public void onTestStart(ITestResult result) {
	        test = extent.createTest(result.getMethod().getMethodName());
	    }

	    @Override
	    public void onTestSuccess(ITestResult result) {
	        test.pass("Test passed");
	    }

	    @Override
	    public void onTestFailure(ITestResult result) {
	        test.fail("Test failed: " + result.getThrowable());
	    }
	    @Override
	    public void onTestSkipped(ITestResult result) {
	        test.skip("Test skipped");
	    }

	    @Override
	    public void onFinish(ITestContext context) {
	        extent.flush();
	    }
}
