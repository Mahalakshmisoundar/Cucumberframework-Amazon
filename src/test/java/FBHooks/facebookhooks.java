package FBHooks;

import org.openqa.selenium.WebDriver;

import Base.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class facebookhooks extends BaseClass {

	@Before
	  public void launchBrowser() {
        browserLauch("chrome");
	}
	@BeforeStep
	@Override
	public void launchUrl(WebDriver driver, String url) {
		// TODO Auto-generated method stub
		launchUrl(driver, "https://www.facebook.com");
	}
	@AfterStep
	private void close() {

	}
	
	@After
	private void CloseBrowser() {
         terminateBrowser();
	}
	
	
}
