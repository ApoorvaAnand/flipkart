package Flipkart.home;

import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Home extends HomeBaseClass{

	 @Test
	public void get() throws InterruptedException, IOException {
		openBrowser();
		System.out.println("launched the browser");
		login();
		System.out.println("Logged in successfully");
		Thread.sleep(5000);
		System.out.println("Launched home page");
		books();
		

	}


		
//		Thread.sleep(6000);
//		for (int i = 1; i < Noofbooks.size() + 1; i++) {
//			for (int j = 1; j <= 4; j++) {
//				String bookname = driver.findElement(
//						By.xpath(".//*[@id='container']/div/div[1]/div/div[2]/div/div[2]/div/div[3]/div/div[" + i
//								+ "]/div[" + j + "]/div/a[2]"))
//						.getText();
//
//				System.out.println(bookname + "\n");
//		
//			}
		}
		
		
	
		
		
			
		
		
//		
//		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
//		java.util.List<WebElement> links = driver.findElements(By.tagName("//a[2]"));
//		 
//		System.out.println(links.size());
// 
//		for (int i = 1; i<=links.size(); i=i+1)
// 
//		{
// 
//			System.out.println(links.get(i).getText());
// 
//		}
//		
		
		
		
		
//		List<WebElement> rows = driver.findElements(
//				By.xpath(".//*[@id='container']/div/div[1]/div/div[2]/div/div[2]/div/div[3]/div[1]/div/div[1]/div/a[2]"));
//		System.out.println("The number of rows are : " + rows.size());

		
	
			
