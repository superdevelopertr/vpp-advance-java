package com.ailhanli.ex1;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class CompareStrings {

	public static void main(String[] args) {
		List<String> items = new ArrayList<>();
		items.add("Yana");
		items.add("Ina");
		items.add("Anya");
		
		//System.out.println("Yana".compareTo("Anya"));
	
		Collections.sort(items);
		items.forEach(a->System.out.println(a));
		
		System.out.println("Ana".compareTo("Yana"));
	}
	
}