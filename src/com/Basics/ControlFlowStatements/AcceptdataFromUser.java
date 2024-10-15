package com.Basics.ControlFlowStatements;

import java.util.Scanner;

public class AcceptdataFromUser {

	public static void main(String[] args)
	{
		// dynamic data-scanner class
		
		System.out.println("Enter your name:");
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		System.out.println("Enter your phone number");
		long phno=sc.nextLong();
		System.out.println("Hello "+name);
		System.out.println("Your phone number is: "+phno);
		
		;

	}

}
