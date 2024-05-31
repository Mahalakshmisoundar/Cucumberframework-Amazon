  package com.pom;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.util.Assert;

import Base.BaseClass;

public class amazonLoginPage extends BaseClass{
       
	public WebDriver driver;
	
	@FindBy(id = "nav-link-accountList")
	private WebElement signInbtn;

	

	@FindBy(xpath = "//input[@id='ap_email']")
	public WebElement emailId;

	@FindBy(xpath = "//input[@id='continue']")
	public static WebElement continueBtn;

	@FindBy(xpath = "//input[@id='ap_password']")
	private WebElement password;

	@FindBy(xpath = "//input[@id='signInSubmit']")
	private WebElement signInBtn2;

	@FindBy(xpath = "//span[@class='a-list-item']")
	private WebElement inputError;

	@FindBy(xpath = "//div[contains( text(),' Enter your email or mobile')]")
	private WebElement emptyEmail;

	@FindBy(xpath = "//div[contains( text(),' Enter your password')]")
	private WebElement emptyPassword;

	// constructor
	public  amazonLoginPage(WebDriver driver2) {
         this.driver = driver2;
		PageFactory.initElements(driver, this);

	}
	

	public  WebElement getSignInbtn() {
		return signInbtn;
	}

	public  WebElement getEmailId() {
		return emailId;
	}

	public static WebElement getContinueBtn() {
		return continueBtn;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSignInBtn2() {
		return signInBtn2;
	}

	public WebElement getInputError() {
		return inputError;
	}

	public WebElement getEmptyEmail() {
		return emptyEmail;
	}

	public WebElement getEmptyPassword() {
		return emptyPassword;
	}

//	public boolean validLogIn(ExtentTest extentTest) {
//
//		try {
//			implicitWait(30);
//			launchUrl(driver, "https://www.amazon.in/");
//			clickOnElement(driver, signInbtn);
//			passInput(driver, emailId, "mahasoundar1998@gmail.com");
//			clickOnElement(driver, continueBtn);
//			passInput(driver, password, "12345678");
//			clickOnElement(driver, signInBtn2);
//			staticWait(10000);
//			String title = driver.getTitle();
//			assertEquals(title,
//					"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
//			extentTest.log(Status.PASS, "Login Successful");
//		} catch (AssertionError e) {
//			extentTest.log(Status.FAIL, "Login Failed");
//
//			return false;
//		}
//		return true;
//	}
//
//	public void inValidEmailId() {
//
//		launchUrl(driver, "https://www.amazon.in/");
//		clickOnElement(driver, signInbtn);
//		passInput(driver, emailId, "mahasoundar199@gmail.com");
//		clickOnElement(driver, continueBtn);
//		org.testng.Assert.assertEquals(inputError.getText(), "We cannot find an account with that email address");
//
//	}
//
//	public void validEmailIdAndInvalidPassword() {
//
//		launchUrl(driver, "https://www.amazon.in/");
//		clickOnElement(driver, signInbtn);
//		passInput(driver, emailId, "mahasoundar1998@gmail.com");
//		clickOnElement(driver, continueBtn);
//		passInput(driver, password, "123456");
//		clickOnElement(driver, signInBtn2);
//		staticWait(15000);
//		org.testng.Assert.assertEquals(inputError.getText(), "Your password is incorrect");
//	}
//
//	public void emailIdWithEmptyText() {
//
//		launchUrl(driver, "https://www.amazon.in/");
//		clickOnElement(driver, signInbtn);
//		passInput(driver, emailId, "");
//		clickOnElement(driver, continueBtn);
//		org.testng.Assert.assertEquals(emptyEmail.getText(), "Enter your email or mobile phone number");
//	}
//
//	public void validEmailIdWithEmptyPassword() {
//
//		launchUrl(driver, "https://www.amazon.in/");
//		clickOnElement(driver, signInbtn);
//		passInput( driver, emailId, "mahasoundar1998@gmail.com");
//		clickOnElement(driver, continueBtn);
//		passInput(driver, password, "");
//		clickOnElement(driver, signInBtn2);
//		org.testng.Assert.assertEquals(emptyPassword.getText(), "Enter your password");
//	}

}
