import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ActionClass {
public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("");
		WebElement source = driver.findElement(By.xpath(""));
		WebElement target = driver.findElement(By.xpath(""));
		
		 Actions act = new Actions(driver);
		 
		act.contextClick(target).perform();
		act.moveToElement(target).perform();
		act.doubleClick(target).perform();
		act.dragAndDrop(source, target).perform();
		
		
		
		
		
}
}