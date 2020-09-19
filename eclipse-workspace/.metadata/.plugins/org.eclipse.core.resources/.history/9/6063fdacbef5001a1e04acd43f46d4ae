package com.hrms.utils;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {
	public void onTestSuccess(ITestResult result) {
		CommonMethods.takeScreenshot("passed/" + result.getName());
	}

	public void onTestfailure(ITestResult result) {
		CommonMethods.takeScreenshot("failed/" + result.getName());
	}
}
