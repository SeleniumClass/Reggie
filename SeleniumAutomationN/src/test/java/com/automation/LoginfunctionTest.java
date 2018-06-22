package com.automation;

import javax.swing.text.Highlighter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert; //ctrl+shift+alt= import all


public class LoginfunctionTest {

	public static WebDriver login(WebDriver driver) throws Throwable { //Java can only read main method, main method is fixed (cannot change public static void main) main is method name
		// TODO Auto-generated method stub; static= JVM do not need create object; void= no return, main method never return any value; public= accessible for any class/package
			// inside ()= parameter => string array sign 
		System.setProperty("webdriver.chrome.driver","C://Users//Reggie//eclipse-workspace//SeleniumAutomation//Driver//chromedriver.exe");
			driver = new ChromeDriver(); // webdriver= interface, driver= object, ChromDriver= Class
			driver.get("http://www.gcrit.com/build3/");
			driver.manage().window().maximize();
			
			WebElement myaccountbtn=driver.findElement(By.xpath("(//*[@class='ui-button-text'])[3]")); //identify whole object; Locator
		
			
			JavascriptExecutor object = (JavascriptExecutor) driver;
			object.executeScript("arguments[0].style.border= '3px solid green'", myaccountbtn);
			myaccountbtn.click();
			Thread.sleep(3000);
			
			WebElement loginpageTitle = driver.findElement(By.xpath("//*[contains(text(),'Welcome, Please Login']"));
			HighLighter.getDrawRedCoLor( driver,loginpageTitle);
			
			WebElement email=driver.findElement(By.xpath("(//*[@name='email_address'])"));
			email.sendKeys("sarowerny@gmail.com"); //sendKeys()= type
			HighLighter.getDrawBlueCoLor( driver,email);
			Thread.sleep(3000);
			WebElement password=driver.findElement(By.xpath("(//*[@name='password'])"));
			password.sendKeys("student ");
			HighLighter.getDrawBlueCoLor( driver,email);
			Thread.sleep(3000);
			WebElement loginbtn=driver.findElement(By.xpath("(//*[@class='ui-button-icon-primary ui-icon ui-icon-key'])"));
			HighLighter.getDrawBlueCoLor( driver,email);
			loginbtn.click();
			Thread.sleep(4000);
	
	WebElement myaccountPage=driver.findElement(By.xpath("//*[contains(text(),'My Account Information']"));
			HighLighter.getDrawRedCoLor( driver,myaccountPage);
		if (myaccountPage.getText().equalsIgnoreCase("My Account Information")) {
			System.out.println("Got the My Account Page: :" +myaccountPage.getText());}
		else {System.out.println("Test Failed>>>> Page Title::" + myaccountPage.getText());}
//validation
	Assert.assertEquals("GCR Shop",driver.getTitle(),"Test Passed");
//verification
	if(driver.getTitle().equalsIgnoreCase("GCR Shop")) {
		System.out.println("Test Passed>>>Page Title:"+ driver.getTitle());}
		else {System.out.println("Test Failed >>> Page Title:"+ driver.getTitle());}
return driver;
	}
	
}
