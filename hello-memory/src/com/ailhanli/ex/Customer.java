package com.ailhanli.ex;

public class Customer {
	
	public static int numberOfGcd=0;

	private int id;

	public Customer(int id) {
		this.id = id;
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println(id+" is GC'd");
		numberOfGcd++;
	}
}
