package com.Basics.ControlFlowStatements;

import java.util.Scanner;

public class SwitchCaseDemo {

	public static void main(String[] args)
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your envrionment");
		String env=sc.nextLine();	
		//Key==value
		switch (env.toLowerCase())
		{
		case "dev":
			System.out.println("Test Case is executing into development Env.");
			break;//exit from switch body
			
		case "qa":
			System.out.println("Test Case is executing into QA Env.");
			break;
			
		case "stage":
			System.out.println("Test Case is executing into stage Env.");
			break;
			
		case "prod":
			System.out.println("Test Case is executing into prod Env.");
			break;
			
		default:
			System.out.println("Wrong Env!");
			break;
		}

	}

}
