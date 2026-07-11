package vijay;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


public class SetTypes {

	public void setExample() {

		// Set set1 = new TreeSet();
		TreeSet<Object> set1 = new TreeSet<>();
		set1.add("Jan");
		set1.add("Feb");
		set1.add("Mar");
		set1.add("Apr");
		// set1.add(Null); it won't allow null in Compile time itself
        
		System.out.println(set1);
        
		Iterator iterator = set1.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("*************************************");
		
		Iterator descendingIterator = set1.descendingIterator();
		while (descendingIterator.hasNext()) {
			System.out.println(descendingIterator.next());
		}
    
	}

	public static void main(String[] args) {
		SetTypes s = new SetTypes();
		s.setExample();

	}

}
