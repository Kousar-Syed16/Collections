package com.codegnan.collection;

import java.util.PriorityQueue;

public class PersonMain {

	public static void main(String[] args) {
		PriorityQueue<Person> q = new PriorityQueue<>(new PersonComparator());
		q.offer(new Person(7, "gazi", "gazi@gmail.com"));
		q.offer(new Person(1, "hyder", "hyder@gmail.com"));
		q.offer(new Person(9, "nasima", "nasima@gmail.com"));
		q.offer(new Person(5, "kousar", "kousar@gmail.com"));
		q.offer(new Person(10, "mujju", "mujju@gmail.com"));
		q.offer(new Person(4, "zainu", "zainu@gmail.com"));
		q.offer(new Person(6, "sakina", "sakina@gmail.com"));
		System.out.println(q);
		for(Person p:q) {
			System.out.println(p);
		}
	}

}
