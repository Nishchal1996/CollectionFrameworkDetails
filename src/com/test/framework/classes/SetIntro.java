package com.test.framework.classes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetIntro {
	
	public static void main(String[] args) {
		
		/*
		 * Set interface is child interface of  Collection Interface
		 * If you want to create group of object with single entity but insertion order is not mandatory
		 * and if we don't want duplicates the we go for set interface. */
		
		Set<Integer> set1=new HashSet<>();
		set1.add(12);
		set1.add(13);
		set1.add(14);
		set1.add(15);
		set1.add(11);
		set1.add(17);
		set1.add(20);
		set1.add(21);
/*
 * If you add duplicate it will override latest value as internal working 
 * only one null can allow*/		
		System.out.println(set1);
//if we don't want duplicate but if we want insertion order to be preserved the we should go for SortedSet Interface.		
		SortedSet<Integer> set2=new TreeSet<Integer>();
		set2.add(15);
		set2.add(11);
		set2.add(17);
		System.out.println(set2);
		
		
	}

}
