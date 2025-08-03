package com.codegnan.collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class EmployeeMainLinkedSet {
	public static void main(String[] args) {
		System.out.println();
		System.out.println("Linked hash set elements");
		System.out.println("==============================");
		Set<Employee>linkedHashSet = new LinkedHashSet<Employee>();
		linkedHashSet.add(new Employee(999, "kousar",17000, "hyd"));
		linkedHashSet.add(new Employee(777, "nasima",27000, "bng"));
		linkedHashSet.add(new Employee(111, "gazi",1000, "smga"));
		linkedHashSet.add(new Employee(555, "hyder",7000, "mumbai"));
		linkedHashSet.add(new Employee(222, "mujju",70000, "bng"));
		System.out.println(linkedHashSet.add(new Employee(222, "sakina",47000, "delhi")));
		linkedHashSet.add(new Employee(100, "zainu",16000, "chennai"));
//		System.out.println(hashSet);
		for(Employee emp:linkedHashSet) {
			System.out.println(emp);
		}

	}

}
