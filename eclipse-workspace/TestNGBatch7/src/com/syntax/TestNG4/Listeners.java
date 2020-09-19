package com.syntax.TestNG4;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{

	public void onTestStart(ITestResult result) {
		System.out.println("Test started "+result.getName());
	}
	public void onTestSucces(ITestResult result) {
		System.out.println("Test passed"+result.getName());
	}
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Failed "+result.getName());
	}
	public void onStart(ITestContext context) {
		System.out.println("Starting test inside xml "+context.getName());
	}
	public void onFinish(ITestContext context) {
		System.out.println("Ending test inside xml "+context.getName());
	}
}
