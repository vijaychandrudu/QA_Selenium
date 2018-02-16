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

import utils.ExtentReports.ExtentTestManager;

public class TS_6_01_BookingAppoinment_WithoutSignin extends StaticVariables {
	public String TestDataPath;
	public Customer_Module_Page_Components CR;
	public CommonFunctions cfn;
	public static WebDriver driver;
	
	public TS_6_01_BookingAppoinment_WithoutSignin() throws IOException, InterruptedException{
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
		
	/*@AfterClass
	public void CloseDriver(){		
		driver.quit();
	}*/
	
	@Test(priority=60101, description="Customer visits ShearCircle page" )
	public void Customer_visitsShearCircle() throws IOException {	
		ExtentTestManager.getTest().setDescription("Customer visits ShearCircle page");
		CR.ShearCircle_LaunchApplication();			
	}
	
	@Test(priority=60102, description="Invoke the search results page")
	public void Customer_Invokesearchresultspage() throws IOException {			
		ExtentTestManager.getTest().setDescription("Invoke the search results page");	
		//CR.checkThe_Locate_Button();
		CR.invokeTO_SearcResults_Page();
	}
	@Test(priority=60103, description="TC_5_1_01 Invoke the Business Page and verify Business page elements")
	public void TC_5_1_01_Customer_InvokeBusinesspage() throws IOException {			
		ExtentTestManager.getTest().setDescription("Invoke the Business Page and verify Business page elements");
		CR.Verify_business_Page_Field_Validation();			
	}
	
	@Test(priority=60104, description="TC_6_1_02 Check the Cart popup for single service")
	public void TC_6_1_02_Customer_CartPopup_ForSingleService() throws IOException {			
		ExtentTestManager.getTest().setDescription("Check the Cart popup for single service");
		CR.check_CartPopup_ForSingleService();			
	}
	
	@Test(priority=60105, description="TC_6_1_03 Check the Cart popup for multiple services	")
	public void TC_6_1_03_Customer_CartPopup_ForMultiple_Services() throws IOException {			
		ExtentTestManager.getTest().setDescription("Check the Cart popup for Multiple service");
		CR.check_CartPopup_ForMultiple_Services();			
	}
	@Test(priority=60106, description="TC_6_1_04 Check the Book Now button")
	public void TC_6_1_04_Customer_check_BookNow_Button() throws IOException {			
		ExtentTestManager.getTest().setDescription("Check the Book Now button");
		CR.check_BookNow_Button();			
	}
	@Test(priority=60107, description="TC_6_1_05 Check the details in Choose Professional Page")
	public void TC_6_1_05_check_DetailsInChoose_ProfessionalPage() throws IOException {			
		ExtentTestManager.getTest().setDescription("Check the details in Choose Professional Page");
		CR.check_DetailsInChoose_ProfessionalPage();			
	}
	
	@Test(priority=60108, description="TC_6_1_06 Check whether the cart popup & service page displays the selected items when the back button is clicked")
	public void TC_6_1_06_check_CartPopup_SelectedItems_When_BackButton_Click() throws IOException {			
		ExtentTestManager.getTest().setDescription("Check whether the cart popup & service page displays the selected items when the back button is clicked");
		CR.check_CartPopup_SelectedItems_When_BackButton_Click();			
	}
	
	@Test(priority=60109, description="TC_6_1_07 Check whether the cart popup updates when the services are added/removed")
	public void TC_6_1_07_check_CartPopup_updates_services_added_removed() throws IOException {			
		ExtentTestManager.getTest().setDescription("Check whether the cart popup updates when the services are added/removed");
		CR.Check_cartpopupupdates_when_services_added_or_removed();			
	}
	
	@Test(priority=60110, description="TC_6_1_08 Check whether the Staff image is clickable")
	public void TC_6_1_08_check_Staffimage_clickable() throws IOException {			
		ExtentTestManager.getTest().setDescription("Check whether the Staff image is clickable");
		CR.Check_Staffimage_clickable();			
	}
	
	@Test(priority=60111, description="TC_6_1_09 Check the details in Choose Date and Time page")
	public void TC_6_1_09_check_DetailsIn_ChooseDateAndTime_Page_Fieldvalidation() throws IOException {			
		ExtentTestManager.getTest().setDescription("Check the details in Choose Date and Time page");
		CR.check_DetailsIn_ChooseDateAndTime_Page_Fieldvalidation();			
	}
	@Test(priority=60112, description="TC_6_1_10 Check whether the Back button navigates to Choose Professional page")
	public void TC_6_1_10_check_BackButton_NavigatesTo_Choose_Professional_Page() throws IOException {			
		ExtentTestManager.getTest().setDescription("Check whether the Back button navigates to Choose Professional page");
		CR.check_BackButton_NavigatesTo_Choose_Professional_Page();			
	}
	@Test(priority=60113, description="TC_6_1_11 Check whether the timeslots are clickable")
	public void TC_6_1_11_check_TheTimeslotsAre_Clickable() throws IOException {			
		ExtentTestManager.getTest().setDescription("Check whether the timeslots are clickable");
		CR.check_DetailsIn_ChooseDateAndTime_Page_Fieldvalidation();
		CR.check_TheTimeslotsAre_Clickable();			
	}
	@Test(priority=60114, description="TC_6_1_12 Check whether clicking the Cancel button in popup returns to Timeslots page")
	public void TC_6_1_12_check_Click_CancelButton_InPopup() throws IOException {			
		ExtentTestManager.getTest().setDescription("Check whether clicking the Cancel button in popup returns to Timeslots page");
		CR.check_Click_CancelButton_InPopup();			
	}
	@Test(priority=60115, description="TC_6_1_13 Check whether clicking on Yes, Proceed to Book button navigates to next page")
	public void TC_6_1_13_check_click_OnYes_ProceedTo_BookButton_Navigate_ToNextPage() throws IOException {			
		ExtentTestManager.getTest().setDescription("Check whether clicking on Yes, Proceed to Book button navigates to next page");
		CR.check_TheTimeslotsAre_Clickable();
		CR.check_click_OnYes_ProceedTo_BookButton_Navigate_ToNextPage();			
	}
	
	@Test(priority=60116, description="TC_6_1_14 Check the details in Booking Summary page")
	public void TC_6_1_14_check_Booking_Summary_page_FieldValidation() throws IOException {			
		ExtentTestManager.getTest().setDescription("Check the details in Booking Summary page");
		CR.check_Details_InBooking_SummaryPage_FieldValidation();			
	}
	
	@Test(priority=60117, description="TC_6_1_15 Check whether the booking can be done without sign in ")
	public void TC_6_1_15_check_BookingCanBe_DoneWithout_SignIn() throws IOException {			
		ExtentTestManager.getTest().setDescription("Check whether the booking can be done without sign in");
		CR.check_BookingCanBe_DoneWithout_SignIn();			
	}
	
	@Test(priority=60118, description="TC_6_1_16 Check whether Click to Sign In link is clickable")
	public void TC_6_1_16_check_ClickTo_SignIn_Link_IsClickable() throws IOException {			
		ExtentTestManager.getTest().setDescription("Check whether Click to Sign In link is clickable");
		CR.check_ClickTo_SignIn_Link_IsClickable();			
	}
	
	@Test(priority=60119, description="TC_6_1_17_click on  Get It Back link in Login popup is working")
	public void TC_6_1_17_Customer_CheckGetItBackLink_InLoginPopupIsWorking() throws IOException {			
		ExtentTestManager.getTest().setDescription("click on Get It Back link in Login popup is working");
		CR.check_GetItBack_Link_InLoginPopup_IsWorking();		
	}
	@Test(priority=60120, description="TC_6_1_18_click on Register Now link in Login popup is working")
	public void TC_6_1_18_Customer_check_RegisterNowLink_InLoginPopup_IsWorking() throws IOException {			
		ExtentTestManager.getTest().setDescription("click on Register Now link in Login popup is working");
		CR.check_RegisterNow_Link_InLoginPopup_IsWorking();		
	}
	
	@Test(priority=60121, description="TC_6_1_19_enter Customer Subscriber credentials click SignIn butoon")
	public void TC_6_1_19_Customer_check_SignIn_Posiisble_WithSubscriberCredentials() throws IOException {			
		ExtentTestManager.getTest().setDescription("Enter Customer Subscriber credentials click SignIn butoon");
		CR.check_SignIn_Posiisble_WithSubscriberCredentials();		
	}
	
	@Test(priority=60122, description="TC_6_1_20_enter Customer Unregistered credentials click SignIn butoon")
	public void TC_6_1_20_Customer_check_SignIn_PosiisbleWith_UnregisteredUserCredentials() throws IOException {			
		ExtentTestManager.getTest().setDescription("Enter Customer Unregistered credentials click SignIn butoon");
		CR.check_SignIn_PosiisbleWith_Unregistered_UserCredentials();		
	}
	
	@Test(priority=60123, description="TC_6_1_21_Enter Valid Customer credentials click SignIn butoon")
	public void TC_6_1_21_Customer_check_SignIn_PossibleWith_ValidCustomercredentials() throws IOException {			
		ExtentTestManager.getTest().setDescription("Enter Valid Customer credentials click SignIn butoon");
		CR.check_SignIn_IsPossibleWith_ValidCustomercredentials();	
	}
	
	@Test(priority=60124, description="TC_6_1_22_check booking can be confirmed after sign in with Pay by Cash option")
	public void TC_6_1_22_Customer_check_Booking_Confirmed_AfterSignIn_With_PayByCashOption() throws IOException {			
		ExtentTestManager.getTest().setDescription("Enter Valid Customer credentials click SignIn butoon");
		CR.check_Booking_Confirmed_AfterSignIn_WithPayByCashOption();	
	}
	@Test(priority=60125, description="TC_6_1_23_verify details in View Booking Summary page")
	public void TC_6_1_23_Customer_verify_DetailsInViewBooking_SummaryPage_Fieldvalidations() throws IOException {			
		ExtentTestManager.getTest().setDescription("verify details in View Booking Summary page");
		CR.verify_DetailsIn_ViewBooking_SummaryPage_Fieldvalidations();	
		
	}
	@Test(priority=60126, description="TC_6_1_24_click on print button")
	public void TC_6_1_24_Customer_verify_DetailsInViewBooking_SummaryPage_Fieldvalidations() throws IOException {			
		ExtentTestManager.getTest().setDescription("click on print button");
		CR.check_PrintButton_IsFunctioning();	
		
	}
}
