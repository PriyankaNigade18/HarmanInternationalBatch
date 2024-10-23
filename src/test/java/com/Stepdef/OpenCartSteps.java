package com.Stepdef;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class OpenCartSteps 

{
	WebDriver driver;
	@Given("Open opencart Register page")
	public void open_opencart_register_page() {
	    driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
	}

	@When("User enters required entries")
	public void user_enters_required_entries(DataTable table) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		List<Map<String,String>> data=table.asMaps();
		driver.findElement(By.id("input-firstname")).sendKeys(data.get(0).get("fname"));
		driver.findElement(By.name("lastname")).sendKeys(data.get(0).get("lname"));
		driver.findElement(By.name("email")).sendKeys(data.get(0).get("email"));
		driver.findElement(By.name("telephone")).sendKeys(data.get(0).get("telephone"));
		driver.findElement(By.name("password")).sendKeys(data.get(0).get("password"));
		driver.findElement(By.name("confirm")).sendKeys(data.get(0).get("cpassword"));
	    
	}

	@When("user click on yes redio button")
	public void user_click_on_yes_redio_button() {
	    driver.findElement(By.xpath("(//input[@name='newsletter'])[1]")).click();
	}

	@When("user check the privacy policy checkbox")
	public void user_check_the_privacy_policy_checkbox() {
	    driver.findElement(By.name("agree")).click();
	}

	@When("User click on Continue button")
	public void user_click_on_continue_button() {
	   driver.findElement(By.xpath("//input[@value='Continue']")).click();
	}

	@Then("User should be register into application")
	public void user_should_be_register_into_application() {
	    String exp="account";
	    Assert.assertTrue(driver.getCurrentUrl().contains(exp));
	    System.out.println("Register process completed!");
	    String text=driver.findElement(By.xpath("(//h1)[2]")).getText();
	    System.out.println(text);
	    
	}




}
