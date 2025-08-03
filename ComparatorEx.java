package com.codegnan.collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class ComparatorEx {

	public static void main(String[] args) {
//		SortedSet<Integer>h = new TreeSet<>(new MyComparator());
//		h.add(10);
//		h.add(0);
//		h.add(15);
//		h.add(0);
//		h.add(20);
//		System.out.println(h);
////		SortedSet<String> h = new TreeSet<>();
		SortedSet<String> h = new TreeSet<>(new MyComparator());
		h.add("Roja");
		h.add("kaja");
		h.add("pooja");
		h.add("raja");
		h.add("raju");
		System.out.println(h);
	}

}
