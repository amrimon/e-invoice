package com.Hash.e_invoice;

import org.testng.annotations.Test;
import java.util.concurrent.ThreadLocalRandom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class TC2_SignInTest extends CommonTest  {
	//@Test
	//public void T01_NavigateToURL() throws InterruptedException {
		//driver.get("https://dev-ksa.einvoicesolutions.com/login");
		//Thread.sleep(10000);

	//}
	@Test
	public void T02_EnterEmail() throws InterruptedException {
		driver.findElement(By.name("email")).sendKeys(Email);
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
		Thread.sleep(10000);
	}
	@Test
	public void T05_EnterOrgNmAR (){
		try {

			if (driver.findElement(By.name("OrganizationName")).isDisplayed()) {
				driver.findElement(By.name("OrganizationName")).sendKeys("يرجى الانتظار بينما نتحقق من حسابك");
				Thread.sleep(10000);
//				driver.findElement(By.xpath("//span[@title='Saudi Arabia']")).click();
//				Thread.sleep(5000);
//
//				driver.findElement(By.xpath("(//input[@type='search'])[2]")).sendKeys("Samoa");
//				Thread.sleep(5000);
//				driver.findElement(By.xpath("(//span[text()='Samoa'])[1]")).click();
//				Thread.sleep(5000);
				driver.findElement(By.xpath("//button[@type='submit']")).click();
				Thread.sleep(15000);
				}
			}	catch(Exception e) {}


	}
	@Test
	public void T06_RegInputField () throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='LegalRegistrationNameEn']")).sendKeys("Hello Hash");
		Thread.sleep(5000);
		int number = ThreadLocalRandom.current().nextInt(10000, 100000);
		String Vat ="31234"+number+"12343";
		driver.findElement(By.name("VatRegistrationNumber")).sendKeys(Vat);
		Thread.sleep(5000);
		driver.findElement(By.xpath(" (//input[@type='search'])[2]")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("(//input[@type='search'])[2]")).sendKeys("Commercial Registration Number");

		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@type='search'])[2]")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.name("CompanyRegistrationNumber")).sendKeys("1234567890");
		Thread.sleep(5000);
		driver.findElement(By.name("PhoneNumber")).sendKeys("3478982660");
		Thread.sleep(5000);
		driver.findElement(By.name("Email")).sendKeys("m164test.hash@yopmail.com");
		Thread.sleep(1000);
		driver.findElement(By.name("Address.BuildingNumber")).sendKeys("1212");
		Thread.sleep(1000);
		driver.findElement(By.name("Address.AdditionalNumber")).sendKeys("9999");
		Thread.sleep(1000);
		driver.findElement(By.name("Address.Street")).sendKeys("بينما");
		Thread.sleep(1000);
		driver.findElement(By.name("Address.StreetEn")).sendKeys("english st");
		Thread.sleep(1000);	    
		driver.findElement(By.name("Address.AdditionalStreet")).sendKeys("بينما");
		Thread.sleep(1000);
		driver.findElement(By.name("Address.AdditionalStreetEn")).sendKeys("English st additional");
		Thread.sleep(1000);
		driver.findElement(By.name("Address.City")).sendKeys("بينما");
		Thread.sleep(1000);
		driver.findElement(By.name("Address.CityEn")).sendKeys("English city");
		Thread.sleep(1000);
		driver.findElement(By.name("Address.District")).sendKeys("بينما");
		Thread.sleep(1000);
		driver.findElement(By.name("Address.DistrictEn")).sendKeys("English Dristcit");
		Thread.sleep(1000);
		driver.findElement(By.name("Address.ProvinceOrState")).sendKeys("بينما");
		Thread.sleep(1000);
		driver.findElement(By.name("Address.ProvinceOrStateEn")).sendKeys("English State");
		Thread.sleep(1000);
		driver.findElement(By.name("Address.PostalCode")).sendKeys("11234");
		Thread.sleep(1000);
		driver.findElement(By.name("Address.CountryCode")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("(//input[@type='search'])[3]")).sendKeys("Samoa");
		Thread.sleep(5000);
		//driver.findElement(By.xpath("(//input[@type='search'])[3]")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("(//span[text()='Samoa'])[1]")).click();
		Thread.sleep(10000);
	
		driver.findElement(By.name("Contact.FirstName")).sendKeys("جون");
		Thread.sleep(1000);
		driver.findElement(By.name("Contact.LastName")).sendKeys("سميث");
		Thread.sleep(1000);
		driver.findElement(By.name("Contact.MiddleName")).sendKeys("ويليام");
		Thread.sleep(1000);
		driver.findElement(By.name("Contact.JobTitle")).sendKeys("جونويليامويليام");
		Thread.sleep(1000);
		driver.findElement(By.name("Fax")).sendKeys("966123456789");
		Thread.sleep(1000);
		driver.findElement(By.name("Contact.FirstNameEn")).sendKeys("Jhon");
		Thread.sleep(1000);
		driver.findElement(By.name("Contact.LastNameEn")).sendKeys("Smith");
		Thread.sleep(1000);
		driver.findElement(By.name("Contact.MiddleNameEn")).sendKeys("William");
		Thread.sleep(1000);
		driver.findElement(By.name("Contact.JobTitleEn")).sendKeys("Manager");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[text()='Continue'])[1]")).click();
		Thread.sleep(10000);

	}
}
