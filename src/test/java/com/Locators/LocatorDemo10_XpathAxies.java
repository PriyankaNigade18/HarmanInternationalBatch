package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo10_XpathAxies {

	public static void main(String[] args) 
	{

		WebDriver driver=new ChromeDriver();
		driver.get("https://automationplayground.com/crm/customers.html?email-name=test%40gmail.com&password-name=XZxzCx&submit-name=");

		//ancestor node for john
		String tag1=driver.findElement(By.xpath("//td[text()='John']//ancestor::tbody")).getTagName();
		System.out.println("Ancestor for john tag name is: "+tag1);
		
		//parent tagname of john
		String tag2=driver.findElement(By.xpath("//td[text()='John']//parent::tr")).getTagName();
		
		System.out.println("parent for john tag name is: "+tag2);//tr
		
		
		//get all the child tag name for row number 4
		int childs=driver.findElements(By.xpath("(//tr)[5]//child::td")).size();
		System.out.println("Total childs node are: "+childs);//5
		
		//after 4th row count total remaining row
		int rows=driver.findElements(By.xpath("(//tr)[5]//following::tr")).size();
		System.out.println("After 4th row total rows left: "+rows);//2
		
		//how many preceding tags tr are there for John
		int count=driver.findElements(By.xpath("//td[text()='John']//preceding::tr")).size();
		System.out.println("Total rows before John Element: "+count);
		
		//preceding sibling 
		
		String tag3=driver.findElement(By.xpath("//td[text()='John']//preceding-sibling::td")).getTagName();
		System.out.println("Preceding sibling tagname for john is: "+tag3);
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
	}

}
