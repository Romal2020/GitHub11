package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Romal\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		// drivers/chromedriver.exe for windows users
		// you can use double backwards slash \\

		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String title = driver.getTitle();
		System.out.println(title);

	}

}
