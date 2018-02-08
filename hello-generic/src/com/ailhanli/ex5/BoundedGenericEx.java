package com.ailhanli.ex5;

import java.util.ArrayList;
import java.util.List;

import com.ailhanli.ex4.Animal;
import com.ailhanli.ex4.Cat;

public class BoundedGenericEx {

	public static void main(String[] args) {

		List<Animal> animals = new ArrayList<>();
		addCat(animals);

		System.out.println(calcAgeSum(animals));

		List<Number> numbers = new ArrayList<>();
		addNumbers(numbers);
		numbers.forEach(a -> System.out.println(a));

	}

	public static int calcAgeSum(List<? extends Animal> animals) {
		return animals.stream().mapToInt(a -> a.getAge()).sum();
	}

	public static void addNumbers(List<? super Integer> list) {
		for (int i = 1; i <= 10; i++) {
			list.add(i);
		}
	}

	public static void addCat(List<? super Cat> list) {
		list.add(new Cat(12));
	}
}