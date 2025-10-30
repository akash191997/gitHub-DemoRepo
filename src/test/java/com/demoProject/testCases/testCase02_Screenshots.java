package com.demoProject.testCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.demoProject.generic.BaseTest;
import com.demoProject.generic.Flib;
import com.demoProject.pageObjects.loginPage;


public class testCase02_Screenshots extends BaseTest {

	static WebDriver driver;

	@Test
	public void testInvalidLoginMethod() throws IOException, InterruptedException {

		
		
		Flib flib = new Flib();

		String username1 = flib.readPropertyData(PROP_PATH, "username");
		String password1 = flib.readPropertyData(PROP_PATH, "pass111");

		loginPage lp = new loginPage(driver);

		lp.inValidloginMethod(username1, password1);
		
		

	}

}
