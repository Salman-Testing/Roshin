package org.test1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.pojo.PojoClass;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SampleTest extends BaseClass {

	public PojoClass pj;

	@BeforeClass
	private void startBrowser() {
		chromeBrowserLaunch();
		urlLaunch("https://www.landrover.co.uk/offers-and-finance/finance-calculator.html#/models");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@BeforeMethod
	private void initation() {
		pj = new PojoClass();

	}

	@Test
	private void tc1() throws InterruptedException {
//		List<WebElement> allNP = driver.findElements(By.xpath("//img[@class='fc-nameplate__image']"));

		WebDriverWait w = new WebDriverWait(driver, 30);
		w.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//img[@class='fc-nameplate__image']"), 0));
		int nPSize = pj.getAllNP().size();
		SoftAssert s = new SoftAssert();
		s.assertEquals(nPSize, 11);

	}

	@Test
	private void tc2() {
		// String miniValue = "//label[text()='Monthly
		// Payment']//parent::div//following-sibling::div//child::div[@id='handle_min']";
		actionsClick(pj.getMonthPay());

		// WebElement value = driver.findElement(By.xpath(miniValue));
		for (int i = 0; i <= 9; i++) {
//			pj.getMiniValue().sendKeys(Keys.ARROW_RIGHT);
			sliderSendKey(pj.getMiniValue());
		}
		// WebElement de posit = driver.findElement(By.id("deposit"));
		clearValue(pj.getDeposit());
		// deposit.sendKeys("20000");
		fillText(pj.getDeposit(), "20000");

//		WebElement acceptBtn = driver.findElement(By.xpath("//span[text()='ACCEPT VALUES & CALCULATE']"));
//		acceptBtn.click();

		clickingButton(pj.getAcceptBtn());

	}

	@Test
	private void tc3() throws InterruptedException {
//		List<WebElement> allVehicles = driver.findElements(By.xpath("//div[@class='fc-nameplate__imageOverlay']"));
//		allVehicles.get(0).click();

//		WebElement vehicles = driver.findElement(By.xpath("//button[text()='VEHICLES']"));
//		Actions a = new Actions(driver);
//		a.click(vehicles).perform();

		actionsClick(pj.getVehicleBtn());

		// List<WebElement> allNP1 =
		// driver.findElements(By.xpath("//img[@class='fc-nameplate__image']"));
		WebDriverWait w = new WebDriverWait(driver, 30);
		w.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//img[@class='fc-nameplate__image']"), 0));

		WebElement ele = pj.getAllNP().get(1);
		a.click(ele).perform();
//		actionsClick(ele);
		Thread.sleep(3000);
		Assert.assertTrue(driver.findElement(By.xpath("//h2[text()='PERSONALISE QUOTE']")).isDisplayed());
//		List<WebElement> allVeh = driver.findElements(By.xpath("//span[text()='Change Vehicle']"));
//		allVeh.get(0).click();

		actionsClick(pj.getChangeVehicle().get(0));
		// clickingButton(pj.getChangeVehicle().get(0));
//		actionsClick(pj.getChangeVehicle());
		Assert.assertTrue(driver.findElement(By.xpath("//img[@class='fc-nameplate__image']")).isDisplayed());

//		List<WebElement> allNP2 = driver.findElements(By.xpath("//img[@class='fc-nameplate__image']"));
//
//		WebElement ele1 = allNP2.get(2);
//		a.click(ele1).perform();

		actionsClick(pj.getAllNP().get(2));

		System.out.println("yes");

	}

	@Test
	private void tc4() throws AWTException {

//		List<WebElement> allVeh = driver.findElements(By.xpath("//span[text()='Change Vehicle']"));
//		WebElement v = allVeh.get(0);
//		v.click();
		actionsClick(pj.getChangeVehicle().get(0));
		// List<WebElement> allNP1 =
		// driver.findElements(By.xpath("//img[@class='fc-nameplate__image']"));
		WebDriverWait w = new WebDriverWait(driver, 30);
		w.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//img[@class='fc-nameplate__image']"), 0));

//		WebElement ele = allNP1.get(1);
//		Actions a = new Actions(driver);
//		a.click(ele).perform();

		actionsClick(pj.getAllNP().get(1));

//		List<WebElement> drop = driver.findElements(
//				By.xpath("//span[text()='ENGINE']//..//div//child::button[@id='dropdown__button-engines']"));
//		WebElement mydrop = drop.get(0);
//		a.click(mydrop).perform();

		actionsClick(pj.getEngineOption().get(0));

		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}

	@Ignore
	@Test
	private void tc5() throws InterruptedException {
//		WebElement toolTip = driver.findElement(By.xpath("//h3[text()='CHOOSE YOUR FINANCE PRODUCT']//..//div"));
//		Actions a = new Actions(driver);
//		a.click(toolTip).perform();

		actionsClick(pj.getToolTip());

//		WebDriverWait w = new WebDriverWait(driver, 30);
//		w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[text()='PERSONAL CONTRACT PURCHASE']")));
		Thread.sleep(3000);

		Assert.assertTrue(driver.findElement(By.xpath("//div[text()='PERSONAL CONTRACT PURCHASE']")).isDisplayed());
		System.out.println("yes");
	}

	@Test
	private void tc6() throws InterruptedException {
//		WebElement modalClose = driver.findElement(By.xpath("//button[@id='modal-close-btn']"));
//		Actions a = new Actions(driver);
//		a.click(modalClose).perform();

		actionsClick(pj.getModal());

//		WebElement financeOption = driver.findElement(By.xpath(
//				"//h3[text()='CHOOSE YOUR FINANCE PRODUCT']//parent::div//following-sibling::div[@role='radiogroup']//child::label[contains(text(),'CONTRACT PURCHASE')]"));
//		a.click(financeOption).perform();

		actionsClick(pj.getFinanceOption());

		// WebElement sliderDeposit =
		// driver.findElement(By.xpath("//div[@id='deposit-slider__handle']"));
		for (int i = 0; i < 5; i++) {
//			sliderDeposit.sendKeys(Keys.ARROW_RIGHT);
			sliderSendKey(pj.getSliderDeposit());
		}

//		WebElement sliderDuration = driver.findElement(By.xpath("//div[@id='duration-slider__handle']"));
		for (int i = 0; i < 5; i++) {
//			sliderDuration.sendKeys(Keys.ARROW_RIGHT);
			sliderSendKey(pj.getSliderDuration());

		}

//		WebElement sliderMileage = driver.findElement(By.xpath("//div[@id='mileage-slider__handle']"));
		for (int i = 0; i < 5; i++) {
//			sliderMileage.sendKeys(Keys.ARROW_RIGHT);
			sliderSendKey(pj.getSliderMileage());
		}

		Thread.sleep(3000);

//		WebElement calBtn = driver.findElement(By.xpath("//span[text()='CALCULATE']"));
//		calBtn.click();
		clickingButton(pj.getCalBtn());

//		WebDriverWait w = new WebDriverWait(driver, 30);
//		w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h2[text()='YOUR QUOTE']")));
		Thread.sleep(3000);

		Assert.assertTrue(driver.findElement(By.xpath("//h2[text()='YOUR QUOTE']")).isDisplayed());

	}

}
