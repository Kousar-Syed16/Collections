package com.codegnan.collection;

import java.util.Set;
import java.util.TreeSet;

public class EmployeeMainTreeSetEx {

	public static void main(String[] args) {
		System.out.println();
		System.out.println("TreeSet Elements");
		System.out.println("====================");
		Set<Employee> treeSet = new TreeSet<Employee>(new EmployeeIdComparator());
		treeSet.add(new Employee(999, "kousar",17000, "hyd"));
		treeSet.add(new Employee(777, "nasima",27000, "bng"));
		treeSet.add(new Employee(111, "gazi",1000, "smga"));
		treeSet.add(new Employee(555, "hyder",7000, "mumbai"));
		treeSet.add(new Employee(222, "mujju",70000, "bng"));
		System.out.println(treeSet.add(new Employee(222, "sakina",47000, "delhi")));
		treeSet.add(new Employee(100, "zainu",16000, "chennai"));
//		System.out.println(hashSet);
		for(Employee emp:treeSet) {
			System.out.println(emp);
		}
		

	}

}
