package com.ailhanli.ex9;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AdvanceStream {

	public static void main(String[] args) {
		System.out.println(Arrays.asList(1, 2, 3, 4, 5).stream().collect(Collectors.summingInt(a -> a)).intValue());

		System.out.println(Arrays.asList(1, 2, 3, 4, 5).stream().collect(Collectors.averagingInt(x -> x)).intValue());

		System.out.println(Arrays.asList(1, 2, 3, 4, 5).stream().collect(Collectors.maxBy(Integer::compareTo)).get());

		Arrays.asList(1, 2, 3, 4, 5).stream().max(Integer::compareTo);

		System.out
				.println(IntStream.rangeClosed(1, 100).boxed().collect(Collectors.summingDouble(a -> a)).doubleValue());
	}
}