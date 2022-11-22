package com.resonance.stepdefinitions.invoicedorders;
import org.testng.asserts.*;

import com.resonance.pages.HomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class InvoicedOrders {
   @Given ("User logs into the application as manager")
   public void loginToTheApplication() {
		HomePage home = new HomePage();
		home.clickOnLogin();
		home.enterUserName("manager");
		home.enterPassword("12345678");
		home.clickOnLogin();
	}
      @When ("manager selects Invoiced order from picking list")
     public void SelectInvoicedOrder() {
		

	}
      @Then ("manager should see the list of Invoiced details")
      public void InvoicedList() {
		

	}
}
