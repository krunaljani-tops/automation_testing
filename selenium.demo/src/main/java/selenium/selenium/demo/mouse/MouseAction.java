package selenium.selenium.demo.mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String baseUrl = "https://demo.guru99.com/test/newtours/";
		String path=System.getProperty("user.dir");
		String fullpath=path+"\\src\\main\\java\\webdriver\\chromedriver.exe";
		System.out.println("full path "+fullpath);
		System.setProperty("webdriver.chrome.driver",fullpath);
        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();


                driver.get(baseUrl);           
  
                WebElement Telecome_Project=driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[8]/a"));
                

                Actions actions = new Actions(driver);
                System.out.println("telecome "+Telecome_Project.getCssValue("background-color"));
                // Move the mouse to the hoverTarget element
                actions.moveToElement(Telecome_Project).perform();
                
             //   System.out.println("telecome "+Telecome_Project.getCssValue("background-color"));
//                String bgColor = td_Home.getCssValue("background-color");
//                System.out.println("Before hover: " + bgColor);        
//                mouseOverHome.perform();        
//                bgColor = td_Home.getCssValue("background-color");
//                System.out.println("After hover: " + bgColor);
                //driver.close();
	}

}
