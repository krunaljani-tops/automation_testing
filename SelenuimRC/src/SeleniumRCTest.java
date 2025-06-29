import com.thoughtworks.selenium.DefaultSelenium;

public class SeleniumRCTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 DefaultSelenium selenium = new DefaultSelenium("localhost", 4444, "*firefox", "http://google.com");
	        selenium.start();
	        System.out.println("Hello");
	        // Open the website
	        selenium.open("/");
	        selenium.windowMaximize();
	        
	        // Example interaction
	        selenium.type("name=q", "selenium");
	        //selenium.type("name=password", "admin123");
	        selenium.click("name=btnG");
	        
	        // Add some wait
	        selenium.waitForPageToLoad("3000");

	        System.out.println("Login test completed.");
	        selenium.stop();
	}

}
