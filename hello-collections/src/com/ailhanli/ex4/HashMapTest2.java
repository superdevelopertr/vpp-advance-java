package com.ailhanli.ex4;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.LinkedList;

import com.ailhanli.ex2.Book;

public class HashMapTest2 {
	//there is a contact bw hashcode and equals
	//if two objects are equal, their hashcode must equals
	//if two objects hashcodes are equals, their equals can be different, if they are not equal hash collection performance will affect.
	public static void main(String[] args) {
		
		Map<Book, Integer> books = new HashMap<Book, Integer>();
		List<Book> bookList = new LinkedList<>();
		for(int i = 0 ; i<100000; i++) {
			Book book = new Book(1, 650, "Amin Maoluf", "Afrikali Leo"+i);
			books.put(book, 200);
			bookList.add(book);
		}
		
		long now = System.currentTimeMillis();
		bookList.get(50000);
		System.out.println("searching permance in linkedlist(in default it uses array inside) "+(System.currentTimeMillis()-now)+" elapsed");
		
		System.out.println();
		Book book = new Book(1, 650, "Amin Maoluf", "Afrikali Leo"+50000);
		now = System.currentTimeMillis();
		books.get(book);
		System.out.println("searching permance in hashmap in one single linkedlist(in default it uses ) "
				+ (System.currentTimeMillis() - now) + " elapsed");
	
		System.out.println();
		now = System.currentTimeMillis();
		books.remove(book);
		System.out.println("remove permance in hashmap in one single linkedlist(in default it uses ) "+(System.currentTimeMillis()-now)+" elapsed");
		
		System.out.println(books.get(book));
		

	}

}
