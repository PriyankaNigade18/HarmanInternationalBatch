package com.Locators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo4_tagName {

	public static void main(String[] args)
	{
		// create a driver session
		WebDriver driver=new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//number of input boxes
		List<WebElement> inputBoxes=driver.findElements(By.tagName("input"));
		System.out.println("Total input boxes are: "+inputBoxes.size());
		
		//Number of images
		List<WebElement> images=driver.findElements(By.tagName("img"));
		System.out.println("Total images are: "+images.size());
		
		
		//Number of links
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total links are: "+links.size());
		
		
		//href  + text
		
		for(WebElement i:links)
		{
			System.out.println(i.getAttribute("href"));
			System.out.println(i.getText());
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
