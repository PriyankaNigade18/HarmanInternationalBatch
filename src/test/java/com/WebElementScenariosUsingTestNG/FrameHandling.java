package com.WebElementScenariosUsingTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FrameHandling {
  @Test
  public void testFrame()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://ui.vision/demo/webtest/frames/");
	  
	  //frame with index
	  driver.switchTo().frame(0);
	  driver.findElement(By.name("mytext1")).sendKeys("testingframe1");
	  
	  
	  //main document
	  driver.switchTo().defaultContent();
	  
	  //frame2 with WebElement
	  WebElement frame2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
	  
	  driver.switchTo().frame(frame2);
	  
	  //input
	  driver.findElement(By.name("mytext2")).sendKeys("testing frame2");
	  
	  
	//main document
	  driver.switchTo().defaultContent();
	  
	  //frame3
	  WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
	  driver.switchTo().frame(frame3);
	  driver.findElement(By.name("mytext3")).sendKeys("testing frame3");
	  
	  //nested frame
	  WebElement innerframe=driver.findElement(By.tagName("iframe"));
	  
	  driver.switchTo().frame(innerframe);
	  
	  //select
	  driver.findElement(By.id("i8")).click();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
