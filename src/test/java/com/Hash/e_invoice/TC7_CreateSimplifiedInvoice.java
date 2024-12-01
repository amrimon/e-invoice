package com.Hash.e_invoice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC7_CreateSimplifiedInvoice extends CommonTest {
	@Test
	public void T01_NavigateToURL() throws InterruptedException {
		driver.get("https://dev-ksa.einvoicesolutions.com/login");
		Thread.sleep(5000);

	}
	@Test
	public void T02_EnterEmail() throws InterruptedException {
		driver.findElement(By.name("email")).sendKeys("m299test.hash@yopmail.com");
		Thread.sleep(2000);
	}
	@Test
	public void T03_EnterPassword() throws InterruptedException {
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Saimiscool1!");
		Thread.sleep(2000);
	}
	@Test
	public void T04_ClickOnSignIn() throws InterruptedException{
		driver.findElement(By.xpath("//span[text()='Sign In']")).click();
		Thread.sleep(5000);
	}
	@Test 
	public void T05_ClickOneInvoice () throws InterruptedException{
		
		driver.findElement(By.xpath("//a[@href='/e-invoices']")).click();
		Thread.sleep(5000);		
		
	}
	@Test
	public void T06_ClickOnCreate() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='Create New']")).click();
		Thread.sleep(2000);
	}
	@Test
	public void T07_SelectOrganization () throws InterruptedException{
		driver.findElement(By.name("OrganizationId")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//span[text()='منظمة الصحة العالمية'])[1]")).click();
		Thread.sleep(2000);

	}
	/*@Test
	public void T08_SelectEntity () throws InterruptedException{
		driver.findElement(By.xpath(" (//input[@type='search'])[3]")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("(//input[@type='search'])[3]")).sendKeys("منظمة الصحة العالمية");
		Thread.sleep(5000);

	}
	@Test
	public void T09_SelectDevice () throws InterruptedException{
		driver.findElement(By.xpath(" (//input[@type='search'])[4]")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("(//input[@type='search'])[4]")).sendKeys("Saudi Telecom Company");
		Thread.sleep(5000);

	}*/
	@Test
	public void T10_SelectInvoiceType () throws InterruptedException{
		driver.findElement(By.xpath("//div[@name='InvoiceType']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//span[text()='Simplified Tax Invoice'])[1]")).click();
		Thread.sleep(2000);

	}
	@Test
	public void T11_SelectSupplyStartDate () throws InterruptedException{
		driver.findElement(By.name("Delivery.ActualDeliveryDate")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//a[text()='Today'])[1]")).click();
		Thread.sleep(2000);
	}
	@Test
	public void T12_SelectSupplyEndDate () throws InterruptedException{
		driver.findElement(By.name("Delivery.LatestDeliveryDate")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//a[text()='Today'])[2]")).click();
		Thread.sleep(2000);
	}
	@Test
	public void T13_InputIteamName () throws InterruptedException{
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("الكمبيوتر المحمول");
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("Laptop");
		Thread.sleep(2000);
	}
	@Test
	public void T14_InputQantity () throws InterruptedException{
		driver.findElement(By.xpath("(//input[@type='number'])[1]")).sendKeys("1");
		Thread.sleep(2000);
	}
	@Test
	public void T15_InputPrice () throws InterruptedException{
		driver.findElement(By.xpath("(//input[@type='number'])[2]")).sendKeys("100");
		Thread.sleep(2000);
	}
	@Test
	public void T16_InputUnit () throws InterruptedException{
		
	
		
		
		
		
		driver.findElement(By.xpath("//div[contains(@class,'select unit-code')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@type='search'])[9]")).sendKeys("inch");
		//Thread.sleep(5000);
		//driver.findElement(By.xpath("(//input[@type='search'])[9]")).submit();

		//driver.findElement(By.xpath("//input[@aria-controls='rc_select_6_list']")).sendKeys("inch");
		

		//Thread.sleep(10000);
		//driver.findElement(By.xpath("(//span[text()='inch'])[1]")).click();
		//driver.findElement(By.xpath("//span[text()='Select Unit']")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[contains(@class,'TAX-select')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='S [15%]']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@type='search'])[11]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='In Cash']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Generate and Send']")).click();
		Thread.sleep(5000);
		
	}
	
}
