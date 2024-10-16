package com.CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		System.out.println("Is List empty?: "+al.isEmpty());//true
		al.add(100);
		al.add(20);
		al.add(500);
		al.add(10);
		al.add(100);
		al.add(500);
		
		
		System.out.println("**********for loop***********");
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		System.out.println("**********for each loop***********");

		for(Integer i:al)
		{
			System.out.println(i);
		}
		
		System.out.println("**********iterator()***********");
		/*
		 * Iterator is interface
		 * hasNext(): Returns true if the iteration has more elements
		 * next():Returns the next element in the iteration.
		 * 
		 */
		Iterator<Integer> ir=al.iterator();
		while(ir.hasNext())
		{
			System.out.println(ir.next());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
	}

}
