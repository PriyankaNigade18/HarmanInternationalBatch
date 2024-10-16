package com.OOP.Abstraction;

//Multiple inheritance
public class NobleHs implements IMA,USMA
{

	
	public void medicalService()
	{
		System.out.println("NobleHs.....Medical()");
	}

	@Override
	public void detal() {
		System.out.println("NobleHs.....detal()");

		
	}

	@Override
	public void cardio() {
		System.out.println("NobleHs.....cardio()");
		
	}

	@Override
	public void nero() {
		System.out.println("NobleHs.....nero()");

		
	}

	@Override
	public void physio() {
		System.out.println("NobleHs.....physio()");

		
	}

	@Override
	public void covid19Test() {
		System.out.println("NobleHs.....Covid19Test()");

		
	}
}
