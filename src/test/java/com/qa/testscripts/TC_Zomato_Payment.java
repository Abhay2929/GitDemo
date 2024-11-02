package com.qa.testscripts;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.qa.pages.ZomatoPages;

public class TC_Zomato_Payment extends TestBaseZomato{
	@Test()
	public  void zomatologin() throws InterruptedException {
		 
	    WebDriver webDriver=null;
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\ABHAY KRISHNA\\OneDrive\\Desktop\\chrome driver\\chromedriver.exe");
	    webDriver=new ChromeDriver(); 
	    ZomatoPages zomatoZO=new ZomatoPages(driver);
		driver.navigate().to("https://www.zomato.com/patna/biryani-mahal-2-fraser-road-area/order/verify/");


		
    String proceedToPayXpath="/html/body/div[8]/section/div[2]/div/div[2]/button/span/span";
   String addCardXpath="/html/body/div/div/section/div[2]/div/section/h5";
    
    String paymentButtonXpath="//button[@id='make-payment']";
    
    String cardNumberXpath="//*[@id=\"app\"]/div/section/div[2]/section/div/div/div/div[2]/form/div[1]/section/section/input";
    
    String cvvXpath="//*[@id=\"app\"]/div/section/div[2]/section/div/div/div/div[2]/form/div[2]/div[2]/section/section/input";
    
    String expiryDateXpath="//*[@id=\"app\"]/div/section/div[2]/section/div/div/div/div[2]/form/div[2]/div[1]/section/section/input";
    
    String finalPaymentButtonXpath="//button[@id='creditcard-continue']";
    
    String debitCardClick="/html/body/div/div/section/div[2]/section/div/div/div/div[2]/form/section[1]/section/input";
    
   jsClick(webDriver, proceedToPayXpath);
    sleeptime(5);
    
    jsClick(webDriver, paymentButtonXpath);
    sleeptime(5);

    jsClick(webDriver, debitCardClick);
    sleeptime(3);
    jsInput(webDriver, cardNumberXpath, debitCardClick);
    sleeptime(5);
    
    if((boolean) checkElementFound(webDriver, cvvXpath))
        sleeptime(1);
    jsClick(webDriver, finalPaymentButtonXpath);
    String OTP=giveOTP(webDriver);
    submitOTP(OTP);
    sleeptime(10);
    webDriver.quit();
}

private void submitOTP(String oTP) {
		// TODO Auto-generated method stub
		
	}

private String giveOTP(WebDriver webDriver) {
		// TODO Auto-generated method stub
		return null;
	}

private Object checkElementFound(WebDriver webDriver, String cvvXpath) {
		// TODO Auto-generated method stub
		return null;
	}

private static void multipleElementsSelectOne(WebDriver webDriver, String xpath, String value) {
    // TODO Auto-generated method stub
    WebElement webElement= webDriver.findElements(By.xpath(xpath)).get(0);
    webElement.sendKeys(value);
//JavascriptExecutor javaScriptExecutor = (JavascriptExecutor)webDriver;
    //  javaScriptExecutor.executeScript("arguments[0].click()", webElement);       
    
}

public static void clickButton(WebDriver webDriver, String payuURL) {
    // TODO Auto-generated method stub
    webDriver.findElement(By.xpath(payuURL)).click();
}

public static void openpage(WebDriver webDriver, String URL) {
    // TODO Auto-generated method stub
    webDriver.get(URL);
}

public static void giveinput(WebDriver webDriver, String xpath, String value) {
    // TODO Auto-generated method stub
    webDriver.findElement(By.xpath(xpath)).sendKeys(value);
}

public static void sleeptime(int i) {
    // TODO Auto-generated method stub
    try {
        Thread.sleep(i*1000);
    } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
}

public static void sendkeysJS(WebDriver webDriver, WebElement webElement, String value) {
    // TODO Auto-generated method stub
     JavascriptExecutor javaScriptExecutor = (JavascriptExecutor)webDriver;
     javaScriptExecutor.executeScript("arguments[0].value='"+value+"';", webElement);   

    
}

public static void jsInput(WebDriver webDriver, String xpath,String value) {
    // TODO Auto-generated method stub
    System.out.println("inside js for:"+xpath);
    WebElement webElement= webDriver.findElement(By.xpath(xpath));
    sendkeysJS(webDriver,webElement,value);

}

public static void jsClick(WebDriver webDriver, String xpath) {
    // TODO Auto-generated method stub
    WebElement webElement= webDriver.findElement(By.xpath(xpath));
     JavascriptExecutor javaScriptExecutor = (JavascriptExecutor)webDriver;
     javaScriptExecutor.executeScript("arguments[0].click()", webElement);      
}


}