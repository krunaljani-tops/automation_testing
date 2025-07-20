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

public class RealDevice {
    AndroidDriver<MobileElement> driver;
 // Open BookMyShow
    /*
     * Below command for find appPackage and appActivity
     * adb shell dumpsys window | findstr "mCurrentFocus"
     */
    
    @BeforeClass
    public void setup() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        caps.setCapability(MobileCapabilityType.APP, "C:\\Users\\Lenovo\\Downloads\\com.bt.bms.apk");
        //caps.setCapability("appPackage", "com.bt.bms");  // Confirm this!
        //caps.setCapability("appActivity", "com.bms.discovery.ui.screens.listings.DiscoveryListingContainerActivity");  // Confirm this!
        //caps.setCapability("noReset", true);

        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/"), caps);
        System.out.println("App Launched Successfully");
        //driver.findElement(By., null)
    }

    @Test
    public void testOpenApp() throws InterruptedException {
        // Add wait so you can see if app is launched
        Thread.sleep(5000);
        MobileElement skip=driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.bt.bms:id/launcher_tv_for_skip']"));
        	skip.click();
        	Thread.sleep(3000);
        	MobileElement btnCity=driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.bt.bms:id/btn_negative\"]"));
        btnCity.click();
        MobileElement enterCity=driver.findElement(By.xpath("//android.widget.EditText[@text=\"Search for your city\"]"));
        enterCity.sendKeys("Ahmedabad");
        //
        	System.out.println("Running Test: App Opened?");
        // You can try o click something visible to confirm app is running
        // Example: Home screen banner, search box, etc.
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            //driver.quit();
        }
    }
}

