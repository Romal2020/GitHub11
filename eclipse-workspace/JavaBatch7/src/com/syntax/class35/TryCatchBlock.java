package com.syntax.class35;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchBlock {

	public static void main(String[] args) {
		
		String xlFilePath = System.getProperty("user.dir") + "/SampleDataTest.xlsx";
		
		try {
		
			FileInputStream fis = new FileInputStream(xlFilePath);
		} catch (FileNotFoundException fne) {
			System.out.println("I caught the exception");
		
	}

	int[]array = {10, 20,30};
	
	try{
		System.out.println("I am a beginning of the try block ");
		System.out.println(array[3]);
		System.out.println("I am the end of the try block ");
	}catch(ArrayIndexOutOfBoundsException aiob){
		System.out.println("I am a beginning of the catch block ");
		System.out.println("I caught Array Index Out Of Bounds Exception !");
		System.out.println("I am the end of the catch block ");
	}
		System.out.println("End of the code");
	}

}
