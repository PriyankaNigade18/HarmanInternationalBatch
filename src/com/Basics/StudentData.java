package com.Basics;

public class StudentData
{
	//data
	int id;
	String name;
	
	//methods
	public void display()
	{
		System.out.println("Student id is: "+id);
		System.out.println("student name is: "+name);
	}
	
	public static void main(String[] args)
	{
		/*
		 * To call anything from class we need Object of that class
		 */
		
		
		StudentData s1=new StudentData();
		
		//s1.display();//default data
		s1.id=101;
		s1.name="Amit";
		s1.display();//data
		//System.out.println(s1.id);//101
		
		System.out.println("************************");
		StudentData s2=new StudentData();
		s2.id=102;
		s2.name="Kiran";
		s2.display();
		
		
		
		


	}

}
