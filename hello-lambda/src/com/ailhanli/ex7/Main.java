package com.ailhanli.ex7;

import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {
		BookCollection bc = new BookCollection();
		Predicate<Book> searchCriteria = a -> a.getTitle().contains("men");
		
		bc.findBooks(searchCriteria).stream().forEach(System.out::println);
		System.out.println();
		
		bc.findBookMap(searchCriteria).entrySet().stream().map(b -> b.getKey() + ": " + b.getValue())
				.forEach(System.out::println);
		
		System.out.println();
		System.out.println("Number of items: "+bc.findBookSizeByCriteria(searchCriteria));

	}
}
