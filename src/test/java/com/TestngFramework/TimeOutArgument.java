package com.TestngFramework;

import org.testng.annotations.Test;

public class TimeOutArgument
{
  @Test(timeOut = 3000)
  public void testCase1() throws InterruptedException
  {
	  System.out.println("this is test case1");
	  Thread.sleep(2000);
	  
  }
  
  @Test(timeOut = 3000)
  public void testCase2() throws InterruptedException
  {
	  System.out.println("this is test case2");
	  Thread.sleep(4000);
  }
}
