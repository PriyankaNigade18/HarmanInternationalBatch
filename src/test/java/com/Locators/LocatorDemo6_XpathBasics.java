package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo6_XpathBasics {

	public static void main(String[] args)
	{
		
		//Create a driver session
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		
		
		//username
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("standard_user");

		//password
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("secret_sauce");
		
		
		//button	
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		
		
	}

}
