package com.Basics.Day2;

public class MethodChaning 
{

	public void m1()
	{
		System.out.println("M1 is calling!");
		m2();
	}
	
	public void m2()
	{
		System.out.println("M2 is calling!");
		m3();
		
	}
	
	public void m3()
	{
		System.out.println("M3 is calling!");
		//m1();//deadlock
	}
	public static void main(String[] args)
	{
		MethodChaning obj=new MethodChaning();
	
		obj.m1();
		
	}

}
