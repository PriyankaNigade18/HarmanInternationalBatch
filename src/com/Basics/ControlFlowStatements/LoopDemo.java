package com.Basics.ControlFlowStatements;

public class LoopDemo {

	public static void main(String[] args)
	{
		//Print Hello statement 5 time
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hello");
		}
		
		System.out.println("***********************");
		//print numbers 1 to 10
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
		
		System.out.println("***********************");

		for(int i=10;i>=1;i--)
		{
			System.out.println(i);
		}
		
		System.out.println("***********************");
		//print upto 25 all even number
		
		for(int i=1;i<=25;i++)
		{
			if(i%2==0)
			{
				System.out.println("Even Number: "+i);
			}
		}
		
		
		System.out.println("***********************");
		//while loop
		
		int i=1;
		
		while(i<=10)
		{
			System.out.println("Welcome");
			i++;
			
		}
		
//		for(;;)//default condition is true
//		{
//			System.out.println("Hi");
//		}
		
		
		//accept number from the user and sum of digits num=123  1+2+3=6
		
		int num=123,r,sum=0;
		while(num>0)
		{
			r=num%10;
			num=num/10;
			sum=sum+r;
		}
		
		System.out.println("Sum of digits for 123 are: "+sum);
		
		
		
		
		
		System.out.println("**********************************");
		
		//do while
		
		int k=1;
		
		do
		{ System.out.println("Hi");
			k++;
		}while(k<=10);
		
		
		System.out.println("**********************************");
		//Reverse any number
		int no=1234,rem,res=0;
		
		while(no>0)
		{
			rem=no%10;
			no=no/10;
			res=res*10+rem;
		}
		
		
		System.out.println("For 1234 Reverse number is: "+res);
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
	}

}
