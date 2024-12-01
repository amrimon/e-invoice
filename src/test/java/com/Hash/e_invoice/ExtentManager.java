package com.Hash.e_invoice;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {
	    private static ExtentReports extent;

	    public static ExtentReports createInstance(String fileName) {
	    	ExtentSparkReporter spark = new ExtentSparkReporter(fileName); // Create HTML reporter
	        extent = new ExtentReports(); // Create ExtentReports instance
	        extent.attachReporter(spark); // Attach the HTML reporter
	        return extent;
}
	    public static void flush() {
	        extent.flush(); // Generate the report after the test run
	    }
}