package selenium.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path=System.getProperty("user.dir");
		String fullpath=path+"\\src\\main\\java\\webdriver\\chromedriver.exe";
		System.out.println("full path "+fullpath);
		System.setProperty("webdriver.chrome.driver",fullpath);
		//System.setProperty("webdriver.chrome.driver", "C:/Users/Lenovo/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		//WebElement webElement=driver.findElement(By.id("APjFqb")); // BY id
		//WebElement webElement=driver.findElement(By.tagName("textarea"));// BY tag name
		WebElement webElement=driver.findElement(By.className("gLFyf")); //By class name
		
		webElement.sendKeys("Tops Technologies");
		webElement.submit();
		System.out.println("hello");
		
		System.out.println("Path "+path);
	}

}
