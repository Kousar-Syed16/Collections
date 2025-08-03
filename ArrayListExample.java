package com.codegnan.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		List<Integer> a = new ArrayList<>();
		a.add(10);
		a.add(10);
		a.add(new Integer(20));
		a.add(null);
		a.add(50);
		a.add(null);
		System.out.println(a);
	}

}
