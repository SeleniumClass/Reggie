package com.automation;

import org.openqa.selenium.WebDriver;

public class ProductList_Selection {
	static WebDriver driver;
	
	public static void main(String[] args) throws Throwable{
		
		//ProductList_Selection obj = new ProductList_Selection(); inheritance if WebDriver is non static
		//driver= obj.login(driver); 
		LoginfunctionTest.login(driver);
		Thread.sleep(1500);
	}
	
}
