package com.Basics.Day2;

public class ThisDemo2 {

	
	public ThisDemo2()
	{
		this("Hi");
		System.out.println("This is default constaructor");
	}
	
	
	public ThisDemo2(String msg)
	{
		//this();//default constructor of current class
		System.out.println("This is Paramerterized constaructor: "+msg);
	}
	
	public static void main(String[] args)
	{
		//ThisDemo2 t1=new ThisDemo2("Hello");
		ThisDemo2 t1=new ThisDemo2();

	}

}
