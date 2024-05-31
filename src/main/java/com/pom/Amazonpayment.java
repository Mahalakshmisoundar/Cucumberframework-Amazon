package com.pom;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.utiles.ExtendReport_Test;

import Base.BaseClass;

public class Amazonpayment extends BaseClass  {

	public static WebDriver driver;
	
	
	
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getCatbtn1() {
		return catbtn1;
	}
	public WebElement getProcessToPay() {
		return processToPay;
	}
	public WebElement getUseAddress() {
		return useAddress;
	}
	public WebElement getCreditCart() {
		return creditCart;
	}
	public WebElement getEnterCardDetails() {
		return enterCardDetails;
	}
	public WebElement getCardNumber() {
		return cardNumber;
	}
	public WebElement getSubmitCard() {
		return submitCard;
	}
	@FindBy(xpath="//a[@class='nav-a nav-a-2 nav-progressive-attribute']")
	private WebElement catbtn1;
	@FindBy(xpath = "//input[@name='proceedToRetailCheckout']")
	private WebElement processToPay;
	@FindBy(xpath = "//input[@aria-labelledby='shipToThisAddressButton-announce']")
	private WebElement useAddress;
	@FindBy(xpath = "//input[@value='SelectableAddCreditCard']")
	private WebElement creditCart;
	@FindBy(xpath = "(//a[@class='a-link-emphasis pmts-add-cc-default-trigger-link'])[1]")
	private WebElement enterCardDetails;
	@FindBy(xpath = "//input[@type='tel']")
	private WebElement cardNumber;
	@FindBy(xpath = "//input[@name='ppw-widgetEvent:AddCreditCardEvent']")
	private WebElement submitCard;
	



public  Amazonpayment(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver2, this);
	}




//public void paymentProcess(){
//	
//	implicitWait(30);
//	clickOnElement(driver, catbtn1);
//	clickOnElement(driver, processToPay);
//	clickOnElement(driver, useAddress);
//	staticWait(5000);
//	clickOnElement(driver, creditCart);
//	clickOnElement(driver, enterCardDetails);
//	staticWait(5000);
//	frameByIndex(0);
//	passInput(driver, cardNumber, "6543 2456 76");
//	clickOnElement(driver, submitCard);
//	//Assert.assertEquals(errorMassage.getText(), "There was a problem.");		
	
	
}




