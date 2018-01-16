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

public class TS_5_01_CustomervisitsBusinessPage extends StaticVariables {
	public String TestDataPath;
	public Customer_Module_Page_Components CR;
	public CommonFunctions cfn;
	public static WebDriver driver;
	
	public TS_5_01_CustomervisitsBusinessPage() throws IOException, InterruptedException{
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
	
	@Test(priority=50101, description="Customer visits ShearCircle page" )
	public void Customer_visitsShearCircle() throws IOException {	
		ExtentTestManager.getTest().setDescription("Customer visits ShearCircle page");
		CR.ShearCircle_LaunchApplication();			
	}
	
	@Test(priority=50102, description="Invoke the search results page")
	public void Customer_Invokesearchresultspage() throws IOException {			
		ExtentTestManager.getTest().setDescription("Invoke the search results page");	
		//CR.checkThe_Locate_Button();
		CR.invokeTO_SearcResults_Page();
	}
	@Test(priority=50103, description="TC_5_1_01 Invoke the Business Page and verify Business page elements")
	public void TC_5_1_01_Customer_InvokeBusinesspage() throws IOException {			
		ExtentTestManager.getTest().setDescription("Invoke the Business Page and verify Business page elements");
		CR.Verify_business_Page_Field_Validation();			
	}
	
	@Test(priority=50104, description="TC_5_1_02 Check Add to Favorite button without login as Customer")
	public void TC_5_1_02_Customer_CheckAddtoFavoritbuttonwithoutloginasCustomer() throws IOException {			
		ExtentTestManager.getTest().setDescription("Check Add to Favorite button without login as Customer");		
		CR.Verify_AddtoFavourite_Button_without_Login_Customer();			
	}
	
	@Test(priority=50105, description="Customer clicks Login Button " )
	public void Customer_clicks_JoinOurCircleButton() throws IOException {			
		CR.ShearCircle_Click_Login_OR_JoinOurCircle("Click_Login");			
	}
	
	@Test(priority=50106, description="Customer Login with registered Username(Email id) & Password " )
	public void Customer_LoginwithCustomer() throws IOException {			
		CR.ShearCircle_Customer_Login_valid_invalid_combination("Enter_Valid_EmailandPassword");			
	}
	
	@Test(priority=50107, description="TC_5_1_03 Check Add to Favorite button after login as Customer")
	public void TC_5_1_03_Customer_CheckAddtoFavoritbuttonAfterloginasCustomer() throws IOException {			
		ExtentTestManager.getTest().setDescription("Check Add to Favorite button without login as Customer");		
		CR.Verify_AddtoFavourite_Button_with_Login_Customer();			
	}
	
	@Test(priority=50108, description="Check whether the Logout button is clickable")
	public void CheckLogoutbuttonclickable()throws IOException {			
		CR.Customer_JoinOurCircle_LogOutpage();
	}
	@Test(priority=50109, description="TC_5_1_04 Check whether Marked as Favorite button is displayed after logout")
	public void TC_5_1_04_Customer_CheckMarkedasFavoritebutton_displayedafterlogout() throws IOException {			
		ExtentTestManager.getTest().setDescription("Check whether Marked as Favorite button is displayed after logout");		
		CR.Verify_AddtoFavourite_Button_after_Logout();			
	}
	
	@Test(priority=50110, description="Customer Login with registered Username(Email id) & Password " )
	public void Customer_LoginwithCustomer1() throws IOException {
		CR.ShearCircle_Click_Login_OR_JoinOurCircle("Click_Login");	
		CR.ShearCircle_Customer_Login_valid_invalid_combination("Enter_Valid_EmailandPassword");			
	}
	
	@Test(priority=50111, description="TC_5_1_05 Check whether the salon can be removed from Favorites")
	public void TC_5_1_05_Customer_Checksalon_removedfromFavorites() throws IOException {			
		ExtentTestManager.getTest().setDescription("Check whether the salon can be removed from Favorites");		
		CR.Verify_Salon_Removed_From_Favourites();			
	}
	
	@Test(priority=50112, description="TC_5_1_06 Check the details in Services Tab")
	public void TC_5_1_06_Customer_Check_subServicesinServicesTab() throws IOException {			
		ExtentTestManager.getTest().setDescription("Check the details in Services Tab");		
		CR.Customer_Check_Services_Tab_subServirce_Category();			
	}
	
	@Test(priority=50113, description="TC_5_1_07 Check the info in Overview tab")
	public void TC_5_1_07_Customer_Check_detailsinOverviewTab() throws IOException {			
		ExtentTestManager.getTest().setDescription("Check the info in Overview tab");		
		CR.Verify_information_in_Overview_tab();			
	}	

}
