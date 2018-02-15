package com.ailhanli.ex4;

import java.util.ArrayList;
import java.util.List;

import com.ailhanli.ex2.Customer;

public class CustomerManager {

	private List<Customer> customerList = new ArrayList<>();
	
	public void addCustomer(Customer cust){
		synchronized (this) {
			if(customerList.size()>100) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			customerList.add(cust);
			notifyAll();
		}
	}
	
	
	public List<Customer> getCustomerList() {
		return customerList;
	}
	
	public Customer  removeCustomer(){
		synchronized (this) {
			while(customerList.size()==0) {
				try {
					notifyAll();
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			Customer customer =  customerList.remove(0);
			return customer;
		}
	}
}