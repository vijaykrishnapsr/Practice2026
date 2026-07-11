package vijay;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListTypes {
	
	public void arrayListType() {
		
		List<String> li = new ArrayList<String>();
		li.add("Jan");
		li.add("Feb");
		li.add("Mar");
		li.add("Apr");
		li.add("May");
		Collections.reverse(li);
		System.out.println(li);
		li.add("June");
		//System.out.println(li);
		//System.out.println(li.get(1));
		List list1 = new ArrayList();
		list1.add(1);
		list1.add("Jan");
		list1.add(123);
		list1.add("May");
		//System.out.println(list1);
		//li.retainAll(list1);  // To get the common values alone
		//System.out.println(li);
		//System.out.println(list1);
		li.addAll(list1);
		System.out.println(li);
		
		ListIterator newList = li.listIterator();
		while(newList.hasNext()) {
			System.out.println(newList.next());
		}
		
		ListIterator newList1 = li.listIterator(li.size());
		while(newList.hasPrevious()) {
			System.out.println(newList.previous());
		}
	}
	
	public static void main(String[] args) {
	     ListTypes l = new ListTypes();
	     l.arrayListType();
		
	}
	

}
