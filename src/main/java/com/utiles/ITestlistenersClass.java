package com.utiles;

import java.io.IOException;

import org.testng.ITestListener;

import org.testng.ITestResult;

import com.aventstack.extentreports.MediaEntityBuilder;

import Base.BaseClass;

public class ITestlistenersClass extends BaseClass implements ITestListener {

	public String testName;
	public String methodName;

	@Override
	public void onTestStart(ITestResult result) {
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		try {
			ExtendReport_Test.extenttest.pass(result.getMethod().getMethodName() + " : " + "test pass",
					MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot()).build());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestFailure(ITestResult result) {
		ExtendReport_Test.extenttest.fail(result.getMethod().getMethodName()+" : "+"test fail",
				MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot()).build());
	}
	
	
	
}