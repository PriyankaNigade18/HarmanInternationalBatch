package com.SeleniumWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScriptExecutorDemo {
  @Test
  public void testJavaScriptFunctions() throws InterruptedException 
  {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.amazon.in");
	  
	  System.out.println("Title: "+driver.getTitle());
	  
	  
	  JavascriptExecutor js=(JavascriptExecutor) driver;
	  
	  //refresh page
	  js.executeScript("history.go(0)");
	  
	  //get the title
	  String title=js.executeScript("return document.title").toString();
	  System.out.println(title);
	  
	  //click on element
	  WebElement ele=driver.findElement(By.linkText("Best Sellers"));
	  
	  js.executeScript("arguments[0].click();",ele);
	  
	  
	  	  
	  
	  /*
	  //js.executeScript("window.scrollTo(0,5000)");
	  //down
	  js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	  
	  Thread.sleep(2000);
	  
	  //up
	  js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
	  
	  
	  Thread.sleep(2000);
	  
	  //element-scrollIntoView()
	  WebElement ele=driver.findElement(By.xpath("//div[@id='desktop-5']"));
	  js.executeScript("arguments[0].scrollIntoView(true);",ele);
	  
	  */
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
