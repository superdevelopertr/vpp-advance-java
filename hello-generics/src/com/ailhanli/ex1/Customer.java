package com.ailhanli.ex1;

public class Customer {
	private String fullname;
	private int id;

	public Customer() {
	}

	public Customer(String fullname, int id) {
		super();
		this.fullname = fullname;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Customer [fullname=" + fullname + ", id=" + id + "]";
	}
}