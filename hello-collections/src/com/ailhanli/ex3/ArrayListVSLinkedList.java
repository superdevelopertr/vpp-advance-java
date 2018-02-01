package com.ailhanli.ex3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.ailhanli.ex2.Book;

public class ArrayListVSLinkedList {

	public static void main(String[] args) {
		List<Book> bookArrayList = new ArrayList<>();
		List<Book> bookLinkedList = new LinkedList<>();
		
		long now = System.currentTimeMillis();
		for(int i=0;i<2000000;i++){
			bookArrayList.add(new Book(i, "author"+i, "name"+i));
		}
		System.out.println("Adding 2million elements in arraylist : "+(System.currentTimeMillis()-now)+" elapsed.");
		now = System.currentTimeMillis();
		for(int i=0;i<2000000;i++){
			bookLinkedList.add(new Book(i, "author"+i, "name"+i));
		}
		System.out.println("Adding 2million elements in linked list : "+(System.currentTimeMillis()-now)+" elapsed.");
		
		now = System.currentTimeMillis();
		bookArrayList.remove(1);
		System.out.println("Deleting first element in array list "+(System.currentTimeMillis()-now)+" elapsed");
		now = System.currentTimeMillis();
		bookLinkedList.remove(1);
		System.out.println("Deleting first element in linked list "+(System.currentTimeMillis()-now)+" elapsed");
		
		now = System.currentTimeMillis();
		bookArrayList.remove(1000);
		System.out.println("Deleting an element in array list "+(System.currentTimeMillis()-now)+" elapsed");
		now = System.currentTimeMillis();
		bookLinkedList.remove(1000);
		System.out.println("Deleting an element in linked list "+(System.currentTimeMillis()-now)+" elapsed");
				
		now = System.currentTimeMillis();
		bookArrayList.get(1000000);
		System.out.println("Searching element  in array list "+(System.currentTimeMillis()-now)+" elapsed");
		now = System.currentTimeMillis();
		bookLinkedList.get(1000000);
		System.out.println("Searching element  in linked list "+(System.currentTimeMillis()-now)+" elapsed");

	}
}
