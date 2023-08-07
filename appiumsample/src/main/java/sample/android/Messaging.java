package sample.android;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
public class Messaging {
		public static AndroidDriver driver;
		public static void main(String[] args) throws MalformedURLException, InterruptedException {
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
			//capabilities.setCapability(MobileCapabilityType.UDID, "emulator-5554");
			capabilities.setCapability(MobileCapabilityType.UDID, "e39d5fc1"); // adb devices
			//capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android SDK built for x86");
			capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "OnePlus LE2101");
			capabilities.setCapability("appPackage", "com.google.android.gm");//application id
			capabilities.setCapability("appActivity", "com.google.android.gm.ConversationListActivityGmail");//conversation composer
			capabilities.setCapability("noReset",true);
		
			URL url = new URL("http://0.0.0.0:4723/wd/hub");
			
			driver = new AndroidDriver(url, capabilities);
			
			System.out.println("Page opened Successfully");
			driver.findElement(By.id("com.google.android.gm:id/compose_button")).click();
			Thread.sleep(1000);
			driver.findElement(By.className("android.widget.EditText")).sendKeys("bb@gmail.com");
			Thread.sleep(1000);
			driver.findElement(By.className("android.widget.RelativeLayout")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.google.android.gm:id/wc_body")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.google.android.gm:id/wc_body")).sendKeys("GOOD MORNING");
			Thread.sleep(1000);
			driver.findElement(By.id("com.google.android.gm:id/send")).click();
			
			Thread.sleep(1000);
			driver.quit();
	}
}