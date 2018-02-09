package com.ailhanli.ex2;

import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleSupplier;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class TestPredefinedFunctions {

	public static void main(String[] args) {

	}

	public static void v1() {
		// find area of circle which has radious which is even number and print. pi*r2

		BiFunction<Integer, Double, Double> findArea = (r, pi) -> {
			return r * r * pi;
		};

		Predicate<Integer> checkEven = r -> {
			for (int i = 2; i < r; i++) {
				if (r % i == 0) {
					return false;
				}
			}
			return true;
		};

		Supplier<Double> getPi = () -> {
			return 3.14;
		};

		Consumer<Double> printer = (diameter) -> System.out.println(diameter);

		try (Scanner scanner = new Scanner(System.in)) {
			while (true) {
				System.out.println("please enter a even radious value for circle area to be calculate: ");
				int radious = scanner.nextInt();

				boolean isEven = checkEven.test(radious);
				if (isEven) {
					double pi = getPi.get();
					double res = findArea.apply(radious, pi);
					printer.accept(res);
				} else {
					System.err.println("You entered number isnot even!");
				}
			}
		}
	}

	public static void v2() {
		// find area of circle which has radious which is even number and print. pi*r2

		BiFunction<Integer, Double, Double> findArea = (r, pi) -> {
			return r * r * pi;
		};

		Predicate<Integer> checkEven = r -> {
			for (int i = 2; i < r; i++) {
				if (r % i == 0) {
					return false;
				}
			}
			return true;
		};

		DoubleSupplier getPi = () -> {
			return 3.14;
		};

		DoubleConsumer printer = (diameter) -> System.out.println(diameter);

		try (Scanner scanner = new Scanner(System.in)) {
			while (true) {
				System.out.println("please enter a even radious value for circle area to be calculate: ");
				int radious = scanner.nextInt();

				boolean isEven = checkEven.test(radious);
				if (isEven) {
					double pi = getPi.getAsDouble();
					double res = findArea.apply(radious, pi);
					printer.accept(res);
				} else {
					System.err.println("You entered number isnot even!");
				}
			}
		}
	}
}