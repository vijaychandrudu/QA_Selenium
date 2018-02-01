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
	
		
	

}
