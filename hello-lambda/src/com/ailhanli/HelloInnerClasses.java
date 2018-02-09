package com.ailhanli;

import java.util.Arrays;
import java.util.List;

public class HelloInnerClasses {

	interface Mathcalculator {
		double calc(List<Double> items);
	}

	static class AverageCalculator implements Mathcalculator {
		@Override
		public double calc(List<Double> items) {
			double sum = 0;
			for (Double item : items) {
				sum += item;
			}
			return sum / items.size();
		}
	}

	static class MaxCalculator implements Mathcalculator {
		@Override
		public double calc(List<Double> items) {
			double max = 0;
			for (Double item : items) {
				item = Math.max(max, item);
			}
			return max;
		}
	}
	
	public static double calc(Mathcalculator mathCalc, List<Double> items) {
		return mathCalc.calc(items);
	}
	
	public static void main(String[] args) {
		Mathcalculator avgCalc = new AverageCalculator();
		System.out.println(calc(avgCalc, Arrays.asList(10d,20d, 30d)));;
	}
}