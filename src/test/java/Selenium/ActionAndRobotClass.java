package Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionAndRobotClass {

	public static WebDriver driver;

	public static void main(String[] args) throws AWTException {

		Robot rb = new Robot();

		rb.keyPress(KeyEvent.VK_A);
		rb.keyRelease(KeyEvent.VK_A);

		Actions act = new Actions(driver);

		act.contextClick(null).perform();             // null = WebElement element
		act.doubleClick(null).perform();
		act.moveToElement(null).perform();
		act.dragAndDrop(null, null).perform();

	}

}

