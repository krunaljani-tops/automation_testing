package com.tops.ExcelMaven.moduledriven.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.tops.ExcelMaven.moduledriven.modules.LoginModule;
import com.tops.ExcelMaven.moduledriven.modules.SearchModule;
import com.tops.ExcelMaven.moduledriven.utils.ExcelUtils;

public class AppTest {
	WebDriver driver,search;
    ExcelUtils excel;

    @BeforeClass
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        search=new ChromeDriver();
        search.manage().window().maximize();
        search.get("https://www.google.com/");
        excel = new ExcelUtils("testdata/module.xlsx");
    }

    @Test
    public void testLoginAndSearch() {
        String username = excel.getCellData(1, 0);
        String password = excel.getCellData(1, 1);
        String searchItem = excel.getCellData(1, 2);
        System.out.println(username);
        LoginModule.performLogin(driver, username, password);
        SearchModule.search(search, searchItem);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
