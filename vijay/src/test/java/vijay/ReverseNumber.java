package vijay;

public class ReverseNumber {

	public static void main(String[] args) {

		int number = 12345;

		int rem = 0;
        
		int rev = 0;
        
		while (number > 0) {
        
			rem = number % 10;
        
			rev = (rev * 10) + rem;
        
			number = number / 10;
        
		}

		System.out.println(rev);
		
		
		int num = 987654321;
		int remind = 0;
		int reverse = 0;
		while(num>0) {
			remind = num % 10 ;
			reverse = (reverse*10) + remind ;
			num = num/10;
		}
      System.out.println("Reversed Number is - " + reverse);
	}

}
