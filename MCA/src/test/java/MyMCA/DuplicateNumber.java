package MyMCA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DuplicateNumber {

	public static void main(String[] args) {
		
		int num[] = { 22, 66, 88, 77, 33, 99, 88, 22 };
		
		
		for (int i = 0; i < num.length; i++) {
			
			for (int j = i+1; j < num.length; j++) {
				
				if(num[i]==num[j]) {
					System.out.println(num[j]);
				}
				
			}
			
		}
		
	}

}
