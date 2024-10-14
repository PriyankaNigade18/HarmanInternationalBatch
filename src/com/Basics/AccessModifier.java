package com.Basics;

public class AccessModifier
{
	int id=101;//default
	public String name="Sarang";
	private long phno=9987777665L;
	

	public static void main(String[] args) 
	{
		System.out.println("Same class");
		AccessModifier a1=new AccessModifier();
		System.out.println(a1.id);
		System.out.println(a1.name);
		System.out.println(a1.phno);



	}

}
