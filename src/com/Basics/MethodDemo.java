package com.Basics;

public class MethodDemo 
{
	//Instance method -->Object to call that method
	public void accept()
	{
		System.out.println("This is instance method");
	}
	
	//static method--->1.With class name 2. Without class name (same class)
	public static void show()
	{
		System.out.println("This is static method");
	}
	

	public static void main(String[] args)
	{
		show();
		
		MethodDemo.show();
		
		MethodDemo m1=new MethodDemo();
		m1.accept();
		//The static method show() from the type MethodDemo should be accessed in a static way
		//m1.show();
			



	}

}
