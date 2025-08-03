package com.codegnan.collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class Assignment1 {

	public static void main(String[] args) {
		SortedSet<String> h = new TreeSet<>(new MyComparator1());
		h.add("apple");
		h.add("dog");
		h.add("bat");
		h.add("banana");
		h.add("cat");
		h.add("ant");
		h.add("an");
		h.add("zebra");
		System.out.println(h);

	}

}
