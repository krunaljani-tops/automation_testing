package com.tops.ExcelMaven;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 XSSFWorkbook workbook = new XSSFWorkbook();
	        XSSFSheet sheet = workbook.createSheet("TestData");

	        Row row = sheet.createRow(0);
	        row.createCell(0).setCellValue("Username");
	        row.createCell(1).setCellValue("Password");

	        Row row1 = sheet.createRow(1);
	        row1.createCell(0).setCellValue("admin");
	        row1.createCell(1).setCellValue("admin123");

	        FileOutputStream fos = new FileOutputStream("testdata/data.xlsx");
	        workbook.write(fos);
	        workbook.close();
	        fos.close();
	        System.out.println("Data written to Excel successfully.");

	}

}
