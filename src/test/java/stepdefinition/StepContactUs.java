 package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepContactUs {
	
	WebDriver driver;

	@Given("user is on COntact us page with URL {string}")
	public void user_is_on_c_ontact_us_page_with_url(String string) {
		System.setProperty("webdriver.chrome.driver", 
				"/Users/suseeharini/Downloads/chromedriver-mac-arm64/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.roicians.com/contact-us/");
	}

	@When("user enters {int}-{int} characters in firstname")
	public void user_enters_characters_in_firstname(Integer int1, Integer int2) {
		driver.findElement(By.id("text-77525447616")).sendKeys("Susee");
	}

	@Then("input must be accepted")
	public void input_must_be_accepted() {
	    // Write code here that turns the phrase above into concrete actions
	   driver.close();
	}


}
