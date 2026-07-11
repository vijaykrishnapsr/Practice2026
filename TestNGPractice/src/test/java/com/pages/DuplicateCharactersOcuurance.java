package com.pages;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateCharactersOcuurance {

	public static void main(String[] args) {

		String str = "Vijayakrishnamoorthy";
		char[] charArray = str.toCharArray();
		HashMap<Character, Integer> map = new HashMap<>();
		for(Character ch: charArray) {
			
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
//		for (int i = 0; i < charArray.length; i++) {
//			map.put(charArray[i], map.getOrDefault(charArray[i], 0)+1);
//			
//		}
		System.out.println(map);
		
		Set<Entry<Character, Integer>> entrySet = map.entrySet();
		for(Entry<Character, Integer> entry : entrySet) {
			
			if(entry.getValue()>1) {
				System.out.println(entry);
			}
		}
	
		
	}

}
