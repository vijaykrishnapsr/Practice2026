package ProgramPractice;

public class Palindrome {

	public static void main(String[] args) {

		String name = "Malayalam";

		String rev = "";

		for (int i = 0; i < name.length(); i++) {
			rev = name.charAt(i) + rev;

		}
		if (name.toLowerCase().equals(rev.toLowerCase())) {
			System.out.println(name + " is a palindrome string");
		} else
			System.out.println(name + " is not a palindrome string");

	}

}
