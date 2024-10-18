package com.PageObjectUsingPageFactory;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewLoginPageTest extends BaseClass
{
  @Test(priority=1)
  public void validateUrl() 
  {
	  String url=lp.getAppUrl();
	  Assert.assertTrue(url.contains("demo"));
	  System.out.println("Url matched!: "+url);
  }
  
  
  @Test(priority=2)
  public void validateTitle() 
  {
	  String title=lp.getAppgTitle();
	  Assert.assertTrue(title.contains("HRM"));
	  System.out.println("Title matched!: "+title);
  }
  
  @Test(priority=3)
  public void validateLogin() 
  {
	  lp.doLogin("Admin","admin123");
	  
  }
}
