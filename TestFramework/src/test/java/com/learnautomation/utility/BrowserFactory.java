package com.learnautomation.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
	
	public static WebDriver startApplication(WebDriver driver,String browsername,String appurl) {
		if(browsername.contains("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Drivers/newchrome/chromedriver.exe");
			driver=new ChromeDriver();
			//System.out.println(driver.getTitle());

		}
		else if(browsername.contains("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			//System.out.println(driver.getTitle());

		}
		else if(browsername.contains("IE")) {
			
		}
		else {
			System.out.println("we do not support this browser");
		}
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(appurl);
		//System.out.println(driver.getTitle());

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		return driver;
		
	}
	
	public static void quitBrowser(WebDriver driver) {
		driver.quit();
	}
	
	
	
	
	
	



}
