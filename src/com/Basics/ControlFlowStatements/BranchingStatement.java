package com.Basics.ControlFlowStatements;

public class BranchingStatement {

	
	public String info()
	{
		String data="Information";
		return data;
	}
	public static void main(String[] args) 
	{
		/*
		 *  break:exit the control from loop and switch case
		 *  continue: to skip certain part of the code
		 *  return: to return any data/output from method
		 *  
		 */
		
		
		for(int i=1;i<=10;i++)
		{
			if(i>5)
			{
			break;
			}else
			{
				System.out.println(i);
			}
		}
		
		System.out.println("**********************");
		
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				continue;
			}else
			{
			System.out.println(i);
			}
		}
		
		BranchingStatement b1=new BranchingStatement();
		System.out.println( b1.info());
		String res=b1.info();
		System.out.println(res);
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
