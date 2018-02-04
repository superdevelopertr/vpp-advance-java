package com.ailhanli.ex2;

import java.util.ArrayList;
import java.util.List;

public class TestGenericWithSubtype {

	public static void main(String[] args) {
		List<Number> numbers = new ArrayList<>();
		numbers.add(new Integer(12));
		numbers.add(new Double(2));
		
		List<Class1> cls = new ArrayList<>();
		cls.add(new Class2());
	}
	
}
