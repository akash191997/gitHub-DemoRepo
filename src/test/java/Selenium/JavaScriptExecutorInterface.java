package Selenium;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorInterface {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();   //upcasting
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");
		
		 JavascriptExecutor jse = (JavascriptExecutor)driver; 
		
		jse.executeScript("windows.scrollBy(0,500)");
		
		
	}
}
