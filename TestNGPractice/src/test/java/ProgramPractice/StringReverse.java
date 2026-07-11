package ProgramPractice;

public class StringReverse {

	public static void main(String[] args) {
		String name = "vijaykrishna";
		String temp = "";
		for (int i = name.length() - 1; i >=0; i--) {
			temp = temp + name.charAt(i);
		}
		System.out.println("reversed String = " + temp);
	}
}
