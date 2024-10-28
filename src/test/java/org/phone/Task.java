package org.phone;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.checkerframework.checker.index.qual.SubstringIndexFor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Task extends BaseClass {


	@BeforeClass
	private void beforeClass() {
		browserLaunch();
		enterApplnUrl("https://www.omrbranch.com/");
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
	public void tc1() throws IOException, InterruptedException {
		WebElement txtEmail = findLocatorById("email");
		elementSendKeys(txtEmail, getCellData("omr", 0, 0));
		WebElement txtPass = findLocatorById("pass");
		elementSendKeys(txtPass, getCellData("omr", 0, 1));
		WebElement btnLogin = findLocatorByXpath("//button[text()='Login']");
		elementClick(btnLogin);
		WebElement wel = findLocatorByXpath("//a[@data-testid='username']");
		String text = wel.getText();
		System.out.println(text);
		WebElement txtState = findLocatorById("state");
		selectOptionByText(txtState, getCellData("omr", 0, 2));
		Thread.sleep(3000);
		WebElement txtCity = findLocatorById("city");
		selectOptionByText(txtCity, getCellData("omr", 0, 3));
		WebElement selRoom = findLocatorByXpath("//textarea[@role='searchbox']");
		elementClick(selRoom);
		insertEnter(selRoom, getCellData("omr", 0, 4));
		insertEnter(selRoom, getCellData("omr", 0, 5));
		insertEnter(selRoom, getCellData("omr", 0, 6));
		insertEnter(selRoom, getCellData("omr", 0, 7));
		insertEnter(selRoom, getCellData("omr", 0, 8));
		WebElement checkIn = findLocatorByName("check_in");
		elementClick(checkIn);
		WebElement dateIn = findLocatorByXpath("//a[text()='10']");
		elementClick(dateIn);
		WebElement checkOut = findLocatorByName("check_out");
		elementClick(checkOut);
		WebElement dateOut = findLocatorByXpath("//a[text()='13']");
		elementClick(dateOut);
		WebElement numRoom = findLocatorById("no_rooms");
		selectOptionByText(numRoom, getCellData("omr", 0, 9));
		WebElement numpers = findLocatorById("no_adults");
		selectOptionByText(numpers, getCellData("omr", 0, 10));
		WebElement numChild = findLocatorById("no_child");
		elementSendKeys(numChild, getCellData("omr", 0, 11));
		switchToFrameByIdOrName("hotelsearch_iframe");
		WebElement search = findLocatorById("searchBtn");
		elementClick(search);
		driver.switchTo().defaultContent();
		WebElement l2h = findLocatorByXpath("//label[@for='value_pltoh']");
		elementClick(l2h);
		WebElement all = findLocatorById("hotellist");
		List<Integer>dev=new ArrayList<>();
		List<Integer>qa=new ArrayList<>();
		Thread.sleep(5000);
		List<WebElement> allp = driver.findElements(By.tagName("strong"));
		for (WebElement d : allp) {
			Thread.sleep(10000);
			String txt1 = d.getText();
			System.out.println(txt1);
		String s1 = txt1.substring(1, 7);
		System.out.println(s1);
		String s3 = s1.trim();
		  String p = s3.replace(",", "");
		System.out.println(p);
		int p1 = Integer.parseInt(p);
		dev.add(p1);
		
		}
		qa.addAll(dev);
		Collections.sort(qa);
		System.out.println(qa);
		
		boolean equals = qa.equals(dev);
		if(equals) {
			System.out.println("asc");
		}
		else {
			System.out.println("no");
		}
		WebElement name = findLocatorByXpath("//label[@for='value_ndesc']");
		elementClick(name);
		List<String>dev1=new ArrayList<>();
		List<String>qa1=new ArrayList<>();
		List<WebElement> elements = driver.findElements(By.tagName("h5"));
		for (WebElement webElement1 : elements) {
			String text2 = webElement1.getText();
			System.out.println(text2);
			dev1.add(text2);
			
		}
		qa1.addAll(dev1);
		Collections.sort(qa1);
		System.out.println(qa1);
		Collections.reverse(qa1);
		System.out.println(qa1);
		boolean equals1 = qa1.equals(dev);
		System.out.println(equals1);
		if(equals1) {
			System.out.println("des");
		}
		else {
			System.out.println("no");
		}
		
		
		
	}

}
