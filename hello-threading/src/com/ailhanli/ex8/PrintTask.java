package com.ailhanli.ex8;

public class PrintTask implements Runnable{
	
	private Double add() throws InterruptedException {
		double val = 1.2;
		for(long i = 0 ; i<1000_000_000;i++ ) {
			val+=1.2;
			if(Thread.interrupted()) {
				throw new InterruptedException();
			}
			
		}
		return val;
	}

	@Override
	public void run() {
		System.out.println("Task is started.");
		System.out.println("Thread name is "+Thread.currentThread().getName());
		Double result = 1d;
		try {
			result = add();
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}		
		
		System.out.println("Result is "+result);
	}
}