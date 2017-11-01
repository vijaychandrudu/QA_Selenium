package com.shearcircle.testscenarios;

import org.testng.annotations.Test;


import com.shearcircle.objectrepository.Customer_Module_Page_Objects;
import com.shearcircle.pagecomponents.Customer_Module_Page_Components;
import com.shearcircle.utilities.CommonFunctions;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;

public class CustomerModule extends com.shearcircle.utilities.StaticVariables {
	public String TestDataPath;
	public Customer_Module_Page_Components CR;
	public CommonFunctions browser;
	
	
	public CustomerModule() throws IOException, InterruptedException{
		browser = new CommonFunctions();
		//CR = new Customer_Module_Page_Components();	
	}
	
	
	@BeforeClass
	@Parameters("browserType")
	public void beforeclass(@Optional("chrome") String browserType) throws IOException, InterruptedException {
		TestDataPath = browser.TestDataPathOf("CustomerTestData.properties");
		Browser = browserType;
		browser.getAndOpenBrowser(browserType);
	}

	@AfterMethod
	public void StatusScreenShots(ITestResult testResult) throws IOException, InterruptedException {
		browser.ScreenshotOnPassFail(testResult);
		Thread.sleep(1000);
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

	/*@Test
	public void CustomerSubscriber() throws IOException {			
		CR.launchbowser_application();
		CR.Customer_Registration();		
	}
	
		
	@Test
	public void ProfessionalSubscriber() throws IOException {
		//Customer_Module_Page_Components CR = new Customer_Module_Page_Components();			
		CR.Professional_Registration();
	}*/

	@Test
	public void Customer_ForgotPassword_scenario() throws IOException {
		CR = new Customer_Module_Page_Components();	
		CR.launchApplication();
		CR.ShearCircle_Verify_Customer_forgotPassword("Valid", "Click Send instructions to reset password");
		CR.ShearCircle_Verify_Customer_forgotPassword("Valid", "Click Cancel");
	}

}
