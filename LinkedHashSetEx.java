package com.codegnan.collection;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedHashSetEx {

	public static void main(String[] args) {

		LinkedHashSet h = new LinkedHashSet();
		h.add(10);
		h.add("kousar");
		h.add(null);
		h.add(10);
		h.add(20);
		h.add(null);
		System.out.println(h);

	}

}
