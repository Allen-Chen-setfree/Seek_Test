package au.com.seek.cukes.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import au.com.seek.factory.DriverFactory;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LogInSteps {

	WebDriver driver;

	@Given("^that homepage \"([^\"]*)\" is available$")
	public void that_homepage_is_available(String URL) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver = DriverFactory.getBrowser("chrome");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

		driver.get(URL);
		//driver.navigate().to(URL);
		//System.out.println("URL"+URL);
		// throw new PendingException();
	}

	@When("^enter into \"([^\"]*)\" page$")
	public void enter_into_page(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.linkText("Sign in")).click();

		// throw new PendingException();
	}

	@Then("^navigate to \"([^\"]*)\" page$")
	public void navigate_to_page(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
	}

	
	@When("^input \"([^\"]*)\" and \"([^\"]*)\"$")
	public void input_and(String Email, String Password) throws Throwable {
		// Write code here that turns the phrase above into concrete actions		
		driver.findElement(By.name("email")).sendKeys(Email);
		driver.findElement(By.id("password")).sendKeys(Password);
		//System.out.println("Email: "+Email + "PW: "+Password);		

		// throw new PendingException();
	}

	@When("^click \"([^\"]*)\" button1$")
	public void click_button1(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// Click "Sign in"
		driver.findElement(By.cssSelector("button.__STYLE_GUIDE__Button__root___1Gfy1qg:nth-child(1)")).click();

		// throw new PendingException();
	}

	@Then("^go to next page$")
	public void go_to_next_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
	}

	@When("^click \"([^\"]*)\" button2$")
	public void click_button2(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		// Click "Later"
		driver.findElement(
				By.xpath("/html/body/div[1]/div/main/div[2]/div/div/div[1]/div[2]/div/form/div[3]/button[2]")).click();

		// throw new PendingException();
	}

	@Then("^go to the following page$")
	public void go_to_the_following_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
	}

	@When("^click \"([^\"]*)\" button3$")
	public void click_button3(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// Click "not now"
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div[2]/div/div[3]/div/button[2]")).click();

		// throw new PendingException();
	}

	@Then("^get the login page$")
	public void get_the_login_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// Retirve the title of the webpage
		String title = driver.getTitle();
		System.out.println(title);
		// throw new PendingException();
	}

}
