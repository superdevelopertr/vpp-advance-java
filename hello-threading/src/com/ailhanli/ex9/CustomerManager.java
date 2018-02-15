package com.ailhanli.ex9;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import com.ailhanli.ex2.Customer;

public class CustomerManager {

	private List<Customer> customerList = new ArrayList<>();

	private Lock customerLock = new ReentrantLock();

	private Condition dataAvailable = customerLock.newCondition();

	private Condition spaceAvailable = customerLock.newCondition();

	public void addCustomer(Customer cust) {
		customerLock.lock();
		if (customerList.size() > 100) {
			try {
				dataAvailable.signalAll();
				spaceAvailable.await();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("SIZE in add : "+customerList.size());

		customerList.add(cust);	
		customerLock.unlock();
	}

	public List<Customer> getCustomerList() {
		return customerList;
	}

	public Customer removeCustomer() {
		customerLock.lock();
		try {
			while (customerList.size() == 0) {
				try {
					spaceAvailable.signalAll();
					dataAvailable.await();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			Customer customer = customerList.remove(0);
			System.out.println("SIZE in remove : "+customerList.size());
			return customer;
		} finally {
			customerLock.unlock();
		}
	}
}