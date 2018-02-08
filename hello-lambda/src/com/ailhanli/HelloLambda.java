package com.ailhanli;

import java.util.function.BiConsumer;

public class HelloLambda {

	@FunctionalInterface
	interface Calc<T extends Number> {
		T calc(T t1, T t2);
	}

	public Number calc(Integer number1, Integer number2, Calc<Integer> calcInterface) {
		return calcInterface.calc(number1, number2);
	}

	public static void main(String[] args) {
		HelloLambda hello = new HelloLambda();
		
		Number result = hello.calc(12, 12, (a, b) -> a + b);
		System.out.println(result);
		
		result = hello.calc(12, 12, (a, b) -> a * b);
		System.out.println(result);
		
		result = hello.calc(12, 12, (a, b) -> a / b);
		System.out.println(result);
		
		BiConsumer<Integer, String> biCons = (a,b)->{
			System.out.println(a);
			System.out.println(b);
		};
		
		biCons.accept(19, "Hello");
		
	}

}
