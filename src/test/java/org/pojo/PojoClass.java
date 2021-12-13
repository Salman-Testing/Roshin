package org.pojo;

import java.util.List;

import javax.xml.xpath.XPath;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class PojoClass extends BaseClass {
	
	public PojoClass() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@class='fc-nameplate__image']")
	private List<WebElement> allNP;

	public List<WebElement> getAllNP() {
		return allNP;
	}
	
	@FindBy (xpath="//button[text()='MONTHLY PAYMENT']")
	private WebElement monthPay;

	public WebElement getMonthPay() {
		return monthPay;
	}
	
	@FindBy (xpath="//label[text()='Monthly Payment']//parent::div//following-sibling::div//child::div[@id='handle_min']")
	private WebElement miniValue;

	public WebElement getMiniValue() {
		return miniValue;
	}
	
	@FindBy (id="deposit")
	private WebElement deposit;

	public WebElement getDeposit() {
		return deposit;
	}
	
	@FindBy (xpath="//span[text()='ACCEPT VALUES & CALCULATE']")
	private WebElement acceptBtn;

	public WebElement getAcceptBtn() {
		return acceptBtn;
	}

	@FindBy (xpath="//button[text()='VEHICLES']")
	private WebElement vehicleBtn;

	public WebElement getVehicleBtn() {
		return vehicleBtn;
	}
	
	@FindBy (xpath="//span[text()='Change Vehicle']")
	private List<WebElement> changeVehicle;

	public List<WebElement> getChangeVehicle() {
		return changeVehicle;
	}
	
	@FindBy (xpath = "//span[text()='ENGINE']//..//div//child::button[@id='dropdown__button-engines']")
	private List<WebElement> engineOption;

	public List<WebElement> getEngineOption() {
		return engineOption;
	}
	
	@FindBy (xpath="//h3[text()='CHOOSE YOUR FINANCE PRODUCT']//..//div")
	private WebElement toolTip;

	public WebElement getToolTip() {
		return toolTip;
	}
	
	@FindBy (xpath = "//button[@id='modal-close-btn']")
	private WebElement modal;

	public WebElement getModal() {
		return modal;
	}
	
	@FindBy (xpath = "//h3[text()='CHOOSE YOUR FINANCE PRODUCT']//parent::div//following-sibling::div[@role='radiogroup']//child::label[contains(text(),'CONTRACT PURCHASE')]")
	private WebElement financeOption;
	
	@FindBy (xpath = "//div[@id='deposit-slider__handle']")
	private WebElement sliderDeposit;
	
	@FindBy (xpath = "//div[@id='duration-slider__handle']")
	private WebElement sliderDuration;
	
	@FindBy (xpath= "//div[@id='mileage-slider__handle']")
	private WebElement sliderMileage;
	
	@FindBy (xpath = "//span[text()='CALCULATE']")
	private WebElement calBtn;

	public WebElement getFinanceOption() {
		return financeOption;
	}

	public WebElement getSliderDeposit() {
		return sliderDeposit;
	}

	public WebElement getSliderDuration() {
		return sliderDuration;
	}

	public WebElement getSliderMileage() {
		return sliderMileage;
	}

	public WebElement getCalBtn() {
		return calBtn;
	}
	
	
	
	
	
	
	



}
