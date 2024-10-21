package com.TestngFramework.ListenerTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

//@Listeners(com.TestngFramework.ListenerTest.TestListener.class)
public class TestCRMApplication 
{
	WebDriver driver;
	
	
	@BeforeClass
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://automationplayground.com/crm/");
		
		
	}
	
	
  @Test(priority=1)
  public void validateSignInLink()
  {
	 WebElement link=driver.findElement(By.linkText("Sign In"));
	 if(link.isDisplayed() && link.isEnabled())
	 {
		 link.click();
		 
	 }
  }
  
  
  @Test(priority=2)
  public void validateLogin() 
  {
	  driver.findElement(By.name("email-name")).sendKeys("test@gmail.com");
	  driver.findElement(By.id("password##")).sendKeys("test123");
	  driver.findElement(By.id("submit-id")).click();
  }
  
  @Test(priority=3)
  public void validateSignOut()
  {
	  driver.findElement(By.linkText("Sign Out")).click();
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
