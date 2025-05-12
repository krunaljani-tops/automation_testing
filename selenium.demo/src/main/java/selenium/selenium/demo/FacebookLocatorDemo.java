package selenium.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLocatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path=System.getProperty("user.dir");
		String fullpath=path+"\\src\\main\\java\\webdriver\\chromedriver.exe";
		System.out.println("full path "+fullpath);
		System.setProperty("webdriver.chrome.driver",fullpath);

//		 System.setProperty("webdriver.chrome.driver", "C:/Users/user/Downloads/Automation_testing-20250505T094201Z-1-001/Automation_testing/selenium.demo/src/main/java/webdriver/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();

	        // Open Facebook
	        driver.get("https://www.facebook.com/");

	        // 1. Locate by ID
	        WebElement emailField = driver.findElement(By.id("email"));
	        emailField.sendKeys("testemail@example.com");

	        // 2. Locate by Name
	        WebElement passwordField = driver.findElement(By.name("pass"));
	        passwordField.sendKeys("testpassword");

	        // 3. Locate by Class Name
	        WebElement loginButton = driver.findElement(By.className("_42ft")); // Common class for login button
	        loginButton.click();

	        // Wait for a bit (not recommended for production)
	        try {
	            Thread.sleep(2000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        // 4. Locate by Tag Name
	        WebElement firstInput = driver.findElement(By.tagName("input"));
	        System.out.println("First input placeholder: " + firstInput.getAttribute("placeholder"));

	        // 5. Locate by Link Text
	        WebElement forgotLink = driver.findElement(By.linkText("Forgotten password?"));
	        forgotLink.click();

	        // 6. Locate by Partial Link Text
	        WebElement backToLogin=null;
	        try {
	        	 backToLogin = driver.findElement(By.partialLinkText("Not you"));
	        	 backToLogin.click();
	        }
	        catch(Exception e) {
	        	System.out.println("<a> element not found with Not You text");
	        	
	        }
	        

	        // 7. Locate by CSS Selector
	        WebElement emailCSS = driver.findElement(By.cssSelector("#identify_email"));
	        emailCSS.clear();
	        emailCSS.sendKeys("cssselector@example.com");

	        // 8. Locate by XPath
	        WebElement passXPath = driver.findElement(By.xpath("//*[@id=\"identify_email\"]"));
	        passXPath.clear();
	        passXPath.sendKeys("xpathpassword");

	        // Close the browser
	        driver.quit();
		
	}

}
