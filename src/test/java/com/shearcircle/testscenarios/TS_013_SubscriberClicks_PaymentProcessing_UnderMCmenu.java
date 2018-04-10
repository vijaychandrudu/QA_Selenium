package com.shearcircle.testscenarios;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.shearcircle.pagecomponents.Customer_Module_Page_Components;
import com.shearcircle.pagecomponents.Subscriber_Module_Page_Components;
import com.shearcircle.utilities.CommonFunctions;
import com.shearcircle.utilities.StaticVariables;

import utils.ExtentReports.ExtentTestManager;

public class TS_013_SubscriberClicks_PaymentProcessing_UnderMCmenu extends StaticVariables {
	public String TestDataPath;
	public Subscriber_Module_Page_Components SR;
	public CommonFunctions cfn;
	public static WebDriver driver;

	public TS_013_SubscriberClicks_PaymentProcessing_UnderMCmenu() throws IOException, InterruptedException {
		cfn = new CommonFunctions();
	}

	@BeforeClass
	@Parameters("browser")
	public void beforeclass(@Optional("chrome") String browser) throws IOException, InterruptedException {
		TestDataPath = cfn.TestDataPathOf("SubscriberTestData.properties");
		Browser = browser;
		// cfn.getAndOpenBrowser(browser);
		driver = cfn.getDriver();
		SR = new Subscriber_Module_Page_Components(driver);
		defaultWindowHandle = driver.getWindowHandle();
	}

	@AfterMethod
	public void StatusScreenShots(ITestResult testResult) throws IOException, InterruptedException {
		cfn.ScreenshotOnPassFail(testResult);
		Thread.sleep(1000);
	}

	/*
	 * @AfterClass public void afterClass() { driver.quit(); }
	 */

	@Test(priority = 13001, description = "TC_001 SubScriber visits ShearCircle page")
	public void TC_001_SubScriber_visitsShearCircle() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_001 SubScriber visits ShearCircle page");
		SR.launchApplication();
	}

	@Test(priority = 13002, description = "TC_002 SubScriber clicks Login Button")
	public void TC_002_SubScriberr_clicks_LogIn_Button() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_002 SubScriber clicks Login Button");
		SR.logIn_ToDashboard();
	}

	@Test(priority = 13003, description = "TC_13_001 Open Payment Processing page")
	public void TC_13_001_SubScriberr_openPaymentProcessing_Page() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_13_001 Open Payment Processing page");
		SR.openPaymentProcessing_Page();
	}

	@Test(priority = 13004, description = "TC_13_002 Check the details in Payment Processing page")
	public void TC_13_002_SubScriberr_check_Details_PaymentProcessing_Page() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_13_002 Check the details in Payment Processing page");
		SR.check_Details_PaymentProcessing_Page();
	}

	@Test(priority = 13005, description = "TC_13_003 Check the button – BYPSC")
	public void TC_13_003_SubScriberr_check_Button_BYPSC() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_13_003 Check the button – BYPSC");
		SR.check_Button_BYPSC();
	}

}