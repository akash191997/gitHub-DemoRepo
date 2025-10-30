package Selenium;

import java.time.Duration;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {
	
	public static WebDriver driver;
	
	public static void main(String [] args) throws InterruptedException {
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.name("q")).sendKeys("TVS Apache RTR 310 Booking for Ex-Showroom Price", Keys.ENTER);
		driver.findElement(By.className("DByuf4")).click();
		
		
//		String handle = driver.getWindowHandle();
//		driver.switchTo().window(handle);
//		System.out.println(handle);
		
		String mainWindow = driver.getWindowHandle();

		Set<String> handles = driver.getWindowHandles();

		for (String handle : handles) {
		    if (!handle.equals(mainWindow)) {
		        driver.switchTo().window(handle);  // 🔄 SWITCH to new window
		        break;
		    }
		}
	 	
		
		driver.findElement(By.xpath("//input[@class='zDPmFV']")).sendKeys("I won");
		
		
//		driver.quit();	
//		
	}
	
	

}
