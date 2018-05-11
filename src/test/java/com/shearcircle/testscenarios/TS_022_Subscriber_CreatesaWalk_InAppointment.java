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

public class TS_022_Subscriber_CreatesaWalk_InAppointment extends StaticVariables {
	public String TestDataPath;
	public Subscriber_Module_Page_Components SR;
	public CommonFunctions cfn;
	public static WebDriver driver;

	public TS_022_Subscriber_CreatesaWalk_InAppointment() throws IOException, InterruptedException {
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

	@Test(priority = 22001, description = "TC_001 SubScriber visits ShearCircle page")
	public void TC_001_SubScriber_visitsShearCircle() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_001 SubScriber visits ShearCircle page");
		SR.launchApplication();
	}

	@Test(priority = 22002, description = "TC_002 SubScriber clicks Login Button")
	public void TC_002_SubScriberr_clicks_LogIn_Button() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_002 SubScriber clicks Login Button");
		SR.logIn_ToDashboard();
	}

	@Test(priority = 22003, description = "TC_22_001 Check the +New Appointments button")
	public void TC_22_001_SubScriberr_check_NewAppointments_Button() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_22_001 Check the +New Appointments button");
		SR.check_NewAppointments_Button();
	}

	@Test(priority = 22004, description = "TS_22_002 Check whether booking details can be viewed for a booking id")
	public void TC_22_002_SubScriberr_check_BookingDetails_Viewe_BookingId() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_22_002 Check the Create Sale Order button");
		SR.checkwhether_SingleOrMultiple_Services_Canbe_Selected("ServicesSingleSelected");
	}

	@Test(priority = 22005, description = "TC_22_003 Check the Next button in services page")
	public void TC_22_003_SubScriber_check_NextButton_InServicesPage() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_22_003 Check the Next button in services page");
		SR.check_NextButton_InServicesPage();
	}

	@Test(priority = 22006, description = "TC_22_004 Check whether the Back button in Staff page returns to Service page")
	public void TC_22_004_SubScriber_checkwhether_BackButton_InStaffPage_ReturnsToServicePage() throws IOException {
		ExtentTestManager.getTest()
				.setDescription("TC_22_004 Check whether the Back button in Staff page returns to Service page");
		SR.checkwhether_BackButton_InStaffPage_ReturnsToServicePage();
	}

	@Test(priority = 22007, description = "TC_22_005 Check whether the Staff can be selected")
	public void TC_22_005_SubScriber_checkwhether_Staff_Selected() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_22_005 Check whether the Staff can be selected");
		SR.checkwhether_Staff_Selected();
	}

	@Test(priority = 22008, description = "TC_22_006 Check the Next button in Staff selection page")
	public void TC_22_006_SubScriber_check_NextButton_inStaffSelection_Page() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_22_006 Check the Next button in Staff selection page");
		SR.check_NextButton_inStaffSelection_Page();
	}

	@Test(priority = 22009, description = "TC_22_007 Check whether the Back button in Customer details page takes you to Staff selection page")
	public void TC_22_007_SubScriber_checkwhether_BackButton_inCustomerDetailsPage_TakesYou_ToStaffSelectionPage()
			throws IOException {
		ExtentTestManager.getTest().setDescription(
				"TC_22_007 Check whether the Back button in Customer details page takes you to Staff selection page");
		SR.checkwhether_BackButton_inCustomerDetailsPage_TakesYou_ToStaffSelectionPage();
	}

	@Test(priority = 22010, description = "TC_22_008 Check whether another available Staff can be selected")
	public void TC_22_008_SubScriber_checkwhether_AnotherAvailable_Staff_Selected() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_22_008 Check whether another available Staff can be selected");
		SR.checkwhether_AnotherAvailable_Staff_Selected();
	}

	@Test(priority = 22011, description = "TC_22_009 Check whether available timeslots are displayed")
	public void TC_22_009_SubScriber_checkwhether_AvailableTimeslots_Displayed() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_22_009 Check whether available timeslots are displayed");
		SR.checkwhether_AvailableTimeslots_Displayed();
	}

	@Test(priority = 22012, description = "TC_22_010 Check the Back button in timeslots page")
	public void TC_22_010_Subscriber_check_BackButton_InTimeSlotsPage() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_22_010 Check the Back button in timeslots page");
		SR.check_BackButton_InTimeSlotsPage();
	}

	@Test(priority = 22013, description = "TC_22_011 Check whether appointment can be created without selecting timeslot******/")
	public void TC_22_011_checkwhether_checkwhether_Appointment_Createdwithout_SelectingTimeslot() throws IOException {
		ExtentTestManager.getTest()
				.setDescription("TC_22_011 Check whether appointment can be created without selecting timeslot******/");
		SR.checkwhether_Appointment_Createdwithout_SelectingTimeslot();
	}

	@Test(priority = 22014, description = "TC_22_012 Check whether appointment can be created by selecting timeslot")
	public void TC_22_012_checkWhether_Service_Enabled() throws IOException {
		ExtentTestManager.getTest()
				.setDescription("TC_22_012 Check whether appointment can be created by selecting timeslot");
		SR.checkwhether_Appointment_CreatedBySelectingTimeslot();
	}
}