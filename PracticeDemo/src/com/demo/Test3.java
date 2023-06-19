package com.demo;

public class Test3 {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	void m1() { // instance method
		System.out.println("inside instance method ");
		System.out.println(" accessed from another class through class name " +Test.b);
	}
	
	static void m2 () { // static method
		System.out.println(" inside static method");
	}
}
