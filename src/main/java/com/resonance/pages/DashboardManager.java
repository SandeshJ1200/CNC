package com.resonance.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resonance.config.BaseFramework;
import com.resonance.utility.Keyword;

public class DashboardManager {
	Keyword keyword = null;
	public DashboardManager() {
		BaseFramework base = new BaseFramework();
		PageFactory.initElements(base.thread.get(), this);
		keyword = new Keyword();
	}
	@FindBy(xpath= "//*[@id=\"sidebar_menu\"]/ul/li[3]/a")
	private WebElement pickingTab;
	@FindBy(xpath= "//*[@id=\"picking_invoiced_order\"]/a")
	private WebElement invoicedOrdersTab;
	@FindBy(xpath= "//span[starts-with(text() , ' Confirm Picked Order')]")
	private WebElement confirmPickedOrdersTab;
	
	
	public void clickOnPickingTab() {
		pickingTab.click();

	}
	public void clickOnInvoicedOrdersTab() {
		invoicedOrdersTab.click();

	}
	public void clickonConfirmPickedOrdersTab() {
		confirmPickedOrdersTab.click();

	}
	
     
}
