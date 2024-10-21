package com.TestngFramework.ListenerTest;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class TestListener implements ITestListener
{
  
	public void onTestStart(ITestResult result)
	{
		System.out.println("Test started..."+result.getMethod().getMethodName());
	}
	
	public void onTestSuccess(ITestResult result)
	{
	System.out.println("Test Pass: "+result.getName());
	}
	
	public void onTestFailure(ITestResult result)
	{
	System.out.println("Test Fail: "+result.getName());
	}
	
	
	
	
}
