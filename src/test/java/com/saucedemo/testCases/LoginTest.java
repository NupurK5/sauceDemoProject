package com.saucedemo.testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.saucedemo.pageObjects.LoginPage;

public class LoginTest extends Base {
	
	
	SoftAssert softAssert = new SoftAssert();
	LoginPage loginPage;
	
	@BeforeClass
	public void initializedClasses() {
		
		loginPage = new LoginPage(driver);	
		
	}
	
	
	@Test
	public void ValidateLogoText() {
		
		String actualString = loginPage.getTextOfSwagLabs();
		String expectedString = "Swag Labs";
		
		softAssert.assertEquals(actualString, expectedString , "String is not visible on page");		
		
	}
	

}
