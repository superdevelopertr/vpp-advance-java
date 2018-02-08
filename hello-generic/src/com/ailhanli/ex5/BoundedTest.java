package com.ailhanli.ex5;

import java.util.ArrayList;
import java.util.List;

public class BoundedTest {

	public static void main(String[] args) {
		List<Number> numbers = new ArrayList<>();
		numbers.add(12);
		numbers.add(13);
		printout(numbers);
		
		List<Integer> numbers2 = new ArrayList<>();
		numbers2.add(12);
		numbers2.add(13);
		printout(numbers2);
		//printout2(numbers2);
		printout3(numbers2);
		printout3(numbers);
		
		
		printout2(numbers);
	}
	
	public static void printout(List<? extends Number> numbers ) {
		numbers.stream().forEach(a->System.out.println(a));
	}
	
	public static void printout2(List<? super Number> numbers ) {
		numbers.stream().forEach(a->System.out.println(a));
	}
	
	public static void printout3(List<?> numbers ) {
		numbers.stream().forEach(a->System.out.println(a));
	}
}
