package com.ailhanli.ex7;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class HelloThreading {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService es = Executors.newFixedThreadPool(2);
		PrintTask task = new PrintTask();
		Future<Double> result = es.submit(task);

		while(!result.isDone()) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println("still waiting...");
		}
		System.out.println("Result is "+result.get());

		System.out.println(es.isShutdown());
	}
}
