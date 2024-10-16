package com.WebTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommnads {

	public static void main(String[] args)
	{
		// create a driver session
		WebDriver driver=new ChromeDriver();
		
		//open application
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//title
		System.out.println("Application title: "+driver.getTitle());

		//current url 
		System.out.println("Application current url is: "+driver.getCurrentUrl());
		
		//page source
		System.out.println(driver.getPageSource());
		
		//close()
		driver.quit();
		
		
		
		
		
	}

}
