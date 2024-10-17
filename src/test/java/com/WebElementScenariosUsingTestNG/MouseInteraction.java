package com.WebElementScenariosUsingTestNG;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class MouseInteraction 
{
  @Test
  public void testRightclickAction()
  {
	  	WebDriver driver=new ChromeDriver();
	  	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	  	WebElement ele=driver.findElement(By.xpath("//span[text()='right click me']"));
	  	
	  	//action on element
	  	Actions act=new Actions(driver);
	  	act.contextClick(ele).perform();
	  	
	  	List<WebElement> list1=driver.findElements(By.xpath("(//ul)[3]//li//span"));
	  	for(WebElement i:list1)
	  	{
	  		System.out.println(i.getText());
	  		if(i.getText().contains("Delete"))
	  		{
	  			i.click();
	  			break;
	  		}
	  	}
	  	
	  	//alert window
	  	Alert alt1=driver.switchTo().alert();
	  	System.out.println("Alert 1 text is: "+alt1.getText());
	  	alt1.accept();
	  	
	  
  }
  
  
  @Test
  public void doubleClickAction()
  {
	  WebDriver driver=new ChromeDriver();
	  	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	  	
	  	WebElement ele=driver.findElement(By.tagName("button"));
	  	
	  	Actions act=new Actions(driver);
	  	act.doubleClick(ele).perform();
	  	
	  	//alert
	  	Alert alt=driver.switchTo().alert();
	  	System.out.println("Alert text is: "+alt.getText());
	  	alt.accept();
	  	
	   	
  }
  
  @Test
  public void mouseOverAction()
  {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://jqueryui.com/tooltip/");
	  
	  
	  //frame
	  driver.switchTo().frame(0);
	  
	  //age
	  WebElement ele=driver.findElement(By.id("age"));
	  
	  //mouse over
	  
	  Actions act=new Actions(driver);
	  act.moveToElement(ele).perform();
	  
	  String tooltip=driver.findElement(By.xpath("//div[@class='ui-tooltip-content']")).getText();
	  
	  System.out.println(tooltip);
	  
	  
	  
  }
  
  
  @Test
  public void dragAndDrop()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://jqueryui.com/droppable/");
	  
	  //maximize
	  driver.manage().window().maximize();
	  
	  //frame
	  driver.switchTo().frame(0);
	  
	  //src
	  WebElement ele1=driver.findElement(By.id("draggable"));
	  
	  
	  WebElement ele2=driver.findElement(By.id("droppable"));
	  
	  //action
	  
	  Actions act=new Actions(driver);
	  act.dragAndDrop(ele1,ele2).perform();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
  
  @Test
  public void sliderTest()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://jqueryui.com/slider/");
	  
	  driver.switchTo().frame(0);
	  
	  WebElement ele=driver.findElement(By.className("ui-slider-handle"));
	  
	  
	  Actions act=new Actions(driver);
	  act.clickAndHold(ele).moveToElement(ele,50,0).build().perform();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
  
  
  
  
  
}
