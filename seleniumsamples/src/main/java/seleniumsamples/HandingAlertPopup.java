package seleniumsamples;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandingAlertPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "\\Users\\admin\\Downloads\\New folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://artoftesting.com/samplesiteforselenium");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Generate Alert Box']")).click();
		Alert A =driver.switchTo().alert();
		System.out.println(A.getText());
		Thread.sleep(2000);
		A.accept();
		driver.quit();
		
		
		//Adding file alert popup
		//dont click on the element
		//just find xpath and in sendkeys add file path
		//driver.findElement(By.xpath("//button[text()='Generate Alert Box']")).sendkeys("file path")

	}

}
