package com.demo1;

public class DataMembers {
 int a=1; // instance var -- i/s class but o/s method 
 static int b=2; // static var -- with static keyword i/s class and o/s method 
 
 void add()
 {
	 System.out.println("instance method");
 }
 
 static void sub ()
 {
	System.out.println("static method"); 
 }
 
 int sum ()    // instance method with datatype
 {
	 return 20;
 }
 
 {
	 System.out.println("this is an instance block");
 }
 
 static {
	 System.out.println("this is an static block ");
 }
 
 
 public static void main(String[] args) {
	int c = 3; // local var -- i/s method -- limited scope
	 
}
//class loading - static field gets scan and memory assigned 1 time
 // static blocks get executed
 //main method loads
 //object creation - instance field gets memory multiple times
 //instance blocks gets executed
}
