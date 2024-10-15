package com.Basics.ControlFlowStatements;

import java.util.Scanner;

public class SimpleIf {

	public static void main(String[] args)
	{
		//only for one true condition
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();
		if(age>=18)
		{
			System.out.println("Age is valid!");
		}

		System.out.println("done!");
	}

}
