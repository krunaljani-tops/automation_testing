package selenium.selenium.demo.wait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path=System.getProperty("user.dir");
		String fullpath=path+"\\src\\main\\java\\webdriver\\chromedriver.exe";
		System.out.println("full path "+fullpath);
		System.setProperty("webdriver.chrome.driver",fullpath);
        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Open the target URL
        driver.get("https://practicesoftwaretesting.com/auth/register");

	    //
       

	        // Set implicit wait
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	        // Navigate to the website
	        driver.get("https://practicesoftwaretesting.com/auth/register");

	        // Now WebDriver will wait up to 10 seconds for elements to appear
	        // Example usage
	        driver.findElement(By.id("username")).sendKeys("admin");

	        // Clean up
	        driver.quit();
	}

}
