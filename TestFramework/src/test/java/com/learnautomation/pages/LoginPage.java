package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		
	}
	@FindBy(xpath="/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/li[1]/a") WebElement about;
	
	public void clickAbout() {
		about.click();
	}

}
