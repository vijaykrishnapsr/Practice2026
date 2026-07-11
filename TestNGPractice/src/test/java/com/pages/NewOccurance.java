package com.pages;

public class NewOccurance {

	public static void main(String[] args) {
//		String name = "vijaya";
//		char ch = 'a';
//		String var = Character.toString(ch);
//		String replace = name.replace(var, "");
//		int occurance = (name.length())-(replace.length());
//		System.out.println(occurance);
		
		int count1 = 0;
		for (int i = 0; i <= 100; i++) {

			int count = 0;

			for (int j = 1; j <= i; j++) {

				if (i % j == 0) {
					count++;
				}

			}

			if (count == 2) {
				count1++;
				System.out.println(i + " " + "is a prime number");
			}

		}

		System.out.println("Total nuber of prime numbers = " + count1);

	}

}
