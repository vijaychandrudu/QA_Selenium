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

public class TS_012_SubscriberclicksonStaffunderManageCircleMenu extends StaticVariables {
	public String TestDataPath;
	public Subscriber_Module_Page_Components SR;
	public CommonFunctions cfn;
	public static WebDriver driver;

	public TS_012_SubscriberclicksonStaffunderManageCircleMenu() throws IOException, InterruptedException {
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

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

	@Test(priority = 12001, description = "SubScriber visits ShearCircle page")
	public void Subscriber_visitsShearCircle() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_12_001 SubScriber visits ShearCircle page");
		SR.launchApplication();
	}

	@Test(priority = 12002, description = "SubScriber clicks Login Button")
	public void Subscriber_clicks_LogIn_Button() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_1_2_002 SubScriber clicks Login Button");
		SR.logIn_ToDashboard();
	}

	@Test(priority = 12003, description = "TC_12_001 SubScriber Open Staff page")
	public void TC_12_001_SubScriber_open_StaffPage() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_1_2_001 SubScriber Open Staff page");
		SR.open_StaffPage();
	}

	@Test(priority = 12004, description = "TC_12_002 SubScriber Check the details in staff page")
	public void TC_12_002_SubScriber_check_Details_InStaffPage() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_1_2_002 SubScriber Check the details in staff page");
		SR.check_Details_InStaffPage();
	}

	@Test(priority = 12005, description = "TC_12_003 SubScriber Check the New Staff button")
	public void TC_12_003_SubScriber_click_NewStaff_Button() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_1_2_003 SubScriber Check the New Staff button");
		SR.click_NewStaff_Button();
	}

	@Test(priority = 12006, description = "TC_12_004 SubScriber Check the Mandatory fields in Add new staff popup")
	public void TC_12_004_SubScriber_check_AddNewStaff_Popup_InMandatoryFieldsValidations() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_1_2_004 SubScriber Check the Mandatory fields in Add new staff popup");
		SR.check_AddNewStaff_Popup_InMandatoryFieldsValidations();
	}

	@Test(priority = 12007, description = "TC_12_005 SubScriber Check if a Staff can be added")
	public void TC_12_005_SubScriber_check_AddNewStaff_Popup_InMandatoryFieldsValidations() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_12_005 SubScriber Check if a Staff can be added");
		SR.check_StaffAdded_Details("Enter_Email", "DoNothing");
	}

	@Test(priority = 12008, description = "TC_12_006 SubScriber Check if a Staff details can be modified")
	public void TC_12_006_SubScriber_check_StaffDetails_Modify() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_12_006 SubScriber Check if a Staff details can be modified");
		SR.check_StaffDetails_Modify();
	}

	@Test(priority = 12009, description = "TC_12_007 SubScriber Check whether a Staff can be deleted")
	public void TC_12_007_SubScriber_check_Staff_Details_Deleted() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_12_007 SubScriber Check whether a Staff can be deleted");
		SR.check_Staff_Details_Deleted();
	}

	
	 /*@Test(priority=12010, description="TC_12_088 SubScriber Check whether a profile image can be added for Staff")
	 public void TC_1_2_008_SubScriber_check_Staff_ProfileImage_Added() throws IOException
	 { 
		 ExtentTestManager.getTest().setDescription("TC_12_008 SubScriber Check whether a profile image can be added for Staff"); 
		 SR.check_Staff_ProfileImage_Added(); 
	 }*/
	 
	@Test(priority = 12011, description = "TC_12_009 Check the Search box")
	public void TC_1_2_009_Subscriber_Check_Search_box() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_12_009 Check the Search box");
		SR.check_SearchBox("Enter_Name");
	}

}