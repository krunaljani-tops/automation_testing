package tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class RealDeviceTest {
	AndroidDriver<MobileElement> driver;

    @BeforeClass
    public void setup() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "10BD7K20FC000KN");
        caps.setCapability(MobileCapabilityType.APP, "C:\\Users\\Lenovo\\Downloads\\Appium-Maven-testing-mobileapp-master\\Appium-Maven-testing-mobileapp-master\\com.neumorphic.calculator_2.apk"); // replace with your APK path

        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/"), caps);
        System.out.println("Before function loaded");
    }

    @Test
    public void testLogin() {
        // Enter username
      /*  
    	MobileElement usernameField = driver.findElementById("com.example:id/username");
        usernameField.sendKeys("testuser");

        // Enter password
        MobileElement passwordField = driver.findElementById("com.example:id/password");
        passwordField.sendKeys("password123");

        // Click login button
        MobileElement loginButton = driver.findElementById("com.example:id/login");
        loginButton.click();

        // Assert welcome message is displayed
        MobileElement welcomeMsg = driver.findElementById("com.example:id/welcomeMsg");
        Assert.assertTrue(welcomeMsg.isDisplayed(), "Login failed or welcome message not displayed.");
    */
    	//MobileElement e7=driver.findElementByAccessibilityId("00000000-0000-002b-0000-001000000004");
    	MobileElement e7=driver.findElement(By.xpath("//android.view.View[@content-desc=\"7\"]"));
    	e7.click();
    	MobileElement plus=driver.findElement(By.xpath("//android.view.View[@content-desc=\"+\"]\r\n"
    			+ ""));
    	plus.click();
    	MobileElement e3=driver.findElement(By.xpath("//android.view.View[@content-desc=\"3\"]"));
    	e3.click();
    	MobileElement equa=driver.findElement(By.xpath("//android.view.View[@content-desc=\"=\"]"));
    	equa.click();

    	System.out.println("Testing  method");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
