package com.tops.ExcelMaven.moduledriven.utils;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	 private XSSFSheet sheet;

	    public ExcelUtils(String excelPath) throws Exception {
	        FileInputStream fis = new FileInputStream(excelPath);
	        XSSFWorkbook workbook = new XSSFWorkbook(fis);
	        sheet = workbook.getSheetAt(0);
	    }

	    public String getCellData(int row, int col) {
	        return sheet.getRow(row).getCell(col).toString();
	    }

}
