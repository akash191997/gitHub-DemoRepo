package Selenium;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;


public class Assertion {                      // validation and verification purpose

	public static void main(String[] args) {
		
		assertEquals("Hello", "Hello");       // Hard assert if it fails execution stops

		
		SoftAssert sa = new SoftAssert();   //Soft assert= use for non-mandatory or non-critical feature
		
		sa.assertEquals("Hii", "Hii");
		
		System.out.println("Hii");
		sa.assertAll();
		
		Assert.assertEquals("Demo", "Demo");
		
	}
}

