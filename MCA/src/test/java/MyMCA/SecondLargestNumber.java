package MyMCA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargestNumber {

	public static void main(String[] args) {

		int[] num = { 1, 5, 10, 45, 15, 66, 78, 9 };

		List<Integer> li = new ArrayList<Integer>();

		for (int i = 0; i < num.length; i++) {

			li.add(num[i]);

		}
        
		System.out.println(li);

		Collections.sort(li);

		System.out.println(li);

		System.out.println("Second Largest number is : " + li.get(li.size() - 2));

	}

}
