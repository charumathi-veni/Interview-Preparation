package seleniumsamples;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardKeys {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "\\Users\\admin\\Downloads\\New folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://artoftesting.com/samplesiteforselenium");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//Actions action = new Actions(driver);
		//action.doubleClick(driver.findElement(By.id("dblClkBtn")));
		//Alert a = driver.switchTo().alert();
		driver.findElement(By.id("fname")).sendKeys("Hello");
		driver.findElement(By.id("idOfButton")).sendKeys(Keys.ENTER);
		//a.accept();
		driver.quit();		

	}

}
