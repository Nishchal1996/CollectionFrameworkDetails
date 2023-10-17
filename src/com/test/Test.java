package com.test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		System.out.println("Hello");
		
		 Object []array= new Object[10];
		 
		 
		 String str[]= new String[10];
		 str[0]="Hello";
		 
		 List<Integer> list=Arrays.asList(12,34,22,45,57,7,6,23,13);
		 list.forEach(c->System.out.println(c));
		 
		 
		 List<Integer> list2= list.stream().filter(c->c%2==0).sorted((a,b)->a.compareTo(b)).collect(Collectors.toList());
		 list2.forEach(System.out::println);
	}       
}