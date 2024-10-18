package com.DataDrivenTest;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class TakeScreenshotTest {
  @Test
  public void testScreenshot() throws IOException
  {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.google.com");
	  
	  TakesScreenshot ts=(TakesScreenshot) driver;
	 File temp= ts.getScreenshotAs(OutputType.FILE);
	 File dest=new File(System.getProperty("user.dir")+"//Screenshots//Google"+System.currentTimeMillis()+".png");
	 FileHandler.copy(temp,dest);
			 
			 
			 
			 
			 
			 
	  
	  
  }
}
