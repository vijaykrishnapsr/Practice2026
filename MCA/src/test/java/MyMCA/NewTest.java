package MyMCA;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class NewTest {
	
	// Print the duplicate numbers 12, 33, 43, 25, 35,, 12, 32, 33, 35, 85, 38, 27
	public static void main(String args[]) {
		int[] input = {12, 33, 43, 25, 35, 12, 32, 33, 35, 85, 38, 27};
		int[] charCount = new int[256];
		
		Set<Integer> set = new HashSet<Integer>();
		Set<Integer> duplicateset = new HashSet<Integer>();
		
		for(int i=0;i<input.length;i++) {
			if(!set.add(input[i])) {
				duplicateset.add(input[i]);
			}
			
		}
		System.out.println("The duplicated set :" + duplicateset );
		
	}

}
