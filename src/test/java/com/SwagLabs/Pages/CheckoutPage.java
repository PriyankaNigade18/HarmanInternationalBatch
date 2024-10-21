package com.SwagLabs.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SwagLabs.Utility.Utility;

public class CheckoutPage
{

	WebDriver driver;
	public CheckoutPage(WebDriver driver)//base class
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//Locator
	@FindBy(id="first-name")
	WebElement fname;
	
	@FindBy(id="last-name")
	WebElement lname;
	
	@FindBy(id="postal-code")
	WebElement zipcode;
	
	@FindBy(id="continue")
	WebElement contBtn;
	
	
	
	public OverviewPage doContinue(String fn,String ln,String zc)
	{
		fname.sendKeys(fn);
		lname.sendKeys(ln);
		zipcode.sendKeys(zc);
		Utility.getScreenshot(driver,"Checkout");
		System.out.println("First name is: "+fn+" last name is: "+ln+"  zipcode is: "+zc);
		contBtn.click();
		return new OverviewPage(driver);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
