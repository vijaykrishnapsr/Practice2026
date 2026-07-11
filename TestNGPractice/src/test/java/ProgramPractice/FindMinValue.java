package ProgramPractice;

public class FindMinValue {

	public static void main(String[] args) {
		int[] numbers = { 10, 4, 7, 23, 43, 65, 21, 18 };
		int minvalue = Integer.MAX_VALUE;
		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] < minvalue) {

				minvalue = numbers[i];

			}

		}
		System.out.println("Min Value is = " + minvalue);

	}

}

