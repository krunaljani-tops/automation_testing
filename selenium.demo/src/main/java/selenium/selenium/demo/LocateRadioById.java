package selenium.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateRadioById {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
			        WebElement radio1 = driver.findElement(By.id("vfb-7-1"));
			        WebElement radio2 = driver.findElement(By.id("vfb-7-2"));
			        radio1.click();
			        radio2.click();
			        
			     // Close the browser
			       // driver.quit();

	}

}
