package selenium.selenium.demo.keyboard;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyDown {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		String baseUrl = "https://amazon.in";
		String path=System.getProperty("user.dir");
		String fullpath=path+"\\src\\main\\java\\webdriver\\chromedriver.exe";
		System.out.println("full path "+fullpath);
		System.setProperty("webdriver.chrome.driver",fullpath);
        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl); 
        
        // Create an instance of the Actions class
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("Mobile").build().perform();
        Thread.sleep(2000);
        actions.sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).build().perform();
        
        
        TakesScreenshot ts = (TakesScreenshot)driver;
        // Capture screenshot as output type FILE
 		File file = ts.getScreenshotAs(OutputType.FILE);
 		
 		//save the screenshot taken in destination path
		FileUtils.copyFile(file, new File("ecommerce_plaground.png"));
		// Print the title after screenshot capture
		String title = driver.getTitle();
		System.out.println("Captured Screenshot for: " +title);
       
        // Close the driver
        driver.quit();
        //WebElement f=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
 
	}

}
