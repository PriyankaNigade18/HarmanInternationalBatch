package com.Basics.Day2;

public class BuilderPattern
{
	//this can used to return current class object from the method
	public BuilderPattern startBrowser()
	{
		System.out.println("Browser started!");
		return this;
		
	}
	
	public BuilderPattern runApp()
	{
		System.out.println("Application is Running");
		return this;
		
	}
	
	public void stopBrowser()
	{
		System.out.println("Browser stopped!");
	}

	public static void main(String[] args) 
	{
		BuilderPattern b1=new BuilderPattern();
		b1.startBrowser().runApp().stopBrowser();

	}

}
