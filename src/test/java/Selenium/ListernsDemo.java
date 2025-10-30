package Selenium;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListernsDemo implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println(result.getName()+ " Test statrted");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println(result.getName()+ " Test Successfully Passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println(result.getName()+ " Test is failed");
	}

	
	
	
}
