package march;

public class StringReversePractice {

	public static void main(String[] args) {
		String name = "Vijaya krishna moorthy";
		String[] arr = name.split(" ");
		for (String word : arr) {
			String temp = "";
			for (int i = 0; i < word.length(); i++) {
				temp = word.charAt(i) + temp;
			}

			System.out.print(temp + " ");
		}

	}

}
