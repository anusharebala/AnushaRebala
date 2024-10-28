package org.phone;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Hdfc extends BaseClass {

	@BeforeClass
	private void beforeClass() {
		browserLaunch();
		enterApplnUrl("https://netbanking.hdfcbank.com/netbanking/");
		maximizeWindow();
		implicitWait();

	}

	@AfterClass
	private void afterClass() {
		// closeApplnWindow();

	}

	@BeforeMethod
	private void beforeMethod() {
		System.out.println("start time :");

	}

	@AfterMethod
	private void afterMethod() {
		System.out.println("end time :");

	}
	@Test
	private void tc1() {
		driver.switchTo().frame("login_page");
		findLocatorByXpath("//input[@type='text']").sendKeys("anuhkihk");
		findLocatorByXpath("//a[text()='CONTINUE']").click();
		driver.switchTo().defaultContent();
		findLocatorById("keyboard").sendKeys("anu");
		findLocatorById("loginBtn").click();

	}

}
