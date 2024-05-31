package stepdefinition;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionFB {
	static WebDriver driver;
	
	
	

	@Given("User Landed The Facebook Page")
	public void user_landed_the_facebook_page() {

		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		

	}

	@When("User Enter The Username In Username Field {string}")
	public void user_enter_the_username_in_username_field(String username ) {
		driver.findElement(By.id("email")).sendKeys(username);
	}

	@When("User Enter The Password In Password Field {string}")
	public void user_enter_the_password_in_password_field(String password) {
		driver.findElement(By.id("pass")).sendKeys(password);
	}

	@When("User Click The Login button")
	public void user_click_the_login_button() {
		driver.findElement(By.name("login")).click();
	}

	@Then("User Can Navigate To The Facebook Home Page")
	public void user_can_navigate_to_the_facebook_home_page() {
		System.out.println("user can enter the login page");
	}

}
