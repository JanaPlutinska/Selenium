package Selenium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RedBus {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[contains(@class, 'dateText')]")).click();
		driver.findElement(By.xpath("//td[text()='11 Aug']")).click();
		driver.findElement(By.id("search_button")).click();
		driver.findElement(By.id("text")).sendKeys("7875457643");
		}

}
