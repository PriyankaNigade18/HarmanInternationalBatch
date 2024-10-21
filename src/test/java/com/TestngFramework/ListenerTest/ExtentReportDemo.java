package com.TestngFramework.ListenerTest;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportDemo {
  @Test
  public void testReport()
  {
	  ExtentReports extent=new ExtentReports();
	  
	  //path of report
	  ExtentSparkReporter spark=new ExtentSparkReporter(System.getProperty("user.dir")+"//Reports//Automation.html");
	  
	  //configuration
	  spark.config().setDocumentTitle("ExtentReport");
	  spark.config().setReportName("Sprint_1 Report");
	  spark.config().setTheme(Theme.DARK);
	  
	  //attach report to extent object
	  extent.attachReporter(spark);
	  
	  extent.setSystemInfo("platformName","Windows 11");
	  extent.setSystemInfo("SystemName","laptop");
	  
	  //create test
	 ExtentTest test= extent.createTest("Test Case Details");
	 
	 
	 //logs
	 test.log(Status.PASS,"Test is Pass!");
	 test.log(Status.FAIL,"Test is Fail!");
	 test.log(Status.INFO,"This is info");
	 test.log(Status.SKIP,"Test is skiped!");
	 
	 //close the extent instance-flush()
	 
	 extent.flush();
	 
	 
	 
	  
	  
  }
}
