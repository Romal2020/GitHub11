package com.syntax.TestNG2Review;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.Review01.CommonMethods;

public class SynconizationInSelenium  extends CommonMethods{
public static void main(String[] args) throws InterruptedException {
	setUp("chrome", "https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	driver.findElement(By.id("btnLogin")).click();
	
	driver.findElement(By.linkText("Leave")).click();
	driver.findElement(By.linkText("LeaveList")).click();
	driver.findElement(By.id("leaveList[calFromDate]")).click();
	Thread.sleep(3000);
	WebElement months = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']/select[1]"));
	WebElement fromCal=driver.findElement(By.id("calFromDate"));
	WebElement years =driver.findElement(By.xpath("//div[@class='ui-datepicker-title']/select[2]"));
	fromCal.click();
	WebElement ms= driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
	Select mSelect=new Select (months);
	Select ySelect=new Select(years);
	mSelect.deselectByVisibleText("May");
	mSelect.deselectByVisibleText("Jul");
	WebElement ys =driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
	Select yearsSelect=new Select(years);
	ySelect.selectByVisibleText("2019");
	Thread.sleep(3000);
	driver.quit();
	
	List<WebElement>days = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
	for(WebElement day:days) {
		if(day.getText().equals("19")) {
			
		day.click();
	}
	}		
}
}
