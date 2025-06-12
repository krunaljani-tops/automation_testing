package tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class MyAppium {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		DesiredCapabilities dc=new DesiredCapabilities();
//		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
//		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554");
//		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
//		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"16.0");
		 dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
	     dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	     dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
	     //dc.setCapability(MobileCapabilityType.APP, "C:\\Users\\Lenovo\\Downloads\\Appium-Maven-testing-mobileapp-master\\Appium-Maven-testing-mobileapp-master\\com.neumorphic.calculator_2.apk"); // replace with your APK path
	     
	 	AndroidDriver<MobileElement> driver;	      

		dc.setCapability("appPackage", "com.neumorphic.calculator");
		dc.setCapability("appActivity", "com.neumorphic.calculator.MainActivity");
		//dc.setCapability("app", "C:\\Users\\Lenovo\\Downloads\\Appium-Maven-testing-mobileapp-master\\Appium-Maven-testing-mobileapp-master\\com.neumorphic.calculator_2.apk");
		dc.setCapability("noReset", true);
		dc.setCapability("newCommandTimeout", 300); // 5 minutes
		/*
		 * URL url=new URL("http://127.0.0.1:4723/"); AndroidDriver<WebElement>
		 * driver=new AndroidDriver<>(url,dc);
		 */
		//URL url=new URL("http://127.0.0.1:4723/"); 
		//AndroidDriver<WebElement> driver=new AndroidDriver<>(url,dc);
		  driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/"), dc);
		  MobileElement e7=driver.findElement(By.xpath("//android.view.View[@content-desc=\"7\"]"));
	    	e7.click();
		  System.out.println("FFFFFFFFFFFF");
		Thread.sleep(6000);
        //WebElement btn7 = driver.findElementById("apps.r.calculator:id/digit_7");
        //btn7.click();

        //System.out.println("Clicked 7 button");

        //Thread.sleep(3000);
        //driver.quit();
		//Thread.sleep(7000);
	}

}
