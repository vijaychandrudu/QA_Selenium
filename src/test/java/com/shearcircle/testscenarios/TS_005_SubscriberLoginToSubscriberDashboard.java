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

import com.shearcircle.pagecomponents.Subscriber_Module_Page_Components;
import com.shearcircle.utilities.CommonFunctions;
import com.shearcircle.utilities.StaticVariables;

import utils.ExtentReports.ExtentTestManager;

public class TS_005_SubscriberLoginToSubscriberDashboard extends StaticVariables {
	public Subscriber_Module_Page_Components SR;
	public String TestDataPath;
	public CommonFunctions cfn;
	public static WebDriver driver;

	public TS_005_SubscriberLoginToSubscriberDashboard() throws IOException, InterruptedException {
		cfn = new CommonFunctions();
	}

	@BeforeClass
	@Parameters("browser")
	public void beforeclass(@Optional("chrome") String browser) throws IOException, InterruptedException {
		TestDataPath = cfn.TestDataPathOf("SubscriberTestData.properties");
		Browser = browser;
		driver = cfn.getDriver();
		SR = new Subscriber_Module_Page_Components(driver);
		defaultWindowHandle = driver.getWindowHandle();
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

	@Test(priority = 5000, description = "Subscriber visits Join Our Circle page")
	public void TC_5_000_Subscriber_visitsJoinOurCirclepage() throws Exception {
		ExtentTestManager.getTest().setDescription("Subscriber visits Join Our Circle page");
		SR.launchApplication();
	}

	@Test(priority = 5001, description = "Subscriber check whether you are able to login to Dashboard by entering valid credentials")
	public void TC_5_001_Subscriber_loginToDashboard() throws Exception {
		ExtentTestManager.getTest().setDescription("Subscriber check whether Login button is clickable");
		SR.logIn_ToDashboard();
	}

	@Test(priority = 5002, description = "Subscriber check the information on Welcome page for First time login")
	public void TC_5_002_Subscriber_validate_DashboardPage_FirstTimeLogin() throws Exception {
		ExtentTestManager.getTest()
				.setDescription("Subscriber check the information on Welcome page for First time login");
		SR.validate_DashboardPage_FirstTimeLogin();
	}

	@Test(priority = 5003, description = "Subscriber check whether Last Login Date & Time are correct")
	public void TC_5_003_Subscriber_validate_LastLoginDateAndTime() throws Exception {
		ExtentTestManager.getTest().setDescription("Subscriber check whether Last Login Date & Time are correct");
		SR.validate_LastLoginDateAndTime();
	}
	@Test(priority = 5004, description = "Subscriber check whether View All link is clickable")
	public void TC_5_004_Subscriber_click_ViewAllLinks() throws Exception {
		ExtentTestManager.getTest().setDescription("Subscriber check whether View All link is clickable");
		SR.click_ViewAllLinks();
	}

	@Test(priority = 5005, description = "Subscriber check whether Manage Profile link is clickable")
	public void TC_5_005_Subscriber_click_ManageProfileLink() throws Exception {
		ExtentTestManager.getTest().setDescription("Subscriber check whether Manage Profile link is clickable");
		SR.click_ManageProfileLink();
	}
	@Test(priority = 5006, description = "Subscriber check whether Total Services Offered is clickable")
	public void TC_5_006_Subscriber_clickon_TotalServices_Offered() throws Exception {
		ExtentTestManager.getTest().setDescription("Subscriber check whether Total Services Offered is clickable");
		SR.clickon_TotalServices_Offered();
	}
	@Test(priority = 5007, description = "Subscriber check whether TotalProducts Offered is clickable")
	public void TC_5_007_Subscriber_clickon_TotalProductsOffered() throws Exception {
		ExtentTestManager.getTest().setDescription("Subscriber check whether TotalProducts Offered is clickable");
		SR.clickon_TotalProductsOffered();
	}
	@Test(priority = 5008, description = "Subscriber check whether My Clients List is clickable")
	public void TC_5_008_Subscriber_clickon_MyClientsList() throws Exception {
		ExtentTestManager.getTest().setDescription("Subscriber check whether My Clients List is clickable");
		SR.clickon_MyClientsList();
	}
	@Test(priority = 5009, description = "Subscriber check whether Total Staff is clickable")
	public void TC_5_009_Subscriber_clickon_TotalStaff() throws Exception {
		ExtentTestManager.getTest().setDescription("Subscriber check whether Total Staff is clickable");
		SR.clickon_TotalStaff();
	}
	@Test(priority = 5010, description = "Subscriber check whether Total Online Orders is clickable")
	public void TC_5_010_Subscriber_clickon_TotalOnline_Orders() throws Exception {
		ExtentTestManager.getTest().setDescription("Subscriber check whether Total Online Orders is clickable");
		SR.clickon_TotalOnline_Orders();
	}
	@Test(priority = 5011, description = "Subscriber check whether Total Offline Orders is clickable")
	public void TC_5_011_Subscriber_clickon_TotalOffline_Orders() throws Exception {
		ExtentTestManager.getTest().setDescription("Subscriber check whether Total Offline Orders is clickable");
		SR.clickon_TotalOffline_Orders();
	}
}
