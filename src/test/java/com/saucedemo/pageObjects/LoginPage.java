package com.saucedemo.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	By emailTextbox = By.id("user-name");
	By passwordTextbox = By.id("password");
	By loginButton = By.id("login-button");
	By Swaglogo = By.className("login_logo");
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void enterEmailId(String username) {
		
		driver.findElement(emailTextbox).sendKeys(username);
		
	}
	
	public void enterPassword(String pwd) {
		
		driver.findElement(passwordTextbox).sendKeys(pwd);
		
	}
	
	public void clickOnLoginButton() {
		
		driver.findElement(loginButton).click();
	}
	
	public String getTextOfSwagLabs() {
		
		return driver.findElement(Swaglogo).getText();
		
	}

}
