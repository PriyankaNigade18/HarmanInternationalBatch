package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo8_XpathMethods {

	public static void main(String[] args)
	{
		//create a driver session
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		//mobiles- text()
		driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
		
		//cart- normalize-space()
		driver.findElement(By.xpath("//span[normalize-space()='Cart']")).click();
		

		//cart message
		String text1=driver.findElement(By.xpath("(//h3)[1]")).getText();
		System.out.println(text1);
		
		//search---keyword--contains()
		driver.findElement(By.xpath("//input[contains(@id,'searchtext')]")).sendKeys("watch",Keys.ENTER);
		
		//search---starts-with(prefix)
		WebElement ele=driver.findElement(By.xpath("//input[starts-with(@id,'twotab')]"));
		ele.clear();
		ele.sendKeys("bags",Keys.ENTER);
		
		
	}

}
