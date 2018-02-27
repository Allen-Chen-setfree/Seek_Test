package au.com.seek.cukes.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import au.com.seek.factory.DriverFactory;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchSteps {
	WebDriver driver;

	@Given("^that the homepage \"([^\"]*)\" is available$")
	public void that_the_homepage_is_available(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver = DriverFactory.getBrowser("chrome");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.get(arg1);

		// throw new PendingException();
	}

	@When("^I input \"([^\"]*)\" for \"([^\"]*)\"$")
	public void i_input_for(String arg1, String arg2) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// driver.findElement(By.id("SearchBar__Keywords")).sendKeys(arg1);

		// throw new PendingException();
	}

	@When("^tick the \"([^\"]*)\" in \"([^\"]*)\"$")
	public void tick_the_in(String arg1, String arg2) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// driver.findElement(By.className("1BytwqT v8b4xda")).click();
		// driver.findElement(By.className("_3cvRF2q")).click();

		// throw new PendingException();
	}

	@When("^input \"([^\"]*)\" for \"([^\"]*)\"$")
	public void input_for(String arg1, String arg2) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// driver.findElement(By.id("SearchBar__Where")).sendKeys(arg1);

		// throw new PendingException();
	}

	@When("^click \"([^\"]*)\"$")
	public void click(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// driver.findElement(By.className("_117xZqt")).click();
		// driver.findElement(By.className("_2jp6wVL _3qpSGs3")).click();
		// throw new PendingException();
	}

	@When("^choose \"([^\"]*)\"$")
	public void choose(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// driver.findElement(By.className("_1tBsnbd")).click();
		// throw new PendingException();
	}

	@When("^I click \"([^\"]*)\"$")
	public void i_click(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// driver.findElement(By.xpath(".//*[@id='SearchBar']/button")).click();
		// throw new PendingException();

	}

	@Then("^I get the search results$")
	public void i_get_the_search_results() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// System.out.print(driver.getTitle());
		driver.quit();
		// throw new PendingException();
	}

}
