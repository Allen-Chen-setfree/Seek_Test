package au.com.seek.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import au.com.seek.data.Constants;

public class DriverFactory {

	private static WebDriver driver = null;

	public static WebDriver getBrowser(String browserType) {
		if (driver == null) {
			if (browserType.equalsIgnoreCase("Firefox"))

			{
				System.setProperty("webdriver.gecko.driver", Constants.Firefox_WebDriver);
				driver = new FirefoxDriver();

			} else if (browserType.equalsIgnoreCase("Chrome"))

			{
				System.setProperty("webdriver.chrome.driver", Constants.Chrome_WebDriver);
				driver = new ChromeDriver();

			} else if (browserType.equalsIgnoreCase("IE"))

			{
				System.setProperty("webdriver.ie.driver", Constants.IE_WebDriver);
				driver = new InternetExplorerDriver();
			} else

			{
				driver = new HtmlUnitDriver();
			}
		}
		return driver;
	}

}
