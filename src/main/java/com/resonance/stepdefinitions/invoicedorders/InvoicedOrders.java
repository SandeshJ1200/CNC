package com.resonance.stepdefinitions.invoicedorders;
import org.testng.asserts.*;


import com.resonance.pages.DashboardManager;
import com.resonance.pages.HomePage;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class InvoicedOrders {
	HomePage home = new HomePage();
	DashboardManager dmr = new DashboardManager();
	
	
   @Given ("User logs into the application as manager")
   public void loginToTheApplication() {
		
		home.loginAsManager();
	}
      @When ("manager selects picking tab")
    public void selectPickingTab() throws InterruptedException {
		dmr.clickOnPickingTab();
     Thread.sleep(1000);
	}
      
      @Then ("manager selects Invoiced orders option")
      public void selectInvoicedOrders() throws InterruptedException {
		dmr.clickOnInvoicedOrdersTab();
		Thread.sleep(2000);

	}
      @Then ("manager clicks on Search Text Box")
     public void clickOnSearchTextBox() {
		dmr.clickOnSearchTextBox();

	}
      @Then ("manager should be able to search customer with Name,OrderID,Invoiced Date,Status,RouteNumber")
      public void typeIntheSearchBox() {
	   dmr.typeIntheSearchBox();

	}
      @Then ("manager clicks on the action button")
      public void selectActionTab() {
       dmr.clickOnActionsTab();

	}
	   

	
     
}
