package com.codegnan.collection;

import java.util.Comparator;

public class MyComparator implements Comparator{
	public int compare(Object obj1, Object obj2) {
//		Integer i1 = (Integer)obj1;
//		Integer i2 = (Integer)obj2;
//////		
////		if(i1<i2) {
////			return +100;
////		}else {
////			if(i1>i2) {
////				return -10;
////			}else {
////				return 0;
////			}
////		}
//		return i2.compareTo(i1);
		
		String s1 = obj1.toString();
		String s2 = obj2.toString();
		return s2.compareTo(s1);
	}

}
