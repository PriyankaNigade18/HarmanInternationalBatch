package com.PageObjectUsingByLocator;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest
{
	
	@Test(priority=1)
	public void validateUrl()
	{
		//LoginPage lp=new LoginPage();
		String url=lp.getAppUrl();
		Assert.assertTrue(url.contains("crm"));
		System.out.println("Test Pass: Url matched: "+url);
		
	}
	
  @Test(priority=2)
  public void validateLogin() 
  {
	  //LoginPage lp=new LoginPage();
//	  lp.enterEmail("test@gmail.com");
//	  lp.enterPassword("test123");
//	  lp.clickOnButton();
	  lp.doLogin("test@gmail.com","test123");
	  Assert.assertTrue(lp.getAppUrl().contains("customers"));
	  System.out.println("Login completed!");
	  
  }
}
