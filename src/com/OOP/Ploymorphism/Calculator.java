package com.OOP.Ploymorphism;

public class Calculator 
{
	/*
	 * Method Overloading 
	 * ====================
	 * When the method has same name and different signature
	 * 1.Number of arguments
	 * 2.Type of argument
	 * 3.Change order
	 */


	
	public void add(int a,int b)
	{
		System.out.println("Addition is: "+(a+b));
		
	}
	//number of argument
	public void add(int a,int b,int c)
	{
		System.out.println("Addition is: "+(a+b+c));
		
	}
	//type of argument
	public void add(double a,int b)
	{
		System.out.println("Addition is: "+(a+b));
	}
	
	//change order
	public void add(int a,double b)
	{
		System.out.println("Addition is: "+(a+b));
	}

	public static void main(String[] args)
	{
		Calculator c1=new Calculator();
		c1.add(100,900);
		c1.add(200.11,90);
		c1.add(200,600,90);
		c1.add(30,20.110);

	}

}
