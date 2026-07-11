package ProgramPractice;

public class FizzyBuzzyCITI {
	public static void main(String[] args) {
		int FizzyCount = 0;
		int BuzzyCount = 0;
		int FizzyBuzzyCount = 0;
		for (int i = 1; i <= 100; i++) {

			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FIZZYBUZZY");
				FizzyBuzzyCount++;
			} else if (i % 3 == 0) {
				System.out.println("FIZZY");
				FizzyCount++;
			} else if (i % 5 == 0) {
				System.out.println("BUZZY");
				BuzzyCount++;
			} else {
				System.out.println(i);
			}

		}
		System.out.println("Total number of Fizzy = " + FizzyCount);
		System.out.println("Total number of Buzzy = " + BuzzyCount);
		System.out.println("Total number of FizzyBuzzy = " + FizzyBuzzyCount);
	}

}
