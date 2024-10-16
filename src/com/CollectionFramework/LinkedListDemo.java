package com.CollectionFramework;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args)
		{
		LinkedList<Integer> ls=new LinkedList<Integer>();
		ls.add(100);
		ls.add(200);
		ls.add(300);
		ls.add(400);
		ls.add(200);
		
		System.out.println(ls);
		System.out.println("Total Elements: "+ls.size());
		
		ls.addFirst(1000);
		ls.addLast(2000);
		
		System.out.println(ls);
		
		System.out.println(ls.get(3));
	}

}
