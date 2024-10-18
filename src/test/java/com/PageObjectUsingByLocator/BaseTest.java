package com.PageObjectUsingByLocator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class BaseTest
{
	
	
	public WebDriver driver;
	public LoginPage lp;
	
	@BeforeClass
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://automationplayground.com/crm/login.html");
		lp=new LoginPage(driver);
		
	}

}
