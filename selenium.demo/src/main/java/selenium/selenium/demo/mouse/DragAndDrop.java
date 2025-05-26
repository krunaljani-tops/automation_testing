package selenium.selenium.demo.mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String baseUrl = "https://jqueryui.com/droppable/";
		String path=System.getProperty("user.dir");
		String fullpath=path+"\\src\\main\\java\\webdriver\\chromedriver.exe";
		System.out.println("full path "+fullpath);
		System.setProperty("webdriver.chrome.driver",fullpath);
        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl); 
        
        // Create an instance of the Actions class
        Actions actions = new Actions(driver);
        WebElement f=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
        driver.switchTo().frame(f);
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));

        // Drag and drop the source element to the target
        actions.dragAndDrop(source, target).perform();

	}

}
