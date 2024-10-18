package com.SeleniumWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.Generic.Utility;

public class ExplicitwaitUsingWebDriverWait 
{
	
	
	
	
	
  @Test
  public void testWait()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	  
	  //By locator
	  By email=By.name("email");
	  By password=By.id("input-password");
	  By btn=By.xpath("//input[@value='Login']");
	  
	  
	  Utility.waitForElementPrecence(driver,email).sendKeys("test@gmail.com");
	  
	  Utility.waitForElementVisibility(driver,password).sendKeys("test123");
	  
	  Utility.waitForElementClickable(driver,btn).click();
	  
	  
	  /*
	   * TimeoutException: Expected condition failed:
	   *  waiting for presence of element located by: 
	   * By.name: email### (tried for 5 second(s) with 500 milliseconds interval)
	   * default time for selenium server is 0.5sec =500ms
	   * interval time=polling time
	   
	  
	  WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(5));
	  WebElement emailEle=wait1.until(ExpectedConditions.presenceOfElementLocated(email));
	  emailEle.sendKeys("test@gmail.com");
	  
	  //password
	  WebDriverWait wait2=new WebDriverWait(driver,Duration.ofSeconds(5));
	  WebElement passEle=wait2.until(ExpectedConditions.visibilityOfElementLocated(password));
	  passEle.sendKeys("test123");
	  
	  
	  //button
	  WebDriverWait wait3=new WebDriverWait(driver,Duration.ofSeconds(5));
	  WebElement btnEle=wait3.until(ExpectedConditions.elementToBeClickable(btn));
	  
	  btnEle.click();
	  
	  */
	  
	  
	  
	  
	  
	  
  }
}
