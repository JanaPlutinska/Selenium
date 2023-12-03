package Selenium;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frames {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.krninformatix.com/frames/frames.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.switchTo().frame(1);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.switchTo().defaultContent();
		
		/*WebElement frm = driver.findElement(By.xpath("//frame[@src='third.html']"));
		driver.switchTo().frame(frm);
		driver.findElement(By.name("check")).click();*/
		
		WebElement frm1 = driver.findElement(By.xpath("//frame[@src='second.html']"));
		driver.switchTo().frame(frm1);
		driver.findElement(By.name("rep")).click();
		
		

	}

}
