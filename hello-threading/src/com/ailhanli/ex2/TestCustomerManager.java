package com.ailhanli.ex2;

public class TestCustomerManager {

	public static void main(String[] args) {
		CustomerManager custManager = new CustomerManager();
		CustomerGenerator generator = new CustomerGenerator(custManager);
		
		for (int i = 0; i < 10; i++) {
			new Thread(generator ).start();
		}
	
		while(true) {
			custManager.howManyCustomers();
			custManager.printCustomers();
		}
		
	}
}