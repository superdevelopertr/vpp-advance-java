package com.ailhanli.ex2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomerManager {

	private List<Customer> customerList = Collections.synchronizedList(new ArrayList<Customer>());

	private int id = 0;

	public void addCustomer(Customer customer) {
		synchronized (this) {
			customer.setId(id);
			id++;
		}

		customerList.add(customer);
	}

	public void howManyCustomers() {
		System.out.println("We have a list of customers which has " + customerList.size() + " elements");
	}

	public  void printCustomers() {
		synchronized (customerList) {
			for (Customer customer : customerList) {
				System.out.println(customer);
				
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
