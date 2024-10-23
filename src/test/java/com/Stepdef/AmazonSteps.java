package com.Stepdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonSteps {

	WebDriver driver;
	String title;
	@Given("Open Amazon application")
	public void open_amazon_application() {
	    driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://www.amazon.in");
	}

	@When("User get the home page title")
	public void user_get_the_home_page_title() {

		title=driver.getTitle();
		System.out.println("Actual title: "+title);
	}

	@Then("Title should match to homepage title")
	public void title_should_match_to_homepage_title() {
	    Assert.assertTrue(title.contains("site in India"));
	    System.out.println("Home page title matched!");
	}

	@When("User open Sell page")
	public void user_open_sell_page()
	{
	    driver.findElement(By.linkText("Sell")).click();
	}

	@When("User get the title of Sell page")
	public void user_get_the_title_of_sell_page() {
		title=driver.getTitle();
		System.out.println("Actual title: "+title);

	}

	@Then("Sell page title should match")
	public void sell_page_title_should_match() {
		Assert.assertTrue(title.contains("All Categories"));
	    System.out.println("Sell page title matched!");
	}

	@When("User open Mobile page")
	public void user_open_mobile_page() {
	   driver.findElement(By.linkText("Mobiles")).click();
	}

	@When("User get the title of mobile page")
	public void user_get_the_title_of_mobile_page() {
		title=driver.getTitle();
		System.out.println("Actual title: "+title);

	}

	@Then("Mobile page title should match")
	public void mobile_page_title_should_match() {
		Assert.assertTrue(title.contains("Phones"));
	    System.out.println("Mobile page title matched!");
	}


}
