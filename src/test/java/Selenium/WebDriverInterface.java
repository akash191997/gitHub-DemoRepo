package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverInterface    // WebDriver is Interface provided by selenium. It is implemented by the classes like ChromeDriver, 
								   // ---EdgeDriver, FirefoxDriver and it contains almost 15 methods

{
	public static void main(String [] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String title = driver.getTitle();
		System.out.println(title);
		
		System.out.println(driver.getCurrentUrl());
		
//		System.out.println(driver.getPageSource());
	
//		driver.close();
		
		WebElement user = driver.findElement(By.name("username"));
		user.sendKeys("Admin");
		WebElement pass = driver .findElement(By.name("password"));
		pass.sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		
		
		driver.quit();

	}
}