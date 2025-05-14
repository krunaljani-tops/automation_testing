package selenium.selenium.demo.wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class ExplicitWaitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
		// TODO Auto-generated method stub
				String path=System.getProperty("user.dir");
				String fullpath=path+"\\src\\main\\java\\webdriver\\chromedriver.exe";
				System.out.println("full path "+fullpath);
				System.setProperty("webdriver.chrome.driver",fullpath);
		        // Initialize WebDriver
		        WebDriver driver = new ChromeDriver();

		        // Open the target URL
		        driver.get("https://practicesoftwaretesting.com/auth/register");

		        // Initialize WebDriverWait with a max wait time of 10 seconds
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Example: Wait until the element with ID 'username' is visible
        WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("street")));
        usernameField.sendKeys("admin");

        // Example: Wait until the element is clickable
        WebElement register = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/div/app-register/div/div/div/form/div/button")));
        register.click();

        // Clean up
        driver.quit();
	}

}
