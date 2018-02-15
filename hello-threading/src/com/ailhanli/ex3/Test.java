package com.ailhanli.ex3;

public class Test {
	public static void main(String[] args) {
		CustomerManager cm = new CustomerManager();
		RemoveCustomerTask removeTask = new RemoveCustomerTask(cm);
		
		new Thread(removeTask).start();
		System.out.println("Remove thread started");
		
		for(int i=0;i<5;i++) {
			AddCustomerTask addTask = new AddCustomerTask(cm, i*100);
			Thread thread = new Thread(addTask);
			thread.start();
			
			System.out.println(thread.getName()+" is started");
		}
		
	}
} 