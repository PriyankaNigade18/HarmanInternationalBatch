package com.Basics;

public class DataTypesDemo {

	public static void main(String[] args)
	{
		//boolean  true/false 1 bit
		boolean status=true;
		System.out.println("boolean data is: "+status);
		
		status=false;
		System.out.println("New updated status is: "+status);
		
		boolean newstatus=true;
		System.out.println("boolean data: "+newstatus);
		
		System.out.println("**************************");
		/*
		 * character char numeric-->2byte
		 * 1.To store single character
		 * 2.To store special character
		 * 3.To store ASCII value of any character
		 * 
		 * A to Z= 65 to 90
		 * a to z= 97 to 122
		 * 0 to 9= 48 to 57
		 * 
		 */
		
		char c1='A';
		System.out.println("Character data: "+c1);//A
		
		char c2='*';
		System.out.println("Character data : "+c2);//*
		
		char c3=68;//ascii 68 for character D
		System.out.println("Character data : "+c3);//D

		System.out.println("**********************");
		//Numeric--->Integral--->Integer
		//byte-->short-->int(default) --->long
		
		
		//byte 1byte -128 to 127
		byte b1=120;
		byte b2=125;
		byte b3=-126;
		System.out.println("Byte data: "+b1);
		System.out.println("Byte data: "+b2);

		System.out.println("Byte data: "+b3);

		//Type mismatch: cannot convert from int to byte
		//byte b4=-129;
		
		//short 2byte -32768 to 32767 
		short s1=32000;
		short s2=32767;
		System.out.println("short data : "+s1);
		System.out.println("short data : "+s2);
		//Type mismatch: cannot convert from int to short
		//short s3=50000;
			
		//int 4byte
		int i1=50000;
		System.out.println("int data is: "+i1);
		int i2=876654;
		System.out.println("int data is: "+i2);

		//The literal 9999999999 of type int is out of range 
		//int i3=9999999999;
		
		//long 8byte
		long l1=9999999999L;
		System.out.println("long data: "+l1);
		
		//Floating point
		//float 4byte  double 8byte(default)
		
		
		double d1=78.88;
		System.out.println("double data: "+d1);
		
		float f1=56.88F;
		System.out.println("float data: "+f1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
