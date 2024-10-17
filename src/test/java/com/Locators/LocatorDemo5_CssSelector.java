package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo5_CssSelector {

	public static void main(String[] args) 
	{
		// create a driver session
		WebDriver driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		//email
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("sumit11@gmail.com");
		
		
		//password
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("test123");
		
		//login
		//driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		driver.findElement(By.cssSelector("input.btn.btn-primary[value='Login']")).click();
		
		
		
		
		
		
		
		
		
		;
	}

}
