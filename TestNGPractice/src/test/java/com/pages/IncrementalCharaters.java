package com.pages;

public class IncrementalCharaters {

	public static void main(String[] args) {

		String input = "vijay";
		
		for (int i = 0; i < input.length(); i++) {

			for (int j = 0; j <= i; j++) {

				System.out.print(input.charAt(i));
			}
		}

	}

}
