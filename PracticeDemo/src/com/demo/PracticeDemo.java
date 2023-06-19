package com.demo;

public class PracticeDemo {
public static void main(String[] args) {
	
}
}

 class Test {
	private int a; // instance variable
	static int b; //static variable
	public static int d;
	
	
	{ // instance block
		int c = 100;
		System.out.println("inside instance  block");
	}
	
	static { // static block
		System.out.println("inside static block");
	}
	
	void m1() { // instance method
		System.out.println("inside instance method ");
	}
	
	static void m2 () { // static method
		System.out.println(" inside static method");
	}
} 
 
 class Test2 {
	 
	 { // instance block
			int c = 100;
			System.out.println("inside instance  block");
		}
		
		static { // static block
			System.out.println("inside static block");
		}
		
		void m3() { // instance method
			System.out.println("inside instance method ");
		}
		
		static void m4 () { // static method
			System.out.println(" inside static method");
		}
	 
	 
	 
	 
 }

 