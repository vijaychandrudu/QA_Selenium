package com.shearcircle.testscenarios;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.shearcircle.pagecomponents.Customer_Module_Page_Components;
import com.shearcircle.utilities.CommonFunctions;
import com.shearcircle.utilities.StaticVariables;

public class TS_3_03_CustomerClicksonMyappointments extends StaticVariables {
	public String TestDataPath;
	public Customer_Module_Page_Components CR;
	public CommonFunctions cfn;
	public static WebDriver driver;
	
	public TS_3_03_CustomerClicksonMyappointments() throws IOException, InterruptedException{
		cfn = new CommonFunctions();		
	}
		
	@BeforeClass
	@Parameters("browser")
	public void beforeclass(@Optional("chrome") String browser) throws IOException, InterruptedException {
		TestDataPath = cfn.TestDataPathOf("CustomerTestData.properties");
		Browser = browser;
		//cfn.getAndOpenBrowser(browser);		
		driver = cfn.getDriver();		
		CR = new Customer_Module_Page_Components(driver);
		defaultWindowHandle = driver.getWindowHandle();
	}
	
	
	@AfterMethod
	public void StatusScreenShots(ITestResult testResult) throws IOException, InterruptedException {
		cfn.ScreenshotOnPassFail(testResult);
		Thread.sleep(1000);
	}

		
	@AfterClass
	public void logOut(){
		CR.Customer_JoinOurCircle_LogOutpage();
		//driver.quit();
	}
	
	@Test(priority=30301, description="Customer visits ShearCircle page" )
	public void TC_3_3_1_Customer_visitsShearCircle() throws IOException {			
		CR.ShearCircle_LaunchApplication();			
	}
	
	@Test(priority=30302, description="Customer clicks Login Button " )
	public void TC_3_3_2Customer_clicks_JoinOurCircleButton() throws IOException {			
		CR.ShearCircle_Click_Login_OR_JoinOurCircle("Click_Login");			
	}
	
	@Test(priority=30303, description="Customer Login with registered Username(Email id) & Password " )
	public void TC_3_3_3Customer_CheckRegisterWithShearCirclepage()throws IOException {			
		CR.ShearCircle_Customer_Login_valid_invalid_combination("Enter_Valid_EmailandPassword");			
	}
	/*@Test(priority=30304, description="TC_3_3_01 Check the info in My Appointments for first time login/without creating any bookings")
	public void TC_3_3_01_Customer_CheckMyAppointmentsFirsttimelogin_Or_Withoutadding() throws IOException {			
		CR.shearCircle_Verify_Customer_Clickson_MyAppoinments_firsttime_Login();			
	}*/
	
	@Test(priority=30305, description="TC_3_3_02 Check the info in My Favorite where Salons are already added as Favorites")
	public void TC_3_3_02_Customer_CheckMyAppointmentsalreadyAdded()throws IOException {			
		CR.shearCircle_Verify_Customer_Clickson_MyAppoinmentsforExistingUser();			
	}
	
	@Test(priority=30306, description="TC_3_3_03 Check whether the View button is clickable")
	public void TC_3_3_03_Customer_CheckViewbuttonclickable()throws IOException {			
		CR.Check_View_Button_Is_clickable();		
	}
	
	@Test(priority=30307, description="TC_3_3_04 Check whether the page navigation forward arrows are clickable")
	public void TC_3_3_04_Customer_CheckPageNavigationForwardArrowsclickable()throws IOException {			
		CR.checkWhether_ThePageNavigation_ForwardArrows_Clickable();		
	}
	
	@Test(priority=30308, description="TC_3_3_05 Check whether the page navigation backward arrows are clickable")
	public void TC_3_3_05_Customer_CheckPageNavigationBackwardArrowsclickable()throws IOException {			
		CR.checkWhether_ThePageNavigation_BackwardArrowsAre_Clickable();		
	}
	@Test(priority=30309, description="TC_3_3_06 Check whether the correct page is displayed by clicking on page number")
	public void TC_3_3_06_Customer_CheckCorrectpagedisplayedbyclickingpageNumber()throws IOException {			
		CR.checkWhether_TheCorrectPage_IsDIsplayedBy_ClickingoOnPage_Number();		
	}
	
	@Test(priority=30310, description="TC_3_3_07 Check the available filters in Type")
	public void TC_3_3_07_Customer_CheckAvailableFiltersType()throws IOException {			
		CR.checkThe_Available_Filters_InType();		
	}
	
	@Test(priority=30311, description="TC_3_3_08 Check the available filters in Status")
	public void TC_3_3_08_Customer_CheckAvailableFiltersStatus()throws IOException {			
		CR.checkThe_Available_FiltersInStatus();		
	}
	
	@Test(priority=30312, description="TC_3_3_09 Check the upcoming bookings")
	public void TC_3_3_09_Customer_CheckUpcomingBookings()throws IOException {			
		CR.check_Upcoming_Bookings();		
	}
	@Test(priority=30313, description="TC_3_3_010 Check the past bookings")
	public void TC_3_3_010_Customer_CheckPastBookings()throws IOException {			
		CR.checkThe_Past_Bookings();		
	}
	
	@Test(priority=30314, description="TC_3_3_011 Check the Completed status for the bookings of AppointmentStatus and PamentStatus")
	public void TC_3_3_011_Customer_CheckCompletedStatusBookings()throws IOException {			
		CR.check_Completed_Status_Bookings_AppointmentStatusandPamentStatus();		
	}
	
	@Test(priority=30315, description="TC_3_3_012 Check the Pending status bookings for the bookings of AppointmentStatus and PamentStatus")
	public void TC_3_3_012_Customer_CheckPendingStatusBookings()throws IOException {			
		CR.checkThe_Pending_Bookings_AppointmentStatusandPamentStatus();		
	}

}
