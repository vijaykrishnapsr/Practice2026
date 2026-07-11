package ProgramPractice;

public class Armstrong {

	public void checkAnagram() {
		int num = 153;
		int OrigNum = num;
		int t1 = 0;
		while (num > 0) {

			int digit = num % 10;
			t1 = t1 + (digit * digit * digit);
			num = num / 10;

		}

//		String str = Integer.toString(num);
//
//		String[] c = str.split("");
//		int temp = 0;
//		for (int i = 0; i < c.length; i++) {
//
//			int digit = Integer.valueOf(c[i]);
//			temp = temp + (digit * digit * digit);
//		}
//		System.out.println(temp);
		if (OrigNum == t1) {

			System.out.println(OrigNum + " is armstring number");

		} else
			System.out.println(OrigNum + " is not an armstring number");
	}

	public static void main(String[] args) {

		Armstrong ar = new Armstrong();
		ar.checkAnagram();
	}

}
