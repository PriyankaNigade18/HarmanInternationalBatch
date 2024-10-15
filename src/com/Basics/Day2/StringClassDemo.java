package com.Basics.Day2;

public class StringClassDemo {

	public static void main(String[] args)
	{
		//literal
		String s1="Hello";//scp
		//String s2="Hello";
		
		//using new keyword
		String s3=new String("Hello");//heap
		
		/*
		 * == compares id provided by jvm
		 */
		//System.out.println(s1==s2);//true
		
		System.out.println(s1==s3);//false
		
		//String is immutable class
		
		s1=s1+"all";
		
		//System.out.println(s1==s2);//false
		
		
		System.out.println("*************************************");
		//Methods
		
		String ss1="Hello All";
		
		//length()
		System.out.println("Length of string: "+ss1.length());//9
		
		System.out.println(ss1.toUpperCase());
		System.out.println(ss1.toLowerCase());
		
		//charAt(index)--->char
		System.out.println(ss1.charAt(4));//o
		
		//indexOf('char')---->first occurrance character index
		System.out.println(ss1.indexOf('l'));//2
		
		/*
		 * equals()
		 * equalsIgnoreCase()
		 */
		
		String act="Selenium webDriver is webui automation library";
		String exp="Selenium webDriver is WEBUI automation library";
		
		System.out.println(act.equals(exp));//true--->false
		System.out.println(act.equalsIgnoreCase(exp));//true--->true
		
		//search/partial match -contains()
		
		System.out.println("Is act string contains WebUi?: "+act.contains("WebUi"));//false
	
		System.out.println("Is act string contains webui?: "+act.contains("webui"));//true
		
		//startsWith(prefix)
		System.out.println(act.startsWith("Selenium"));//true
		System.out.println(act.startsWith("Sel"));//true
		System.out.println(act.startsWith("S"));//true
		
		System.out.println(act.startsWith("selenium"));//false
		
		//endsWith(suffix)
		
		System.out.println(act.endsWith("library"));//true
		System.out.println(act.endsWith("ary"));//true
		
		System.out.println(act.endsWith("y"));//true
		System.out.println(act.endsWith("lib"));//false
		
		//concat()
		String ss2="Hi";
		String ss3="Bye";
		
		
		System.out.println(ss2+" "+ss3);
		
		System.out.println(ss2.concat(" "+ss3));
		
		
		
		//trim(): to ignore white space before and after the string
		String s4="     Welcome All       ";
		System.out.println(s4);
		
		System.out.println(s4.trim());
		
		//split(regexp):regular expression we use for pattern matching
		String tools="Selenium,Appium,Postman,Jmeter";
		System.out.println(tools);
		String arr[]=tools.split(",");
		
		for(String i:arr)
		{
			System.out.println(i);
		}
		
		
		System.out.println(tools.split(",")[3]);
		
		String date="Oct 2024";
		String month=date.split(" ")[0];
		String year=date.split(" ")[1];		
		
		System.out.println("Month is: "+month);
		System.out.println("year is: "+year);
		
		//isEmpty()- if length is 0
		String s5=" ";
		
		System.out.println(s5.isEmpty());//true-->false
		System.out.println(s5.isBlank());//true-- true
		
		//String act="Selenium webDriver is webui automation library";
		
		System.out.println(act.substring(8));
		System.out.println(act.substring(9,17));
		
		System.out.println(act.replace('e','*'));
		System.out.println(act.replace("Se", "We"));
		
		String s6="TestNg is unit testing framework";
		char ch[]=s6.toCharArray();
		
		for(char i:ch)
		{
			System.out.println(i);
		}
		
		/*
		 * StringBuffer(thread safe) and StringBuilder(not thread safe) class
		 * -both are mutable
		 * 
		 * -using new keyword
		 */
		
		StringBuilder b1=new StringBuilder("Hello");
		
		b1.append(" All");
		
		System.out.println(b1);
		System.out.println(b1.reverse());
		
		
		//String reverse
		String data="Selenium WebDriver";
		String res="";
		
		for(int i=data.length()-1;i>=0;i--)
		{
			res=res+data.charAt(i);
		}
		
		System.out.println(res);
		
		StringBuilder br=new StringBuilder(data);
		System.out.println(br.reverse());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
