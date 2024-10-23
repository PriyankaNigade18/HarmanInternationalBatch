package com.Stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;

public class SwagLabSteps 
{
	WebDriver driver;
	@Given("Open SwagLab application")
	public void open_swag_lab_application() {
	    driver=new ChromeDriver();
	    driver.get("https://www.saucedemo.com/");
	}

	@When("User enter valid username {string} and user enter valid password {string}")
	public void user_enter_valid_username_and_user_enter_valid_password(String un, String psw) {
	    driver.findElement(By.id("user-name")).sendKeys(un);
	    driver.findElement(By.name("password")).sendKeys(psw);
	}

	@When("User click on Login button")
	public void user_click_on_login_button()
	{
	    driver.findElement(By.id("login-button")).click();
	}

	@Then("User should be able to navigate Inventory page")
	public void user_should_be_able_to_navigate_inventory_page() {

		String actUrl=driver.getCurrentUrl();
		String exp="inventory";
		Assert.assertTrue(actUrl.contains(exp),"Login Fail!");
		System.out.println("Login completed....User navigated to Inventory page");
		
	}




}
