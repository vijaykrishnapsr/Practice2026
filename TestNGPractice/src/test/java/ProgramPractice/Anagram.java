package ProgramPractice;

import java.util.Arrays;

public class Anagram {

	static String name = "silent";
	static String name1 = "listen";

	public void checkAnagram() {

		char[] charArray = name.toLowerCase().toCharArray();
		char[] charArray1 = name1.toLowerCase().toCharArray();

		Arrays.sort(charArray);
		Arrays.sort(charArray1);
		if (Arrays.equals(charArray, charArray1)) {

			System.out.println("Both the strings are Anagram");
		} else
			System.out.println("Both the strings are not Anagram");
	}
	
	public static void main(String[] args) {
		
		Anagram a = new Anagram();
		a.checkAnagram();
	}

}
