package com.OOP.Inheritance;


//final class Demo
class Demo
{
	final int price=20000;
	
	public final void productDetails()
	{
		System.out.println("Product name is IPad");
		System.out.println("Price is: "+price);
	}
}




public class FinalKeywrodDemo extends Demo
{

//	@Override
//	public void productDetails()
//	{
//		System.out.println("Product name is Mobile");
//		System.out.println("Price is: "+price);
//	}
	public static void main(String[] args) 
	{

		Demo d1=new FinalKeywrodDemo();
		d1.productDetails();
		//d1.price=30000;
		//d1.productDetails();

	}

}
