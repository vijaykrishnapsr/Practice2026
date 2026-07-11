package ProgramPractice;

public class DuplicateNumber {

	public static void main(String[] args) {
		int[] num = { 10, 4, 7, 23, 43, 65, 65, 21, 18 };
		for (int i = 0; i < num.length; i++) {

			for (int j = i + 1; j < num.length; j++) {
				if (num[i] == num[j]) {
					System.out.println("Duplicate number is = " + num[j]);
				}
			}

		}
	}

}
