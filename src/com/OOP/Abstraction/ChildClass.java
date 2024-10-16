package com.OOP.Abstraction;

public class ChildClass extends AbstractClass
{

	@Override
	public void disply()
	{

		System.out.println("Display() implemented by child class");
		
	}
	
	public static void main(String[] args) 
	{
		
		System.out.println("Scenario1: child class ref and child class object: Parent+child");
		ChildClass c1=new ChildClass();
		c1.accept();//inherited
		c1.disply();//inherited abstract 
		
		System.out.println("Scenario2:Parent class ref and Parent class object: Invalid");
		//AbstractClass a1=new AbstractClass();//Cannot instantiate the type AbstractClass
		
		System.out.println("Scenario3:Parent class ref and child class object: Parent");
		
		AbstractClass a1=new ChildClass();
		a1.accept();
		a1.disply();
		


	}

	

}
