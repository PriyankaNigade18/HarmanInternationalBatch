package com.WebElementScenariosUsingTestNG;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.Generic.Utility;

public class FacebookDropdown
{
//	public static void selectBasedDropdown(WebElement ele,String value)
//	{
//		Select dd=new Select(ele);
//		  System.out.println("Is dropdown supported multiple selection: "+dd.isMultiple());
//		  
//		  List<WebElement> allOptions=dd.getOptions();
//		  System.out.println("Total options are: "+allOptions.size());
//		  
//		  for(WebElement i:allOptions)
//		  {
//			  System.out.println(i.getText());
//			  if(i.getText().contains(value))
//			  {
//				  i.click();
//				  
//				  break;
//				  
//			 }
//		  }
//	}
	
	
	
  @Test
  public void testDropdown() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.facebook.com");
	  
	  
	  //create an account
	  driver.findElement(By.linkText("Create new account")).click();
	  
	  
	  //day
	  WebElement daydd=driver.findElement(By.id("day"));
	 Utility.selectBasedDropdown(daydd,"28");
	  
	  
	  //month
	  WebElement monthdd=driver.findElement(By.id("month"));
	  Utility.selectBasedDropdown(monthdd,"Dec");
	  
	  //year
	  WebElement yeardd=driver.findElement(By.id("year"));
	  Utility.selectBasedDropdown(yeardd,"2010");
	  
	  
	  
//	  Select dd=new Select(daydd);
//	  System.out.println("Is dropdown supported multiple selection: "+dd.isMultiple());
//	  
//	  List<WebElement> allOptions=dd.getOptions();
//	  System.out.println("Total options are: "+allOptions.size());
//	  
//	  for(WebElement i:allOptions)
//	  {
//		  System.out.println(i.getText());
//		  if(i.getText().contains("27"))
//		  {
//			  i.click();
//			  
//			  break;
//			  
//		 }
//	  }
	  
	  
	  
	  
	  
	
	  
	  
	  
  }
}
