package seleniumsamples;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "\\Users\\admin\\Downloads\\New folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://artoftesting.com/samplesiteforselenium");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement fromElement = driver.findElement(By.id("myImage"));
		WebElement toElement = driver.findElement(By.id("targetDiv"));
		Actions action = new Actions(driver);
		//Action dragandDrop = action.clickAndHold(fromElement).moveToElement(toElement).build();
		action.dragAndDrop(fromElement, toElement);
		//dragandDrop.perform();
		Thread.sleep(4000);
		//action.contextClick();
		//action.contextClick(toElement);
		//action.doubleClick(driver.findElement(By.id("dblClkBtn")));
		///Alert a = driver.switchTo().alert();
		//a.accept();
		
		
		Thread.sleep(5000);
		driver.quit();

	}

}
