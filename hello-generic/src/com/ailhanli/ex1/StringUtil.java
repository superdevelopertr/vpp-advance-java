package com.ailhanli.ex1;

public class StringUtil<A, B> {
	private A a;
	private B b;

	public StringUtil(A a, B b) {
		this.a = a;
		this.b = b;
	}

	public A getA() {
		return a;
	}

	public B getB() {
		return b;
	}

	@Override
	public String toString() {
		return (new StringBuilder().append("StringUtil[").append("a: ").append(a.toString()).append(", b: ")
				.append(b.toString()).append("]")).toString();
	}
}
