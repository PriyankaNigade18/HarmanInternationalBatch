package com.DataDrivenTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class CustomData 
{
	
	XSSFWorkbook wb;
	
	@DataProvider(name="mydata")
	public Object[][] testData()
	{
		Object data[][]= {{"Admin","admin123"},{"Pratik","test123"},{"Kiran","test123"},{"Admin","admin123"}};
		return data;
	}
	
	@DataProvider(name="exceldata")
	public Object[][] excelData()
	{

		//path of file
		  File f1=new File(System.getProperty("user.dir")+"//TestData//Data.xlsx");
		  
		  //stream
		  FileInputStream fs;
		  Object data[][]=null;
		  
		try {
			fs = new FileInputStream(f1);
			 //workbook
			  wb=new XSSFWorkbook(fs);
			  
			  //number of rows from file
			  int rows=wb.getSheet("userdata").getPhysicalNumberOfRows();
			  System.out.println("Number of  rows from file: "+rows);//6
			  
			  //number of cells from file
			  int cells=wb.getSheet("userdata").getRow(0).getPhysicalNumberOfCells();
			  System.out.println("Number of cells from file: "+cells);
			  
			  //declare an array which is same size like file
			  data=new Object[rows-1][cells];//5 rows and 2 cells
			  
			  //iterate array and pass data from file to array
			  for(int i=1;i<rows;i++)
			  {
				  for(int j=0;j<cells;j++)
				  {
					  data[i-1][j]=wb.getSheet("userdata").getRow(i).getCell(j).getStringCellValue();
					  
				  }
				 
			  }
			  
					
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
		  
		 
		  
		 
	}

}
