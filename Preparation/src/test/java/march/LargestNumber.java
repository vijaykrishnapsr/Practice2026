package march;



public class LargestNumber {
	
	public static void main(String[] args) {

		// Find the largest number from the given array

		int[] a = { 2, 4, -50, 27, 21, 3, 1, 48, 98, 37, 62, 0 };

		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("The largest number is : " + a[0]);

	}

}
