package com.Basics.Day2;

public class ConstructorDemo1
{
	int id;
	String name;
	
	//default constructor
	public ConstructorDemo1()
	{
		System.out.println("This is default constructor");
		System.out.println(id);//0
		System.out.println(name);//null
		
	}
	
//	public ConstructorDemo1(int i,String n)//local variable
//	{
//		id=i;
//		name=n;
//		
//	}
	
	
	public ConstructorDemo1(int id,String name)//local
	{
		//difference between local variable and instance variable
		this.id=id;
		this.name=name;
		//this keyword: refer current class object
	}
	public void show()
	{
		System.out.println("id is: "+id);
		System.out.println("name is: "+name);
	}
	
	public static void main(String[] args) 
	{
		ConstructorDemo1 c1=new ConstructorDemo1();
		
		ConstructorDemo1 c2=new ConstructorDemo1(101,"Kiran");
		
		c2.show();


	}

}
