package TestRunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import Base.BaseClass;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		features="src\\test\\java\\Feature\\Amazon.feature",
		glue="stepdefinition",
		dryRun=true,
		
		
		plugin= {
		     "html:HTMLReports/Report.html",
		      "pretty",
		      "json:JSONReports/AmazonReportjs.json",
		      "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		}
		)
public class AmazonRunner extends BaseClass {
	
	
	
	@BeforeClass
	 public static void startBrowser() {

		BaseClass.browserLauch("chrome");
		
	}
	
	@AfterClass
	public static void closeBrowser() {
       terminateBrowser();
	}

}