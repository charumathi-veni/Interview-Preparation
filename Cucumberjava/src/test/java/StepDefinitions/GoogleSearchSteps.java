package StepDefinitions;

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

public class GoogleSearchSteps {
	
	WebDriver driver = null;
	
	@Given("browser is open")
	public void browser_is_open() {
	    String Projectpath = System.getProperty("user.dir");
	    System.out.println(Projectpath);
	    System.setProperty("webdriver.chrome.driver",Projectpath+"/src/main/resources/driver/chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() throws InterruptedException {
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(2000);
	  
	}

	@When("user enter text is google search tab")
	public void user_enter_text_is_google_search_tab() throws InterruptedException {
	   driver.findElement(By.id("APjFqb")).sendKeys("Selenium");
	   Thread.sleep(2000);
	}

	@And("hits the enter button")
	public void hits_the_enter_button() throws InterruptedException {
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
	    driver.getPageSource().contains("Selenium");
	    driver.close();
	    driver.quit();
	}

}
