package com.shearcircle.testscenarios;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.shearcircle.pagecomponents.Subscriber_Module_Page_Components;
import com.shearcircle.utilities.CommonFunctions;
import com.shearcircle.utilities.StaticVariables;

public class TS_005_SubscriberLoginToSubscriberDashboard extends StaticVariables {
	CommonFunctions cfn = new CommonFunctions();
	Subscriber_Module_Page_Components SR;

	@BeforeClass
	@Parameters("browser")
	public void beforeclass(@Optional("chrome") String browser) throws IOException, InterruptedException {
		TestDataPath = cfn.TestDataPathOf("SubscriberTestData.properties");
		Browser = browser;
		cfn.getAndOpenBrowser(browser);
		SR = new Subscriber_Module_Page_Components();
		System.out.println("test");
	}

	@AfterMethod
	public void StatusScreenShots(ITestResult testResult) throws IOException, InterruptedException {
		cfn.ScreenshotOnPassFail(testResult);
		Thread.sleep(1000);
	
	}

	@AfterClass
	public void afterClass() {
	//	driver.quit();
	}

	/*@AfterMethod
	public void afterMethod() {
		driver.quit();
	}*/

	@Test(priority=0,description = "Check whether you are able to login to Dashboard by entering valid credentials")
	public void  TC_5_001_loginToDashboard() throws Exception {
		SR.loginToDashboard();		
	}
	@Test(priority=0,description = "Check the information on Welcome page for First time login")
	public void  TC_5_002_validateDashboardElements() throws Exception {
		SR.validateDashboardElementsFirstTimeLogin();
	}
	@Test(priority=0,description = "Check whether Last Login Date & Time are correct")
	public void  TC_5_003_validateLastLoginDateAndTime() throws Exception {
		SR.validateLastLoginDateAndTime();
	}
	@Test(priority=0,description = "Check whether All links is clickable")
	public void  TC_5_004_To_011_validateAllLinksClickble() throws Exception {
		SR.validateAllLinksClickble();
	}
	
	

}
