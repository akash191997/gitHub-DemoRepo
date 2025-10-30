package Selenium;

import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	public static void main(String[] args) {
		
		Select sel = new Select(null);      // null= WebElement element
		
		sel.selectByIndex(0);               // Select Method
		sel.selectByValue("i6"); 
		sel.selectByVisibleText("Mango");
		
		sel.deselectByIndex(0);             // Deselect Method
		sel.deselectByValue("i6");
		sel.deselectByVisibleText("Mango");
		sel.deselectAll();
		
		
		sel.isMultiple();                   // Action can be perform on dropdown
		sel.getOptions();
		sel.getFirstSelectedOption();
		sel.getAllSelectedOptions();
		sel.getWrappedElement();
		
	}
}
