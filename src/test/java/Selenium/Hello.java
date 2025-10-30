package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(ListernsDemo.class)
public class Hello {
	
	@Test
	public void App()
	{
		
	}
	
	@Test
	public void demo() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.name("q")).sendKeys("TVS Apache RTR 310 Booking for Ex-Showroom Price", Keys.ENTER);
		
		
		


}
}