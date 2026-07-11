package com.pages;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateNumbers {

	public static void main(String[] args) {
		int numbers[] = { 22, 5, 10, 6, 7, 22, 8, 7, 10 };
		int count = 0;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] == numbers[j]) {
					System.out.println(numbers[i]);
					count++;
				}

			}

		}
		System.out.println("Total number of duplicates are = " + count);

		// using Map

		HashMap<Integer, Integer> map = new HashMap<>();
		for (int num : numbers) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		Set<Entry<Integer, Integer>> entrySet = map.entrySet();
		int counts=0;
		for (Entry<Integer, Integer> entry : entrySet) {
			
			if (entry.getValue() > 1) {
				System.out.println(entry);
			counts++;}
		}
		System.out.println("Total number of duplicates are = " + counts);

	}
}
