package com.ailhanli.ex4;

import java.util.HashSet;
import java.util.Set;

public class Developer {

	private String name;
	private int level;
	private Set<String> languages;

	public Developer(String name) {
		this.languages = new HashSet<>();
		this.name = name;
	}

	public void add(String language) {
		this.languages.add(language);
		if(languages.size()>1 && languages.size()<4) {
			level=1;
		}else {
			level=2;
		}
	}

	public int getLevel() {
		return level;
	}
	
	public Set<String> getLanguages() {
		return languages;
	}
}
