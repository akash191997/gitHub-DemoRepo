package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWait {
	

		public static void main(String [] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://www.flipkart.com/");
			
			driver.findElement(By.name("q")).sendKeys("TVS Apache RTR 310 Booking for Ex-Showroom Price", Keys.ENTER);
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			
			wait.until(ExpectedConditions.titleContains("Login"));
			
			wait.until(ExpectedConditions.urlContains(""));
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(null));
			
		}

}
