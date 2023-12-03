package Selenium;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import dev.failsafe.internal.util.Assert;
import org.testing.Assert;

public class myclass {

	public static String baseUrl = "http://newtours.demout.com/";
	public static WebDriver driver = new FirefoxDriver();
	public static void main(String[] args) {
		driver.get(baseUrl);
		verifyHomepageTitle();
		driver.quit();
	}
	private static void verifyHomepageTitle() {
		String expectedTitle = "welcome:Mercury Tours";
		String actualTitle =  driver.getTitle();
		try {
			Assert.assertEquals(actualTitle, expectedTitle);
			System.out.println("Test Passed");
		}
		catch (Throwable e) {
			System.out.println("Test Failed");
			
		}
		
	}


public void c_test() {	
	Assert.fail();
}
public void a_test() {
	Assert.assertTrue(true);	
}
public void b_test() throws Exception {
	throw new Exception("Skipping b_test//...");
	
}
}