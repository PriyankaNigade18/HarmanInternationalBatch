package com.OOP.Inheritance;

class A
{
	public void m1()
	{
		System.out.println("M1 is calling !");
	}
}

class B extends A//A is parent and B is child-Single level
{
	public void m2()
	{
		System.out.println("M2 is calling !");
	}
}



public class InheritanceDemo {

	public static void main(String[] args)
	{

		System.out.println("Scenario1: child class ref and child class object->all Parent+child");
		B b1=new B();
		b1.m1();//inherited method
		b1.m2();//individual method
		
		
		System.out.println("Scenario2: Parent class ref and parent class object->parent");
		A a1=new A();
		a1.m1();//individual
		
		System.out.println("Scenario3: Parent class ref and child class object->parent");
		
		A a2=new B();
		a2.m1();//individual
		
		System.out.println("Scenario4: child class ref and parent class object->Invalid ");
		
		//B b2=new A();

		
		
		
		
		
		

		
		
		


	}

}
