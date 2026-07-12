package com.pages;

import java.util.Scanner;

public class ScannerClass {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter input text - ");
		String nextLine = input.nextLine();
		System.out.println("User entered message is - " + nextLine);
		System.out.println("Enter a String - ");
		String str = input.next();
		System.out.println("Entered String is - " + str);
		
	}

}
