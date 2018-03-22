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

public class TS_019_SubscriberClicks_ClientsMenu extends StaticVariables {
	public String TestDataPath;
	public Subscriber_Module_Page_Components SR;
	public CommonFunctions cfn;
	public static WebDriver driver;

	public TS_019_SubscriberClicks_ClientsMenu() throws IOException, InterruptedException {
		cfn = new CommonFunctions();
	}

	@BeforeClass
	@Parameters("browser")
	public void beforeclass(@Optional("chrome") String browser) throws IOException, InterruptedException {
		TestDataPath = cfn.TestDataPathOf("CustomerTestData.properties");
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

	@Test(priority = 19001, description = "TC_001 SubScriber visits ShearCircle page")
	public void TC_001_SubScriber_visitsShearCircle() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_001 SubScriber visits ShearCircle page");
		SR.launchApplication();
	}

	@Test(priority = 19002, description = "TC_002 SubScriber clicks Login Button")
	public void TC_002_SubScriberr_clicks_LogIn_Button() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_002 SubScriber clicks Login Button");
		SR.logIn_ToDashboard();
	}

	@Test(priority = 19003, description = "TC_19_001 Open Clients page")
	public void TC_19_001_SubScriberr_open_Clients_Page() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_19_001 Open Clients page");
		SR.open_Clients_Page();
	}

	@Test(priority = 19004, description = "TC_19_002 Check the New Client button")
	public void TC_19_002_SubScriberr_check_NewClient_Button() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_19_002 Check the New Client button");
		SR.check_NewClient_Button();
	}

	@Test(priority = 19005, description = "TC_19_003 Check the mandatory fields in Add New Client popup")
	public void TC_19_003_SubScriberr_check_MandatoryFields_InAddNewClientPopup() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_19_003 Check the mandatory fields in Add New Client popup");
		SR.check_MandatoryFields_InAddNewClientPopup();
	}

	@Test(priority = 19006, description = "TC_19_004 Check whether a new client can be added")
	public void TC_19_004_SubScriberr_checkwhether_NewClient_Added() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_19_004 Check whether a new client can be added");
		SR.checkwhether_NewClient_Added();
	}

	@Test(priority = 19007, description = "TC_19_005 Check whether a new client can be added")
	public void TC_19_005_SubScriberr_xyz() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_19_005 Check whether a new client can be added");
		SR.xyz();
	}

	@Test(priority = 19008, description = "TC_19_006 Check whether client details can be edited")
	public void TC_19_006_SubScriberr_check_Client_Details_Edited() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_19_006 Check whether client details can be edited");
		SR.check_Client_Details_Edited();
	}

	@Test(priority = 19009, description = "TC_19_007 Check whether an existing SC customer can be added as Client")
	public void TC_19_007_SubScriberr_checkwhether_AnExisting_SCcustomer_AddedAsClient() throws IOException {
		ExtentTestManager.getTest()
				.setDescription("TC_19_007 Check whether an existing SC customer can be added as Client");
		SR.checkwhether_AnExisting_SCcustomer_AddedAsClient();
	}

	@Test(priority = 19010, description = "TC_19_008 Check whether a client can be deleted")
	public void TC_19_008_SubScriberr_Check_Client_Deleted() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_19_008 Check whether a client can be deleted");
		SR.Check_Client_Deleted();
	}

}