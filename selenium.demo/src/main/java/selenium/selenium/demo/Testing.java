package selenium.selenium.demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

 

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Set path to your ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:/Users/Lenovo/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");

        // Launch Chrome browser
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to SauceDemo
            driver.get("https://www.saucedemo.com/");
            driver.manage().window().maximize();

            // Locate and enter username
            WebElement usernameField = driver.findElement(By.id("user-name"));
            usernameField.sendKeys("standard_user");

            // Locate and enter password
            WebElement passwordField = driver.findElement(By.id("password"));
            passwordField.sendKeys("secret_sauce");

            // Click on the login button
            WebElement loginButton = driver.findElement(By.id("login-button"));
            loginButton.click();

            // Optional: Print success message
            System.out.println("Login attempted.");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close browser after a short wait
            try { Thread.sleep(3000); } catch (InterruptedException e) {}
            driver.quit();
        }

	}

}
