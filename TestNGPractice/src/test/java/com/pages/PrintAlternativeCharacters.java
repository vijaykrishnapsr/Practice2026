package com.pages;

public class PrintAlternativeCharacters {

	public static void main(String[] args) {
		String name = "vijayakrishnamoorthy";
		for (int i = 0; i < name.length(); i += 2) {
			System.out.print(name.charAt(i));

		}

	}

}
