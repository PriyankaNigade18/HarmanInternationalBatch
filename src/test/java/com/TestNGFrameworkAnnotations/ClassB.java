package com.TestNGFrameworkAnnotations;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClassB
{
	@Test
	  public void testCase3()
	  {
		  System.out.println("TestCase3 is from ClassB");
	  }
	  
	  
	  @Test
	  public void testCase4()
	  {
		  System.out.println("TestCase4 is from ClassB");
	  }
	  
	  
	  //<test> in xml is collection of classes
	  @BeforeTest
	  public void btest()
	  {
		  System.out.println("Before Test will execute before First Class");
	  }
	  
	  @AfterTest
	  public void atest()
	  {
		  System.out.println("After Test will execute after last Class");
	  }
	  
	  @BeforeSuite
	  public void bsuite()
	  {
		  System.out.println("BeforeSuite will run before Test");
		  
		  
	  }
	  
	  
	  @AfterSuite
	  public void asuite()
	  {
		  System.out.println("AfterSuite will run after Test");
		  
		  
	  }
}

