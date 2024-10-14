package com.Basics;

public class WrapperClassDemo2 {

	public static void main(String[] args) 
	{
		String s1="100";
		System.out.println(s1+100);//100100
		//NumberFormatException: For input string: "100AB"
		int num=Integer.parseInt(s1);
		System.out.println(num+100);//200
		
		String s2="56.77";
		System.out.println(s2+11.11);//56.7711.11
		double d1=Double.parseDouble(s2);
		System.out.println(d1+11.11);
		
		
		String s3="Kiran";
		char ch=s3.charAt(2);
		System.out.println(ch);
		
		
	}

}
