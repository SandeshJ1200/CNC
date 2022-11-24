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
	@FindBy(xpath = "//input[starts-with(@aria-controls, 'myTable')]")
	private WebElement searchTextBox;
	@FindBy(xpath = "//i[starts-with(@class, 'icon fa fa-tasks tip')]")
	private WebElement actionsTab;
	@FindBy(xpath = "//*[@id=\"myTable\"]/tbody/tr[1]/td[8]/div/div/div/button")
	private WebElement ActionsTab;
	@FindBy(xpath = "//*[@id=\"myTable\"]/tbody/tr[1]/td[8]/div/div/div/ul/li[1]/a")
	private WebElement EditTab;
	

	
	
	public void clickOnPickingTab() {
		pickingTab.click();

	}
	public void clickOnInvoicedOrdersTab() {
		invoicedOrdersTab.click();

	}
	public void clickOnSearchTextBox() {
		searchTextBox.click();

	}
	public void typeIntheSearchBox() {
		searchTextBox.sendKeys("04A00197");

	}
	public void clickOnActionsTab() {
		actionsTab.click();

	}
	   public void selectActionTab() {
		ActionsTab.click();

	}
	 public void selectEditTab() {
		 EditTab.click();

	}
	
	
     
}
