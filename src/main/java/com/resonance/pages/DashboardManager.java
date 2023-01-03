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

	@FindBy(xpath = "//*[@id=\"sidebar_menu\"]/ul/li[3]/a")
	private WebElement pickingTab;
	@FindBy(xpath = "//*[@id=\"picking_invoiced_order\"]/a")
	private WebElement invoicedOrdersTab;
	@FindBy(xpath = "//input[starts-with(@aria-controls, 'myTable')]")
	private WebElement searchTextBox;
	@FindBy(xpath = "//i[starts-with(@class, 'icon fa fa-tasks tip')]")
	private WebElement actionsTab;
	@FindBy(xpath = "//*[@id=\"myTable\"]/tbody/tr[1]/td[8]/div/div/div/button")
	private WebElement ActionsTab;
	@FindBy(xpath = "//*[@id=\"myTable\"]/tbody/tr[1]/td[8]/div/div/div/ul/li[1]/a")
	private WebElement EditTab;
	@FindBy(xpath = "//input[starts-with(@name, 'start_date')]")
	private WebElement fromDateSearchBox;
	@FindBy(xpath = "/html/body/div[7]/div[3]/table/thead/tr[1]/th[1]/i")
	private WebElement leftArrowTab;
	@FindBy(xpath = "/html/body/div[7]/div[3]/table/tbody/tr[2]/td[3]")
	private WebElement selectDate;
	@FindBy(xpath = "//input[starts-with(@name, 'end_date')]")
	private WebElement toDateSearchBox;
	@FindBy(xpath = "/html/body/div[8]/div[3]/table/tbody/tr[4]/td[4]")
	private WebElement toSelectDate;
	@FindBy(xpath = "//button[text()=' Submit']")
	private WebElement submitButton;
	@FindBy(xpath = "//a[@href=\"https://qa-cnc.rameesystems.com/admin/sales/pdf/201\"]")
	private WebElement downloadTab;
	@FindBy(xpath = "//span[text()=\" Dispatch & Deliveries \"]")
	private WebElement dispatchAndDeleveriesTab;
	@FindBy(xpath = " //li[@id='delivery_delivered_list']/child::a")
	private WebElement deliveriesListTab;
	@FindBy(xpath = "//a[@href=\"https://qa-cnc.rameesystems.com/admin/delivery/delivered_list/delivered_view/MANIFEST0017\"]")
	private WebElement manifestTab;
	@FindBy(xpath = "//button[@class='btn btn-primary no-print']")
	private WebElement printButton;
	@FindBy(xpath= "//input[@aria-controls='myTable']")
	private WebElement searchBox;
	

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

	public void prevSerachBox() {
		fromDateSearchBox.click();

	}

	public void fromDateSearchBox() {
		leftArrowTab.click();

	}

	public void fromSelectDate() {
		selectDate.click();

	}

	public void nextSearchBox() {
		toDateSearchBox.click();

	}

	public void toSelectDate() {
		toSelectDate.click();

	}

	public void clicksubmitButton() {
		submitButton.click();

	}

	public void clickonDownload() {
		downloadTab.click();

	}

	public void clickOnDispatch() {
		dispatchAndDeleveriesTab.click();

	}

	public void clickOnDeliveriesList() {
		deliveriesListTab.click();

	}

	public void clickManifest() {
		 manifestTab.click();

	}

	public void clickPrint() {

		printButton.click();

	}
	public void clickSearchBox() {
		searchBox.click();

	}
	public void typeSearchBox() {
		searchBox.sendKeys("MANIFEST0016");

	}

}
