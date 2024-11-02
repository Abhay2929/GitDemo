package com.qa.testscripts;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.qa.pages.ZomatoPages;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_ZomatoSearch {
	public static void main(String[] args) {
		WebDriver driver = null;
		String Browser = "Chrome";
		if(Browser.equalsIgnoreCase("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if (Browser.equalsIgnoreCase("Edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}else if(Browser.equalsIgnoreCase("ie"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new InternetExplorerDriver();
		}
		
		driver.get("https://Zomato.in/");
		ZomatoPages Zomato = new ZomatoPages(driver);
		Zomato.getsearchbar().sendKeys("Chicken Biryani");
		Zomato.getsearchbar().sendKeys(Keys.DOWN);
		
		
		Boolean contains = driver.getTitle().contains("Chicken Biryani");
		if(contains) {
			System.out.println("The title contains the search term");
			
		}
		else
		{
			System.out.println("The title does not contains the search term");	
		}
		List<WebElement> getallItems = Zomato.getfoodlist();
		System.out.println("Total no. of items loaded are : "+ getallItems.size());
		for(WebElement item : getallItems) {
			System.out.println(item.getText());
		}
		
	}

}






