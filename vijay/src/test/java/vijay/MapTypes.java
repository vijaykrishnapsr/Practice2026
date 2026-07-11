package vijay;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapTypes {

	public void mapExample() {

		TreeMap<Integer, String> tree = new TreeMap<>();
		tree.put(1, "vijay");
		tree.put(2, null);
		tree.put(3, null);
		tree.put(3, "vinoth");
		int size = tree.size();
		// tree.put(null, "friend"); // it will throw Null pointer exception while
		// runtime
		// System.out.println(tree);
        
		TreeMap<Integer, String> tree1 = new TreeMap<>(tree);
		System.out.println("Tree1 is - " + tree1);
        
		TreeMap<Integer, String> tree2 = (TreeMap<Integer, String>) tree.clone();
		System.out.println("Tree2 is - " + tree2);

		Set<Integer> keySet = tree.keySet(); // To get the keys alone
		System.out.println(keySet); // To print the Keys alone
		Collection<String> values = tree.values(); // To get the values alone
		System.out.println(values); // To print the values alone

		String string = tree.get(1); // To get the values of a particular Key
		System.out.println(string);

		Set<Entry<Integer, String>> entrySet = tree.entrySet(); // To get the Key of a particular value

		for(Map.Entry<Integer, String> entry : tree.entrySet()) {
			if(entry.getValue() == "vinoth") {
				System.out.println(entry.getKey());
			}
		}

		for (Map.Entry<Integer, String> entry : tree.entrySet()) {
			if (entry.getValue() == "vijay") {
				System.out.println(entry.getKey());
        
			}
		}
		
	}

	public static void main(String[] args) {
		MapTypes mapTypes = new MapTypes();
		mapTypes.mapExample();
	}

}
