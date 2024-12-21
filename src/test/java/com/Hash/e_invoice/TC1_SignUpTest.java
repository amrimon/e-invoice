package com.Hash.e_invoice;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class TC1_SignUpTest extends CommonTest{
	
	
	@Test
	public void T01_NavigateToURL() throws InterruptedException {
		test = extent.createTest("Hash Functional Test");
		driver.get("https://dev-ksa.einvoicesolutions.com/login");
		Thread.sleep(10000);
		Assert.assertTrue(driver.findElement(By.xpath("//h1[text()='Welcome Back']")).isDisplayed());
		test.pass("NavigateToURL");
		
		
	}
	
	@Test
    public void T02_ClickonSignUp() throws InterruptedException {
		driver.findElement(By.cssSelector(".sign-in-link")).click();
		Thread.sleep(5000);
		test.pass("ClickonSignUp");
	}
	
	
	@Test
    public void T03_EnterEmail() throws InterruptedException {
		//int number = ThreadLocalRandom.current().nextInt(100, 1000);
		//String Email = "m"+number+"test.hash@yopmail.com";
		//System.out.println(Email);
		
	driver.findElement(By.name("email")).sendKeys(Email);
	Thread.sleep(2000);
	test.pass("EnterEmail");
	}
	
	
	@Test
    public void T04_EnterPassword() throws InterruptedException {
		driver.findElement(By.name("password")).sendKeys("Saimiscool1!");
	    Thread.sleep(2000);
	    test.pass("EnterPassword");
	
	}
	
	
	
	@Test
    public void T05_ConfirmPassword() throws InterruptedException {
		driver.findElement(By.name("confirmPassword")).sendKeys("Saimiscool1!");
		Thread.sleep(2000);
		test.pass("ConfirmPassword");
	}
	
	
	@Test
    public void T06_ClickingOnCheckBox() throws InterruptedException {
		driver.findElement(By.className("ant-checkbox-input")).click();
        Thread.sleep(2000);
        test.pass("ClickingOnCheckBox");
	}
	
	
	@Test
    public void T07_ClickingOnCreateAccount() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='Create Account']")).click();
        Thread.sleep(10000);
        test.pass("ClickingOnCreateAccount");
	}
	
	
	
	@Test
    public void T08_NavigateTOYopMail() throws InterruptedException {
		
		String firstTab = driver.getWindowHandle();
		JavascriptExecutor js = (JavascriptExecutor) driver;//open new tab need js
        js.executeScript("window.open('https://yopmail.com/', '_blank');");

        // Switch to the new tab
        Set<String> windowHandles = driver.getWindowHandles();
        for (String handle : windowHandles) {
            if (!handle.equals(firstTab)) {
                driver.switchTo().window(handle);  // Switch to the new tab
                break;
            }
        }

        // Perform actions on the new tab (Google in this
	driver.findElement(By.id("login")).clear();
	driver.findElement(By.id("login")).sendKeys(Email);
	driver.findElement(By.id("login")).submit();
	Thread.sleep(5000);
	driver.switchTo().frame(driver.findElement(By.id("ifmail")));  //switch to frame 
	Thread.sleep(5000);
	driver.findElement(By.linkText("Verify Account")).click();
	Thread.sleep(5000);
	String SecondTab = driver.getWindowHandle(); 
	Object[] windowHandles1=driver.getWindowHandles().toArray();//second way to switch tab
    driver.switchTo().window((String) windowHandles1[2]);
    Thread.sleep(10000);

    driver.findElement(By.xpath("//span[text()='Sign In']")).click();
    Thread.sleep(10000);
    test.pass("YopmailVerification");
    }
}
