package com.TestngFramework.ListenerTest;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager implements ITestListener
{
	public ExtentReports extent;
	public ExtentSparkReporter spark;
	public ExtentTest test;
	
	public void onStart(ITestContext context)
	{
		 extent=new ExtentReports();
		  
		  //path of report
		  spark=new ExtentSparkReporter(System.getProperty("user.dir")+"//Reports//CRMTest.html");
		  
		  //configuration
		  spark.config().setDocumentTitle("ExtentReport");
		  spark.config().setReportName("Sprint_1 Report");
		  spark.config().setTheme(Theme.DARK);
		  
		  //attach report to extent object
		  extent.attachReporter(spark);
		  
		  extent.setSystemInfo("platformName","Windows 11");
		  extent.setSystemInfo("SystemName","laptop");
		  
		  //create test
		test= extent.createTest("Test Case Details");
		 
	}
	
	
	public void onTestSuccess(ITestResult result)
	{
		test.log(Status.PASS,"Test Pass: "+result.getName());
	}
	
	
	public void onTestFailure(ITestResult result)
	{
		test.log(Status.FAIL,"Test Fail: "+result.getName());
		test.log(Status.INFO,result.getThrowable().getMessage());
	}
	
	public void onFinish(ITestContext context)
	{
		extent.flush();
	}
	
	
	
}
