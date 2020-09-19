package com.syntax.class35;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionIntro {

	public static void main(String[] args) throws FileNotFoundException {
		String xlFilepath = System.getProperty("user.dir") +"/SampleDataTest.xlsx";
	//	FileInputStream fis = new FileInputStream(xlFilepath);
		
		int a = 10;
		int b = 0;
		System.out.println(a / b);
		int[] arr = {100, 200};
		System.out.println(arr[2]);
//		ArrayIndexOutOfBoundsException ae = new ArrayIndexOutOfBoundsException();
//		throw ae;
		System.out.println("End of the code ");
	}

}
