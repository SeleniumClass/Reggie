package com.testing;

public class Testdatatype {

	public static void main(String[] args) {
		
		//int salary; //declaration
		//salary= 5000; //initialization
		
		int salary=5000;
		String Password="123";
		
		int mysalary=Integer.parseInt(Password);//Conversion to int
		
		double mysalary2=Double.parseDouble(Password);
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$");
		System.out.println("My Salary::" + salary);
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$");
		System.out.println("My Salary::" + Math.pow(salary, 2));
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$");
		System.out.println("Passord::" + Password+ Password);
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$");
		System.out.println("Passord::" + mysalary);
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$");
		System.out.println("Passord::" + mysalary2);
	}
}
