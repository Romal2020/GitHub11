package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeCssAndXpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/ChromeDriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://166.62.36.207/syntaxpractice/index.html");
		driver.findElement(By.cssSelector("a#btn_basic_example"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("a#btn_basic_example")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[placeholder^= 'please enter']")).sendKeys("Batch 7 rock!!!");
	}

}
