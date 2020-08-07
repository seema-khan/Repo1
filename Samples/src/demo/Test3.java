package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Test3 {
	WebDriver driver;

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", ".\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void Test1() {

		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Assert.assertEquals("Google", driver.getTitle());
	}

	@Test
	public void Test2() {
		driver.navigate().to("http:\\facebook.com");
		//Assert.assertEquals("Google", driver.getTitle());
	}

	@AfterTest
	public void tearDown() {
		driver.quit();

	}
}
