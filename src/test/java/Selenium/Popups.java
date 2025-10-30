package Selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Popups {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions(); // for Notification pop-up

		options.addArguments("-start-maximized");
		options.addArguments("--disable-notifications");

		WebDriver driver = new ChromeDriver(options);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");

		Alert al = driver.switchTo().alert(); // for Alert & Confirmation pop-up

		al.accept();
		al.dismiss();

	}
}