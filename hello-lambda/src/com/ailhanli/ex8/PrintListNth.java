package com.ailhanli.ex8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrintListNth {

	public static void main(String[] args) {
                
		
//		List<String> items = Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H");
//		
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		Map<Integer, String> map = IntStream
		    .range(0, list.size())
		    .boxed()
		    .collect(Collectors.groupingBy(
		        i -> i / 3, //no longer i-1 because we start with 0
		        Collectors.mapping(i -> list.get((int) i).toString(), Collectors.joining(","))
		        ));
		
		System.out.println(map);

	}

}
