package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithKeys {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/ChromeDriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/default.aspx");
		driver.findElement(By.xpath("//input[@type = 'text']")).sendKeys("Tester", Keys.TAB);
		driver.findElement(By.xpath("//input[@id = 'ctl00_MainContent_password']")).sendKeys("test",Keys.ENTER);

	}

}
