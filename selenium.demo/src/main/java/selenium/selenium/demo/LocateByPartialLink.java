package selenium.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByPartialLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path=System.getProperty("user.dir");
		String fullpath=path+"\\src\\main\\java\\webdriver\\chromedriver.exe";
		System.out.println("full path "+fullpath);
		System.setProperty("webdriver.chrome.driver",fullpath);

		// System.setProperty("webdriver.chrome.driver", "C:/Users/user/Downloads/Automation_testing-20250505T094201Z-1-001/Automation_testing/selenium.demo/src/main/java/webdriver/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();

	        // Open Facebook
	        driver.get("https://www.facebook.com/");

	        // 6. Locate by Partial Link Text
	        WebElement forgot=null;
	        try {
	        	 forgot = driver.findElement(By.partialLinkText("password"));
	        	 
	        	 forgot.click();
	        }
	        catch(Exception e) {
	        	System.out.println("<a> element not found with Not You text");
	        	
	        }
	        
	     // Close the browser
	        //driver.quit();


	}

}
