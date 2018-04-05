package Flipkart.util;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;



public class Login extends BaseClass{

	public void openBrowser() throws InterruptedException {
		try {
			Log = Logger.getLogger(Login.class);
			prop.load(getClass().getClassLoader().getResourceAsStream("application.properties"));
		} catch (Exception e) {
			Log.error(e.getMessage());
			e.printStackTrace();
		}

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		// creating an object of Chrome driver with the reference of webdriver
		// interface
		Log.info("Resource URL:" + prop.getProperty("URL"));
		driver.get(prop.getProperty("URL"));
		
		// getting the baseurl
	}

	
//public void login() throws IOException, InterruptedException {
//		Thread.sleep(5000);
//	Log.info("[]...signing in to the application ");
//	click("Signin_xpath");
//		
//}


	public void login() throws IOException, InterruptedException {
		Thread.sleep(4000);
		inputField("phone_xpath", "phone_number");
		//click("continue_xpath");
		Thread.sleep(4000);
		inputField("password_xpath", "password");
		System.out.println("clicking on submit");
		Thread.sleep(4000);
		click("submit_xpath");
		
	}
	
	
}
