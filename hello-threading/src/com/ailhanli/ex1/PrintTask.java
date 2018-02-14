package com.ailhanli.ex1;

import java.util.stream.IntStream;

public class PrintTask implements Runnable {
	@Override
	public void run() {
		IntStream.rangeClosed(1, 4).forEach(a->{
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+" "+ a);
		});
	}
}