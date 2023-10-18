package com.test.framework.classes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListIntro {
	public static void main(String[] args) {
		
		/*
		 * List Interface is child of Collection interface
		 * ArrayList ,LinkedList,Vector and stack implements List Interface
		 * Insertion order preserved 
		 * Duplicates are allowed */
		
		List<Integer> list1=new ArrayList<>();
		list1.add(12);
		list1.add(17);
		list1.add(12);
		list1.add(21);
		list1.add(16);
//insertion ordered preserved and duplicates are allowed.		
		System.out.println(list1);
		
		List<Integer> list2 =new LinkedList<>();
		list2.add(12);
		list2.add(24);
		list2.add(12);
		list2.add(37);
		System.out.println(list2);

		/*
Linked List is used to manipulate data  faster than ArrayList()
It uses Doubly Linked List internally where array list internally uses dynamic array.
*/	
		
	}

}
