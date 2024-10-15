package com.OOP.Inheritance;

public class AccessModifierTest 
{
	int id=101;
	public String name="Amit";
	private long phno=9888776L;
	protected int acno=777777;
	

	public static void main(String[] args)
	{
		//same class
		AccessModifierTest a1=new AccessModifierTest();
		System.out.println(a1.id);
		System.out.println(a1.name);
		System.out.println(a1.phno);
		System.out.println(a1.acno);

	}

}
