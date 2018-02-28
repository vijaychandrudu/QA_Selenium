package com.shearcircle.testscenarios;


import java.io.IOException;

import org.testng.annotations.Test;

import com.shearcircle.pagecomponents.Subscriber_Module_Page_Components;
import com.shearcircle.utilities.CommonFunctions;
import com.shearcircle.utilities.StaticVariables;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;


public class TS_003_SubscriberClicksOnVerificationLinkSentToEmail {

	CommonFunctions cfn = new CommonFunctions();
	Subscriber_Module_Page_Components SR;
	public String TestDataPath;
	public static WebDriver driver;
	@BeforeClass
	@Parameters("browser")
	public void beforeclass(@Optional("chrome") String browser) throws IOException, InterruptedException {
		String TestDataPath = cfn.TestDataPathOf("SubscriberTestData.properties");
		String Browser = browser;
		cfn.getAndOpenBrowser(browser);
		SR = new Subscriber_Module_Page_Components(driver);
		System.out.println("test");
	}

	@AfterMethod
	public void StatusScreenShots(ITestResult testResult) throws IOException, InterruptedException {
		cfn.ScreenshotOnPassFail(testResult);
		Thread.sleep(1000);
	
	}

	@AfterClass
	public void afterClass() {
		//driver.quit();
	}

	/*@AfterMethod
	public void afterMethod() {
		driver.quit();
	}*/

	@Test(priority=0,description = "Subscriber Checks Verification Link")
	public void TC_3_001_ClickOnVerificationLinkEmail() throws Exception {
		SR.CheckVerificationLink();
		
	}

}
