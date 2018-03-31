package com.shearcircle.testscenarios;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.shearcircle.pagecomponents.Subscriber_Module_Page_Components;
import com.shearcircle.utilities.CommonFunctions;
import com.shearcircle.utilities.StaticVariables;

import utils.ExtentReports.ExtentTestManager;

public class TS_020_SubscriberClicks_POSMenu extends StaticVariables {
	public String TestDataPath;
	public Subscriber_Module_Page_Components SR;
	public CommonFunctions cfn;
	public static WebDriver driver;

	public TS_020_SubscriberClicks_POSMenu() throws IOException, InterruptedException {
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

	@Test(priority = 20001, description = "TC_001 SubScriber visits ShearCircle page")
	public void TC_001_SubScriber_visitsShearCircle() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_001 SubScriber visits ShearCircle page");
		SR.launchApplication();
	}

	@Test(priority = 20002, description = "TC_002 SubScriber clicks Login Button")
	public void TC_002_SubScriberr_clicks_LogIn_Button() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_002 SubScriber clicks Login Button");
		SR.logIn_ToDashboard();
	}

	@Test(priority = 20003, description = "TC_20_001 Open POS page")
	public void TC_20_001_SubScriberr_open_POSPage() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_20_001  Open POS page");
		SR.open_POSPage();
	}

	@Test(priority = 20004, description = "TC_20_002 Check the Create Sale Order button")
	public void TC_20_002_SubScriberr_check_CreateSaleOrder_Button() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_20_002 Check the Create Sale Order button");
		SR.check_CreateSaleOrder_Button();
	}

	@Test(priority = 20005, description = "TC_20_003 Check the +Products button in Add New Sale popup")
	public void TC_20_003_SubScriberr_check_AddProductsButton_InAddNewSalePopup() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_20_003 Check the +Products button in Add New Sale popup");
		SR.check_AddProductsButton_InAddNewSalePopup();
	}

}
