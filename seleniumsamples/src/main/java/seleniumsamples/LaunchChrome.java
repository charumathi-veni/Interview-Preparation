package seleniumsamples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LaunchChrome {

	public static void main(String[] args) {
	System.getProperty("webdriver.chrome.driver", "/Users/admin/Downloads/New folder/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.getPageSource();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	driver.findElement(By.id("APjFqb")).sendKeys("selenium");
	//new Actions(driver).sendKeys(Keys.ENTER);
	Actions actions = new Actions(driver);
	actions.sendKeys(Keys.ENTER).perform();
	
	//driver.getCurrentUrl();
System.out.println(driver.getCurrentUrl());
System.out.println(driver.getTitle());
//System.out.println(driver.getPageSource());
	//driver.findElement(By.className("gNO89b")).click();
	driver.getTitle();
	driver.getCurrentUrl();
	//driver.getPageSource();
	driver.close();
	driver.quit();
	}

}
