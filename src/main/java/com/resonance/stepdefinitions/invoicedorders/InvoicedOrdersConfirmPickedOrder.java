package com.resonance.stepdefinitions.invoicedorders;
import org.testng.asserts.*;

import com.resonance.pages.DashboardManager;
import com.resonance.pages.HomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class InvoicedOrdersConfirmPickedOrder {
	HomePage home = new HomePage();
	DashboardManager dmr = new DashboardManager();
	
	@Given(" User login into the application as manager")
	public void loginToTheApplication(){
		home.loginAsManager();
         
	}
	@When("manager selects picking tab from side menu bar")
	public void clickOnPickingTab() throws InterruptedException {
		dmr.clickOnPickingTab();
		Thread.sleep(1000);

	}
	
	@Then("manager selects confirmed picked orders")
	public void clickOnConfirmPickedOrder() throws InterruptedException {
		dmr.clickonConfirmPickedOrdersTab();
		Thread.sleep(1000);

	}
	

}
