package com.learnautomation.utility;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class BaseClass {
	public ExtentHtmlReporter htmlReport;
	public ExtentReports extent;
	public ExtentTest extentTest;
	public WebDriver driver;
	@BeforeClass
	public void setUp() {
		htmlReport=new ExtentHtmlReporter(new File(System.getProperty("user.dir")+"/Reports/FreeCRM.html"));
		extent=new ExtentReports();
		extent.attachReporter(htmlReport);
		driver=BrowserFactory.startApplication(driver, "chrome", "https://www.freecrm.com/index.html");
		System.out.println(driver.getTitle());

	}
	
	@AfterMethod
	public void afterm() {
		extent.flush();
	}
	
	@AfterClass
	public void tearDown() {
		BrowserFactory.quitBrowser(driver);
		

	}


}
