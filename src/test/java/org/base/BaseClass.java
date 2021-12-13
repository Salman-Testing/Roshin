package org.base;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public static Actions a;

	public static void chromeBrowserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	public static void fireFoxBrowserLaunch() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();

	}

	public static void ieBrowserLaunch() {
		WebDriverManager.iedriver().setup();
		driver = new InternetExplorerDriver();

	}

	public static void edgeBrowserLaunch() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();

	}

	public static void urlLaunch(String url) {

		driver.get(url);

	}

	public static void fillText(WebElement e, String txt) {

		e.sendKeys(txt);

	}

	public static void clickingButton(WebElement e) {

		e.click();
	}

	public static void doubleClicking(WebElement target) {

		a = new Actions(driver);

		a.doubleClick(target).perform();

	}

	public static void movingElement(WebElement target) {

		a = new Actions(driver);

		a.moveToElement(target).perform();

	}
	
	public static void actionsFillTxt(WebElement ele,String txt) {
		
		a = new Actions(driver);
		a.sendKeys(ele, txt).perform();

	}
	
	public static void actionsClick(WebElement ele) {
		a = new Actions(driver);
		a.click(ele).perform();

	}

	public static void refreshing() {
		driver.navigate().refresh();

	}

	public static void waitTime(long time) {

		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);

	}

	public static void closingBrowser() {
		driver.quit();

	}

	public static void dateRange() {
		Date d = new Date();
		System.out.println(d);

	}
	
	public static void clearValue(WebElement ele) {
		ele.clear();

	}
	
	public static void sliderSendKey(WebElement ele) {
		ele.sendKeys(Keys.ARROW_RIGHT);

	}

}
