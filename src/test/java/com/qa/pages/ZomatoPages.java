package com.qa.pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZomatoPages{

	WebDriver driver;
	
	
	
	//---------------
	
	@FindBy(xpath="/html/body/div[1]/div/div[3]/div[2]/div[2]/div/div[3]/input")
	WebElement searchbar;
	public WebElement getsearchbar(){
		return  searchbar;
	}

	@FindBy(xpath="/html/body/div[1]/div/div[3]/div[2]/div[2]/div/div[3]/div[2]/div[1]")
	List<WebElement> listvaluesforrest;
	public List<WebElement> getlistvaluesforres(){
		return  listvaluesforrest;
	} 

	@FindBy(name="sc-cpHetk FCPjb")
	List<WebElement> foodlist;
	public List<WebElement> getfoodlist(){
		return  foodlist;
	}


	@FindBy(linkText="Sign up")
	WebElement Signup;
	public WebElement getclickSignup()
	{
		return Signup;
	}

	//-----

	@FindBy(xpath="/html/body/div[6]/div/div[2]/section[2]/section/div[1]/section/section/input")
	WebElement fullname;
	public WebElement getfullname()
	{
		return fullname;
	}

	@FindBy(xpath="/html/body/div[6]/div/div[2]/section[2]/section/section/section/input")
	WebElement email;
	public WebElement getemail()
	{
		return email;
	}

	@FindBy(xpath="/html/body/div[6]/div/div[2]/section[2]/section/div[2]/label/input")
	WebElement checkbox;
	public WebElement getclickcheckbox()
	{
		return checkbox;
	}

	@FindBy(xpath="/html/body/div[6]/div/div[2]/section[2]/section/button/span")
	WebElement createaccount;
	public WebElement getclickcreateaccount()
	{
		return createaccount;
	}

	@FindBy(xpath="/html/body/div[6]/div/div[2]/section[2]/section/button/span")
	WebElement submitbutton;
	public WebElement getcilcksubmitbutton()
	{
		return submitbutton;
	}

	@FindBy(linkText="Log in")
	WebElement loginbutton;
	public WebElement getcilckloginbutton()
	{
		return loginbutton;
	}

	@FindBy(xpath="/html/body/div[6]/div/div[2]/section[2]/section/div[1]/div/input")
	WebElement mobilenum;
	public WebElement getmobilenum()
	{
		return mobilenum;
	}

	@FindBy(xpath="/html/body/div[6]/div/div[2]/section[2]/section/button/span")
	WebElement otpbutton;
	public WebElement getclickotpbutton()
	{
		return otpbutton;
	}

	@FindBy(xpath="/html/body/div[1]/div/div[2]/header/nav/ul[2]/li[3]/div/div/div[1]/div")
	WebElement holdername;
	public WebElement getclickholdername()
	{
		return holdername;
	}

	@FindBy(xpath="/html/body/div[1]/div/div[2]/header/nav/ul[2]/li[3]/div/div/div[2]/div[8]")
	WebElement logoutbutton;
	public WebElement getclicklogoutbutton()
	{
		return logoutbutton;
	}
	
	@FindBy(xpath="/html/body/div[1]/div/div[3]/div[2]/div[2]/div/div[3]/div[2]/div[1]")
	WebElement searchbtn;
	public WebElement getsearchbtn()
	{
		return searchbtn;
	}
	
	@FindBy(xpath="/html/body/div[1]/div/div[8]/div/div[2]/div/div/a[1]/div[2]/img")
	WebElement dineoutbtn;
	public WebElement getdineoutbtn()
	{
		return dineoutbtn;
	}
	
/*	@FindBy(tagName="Order Online")
	WebElement orderonlinebtn;
	public WebElement getorderonlinebtn()
	{
		return orderonlinebtn;
	}
	*/
	
	@FindBy(xpath="/html/body/div[1]/div/main/div/article/div/section/section/div[2]/h2/a")
	WebElement orderonlinebtn;
	public WebElement getorderonlinebtn()
	{
		return orderonlinebtn;
	}
	
	@FindBy(xpath="/html/body/div[1]/div/main/div/section[4]/section/section[2]/section[2]/div[2]/div[1]/div/div/div[2]/div/div[2]/div/div")
	WebElement Addbtn1;
	public WebElement getAddbtn1()
	{
		return Addbtn1;
	}
	
	@FindBy(xpath="/html/body/div[1]/div/main/div/section[4]/section/section[2]/section[2]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div")
	WebElement Addbtn2;
	public WebElement getAddbtn2()
	{
		return Addbtn2;
	}
	
	@FindBy(xpath="/html/body/div[9]/section/div[2]/div/div[2]/button")
	WebElement contibtn;
	public WebElement getcontibtn()
	{
		return contibtn;
	}
	
	//---

	public ZomatoPages(WebDriver driver)       //constructor
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);	
	}

	public Object getCategory() {
		// TODO Auto-generated method stub
		return null;
	}

	public WebElement getsearchTxtField() {
		// TODO Auto-generated method stub
		return null;
	}

	public WebElement getmagnifireBtn() {
		// TODO Auto-generated method stub
		return null;
	}

	public WebElement getclickloginbutton() {
		// TODO Auto-generated method stub
		return null;
	}


}