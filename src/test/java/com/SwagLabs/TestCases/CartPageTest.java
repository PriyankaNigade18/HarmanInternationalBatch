package com.SwagLabs.TestCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.SwagLabs.Base.BaseTest;

public class CartPageTest extends BaseTest

{
	@BeforeClass
	public void pageSetUp()
	{
		ip=lp.doLogin("standard_user","secret_sauce");
		addWait();
		ip.addProductToCart("Sauce Labs Bike Light");
		addWait();
		ip.getCartPage();
		addWait();
	}
	
	
	
  @Test(priority=1)
  public void validateAddedProduct() 
  {
	  cp.getProductDeatils();
	  
  }
  
  @Test(priority=2)
  public void validateRemove() 
  {
	  cp.removeProduct();
	  addWait();
  }
  
  @Test(priority=3)
  public void validateContinueShopping() 
  {
	 ip=cp.continueShopping();
	 addWait();
	 ip.addProductToCart("Sauce Labs Backpack");
	 ip.getCartPage();
  }
  
  @Test(priority=4)
  public void validateCheckoutPageAccess() 
  {
	  cp.doCheckOut();
  }
  
  
  
}
