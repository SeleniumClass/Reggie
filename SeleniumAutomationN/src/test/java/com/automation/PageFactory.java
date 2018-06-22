package com.automation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageFactory {

		@FindBy(how=How.XPATH, using="//*[@name='email_address']")
		private WebElement UserName;

		public WebElement getUserName() { //encapsulation
			return UserName;
		}
		
		
}
