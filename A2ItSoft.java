package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;

public class A2ItSoft {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://a2itsoft.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		int si = allLinks.size();
		System.out.println(si);
		for(int i=0; i<si; i++) {
			WebElement link = allLinks.get(i);
			String te = link.getText();
			System.out.println(te);
		}

		
		

	}

}
