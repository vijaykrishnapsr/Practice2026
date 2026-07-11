package com.pages;

import java.util.ArrayList;
import java.util.List;

public class LIstTest {
	
	
	public static void main(String[] args) {
		
		String name = "vijayakrishnamoorthy";
		
		List<String> li = new ArrayList<>();
		
		for(int i =0; i<name.length(); i++) {
			
			li.add(String.valueOf(name.charAt(i)));
		}
		
		System.out.println(li);
		
	}

}
