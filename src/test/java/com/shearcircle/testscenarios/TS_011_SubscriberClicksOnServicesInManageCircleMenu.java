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

public class TS_011_SubscriberClicksOnServicesInManageCircleMenu extends StaticVariables {
	public String TestDataPath;
	public Subscriber_Module_Page_Components SR;
	public CommonFunctions cfn;
	public static WebDriver driver;

	public TS_011_SubscriberClicksOnServicesInManageCircleMenu() throws IOException, InterruptedException {
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

	/*@AfterClass
	public void afterClass() {
		driver.quit();
	}*/

	@Test(priority = 11001, description = "TC_001 SubScriber visits ShearCircle page")
	public void TC_001_SubScriber_visitsShearCircle() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_001 SubScriber visits ShearCircle page");
		SR.launchApplication();
	}

	@Test(priority = 11002, description = "TC_002 SubScriber clicks Login Button")
	public void TC_002_SubScriberr_clicks_LogIn_Button() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_002 SubScriber clicks Login Button");
		SR.logIn_ToDashboard();
	}

	@Test(priority = 11003, description = "TC_11_001 SubScriber Open the Service page")
	public void TC_11_001_Subscriber_open_Service_Page() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_11_001 SubScriber Open the Service page");
		SR.open_Service_Page("ServiceAlreadyAdded");
	}

	@Test(priority = 11004, description = "TC_11_002 SubScriber Check the details under individual Group")
	public void TC_11_002_SubScriber_checkDetails_UnderIndividualGroup() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_11_002 SubScriber Check the details under individual Group");
		SR.checkDetails_UnderIndividualGroup();
	}

	@Test(priority = 11005, description = "TC_11_003 SubScriber Check whether a New Group can be added")
	public void TC_11_003_SubScriber_check_NewGroup_Added() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_11_003 SubScriber Check whether a New Group can be added");
		SR.check_NewGroup_Added();
	}

	@Test(priority = 11006, description = "TC_11_004 SubScriber Check whether New Group can be added without tying group name")
	public void TC_11_004_SubScriber_check_NewGroupAdded_WithoutTyping_GroupName() throws IOException {
		ExtentTestManager.getTest()
				.setDescription("TC_11_004 SubScriber Check whether New Group can be added without tying group name");
		SR.check_NewGroupAdded_WithoutTyping_GroupName();
	}

	@Test(priority = 11007, description = "TC_11_005 SubScriber Check whether the Group name can be edited")
	public void TC_11_005_SubScriber_check_GroupName_Edited() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_11_005 SubScriber Check whether the Group name can be edited");		
		SR.check_GroupName_Edited();
	}

	@Test(priority = 11008, description = "TC_11_006 SubScriber Check whether a group can be deleted")
	public void TC_11_006_SubScriber_check_Group_Deleted() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_11_006 SubScriber Check whether a group can be deleted");
		SR.check_Group_Deleted();
	}

	@Test(priority = 11009, description = "TC_11_007 SubScriber Check the action & details when +New Service button is clicked")
	public void TC_11_007_SubScriber_Check_ActionAndDetails_AddNewServiceButton_Click() throws IOException {
		ExtentTestManager.getTest()
				.setDescription("TC_11_007 SubScriber Check the action & details when +New Service button is clicked");
		SR.check_NewGroup_Added();
		SR.Check_ActionAndDetails_AddNewServiceButton_Click();
	}

	@Test(priority = 11010, description = "TC_11_008 SubScriber Check the mandatory fields in Add new service popup")
	public void TC_11_008_SubScriber_check_MandatoryFields_InAddNewService_Popup() throws IOException {
		ExtentTestManager.getTest()
				.setDescription("TC_11_008 SubScriber Check the mandatory fields in Add new service popup");
		SR.check_MandatoryFields_InAddNewService_Popup();
	}

	@Test(priority = 11011, description = "TC_11_009 SubScriber Check whether new service can be added")
	public void TC_11_009_SubScriber_check_NewService_Added() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_11_009 SubScriber Check whether new service can be added");
		SR.check_NewService_Added();
	}

}