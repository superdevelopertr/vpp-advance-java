package com.ailhanli.ex2;

import java.util.Random;

public class CustomerGenerator implements Runnable {

	private CustomerManager custMan;

	public CustomerGenerator(CustomerManager custMan) {
		super();
		this.custMan = custMan;
	}

	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(new Random().nextInt(500));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			Customer customer = new Customer("Test Customer");
			custMan.addCustomer(customer);
		}
	}

}
