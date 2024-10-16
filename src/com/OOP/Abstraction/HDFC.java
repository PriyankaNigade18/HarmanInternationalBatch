package com.OOP.Abstraction;

public class HDFC implements RBI
{
	
	public void custDetails()
	{
		System.out.println("HDFC.....Customer details()");
		System.out.println(x);
		//x=200;
	}

	@Override
	public void deposite() {

		System.out.println("HDFC......Deposite()");
		
	}

	@Override
	public void withdraw() {
		System.out.println("HDFC......Withdraw()");

		
	}

	@Override
	public void rateOfInterest() {
		System.out.println("HDFC.....rateOfInterest 8%");

		
	}
	
	

}
