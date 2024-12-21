package com.Hash.e_invoice;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC8_CreateStandardInvoice extends CommonTest{
	@Test
	public void T01_NavigateToURL() throws InterruptedException {
		driver.get("https://dev-ksa.einvoicesolutions.com/login");
		Thread.sleep(5000);

	}
	@Test
	public void T02_EnterEmail() throws InterruptedException {
		driver.findElement(By.name("email")).sendKeys("m300test.hash@yopmail.com");
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

		driver.findElement(By.xpath("(//span[text()='التكنولوجيا الحديثة'])[1]")).click();
		Thread.sleep(2000);

	}
	@Test
	public void T10_SelectInvoiceType () throws InterruptedException{
		driver.findElement(By.xpath("//div[@name='InvoiceType']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//span[text()='Standard Tax Invoice'])[1]")).click();
		Thread.sleep(2000);

	}
	@Test
	public void T11_SelectCustomer() throws InterruptedException{
		driver.findElement(By.name("CustomerId")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//span[text()=' صندوق النقد الدول'])[1]")).click();
		Thread.sleep(2000);
	}
	@Test
	public void T12_PurchaseOrder() throws InterruptedException {
		driver.findElement(By.name("OrderReferenceID")).sendKeys("123");
		Thread.sleep(2000);
	}
	@Test
	public void T13_ContractNumber() throws InterruptedException {
		driver.findElement(By.name("ContractDocumentID")).sendKeys("111");
		Thread.sleep(2000);
	}
	@Test
	public void T14_SelectSupplyStartDate () throws InterruptedException{
		driver.findElement(By.name("Delivery.ActualDeliveryDate")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//a[text()='Today'])[1]")).click();
		Thread.sleep(2000);
	}
	@Test
	public void T15_SelectSupplyEndDate () throws InterruptedException{
		driver.findElement(By.name("Delivery.LatestDeliveryDate")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//a[text()='Today'])[2]")).click();
		Thread.sleep(2000);
	}
	@Test
	public void T16_InputIteamName () throws InterruptedException{
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("الكمبيوتر المحمول");
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("Laptop");
		Thread.sleep(2000);
	}
	@Test
	public void T17_InputQantity () throws InterruptedException{
		driver.findElement(By.xpath("(//input[@type='number'])[1]")).clear();
		//Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@type='number'])[1]")).sendKeys("2");
		Thread.sleep(5000);
	}
	@Test
	public void T18_InputPrice () throws InterruptedException{
		driver.findElement(By.xpath("(//input[@type='number'])[2]")).clear();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='number'])[2]")).sendKeys("100");
		Thread.sleep(5000);
	}
	@Test
	public void T19_InputUnit () throws InterruptedException{
	   // driver.findElement(By.xpath("//div[contains(@class,'select unit-code')]")).click();
		driver.findElement(By.xpath("(//input[@type='search'])[10]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@type='search'])[10]")).sendKeys("inch");
		Thread.sleep(10000);
	}
	@Test
	public void T20_SelectTaxPercentage () throws InterruptedException {
		driver.findElement(By.xpath("//div[contains(@class,'TAX-select')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='S [15%]']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//input[@type='search'])[12]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='In Cash']")).click();
		Thread.sleep(5000);
	    driver.findElement(By.xpath("//span[text()='Generate and Send']")).click();
		Thread.sleep(5000);
		
	}
	

}
