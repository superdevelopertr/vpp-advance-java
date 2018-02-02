package com.ailhanli.ex4;

import java.util.HashMap;
import java.util.Map;

import com.ailhanli.ex2.Book;

public class HashMapTest3 {

	
	public static void main(String[] args) {
		
		Map<Book, Integer> books = new HashMap<Book, Integer>();
		
		books.put(new Book(1, 350, "J. Christopger Grange", "Siyah Kan") , 100);
		books.put(new Book(1, 450, "J. Christopger Grange", "Kurtlar Imparatorlugu") , 10);
		books.put(new Book(3, 300, "Tolkien", "Yuzuklerin Efendisi Kral") , 90);
		books.put(new Book(4, 200, "Tolkien", "Yuzuklerin Efendisi Fena"), 500);
		books.put(new Book(5, 550, "Amin Maoluf", "Dogudan Uzakta"), 300);
		books.put(new Book(6, 650, "Amin Maoluf", "Afrikali Leo"), 200);
		
		System.out.println(books.size()); // if equals didnt override it will return 6, otherwise it will return 5
		
		Book book1 = new Book(1, 350, "J. Christopger Grange", "Siyah Kan");
		
		//after override hashcode without equals. it can return null because of default equals method behaviour
		System.out.println(books.get(book1));
		

	}

}
