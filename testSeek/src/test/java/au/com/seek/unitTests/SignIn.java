package au.com.seek.unitTests;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import au.com.seek.data.Constants;
import au.com.seek.factory.DriverFactory;

public class SignIn {
	WebDriver driver;
	String user = "chenlimouse@sina.com";
	String password = "SeleniumTest";

	@Before
	public void webInvoke() {
		driver = DriverFactory.getBrowser("chrome");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.get(Constants.URL);
	}

	@After
	public void webClose() {
		driver.close();
		driver.quit();
	}

	@Test
	public void signIn() {

		driver.findElement(By.linkText("Sign in")).click();

		driver.findElement(By.id("email")).sendKeys(user);
		driver.findElement(By.id("password")).sendKeys(password);

		// Click "Sign in"
		driver.findElement(By.cssSelector("button.__STYLE_GUIDE__Button__root___1Gfy1qg:nth-child(1)")).click();
		// Click "Later"
		driver.findElement(
				By.xpath("/html/body/div[1]/div/main/div[2]/div/div/div[1]/div[2]/div/form/div[3]/button[2]")).click();
		// Click "not now"
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div[2]/div/div[3]/div/button[2]")).click();
		// Retirve the title of the webpage
		String title = driver.getTitle();
		System.out.println(title);
		// assertEquals("SEEK - Australia's no. 1 jobs, employment, career and
		// recruitment site", title);

		// Click to show sub menu
		driver.findElement(By.className("E9iKMBH")).click();

		// Click "Sign Out"
		driver.findElement(By.linkText("Sign Out")).click();

	}

}
