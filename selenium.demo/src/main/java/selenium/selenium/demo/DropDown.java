package selenium.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path=System.getProperty("user.dir");
		String fullpath=path+"\\src\\main\\java\\webdriver\\chromedriver.exe";
		System.out.println("full path "+fullpath);
		System.setProperty("webdriver.chrome.driver",fullpath);
 
		//System.setProperty("webdriver.chrome.driver", "C:/Users/user/Downloads/Automation_testing-20250505T094201Z-1-001/Automation_testing/selenium.demo/src/main/java/webdriver/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();

	        
	        driver.get("https://demo.guru99.com/test/newtours/register.php");

	        // 1. Locate by Name
	        Select drpCountry = new Select(driver.findElement(By.name("country")));
	        //drpCountry.selectByVisibleText("ANTARCTICA");
	        drpCountry.selectByValue("ANTARCTICA");
	     // Close the browser
	       // driver.quit();


	}

}
