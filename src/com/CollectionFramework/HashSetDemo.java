package com.CollectionFramework;

import java.util.HashSet;

public class HashSetDemo {
	
	/*
	 * Set is unordered collection
	 * duplication is not allowed
	 * HashSet is based on HashTable
	 */
	public static void main(String[] args)
	{
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(20);
		hs.add(40);
		hs.add(null);
		
		System.out.println(hs);
		
		hs.remove(null);
		System.out.println(hs);
		
		System.out.println(hs.size());
		
		for(Integer i:hs)
		{
			System.out.println(i);
		}
		
		
		

	}

}
