package com.codegnan.collection;

import java.util.HashSet;

public class SetExample {

	public static void main(String[] args) {
		HashSet h = new HashSet();
		h.add(10);
		h.add("kousar");
		h.add(null);
		System.out.println(h.add(10));
		h.add(20);
		h.add(null);
		System.out.println(h);

	}

}
