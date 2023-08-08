package seleniumsamples;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChangePositionOfBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "\\Users\\admin\\Downloads\\New folder\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://artoftesting.com/samplesiteforselenium");
		Thread.sleep(2000);
		Point p = new Point(100,100);
		driver.manage().window().setPosition(p);
		Thread.sleep(2000);
		driver.quit();		
	}

}
