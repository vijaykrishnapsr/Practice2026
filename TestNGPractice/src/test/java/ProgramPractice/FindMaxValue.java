package ProgramPractice;

public class FindMaxValue {

	public static void main(String[] args) {
		int[] num = { 10, 4, 7, 23, 43, 65, 21, 18 };
		int maxvalue = Integer.MIN_VALUE;
		for (int i = 0; i < num.length; i++) {

			if (num[i] > maxvalue) {
				maxvalue = num[i];
			}

		}
		System.out.println("Max value is = " + maxvalue);

	}

}
