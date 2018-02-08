package com.ailhanli.ex3;

import java.util.List;
import java.util.ArrayList;

public class TestHowWorks {

	public static void main(String[] args) {
		List<String> items = new ArrayList<String>();
		items.add("Hello world");
		String item = items.get(0);
		System.out.println(item);
	}
}