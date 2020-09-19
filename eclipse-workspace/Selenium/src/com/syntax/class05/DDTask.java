package com.syntax.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

 
public class DDTask {

	public static String url = "https://www.facebook.com/r.php";
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		WebElement monthDD = driver.findElement(By.id("month"));
		Select selectMonth = new Select(monthDD);
		List<WebElement> optionsMonth = selectMonth.getOptions();
		if(optionsMonth.size() - 1 == 12) {
			System.out.println("Option of  month is correct");
		} else {
			System.out.println("Option of month is not correct");
		}
		WebElement yearDD = driver.findElement(By.id("year"));
		Select selectYear = new Select(yearDD);
		List<WebElement> optionsYear =  selectYear.getOptions();
		if(optionsYear.size() - 1 == 115) {
			System.out.println("Options of year size is correct");
		} else {
			System.out.println("Options of year size is not correct");
		}
		System.out.println(optionsYear.size());
		Thread.sleep(2000);
		
		driver.close();
		
		
		
		
		
		
		

	}

}
