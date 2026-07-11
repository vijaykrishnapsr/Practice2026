package ProgramPractice;

public class SecondLargestNumber {

	public static void main(String[] args) {
		int[] num = { 10, 4, 7, 23, 43, 65, 21, 18 };
		int firstLargest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for (int i = 0; i < num.length; i++) {

			if (num[i] > firstLargest) {

				secondLargest = firstLargest;
				firstLargest = num[i];

			}

			else if (num[i] > secondLargest && num[i] != firstLargest) {

				secondLargest = num[i];
			}

		}

		System.out.println("Second Largest Number is = " + secondLargest);

	}

}
