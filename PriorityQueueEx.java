package com.codegnan.collection;

import java.util.PriorityQueue;

public class PriorityQueueEx {

	public static void main(String[] args) {
		PriorityQueue<Integer> q = new PriorityQueue<>();
		q.offer(20);
		q.offer(3);
		q.offer(8);
	
		q.offer(10);
		q.offer(1);
		q.offer(7);
		q.offer(27);
		System.out.println(q);

	}

}
