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

public class TS_021_SubscriberClicksOn_AppointmentsMenu extends StaticVariables {
	public String TestDataPath;
	public Subscriber_Module_Page_Components SR;
	public CommonFunctions cfn;
	public static WebDriver driver;

	public TS_021_SubscriberClicksOn_AppointmentsMenu() throws IOException, InterruptedException {
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

	@Test(priority = 21001, description = "TC_001 SubScriber visits ShearCircle page")
	public void TC_001_SubScriber_visitsShearCircle() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_001 SubScriber visits ShearCircle page");
		SR.launchApplication();
	}

	@Test(priority = 21002, description = "TC_002 SubScriber clicks Login Button")
	public void TC_002_SubScriberr_clicks_LogIn_Button() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_002 SubScriber clicks Login Button");
		SR.logIn_ToDashboard();
	}

	@Test(priority = 21003, description = "TC_21_001 Open Appointments page")
	public void TC_21_001_SubScriberr_open_AppointmentsPage() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_21_001 Open Appointments page");
		SR.open_AppointmentsPage();
	}

	@Test(priority = 21004, description = "TS_21_002 Check whether booking details can be viewed for a booking id")
	public void TC_21_002_SubScriberr_check_BookingDetails_Viewe_BookingId() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_21_002 Check the Create Sale Order button");
		SR.check_BookingDetails_Viewe_BookingId();
	}

	@Test(priority = 21005, description = "TC_21_003 Check the available options for booking with status as New")
	public void TC_21_003_SubScriberr_check_AvailableOptions_ForBooking_withStatusAs_New() throws IOException {
		ExtentTestManager.getTest()
				.setDescription("TC_21_003 Check the available options for booking with status as New");
		SR.check_AvailableOptions_ForBooking_withStatusAs_New();
	}

	@Test(priority = 21006, description = "TC_21_004 Check whether available timeslots are displayed when we click on Reschedule button")
	public void TC_21_004_SubScriberr_click_On_Reschedule_Button() throws IOException {
		ExtentTestManager.getTest().setDescription(
				"TC_21_004 Check whether available timeslots are displayed when we click on Reschedule button");
		SR.click_On_Reschedule_Button();
	}

	@Test(priority = 21007, description = "TC_21_005 Check whether an appointment can be Rescheduled")
	public void TC_21_005_SubScriberr_check_AnAppointment_CanBeRescheduled() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_21_005 Check whether an appointment can be Rescheduled");
		SR.check_AnAppointment_CanBeRescheduled();
	}

	
	@Test(priority = 21008, description = "TC_21_006 Check whether the Staff receives reschedule notification")
	public void TC_21_006_SubScriberr_check_Staff_ReceivesReschedule_Notification() throws IOException {
		ExtentTestManager.getTest()
				.setDescription("TC_21_006 Check whether the Staff receives reschedule notification");
		SR.check_Staff_ReceivesReschedule_Notification();
	}
	 

	@Test(priority = 21009, description = "TC_21_007 Check whether the Customer receives reschedule notification")
	public void TC_21_007_SubScriberr_check_Customer_ReceivesReschedule_Notification() throws IOException {
		ExtentTestManager.getTest()
				.setDescription("TC_21_007 Check whether the Customer receives reschedule notification");
		SR.check_Customer_ReceivesReschedule_Notification();
	}
	

	@Test(priority = 21010, description = "TC_21_008 Check whether a New booking can be Cancelled")
	public void TC_21_008_SubScriberr_checkwhether_NewBookingCan_BeCancelled() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_21_008 Check whether a New booking can be Cancelled");
		SR.checkwhether_NewBookingCan_BeCancelled();
	}

	@Test(priority = 21011, description = "TC_21_009 Check the available options in a Cancelled booking")
	public void TC_21_009_SubScriberr_check_AnAppointment_CanBeRescheduled() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_21_009 Check the available options in a Cancelled booking");
		SR.check_AnAppointment_CanBeRescheduled();
	}

	@Test(priority = 210012, description = "TC_21_010 Check whether Staff receives notification for Cancelled appointments")
	public void TC_21_0010_SubScriberr_check_Staff_ReceivesNotification_ForCancelledAppointments() throws IOException {
		ExtentTestManager.getTest()
				.setDescription("TC_21_010 Check whether Staff receives notification for Cancelled appointments");
		SR.check_Staff_ReceivesNotification_ForCancelledAppointments();
	}

	@Test(priority = 21013, description = "TC_21_011 Check whether Customer receives Cancellation notification")
	public void TC_21_011_SubScriberr_check_Customer_ReceivesNotification_ForCancelledAppointments()
			throws IOException {
		ExtentTestManager.getTest()
				.setDescription("TC_21_011 Check whether Customer receives Cancellation notification");
		SR.check_Customer_ReceivesNotification_ForCancelledAppointments();
	}

	@Test(priority = 21014, description = "TC_21_012 Check the options available for booking with status as Completed")
	public void TC_21_012_SubScriberr_checkwhether_NewBookingCan_BeCompleted() throws IOException {
		ExtentTestManager.getTest()
				.setDescription("TC_21_012 Check the options available for booking with status as Completed");
		SR.checkwhether_NewBookingCan_BeCompleted();
	}

	@Test(priority = 21015, description = "TC_21_013 Check whether receipt/invoice can be viewed for Completed booking")
	public void TC_21_013_SubScriberr_checkWhether_Receipt_ViewedFor_CompletedBooking() throws IOException {
		ExtentTestManager.getTest()
				.setDescription("TC_21_013 Check whether receipt/invoice can be viewed for Completed booking");
		SR.checkWhether_Receipt_ViewedFor_CompletedBooking();
	}

	@Test(priority = 21016, description = "TC_21_014 Check whether the receipt can be downloaded")
	public void TC_21_014_SubScriberr_checkWhether_Receipt_CanBeDownloaded() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_21_014 Check whether the receipt can be downloaded");
		SR.checkWhether_Receipt_CanBeDownloaded();
	}

	@Test(priority = 21017, description = "TC_21_015 Check whether the receipt can be sent as email")
	public void TC_21_015_SubScriberr_checkWhether_Receipt_SentAsEmail() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_21_015 Check whether the receipt can be sent as email");
		SR.checkWhether_Receipt_SentAsEmail();
	}

	@Test(priority = 21018, description = "TC_21_016 Check whether the Return to Appointments button redirects to Appointments page")
	public void TC_21_016_SubScriberr_checkWhether_ReturnToAppointmentsButton_Redirectsto_AppointmentsPage()
			throws IOException {
		ExtentTestManager.getTest().setDescription(
				"TC_21_016 Check whether the Return to Appointments button redirects to Appointments page");
		SR.checkWhether_ReturnToAppointmentsButton_Redirectsto_AppointmentsPage();
	}

	@Test(priority = 21019, description = "TC_21_017 Check whether an appointment can be confirmed")
	public void TC_21_017_SubScriberr_Checkwhether_AnAppointment_Confirmed() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_21_017 Check whether an appointment can be confirmed");
		SR.Checkwhether_AnAppointment_Confirmed();
	}

	@Test(priority = 21020, description = "TC_21_018 Check the available options for a Confirmed booking")
	public void TC_21_018_SubScriberr_check_AvailableOptions_For_ConfirmedBooking() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_21_018 Check the available options for a Confirmed booking");
		SR.check_AvailableOptions_For_ConfirmedBooking();
	}

	@Test(priority = 21021, description = "TC_21_019 Check filter by date Today")
	public void TC_21_019_SubScriberr_check_FilterByDate_Today() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_21_019 Check filter by date Today");
		SR.check_FilterByDate_Today();
	}

	@Test(priority = 21022, description = "TC_21_020 Check filter by date All Appointments")
	public void TC_21_020_SubScriberr_check_filterByDate_AllAppointments() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_21_020 Check filter by date – All Appointments");
		SR.check_filterByDate_AllAppointments();
	}

	@Test(priority = 21023, description = "TC_21_021 Check filter by date Custom Range")
	public void TC_21_021_SubScriberr_check_filterByDate_CustomRange() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_21_021 Check filter by date Custom Range");
		SR.check_filterByDate_CustomRange();
	}

	@Test(priority = 21024, description = "TC_21_022 Check filter by Staff name")
	public void TC_21_022_SubScriberr_check_filterBy_StaffName() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_21_022 Check filter by Staff name");
		SR.check_filterBy_StaffName();
	}

	@Test(priority = 21025, description = "TC_21_023 Check filter by booking status")
	public void TC_21_023_SubScriberr_check_FilterBy_BookingStatus() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_21_023 Check filter by booking status");
		SR.check_FilterBy_BookingStatus();
	}

	@Test(priority = 21026, description = "TC_21_024 Check the search box")
	public void TC_21_024_SubScriberr_check_AnAppointment_CanBeRescheduled() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_21_024 Check the search box");
		SR.check_SearchBoxInApponments("ID");
		SR.check_SearchBoxInApponments("Name");
		SR.check_SearchBoxInApponments("Date");
	}

}