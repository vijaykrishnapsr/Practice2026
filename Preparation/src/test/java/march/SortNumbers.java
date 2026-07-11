package march;

import java.util.Arrays;

public class SortNumbers {

	public static void main(String[] args) {
		int[] array = { 100, 50, 7, 20, 43, 3, 2, 0, 76, 20, 7, 23, 20 };
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		System.out.println(array[array.length - 1]);
		
	}

}
