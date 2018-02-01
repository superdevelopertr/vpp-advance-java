package com.ailhanli.ex2;

import java.util.Comparator;

public class PageNumberOrder implements Comparator<Book> {
	@Override
	public int compare(Book o1, Book o2) {
		return o1.getNumberOfPages()-o2.getNumberOfPages();
	}
}
