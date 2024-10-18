package com.SeleniumWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Generic.Utility;

public class DynamicLoadingWaitScenarioUsingWebDriverWait {
  @Test
  public void testWait()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
	  
	 By startBtn=By.xpath("//button[text()='Start']");
	 
	 By textEle=By.xpath("(//h4)[2]");
	 
	 
	 driver.findElement(startBtn).click();
	 
//	 String text=driver.findElement(textEle).getText();
//	 System.out.println(text);
	 
	 String text=Utility.waitForElementVisibility(driver,textEle).getText();
	 
	 System.out.println(text);
  }
}
