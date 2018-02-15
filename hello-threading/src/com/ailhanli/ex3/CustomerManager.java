package com.ailhanli.ex3;

import java.util.ArrayList;
import java.util.List;

import com.ailhanli.ex2.Customer;

public class CustomerManager {

	private List<Customer> customerList = new ArrayList<>();
	
	public void addCustomer(Customer cust){
		synchronized (this) {
			customerList.add(cust);
			notifyAll();
		}
	}
	
	
	public Customer  removeCustomer(){
		synchronized (this) {
			while(customerList.size()==0) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			return customerList.remove(0);
		}
	}
}