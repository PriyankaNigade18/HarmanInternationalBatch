package com.SwagLabs.TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.SwagLabs.Base.BaseTest;

public class InventoryPageTest extends BaseTest
 {
	
	@BeforeClass
	public void pageSetUp()
	{
		ip=lp.doLogin("standard_user","secret_sauce");
	}
	
  @Test(priority=1)
  public void validateProductCount() 
  {
	  int count=ip.getTotalProductCount();
	  AssertJUnit.assertEquals(count,6);
	  System.out.println("Product count matches!: "+count);
  }
  
  @Test(priority=2)
  public void validateProductDetails() 
  {
	  ip.getProductDeatils();
  }
  
  @Test(priority=3)
  public void validateAddToCart() 
  {
	  ip.addProductToCart("Sauce Labs Fleece Jacket");
  }
  
  @Test(priority=4)
  public void validateGetCartPageAccess() 
  {
	  ip.getCartPage();
  }
}
