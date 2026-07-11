package com.pages;

public class StaticExample {

	static {

		System.out.println("static block");
	}

	public static void test() {

		System.out.println("static method");
	}

	public static void main(String[] args) {
		
	test();

	}

}
