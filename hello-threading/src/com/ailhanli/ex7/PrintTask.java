package com.ailhanli.ex7;

import java.util.concurrent.Callable;

public class PrintTask implements Callable<Double> {
	
	private Double add() throws InterruptedException {
		double val = 1.2;
		for(long i = 0 ; i<1000_000_000;i++ ) {
			val+=1.2;
			if(Thread.interrupted()) {
				throw new InterruptedException();
			}
			System.out.println(val);
		}
		return val;
	}

	@Override
	public Double call() throws Exception {
		System.out.println("Task is started.");
		System.out.println("Thread name is "+Thread.currentThread().getName());
		Double result = 1d;
		try {
			result = add();
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
		
		return result;
	}
}