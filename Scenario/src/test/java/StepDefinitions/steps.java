package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class steps{

	public WebDriver driver;

	@Before(value="@skip_scenario",order=0 )
	public void skip_scenario(Scenario scenario){ 
		driver = new ChromeDriver();
		driver.navigate().to("https://chatsoft.avaza.com/timesheet/week/20210610");
		Assert.assertTrue(false);
	}

	@Before(order=1)
	public void setUp(){ 
		driver.manage().window().maximize();
	} 

	@Given("user is on login page")
	public void user_is_on_login_page() {

	}

	@When("user enter username and password")
	public void user_enter_username_and_password() {

	}

	@And("clicks on login button")
	public void clicks_on_login_button() {

	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {

	}

	@After public void cleanUp(){ 
		driver.close(); 
	} 

}
