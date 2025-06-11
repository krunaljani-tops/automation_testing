package com.tops.ExcelMaven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		  FileInputStream fis = new FileInputStream("testdata/data.xlsx");
	        XSSFWorkbook workbook = new XSSFWorkbook(fis);
	        XSSFSheet sheet = workbook.getSheet("TestData");
	        
	        for (Row row : sheet) {
	            for (Cell cell : row) {
	                System.out.print(cell.toString() + "\t");
	            }
	            System.out.println();
	        }

	        workbook.close();
	        fis.close();
	}

}
