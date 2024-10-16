package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo1_IdentificationWays {

	public static void main(String[] args)
	{
		//Create a driver session
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		//Technique3: Identify+action
		driver.findElement(By.id("APjFqb")).sendKeys("selenium");
		
		
		
		/*
		//Technique2:Identification+validation+Action
		WebElement searchele=driver.findElement(By.id("APjFqb"));
		
		if(searchele.isDisplayed() && searchele.isEnabled())
		{
			searchele.sendKeys("testng");
		}
		
		*/
		
		
		
		
		
		
		
		
		
		
		
		/*
		//Technique1: By locator(framework)
		
		//get the address of element-searchbox
		
		By searchbox=By.id("APjFqb");
		
		//use identification ()
		WebElement searchele=driver.findElement(searchbox);
		
		//validate
		System.out.println("Is search box display?: "+searchele.isDisplayed());
		System.out.println("Is search box is enabled?: "+searchele.isEnabled());
		
		//action
		searchele.sendKeys("java",Keys.ENTER);
		*/
		
		
		
		
		
		
		
		
		
		
		

	}

}
