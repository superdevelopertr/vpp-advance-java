package com.ailhanli.ex4;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

import com.ailhanli.ex2.Book;

public class MapTest {

	public static void main(String[] args) {
		Map<Book, Integer> books = new HashMap<Book, Integer>();
		books.put(new Book(1, 350, "J. Christopger Grange", "Siyah Kan") , 100);
		books.put(new Book(3, 450, "J. Christopger Grange", "Kurtlar Imparatorlugu") , 10);
		books.put(new Book(5, 300, "Tolkien", "Yuzuklerin Efendisi Kral") , 90);
		books.put(new Book(10, 200, "Tolkien", "Yuzuklerin Efendisi Fena"), 500);
		books.put(new Book(100, 550, "Amin Maoluf", "Dogudan Uzakta"), 300);
		books.put(new Book(500, 650, "Amin Maoluf", "Afrikali Leo"), 200);
		
		System.out.println("default hashmap impl");
		for(Entry<Book, Integer> entry : books.entrySet()) {
			System.out.println(entry.getKey()+" --> "+ entry.getValue());
		}
		
		System.out.println();
		System.out.println("linkedhashmap impl");
		books = new LinkedHashMap<Book, Integer>();
		books.put(new Book(1, 350, "J. Christopger Grange", "Siyah Kan") , 100);
		books.put(new Book(3, 450, "J. Christopger Grange", "Kurtlar Imparatorlugu") , 10);
		books.put(new Book(5, 300, "Tolkien", "Yuzuklerin Efendisi Kral") , 90);
		books.put(new Book(10, 200, "Tolkien", "Yuzuklerin Efendisi Fena"), 500);
		books.put(new Book(100, 550, "Amin Maoluf", "Dogudan Uzakta"), 300);
		books.put(new Book(500, 650, "Amin Maoluf", "Afrikali Leo"), 200);
		for(Entry<Book, Integer> entry : books.entrySet()) {
			System.out.println(entry.getKey()+" --> "+ entry.getValue());
		}
		
		System.out.println();
		System.out.println("TreeMap impl");
		books = new TreeMap<Book, Integer>();
		books.put(new Book(1, 350, "J. Christopger Grange", "Siyah Kan") , 100);
		books.put(new Book(3, 450, "J. Christopger Grange", "Kurtlar Imparatorlugu") , 10);
		books.put(new Book(5, 300, "Tolkien", "Yuzuklerin Efendisi Kral") , 90);
		books.put(new Book(10, 200, "Tolkien", "Yuzuklerin Efendisi Fena"), 500);
		books.put(new Book(100, 550, "Amin Maoluf", "Dogudan Uzakta"), 300);
		books.put(new Book(500, 650, "Amin Maoluf", "Afrikali Leo"), 200);
		for(Entry<Book, Integer> entry : books.entrySet()) {
			System.out.println(entry.getKey()+" --> "+ entry.getValue());
		}

	}

}
