package com.TestNGFrameworkAnnotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.*;
import org.testng.annotations.Test;

public class AnnotationTest1
{
	@Test(priority=1,groups="Functional")
	  public void registerTest()
	  {
		  System.out.println("This is register test");
	  }
	  
	  @Test(priority=2,groups="Regression")
	  public void loginTest()
	  {
		  System.out.println("This is login test");
	  }
	  
	  @Test(priority=3,groups="Functional")
	  public void searchProductTest()
	  {
		  System.out.println("This is search test");
	  }
	  
	  
	  @BeforeMethod
	  public void bmethod()
	  {
		  System.out.println("BeforeMethod will run before every test case!");
	  }
	  
	  @AfterMethod
	  public void amethod()
	  {
		  System.out.println("AfterMethod will run after every test case!");
	  }
	  
	  @BeforeClass
	  public void bclass()
	  {
		  System.out.println("BeforeClass will run before first test case");
	  }
	  
	  
	  @AfterClass
	  public void aclass()
	  {
		  System.out.println("AfterClass will run after last test case");
	  }
}
