package com.syntax.class35;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MultipleCatchBlocks {

	public static void main(String[] args) {
		String xlFilePath = System.getProperty("user.dir") + "/testData/SampleDataTest.xlsx";
		try {
			FileInputStream fis = new FileInputStream(xlFilePath);
			fis.close();
			Workbook wb = new XSSFWorkbook(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
         System.out.println("--------");
	}

}
