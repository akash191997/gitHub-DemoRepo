package demoProject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("");
		WebElement element = driver.findElement(By.xpath(""));
		
		Select sel = new Select(element);
		sel.selectByIndex(0);
		sel.selectByValue("i6");
		sel.selectByVisibleText("mango");
		
		sel.deselectByIndex(0);
		sel.deselectByValue("i6");
		sel.deselectByVisibleText("mango");
		sel.deselectAll();
		
		sel.isMultiple();
		List<WebElement> allOptions = sel.getOptions();
		sel.getFirstSelectedOption();
		sel.getAllSelectedOptions();
		sel.getWrappedElement();
	}

}
