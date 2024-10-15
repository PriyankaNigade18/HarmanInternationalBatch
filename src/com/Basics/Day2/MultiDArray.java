package com.Basics.Day2;

public class MultiDArray {

	public static void main(String[] args)
	{
		// using new keyword
		
		int data[][]=new int[3][2];
		data[0][0]=100;
		data[0][1]=200;
		
		data[1][0]=300;
		data[1][1]=400;
		
		
		data[2][0]=500;
		data[2][1]=600;
		
		System.out.println("total rows are: "+data.length);//3
		System.out.println("total columns are: "+data[0].length);//2
		
		System.out.println(data[2][1]);//600
		System.out.println(data[2][0]);//0
		//System.out.println(data[1][2]);//ArrayIndexOutOfBoundsException
		
		
		for(int r=0;r<data.length;r++)
		{
			
			for(int c=0;c<data[r].length;c++)
			{
				System.out.print(data[r][c]+"  ");
			}
			System.out.println();
			
		}
		
		System.out.println("*********************************");
		
		//literal way
		
		String loc[][]= {{"location1","Pune"},{"location2","Mumbai"},{"Location3","Delhi"},{"Location4","Nashik"}};
		
		System.out.println("Total rows: "+loc.length);//4
		System.out.println("Total columns: "+loc[0].length);//2
		
		for(int i=0;i<loc.length;i++)
		{
			for(int j=0;j<loc[i].length;j++)
			{
				System.out.print(loc[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("*************************");
		
		
		for(String i[]:loc)//i={"location1","Pune"}
		{
			for(String j:i)
			{
				System.out.print(j+"    ");
			}
			
			System.out.println();
		}
		
		
		//int id[][]= {{1},{1,2,3},{4}};
		
		int id[][]=new int[3][3];
		id[0][0]=1;
		
		id[1][0]=1;
		id[1][1]=2;
		id[1][2]=3;
		
		
		id[2][0]=4;
		
		
		System.out.println(id[2][0]);//4
		System.out.println(id[2][1]);//0
		
		
		
		
		
		
		
		
		
	}

}
