package com.ailhanli.ex2;

public class CustomerTest {

	public static void main(String[] args) {
		CustomerContainer cc = new CustomerContainer();
		cc.addCustomer("abdullah");
		cc.addCustomer("omer");
//breaks encapsulation if directly access container data		
//		cc.getCustomers().clear();
//		cc.getCustomers().forEach(System.out::println);

//iterator.remove breaks encapsulation
//		cc.iterator().forEachRemaining(System.out::println);
//		cc.iterator().remove();

//breaks encapsulation you can change customer in list
//		cc.getCustomers2().forEach(System.out::println);
//		cc.getCustomers2().get(0).setName("Bobi");
		

//it is better than previous
//		cc.getCustomers3().forEach(System.out::println);
		//cc.getCustomers3().set(0, new Customer("Momi")); //Exception in thread "main" java.lang.UnsupportedOperationException

//returning mutable reference from a class escape reference!		
//		Customer customer = cc.getCustomer("abdullah");
//		customer.setName("bobi");
//		cc.getCustomers3().forEach(System.out::println);

		
//Prevented escape reference. It doenst allow setName
		System.out.println();
//		CustomerReadOnly customer = cc.getCustomer2("abdullah");
		//customer.setName("bobi");
//		cc.getCustomers3().forEach(System.out::println);
		
		System.out.println();
		Customer customer2 = (Customer)cc.getCustomer2("abdullah");
		customer2.setName("bobi");
		cc.getCustomers3().forEach(System.out::println);
		
	}

}
