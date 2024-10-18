package com.DataDrivenTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTest1
{
	
	
		
  @Test(dataProvider = "mydata",dataProviderClass = CustomData.class)
  public void testCase(String un,String psw)
  {
	  System.out.println("Test Case executed with UserName: "+un);
	  System.out.println("Test Case executed with password: "+psw);
  }
}
