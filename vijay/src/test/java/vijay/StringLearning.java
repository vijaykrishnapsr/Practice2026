package vijay;

public class StringLearning  {
	
// String represents sequence of character value
// String is immutable
// String has two types - Literal String, Non-Literal String
// Literal String ---> String name = "Vijay";
// if we assign another value like name = "Vinoth" means it will change the pointer to the newly assigned value
// Non-LiteralString -----> String name = new String("Vijay");
// but non-literal string creates a new memory space and stores the value
// CharSequence has three child
	// String, StringBuffer, StringBuilder
public static void main(String[] args) {
	
	String s = "Vijay";
	String name = "Vijaya krishna krishna moorthy";
	//String replace = s.replace('j','k');
	//System.out.println(replace);
	System.out.println(s.substring(2));
	System.out.println(s.substring(1,4));
	System.out.println(s.charAt(4));
	System.out.println(s.indexOf('i'));
	System.out.println(name.lastIndexOf('i'));
	System.out.println(name.indexOf('i',2));
	System.out.println(name.indexOf("krishna"));
	System.out.println(name.indexOf("krishna", 13));
	System.out.println(String.join(" ","krishna","moorthy","Cellasamy" ));
	String[] split = name.split(" ");
	for (String string : split) {
		System.out.println(string);
	}
	
	String name1 = "krishna";
	System.out.println(name1.concat("Sri"));
	System.out.println(name1); // Literal string is immutable
	
	StringBuffer s1 = new StringBuffer("Jay");
	System.out.println(s1.append("jay"));
	System.out.println(s1); // StringBuffer is Mutable
	System.out.println(s1.reverse());
	System.out.println(s1);
    System.out.println(s1.delete(0, 2));
    System.out.println(s1.deleteCharAt(0));
    System.out.println(s1.reverse());
    System.out.println(s1.capacity());
    StringBuffer b = new StringBuffer("vijaya krishna moorthy"); //default capacity + currently stored count
    System.out.println(b.capacity());
   
   
   StringBuilder a = new StringBuilder("SivaSakthi");
   System.out.println(a.append("vijay"));
   System.out.println(a);
   
}

}
