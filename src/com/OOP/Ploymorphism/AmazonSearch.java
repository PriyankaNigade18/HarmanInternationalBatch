package com.OOP.Ploymorphism;

public class AmazonSearch 
{
	
	public void search(String pname)
	{
		System.out.println("Product serach by its name: "+pname);
	}
	
	public void search(int price)
	{
		System.out.println("Product serach by its price: "+price);
	}

	public void search(String pname,int price)
	{
		System.out.println("Product serach by its name: "+pname+" & search by its price: "+price);
	}
	
	public void search(String pname,String bname)
	{
		System.out.println("Product serach by its name: "+pname+" & search by its brand name: "+bname);
	}
	
	public void search(int price,String bname)
	{
		System.out.println("Product serach by its price: "+price+" & search by its brand name: "+bname);
	}
	
	public void search(String pname,int price,String bname)
	{
		System.out.println("Product serach by its name: "+pname+" & search by its price: "+price+"& search by its brand name: "+bname);
	}
}
