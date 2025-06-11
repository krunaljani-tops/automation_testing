package com.tops.ExcelMaven.moduledriven.modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchModule {
	 public static void search(WebDriver driver, String item) {
	        driver.findElement(By.name("q")).sendKeys(item);
	        //driver.findElement(By.name("searchBtn")).click();
	    }
}
