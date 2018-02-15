package com.ailhanli.ex8;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class HelloThreading {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ScheduledExecutorService es = Executors.newSingleThreadScheduledExecutor();
		PrintTask task = new PrintTask();
		es.scheduleAtFixedRate(task, 0, 5, TimeUnit.SECONDS);
	}
}
