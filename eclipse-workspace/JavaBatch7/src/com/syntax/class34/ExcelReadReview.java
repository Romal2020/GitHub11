package com.syntax.class34;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadReview {

	public static void main(String[] args) throws IOException {
		String xlFilePath = System.getProperty("user.div") + "/testdata/SampleTestData.xlsx";

		FileInputStream fis = new FileInputStream(xlFilePath);

		Workbook wbook = new XSSFWorkbook(fis);

		Sheet sheet = wbook.getSheet("Sample");
		Row row2 = sheet.getRow(1);
  String callValue = sheet.getRow(1).getCell(3).toString();
  System.out.println(callValue);
  int rows = sheet.getPhysicalNumberOfRows();
  int cols = sheet.getRow(0).getLastCellNum();
  
  for(int r= 0; r<rows; r++) {
	  for(int c = 0; c<cols; c++) {
		  String value = sheet.getRow(r).getCell(c).toString();
		  System.out.println();
	  }
  }
	}

}
