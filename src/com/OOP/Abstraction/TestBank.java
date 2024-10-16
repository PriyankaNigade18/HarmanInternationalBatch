package com.OOP.Abstraction;

public class TestBank {

	public static void main(String[] args) 
	{

		//RBI r1=new RBI();
		
		//child ref and child object
		HDFC h1=new HDFC();
		h1.custDetails();//individual
		h1.deposite();//inherited abstract 
		h1.withdraw();//inherited abstract 
		h1.rateOfInterest();//inherited abstract 
		
		System.out.println("****************************");
		//parent ref and child object
		RBI r1=new HDFC();
		r1.deposite();
		r1.withdraw();
		r1.rateOfInterest();
		

	}

}
