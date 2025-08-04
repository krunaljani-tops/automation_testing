package com.cg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleAutomation {
	WebDriver driver;

	public GoogleAutomation() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse_workspace_new\\selenium\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println("Title is : " + driver.getTitle());
		driver.manage().window().maximize();
	}

//	public void searchTextField() throws InterruptedException
//	{
//		WebElement search=driver.findElement(By.name("q"));
//		search.sendKeys("Capgemini India");
//		Thread.sleep(5000);
//		search.submit();
//		WebElement search1=driver.findElement(By.linkText("Images"));
//		search1.click();
//	}

//	public void hyperLink() {
//		WebElement search=driver.findElement(By.linkText("Images"));
//		search.click();
//	}
	
	public void hyperLinks()
	{
		List<WebElement> links=driver.findElements(By.tagName("a"));
		for(WebElement link:links)
		{
			System.out.println(link.getText());
		}
	}
}
