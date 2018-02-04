package com.ailhanli.ex1;

public class StringUtilTest {

	public static void main(String[] args) {
		
		StringUtil<Customer, Integer>  util = new StringUtil<Customer, Integer>(new Customer("abdullah",12), 12);
		System.out.println(util.toString());
	}

}
