package com.Hash.e_invoice;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TC5_AddDevice extends CommonTest{
@Test
	
	public void T01_NavigateToURL() throws InterruptedException {
		driver.get("https://dev-ksa.einvoicesolutions.com/login");
		Thread.sleep(5000);

	}
	@Test
	public void T02_EnterEmail() throws InterruptedException {
		driver.findElement(By.name("email")).sendKeys("m202test.hash@yopmail.com");
		Thread.sleep(2000);
	}
	@Test
	public void T03_EnterPassword() throws InterruptedException {
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Saimiscool1!");
		Thread.sleep(3000);
	}
	@Test
	public void T04_ClickOnSignIn() throws InterruptedException{
		driver.findElement(By.xpath("//span[text()='Sign In']")).click();
		Thread.sleep(5000);
	}
	@Test
	public void T05_AddEntity() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='Add Device']")).click();
		Thread.sleep(5000);
	}
	@Test
	public void T06_EnterEmail() throws InterruptedException{
		driver.findElement(By.name("Email")).sendKeys("mukithllc@gmail.com");
		Thread.sleep(5000);
		
	}
	
	@Test
	public void T07_EnterSerialNumber() throws InterruptedException{
		driver.findElement(By.name("SerialNumber")).sendKeys("1-test|2-test|3-test");
		Thread.sleep(5000);
	}
	@Test
	public void T08_EnterDeviceName() throws InterruptedException{
		driver.findElement(By.name("DeviceName")).sendKeys("HashDevice");
		Thread.sleep(5000);
	}
	@Test
	public void T09_EnterCommonName() throws InterruptedException{
		driver.findElement(By.name("CommonName")).sendKeys("HashTech");
		Thread.sleep(5000);
	}
	@Test
	public void T10_EnterOrgUnitName() throws InterruptedException{
		driver.findElement(By.name("OrganizationUnitName")).sendKeys("1234567890");
		Thread.sleep(5000);
	}
//	@Test
//	public void T011_SelectCountry() throws InterruptedException{
//		driver.findElement(By.xpath("(//span[text()='Saudi Arabia'])[1]")).click();
//		Thread.sleep(5000);
//	}
//	@Test
	//public void T012_SelectBuissLocation() throws InterruptedException{
		//driver.findElement(By.xpath("(//span[text()='Saudi Arabia'])[2]"));
		//Thread.sleep(5000);
	//}
	@Test
	public void T13_EnterBuissSector() throws InterruptedException{
		driver.findElement(By.name("Category")).sendKeys("Tax Service");
		Thread.sleep(5000);
	}
	@Test
	public void T14_SelectInvoiceType() throws InterruptedException{
		//JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("window.scrollBy(0,5000)");
		//Actions actions = new Actions(driver);

        // Scroll down using the PAGE_DOWN key
       // actions.sendKeys(org.openqa.selenium.Keys.PAGE_DOWN).perform();
		driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);
		driver.findElement(By.xpath("(//input[@type='search'])[4]")).sendKeys("Both");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[text()='Both'])")).click();
		Thread.sleep(5000);
	}
	@Test
	public void T15_SelectEntity() throws InterruptedException{
		
		driver.findElement(By.xpath("(//input[@type='search'])[5]")).sendKeys("منظمة الصحة العالمية");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[text()='منظمة الصحة العالمية'])")).click();
		Thread.sleep(5000);
	}
	@Test
	public void T16_EnterOTP() throws InterruptedException{
		driver.findElement(By.name("Otp")).sendKeys("123456");
		Thread.sleep(5000);
	}
	
	@Test
	public void T17_UploadLogo() throws InterruptedException {
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("/Users/user/Downloads/imresizer-1727671168278.jpg");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//span[text()='OK']")).click();
		Thread.sleep(5000);
		
	}
	@Test
	public void T18_ClickOnSave() throws InterruptedException{
		driver.findElement(By.xpath("//span[text()='Save']")).click();
		Thread.sleep(5000);
	}
	@Test
	public void T19_ClickOnContinue() throws InterruptedException{
		driver.findElement(By.xpath("//span[text()='Continue']")).click();
		Thread.sleep(5000);
	}
	@Test
	public void T20_ClickOnContinue() throws InterruptedException{
		driver.findElement(By.xpath("//span[text()='Go To Dashboard']")).click();
		Thread.sleep(5000);
	}
	
}
