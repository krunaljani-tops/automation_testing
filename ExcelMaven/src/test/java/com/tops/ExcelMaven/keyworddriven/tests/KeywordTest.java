package com.tops.ExcelMaven.keyworddriven.tests;

import org.testng.annotations.Test;

import com.tops.ExcelMaven.keyworddriven.keywords.ActionKeywords;
import com.tops.ExcelMaven.keyworddriven.utils.ExcelUtils;

public class KeywordTest {
	  @Test
	    public void runTest() throws Exception {
	        ExcelUtils excel = new ExcelUtils("testdata/testSteps.xlsx");

	        for (int i = 1; i < excel.getRowCount(); i++) {
	            String keyword = excel.getCellData(i, 1);
	            String locatorType = excel.getCellData(i, 2);
	            String locatorValue = excel.getCellData(i, 3);
	            String data = excel.getCellData(i, 4);

	            switch (keyword) {
	                case "openBrowser":
	                    ActionKeywords.openBrowser();
	                    break;
	                case "navigate":
	                    ActionKeywords.navigate(data);
	                    break;
	                case "enterText":
	                    ActionKeywords.enterText(locatorType, locatorValue, data);
	                    break;
	                case "click":
	                    Thread.sleep(1000);  // Wait for the page to load
	                    ActionKeywords.click(locatorType, locatorValue);
	                    break;
	                case "closeBrowser":
	                    ActionKeywords.closeBrowser();
	                    break;
	                default:
	                    System.out.println("Unknown keyword: " + keyword);
	            }
	        }
	    }

}
