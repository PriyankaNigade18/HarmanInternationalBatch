package com.Locators;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeDriver;

public class CapabilitiesTest {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		Capabilities cap=driver.getCapabilities();
		System.out.println(cap.asMap());

	}

}
