package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownAutomation {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.krninformatix.com/selenium/testing.html");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebElement multiSelect = driver.findElement(By.id("testingDropdown"));
		Select dd = new Select(multiSelect);
		dd.selectByIndex(1);
		Thread.sleep(5000);
		dd.selectByValue("Manual Testing");
		Thread.sleep(5000);
		dd.selectByVisibleText("Database Testing");
		List<WebElement> allOptions = dd.getAllSelectedOptions();
		int si = allOptions.size();
		for (int i=0; i<si;i++) {
			WebElement option1 = allOptions.get(i);
			String te1 = option1.getText();
			System.out.println(te1);
		}
		
	}

}
