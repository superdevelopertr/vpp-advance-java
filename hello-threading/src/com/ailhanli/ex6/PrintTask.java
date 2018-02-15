package com.ailhanli.ex6;

public class PrintTask implements Runnable {
	@Override
	public void run() {
		for(int i = 0;i<1000;i++ ) {
			if(Thread.interrupted()) {
				System.out.println(Thread.currentThread()+" is finished");
				return;
			}
			System.out.println(Thread.currentThread().getName()+" is processing "+ i);
		}		
	}
}