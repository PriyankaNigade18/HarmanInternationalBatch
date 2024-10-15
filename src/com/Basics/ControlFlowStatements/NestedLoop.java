package com.Basics.ControlFlowStatements;

import java.util.Scanner;

public class NestedLoop {

	public static void main(String[] args)
	{
		// table of any number
		
		//int num=2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(num*i);
		}

		
		System.out.println("********************************");
		
		for(int no=1;no<=10;no++)
		{
			for(int i=1;i<=10;i++)
			{
				System.out.print(no*i+"\t");
			}
			System.out.println();
		}
			
		System.out.println("********************************");

		
		for(int r=1;r<=4;r++)
		{
			for(int c=1;c<=4;c++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
		
		System.out.println("********************************");

		
		
		for(int r=1;r<=4;r++)
		{
			for(int c=1;c<=r;c++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
