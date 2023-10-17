package com.test.collection.utilityClasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionUtitlityClasses {
	public static void main(String[] args) {
		/*
There Is Two utility class provide by Collection framework
1.Collections
2.Arrays

which provide some utility method for betterment to play with collection Object

 
*/
		List<Integer> list1=new ArrayList<>();
		list1.add(12);
		list1.add(45);
		list1.add(38);
		list1.add(53);
		
//this is a utitlity method provided by Collections class which sorted that particular list 
		Collections.sort(list1);
//if we want to create immutable list like an array the we3 use Arrays class's method i.e asList
		
		List<Integer> list2=Arrays.asList(12,34,76,98,45,33);
		//we cant add  it will give UnsupportedOperationException
		//list2.add(23); ,list2.remove(0);
		//but here is check we can set value externally , so it is not fully immutable.
		list2.set(0, 13);
		System.out.println(list2);
	}
}
