package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathAxis {
	
	public static void main(String [] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.flipkart.com/");
			
		driver.findElement(By.cssSelector("input[class*='ke_E']")).sendKeys("ron Cubord", Keys.ENTER);   // cssSelector locators (^/$/*)
		
		WebElement tab = driver.findElement(By.xpath("//div[@class='DOjaWF gdgoEp']/descendant::div[text()='Popularity']"));
		
		tab.click(); 
	    System.out.println(tab);
		
		
		//div[@class='DOjaWF gdgoEp']/descendant::div[text()='Popularity']          // descendant- it will click on child element
		//a[@title='Vehicles']/ancestor::div[@class='GSeM5C']                       // ancestor- it will click on parent element
		//div[.='Relevance']/following-sibling::div[.='Newest First']               // following-sibling = it will click on next element
		//div[.='Newest First']/preceding-sibling::div[.='Relevance']               // preceding-sbling = it will click on previous element
		
			
		
		
//		driver.findElement(By.xpath("//div[.='Popularity']")).click();
//
//		WebElement firstBikePrice = driver.findElement(By.xpath("//div[@data-id='MCYHA2ZE55NMMANU']/descendant::div[@class='Nx9bqj _4b5DiR']"));
//		String amount = firstBikePrice.getText();
//		System.out.println(amount);
//		
//		WebElement firstBike= driver.findElement(By.xpath("//div[@data-id='MCYHA2ZE55NMMANU']/descendant::div[@class='KzDlHZ']"));
//		String name = firstBike.getText();
//		System.out.println(name);
//
//	
//		Thread.sleep(3000);
//		driver.quit();
		
	}
	

}
