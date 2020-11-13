package com.syntax.test;

import java.io.File;
//import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


import com.syntax.Utils.BaseClass;
import com.syntax.pages.DashboardPage;
import com.syntax.pages.LoginPageWithFindBy;

public class LoginTestWithFindBy {

	public static void main(String[] args) {
	BaseClass.setUp();
	LoginPageWithFindBy login = new LoginPageWithFindBy();
	DashboardPage dashboard = new DashboardPage();
	login.userNametextBox.sendKeys("Admin");
	login.paswordTextBox.sendKeys("Hum@nhrm123");
	login.loginBtn.click();
	
	TakesScreenshot ts =(TakesScreenshot)BaseClass.driver;
	File file = ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(file, new File("screenshot/HRMS/dashboard.png"));
	
	
	String adminText = dashboard.welcomeAdmin.getText();
	System.out.println(adminText);
	}

}
