package com.codegnan.collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class CompareToEx {

	public static void main(String[] args) {
		SortedSet<Integer> h = new TreeSet<>();
		h.add(10);//[10]
		h.add(0);//obj1.compareTo(obj2);-->0.compareTo(10);//-ve[0,10]
		h.add(15);//15.compareTo(0);+ve[0,15,10]
		h.add(10);//10.compareTo(15);-->+ve[0,10,15]
		h.add(0);//0.compareTo(0);-->//0[0,10,15]
		h.add(20);//20.compareTo(10)-->+ve[0,20,10,15]
		//-->+ve[0,10,20,15]
		
		System.out.println(h);
		
		

	}

}
