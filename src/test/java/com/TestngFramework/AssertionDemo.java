package com.TestngFramework;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo {
  @Test
  public void testHardAssertion()
  {
	  
	  
	  String act="Selenium WebDriver is webui automation library";
	  String exp="Selenium WebDriver is webui automation library/tool";
	    /*
	     * If assertion fail you will get java.lang.AssertionError:"
	     */
//	  Assert.assertEquals(act,exp,"Test Fail: As strings are not equal");
//	  System.out.println("Test pass: As strings are equal");
	  
	  
//	  Assert.assertTrue(act.contains("testng"),"Test Fail: exp string is not found");
//	  System.out.println("Test Pass: Expected string is found!");
	  
	  //actual string should not contains testng
	  Assert.assertFalse(act.contains("testng"),"Test Fail: expected string found");
	  System.out.println("Test Pass: expected string not found");
	  
  }
}
