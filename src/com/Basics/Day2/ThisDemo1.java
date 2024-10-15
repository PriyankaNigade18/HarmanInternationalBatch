package com.Basics.Day2;

public class ThisDemo1
{
	public void startBrowser()
	{
		System.out.println("Browser started!");
		this.runApp();
	}
	
	public void runApp()
	{
		System.out.println("Application is Running");
		stopBrowser();
	}
	
	public void stopBrowser()
	{
		System.out.println("Browser stopped!");
	}

	public static void main(String[] args) 
	{
		ThisDemo1 t1=new ThisDemo1();
		t1.startBrowser();

	}

}
