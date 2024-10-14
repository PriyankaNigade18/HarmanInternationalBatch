package com.Basics;

public class ParameterPassingwithReturn 

{
	public int add(int a,int b)//a=100 b=300
	{
		return a+b;//value will return to calling function
	}

	public static void main(String[] args) 
	{
		ParameterPassingwithReturn p1=new ParameterPassingwithReturn();
		//calling 
		int res=p1.add(100,300);
		System.out.println(res);
	}

}
