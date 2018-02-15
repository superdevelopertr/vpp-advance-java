package com.ailhanli.ex6;

public class HelloThreading {
	
	public static void main(String[] args) {
		System.out.println("Hello world!");
	
		Thread thread = new Thread(new PrintTask());
		thread.start();
		
		Thread thread2 = new Thread(new PrintTask());
		thread2.start();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		try {
			thread.join();
			thread2.join();
		} catch (Exception e) {
		}
		
		System.out.println("Main finished");
	}
}
