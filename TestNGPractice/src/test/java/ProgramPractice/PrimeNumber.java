package ProgramPractice;

public class PrimeNumber {
	
	int num =12;

	public void checkPrimeOrNot() {

		int count =0;
			for (int j = 1; j <= num; j++) {
				if (num % j == 0) {
					count++;
				}
			}
			if (count == 2) {

				System.out.println(num + " is a Prime Number");
			}
			else
			{
				System.out.println(num + " is not a prime number");
			}
		

	}
	
	public static void main(String[] args) {
		
		PrimeNumber prime = new PrimeNumber();
		prime.checkPrimeOrNot();
		
		
	}

}
