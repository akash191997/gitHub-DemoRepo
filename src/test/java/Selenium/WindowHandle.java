package Selenium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {
public static WebDriver driver;
	
	public static void main(String [] args) throws InterruptedException {
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.name("q")).sendKeys("TVS Apache RTR 310 Booking for Ex-Showroom Price", Keys.ENTER);
		WebElement check = driver.findElement(By.className("DByuf4"));
		check.click();
		
		
		String mainWindow = driver.getWindowHandle();
		
		driver.switchTo().window(mainWindow);    //to switch the driver's focus back to the main (original) browser window or tab after 
		                                         //--- you've opened and worked with one or more new windows or tabs.

		Thread.sleep(4000);

		driver.findElement(By.xpath("//a[@class='wsejfv']")).click();
		
		Thread.sleep(4000);

		
		driver.quit();	
		
	}
	
 
}
