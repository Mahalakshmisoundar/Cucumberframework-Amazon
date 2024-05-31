package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Base.BaseClass;
import bsh.This;

public class AmazonSearchPdt extends BaseClass{
    
	public static WebDriver driver;


	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getSearchbox() {
		return searchbox;
	}

	public WebElement getSearchbtn() {
		return searchbtn;
	}

	public WebElement getClickpdt() {
		return clickpdt;
	}

	public WebElement getAddtocartbtn() {
		return addtocartbtn;
	}

	public WebElement getAddtocarttv() {
		return addtocarttv;
	}

	public WebElement getCartbtn() {
		return cartbtn;
	}

	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	private WebElement searchbox;
	@FindBy(xpath="//input[@id='nav-search-submit-button']")
	 private WebElement searchbtn;
	@FindBy(xpath="//span[@class='a-size-medium a-color-base a-text-normal'][1]")
	private WebElement clickpdt;
	@FindBy(xpath ="(//input[@id='add-to-cart-button'])[2]")
	private WebElement addtocartbtn;
	@FindBy(xpath ="(//input[@aria-labelledby='submit.add-to-cart-announce'])[2]")
	private WebElement addtocarttv;
	@FindBy(xpath="//input[@aria-labelledby='attach-sidesheet-view-cart-button-announce']")
	private WebElement cartbtn; 
//	@FindBy(xpath="//a[@id='nav-cart']")
//	private WebElement catbtn1;
//	@FindBy(xpath = "//input[@name='proceedToRetailCheckout']")
//	private WebElement processToPay;
//	@FindBy(xpath = "//input[@aria-labelledby='shipToThisAddressButton-announce']")
//	private WebElement useAddress;
//	@FindBy(xpath = "//input[@value='SelectableAddCreditCard']")
//	private WebElement creditCart;
//	@FindBy(xpath = "(//a[@class='a-link-emphasis pmts-add-cc-default-trigger-link'])[1]")
//	private WebElement enterCardDetails;
//	@FindBy(xpath = "//input[@type='tel']")
//	private WebElement cardNumber;
//	@FindBy(xpath = "//input[@name='ppw-widgetEvent:AddCreditCardEvent']")
//	private WebElement submitCard;
	
	


	public AmazonSearchPdt(WebDriver driver1) {
		
				this.driver = driver1;
				PageFactory.initElements(driver, this);
	
	
}
	
//	public void searchProduct() {
//		implicitWait(30);
//		clickOnElement(driver, searchbox);
//		passInput(driver, searchbox, "Apple iPhone 15 Pro Max (1 TB) - Blue Titanium" );
//		clickOnElement(driver, searchbtn);
//		clickOnElement(driver, clickpdt);
//		staticWait(5000);
//		windowHandler(1);
//		JSScrollBy(500);
//		JSFindElement(addtocartbtn);
//		staticWait(5000);
//		clickOnElement(driver, cartbtn);
//		closeTab();
//		windowHandler(0);
//		
//	}
//
//	public void searchProduct2() {
//		implicitWait(30);
//		clickOnElement(driver, searchbox);
//		searchbox.clear();
//		passInput(driver, searchbox, "Lenovo ThinkPad E14 Intel Core i5 13th Gen 14\" WUXGA IPS 300 Nits Thin and Light Laptop" );
//		clickOnElement(driver, searchbtn);
//		clickOnElement(driver, clickpdt);
//		staticWait(5000);
//		windowHandler(1);
//		JSScrollBy(500);
//		JSFindElement(addtocartbtn);
//		staticWait(5000);
//		clickOnElement(driver, cartbtn);
//		closeTab();
//		windowHandler(0);
//
//		
//	}
//
//	
//	   public void searchProduct3() {
//	   implicitWait(30);
//   	   clickOnElement(driver, searchbox);
//		searchbox.clear();
//	   passInput(driver, searchbox, "Dell 14 Laptop, 12th Gen Intel Core i5-1235U Processor,"
//	   		+ " 16GB, 512GB, 14.0\" (35.56cm) FHD Display, Windows 11 + MSO'21, Spill-Resistant Keyboard, 15 Month Mcafee, Black, Thin & Light- 1.48kg)");
//	   clickOnElement(driver, searchbtn);
//	   clickOnElement(driver, clickpdt);		
//	   staticWait(5000);
//	   windowHandler(1);
//	   JSScrollBy(500);
//	   JSFindElement(addtocarttv);
//		staticWait(5000);
//		clickOnElement(driver, cartbtn);
//	   
//	  
//		windowHandler(0);
//		searchbox.clear();
//		
		
	}
	
//public void paymentProcess(){
//		
//		implicitWait(30);
//		clickOnElement(driver, catbtn1);
//		clickOnElement(driver, processToPay);
//		clickOnElement(driver, useAddress);
//		staticWait(5000);
//		clickOnElement(driver, creditCart);
//		clickOnElement(driver, enterCardDetails);
//		staticWait(5000);
//		frameByIndex(0);
//		passInput(driver, cardNumber, "6543 2456 76");
//		clickOnElement(driver, submitCard);
//		//Assert.assertEquals(errorMassage.getText(), "There was a problem.");		
//		
//		
//	}


	
	
//}

		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
//	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
//	private WebElement searchBox;
//
//	@FindBy(xpath = "//input[@id='nav-search-submit-button']")
//	private WebElement searchBtn;
//
//	@FindBy(xpath = "(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")
//	private WebElement product1;
//
//	@FindBy(xpath = "(//input[@id='add-to-cart-button'])[2]")
//	private WebElement cartBtn;
//
//	@FindBy(xpath = "//input[@aria-labelledby='attach-sidesheet-view-cart-button-announce']")
//	private WebElement addCart;
//
//	@FindBy(xpath = "(//div[@class='a-row'])[1]")
//	private WebElement noResultproduct;
//
//	@FindBy(className = "s-no-outline")
//	private WebElement invalidName;
//
//	@FindBy(xpath = "(//div[@class='a-row'])[1]")
//	private WebElement noResultMsg;
//
//	// constructor
//	public AmazonSearchPdt(WebDriver driver1) {
//
//		this.driver = driver1;
//		PageFactory.initElements(driver, this);
//	}
//
//	public void searchProduct1() {
//
//		implicitWait(30);
//		clickOnElement(driver, searchBox);
//		passInput(null, searchBox, "lenovo ideapad slim 5");
//		clickOnElement(driver, searchBtn);
//		clickOnElement(driver, product1);
//		staticWait(5000);
//		windowHandler(1);
//		JSScrollBy(900);
//		JSFindElement(cartBtn);
//		staticWait(5000);
//		clickOnElement(driver, addCart);
//
//		String title = driver.getTitle();
//		Assert.assertEquals(title, "Amazon.in Shopping Cart");
//		closeTab();
//		windowHandler(0);
//	}
//
//	public void searchProduct2() {
//
//		implicitWait(30);
//		clearText(searchBox);
//		clickOnElement(driver, searchBox);
//		passInput(driver, searchBox, "samsung s24 ultra 5g");
//		clickOnElement(driver, searchBtn);
//		clickOnElement(driver, product1);
//		staticWait(5000);
//		windowHandler(1);
//		JSScrollBy(900);
//		JSFindElement(cartBtn);
//		staticWait(5000);
//		clickOnElement(driver, addCart);
//
//		String title = driver.getTitle();
//		Assert.assertEquals(title, "Amazon.in Shopping Cart");
//		closeTab();
//		windowHandler(0);
//	}
//
//	public void searchProduct3() {
//
//		implicitWait(30);
//		clearText(searchBox);
//		clickOnElement(driver, searchBox);
//		passInput(driver, searchBox, "google pixel 8 pro");
//		clickOnElement(driver, searchBtn);
//		clickOnElement(driver, product1);
//		staticWait(5000);
//		windowHandler(1);
//		JSScrollBy(900);
//		JSFindElement(cartBtn);
//		staticWait(5000);
//		clickOnElement(driver, addCart);
//
//		String title = driver.getTitle();
//		Assert.assertEquals(title, "Amazon.in Shopping Cart");
//
//	}
//
//	public void searchProductWithInvalidName() {
//
//		implicitWait(30);
//		clickOnElement(driver, searchBox);
//		passInput(driver, searchBox, "qwertgdseryqwedsawfg");
//		clickOnElement(driver, searchBtn);
//		Assert.assertEquals(noResultMsg.getText(), "No results for qwertgdseryqwedsawfg.");
//
//	}
//
//}
//
//	

