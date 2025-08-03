package com.codegnan.collection;

import java.util.Comparator;

public class EmployeeIdComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
//		return Integer.compare(e1.id, e2.id);//id order
//		return e1.name.compareTo(e2.name);//naming order
//		return Double.compare(e1.salary, e2.salary);//salary order
		return e1.address.compareTo(e2.address);//address order		
	}
}
