package com.testing; // package name= testing, naming convention= com.location.xxx

public class Test { //class= collection/blueprint of objects; imaginary
					//class name= Test (1st letter caps)

	public static void getsalary() { // static= method is class lvl, no static= method is object lvl 
									// method name= in front of parentheses; method= behavior of object
		System.out.println("Hello World");
	}
	
	public void getmoney() {               //void= no need return statement; object lvl 
		System.out.println("Excel");
	}

	public static int getfood() {
		System.out.println("DB");
		return 0;
		
	}
	
	public static void main(String[] args) { // main method
		Test object = new Test(); // Create new object: Classname Objectname= new Classname();
		object.getmoney();  // recalling method for void method
		
		Test.getsalary();//recalling method for static method CLASSNAME.Methodname();
		
		Test.getfood();
	}
	
}

