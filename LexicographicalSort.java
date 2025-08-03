package com.codegnan.collection;

import java.util.*;

public class LexicographicalSort {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> words = new ArrayList<>();

		System.out.println("Enter strings separated by space. Enter any non-alphabetic character to stop:");

		while (scanner.hasNext()) {
			String input = scanner.next();
			if (input.matches("[a-zA-Z]+")) {
				words.add(input);
			} else {
				break; 
			}
		}
		Collections.sort(words);

		for (String word : words) {
			System.out.print(word + " ");
		}
		scanner.close();
	}
}
