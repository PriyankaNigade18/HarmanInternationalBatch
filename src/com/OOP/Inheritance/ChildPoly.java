package com.OOP.Inheritance;

public class ChildPoly extends ParentPoly 
{
	@Override
	public void color()
	{
		System.out.println("Yellow");
	}
 

	public static void main(String[] args)
	{
	//child class ref and child class object
		ChildPoly c1=new ChildPoly();
		c1.color();//yellow
		
		//parent class ref and parent class object
		ParentPoly p1=new ParentPoly();
		p1.color();//Red
		
		//Parent class ref and child class Object
		ParentPoly p2=new ChildPoly();
		p2.color();//Yellow
		
		
		
		

	}

}
