package com.utiles;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentTest;

import Base.BaseClass;

public class ExtendReport_Test {
	
    public static ExtentTest extenttest;
    @BeforeSuite
    public void extentReportStartUp() throws IOException {
    	BaseClass baseclass = new BaseClass();
    	baseclass.extentReportStart(null);
    }
    @AfterSuite
    public void extentReportEnd() throws IOException {
    	BaseClass baseclass = new BaseClass();
    	baseclass.extentReportTearDown(null);
}
}