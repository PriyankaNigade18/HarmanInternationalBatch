package com.Locators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FreshWorksFooterTest {

	public static void main(String[] args)
	{
		// create a driver session
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.freshworks.com/");
		
		//footer
		List<WebElement> list=driver.findElements(By.xpath("//div//div[contains(@class,'eNMhGa')]//ul[contains(@class,'kTjuIu')]//li"));

		System.out.println("Total Footer links are: "+list.size());
		
		for(WebElement i:list)
		{
			System.out.println(i.getText());
		}
		
		
		
		
		
		
		
		
		
	}

}
