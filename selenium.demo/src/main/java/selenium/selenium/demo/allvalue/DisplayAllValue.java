package selenium.selenium.demo.allvalue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class DisplayAllValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
		String path=System.getProperty("user.dir");
		String fullpath=path+"\\src\\main\\java\\webdriver\\chromedriver.exe";
		System.out.println("full path "+fullpath);
		System.setProperty("webdriver.chrome.driver",fullpath);
        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Open the target URL
        driver.get("https://practicesoftwaretesting.com/auth/register");

        // Maximize window (optional)
        driver.manage().window().maximize();

        // Example: Get all paragraph text
        List<WebElement> allParagraphs = driver.findElements(By.tagName("p"));
        for (WebElement para : allParagraphs) {
            System.out.println("Paragraph: " + para.getText());
        }

        // Example: Get all input values
        List<WebElement> allInputs = driver.findElements(By.tagName("input"));
        for (WebElement input : allInputs) {
        	input.sendKeys("hii");
            String value = input.getAttribute("value");
            System.out.println("Input value: " + value);
        }

        // Example: Get all text from span tags
        List<WebElement> allSpans = driver.findElements(By.tagName("span"));
        for (WebElement span : allSpans) {
            System.out.println("Span: " + span.getText());
        }

        // Close browser
       // driver.quit();
	}

}
