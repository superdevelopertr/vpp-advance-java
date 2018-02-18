package com.ailhanli.ex;

public class TestSystemGC {

	public static void main(String[] args) {
		
		System.out.println("Free memory is "+Runtime.getRuntime().freeMemory());
		for(int i=0;i<300_000;i++){
			Customer c = new Customer(i);
			c.getClass();
		}
		//System.gc();
		
		System.out.println("Free memory is "+Runtime.getRuntime().freeMemory());

		
		while(true){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Number of GCd "+Customer.numberOfGcd);
		}

	}
}
