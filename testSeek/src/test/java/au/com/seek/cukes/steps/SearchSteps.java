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
	public void that_the_homepage_is_available(String URL) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver = DriverFactory.getBrowser("chrome");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.get(URL);

		// throw new PendingException();
	}

	@When("^I input \"([^\"]*)\" for \"([^\"]*)\"$")
	public void i_input_for(String keyword, String arg2) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("SearchBar__Keywords")).sendKeys(keyword);

		// throw new PendingException();
	}

	@When("^tick the \"([^\"]*)\" in \"([^\"]*)\"$")
	public void tick_the_in(String arg1, String arg2) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@id=\"SearchBar\"]/div/div[1]/div/div[2]/label")).click();
		driver.findElement(By.xpath("//*[@id=\"classificationsPanel\"]/nav/ul/li[18]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"SearchBar\"]/div/div[1]/div/div[2]/label")).click();

		// throw new PendingException();
	}

	@When("^input \"([^\"]*)\" for \"([^\"]*)\"$")
	public void input_for(String location, String arg2) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("SearchBar__Where")).sendKeys(location);

		// throw new PendingException();
	}

	@When("^click \"([^\"]*)\"$")
	public void click(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		// driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div[1]/section/div[1]/div/div/div[2]/span"))
		// .click();
		// driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div[1]/aside/div[1]/div/div/label[4]"))
		// .click();

		// throw new PendingException();
	}

	@When("^choose \"([^\"]*)\"$")
	public void choose(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// <a href="/jobs-in-information-communication-technology?daterange=1#"
		// data-automation="1" role="radio" aria-checked="true" aria-label="Today"
		// class="_1tBsnbd" target="_self" rel="nofollow">Today</a>
		// driver.findElement(By.xpath("//*[@id=\"RefineDateListed__radiogroup\"]/li[2]/a")).click();
		// driver.findElement(By.linkText("Today")).click();
		// driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div[1]/aside/div[1]/div/div/label[4]"))
		// .click();

		// throw new PendingException();
	}

	@When("^I click \"([^\"]*)\"$")
	public void i_click(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath(".//*[@id='SearchBar']/button")).click();
		// throw new PendingException();

	}

	@Then("^I get the search results$")
	public void i_get_the_search_results() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.print("the title of website is " + driver.getTitle());
		driver.close();
		// throw new PendingException();
	}

}
