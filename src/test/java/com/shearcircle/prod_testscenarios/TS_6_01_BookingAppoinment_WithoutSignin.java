package com.shearcircle.prod_testscenarios;

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
	@Test(priority=60111, description="TC_6_1_09 Check the details in Choose Date and Time page")
	public void TC_6_1_09_check_DetailsIn_ChooseDateAndTime_Page_Fieldvalidation() throws IOException {			
		ExtentTestManager.getTest().setDescription("Check the details in Choose Date and Time page");
		CR.check_DetailsIn_ChooseDateAndTime_Page_Fieldvalidation();			
	}
	@Test(priority=60112, description="TC_6_1_10 Check whether the Back button navigates to Choose Professional page")
	public void TC_6_1_09_check_BackButton_NavigatesTo_Choose_Professional_Page() throws IOException {			
		ExtentTestManager.getTest().setDescription("Check whether the Back button navigates to Choose Professional page");
		CR.check_BackButton_NavigatesTo_Choose_Professional_Page();			
	}
	@Test(priority=60113, description="TC_6_1_11 Check whether the timeslots are clickable")
	public void TC_6_1_11_check_TheTimeslotsAre_Clickable() throws IOException {			
		ExtentTestManager.getTest().setDescription("Check whether the timeslots are clickable");
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
		CR.check_click_OnYes_ProceedTo_BookButton_Navigate_ToNextPage();			
	}
	
}
