package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static WebDriver driver;
	
	public static void main(String [] args) throws InterruptedException {
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.name("q")).sendKeys("TVS Apache RTR 310 Booking for Ex-Showroom Price", Keys.ENTER);
		
		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
		System.out.println(elements.size());
	
//		for(int i=0; i<elements.size(); i++)                             // for loop
//		{
//			WebElement Bikes = elements.get(i);
//			
//			System.out.println("Sr.No. "+ i +" "+Bikes.getText());
//		}

		for(WebElement element : elements)    // for each loop
		
		{
			System.out.println(element.getText());
			
		}
		
	
		
		driver.quit();
		
}
}