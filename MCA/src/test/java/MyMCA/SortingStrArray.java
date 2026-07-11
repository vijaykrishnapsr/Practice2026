package MyMCA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingStrArray {

	public static void main(String[] args) {

		String name[] = { "Zinc", "H2O", "East", "West", "Zinc" };

		Arrays.sort(name);

		System.out.println(Arrays.toString(name));

		List<String> li = new ArrayList<String>();

		li.add("Zinc");
		li.add("H2O");
		li.add("East");
		li.add("West");
		li.add("Zinc");

		Collections.sort(li);

		//System.out.println(li);

		for (int i = 0; i < li.size(); i++) {

			String string = li.get(i);

			if (string.startsWith("E")) {
				System.out.println(string);
			}

		}

	}

}
