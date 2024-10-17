package com.WebElementScenariosUsingTestNG;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertHandling {
  @Test
  public void testAlertDemo1() throws InterruptedException
  {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	  
	  //signin
	  driver.findElement(By.name("proceed")).click();
	  
	  Thread.sleep(2000);
	  //UnhandledAlertException: unexpected alert open: {Alert text : Please enter a valid user name}
	  //alert window
       Alert alt1= driver.switchTo().alert();
       System.out.println("Alert text is: "+alt1.getText());
       alt1.accept();
	  
	  //name
	  driver.findElement(By.id("login1")).sendKeys("Priyanka");
	  
	  
	  
  }
  
  
  @Test
  public void alertDemo2()
  {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	  
	  //alert1
	  driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();

	  //alert1 will open
	  Alert alt1=driver.switchTo().alert();
	  System.out.println("Text of alert1 is: "+alt1.getText());
	  alt1.accept();
	  
	  WebElement res=driver.findElement(By.id("result"));
	  System.out.println("Result of alert1 is: "+res.getText());
	  
	  //alert2
	  driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
	  
	  //alert will open
	  Alert alt2=driver.switchTo().alert();
	  System.out.println("Text of alert2 is: "+alt2.getText());
	  alt2.dismiss();
	  System.out.println("Result of alert2 is: "+res.getText());

	  //alert3
	  driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
	  
	  //alert will open
	  Alert alt3=driver.switchTo().alert();
	  System.out.println("Text of alert3 is: "+alt3.getText());
	  alt3.sendKeys("Hello All");
	  //alt3.dismiss();
	  alt3.accept();
	  System.out.println("Result of alert3 is: "+res.getText());


	    
	  
	  
	  
	  
  }
  
  
  @Test
  public void basicAuthentication()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	  
	  
	  
	  
  }
  
  
  
}
