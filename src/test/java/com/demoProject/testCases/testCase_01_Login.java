package com.demoProject.testCases;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.demoProject.generic.BaseTest;
import com.demoProject.generic.Flib;
import com.demoProject.generic.TestNGListners;
import com.demoProject.pageObjects.loginPage;

@Listeners(com.demoProject.generic.TestNGListners.class)
public class testCase_01_Login extends BaseTest {
	
	
	@Test
	public void testLoginMethod() throws IOException, InterruptedException {

		Flib flib = new Flib();

		String username1 = flib.readPropertyData(PROP_PATH, "username");
		String password1 = flib.readPropertyData(PROP_PATH, "password");

		loginPage lp = new loginPage(driver);

		lp.loginMethod(username1, password1);

	}
	
	
}
