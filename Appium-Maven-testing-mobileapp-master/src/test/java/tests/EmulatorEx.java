package tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class EmulatorEx {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		 AndroidDriver<MobileElement> driver;
		 DesiredCapabilities caps = new DesiredCapabilities();
	        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
	        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
	        //com.android.calculator2
			caps.setCapability("appPackage", "com.android.calculator2");
			caps.setCapability("appActivity","com.android.calculator2.Calculator");
			 driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/"), caps);
			 caps.setCapability("noReset", true);
			 System.out.println("App Launched Successfully");
			 Thread.sleep(2000);
			 MobileElement press7=driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.android.calculator2:id/digit_7\"]"));
			 press7.click();
			 MobileElement pressPlus=driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"plus\"]"));
			 pressPlus.click();
			 MobileElement press6=driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.android.calculator2:id/digit_6\"]"));
			 press6.click();
			 MobileElement equ=driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"equals\"]"));
			 equ.click();
	}

}
