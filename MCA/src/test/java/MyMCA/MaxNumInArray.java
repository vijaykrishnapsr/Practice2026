package MyMCA;

import java.util.Iterator;

public class MaxNumInArray {

	public void maxNum() {
		int num[] = { 1, 99, 87, 56, 93, -67, -3 };

		int max = 0;

		for (int i = 0; i < num.length; i++) {

			if (num[i] >= max) {
				max = num[i];

			}
		}

		System.out.println(max);
	}

	public void minNum() {

		int num[] = { 1, 99, 87, 56, 93, -67, -3 };

		int min = 0;

		for (int i = 0; i < num.length; i++) {
			if (num[i] <= min) {
				min = num[i];
			}
		}
		System.out.println(min);

	}

	public static void main(String[] args) {

		MaxNumInArray m = new MaxNumInArray();
		m.maxNum();
		m.minNum();

	}

}
