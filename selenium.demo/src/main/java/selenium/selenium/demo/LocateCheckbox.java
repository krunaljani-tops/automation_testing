package selenium.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateCheckbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		String path=System.getProperty("user.dir");
		String fullpath=path+"\\src\\main\\java\\webdriver\\chromedriver.exe";
		System.out.println("full path "+fullpath);
		System.setProperty("webdriver.chrome.driver",fullpath);
 
		//System.setProperty("webdriver.chrome.driver", "C:/Users/user/Downloads/Automation_testing-20250505T094201Z-1-001/Automation_testing/selenium.demo/src/main/java/webdriver/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();

	        // Open Facebook
	        driver.get("https://demo.guru99.com/test/radio.html");

	        // 1. Locate by ID
	        WebElement checkbox0 = driver.findElement(By.id("vfb-6-0"));
	        WebElement checkbox1 = driver.findElement(By.id("vfb-6-1"));
	        WebElement checkbox2 = driver.findElement(By.id("vfb-6-2"));
	        checkbox0.click();
	        System.out.println(checkbox0.isSelected());
	        
	     // Close the browser
	       // driver.quit();

	}

}
