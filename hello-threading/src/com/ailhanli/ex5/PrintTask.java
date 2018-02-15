package com.ailhanli.ex5;

public class PrintTask implements Runnable {
	
	private void add() throws InterruptedException {
		double val = 1.2;
		for(long i = 0 ; i<1_000_000;i++ ) {
			val+=val;
			if(Thread.interrupted()) {
				throw new InterruptedException();
			}
		}
	}
	
	@Override
	public void run() {
		for(int i = 0;i<1_000_000;i++ ) {
			
			try {
				add();
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
			
			if(Thread.interrupted()) {
				System.out.println(Thread.currentThread()+" is finished");
				return;
			}
			System.out.println(Thread.currentThread().getName()+" is processing "+ i);
		}		
	}
}