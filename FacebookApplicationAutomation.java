package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class FacebookApplicationAutomation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rasti\\OneDrive\\Počítač\\SeleniumJarFiles\\SeleniumJarFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		//driver.findElements(((WebElement) By.id("email")).sendKeys("jana.plutinska@gmail.com"));
		driver.findElement(By.id("pass")).sendKeys("password");
		driver.findElement(By.id("email")).sendKeys("jana.plutinska@gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.id("u_0_5_Ae")).click();
		Thread.sleep(5000);

		
		
				
	}

}
