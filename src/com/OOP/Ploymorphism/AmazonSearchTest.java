package com.OOP.Ploymorphism;

public class AmazonSearchTest {

	public static void main(String[] args) {

		AmazonSearch a1=new AmazonSearch();
		a1.search(10000);
		a1.search("ipad");
		a1.search(80000,"iphone");
		a1.search("watch", 50000);
		a1.search("bag","zara");
		a1.search("laptop",80000,"Hp");

	}

}
