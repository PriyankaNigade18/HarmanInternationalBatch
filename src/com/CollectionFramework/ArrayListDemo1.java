package com.CollectionFramework;

import java.util.ArrayList;

public class ArrayListDemo1 {

	public static void main(String[] args)
	{
		/*
		 * ArrayList is class implement List interface
		 * Underline data structure is Dynamic Array
		 * Frequent operation is data retrieval 
		 * 
		 * default capacity is 10 virtual segment
		 * 
		 */
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		System.out.println("Is List empty?: "+al.isEmpty());//true
		al.add(100);
		al.add(20);
		al.add(500);
		al.add(10);
		al.add(100);
		al.add(500);
		
		System.out.println(al);
		
		System.out.println("Total elements: "+al.size());
		
		//serach
		System.out.println("Is 50?: "+al.contains(50));
		
		//remove
		al.remove(2);
		
		System.out.println(al);
		
		//add 700 at 2nd index position
		al.add(2,700);
		
		System.out.println(al);
		
		//al.clear();
		
		System.out.println(al);//[]
		System.out.println(al.size());//0
		
	System.out.println("*****Iteration*************");
	for(Integer i:al)
	{
		System.out.println(i);
	}
		
		System.out.println("***************************************");
		
		ArrayList<String> loc=new ArrayList<String>();
		loc.add("Mumbai");
		loc.add("pune");
		loc.add("Delhi");
		
		System.out.println("Total locations: "+loc.size());
		System.out.println(loc);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
