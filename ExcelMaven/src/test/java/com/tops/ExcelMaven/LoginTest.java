package com.tops.ExcelMaven;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
//import java.util.logging.LogManager;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class LoginTest {
  
    WebDriver driver;
    private static final Logger logger = LogManager.getLogger(LoginTest.class);
  @Test(dataProvider = "loginData", dataProviderClass = DataProviderUtil.class)
  public void testLogin(String username, String password) {
	  System.out.println("Testing start");
	  logger.info("Testing start");
	  logger.info("Chrome browser launched");
	  driver.get("https://www.saucedemo.com/");
	  
	  
      // Replace with your selectors
      driver.findElement(By.id("user-name")).sendKeys(username);
      driver.findElement(By.id("password")).sendKeys(password);
      driver.findElement(By.id("login-button")).click();
      logger.info("Login tested "+username+" "+password);
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Method");
	  driver = new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("after method");
  }

}
