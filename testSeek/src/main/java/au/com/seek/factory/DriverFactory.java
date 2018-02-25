package au.com.seek.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverFactory {

	private static WebDriver driver = null;

	public static WebDriver getBrowser(String browserType) {
		if (driver == null) {
			if (browserType.equalsIgnoreCase("Firefox"))

			{
				System.setProperty("webdriver.gecko.driver",
						"C:\\Users\\setfree\\Documents\\selenium\\geckodriver-v0.19.1-win64\\geckodriver.exe");
				driver = new FirefoxDriver();

			} else if (browserType.equalsIgnoreCase("Chrome"))

			{
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\setfree\\Documents\\selenium\\chromedriver_win32\\chromedriver.exe");
				driver = new ChromeDriver();

			} else if (browserType.equalsIgnoreCase("IE"))

			{
				System.setProperty("webdriver.ie.driver",
						"C:\\Users\\setfree\\Documents\\selenium\\IEDriverServer_x64_3.8.0\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			} else

			{
				driver = new HtmlUnitDriver();
			}
		}
		return driver;
	}

}
