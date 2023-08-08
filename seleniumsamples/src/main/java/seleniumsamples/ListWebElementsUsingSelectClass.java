package seleniumsamples;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListWebElementsUsingSelectClass {
	
	public static void main(String[] args) throws InterruptedException {
	System.getProperty("webdriver.chrome.driver", "Users\\admin\\Downloads\\New folder\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://artoftesting.com/samplesiteforselenium");
	driver.manage().window().maximize();
	driver.findElement(By.id("fname")).sendKeys("barbie");
	driver.findElement(By.id("male")).click();
	driver.findElement(By.id("male")).isEnabled();
	driver.findElement(By.xpath("//input[@class='Automation']")).click();
	Thread.sleep(3000);
	WebElement e=driver.findElement(By.id("testingDropdown"));
	Select s=new Select(e);
	s.selectByIndex(1);
	s.selectByIndex(2);
	s.selectByIndex(3);
	//s.selectByVisibleText("Performance Testing");
	//s.selectByValue("Performance Testing");
	WebElement e1=s.getFirstSelectedOption();
	System.out.println(e1.getText());
	boolean sm=s.isMultiple();
	System.out.println(sm);
	
	List<WebElement> b = s.getOptions(); 
	int c =b.size(); 
	System.out.println(c); 
	for(int i=0;i<=c-1;i++) { 
	String d =b.get(i).getText(); 
	System.out.println(d); 
	Thread.sleep(2000);
	}
	
	driver.quit();
	
	

}
}
