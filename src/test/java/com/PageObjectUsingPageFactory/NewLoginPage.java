package com.PageObjectUsingPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewLoginPage
{

	private WebDriver driver;
	
	//constructor
	public NewLoginPage(WebDriver driver)//base class
	{
		this.driver=driver;
		//initialize element
		PageFactory.initElements(driver,this);
	}
	
	//locator
	@FindBy(name="username")
	WebElement usern;
	
	@FindBy(name="password")
	WebElement pass;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginbtn;
	
	//action
	public String getAppUrl()
	{
		return driver.getCurrentUrl();
	}
	
	
	public String getAppgTitle()
	{
		return driver.getTitle();
	}
	
	public void doLogin(String un,String psw)
	{
		usern.sendKeys(un);
		pass.sendKeys(psw);
		loginbtn.click();
	}
}
