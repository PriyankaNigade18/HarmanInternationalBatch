package com.DataDrivenTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;
import org.testng.annotations.Test;

public class DataReadingFromExcelFile {
  @Test
  public void dataReading() throws IOException
  {
	//path of file
	  File f1=new File(System.getProperty("user.dir")+"//TestData//Data.xlsx");
	  
	  //stream
	  FileInputStream fs=new FileInputStream(f1);
	  
	  //wb-->sheet-->row-->cell-->data
	  
	  //workbook
	  XSSFWorkbook wb=new XSSFWorkbook(fs);
	  
	  //number of rows from file
	  int rows=wb.getSheet("userdata").getPhysicalNumberOfRows();
	  System.out.println("Number of  rows from file: "+rows);//6
	  
	  //number of cells from file
	  int cells=wb.getSheet("userdata").getRow(0).getPhysicalNumberOfCells();
	  System.out.println("Number of cells from file: "+cells);
	  
	  //declare an array which is same size like file
	  //rows-1 just to skip heading
	  Object data[][]=new Object[rows-1][cells];//5 rows and 2 cells
	  
	  //iterate array and pass data from file to array
	  for(int i=1;i<rows;i++)
	  {
		  for(int j=0;j<cells;j++)
		  {
			  //array index always starts with 0
			  data[i-1][j]=wb.getSheet("userdata").getRow(i).getCell(j).getStringCellValue();
			  System.out.print(data[i-1][j]+"     ");
		  }
		  System.out.println();
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  /*Single Entry
	  String value=wb.getSheet("userdata").getRow(5).getCell(0).getStringCellValue();
//	  XSSFSheet sheet1=wb.getSheet("userdata");
//	  XSSFRow row1=sheet1.getRow(2);
//	 XSSFCell cell1= row1.getCell(0);
//	 String value=cell1.getStringCellValue();
	  
	  	System.out.println(value);
//	  
	  */
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
