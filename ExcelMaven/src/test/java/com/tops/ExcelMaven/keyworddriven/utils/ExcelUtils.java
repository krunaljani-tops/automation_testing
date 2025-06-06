package com.tops.ExcelMaven.keyworddriven.utils;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	XSSFWorkbook workbook;
	XSSFSheet sheet;

    public ExcelUtils(String excelPath) throws Exception {
        FileInputStream fis = new FileInputStream(excelPath);
        workbook = new XSSFWorkbook(fis);
        sheet = workbook.getSheetAt(0);
    }

    public int getRowCount() {
        return sheet.getPhysicalNumberOfRows();
    }

    public String getCellData(int row, int col) {
        return sheet.getRow(row).getCell(col).toString();
    }
}
