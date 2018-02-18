package com.ailhanli.ex2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class CustomerContainer implements Iterable<Customer>{
	List<Customer> customers = new ArrayList<>();
	
	public void addCustomer(String name) {
		customers.add(new Customer(name));
	}

	public Customer getCustomer(String name) {
		return customers.stream().filter(a->a.getName().equals(name)).collect(Collectors.toList()).get(0);
	}
	
	public CustomerReadOnly getCustomer2(String name) {
		return customers.stream().filter(a->a.getName().equals(name)).collect(Collectors.toList()).get(0);
	}
	
	@Override
	public Iterator<Customer> iterator() {
		return customers.iterator();
	}
	
	public List<Customer> getCustomers() {
		return customers;
	}
	
	public List<Customer> getCustomers2() {
		return new ArrayList<>(customers);
	}
	
	public List<Customer> getCustomers3(){
		return Collections.unmodifiableList(customers);
	}
	
}