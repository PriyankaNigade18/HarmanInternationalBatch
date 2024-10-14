package com.Basics;

public class TypeCasting {

	public static void main(String[] args)
	{
		//Implicit[small--->large]
		
		int x=100;//4byte
		long l1=x;//8byte
		System.out.println("int to long conversion: "+l1);//100
		
		char ch='A';//2byte
		int y=ch;//4byte
		
		System.out.println("char to int conversion: "+y);//ascii 65
		
		int z=89;//4byte
		float f1=z;//4byte
		System.out.println("int to float conversion: "+f1);//89.0
		
		//Explicit casting operator(type)

		long l2=9999999L;//8byte
		int a=(int)l2;//4byte
		
		System.out.println("long to int conversion: "+a);
		
		double d1=98.77;
		int b=(int) d1;
		
		System.out.println("double to int conversion: "+b);
		
		
		
		
		
		
		
		
		
		
		
	}

}
