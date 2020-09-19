package com.syntax.class33;


import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class ReadinfPropertyFile {

	public static void main(String[] args) throws IOException {
		String filePath="C:\\Users\\Romal\\eclipse-workspace\\JavaBatch7\\configs\\Example.properties";
		FileInputStream fis = new FileInputStream(filePath);
		Properties prop = new Properties();
		prop.load(fis);
		String value1 = prop.getProperty("username");
		System.out.println(value1);
		String value2 = prop.getProperty("password");
		System.out.println(value2);
		String value3 = prop.getProperty("company");
		System.out.println(value3);
		String value4 = prop.getProperty("city");
		System.out.println(value4);
		String value5 = prop.getProperty("SSN");
		System.out.println(value5);
		
	}

}
