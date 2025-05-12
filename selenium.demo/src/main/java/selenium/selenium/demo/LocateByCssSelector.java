package selenium.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByCssSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path=System.getProperty("user.dir");
		String fullpath=path+"\\src\\main\\java\\webdriver\\chromedriver.exe";
		System.out.println("full path "+fullpath);
		System.setProperty("webdriver.chrome.driver",fullpath);
 
		//System.setProperty("webdriver.chrome.driver", "C:/Users/user/Downloads/Automation_testing-20250505T094201Z-1-001/Automation_testing/selenium.demo/src/main/java/webdriver/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();

	        // Open Facebook
	        driver.get("https://www.facebook.com/");

	     // 7. Locate by CSS Selector
	        WebElement emailCSS = driver.findElement(By.cssSelector("#email"));
	        emailCSS.clear();
	        emailCSS.sendKeys("cssselector@example.com");

	        
	     // Close the browser
	       // driver.quit();

	}

}
