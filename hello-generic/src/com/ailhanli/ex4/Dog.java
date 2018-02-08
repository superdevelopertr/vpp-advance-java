package com.ailhanli.ex4;

public class Dog implements Comparable<Dog>, Animal {

	private int age;

	public Dog(int age) {
		super();
		this.age = age;
	}

	@Override
	public String getName() {
		return "I am a dog";
	}

	public int getAge() {
		return age;
	}

	@Override
	public int compareTo(Dog o) {
		return age - o.age;
	}

}
