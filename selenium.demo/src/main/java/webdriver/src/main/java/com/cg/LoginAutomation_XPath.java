package com.cg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAutomation_XPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse_workspace_new\\selenium\\chromedriver_137.exe");
		//driver = new ChromeDriver();
		
	      WebDriver driver = new ChromeDriver();
	        driver.get("https://demoqa.com/login");

	        // Locate username field using XPath by ID
	        WebElement username = driver.findElement(By.xpath("//input[@id='userName']"));
	        username.sendKeys("testuser");

	        // Locate password field using XPath by placeholder
	        WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
	        password.sendKeys("Test@123");

	        // Locate login button using XPath by text
	        WebElement loginButton = driver.findElement(By.xpath("//button[text()='Login']"));
	        loginButton.click();

	        // Optional: Validate login success
	   //    WebElement profileHeader = driver.findElement(By.xpath("//div[contains(text()='Profile')]"));
	     // System.out.println("Login successful: " + profileHeader.isDisplayed());

	        driver.quit();

	}

}
