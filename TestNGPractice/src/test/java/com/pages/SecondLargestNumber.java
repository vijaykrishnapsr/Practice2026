package com.pages;

import java.util.Arrays;
import java.util.NavigableSet;
import java.util.TreeSet;

public class SecondLargestNumber {

	public static void main(String[] args) {

		int[] arr = { 10, 50, 30, 80, 60};
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for (int num : arr) {

			if (num > largest) {
				secondLargest = largest;
				largest = num;

			} else if (num > secondLargest && num != largest) {

				secondLargest = num;

			}

		}
		System.out.println("First Largest Number is = " + largest);
		System.out.println("Second Largest Number is = " + secondLargest);

		// Using Arrays.sort method (But it won't work when duplicate numbers are present in the input)

		Arrays.sort(arr);
		System.out.println(arr);
		System.out.println("Second largest number is = " + arr[arr.length -2]);

		// using Treeset

		TreeSet<Integer> tree = new TreeSet<Integer>();
		tree.add(10);
		tree.add(30);
		tree.add(50);
		tree.add(40);
		tree.add(60);
		tree.add(20);
        
		System.out.println(tree);
		System.out.println("Second largest number = " + tree.lower(tree.last()));
		System.out.println("Third largest number = " + tree.lower(tree.lower(tree.last())));
		System.out.println("First number is = " + tree.first());
		System.out.println("" + tree.reversed());
		NavigableSet<Integer> reversed = tree.reversed();
		System.out.println(reversed.getFirst());
		System.out.println("Higher than 20 is = " + tree.higher(20));
		System.out.println("Lower than 20 is = " + tree.lower(20));
		System.out.println("Higher than or equal to 15 is = " + tree.ceiling(15));
		System.out.println("Lower than or equal to 35 is = " + tree.floor(35));
		System.out.println(tree.ceiling(10));
	}
}
