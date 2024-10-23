package com.Stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.Hooks.CRMHooks;
import com.Utility.BrowserProvider;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CRMSteps 
{
	WebDriver driver=BrowserProvider.getDriver();
	
//	@Before
//	public void setup()
//	{
//		
//	}
	@Given("open Crm application with {string}")
	public void open_crm_application_with(String url) {
	    
		//driver=new ChromeDriver();
		driver.get(url);
	}

	@When("User click on signIn link")
	public void user_click_on_sign_in_link() 
	{
	    driver.findElement(By.linkText("Sign In")).click();
	}

	@Then("User should navigate to Login page")
	public void user_should_navigate_to_login_page() {
	    Assert.assertTrue(driver.getCurrentUrl().contains("login"));
	    System.out.println("User navigated to login");
	}

	@When("User navigated to login")
	public void user_navigated_to_login() {
		driver.findElement(By.linkText("Sign In")).click();
	}

	@When("User enter {string} email and {string} password")
	public void user_enter_email_and_password(String email, String psw) {
		driver.findElement(By.id("email-id")).sendKeys(email);
		driver.findElement(By.id("password")).sendKeys(psw);
	    
	}

	@When("User click on submit button")
	public void user_click_on_submit_button() {
	    driver.findElement(By.id("submit-id")).click();
	}

	@Then("User should able to navigate customers page")
	public void user_should_able_to_navigate_customers_page() {
		 Assert.assertTrue(driver.getCurrentUrl().contains("customers"));
		    System.out.println("User navigated to customersPage");
	}


}
