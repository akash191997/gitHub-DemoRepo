package Selenium;

import java.awt.Dimension;

import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_switchTo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

//			Point diamention = new Point(50,50);
//			
//			driver.manage().window().setPosition(diamention);
//			
//			driver.navigate().to("https://www.google.com/?zx=1758356096674&no_sw_cr=1");
//			
//			Thread.sleep(2000);

		driver.manage().window().maximize();

		driver.navigate().to("https://www.google.com/");
		
		driver.switchTo().activeElement().sendKeys("Hello Google",Keys.ENTER);

		Thread.sleep(2000);

			driver.navigate().back();
			
			Thread.sleep(2000);
			driver.navigate().forward();
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			
			
		
		

	}
}
