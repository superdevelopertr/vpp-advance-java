package com.ailhanli;

import java.util.Arrays;
import java.util.List;

public class HelloAnoClasses {

	interface Mathcalculator {
		double calc(List<Double> items);
	}

	public static double calc(Mathcalculator mathCalc, List<Double> items) {
		return mathCalc.calc(items);
	}
	
	public static void main(String[] args) {
		
		Mathcalculator avgCalc = new Mathcalculator() {
			@Override
			public double calc(List<Double> items) {
				double sum = 0;
				for (Double item : items) {
					sum += item;
				}
				return sum / items.size();
			}
		};
		
		
		System.out.println(calc(avgCalc, Arrays.asList(10d,20d, 30d)));;
	}
}