package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GoogleAutomationTesting {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rasti\\OneDrive\\Počítač\\SeleniumJarFiles\\SeleniumJarFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		WebElement p=driver.findElement(By.name("q"));
		p.sendKeys("Selenium java");
		p.submit();
		driver.close();
	}
}