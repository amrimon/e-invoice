package com.Hash.e_invoice;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.ThreadLocalRandom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.AssertJUnit;

/**
 * Unit test for simple App.
 */
public class CommonTest
{
	public static WebDriver driver;
	public static String Email;
	public static ExtentReports extent;//this is i am using for extent report
	public static ExtentTest test; //this is i am using for extent report
	
@BeforeSuite
public void setup() throws InterruptedException {
	int number = ThreadLocalRandom.current().nextInt(100, 1000);//Random number generator method
	Email = "am"+number+"test.hash@yopmail.com";
	System.out.println(Email);
	
	System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
	
	driver = new ChromeDriver();
	//driver = new SafariDriver();
	driver.manage().window().maximize();
	Thread.sleep(1000);
	//driver.get("https://dev-ksa.einvoicesolutions.com/login"); if i enter here i don't need to enter on all other page
	
	//Thread.sleep(10000);
	
	extent = ExtentManager.createInstance("test-output/extentReport.html");//this is using for extend report
}
	
	@AfterSuite
	public  void teardown() {
	driver.quit();
	extent.flush();//this is using for extend report.
	}
	
}
