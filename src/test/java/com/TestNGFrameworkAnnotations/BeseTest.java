package com.TestNGFrameworkAnnotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BeseTest 
{ 
	public WebDriver driver;

	@BeforeClass
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://automationplayground.com/crm/");
		
		
	}
	
	@AfterClass
	  public void tearDown()
	  {
		  driver.quit();
	  }
	  
	  @BeforeMethod
	  public void getAppUrl()
	  {
		  System.out.println("Current url "+driver.getCurrentUrl());
	  }
	  
	  @AfterMethod
	  public void getAppTitle()
	  {
		  System.out.println("Title is: "+driver.getTitle());
	  }
	
	
}
