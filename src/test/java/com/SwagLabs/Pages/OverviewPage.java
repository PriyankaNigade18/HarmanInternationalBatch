package com.SwagLabs.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SwagLabs.Utility.Utility;

public class OverviewPage 
{

	WebDriver driver;
	
	public OverviewPage(WebDriver driver)//base class
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//Locators
	@FindBy(xpath="//div[@class='summary_info']")
	WebElement summary;
	
	
	@FindBy(id="finish")
	WebElement finishBtn;
	
	@FindBy(tagName="h2")
	WebElement resultText;
	
	
	
	public void getSummary()
	{
		System.out.println("Summary of Order is:");
		System.out.println(summary.getText());
		Utility.getScreenshot(driver,"OderSummary");
	}
	
	public void doCompleteOrder()
	{
		finishBtn.click();
		System.out.println("Result Text is: "+resultText.getText());
		Utility.getScreenshot(driver,"Completion");
	}
	
	
	
	
	
	
	
	
	
	
}
