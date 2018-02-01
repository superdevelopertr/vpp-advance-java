package com.ailhanli.ex3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.ailhanli.ex2.Book;

public class StaticClassEx {

	public static class NameComparator implements Comparator<Book> {
		@Override
		public int compare(Book o1, Book o2) {
			return o1.getName().compareTo(o2.getName());
		}
	}
	
	public static void main(String[] args) {
		List<Book> books = new ArrayList<Book>();
		books.add(new Book(350, "J. Christopger Grange", "Siyah Kan"));
		books.add(new Book(450, "J. Christopger Grange", "Kurtlar Imparatorlugu"));
		books.add(new Book(300, "Tolkien", "Yuzuklerin Efendisi Kral"));
		books.add(new Book(200, "Tolkien", "Yuzuklerin Efendisi Fena"));
		books.add(new Book(550, "Amin Maoluf", "Dogudan Uzakta"));
		books.add(new Book(650, "Amin Maoluf", "Afrikali Leo"));
		
		Collections.sort(books, new StaticClassEx.NameComparator());
		books.forEach(b->System.out.println(b));
		
		System.out.println();
		Collections.sort(books, new Comparator<Book>() {
			@Override
			public int compare(Book o1, Book o2) {
				return o1.getNumberOfPages()-o2.getNumberOfPages();
			}
		});
		books.forEach(b->System.out.println(b));
		
		System.out.println();
		Collections.sort(books, (a,b)->-(a.getName().compareTo(b.getName())));
		books.forEach(b->System.out.println(b));
	}

}
