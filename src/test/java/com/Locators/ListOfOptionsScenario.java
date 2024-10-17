package com.Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListOfOptionsScenario {

	public static void main(String[] args) 
	{
		//create a driver session
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		
		
		//list
		List<WebElement> list=driver.findElements(By.xpath("//div[@class='list-group']//a"));
		System.out.println("Total option are: "+list.size());
		
		//click on link
		String exp="Forgotten Password";
		
		for(WebElement i:list)
		{
			System.out.println(i.getText());
			if(i.getText().contains(exp))
			{
				i.click();
				break;
				
			}
		}
		
		
		
		
		
		
		
		
		
		
	}

}
