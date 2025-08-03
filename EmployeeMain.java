package com.codegnan.collection;

import java.util.HashSet;
import java.util.Set;

public class EmployeeMain {

	public static void main(String[] args) {
		Set<Employee>hashSet = new HashSet<Employee>();
		hashSet.add(new Employee(999, "kousar",17000, "hyd"));
		hashSet.add(new Employee(777, "nasima",27000, "bng"));
		hashSet.add(new Employee(111, "gazi",1000, "smga"));
		hashSet.add(new Employee(555, "hyder",7000, "mumbai"));
		hashSet.add(new Employee(222, "mujju",70000, "bng"));
		System.out.println(hashSet.add(new Employee(222, "sakina",47000, "delhi")));
		hashSet.add(new Employee(100, "zainu",16000, "chennai"));
//		System.out.println(hashSet);
		for(Employee emp:hashSet) {
			System.out.println(emp);
		}

	}

}
