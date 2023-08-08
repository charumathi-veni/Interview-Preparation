package seleniumsamples;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import dev.failsafe.internal.util.Assert;

public class Scroll {

	public static void main(String[] args) throws InterruptedException {
		SoftAssert softAssertion = new SoftAssert();
		System.setProperty("webdriver.chrome.driver", "\\Users\\admin\\Downloads\\New folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://artoftesting.com/samplesiteforselenium");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//by pixel
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,1000)");
		//Thread.sleep(2000);
		
		//scroll till element visible
		WebElement fromElement = driver.findElement(By.id("myImage"));
		/*js.executeScript("arguments[0].scrollintoview",fromElement);
		Thread.sleep(5000);
		System.out.println(fromElement.isDisplayed());
		softAssertion.assertTrue(fromElement.isDisplayed());
		softAssertion.assertAll();*/
		
		//js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		js.executeScript("arguments[0].scrollIntoView();",fromElement );
		Thread.sleep(5000);
		
		//Assert.assertTrue(manage.isClosedCasesTabIsDisplayed());
		driver.quit();

	}

}
