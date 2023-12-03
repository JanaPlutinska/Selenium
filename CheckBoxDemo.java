package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBoxDemo {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.krninformatix.com/sample.html");
		boolean checkBoxStatus = driver.findElement(By.id("rem")).isSelected();
		System.out.println(checkBoxStatus);
		Thread.sleep(3000);
		driver.findElement(By.id("rem")).click();
		boolean checkBoxStatus2 = driver.findElement(By.id("rem")).isSelected();
		System.out.println(checkBoxStatus2);
		Thread.sleep(3000);
		boolean checkBoxStatus3 = driver.findElement(By.id("rem")).isSelected();
		System.out.println(checkBoxStatus3);
		if(checkBoxStatus3) {
			driver.findElement(By.id("rem")).click();
		}
	}

}
