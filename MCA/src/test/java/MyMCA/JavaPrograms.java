package MyMCA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.stream.IntStream;

public class JavaPrograms {

	public void reverseStr() {

		String name = "Vijayakrishnamoorthy";

		String temp = "";

		for (int i = 0; i < name.length(); i++) {

			temp = name.charAt(i) + temp;
		}

		System.out.println(temp);

	}

	public void revStrCollection() {

		String stud = "Arun";
		String temp1 = "";

		List<Character> li = new ArrayList<Character>();

		for (int j = 0; j < stud.length(); j++) {
			li.add(stud.charAt(j));
		}
//		
//		//System.out.println(li);
//		Collections.reverse(li);
//		
//		ListIterator iterator = li.listIterator();
//		while(iterator.hasNext()) 
//		{
//			System.out.println(iterator.next());
//		}
//		
		for (int k = 0; k < li.size(); k++) {
			temp1 = li.get(k) + temp1;
		}
		System.out.println(temp1);

	}

	public void revBuffer() {

		String studname = "Vinoth";
		StringBuffer buffer = new StringBuffer();
		buffer.append(studname);
		System.out.println(buffer.reverse());
		
		StringBuffer buf = new StringBuffer("Vijaykrishna");
		System.out.println( " Reverse using String Buffer - " + buf.reverse());

	}

	public void numberRev() {
		int num = 1234567;
		int rev = 0;
		int rem = 0;
		while (num > 0) {
			rem = num % 10;
			rev = (rev * 10) + rem;
			num = num / 10;
		}
		System.out.println(rev);

	}

	public void starPrintForward() {

		for (int i = 0; i < 5; i++) {

			for (int j = 0; j <= i; j++) {

				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public void numberPattern() {

		int startingnumber = 1;

		for (int i = 0; i <= 5; i++) {

			for (int j = 0; j <= i; j++) {

				System.out.print(startingnumber);
				startingnumber++;
			}
			System.out.println();
		}
	}

	public void starPrintReverse() {

		for (int i = 0; i <= 5; i++) {
			for (int j = i; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public void starDiag() {

		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 5 - i; j++) {
				System.out.print(" ");
			}

			for (int k = 0; k <= i; k++) {
				System.out.print("*");

			}
			System.out.println();
		}
	}

	public void starDiagRev() {

		for (int i = 0; i <= 5; i++) {

			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}

			for (int k = 0; k <= 5 - i; k++) {
				System.out.print("*");

			}
			System.out.println();
		}
	}

	public void reverseEachWord() {
		String student = "Vijaya Krishna Moorthy";
		String[] split = student.split(" ");

		String tempWord = "";
		for (String s : split) {
			String tempName = "";
			for (int i = 0; i < s.length(); i++) {
				tempName = s.charAt(i) + tempName;
			}
			tempWord = tempWord + tempName + " ";
		}
		System.out.println(tempWord + " ");

	}

	public static void main(String[] args) {
		JavaPrograms r = new JavaPrograms();
		r.reverseStr();
		r.revStrCollection();
		r.numberRev();
		r.revBuffer();
		r.starPrintForward();
		r.starPrintReverse();
		r.reverseEachWord();
		r.numberPattern();
		r.starDiag();
		r.starDiagRev();

	}

}
