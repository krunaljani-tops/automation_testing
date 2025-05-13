package com.tops.FacebookTitleTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
	 static String url = "https://www.facebook.com/";
	    static String expectedTitle = "Facebook – log in or sign up";

	    public static void testInChrome() {
	        WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver();
	        driver.get(url);
	        System.out.println("Chrome - Title: " + driver.getTitle());
	        assert driver.getTitle().equals(expectedTitle) : "Title mismatch in Chrome!";
	        driver.quit();
	    }

	    public static void testInFirefox() {
	        WebDriverManager.firefoxdriver().setup();
	        WebDriver driver = new FirefoxDriver();
	        driver.get(url);
	        System.out.println("Firefox - Title: " + driver.getTitle());
	        assert driver.getTitle().equals(expectedTitle) : "Title mismatch in Firefox!";
	        driver.quit();
	    }

	    public static void testInIE() {
	        WebDriverManager.iedriver().setup();
	        WebDriver driver = new InternetExplorerDriver();
	        driver.get(url);
	        System.out.println("IE - Title: " + driver.getTitle());
	        assert driver.getTitle().equals(expectedTitle) : "Title mismatch in IE!";
	        driver.quit();
	    }

	    public static void main(String[] args) {
	        testInChrome();
	        testInFirefox();
	        testInIE();
	    }
}
