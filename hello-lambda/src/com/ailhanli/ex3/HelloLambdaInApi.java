package com.ailhanli.ex3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.DoublePredicate;

public class HelloLambdaInApi {

	public static void printItems(List<Double> items, DoublePredicate predicate, Consumer<Double> cons) {
		items.forEach(a -> {
			if (predicate.test(a)) {
				cons.accept(a);
			}
		});
	}

	public static void main(String[] args) {
		List<Double> items = Arrays.asList(10d, 20d, 30d);
		
		printItems(items, a -> a < 25, (a)->System.out.println(a));
		
		Collections.sort(items, (a,b)->{return a-b>0?-1:1; });
		
		printItems(items, a -> a < 25, (a)->System.out.println(a));
	}
}