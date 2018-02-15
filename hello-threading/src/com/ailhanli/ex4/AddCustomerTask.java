package com.ailhanli.ex4;

import com.ailhanli.ex2.Customer;

public class AddCustomerTask implements Runnable {

	private CustomerManager cm;

	private int startPoint;

	public AddCustomerTask(CustomerManager cm, int startPoint) {
		this.cm = cm;
		this.startPoint = startPoint;
	}

	@Override
	public void run() {
		for (int id = startPoint; id < startPoint + 1000; id++) {
			Customer customer = new Customer("Test-" + id);
			customer.setId(id);
			cm.addCustomer(customer);
			System.out.println(Thread.currentThread().getName() + " Added customer" + id);

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
}