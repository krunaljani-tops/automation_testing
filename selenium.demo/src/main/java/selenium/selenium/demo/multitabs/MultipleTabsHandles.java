package selenium.selenium.demo.multitabs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleTabsHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path=System.getProperty("user.dir");
		String fullpath=path+"\\src\\main\\java\\webdriver\\chromedriver.exe";
		System.out.println("full path "+fullpath);
		System.setProperty("webdriver.chrome.driver",fullpath);
        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Open the target URL
        //main window
        driver.get("https://www.amazon.in");
        
        //new Tab
        driver.switchTo().newWindow(WindowType.TAB);
         //new Window
        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("Test");
        
        //new Windiow
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.flipkart.com");
        System.out.println("Title "+driver.getTitle());
        // Maximize window (optional)
        driver.manage().window().maximize();
        
        //handle multiple window
        System.out.println("count size of window "+driver.getWindowHandles().size());
        
        Set<String> windowid=driver.getWindowHandles();
        
        Iterator iterator=windowid.iterator();
        List<String> windowindex=new ArrayList<>();
        while(iterator.hasNext()) {
        	windowindex.add((String)iterator.next());
        }
        driver.switchTo().window(windowindex.get(0));
        System.out.println("First Index "+driver.getTitle());
        driver.switchTo().window(windowindex.get(1));
        System.out.println("second Index "+driver.getTitle());
        driver.switchTo().window(windowindex.get(2));
        System.out.println("Third Index "+driver.getTitle());
        
        
        
	}

}
