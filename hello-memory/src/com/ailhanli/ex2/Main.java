package com.ailhanli.ex2;

public class Main {

	public static void main(String[] args) {

		BookCollection bc = new BookCollection();
		
		//get price of book called Tom Jones in EUR
		System.out.println(bc.findBookByName("Tom Jones").getPrice().convert("EUR"));
		
		//ReadOnlyBook rb = bc.findBookByName("Tom Jones");		
	}
}
