package com.syntax.class35;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Recap {

	public static void main(String[] args) throws IOException {
		String xlFilepath = System.getProperty("user.dir") + "/testData/SampleDataTest.xlsx";
		FileInputStream fis = new FileInputStream(xlFilepath);
		Workbook book = new XSSFWorkbook(fis);
		Sheet sheet = book.getSheet("Sample");
		int rows = sheet.getPhysicalNumberOfRows();
		int cols = sheet.getRow(0).getPhysicalNumberOfCells();
		List<Map<String, String>> xlList = new ArrayList<>();
		Map<String, String> lmap;
		for (int r = 1; r < rows; r++) {
			lmap = new LinkedHashMap<>();
			for (int c = 0; c < cols; c++) {
				lmap.put(sheet.getRow(0).getCell(c).toString(), sheet.getRow(r).getCell(cols).toString());
			}

			xlList.add(lmap);
		}
	}
}
