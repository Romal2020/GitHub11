package com.syntax.Review02;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.Review01.CommonMethods;

public class DropDownsAndMultipleSelections extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		setUp("chrome", "https://www.ebay.com/");
		WebElement departments = driver.findElement(By.id("gh-cat"));
		Select depSelect=new Select(departments);
	    List<WebElement> options=depSelect.getOptions();
	    int numOfOptions=options.size();
	    System.out.println("Number of department : "+numOfOptions);
	    Iterator <WebElement>dIt=options.iterator();
	    while(dIt.hasNext()) {
	    	WebElement option=dIt.next();
	    	System.out.println(option.getText());
	    	Thread.sleep(2000);
	    }
	}

}
