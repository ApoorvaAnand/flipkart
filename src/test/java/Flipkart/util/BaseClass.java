package Flipkart.util;

import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseClass {

	public static WebDriver driver;
	public static Logger Log = Logger.getLogger(BaseClass.class);
	public Properties prop = new Properties();

	public void inputField(String locator, String value) throws IOException {
		if (locator.endsWith("_xpath")) {
			driver.findElement(By.xpath(prop.getProperty(locator))).sendKeys(prop.getProperty(value));
			if ("".equalsIgnoreCase(value)) {
				driver.findElement(By.xpath(prop.getProperty(locator))).clear();
			}
		} else if (locator.endsWith("_id")) {
			Log.info("insode id method");
			driver.findElement(By.id(prop.getProperty(locator))).sendKeys(prop.getProperty(value));
		} else if (locator.endsWith("_link")) {
			driver.findElement(By.linkText(prop.getProperty(locator))).sendKeys(prop.getProperty(value));
		} else if (value.equals("click")) {
			System.out.println("Clicked on the element...");
			driver.findElement(By.xpath(prop.getProperty(locator))).click();
		} else if (value.contains("_cssSelector")) {
			Log.info("insode css method");
			System.out.println("Clicked the element..");
			driver.findElement(By.xpath(prop.getProperty(locator))).sendKeys(prop.getProperty(value));
		} else {
			Log.info("insode id method");
			System.out.println("else calling");
			driver.findElement(By.id(prop.getProperty(locator))).sendKeys(prop.getProperty(value));
		}

	}

	public void click(String locator) throws IOException {
		if (locator.endsWith("_xpath")) {
			System.out.println("Clicked on the element...");
			driver.findElement(By.xpath(prop.getProperty(locator))).click();
		}

	}

	public void button(String locator) {
		if (locator.endsWith("_xpath")) {
			driver.findElement(By.xpath(prop.getProperty(locator))).click();
		}

	}

	public void columns() throws InterruptedException, IOException {

		List<WebElement> columns = driver.findElements(
				By.xpath(".//*[@id='container']/div/div[1]/div/div[2]/div/div[2]/div/div[3]/div/div/div/div/a[2]"));
			int noOfCol=columns.size();
			System.out.println("number of columns are :"+noOfCol);
	}

	public void list() {
		List<WebElement> a = driver.findElements(By.cssSelector(prop.getProperty("list_css")));
		// .System.out.println("list of books:"+a.size());
		// for (WebElement list : a) {
		// int i=0;
		// list=a.get(i);

		for (int i = 0; i <= a.size(); i++) {
			for (int j = 0; j < i; j++) {
				System.out.println("list of books:" + a.get(i));

			}
		}

	}
	
	public void scroll() {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,2000)");
		js.executeScript("window.scrollBy(0,2000)");

	}
	
	
	
	
	
	
}

// List<WebElements> elementsList =
// driver.findElements(By.cssSelector(".facetContainerDiv"));
// for(WebElement checkBox:elementsList) {
// int i=0;
// checkBox = elementsList.get(i);
