package com.WebElementScenariosUsingTestNG;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class MultipleWindowHandling {
  @Test
  public void testMultipleWindows() 
  {
	  
	  WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	//home page
	String parentId=driver.getWindowHandle();
	System.out.println(parentId);
	
	driver.findElement(By.linkText("OrangeHRM, Inc")).click();
	
	//child new page
	Set<String> allWindows=driver.getWindowHandles();
	System.out.println(allWindows);
	
	//if ids are different means we have different window
	for(String childId:allWindows)
	{
		//switch to child window
		if(!parentId.equals(childId))//parentid is not equals with child id
		{
		
			driver.switchTo().window(childId);
			//to get current window handle
			System.out.println(driver.getWindowHandle());
			driver.findElement(By.name("EmailHomePage")).sendKeys("test@gmail.com");
			//driver.close();//close child window
			//driver.quit();//all windows
			
		}
		
	}
	
	//parent
	driver.switchTo().window(parentId);
	driver.findElement(By.name("username")).sendKeys("Admin");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
  }
  
}
