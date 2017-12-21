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

public class TS_4_01_Customer_SearchforProfessionals_Servicesusingsearchbox extends StaticVariables {
	public String TestDataPath;
	public Customer_Module_Page_Components CR;
	public CommonFunctions cfn;
	public static WebDriver driver;
	
	public TS_4_01_Customer_SearchforProfessionals_Servicesusingsearchbox() throws IOException, InterruptedException{
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
	public void CloseDriver(){		
		driver.quit();
	}
	
	@Test(priority=40101, description="Customer visits ShearCircle page" )
	public void TC_3_4_1_Customer_visitsShearCircle() throws IOException {	
		ExtentTestManager.getTest().setDescription("Customer visits ShearCircle page");
		CR.ShearCircle_LaunchApplication();			
	}
	
	@Test(priority=40102, description="TC_4_1_01 Verify the search box in Home page")
	public void TC_4_1_01_Customer_VerifysearchboxinHomepage() throws IOException {			
		ExtentTestManager.getTest().setDescription("Verify the search box in Home page");			
		CR.verify_SearchBox_inHomePageFieldValidation();
	}
	@Test(priority=40103, description="TC_4_1_02 Verify the search box in inner pages")
	public void TC_4_1_02_Customer_CheckCancelButtonClickable() throws IOException {			
		ExtentTestManager.getTest().setDescription("Check the info in Settings page");
		CR.verify_SearchBoxIn_InnerPage_FieldValidations("Click_Login");			
	}
	
	@Test(priority=40104, description="TC_4_1_03 Check the Locate button")
	public void TC_4_1_03_Customer_CheckLocatebutton() throws IOException {			
		ExtentTestManager.getTest().setDescription("Check the Locate button");		
		CR.checkThe_Locate_Button();			
	}
	
	@Test(priority=40105, description="TC_4_1_04 Check the details in Search Results page")
	public void TC_4_1_04_Customer_CheckdetailsinSearchResultspage() throws IOException {			
		ExtentTestManager.getTest().setDescription("Check the details in Search Results page");
		CR.verify_searchItems_in_Search_Results_page();		
	}
	
	@Test(priority=40106, description="TC_4_1_05 Check the search result by entering keyword in Salon/Spa/Professional box -(Name)")
	public void TC_3_4_05_Customer_CheckChangePasswordlinkClickable() throws IOException {			
		ExtentTestManager.getTest().setDescription("Check the search result by entering keyword in Salon/Spa/Professional box -(Name)");
		CR.checkSearchResult_ByEntering_keyword_SalonOrSpaOrProfessional("Click_Locate_Button", "Salon");
		CR.checkSearchResult_ByEntering_keyword_SalonOrSpaOrProfessional("Click_Locate_Button", "Spa");
		CR.checkSearchResult_ByEntering_keyword_SalonOrSpaOrProfessional("Click_Locate_Button", "Professional");
	}
	
	@Test(priority=40107, description="TC_4_1_06 Check the search result by entering keyword in ZipCode/City,State")
	public void TC_3_4_06_Customer_ChecksearchresultbyenteringkeywordinZipCode_City_State() throws IOException {			
		ExtentTestManager.getTest().setDescription("Check the search result by entering keyword in ZipCode/City,State");
		CR.ChecksearchresultbyenteringkeywordinZipCode_City_State("Click_Locate_Button","ZipCode");		
		CR.ChecksearchresultbyenteringkeywordinZipCode_City_State("Click_Locate_Button","City");		
		CR.ChecksearchresultbyenteringkeywordinZipCode_City_State("Click_Locate_Button","State");		
	}
	
	@Test(priority=40108, description="TC_4_1_07 Check the search result by entering keyword in both Name & Location textboxes")
	public void TC_4_1_07_Customer_CheckPasswordwithlessthan6charsorspaces() throws IOException {			
		ExtentTestManager.getTest().setDescription("Check the search result by entering keyword in both Name & Location textboxes");
		CR.checkSearchResult_ByEntering_keyword_InBothNameAndLocation("Click_Locate_Button");		
	}	
		
	@Test(priority=40109, description="TC_3_4_09 Check whether the Cancel button is clickable in Secure password change page")
	public void TC_4_1_08_Customer_resultsbyselectingsubcategory_Homepage() throws IOException {			
		ExtentTestManager.getTest().setDescription("Check whether the Cancel button is clickable in Secure password change page");
		CR.click_HomePage_NavigateBar_Menulinks("Click_Beauty");		
	}
	

}
