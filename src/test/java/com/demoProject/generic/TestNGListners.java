package com.demoProject.generic;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListners extends BaseTest implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {

		CaptureScreenshot(result.getName() + "_Start");

		System.out.println(result.getName() + " Test is Stareted");

	}

	@Override
	public void onTestSuccess(ITestResult result) {

		System.out.println(result.getName() + " Test is passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {

		CaptureScreenshot(result.getName() + "_Failed");

		System.out.println(result.getName() + " Test is Failed");

	}

	@Override
	public void onTestSkipped(ITestResult result) {

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {

	}

	@Override
	public void onStart(ITestContext context) {

	}

	@Override
	public void onFinish(ITestContext context) {

	}

}
