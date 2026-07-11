package com.pages;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String s1 = "Listen";
		String s2 = "silent";
		char[] charArray1 = s1.toLowerCase().toCharArray();
		char[] charArray2 = s2.toLowerCase().toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		if (Arrays.equals(charArray1, charArray2)) {

			System.out.println("The Given strings are Anagram");
		} else
			System.out.println("The Given strings are Anagram");
	}

}
