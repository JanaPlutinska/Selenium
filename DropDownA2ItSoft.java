package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class DropDownA2ItSoft {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://a2itsoft.com/course/operating-system-training/ubuntu");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebElement allLinks = driver.findElement(By.xpath("//a"));
		Select dd = new Select(allLinks);
		//dd.selectByIndex(1);
		//Thread.sleep(5000);
		//dd.selectByValue("Manual Testing");
		//Thread.sleep(5000);
		dd.selectByVisibleText("Mobile Apps Training");
		
		

	}

}
