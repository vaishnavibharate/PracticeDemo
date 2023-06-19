package com.demo1;

public class CallingDemo {

	public static void main(String[] args) {
		test t= new test();
		 
	}
}
	class test {
		int a;		//instance variable
	static int b;	// static variable
	
	  void m1()		//instance method
	{ int c=1;		//local variable
	System.out.println("default value of a ==== " +a);
	System.out.println("value of c ==== "+c);
		}
	 
	static void m2 () { // static method
		test t= new test();
		System.out.println("instance variable access through object ==== " + t.a);
		System.out.println("default value of b ==== " +b);
	}
	
	{// instance block
		System.out.println("default value of a ==== " +a);
	    System.out.println("given value of a ==== " +b);
	}
	
	static { // static block
		test t= new test();
		System.out.println("static block");
		System.out.println(" executed");
		t.m1(); 
	 }
	}
	
	class testdemo{
		public static void main(String[] args) {
			 testdemo t1 = new testdemo();
			System.out.println("access the variables " +test.b);
			System.out.println();
		}
	}
	

