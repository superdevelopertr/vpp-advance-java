package com.ailhanli.ex6;

import java.util.List;


public class Main {

	public static void main(String[] args) {

		BookCollection bc = new BookCollection();
		List<Book> foundBooks = bc.findBooks(a->a.getTitle().contains("men"));
	
		for (Book nextBook : foundBooks) {
			System.out.println (nextBook.getTitle() + " by " + nextBook.getAuthor());
		}
	}
}
