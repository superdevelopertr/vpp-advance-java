package com.ailhanli.ex5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HelloMethodRef {

	public static boolean checkItem(Double item){
		return item > 15;
	}
	
	public static double findTotal(List<Double> items) {
		Stream<Double> stream = items.stream();
		return stream.filter(HelloMethodRef::checkItem).reduce(0d, (a, b) -> a + b);
	}

	public static List<Double> getDouble(List<Double> items) {
		Stream<Double> stream = items.stream();
		return stream.filter(HelloMethodRef::checkItem).map(a -> a * 2).collect(Collectors.toList());
	}

	public static void main(String[] args) {
		List<Double> items = Arrays.asList(10d, 20d, 30d);
		System.out.println("Total of elements in this list: " + findTotal(items));
		System.out.println("-----");
		System.out.println("Doubling...");
		getDouble(items).forEach(System.out::println);

		System.out.println("Map version");
		System.out.println(items.stream().filter(a -> a > 15).map(a -> a * 2)
				.collect(Collectors.toMap(a -> a.hashCode(), a -> a)));
	}
}