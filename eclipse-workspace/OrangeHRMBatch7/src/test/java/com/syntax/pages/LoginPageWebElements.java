package com.syntax.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.Testbase.BaseClass;

public class LoginPageWebElements extends BaseClass {

	

		@FindBy(id = "txtUsername")
		public WebElement username;
		
		@FindBy(id = "txtpassword")
		public WebElement password;
		
		@FindBy(id = "btnLogin")
		public WebElement loginBtn;
		@FindBy(id="spanMessage")
		public WebElement errMsg;
		
		public LoginPageWebElements() {
			PageFactory.initElements(driver, this);
		
	}
}