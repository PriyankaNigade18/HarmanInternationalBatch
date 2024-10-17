package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo7_operator_indexing {

	public static void main(String[] args) 
	{
		//create driver session
		WebDriver driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		
		
		//firstname
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("Jay");
		
		//lastname- and
		driver.findElement(By.xpath("//input[@name='lastname' and @class='form-control']")).sendKeys("Nigade");
		
		//email -or- or
		driver.findElement(By.xpath("//input[@name='email' or @class='form']")).sendKeys("jay2022@gmail.com");
		
		//telephone- indexing
		driver.findElement(By.xpath("(//input[@class='form-control'])[4]")).sendKeys("88766555");
		
		//password
		driver.findElement(By.xpath("(//input[@class='form-control'])[5]")).sendKeys("test123");
		
		//confirm
		driver.findElement(By.xpath("(//input[@class='form-control'])[position()=6]")).sendKeys("test123");
		
		//radio button
		driver.findElement(By.xpath("(//input[@name='newsletter'])[1]")).click();
		
		//checkbox
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		
		//btn
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		
		
		//result message
		String res=driver.findElement(By.xpath("//div[@id='content']")).getText();
		System.out.println(res);
		
		
		
		
		
		
		

	}

}
