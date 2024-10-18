package com.PageObjectUsingByLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage
{
	
	//Encapsulation=private data+public function
	
	private WebDriver driver;
	
	public LoginPage(WebDriver driver)//initialize driver-local driver comming from base class
	{
		this.driver=driver;
	}
	
	//Locator
	private By email=By.id("email-id");
	private By password=By.id("password");
	private By submit=By.id("submit-id");
	
	
	//Actions
	public void enterEmail(String em)
	{
		driver.findElement(email).sendKeys(em);
		
	}
	
	public void enterPassword(String psw)
	{
		driver.findElement(password).sendKeys(psw);
	}
	
	public void clickOnButton()
	{
		driver.findElement(submit).click();
	}
	
	
	public void doLogin(String em,String psw)
	{
		driver.findElement(email).sendKeys(em);
		driver.findElement(password).sendKeys(psw);
		driver.findElement(submit).click();
	}

	public String getAppUrl()
	{
		return driver.getCurrentUrl();
	}
}
