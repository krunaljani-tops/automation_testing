package tests;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Locators {
	AndroidDriver<MobileElement> driver;

    @BeforeClass
    public void setup() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        //caps.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "10BD7K20FC000KN");
        caps.setCapability(MobileCapabilityType.APP, "C:\\Users\\Lenovo\\Downloads\\Appium-Maven-testing-mobileapp-master\\Appium-Maven-testing-mobileapp-master\\com.neumorphic.calculator_2.apk"); // replace with your APK path

        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/"), caps);
        System.out.println("Before function loaded");
    }

    @Test
    public void testLogin() {
    	 MobileElement e7 = driver.findElementByAccessibilityId("7");
    	    e7.click();

    	    // Locator using XPath (already used)
    	    MobileElement plus = driver.findElement(By.xpath("//android.view.View[@content-desc='+']"));
    	    plus.click();

    	    // Locator using class name (assumes the button class and order, use carefully)
    	    // This is not very reliable unless you're sure of the structure
    	    List<MobileElement> buttons = driver.findElements(By.className("android.view.View"));
    	    buttons.get(10).click();  // Example: Clicking 3rd button if it's "3"

    	    // Locator using UIAutomator
    	    MobileElement equals = driver.findElementByAndroidUIAutomator(
    	        "new UiSelector().description(\"=\")"
    	    );
    	    equals.click();

    	    // Locator using resource ID (if available — use uiautomatorviewer to check it)
    	    // Example (won’t work unless the app actually has resource IDs)
    	    // MobileElement result = driver.findElement(By.id("com.calculator:id/result"));

    	    System.out.println("Test completed using multiple locator strategies.");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
