package march;

public class Modifiers {
	int a;
	static int c;

	public void method1() {
		int b = 10;
		System.out.println(b);

	}

	public static void main(String[] args) {
		Modifiers m = new Modifiers();
		int a=20;
		System.out.println(m.a);
		m.method1();  
		System.out.println(c);
		String s = "12abc34";
		//int int1 = Integer.parseInt(s);
		//System.out.println(int1);
		String str = null;
		System.out.println(s.charAt(1));

	}

}
