package com.tops.ExcelMaven;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

//import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderUtil {
	
	@DataProvider(name = "loginData")
	    public Object[][] getData() throws Exception {
	        FileInputStream fis = new FileInputStream(new File("testdata/testdata.xlsx"));
	        XSSFWorkbook workbook = new XSSFWorkbook(fis);
	        XSSFSheet sheet = workbook.getSheetAt(0);

	        int rowCount = sheet.getPhysicalNumberOfRows();
	        Object[][] data = new Object[rowCount - 1][2]; // skip header row

	        Iterator<Row> rowIterator = sheet.iterator();
	        rowIterator.next(); // skip header
	        int i = 0;

	        while (rowIterator.hasNext()) {
	            Row row = rowIterator.next();
	            data[i][0] = row.getCell(0).getStringCellValue();
	            data[i][1] = row.getCell(1).getStringCellValue();
	            i++;
	        }

	        workbook.close();
	        fis.close();
	        return data;
	    }
}
