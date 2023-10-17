package com.test.comparator;

import java.util.Comparator;

import com.test.pojos.Employee;

public class EmployeeIdComparator implements Comparator<Employee> {
	/*  
	 * For Employee PoJo we use comparator 
	 * Comparator gives us custom Sorting  order 
	 * we have to inherit compare method n provide aspects for sorting as below
	 * 
	 * */
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getEmpId()-o2.getEmpId();
	}

	
}
