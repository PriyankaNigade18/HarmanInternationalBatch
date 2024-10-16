package com.OOP.Abstraction;

public abstract class AbstractClass 
{
	/*
	 * by default abstract class is not fully implemented so we can't create Object for the same
	 * Abstract class method is implemented by child class
	 * partial abstraction
	 */
	
	//implemented method
	public void accept()
	{
		System.out.println("Accept is fully implemented method from Abstract class");
	}
	
	//non implemented =abstract method
	public abstract void disply();
	

}
