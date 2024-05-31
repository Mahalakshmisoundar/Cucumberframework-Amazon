package stepdefinition;

import com.pom.Amazonpayment;
import com.pom.amazonLoginPage;
import com.pom.AmazonSearchPdt;
import Base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepdefAmazon extends BaseClass {
         

         amazonLoginPage amazonLoginPage = new amazonLoginPage(driver);
	
	@Given("User Landed on the Amazonpage")
	public void user_landed_on_the_amazonpage() {
//		driver = new ChromeDriver();
		launchUrl(driver,"https://www.amazon.in");
//		driver.manage().window().maximize();
		
	}
	@When("User Click SignIn Button")
	public void user_click_sign_in_button() {
	    clickOnElement(driver,amazonLoginPage.getSignInbtn());
	    //amazonLoginPage.getSignInbtn().click();
	}
	@When("User Enter the UserName in Username field {string}")
	public void user_enter_the_user_name_in_username_field(String string) {
	   passInput(driver,amazonLoginPage.getEmailId(),"mahasoundar1998@gmail.com");
		
	}
	@When("User Click the Continue Button")
	public void user_click_the_continue_button() {
		clickOnElement(driver,com.pom.amazonLoginPage.getContinueBtn());
	}
	@When("User Enter the Password in Password field {string}")
	public void user_enter_the_password_in_password_field(String string) {
		passInput(driver,amazonLoginPage.getPassword(),"12345678");
	}
	@When("User Click the SignIn Button to Navigate to next Page")
	public void user_click_the_sign_in_button_to_navigate_to_next_page() {
		clickOnElement(driver,amazonLoginPage.getSignInBtn2());
	}
	@Then("User Landed on the Amazon HomePage")
	public void user_landed_on_the_amazon_home_page() {
	    System.out.println("user sucessfully navigate to home page");
	}

	
	AmazonSearchPdt AmazonSearchPdt= new AmazonSearchPdt(driver);
	
	@When("User Click the Search Box")
	public void user_click_the_search_box() {
	   clickOnElement(driver, AmazonSearchPdt.getSearchbox());
	}
	@When("User Enter the Laptop Name on Search Field {string}")
	public void user_enter_the_laptop_name_on_search_field(String string) {
	    passInput(driver, AmazonSearchPdt.getSearchbox() , "Apple iPhone 15 Pro Max (1 TB)");
	}
	@When("User Click the Search Button And Navigate to the ProductPage")
	public void user_click_the_search_button_and_navigate_to_the_product_page() {
		 clickOnElement(driver, AmazonSearchPdt.getSearchbtn());
	}
	@Then("User Sucessfully Navigate to  Product Page")
	public void user_sucessfully_navigate_to_product_page() {
	  System.out.println("Product page");
	  
	}
	@When("User Click the First Product")
	public void user_click_the_first_product() {
		clickOnElement(driver, AmazonSearchPdt.getClickpdt());
		windowHandler(1);
	}
	@Then("User Navigate the Particular ProductPage")
	public void user_navigate_the_particular_product_page() {
		System.out.println("Particular Product page");
	}
	@When("User Click AddtoCart Button")
	public void user_click_addto_cart_button() {
		windowHandler(1);
		staticWait(5000);
		JSScrollBy(500);
	   JSFindElement( AmazonSearchPdt.getAddtocartbtn());
	   staticWait(5000);
	}
	@When("User Click AddtoCart Button2")
	public void user_click_addto_cart_button2() {
		clickOnElement(driver, AmazonSearchPdt.getCartbtn());
	}
	
	Amazonpayment Amazonpayment= new Amazonpayment(driver);
	
	
	@When("User Click the Cart Button")
	public void user_click_the_cart_button() {
	clickOnElement(driver, Amazonpayment.getCatbtn1());	
	    
	}
	@When("User Click Pay to Process Button")
	public void user_click_pay_to_process_button() {
	    clickOnElement(driver, Amazonpayment.getProcessToPay());
	}
	@When("User click Use Address Button")
	public void user_click_use_address_button() {
		clickOnElement(driver, Amazonpayment.getUseAddress());
	}
	@When("User Click Credit Card Button")
	public void user_click_credit_card_button() {
		staticWait(5000);
		clickOnElement(driver, Amazonpayment.getCreditCart());
	}
	@When("User Enter the Card Details")
	public void user_enter_the_card_details() {
		clickOnElement(driver, Amazonpayment.getEnterCardDetails());
	}
	@When("User Enter The Card Number {string}")
	public void user_enter_the_card_number(String string) {
		staticWait(5000);
		frameByIndex(0);
		passInput(driver, Amazonpayment.getCardNumber(), "435657678" );
	}
	@When("User Click the Submit Card Button")
	public void user_click_the_submit_card_button() {
		clickOnElement(driver, Amazonpayment.getSubmitCard());
	   
	}


}
