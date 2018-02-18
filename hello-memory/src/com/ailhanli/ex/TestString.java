package com.ailhanli.ex;

public class TestString {

	public static void main(String[] args) {
		
		String s1 = "Abdullah";
		String s2=	"Abdullah";
		
		if(s1==s2){
			System.out.println("These are same String obj");
		}else{
			System.out.println("These are Different String objs");
		}
		
		String s3 = new Integer(76).toString();
		String s4 = "76";
		if(s3==s4){
			System.out.println("These are same String obj");
		}else{
			System.out.println("These are Different String objs");
		}
		
		if(s3.equals(s4)){
			System.out.println("These strings have same value");
		}
		
		
		s3 = new Integer(76).toString().intern();
		
		if(s3==s4){
			System.out.println("These are same String obj");
		}else{
			System.out.println("These are Different String objs");
		}
		
	}
	
}