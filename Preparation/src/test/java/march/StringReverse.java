package march;

public class StringReverse {

	public static void main(String[] args) {

		// Reverse string by each word without changing its position

		String name = "Vijaya Krishna Moorthy";
		String[] split = name.split(" ");
		for (String word : split) {
			for (int i = word.length() - 1; i >= 0; i--) {
				System.out.print(word.charAt(i));
			}
			System.out.print(" ");
		}

		System.out.println();
		// ----------------------------------------------------------------
		// Reverse the whole string
		String temp2 = "";
		for (int j = name.length() - 1; j >= 0; j--) {

			temp2 = temp2 + name.charAt(j);
		}
		System.out.println(temp2);

		String temp3 = "";
		for (int k = 0; k <= name.length() - 1; k++) {
			temp3 = name.charAt(k) + temp3;
		}
		System.out.println(temp3.toUpperCase());

		System.out.println("");

		String name1 = "vijaya krishna";

		for (int j = name1.length() - 1; j >= 0; j--) {
			System.out.print(name1.charAt(j));
		}

		System.out.println("");
		String name2 = "Vijay";
		String rev = "";
		for (int k = name2.length() - 1; k >= 0; k--) {
			rev = rev + name2.charAt(k);
		}
		System.out.println(rev);

		String name3 = "Vijay";
		String rev1 = "";
		for (int l = 0; l <= name3.length() - 1; l++) {
			rev1 = name3.charAt(l) + rev1;
		}
		System.out.println(rev1);

		String name4 = "krishna";
		String temp = "";
		for (int a = 0; a <= name4.length() - 1; a++) {
			temp = name4.charAt(a) + temp;
		}
		System.out.println(temp);

	}

}
