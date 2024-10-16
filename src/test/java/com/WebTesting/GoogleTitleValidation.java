package com.WebTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTitleValidation {

	public static void main(String[] args) 
	{
		//create driver session
		WebDriver driver=new ChromeDriver();
		
		//open any application
		driver.get("https://www.google.com");
		
		//get the current title -getTitle()
		String actTitle=driver.getTitle();
		String expTitle="Google";
		
		//validate
		if(actTitle.equals(expTitle))
		{
			System.out.println("Title matched!....Test Pass");
		}else
		{
			System.out.println("Title not matched!....Test Fail");
		}
		
		//close broswer - close() quit()
		driver.quit();
		
		
		
		
		
		
		
		

	}

}
