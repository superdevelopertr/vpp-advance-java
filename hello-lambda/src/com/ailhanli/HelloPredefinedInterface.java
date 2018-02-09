package com.ailhanli;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class HelloPredefinedInterface {

	public static double calc(Function<List<Double>, Double> mathCalc, List<Double> items) {
		return mathCalc.apply(items);
	}
	
	public static void main(String[] args) {
		
		Function<List<Double>, Double>  avgCalc = items->{
			double sum = 0;
			for (Double item : items) {
				sum += item;
			}
			return sum / items.size();
		};
		
		System.out.println(calc(avgCalc, Arrays.asList(10d,20d, 30d)));;
	}
}