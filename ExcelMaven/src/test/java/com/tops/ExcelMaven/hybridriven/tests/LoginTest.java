package com.tops.ExcelMaven.hybridriven.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.tops.ExcelMaven.hybridriven.base.BaseTest;
import com.tops.ExcelMaven.hybridriven.pages.LoginPage;
import com.tops.ExcelMaven.hybridriven.utils.ExcelReader;

public class LoginTest extends BaseTest {
	@Test
    public void loginTest() throws Exception {
        String user = ExcelReader.getData("testdata/hybrid.xlsx", "Login", 1, 0);
        String pass = ExcelReader.getData("testdata/hybrid.xlsx", "Login", 1, 1);
        System.out.println(user);
        LoginPage lp = new LoginPage(driver);
        lp.login(user, pass);

        Assert.assertEquals(driver.getTitle(), "Swag Labs");
    }
}
