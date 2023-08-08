package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AppLoginsteps {
	
	WebDriver driver = null;

	@Given("browser is opened")
	public void browser_is_opened() {
		String Projectpath = System.getProperty("user.dir");
	    System.out.println(Projectpath);
	    System.setProperty("webdriver.chrome.driver",Projectpath+"/src/main/resources/driver/chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	}

	@When("user on the search field")
	public void user_on_the_search_field() throws InterruptedException {
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(2000);
	    
	}

	@And("user enters the application URL")
	public void user_enters_the_application_url() throws InterruptedException {
	driver.findElement(By.id("APjFqb")).sendKeys("http://10.90.100.137:13343/");
	Thread.sleep(2000);    
	}

	@And("hits enter")
	public void hits_enter() throws InterruptedException {
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
	}

	@Then("user is logged in to the application")
	public void user_is_logged_in_to_the_application() {
	    driver.close();
	    driver.quit();
	}



}
