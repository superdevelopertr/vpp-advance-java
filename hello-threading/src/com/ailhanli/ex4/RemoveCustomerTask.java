package com.ailhanli.ex4;

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
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}