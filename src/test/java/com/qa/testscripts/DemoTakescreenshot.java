package com.qa.testscripts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.pages.ZomatoPages;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoTakescreenshot {
	WebDriver driver;
	
	@BeforeClass
public void setup() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ABHAY KRISHNA\\OneDrive\\Desktop\\chrome driver\\chromedriver.exe");			
			driver = new ChromeDriver();
	
		
		 driver.get("https://www.zomato.com/");
		
	}
	@AfterClass
	public void tearDemo() {
		driver.close();
	}
	@Test(priority=1)
	
	public void screenshotofElement() throws IOException {
		File source = driver.findElement(By.className("high-res-image")).getScreenshotAs(OutputType.FILE);
		String Dest = System.getProperty("user.dir")+"/Screenshots/"+"ZomatoLogo.png";
		FileUtils.copyFile(source, new File(Dest));
		
	}
@Test(priority=2)
	
	public void screenshotofDriver() {
		
	}
@Test(priority=3)

public void screenshotofFullpage() {
	
}

}









