package com.ailhanli.ex4;

import java.util.ArrayList;
import java.util.List;

public class TestGenericPoly {

	public static void main(String[] args) {
		List<Animal> animals = new ArrayList<>();
		animals.add(new Cat(100));
		animals.add(new Dog(10));
		animals.add(new SibirianDog(100));
		
		printDetails(animals);
		printSize(animals);
		
	}
	
	public static void printSize(List<?> animals) {
		System.out.println(animals.size());
	}
	
	
	public static void printDetails(List<? extends Animal> animals) {
		animals.forEach((a)-> System.out.println(a.getName()));
	}
	
	
}