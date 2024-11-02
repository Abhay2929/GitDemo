package com.qa.testscripts;

	import java.awt.AWTException;

	import java.awt.Robot;
	import java.awt.event.KeyEvent;
	import java.io.IOException;

	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebElement;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;

	import com.qa.pages.ZomatoPages;
	import com.qa.utility.ExcelUtility;


	public class TC_zomato_addtocart extends TestBaseZomato
	{

		
		@Test
		
		public  void zomatologin() throws InterruptedException {

			ZomatoPages zomatoZO=new ZomatoPages(driver);

			zomatoZO.getclickloginbutton().click();
			Thread.sleep(800);
			
			WebElement phonenumber=zomatoZO.getmobilenum();
			phonenumber.sendKeys("8073584171");
			
			zomatoZO.getclickotpbutton().click();
			Thread.sleep(50000);
			
			Thread.sleep(10000);                //click on dineout option
			zomatoZO.getdineoutbtn().click();
			Thread.sleep(10000);

			JavascriptExecutor js = (JavascriptExecutor) driver;  //scroll down
			js.executeScript("window.scrollBy(0,350)", "");
			Thread.sleep(10000);

			zomatoZO.getorderonlinebtn().click();     //click on order online option
			Thread.sleep(8000);

			js.executeScript("window.scrollBy(0,350)", "");  //scroll down
			Thread.sleep(2000);

			zomatoZO.getAddbtn1().click();  //click on add button for 1 dish to add to Cart
			Thread.sleep(2000);

			zomatoZO.getAddbtn2().click();  //click on add button for 2 dish to add to cart
			Thread.sleep(2000);

			zomatoZO.getcontibtn().click();  //click on continue button to view ORDERS and total money
			Thread.sleep(20000);

		}
		
		
	    }


