package com.Hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Utility.BrowserProvider;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CRMHooks 
{
	public WebDriver driver;
	@Before
	public void setup()
	{
		System.out.println("Browser launch application");
		//driver=new ChromeDriver();
		driver=BrowserProvider.setDriver("chrome");
	}

	
	@After
	public void teardown()
	{
		System.out.println("Browser closed");
		driver.quit();
	}
}
