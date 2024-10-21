package com.SwagLabs.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SwagLabs.Utility.Utility;

public class LoginPage 
{
	private WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;//driver initialization
		PageFactory.initElements(driver,this);
	
	}
	
	//Locator
	@FindBy(id="user-name")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="login-button")
	WebElement loginBtn;
	
	//Actions
	public String getAppUrl()
	{
		return driver.getCurrentUrl();
	}
	
	
	
	public String getAppTitle()
	{
		return driver.getTitle();
	}

	
	public InventoryPage doLogin(String un,String psw)
	{
		username.sendKeys(un);
		password.sendKeys(psw);
		Utility.getScreenshot(driver,"LoginData");
		loginBtn.click();
		Utility.getScreenshot(driver,"Login");

		//we are navigating to inventory page
		return new InventoryPage(driver);
	}
}
