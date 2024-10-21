package com.SwagLabs.TestCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.SwagLabs.Base.BaseTest;

public class CheckoutPageTest extends BaseTest
{
	@BeforeClass
	public void pageSetUp()
	{
		ip=lp.doLogin("standard_user","secret_sauce");
		addWait();
		ip.addProductToCart("Sauce Labs Bike Light");
		addWait();
		cp=ip.getCartPage();
		addWait();
		cp.doCheckOut();
		
	}
	
  @Test
  public void validateCheckoutProcess()
  {
	  ch.doContinue("Priyanka", "Nigade", "411047");
  }
}
