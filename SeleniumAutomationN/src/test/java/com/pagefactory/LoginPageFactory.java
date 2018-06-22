package com.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author Reggie
 *
 */
public class LoginPageFactory {

	
	
	
	
	//Login function XPATH
	
	@FindBy(how=How.XPATH,using="//*[contains(text(),'My Account']")
	private WebElement MyAcctBtn;

	@FindBy(how=How.XPATH,using="//*[contains(@name,'email_address')]")
	private WebElement EmailAddress;
	
	@FindBy(how=How.XPATH,using="//*[contains(@name,'password')]")
	private WebElement Password;
	
	@FindBy(how=How.XPATH,using="(//*[contains(@class,'ui-button-text')])[10]")
	private WebElement SignInBtn;

	//all getter methods
	
	public WebElement getMyAcctBtn() {
		return MyAcctBtn;
	}

	public WebElement getEmailAddress() {
		return EmailAddress;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getSignInBtn() {
		return SignInBtn;
	}

	
	}

