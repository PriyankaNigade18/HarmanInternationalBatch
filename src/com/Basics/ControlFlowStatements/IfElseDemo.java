package com.Basics.ControlFlowStatements;

import java.util.Scanner;

public class IfElseDemo {

	public static void main(String[] args) {
		// true/false
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		
		if(num%2==0)
		{
			System.out.println(num+" is Even ");
			
		}else
		{
			System.out.println(num+" is Odd ");

		}
		
		
		
		
		/*
		System.out.println("Enter your age:");
		int age=sc.nextInt();
		
		if(age>=18)
		{
			System.out.println("Valid");
		}else
		{
			System.out.println("Invalid");
		}
		*/
		
		
		
		
	}

}
