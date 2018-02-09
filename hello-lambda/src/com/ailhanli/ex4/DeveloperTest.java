package com.ailhanli.ex4;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DeveloperTest {

	public static void main(String[] args) {
		List<Developer> team = new ArrayList<>();
		Developer polyglot = new Developer("esoteric");
		polyglot.add("clojure");
		polyglot.add("scala");
		polyglot.add("groovy");
		polyglot.add("go");

		Developer busy = new Developer("pragmatic");
		busy.add("java");
		busy.add("javascript");
		busy.add("go");
		
		Developer jr = new Developer("pragmatic");
		jr.add("java");
		jr.add("go");


		team.add(polyglot);
		team.add(busy);
		team.add(jr);
		
		//List<Set<String>> res=  team.stream().map(a->a.getLanguages()).collect(Collectors.toList());
		Set<String> langs = team.stream().filter(a -> a.getLevel() == 1).map(a -> a.getLanguages())
				.flatMap(a -> a.stream()).collect(Collectors.toSet());
		System.out.println(langs);
	}
}