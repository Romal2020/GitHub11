package com.syntax.class35;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTypes {
	public static void main(String[] args) throws FileNotFoundException {

		String filePath = System.getProperty("user.dir") +"/testData/SampleDataTest.xlsx";
		//FileInputStream fis = new FileInputStream(filePath);
		int a =12;
		int b = 0;
		System.out.println(a/b);
		
		String str = null;
		System.out.println(str.length());
	}
}
