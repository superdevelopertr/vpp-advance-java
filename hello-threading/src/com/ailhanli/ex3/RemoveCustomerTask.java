package com.ailhanli.ex3;

import com.ailhanli.ex2.Customer;

public class RemoveCustomerTask implements Runnable {

	private CustomerManager cm;
	
	public RemoveCustomerTask(CustomerManager cm) {
		this.cm = cm;
	}
	
	public void run() {
		while(true) {
			Customer customer = cm.removeCustomer();
			System.out.println("Removed "+customer);
		}
	}
}