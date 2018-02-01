package com.ailhanli.ex2;

import java.util.Comparator;

public class AuthorAndNameComparator implements Comparator<Book> {
	@Override
	public int compare(Book o1, Book o2) {
		return o1.getAuthor().concat(o1.getName()).compareTo(o2.getAuthor().concat(o2.getName()));
	}
}
