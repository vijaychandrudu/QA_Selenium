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

public class TS_4_02_Customer_appliesfiltersinsearchpage extends StaticVariables {
	public String TestDataPath;
	public Customer_Module_Page_Components CR;
	public CommonFunctions cfn;
	public static WebDriver driver;
	
	public TS_4_02_Customer_appliesfiltersinsearchpage() throws IOException, InterruptedException{
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
	
	@Test(priority=40201, description="Customer visits ShearCircle page" )
	public void TC_4_2_1_Customer_visitsShearCircle() throws IOException {	
		ExtentTestManager.getTest().setDescription("Customer visits ShearCircle page");
		CR.ShearCircle_LaunchApplication();			
	}
	
	@Test(priority=40202, description="TC_4_2_01 Invoke the search results page")
	public void TC_4_2_01_Customer_Invokesearchresultspage() throws IOException {			
		ExtentTestManager.getTest().setDescription("Invoke the search results page");	
		//CR.checkThe_Locate_Button();
		CR.invokeTO_SearcResults_Page();
	}
	/*@Test(priority=40203, description="TC_4_2_02 Check whether the filters are hidden by clicking the + sign in filter section")
	public void TC_4_2_02_Customer_Checkfiltersarehiddenbyclicking_plussign() throws IOException {			
		ExtentTestManager.getTest().setDescription("Check whether the filters are hidden by clicking the + sign in filter section");
		CR.check_FiltersAreHiddenBy_ClickOnPlusSignIn_FilterSection();			
	}
	
	@Test(priority=40204, description="TC_4_2_03 Check whether the filters are displayed by clicking the + sign in filter section")
	public void TC_4_2_03_Customer_Checkfiltersaredisplayedbyclicking_plussign() throws IOException {			
		ExtentTestManager.getTest().setDescription("Check whether the filters are displayed by clicking the + sign in filter section");		
		CR.check_FiltersAreDisplayedBy_ClickOnPlusSignIn_FilterSection();			
	}
	
	@Test(priority=40205, description="TC_4_2_04 Check the dropdown options next to search results count")
	public void TC_4_2_04_Customer_Checkdropdownoptionsnexttosearchresultscount() throws IOException {			
		ExtentTestManager.getTest().setDescription("Check the dropdown options next to search results count");
		CR.check_DropdownOptions_NextToSearchResults_Count();		
	}
	
	@Test(priority=40206, description="TC_4_2_05 Check the Most viewed option")
	public void TC_4_2_05_Customer_CheckMostviewedoption() throws IOException {			
		ExtentTestManager.getTest().setDescription("Check the Most viewed option");
		CR.check_MostViewed_dropdownOption();		
	}
	
	@Test(priority=40207, description="TC_4_2_06 Check the Recently Added option")
	public void TC_4_2_06_Customer_CheckRecentlyAddedoption() throws IOException {			
		ExtentTestManager.getTest().setDescription("Check the Recently Added option");
		CR.check_RecentlyAdded_dropdownOption();		
	}
	
	@Test(priority=40208, description="TC_4_2_07 Check whether the correct results are displayed for Accept Online Payments")
	public void TC_4_2_07_Customer_CheckOnlinePaymentcheckbox() throws IOException {			
		ExtentTestManager.getTest().setDescription("Check whether the correct results are displayed for Accept Online Payments");
		CR.ChecksearchresultforAcceptOnlinePayments();		
	}
	
	@Test(priority=40209, description="TC_4_2_08 Check whether the correct results are displayed for Accept Cash On Service")
	public void TC_4_2_08_Customer_CheckAcceptCashOnServicecheckbox() throws IOException {			
		ExtentTestManager.getTest().setDescription("Check whether the correct results are displayed for Accept Cash On Service");
		CR.ChecksearchresultforAcceptOnlinePayments();		
	}
	
	@Test(priority=40210, description="TC_4_2_09 Check whether the correct results are displayed for Search Promotions")
	public void TC_4_2_09_Customer_CheckSearchPromotionscheckbox() throws IOException {			
		ExtentTestManager.getTest().setDescription("Check whether the correct results are displayed for Search Promotions");
		CR.checksearchresultsdisplayedforPromotions();		
	}
	
	@Test(priority=40211, description="TC_4_2_10 Check whether the correct results are displayed for Search Jobs")
	public void TC_4_2_10_Customer_CheckSearchJobscheckbox() throws IOException {			
		ExtentTestManager.getTest().setDescription("Check whether the correct results are displayed for Search Jobs");
		CR.checksearchresultsdisplayedforSearchJobs();		
	}*/
	
	/*@Test(priority=40211, description="TC_4_2_11 Check whether the correct results are displayed when selecting all 4 filters")
	public void TC_4_2_11_Customer_CheckAllFilterscheckboxs() throws IOException {			
		ExtentTestManager.getTest().setDescription("Check whether the correct results are displayed when selecting all 4 filters");
		CR.checksearchresultsdisplayed_SellectingAllFilters();		
	}*/
	
	@Test(priority=40212, description="TC_4_2_12 Check whether the correct results are displayed for services filter")
	public void TC_4_2_11_Customer_CheckAnyoneServicescheckboxs() throws IOException {			
		ExtentTestManager.getTest().setDescription("Check whether the correct results are displayed for services filter");
		CR.check_CorrectResults_DisplayedFor_ServicesFilters();		
	}

}
