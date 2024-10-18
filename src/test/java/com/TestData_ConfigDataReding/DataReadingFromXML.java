package com.TestData_ConfigDataReding;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataReadingFromXML 
{
	@Parameters({"un","psw"})
	
  @Test
  public void testCase(String un,String psw)
  {
	  System.out.println("User Name is: "+un);
	  System.out.println("Password is: "+psw);
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.findElement(By.name("username")).sendKeys(un);
	  driver.findElement(By.name("password")).sendKeys(psw);
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  
	  Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
	  System.out.println("Login Completed!");
	  
  }
}
