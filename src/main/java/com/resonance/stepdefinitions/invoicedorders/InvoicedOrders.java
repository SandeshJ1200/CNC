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

	@Given("User logs into the application as manager")
	public void loginToTheApplication() {

		home.loginAsManager();
	}

	@When("manager selects picking tab")
	public void selectPickingTab() throws InterruptedException {
		dmr.clickOnPickingTab();
		Thread.sleep(1000);
	}

	@Then("manager selects Invoiced orders option")
	public void selectInvoicedOrders() throws InterruptedException {
		dmr.clickOnInvoicedOrdersTab();
		Thread.sleep(2000);

	}

	@Then("manager clicks on Search Text Box")
	public void clickOnSearchTextBox() {
		dmr.clickOnSearchTextBox();

	}

	@Then("manager should be able to search customer with Name,OrderID,Invoiced Date,Status,RouteNumber")
	public void typeIntheSearchBox() {
		dmr.typeIntheSearchBox();

	}

	@Then("manager clicks on the action button")
	public void selectActionTab() {
		dmr.clickOnActionsTab();

	}

	@Then("manager clicks on the Action button from the table")
	public void selectActionsTab() {
		dmr.selectActionTab();

	}
     
	@Then("manager clicks Edit tab from the dropdown list of Action button")
	   public void selectEditTab() {
		dmr.selectEditTab();

	}
	@Then("manager clicks on the From Date Search box")
	       public void fdSearchTextBox() {
			dmr.prevSerachBox();

	}
	@Then("manager clicks on the left Arrow")
	public void clickonLeftArrow() {
		dmr.fromDateSearchBox();

	}
	@Then("manager selects a date from the From date Search Box")
	     public void selectFromDate() {
			dmr.fromSelectDate();

	}
	@Then("manager clicks on the To Date Search box")
	     public void nextDateSearchBox() {
			dmr.nextSearchBox();

	}
	
	@Then("manager select a date from the To date Search Box")
	   public void selectToDate() {
		dmr.toSelectDate();

	}
	
	@Then("manager click on the submit button")
	  public void submit() {
		dmr.clicksubmitButton();

	}
	@Then("manager should click on the Action button from the table")
	public void clickActionsTab() {
		dmr.selectActionTab();

	}
	
	@Then("manager clicks on the Download Invoice from the dropdown list")
	   public void selectDownloadInvoiced() {
		dmr.clickonDownload();

	}
		
}
