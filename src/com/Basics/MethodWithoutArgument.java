package com.Basics;

public class MethodWithoutArgument 
{

	public void add()//0 parameter method
	{
		int a=100,b=200;
		System.out.println("Addition is: "+(a+b));
		
	}
	
	public void sub(int a,int b)//2 parameter a=100 b=40
	{
		System.out.println("subtraction is: "+(a-b));
	}
	
	public static void main(String[] args)
	{
		/*
		 * When we are passing parameters at the time of calling that method
		 * then it is called compile time parameter passing!
		 */
		MethodWithoutArgument m1=new MethodWithoutArgument();
		m1.add();
		m1.sub(100,40);//compile time
		

	}

}
