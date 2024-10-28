package org.phone;

import java.io.IOException;
import java.util.List;

import org.checkerframework.checker.index.qual.SubstringIndexFor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample extends BaseClass {
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
		WebElement select = findLocatorByXpath("//h5[text()='Select Hotel']");
		String txt = select.getText();
		System.out.println(txt);
		WebElement scrollhotel = findLocatorByXpath("//h5[text()='Citrine Studio']");
		scroll(scrollhotel);
		WebElement hote1 = findLocatorByXpath("//h5[text()='Citrine Studio']");
		String text1 = hote1.getText();
		System.out.println(text1);
		WebElement list = findLocatorById("hotellist");
		List<WebElement> elements = driver.findElements(By.tagName("h5"));
		for (WebElement web : elements) {
			String txt1 = web.getText();
			System.out.println(txt1);

		}
		List<WebElement> elements2 = driver.findElements(By.tagName("strong"));
		for (WebElement web2 : elements2) {
			String txt2 = web2.getText();
			System.out.println(txt2);

		}
		List<WebElement> ele3 = driver.findElements(By.xpath("//a[text()='Continue']"));
		WebElement con = ele3.get(2);
		elementClick(con);
		clickAlert();
		WebElement photel = findLocatorByXpath("//h2[text()='Book Hotel - Citrine Suite']");
		String text11 = photel.getText();
		System.out.println(text11);
		WebElement sc = findLocatorById("step1");
		scroll(sc);
		Thread.sleep(3000);
		WebElement my = findLocatorById("own");
		elementClick(my);
		WebElement selsal = findLocatorById("user_title");
		selectOptionByText(selsal, getCellData("omr", 0, 12));
		WebElement fn = findLocatorById("first_name");
		elementSendKeys(fn, getCellData("omr", 0, 13));
		WebElement ln = findLocatorById("last_name");
		elementSendKeys(ln, getCellData("omr", 0, 14));
		WebElement mobile = findLocatorById("user_phone");
		elementSendKeys(mobile, getCellData("omr", 0, 15));
		WebElement email = findLocatorById("user_email");
		elementSendKeys(email, getCellData("omr", 0, 16));
		WebElement gst = findLocatorById("gst");
		elementClick(gst);
		WebElement regnum = findLocatorById("gst_registration");
		elementSendKeys(regnum, getCellData("omr", 0, 17));
		WebElement comp = findLocatorById("company_name");
		elementSendKeys(comp, getCellData("omr", 0, 18));
		WebElement address = findLocatorById("company_address");
		elementSendKeys(address, getCellData("omr", 0, 19));
		WebElement next = findLocatorByXpath("(//button[text()='Next'])[1]");
		elementClick(next);
		WebElement hFloor = findLocatorById("high");
		elementClick(hFloor);
		WebElement other = findLocatorById("other_request");
		elementSendKeys(other, getCellData("omr", 0, 20));
		WebElement next2 = findLocatorById("step2next");
		elementClick(next2);
		WebElement pay = findLocatorByXpath("//h5[text()='Credit/Debit/ATM Card']");
		elementClick(pay);
		WebElement ptype = findLocatorById("payment_type");
		selectOptionByText(ptype, getCellData("omr", 0, 21));
		WebElement cardtype = findLocatorById("card_type");
		selectOptionByText(cardtype, getCellData("omr", 0, 22));
		WebElement cardnum = findLocatorById("card_no");
		elementSendKeys(cardnum, getCellData("omr", 0, 23));
		WebElement cardname = findLocatorById("card_name");
		elementSendKeys(cardname, getCellData("omr", 0, 24));
		WebElement month = findLocatorById("card_month");
		selectOptionByText(month, getCellData("omr", 0, 25));
		WebElement year = findLocatorById("card_year");
 		selectOptionByText(year, getCellData("omr", 0, 26));
		WebElement cvv = findLocatorById("cvv");
		elementSendKeys(cvv, getCellData("omr", 0, 27));
		WebElement sub = findLocatorById("submitBtn");
		elementClick(sub);
		WebElement orderno = findLocatorByXpath("//h2[@name='booking-code']//strong");
		String text12 = orderno.getText();
		System.out.println(text12);
		
		String s5 = text12.substring(1, 11);
		System.out.println(s5);
		createCellAndSetCellData("omr", 3, 2, s5);
	   WebElement confirm = findLocatorByXpath("//h2[text()=' Booking is Confirmed ']");
	   String txt2 = confirm.getText();
		//String s="#KTYKK72165, Booking is Confirmed";
    	String confir=txt2.substring(12,32);
		System.out.println(confir);
		WebElement hnamet = findLocatorByXpath("//p[text()='Hotel ']");
		String text14 = hnamet.getText();
		System.out.println(text14);
		WebElement book = findLocatorByXpath("//button[text()='My Booking']");
		elementClick(book);
		WebElement orSearch = findLocatorByName("search");
		insertEnter(orSearch, getCellData("omr", 3, 2));
		WebElement edit = findLocatorByXpath("//button[text()='Edit']");
		elementClick(edit);

         Thread.sleep(3000);
		WebElement modChin = findLocatorByName("check_in");
		elementClick(modChin);
		WebElement modate = findLocatorByXpath("//a[text()='16']");
		elementClick(modate);
		WebElement confirm1 = findLocatorByXpath("//button[text()='Confirm']");
		elementClick(confirm1);
		WebElement orderId2 = findLocatorByXpath("//span[text()='#XSJUE00805']");
		String text15 = orderId2.getText();
		System.out.println(text15);
		WebElement honame = findLocatorByXpath("//h5[text()='Citrine Deluxe']");
		String text16 = honame.getText();
		System.out.println(text16);
		WebElement hopri = findLocatorByXpath("//strong[text()='Rs 6,608']");
		String text17 = hopri.getText();
		System.out.println(text17);
		WebElement update = findLocatorByClassName("alertMsg");
		String text18 = update.getText();
		System.out.println(text18);
		WebElement mybook = findLocatorByXpath("//a[text()='My Bookings']");
		String text19 = mybook.getText();
		System.out.println(text19);
		WebElement cancel = findLocatorByXpath("//a[text()='Cancel']");
		elementClick(cancel);
		clickAlert();
		WebElement orSearch1 = findLocatorByName("search");
		insertEnter(orSearch1, getCellData("omr", 3, 2));
		WebElement orderId3 = findLocatorByXpath("//span[text()='#XSJUE00805']");
		String text20 = orderId3.getText();
		System.out.println(text20);
		WebElement honame1 = findLocatorByXpath("//h5[text()='Citrine Deluxe']");
		String text21 = honame1.getText();
		System.out.println(text21);
		WebElement hopri1 = findLocatorByXpath("//strong[text()='Rs 6,608']");
		visbilityOfElement(hopri1);
		String text22 = hopri1.getText();
		System.out.println(text22);
		WebElement element = findLocatorByXpath("//li[text()='Your booking cancelled successfully']");
		String text23 = element.getText();
		System.out.println(text23);

	}

}
