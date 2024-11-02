package com.qa.testscripts;

import java.io.IOException;
import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.pages.ZomatoPages;
import com.qa.utility.ExcelUtility;

public class TC_ZomatoSearch_001 extends TestBaseZomato {
	
	@Test
	public void searchItem() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ABHAY KRISHNA\\OneDrive\\Desktop\\chrome driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
	
		driver.get("https://www.zomato.com/");
		ZomatoPages Zomato = new ZomatoPages(driver);
		Zomato.getsearchTxtField().sendKeys("Chicken Biryani");
		Zomato.getmagnifireBtn().click();
		
		
	Boolean contains = driver.getTitle().contains("Chicken Biryani");
	if(contains) {
		System.out.println("The title contains the search term");
		
	}
	else
	{
		System.out.println("The title does not contains the search term");	
	}
	List<WebElement> getallItems = zomatoZO.getfoodlist();
	System.out.println("Total no. of items loaded are : "+ getallItems.size());
	
	for(WebElement item : getallItems) {
		System.out.println(item.getText());
	}
	
}
}






