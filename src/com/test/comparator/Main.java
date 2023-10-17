package com.test.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.test.pojos.Employee;

public class Main {
	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(121, "Nishchal", "Nagpur"));
		empList.add(new Employee(36, "Xyz", "Pune"));
		empList.add(new Employee(65, "Rocky", "Gurugram"));
		/*
		 * Thats how comparator used by passing particular  comparator for
		 * either ID,Name so you have choice for custom sorting
		 * first we sorted using empId
		 * second time we sorted using empName */	
		Collections.sort(empList, new EmployeeIdComparator());
		System.out.println(empList);
		
		Collections.sort(empList, new EmployeeNameComparator());
		System.out.println(empList);
	}
}
