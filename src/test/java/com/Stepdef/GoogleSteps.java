package com.Stepdef;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;

public class GoogleSteps
{
	WebDriver driver;

	String title;
	@Given("Open Google application")
	public void open_google_application()
	{
	    driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://www.google.com");
	}

	@When("I get the current application title")
	public void i_get_the_current_application_title() {
	   title=driver.getTitle();
	   System.out.println("Actual Title is: "+title);
	}

	@Then("Title should match with Google")
	public void title_should_match_with_google() {
	   
		String expTitle="Google";
		Assert.assertTrue(title.equals(expTitle),"Title not matched!...Test Fail");
		System.out.println("Title matched!: Test Pass: Title is: "+title);
		
	}
	@When("I enter valid keyword {string} into serchbox")
	public void i_enter_valid_keyword_into_serchbox(String keyword) 
	{
	    driver.findElement(By.id("APjFqb")).sendKeys(keyword);
	}

	@Then("I should get valid search result")
	public void i_should_get_valid_search_result()
	{
		System.out.println("Valid result");
		List<WebElement> list=driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
		System.out.println("Total Options: "+list.size());
		for(WebElement i:list)
		{
			System.out.println(i.getText());
		}
	    
	}

}
