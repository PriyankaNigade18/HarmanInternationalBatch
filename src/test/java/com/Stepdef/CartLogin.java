package com.Stepdef;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class CartLogin {

	WebDriver driver;
	@Given("Open login page")
	public void open_login_page() {
	    
		driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	}

	@When("user enter valid credentials")
	public void user_enter_valid_credentials(DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    
		List<Map<String,String>> data=dataTable.asMaps();
		
		driver.findElement(By.name("email")).sendKeys(data.get(0).get("email"));
		driver.findElement(By.id("input-password")).sendKeys(data.get(0).get("psw"));
		
			}

	@When("user click on login button of opencart")
	public void user_click_on_login_button_of_opencart() {
	    driver.findElement(By.xpath("//input[@value='Login']")).click();
	}

	@Then("user should be login into app")
	public void user_should_be_login_into_app() {
	    Assert.assertTrue(driver.getCurrentUrl().contains("account"));
	    System.out.println("Login Completed....Test Pass!");
	}


}
