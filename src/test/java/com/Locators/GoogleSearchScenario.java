package com.Locators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchScenario {

	public static void main(String[] args)
	{
		// create driver session
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com");
		
		//search
		driver.findElement(By.name("q")).sendKeys("postman");
		
		List<WebElement> list=driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));

		System.out.println("Total options: "+list.size());
		
	for(WebElement i:list)
	{
		System.out.println(i.getText());
	}
		
		
		
		
		
		
		
	}

}
