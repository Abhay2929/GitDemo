package com.qa.testscripts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import com.qa.pages.ZomatoPages;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBaseZomato {
	WebDriver driver=null;
	ZomatoPages zomatoZO;

	@Parameters({"Browser","Url"})
	@BeforeClass
	public void setup(@Optional("Abc")String Browser,String Url) {
		if(Browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();	
		}
		else if(Browser.equalsIgnoreCase("Edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new ChromeDriver();
		}
		else if(Browser.equalsIgnoreCase("ie"))
		{
			WebDriverManager.iedriver().setup();
			driver=new InternetExplorerDriver();

		}
		zomatoZO=new ZomatoPages(driver);
		driver.get(Url);
	}

	@AfterClass
	public void close()
	{
		driver.close();
	}


	//To add SS in extent report
	public void captureScreenshot(WebDriver driver, String tname) throws IOException {

		TakesScreenshot screenShot = (TakesScreenshot) driver;
		File Source = screenShot.getScreenshotAs(OutputType.FILE);
		String Dest = System.getProperty("user.dir") + "/Screenshots/" + tname + ".png";
		FileUtils.copyFile(Source, new File(Dest));	

	}
}