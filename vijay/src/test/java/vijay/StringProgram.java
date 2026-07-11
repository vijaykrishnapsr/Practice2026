package vijay;

public class StringProgram {

	public static void main(String[] args) {

		String s = "malayalam";

		String temp = "";

		for (int j = s.length() - 1; j >= 0; j--) {

			temp = temp + s.charAt(j);
		}
		System.out.println("Reversed string is : " + temp);

		if (s.equals(temp)) {
			System.out.println(s + " - is a Palindrom String");
		} else {
			System.out.println(s + " - is not a Palindrome String");
		}
	}

}
