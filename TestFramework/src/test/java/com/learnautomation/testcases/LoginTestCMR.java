package com.learnautomation.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.learnautomation.pages.LoginPage;
import com.learnautomation.utility.BaseClass;
import com.learnautomation.utility.BrowserFactory;

public class LoginTestCMR extends BaseClass {
	
	//public ExtentHtmlReporter htmlReport;
	//public ExtentReports extent;
//	public ExtentTest extentTest;
		
	@Test
	public void loginApp() throws InterruptedException {		
		Thread.sleep(2000);
		
		extentTest=extent.createTest("Log in to CRM");
		extentTest.info("Starting application");
		LoginPage loginpage=PageFactory.initElements(driver, LoginPage.class);
		loginpage.clickAbout();
		
		extentTest.pass("login successfully");
		
		
	}

}
