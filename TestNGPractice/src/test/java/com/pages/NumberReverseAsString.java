package com.pages;

public class NumberReverseAsString {

	public static void main(String[] args) {
		int num = 12345;
		String str = String.valueOf(num);
		String temp = "";
		for (int i = 0; i < str.length(); i++) {
			temp = str.charAt(i) + temp;
		}
		int int1 = Integer.parseInt(temp);
		System.out.println(int1);

	}

}
