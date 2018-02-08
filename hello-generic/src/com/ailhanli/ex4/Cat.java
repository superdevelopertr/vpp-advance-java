package com.ailhanli.ex4;

public class Cat implements Animal, Comparable<Cat> {

	private int age;

	public Cat(int age) {
		super();
		this.age = age;
	}

	@Override
	public String getName() {
		return "I am a cat";
	}

	public int getAge() {
		return age;
	}

	@Override
	public int compareTo(Cat o) {
		return age - o.age;
	}

}
