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
	public void TC_4_2_1_Customer_visitsShearCircle() throws IOException {	
		ExtentTestManager.getTest().setDescription("Customer visits ShearCircle page");
		CR.ShearCircle_LaunchApplication();			
	}
	
	@Test(priority=50102, description="TC_4_2_01 Invoke the search results page")
	public void TC_4_2_01_Customer_Invokesearchresultspage() throws IOException {			
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
	
	@Test(priority=50105, description="TC_5_1_03 Check Add to Favorite button after login as Customer")
	public void TC_5_1_03_Customer_CheckAddtoFavoritbuttonAfterloginasCustomer() throws IOException {			
		ExtentTestManager.getTest().setDescription("Check Add to Favorite button without login as Customer");		
		CR.Verify_AddtoFavourite_Button_with_Login_Customer();			
	}
	
	@Test(priority=50106, description="TC_5_1_04 Check whether Marked as Favorite button is displayed after logout")
	public void TC_5_1_04_Customer_CheckMarkedasFavoritebutton_displayedafterlogout() throws IOException {			
		ExtentTestManager.getTest().setDescription("Check whether Marked as Favorite button is displayed after logout");		
		CR.Verify_AddtoFavourite_Button_after_Logout();			
	}
	
	
	

}
