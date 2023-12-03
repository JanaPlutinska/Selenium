package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KrnAutomateRadio {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.krninformatix.com/sample.html");
		boolean radioStatus = driver.findElement(By.id("female")).isSelected();
		System.out.println("The status is" +radioStatus);
		Thread.sleep(3000);
		driver.findElement(By.id("female")).click();
		boolean radioStatus1 = driver.findElement(By.id("female")).isSelected();
		System.out.println(radioStatus1);
		Thread.sleep(3000);
		driver.findElement(By.id("female")).click();
		boolean radioStatus2 = driver.findElement(By.id("female")).isSelected();
		System.out.println("The status is: "+radioStatus2);
		
		
	} 

}
