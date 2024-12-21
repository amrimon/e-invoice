package com.Hash.e_invoice;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class TC6_Customer extends CommonTest{
	@Test
	public void T01_NavigateToURL() throws InterruptedException {
		driver.get("https://dev-ksa.einvoicesolutions.com/login");
		Thread.sleep(10000);

	}
	@Test
	public void T02_EnterEmail() throws InterruptedException {
		driver.findElement(By.name("email")).sendKeys("m300test.hash@yopmail.com");
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
	public void T05_ClickOnCustomerTab() throws InterruptedException {
		driver.findElement(By.xpath("//a[@href='/customers']")).click();
		Thread.sleep(2000);
		
	}
	@Test
	public void T06_ClickOnCreateNew() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='Create New']")).click();
		Thread.sleep(2000);
	}
	@Test
	public void T07_InputRegNmAr() throws InterruptedException {
		driver.findElement(By.name("LegalRegistrationName")).sendKeys(" صندوق النقد الدول");
		Thread.sleep(2000);
	}
	@Test
	public void T08_InputRegNmEn() throws InterruptedException {
		driver.findElement(By.name("LegalRegistrationNameEn")).sendKeys(" Damac Financial Group");
		Thread.sleep(2000);
}
	@Test
	public void T09_InputVatNumber() throws InterruptedException {
		driver.findElement(By.name("VatRegistrationNumber")).sendKeys("300001111111113");
		Thread.sleep(2000);
	}
	@Test
	public void T10_InputCRN() throws InterruptedException {
		driver.findElement(By.xpath("(//input[@type='search'])[2]")).sendKeys("Commercial Registration Number");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='search'])[2]")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.name("CompanyRegistrationNumber")).sendKeys("1234567890");
		Thread.sleep(2000);
	}
		@Test
		public void T11_InputEmail() throws InterruptedException {
		driver.findElement(By.name("Email")).sendKeys("amrimon@yopmail.com");
		Thread.sleep(2000);
		}
		@Test
		public void T12_InputPhoneNumber() throws InterruptedException {
		driver.findElement(By.name("PhoneNumber")).sendKeys("9661234567890");
		Thread.sleep(2000);
		}
		@Test
		public void T13_InputBuildingNumber() throws InterruptedException {
		driver.findElement(By.name("Address.BuildingNumber")).sendKeys("8000");
		Thread.sleep(2000);
		}
		@Test
		public void T14_InputAdditionalBuildingNumber() throws InterruptedException {
		driver.findElement(By.name("Address.AdditionalNumber")).sendKeys("1234");
		Thread.sleep(2000);
		}
		@Test
		public void T15_InputStreetAddress() throws InterruptedException {
		driver.findElement(By.name("Address.Street")).sendKeys("طريق الشهداء");
		Thread.sleep(2000);
		}
		@Test
		public void T16_InputStreetAddressEn() throws InterruptedException {
		driver.findElement(By.name("Address.StreetEn")).sendKeys("Huttayn Dist");
		Thread.sleep(2000);
		}
		@Test
		public void T17_InputAdditionalStreetAr() throws InterruptedException {
		driver.findElement(By.name("Address.AdditionalStreet")).sendKeys("طريق");
		Thread.sleep(2000);
		}
		@Test
		public void T18_InputAdditionalStreetAr() throws InterruptedException {
		driver.findElement(By.name("Address.AdditionalStreetEn")).sendKeys("king Fahad rd");
		Thread.sleep(2000);
		}
		@Test
		public void T19_InputCityAr() throws InterruptedException {
		driver.findElement(By.name("Address.City")).sendKeys(" الشهداء");
		Thread.sleep(2000);
		}
		@Test
		public void T20_InputCityEn() throws InterruptedException {
		driver.findElement(By.name("Address.CityEn")).sendKeys("Jedda");
		Thread.sleep(2000);
		}
		@Test
		public void T21_inputDistrictAr() throws InterruptedException {
		driver.findElement(By.name("Address.District")).sendKeys("الشهداء");
		Thread.sleep(2000);
		}
		@Test
		public void T22_InputDristicEn() throws InterruptedException {
		driver.findElement(By.name("Address.DistrictEn")).sendKeys("Jedda");
		Thread.sleep(2000);
		}
		@Test
		public void T23_InputProvinceOrStateAr() throws InterruptedException {
		driver.findElement(By.name("Address.ProvinceOrState")).sendKeys("الشهداء");
		Thread.sleep(2000);
		}
		@Test
		public void T24_InputProvinceOrStateEn() throws InterruptedException {
		driver.findElement(By.name("Address.ProvinceOrStateEn")).sendKeys("Jedda");
		Thread.sleep(2000);
        }
		@Test
		public void T25_InputPostalCode() throws InterruptedException {
		driver.findElement(By.name("Address.PostalCode")).sendKeys("12345");
		Thread.sleep(2000);
		}
		@Test
		public void T26_ClicOnContactInformation() throws InterruptedException {
		driver.findElement(By.xpath("//div[text()='Contact Information']")).click();
		Thread.sleep(2000);
		}
		@Test
		public void T27_InputFirstNameAr() throws InterruptedException {
		driver.findElement(By.name("Person.FirstName")).sendKeys("محمد");
		Thread.sleep(2000);
		}
		@Test
		public void T28_InputFirstNameEn() throws InterruptedException {
		driver.findElement(By.name("Person.FirstNameEn")).sendKeys("Abdul");
		Thread.sleep(2000);
		}
		@Test
		public void T29_InputLastNameAr() throws InterruptedException {
		driver.findElement(By.name("Person.LastName")).sendKeys("خالد");
		Thread.sleep(2000);
		}
		@Test
		public void T30_InputLastNameEn() throws InterruptedException {
		driver.findElement(By.name("Person.LastNameEn")).sendKeys("Mukith");
		Thread.sleep(2000);
		}
		@Test
		public void T31_InputMiddleNameAr() throws InterruptedException {
		driver.findElement(By.name("Person.MiddleName")).sendKeys("علي");
		Thread.sleep(2000);
		}
		@Test
		public void T32_InputMiddleNameEn() throws InterruptedException {
		driver.findElement(By.name("Person.MiddleNameEn")).sendKeys("Walid");
		Thread.sleep(2000);
		}
		@Test
		public void T33_InputJobTitleAr() throws InterruptedException {
		driver.findElement(By.name("Person.JobTitle")).sendKeys("سكرتير");
		Thread.sleep(2000);
		}
		@Test
		public void T34_InputJobTitleEn() throws InterruptedException {
		driver.findElement(By.name("Person.JobTitleEn")).sendKeys("Manager");
		Thread.sleep(2000);
		}
		@Test
		public void T35_ClickOnSave() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='Save']")).click();
		Thread.sleep(10000);
		

		
	}
	
}
