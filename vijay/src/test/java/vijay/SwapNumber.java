package vijay;

public class SwapNumber {

	public static void main(String[] args) {

		// ******* With Third Variable ***********
		int temp;
		int a = 10;
		int b = 20;
        
		temp = a;
		a = b;
		b = temp;
		System.out.println("a is " + a);
		System.out.println("b is " + b);
        
		// ******* Without Third Variable ********
        
		int num1 = 30;
		int num2 = 40;
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("num1 is " + num1);
		System.out.println("num2 is " + num2);

	}

}
