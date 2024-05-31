package TestRunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import Base.BaseClass;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		features="src\\test\\java\\Feature\\facebook.feature",
		glue={"stepdefinition" , "FBHooks"
		},
//		monochrome=false,
//		dryRun=true,
//		publish=true,
		snippets = SnippetType.CAMELCASE,
		
		
		plugin= {
		     "html:HTMLReports/Report.html",
		      "pretty",
		      "json:JSONReports/AmazonReportjs.json",
		      "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		}
		)
	

public class facebookrunner extends BaseClass {

	
//	@BeforeClass
//	 public static void startBrowser() {
//		browserLauch("chrome");
//		
//	}
//	
//	@AfterClass
//	 public static void closeBrowser() {
//         terminateBrowser();
	}

