package com.codegnan.collection;

import java.util.*;

public class RemoveDuplicates {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> originalList = new ArrayList<>();

		System.out.println("Enter integers one by one. Enter any non-numeric character to stop:");

		while (scanner.hasNext()) {
			if (scanner.hasNextInt()) {
				originalList.add(scanner.nextInt());
			} else {
				break;
			}
		}

		System.out.println("Original List:");
		for (int num : originalList) {
			System.out.print(num + " ");
		}
		System.out.println();

		LinkedHashSet<Integer> uniqueSet = new LinkedHashSet<>(originalList);

		System.out.println("List after removing duplicates:");
		for (int num : uniqueSet) {
			System.out.print(num + " ");
		}
		scanner.close();

	}

}
