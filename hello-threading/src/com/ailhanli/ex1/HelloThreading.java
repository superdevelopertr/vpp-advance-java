package com.ailhanli.ex1;

import java.util.stream.IntStream;

public class HelloThreading {
	
	public static void main(String[] args) {
		System.out.println("Hello world!");
		
		IntStream.range(1, 5).forEach(a->{
			Thread thread = new Thread(new PrintTask());
			thread.start();
		});
		
		System.out.println("Main finished");
	}
}
