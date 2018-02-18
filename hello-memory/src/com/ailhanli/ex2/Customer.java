package com.ailhanli.ex2;

public class Customer implements CustomerReadOnly {

	private String name;

	public Customer(String name) {
		super();
		this.name = name;
	}

	/* (non-Javadoc)
	 * @see com.ailhanli.ex1.CustomerReadOnly#getName()
	 */
	@Override
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + "]";
	}
}