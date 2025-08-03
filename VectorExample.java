package com.codegnan.collection;

import java.util.List;
import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
		List<Student> student = new Vector<>();
		student.add(new Student(111, "kousar", 101));
		student.add(new Student(222, "gazi", 102));
		student.add(new Student(333, "hyder", 103));
		student.add(new Student(444, "sakina", 104));
		System.out.println(student);
		System.out.println(student.remove(new Student(111, "kousar", 101)));
		System.out.println(student);
		student.add(1, new Student(111, "kousar", 101));
		System.out.println(student);
		System.out.println(student.set(1, new Student(555, "nasima", 105)));
		System.out.println(student);
		student.addFirst(new Student(555, "kousar", 105));
		System.out.println(student);
		System.out.println(student.getFirst());
		System.out.println(student.getLast());
	}
}
