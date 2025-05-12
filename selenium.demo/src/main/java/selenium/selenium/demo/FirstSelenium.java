package selenium.selenium.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path=System.getProperty("user.dir");
		String fullpath=path+"\\src\\main\\java\\webdriver\\chromedriver.exe";
		System.out.println("full path "+fullpath);
		System.setProperty("webdriver.chrome.driver",fullpath);

//		System.out.println("Hello");
//		 // Set the path to the ChromeDriver executable
//        System.setProperty("webdriver.chrome.driver", "C:/Users/user/Downloads/Automation_testing-20250505T094201Z-1-001/Automation_testing/selenium.demo/src/main/java/webdriver/chromedriver.exe");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to a webpage
        driver.get("https://www.orangehrm.com/");

        // Verify the page title
        String actualTitle = driver.getTitle();
        System.out.println("Actual title "+ actualTitle);
        String expectedTitle = "Example Domain";

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title is correct!");
        } else {
            System.out.println("Title is incorrect!");
        }

        // Close the browser
        driver.quit();

	}

}
