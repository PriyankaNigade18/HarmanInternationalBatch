package com.OOP.Inheritance;

public class Child extends Parent
{
	int cid=201;
	
	public void childIncome()
	{
		System.out.println("Parent id is: "+super.pid);
		super.parentIncome();
		System.out.println("Child id is: "+cid);
		System.out.println("Child income is $11000");
	}

	public Child()
	{
		super();
		System.out.println("This is child default constructor.....");
	}
	public static void main(String[] args) 
	{

		Child  c1=new Child ();
		c1.childIncome();

	}

}
