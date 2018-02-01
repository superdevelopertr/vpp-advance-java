package com.ailhanli.ex2;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class BookTest {

	public static void main(String[] args) {
		List<Book> books = new ArrayList<Book>();
		books.add(new Book(350, "J. Christopger Grange", "Siyah Kan"));
		books.add(new Book(450, "J. Christopger Grange", "Kurtlar Imparatorlugu"));
		books.add(new Book(300, "Tolkien", "Yuzuklerin Efendisi Kral"));
		books.add(new Book(200, "Tolkien", "Yuzuklerin Efendisi Fena"));
		books.add(new Book(550, "Amin Maoluf", "Dogudan Uzakta"));
		books.add(new Book(650, "Amin Maoluf", "Afrikali Leo"));
		
		Collections.sort(books, new PageNumberOrder());
		books.forEach(b->System.out.println(b));
		
		System.out.println();
		Collections.sort(books, new PageNumberReverseOrder());
		books.forEach(b->System.out.println(b));
		
		System.out.println();
		Collections.sort(books, new NameComparator());
		books.forEach(b->System.out.println(b));
		
		System.out.println();
		Collections.sort(books, new AuthorAndNameComparator());
		books.forEach(b->System.out.println(b));
		
		System.out.println();
		Collections.sort(books, new AuthorAndNameReverseComparator());
		books.forEach(b->System.out.println(b));
	}
	
}