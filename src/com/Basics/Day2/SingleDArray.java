package com.Basics.Day2;

public class SingleDArray {

	public static void main(String[] args)
	{
		// Using new keyword
		
		
		int sid[]=new int[4];
		sid[0]=10;
		sid[1]=20;
		sid[2]=30;
		sid[3]=40;
		
		System.out.println("Length of array is: "+sid.length);
		
		System.out.println(sid[2]);//30
		//System.out.println(sid[4]);//ArrayIndexOutOfBoundsException
		//all the elements of array --loop
		
		for(int i=0;i<sid.length;i++)
		{
			System.out.println(sid[i]);
		}
		
		System.out.println("******************************");
		
		String name[]=new String[3];
		name[0]="Kiran";
		name[1]="Smita";
		name[2]="Amit";
		
		System.out.println("Length is: "+name.length);
		
		for(int i=0;i<name.length;i++)
		{
			System.out.println(name[i]);
		}
		
		System.out.println("******************************");

		double marks[]=new double[2];
		marks[0]=67.77;
		marks[1]=89.66;
		
		System.out.println("length is: "+marks.length);
		
		for(int i=0;i<marks.length;i++)
		{
			System.out.println(marks[i]);
		}
		
		
		System.out.println("****************************");
		
		Object empdata[]=new Object[5];
		
		empdata[0]="Sarang";
		empdata[1]="Pune";
		empdata[2]=30;
		empdata[3]='M';
		empdata[4]=766554444L;
		
		for(int i=0;i<empdata.length;i++)
		{
			System.out.println(empdata[i]);
		}
				
		
		System.out.println("********************");
		
		//using literal way
		
		int id[]={101,102,103,104,105};
		System.out.println("length of array is: "+id.length);//5
		//System.out.println(id[3]);//104
		
		for(int i:id)
		{
			System.out.println(i);
		}
		
		System.out.println("********************");
		Object arr[]= {"Jay",20,'M',98887};
		
		for(Object i:arr)
		{
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
