package com.shearcircle.testscenarios;

import org.testng.annotations.Test;

import com.shearcircle.pagecomponents.Subscriber_Module_Page_Components;
import com.shearcircle.utilities.CommonFunctions;
import com.shearcircle.utilities.StaticVariables;

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
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;

public class SubscriberSignup extends StaticVariables  {
	CommonFunctions cfn = new CommonFunctions();
	Subscriber_Module_Page_Components SR;
	
	@BeforeClass
	@Parameters("browser")
	public void beforeclass(@Optional("chrome") String browser) throws IOException, InterruptedException {
		TestDataPath =cfn.TestDataPathOf("SubscriberTestData.properties");
		Browser = browser;
	    cfn.getAndOpenBrowser(browser);
	}

	@AfterMethod
	public void StatusScreenShots(ITestResult testResult) throws IOException, InterruptedException {
		cfn.ScreenshotOnPassFail(testResult);
		Thread.sleep(1000);
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

	/*@Test(description = "Subscriber visits Join Our Circle page")
	public void visitsJoinOurCirclepage() throws Exception {
		SR =new Subscriber_Module_Page_Components() ;
		SR.visitsJoinOurCirclepage();
		
		System.out.println("test ts001");
		
	}
	
	@Test(description = "Subscriber clicks on Start 14 Day Free Trial button ")
	public void TS002() throws Exception {
		SR =new Subscriber_Module_Page_Components() ;
		//SR.TS02();
	}*/

}
