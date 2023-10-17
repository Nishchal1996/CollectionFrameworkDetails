package com.test.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.test.pojos.Student;

public class StudentComparable {

	public static void main(String[] args) {
		
		List<Integer> intList=new ArrayList<>();
		intList.add(12);
		intList.add(33);
		intList.add(8);
		intList.add(25);
		
		System.out.println(intList);
		Collections.sort(intList);
		System.out.println(intList);
		
		/*
		 * here we can sort simple Integer by using Utility class Collections method as above 
		 * But if you try Object Type List it will Give Error  Collections.sort(StudentObject); 
		 * because It can't decide on what field it will sort. so we have to use comparable as below
		 * Comparable gives default sorting order, only one sorting order
		 */	
		List<Student> studentList=new ArrayList<Student>();
		studentList.add(new Student(121, "Nishchal", "Pune"));
		studentList.add(new Student(43, "Qwerty", "Nagpur"));
		studentList.add(new Student(25, "Abs", "Bhandara"));
		Collections.sort(studentList);
		System.out.println(studentList);
		
	}
}
