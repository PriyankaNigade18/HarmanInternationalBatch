package com.Basics;

public class WrapperClassDemo {

	public static void main(String[] args) 
	{
		//valueOf() primitive data --->Object(AutoBoxing)
		int x=100;
	
		Integer obj=Integer.valueOf(x);
		System.out.println(obj);

		float f1=89.77F;
		
		Float fobj=Float.valueOf(f1);
		System.out.println(fobj);
		
		
		//Object to primitive
		Integer i1=89;
		int var=i1.intValue();
		System.out.println(var);
		
		Character ch='A';
		char c1=ch.charValue();
		System.out.println(c1);
		
		
		
		
		
		
		
		
		
		
		
	}

}
