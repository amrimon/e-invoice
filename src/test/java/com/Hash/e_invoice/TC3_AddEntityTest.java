package com.Hash.e_invoice;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC3_AddEntityTest extends CommonTest{
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
		driver.findElement(By.xpath("//span[text()='Add Entity']")).click();
		Thread.sleep(5000);
	}
	@Test
	public void T06_ClickCheeckBOX() throws InterruptedException {
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		Thread.sleep(5000);
		}

	@Test
	public void T07_ClickOnSave() throws InterruptedException{
		driver.findElement(By.xpath("//span[text()='Save']")).click();
		Thread.sleep(5000);
	}
	@Test
	public void T08_ClickOnContinue() throws InterruptedException{
		driver.findElement(By.xpath("//span[text()='Continue']")).click();
		Thread.sleep(5000);
	}
}
