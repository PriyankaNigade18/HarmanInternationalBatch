package com.Basics.ControlFlowStatements;

import java.util.Scanner;

public class LadderIfDemo {

	public static void main(String[] args)
	{

		
		/*
		 * String equality
		 * ===================
		 * 1.equals(): exact match & its is case sensitive
		 * 2.equalsIgnoreCase(): exact match & it is case insensitive
		 
		
		String actPsw="Test123";
		String expPsw="test123";
		
		
		System.out.println(actPsw.equals(expPsw));//true-->false
		System.out.println(actPsw.equalsIgnoreCase(expPsw));//true-->true
		*/
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your browser name");
		String bname=sc.nextLine();
		if(bname.equals("chrome"))
		{
			System.out.println("Test Case is executing on "+bname);
		}else if(bname.equals("edge"))
		{
			System.out.println("Test Case is executing on "+bname);

		}else if(bname.equals("firefox"))
		{
			System.out.println("Test Case is executing on "+bname);

		}else
		{
			System.out.println("Invalid browser for test!");
		}
		
		
		
		
		
		
		
		
		
		

	}

}
