package com.WebElementScenariosUsingTestNG;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.Generic.Utility;

public class AmzonDropdownDemo 
{
  @Test
  public void testCase1() throws InterruptedException 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://www.amazon.in");
	  
	  //address of dropdown
	  WebElement ddele=driver.findElement(By.name("url"));
	  
	  Utility.selectBasedDropdown(ddele,"Books");
	  
	  
	  
	  
	  /*
	  //select tag based
	  Select s1=new Select(ddele);
	  
	  System.out.println("Is dropdown support multiple selection?: "+s1.isMultiple());

	  //single
	  s1.selectByIndex(3);
	  Thread.sleep(2000);
	  s1.selectByValue("search-alias=gift-cards");
	  Thread.sleep(2000);
	  s1.selectByVisibleText("Tools & Home Improvement");
	  
	  //get the all options
	  List<WebElement> allOptions=s1.getOptions();
	  System.out.println("Total Options are: "+allOptions.size());
	  
	  for(WebElement i:allOptions)
	  {
		  System.out.println(i.getText());
		  if(i.getText().contains("Video Games"))
		  {
			  i.click();
			  break;
		  }
	  }
	  
	  
	  
	  */
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
  
  
  
}
