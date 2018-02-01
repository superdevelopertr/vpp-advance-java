package com.ailhanli.ex3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import com.ailhanli.ex2.Book;
import com.ailhanli.ex2.NameComparator;

public class ArrayListVSLinkedListSort {

	public static void main(String[] args) {
		Random random = new Random(2000000);
		List<Book> bookArrayList = new ArrayList<>();
		List<Book> bookLinkedList = new LinkedList<>();
		
		for(int i=0;i<2000000;i++){
			bookArrayList.add(new Book(i, "author"+i, "name"+random.nextLong()));
		}
		for(int i=0;i<2000000;i++){
			bookLinkedList.add(new Book(i, "author"+i, "name"+random.nextLong()));
		}
		
		long now = System.currentTimeMillis();
		Collections.sort(bookArrayList, new NameComparator());
		System.out.println("sort in arraylist "+(System.currentTimeMillis()-now)+" elapsed");
		
		now = System.currentTimeMillis();
		Collections.sort(bookLinkedList, new NameComparator());
		System.out.println("sort in linkedlist "+(System.currentTimeMillis()-now)+" elapsed");
		
		
	}
}
