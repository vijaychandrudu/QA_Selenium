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

public class TS_004_SubscriberLoginforFirstTime extends StaticVariables {
	public Subscriber_Module_Page_Components SR;
	public String TestDataPath;
	public CommonFunctions cfn;
	public static WebDriver driver;

	public TS_004_SubscriberLoginforFirstTime() throws IOException, InterruptedException {
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

	@Test(priority = 4000, description = "Subscriber visits Join Our Circle page")
	public void TC_1_000_Subscriber_visitsJoinOurCirclepage() throws Exception {
		ExtentTestManager.getTest().setDescription("Subscriber visits Join Our Circle page");
		SR.launchApplication();
	}

	@Test(priority = 4001, description = "Subscriber Check whether Login button is clickable")
	public void TC_4_001_click_onSubscriber_LogIn_Button() throws Exception {
		ExtentTestManager.getTest()
				.setDescription("Subscriber Check whether Login button is clickable");
		SR.click_onSubscriber_LogIn_Button();
	}

	@Test(priority = 4002, description = "Subscriber Check whether you are able to login by entering Invalid credentials")
	public void TC_4_002_Subscriber_enter_Invalid_Credentials_Clickon_LogIn_Button() throws Exception {
		ExtentTestManager.getTest()
				.setDescription("Subscriber Check whether you are able to login by entering Invalid credentials");
		SR.enter_Invalid_Credentials_Clickon_LogIn_Button();
	}

	@Test(priority = 4003, description = "Subscriber enter valid credentials and click on LogIn Button")
	public void TC_4_003_Subscriber_enter_valid_Credentials_Clickon_LogIn_Button() throws Exception {
		ExtentTestManager.getTest().setDescription("Subscriber enter valid credentials and click on LogIn Button");
		SR.enter_valid_Credentials_Clickon_LogIn_Button();
	}

	@Test(priority = 4004, description = "Subscriber Check whether you are able to login to Dashboard in What Describes you page")
	public void TC_4_004_Subscriber_logInTo_Dashboard_InWhatDescribesYouPage() throws Exception {
		ExtentTestManager.getTest().setDescription(
				"Subscriber Check whether you are able to login to Dashboard in What Describes you page");
		SR.logInTo_Dashboard_InWhatDescribesYouPage();
	}

	@Test(priority = 4005, description = "Subscriber Check if you are able to login to Dashboard after relogin from What Describes You Page")
	public void TC_4_005_Subscriber_login_ToDashboard_After_ReLogIn_FromWhatDescribesYouPage() throws Exception {
		ExtentTestManager.getTest().setDescription(
				"Subscriber Check if you are able to login to Dashboard after relogin from What Describes You Page");
		SR.login_ToDashboard_After_ReLogIn_FromWhatDescribesYouPage();
	}

	@Test(priority = 4006, description = "Subscriber Check if you can navigate to next page by clicking Next Step button without selecting the options")
	public void TC_4_006_Subscriber_clickOnNextStep_InWhatDescribesYouPage() throws Exception {
		ExtentTestManager.getTest().setDescription(
				"Subscriber Check if you can navigate to next page by clicking Next Step button without selecting the options");
		SR.clickOnNextStep_InWhatDescribesYouPage();
	}

	@Test(priority = 4007, description = "Subscriber Check if you can navigate to next page by selecting Other Service & without adding servicen")
	public void TC_4_007_Subscriber_clickOnNextStep_Selecting_OtherService() throws Exception {
		ExtentTestManager.getTest().setDescription(
				"Subscriber Check if you can navigate to next page by selecting Other Service & without adding servicen");
		SR.clickOnNextStep_Selecting_OtherService();
	}

	@Test(priority = 4008, description = "Subscriber Check if you can navigate to next page by adding Service in Other Services option")
	public void TC_4_008_Subscriber_clickonNextStep_AddingServiceInOtherService() throws Exception {
		ExtentTestManager.getTest().setDescription(
				"Subscriber Check if you can navigate to next page by adding Service in Other Services option");
		SR.clickonNextStep_AddingServiceInOtherService();
	}

	/*@Test(priority = 4009, description = "Subscriber Check if you can navigate to next page by selecting an option (except Other Services)")
	public void TC_4_009_Subscriber_clickonNextStepaddingService() throws Exception {
		ExtentTestManager.getTest().setDescription(
				"Subscriber Check if you can navigate to next page by selecting an option (except Other Services)");
		SR.clickonNextStepaddingService();
	}*/

	@Test(priority = 4010, description = "Subscriber Check if you can access Dashboard from Your Business Details page")
	public void TC_4_010_Subscriber_clickOn_MyAccountinBusinessDetailspage() throws Exception {
		ExtentTestManager.getTest()
				.setDescription("Subscriber Check if you can access Dashboard from Your Business Details page");
		SR.clickOn_MyAccountinBusinessDetailspage();
	}

	@Test(priority = 4011, description = "Subscriber Check if you are able to login to Dashboard after relogin from Your Business Details page")
	public void TC_4_011_Subscriber_login_ToDashboard_After_ReLogIn_FromYourBusinessDetailsPage() throws Exception {
		ExtentTestManager.getTest().setDescription(
				"Subscriber Check if you are able to login to Dashboard after relogin from Your Business Details page");
		SR.login_ToDashboard_After_ReLogIn_FromYourBusinessDetailsPage();
	}

	@Test(priority = 4012, description = "Subscriber Check if can navigate to next page by clicking on Next Step button without entering the details")
	public void TC_4_012_Subscriber_clickOn_NextStepButton_WithoutEnteringDetails_InYBDP() throws Exception {
		ExtentTestManager.getTest().setDescription(
				"Subscriber Check if can navigate to next page by clicking on Next Step button without entering the details");
		SR.clickOn_NextStepButton_WithoutEnteringDetails_InYBDP();
	}

	@Test(priority = 4013, description = "Subscriber Check if you can navigate to next page after entering valid details in Your Business Details page")
	public void TC_4_013_Subscriber_clickOn_NextStep_InBusinessDetailsPage_EnteringDetails() throws Exception {
		ExtentTestManager.getTest().setDescription(
				"Subscriber Check if you can navigate to next page after entering valid details in Your Business Details page");
		SR.clickOn_NextStep_InBusinessDetailsPage_EnteringDetails();
	}

	@Test(priority = 4014, description = "Subscriber Check if you are able to login directly to Dashboard next time")
	public void TC_4_014_Subscriber_logIn_DashboarDdirectly() throws Exception {
		ExtentTestManager.getTest()
				.setDescription("Subscriber Check if you are able to login directly to Dashboard next time");
		SR.logIn_DashboarDdirectly();
	}
}