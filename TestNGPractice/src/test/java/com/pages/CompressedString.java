package com.pages;

public class CompressedString {

	public static void main(String[] args) {
		String input = "aaabbc";
		String output = "";
		int count = 1;
		for (int i = 0; i < input.length(); i++) {

			if (i < input.length() - 1 && input.charAt(i) == input.charAt(i + 1)) {
				count++;

			} else {

				output = output + input.charAt(i) + count;
				count = 1;
			}

		}
		System.out.println(output);

	}

}
