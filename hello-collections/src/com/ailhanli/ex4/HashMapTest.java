package com.ailhanli.ex4;

import java.util.HashMap;
import java.util.Map;

import com.ailhanli.ex2.Book;

public class HashMapTest {

	public static void main(String[] args) {
		
		Map<Book, Integer> books = new HashMap<Book, Integer>();
		
		books.put(new Book(1, 350, "J. Christopger Grange", "Siyah Kan") , 100);
		books.put(new Book(2, 450, "J. Christopger Grange", "Kurtlar Imparatorlugu") , 10);
		books.put(new Book(3, 300, "Tolkien", "Yuzuklerin Efendisi Kral") , 90);
		books.put(new Book(4, 200, "Tolkien", "Yuzuklerin Efendisi Fena"), 500);
		books.put(new Book(5, 550, "Amin Maoluf", "Dogudan Uzakta"), 300);
		books.put(new Book(6, 650, "Amin Maoluf", "Afrikali Leo"), 200);
		
		Book book1 = new Book(1, 350, "J. Christopger Grange", "Siyah Kan");
		Book book2 = new Book(1, 350, "J. Christopger Grange", "Siyah Kan");
		System.out.println("book1 "+book1); //cals toString method on object, in default it will return object address in hexadecimal
		System.out.println("book2 "+book2);
		System.out.println("book1 hashcode: "+book1.hashCode()); //it is actually object address in decimal format. it is identifier. can used in collections
		System.out.println("book2 hashcode: "+book2.hashCode()); 
		System.out.println("book1?=book2: "+(book1 == book2)); //compare if these objects same? it compares object address
		System.out.println("book1?=book2(equals): "+book1.equals(book2)); //compare semantically if these objects same? in default same as ==
		System.out.println(book2.hashCode());
		
		
		//default hashcode is object address, if we didnt override hashcode semantically same objects are has different address. TW, put in different slot
		System.out.println(books.get(book1));
		
		//after override hashcode without equals

	}

}
