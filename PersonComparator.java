package com.codegnan.collection;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {

	@Override
	public int compare(Person p1, Person p2) {
//		return p1.name.compareTo(p2.name);//naming sorted order
//		return Integer.compare(p1.id, p2.id);//following id sorted order
		return p1.email.compareTo(p2.email);//following email sorted order
	}

}
