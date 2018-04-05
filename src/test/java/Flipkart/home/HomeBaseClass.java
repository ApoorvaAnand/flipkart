package Flipkart.home;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Flipkart.util.Login;

public class HomeBaseClass extends Login{
	public void books() throws IOException {
		inputField("books_xpath","books");
		click("search_xpath");
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		
		List<WebElement> elements = driver.findElements(By.xpath("//a[@class='_2cLu-l']"));
		int s = elements.size();
		System.out.println("size = "+s);
		
		for(int i= 0;i<elements.size();i++) {
			String name = elements.get(i).getText();
			System.out.println("Name = "+name);
		}
		
		
		
		
		
		/*
		for (WebElement element : elements) {
		   
		    System.out.println("print:"+element.getText());
		   
		    
		}
		*/
		
		
		
		
//		List<WebElement> element = driver.findElements(By.tagName("title"));
		
		//((WebElement) element).getAttribute("title");
//		System.out.println("list of books:"+);
		
		
//		String result= driver.findElement(By.xpath(prop.getProperty("getlist"))).getAttribute("title");
//		System.out.println("list of books:"+result);
		
			
	}

}
