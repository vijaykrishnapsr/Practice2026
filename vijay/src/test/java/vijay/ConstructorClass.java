package vijay;

public class ConstructorClass extends ObjectClass {

	int a ;
	int b;
	String stdname;
	int studage;

	public ConstructorClass() {

		a=10;
		b=20;
		System.out.println("Constructor Class Example");
		System.out.println(a);
		System.out.println(b);

	}
	public ConstructorClass(int x, int y) {


		System.out.println(x);
		System.out.println(y);
	}
	public ConstructorClass(String name, int age){

		System.out.println("Age is " + age + "Name is " + name);
	}


	public static void main(String[] args) {

		ConstructorClass cons = new ConstructorClass();
		ConstructorClass val = new ConstructorClass(100, 200);
		ConstructorClass abc = new ConstructorClass();

		ConstructorClass name = new ConstructorClass();




	}

}
