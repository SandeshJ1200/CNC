package com.resonance.stepdefinitions.picking_list;

import com.resonance.pages.HomePage;

import io.cucumber.java.en.Given;

public class PickingList {

	@Given ("user loging as a manager")
	public void login() {
	 HomePage hm = new HomePage ();
	 hm.clickOnLogin();
	 @Given ("user click on picking tab")
	 public void pickingtab () {
		 
	 }

	}
	
	}
}
