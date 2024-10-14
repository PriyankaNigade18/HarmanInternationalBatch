package com.Basics;

public class VariableDemo
{
	int id=101;//instance variable
	
	/*
	 * instance variable always get new memory form every new object 
	 */

	static String cname="AISSPMS";
	/*
	 * static gets one time memory and same memory will shared with all object
	 */
	
	public void show()
	{
		int marks=90;//local variable
		System.out.println("Id is: "+id);
		System.out.println("College name is: "+cname);
		System.out.println("marks from show(): "+marks);
	}
	
	
	
	public static void main(String[] args)
	{
		VariableDemo v1=new VariableDemo();

		v1.show();
		
		int marks=100;//local
		System.out.println("marks from main(): "+marks);//100
		
		System.out.println("Id is: "+v1.id);
		
		System.out.println("College name is: "+cname);


	}

}
