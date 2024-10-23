package com.Stepdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;

public class HrmSteps 
{
     WebDriver driver;
     
	@Given("Open Hrm application")
	public void open_hrm_application() {
		driver=new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("User enter {string} and {string} into hrm login page")
	public void user_enter_and_into_hrm_login_page(String un, String psw) {
		driver.findElement(By.name("username")).sendKeys(un);
		  driver.findElement(By.name("password")).sendKeys(psw);
		  
	}

	@When("user click on login button of hrm page")
	public void user_click_on_login_button_of_hrm_page() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("As per the valid data set user should able to navigate dashboard page")
	public void as_per_the_valid_data_set_user_should_able_to_navigate_dashboard_page() {
		 Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
		  System.out.println("Login Completed!");
	}



}
