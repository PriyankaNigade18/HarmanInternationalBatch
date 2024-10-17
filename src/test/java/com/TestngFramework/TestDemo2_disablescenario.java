package com.TestngFramework;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestDemo2_disablescenario {
	@Test(priority=1)
	  public void registerTest()
	  {
		  System.out.println("This is register test");
	  }
	  
	  @Test(priority=2)
	  public void loginTest()
	  {
		  System.out.println("This is login test");
	  }
	  
	  @Test(priority=3)
	  public void searchProductTest()
	  {
		  System.out.println("This is search test");
	  }
	  
	  @Test(priority=4,enabled=false)
	  public void addToCartTest()
	  {
		  System.out.println("This is addTocart test");
	  }
	  
}
