package com.syntax.Review01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumRecap {
	// selenium is an Interface
	// GUI Graphical user Interface
	// API -->Application programming Interface-- postmanAPI --automate In Java
	// DataBase -- we keep all the data with tables --SQL (structered
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/ChromeDriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
	}
}
