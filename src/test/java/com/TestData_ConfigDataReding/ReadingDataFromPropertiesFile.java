package com.TestData_ConfigDataReding;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadingDataFromPropertiesFile
{
  @Test
  public void dataReadingTest() throws IOException 
  {
	  //path of file
	  File f1=new File(System.getProperty("user.dir")+"//Config//config.properties");
	  
	  //to read data in a stream
	  FileInputStream fs=new FileInputStream(f1);
	  
	  //Properties is Class in java- Object
	  Properties p1=new Properties();
	  
	  
	  //load the file
	  p1.load(fs);
	  
	  //reading-getProperties(Key)--->value
	  System.out.println("Browser Name: "+p1.getProperty("bname"));
	  System.out.println(p1.getProperty("url"));
	  System.out.println("User name : "+p1.getProperty("un"));
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
