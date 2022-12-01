package com.resonance.stepdefinations.dispatch;

import com.resonance.pages.DashboardManager;
import com.resonance.pages.HomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Dispatch {
	HomePage hm = new HomePage();
	DashboardManager dmr = new DashboardManager();

	@Given("user logs into the application as a manager")
	public void loginIntoTheApp() {
		hm.loginAsManager();
	}

	@Then("manager selects Dispatch and Deliveries Tab")
	public void selectDispatch() throws InterruptedException {
		dmr.clickOnDispatch();
		Thread.sleep(1000);

	}

	@Then("manager click on the Deliveries List")
	public void selectDeliveries() {
		dmr.clickOnDeliveriesList();

	}
	@Then("manager click on the Manifest Number from the table")
	public void selectManifest() {
		dmr.clickManifest();

	}
	@Then("manager click on the Print button")
	public void clickPrint() {
	 dmr.clickPrint();

	}
	@Then("manager click on the Search Text box")
	public void selectSearchBox() {
		dmr.clickOnSearchTextBox();

	}
	@Then("manager pass the manifest number")
	public void sendMessage() {
		dmr.typeSearchBox();

	}

}
