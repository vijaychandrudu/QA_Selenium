package com.shearcircle.testscenarios;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.shearcircle.pagecomponents.Customer_Module_Page_Components;
import com.shearcircle.utilities.CommonFunctions;
import com.shearcircle.utilities.StaticVariables;

public class TS_2_10_CustomerLoginwithGoogleuserwithregisteredShearCircle extends StaticVariables {
	public String TestDataPath;
	public Customer_Module_Page_Components CR;
	public CommonFunctions cfn;
	public static WebDriver driver;
	
	public TS_2_10_CustomerLoginwithGoogleuserwithregisteredShearCircle() throws IOException, InterruptedException{
		cfn = new CommonFunctions();		
	}
		
	@BeforeClass
	@Parameters("browser")
	public void beforeclass(@Optional("chrome") String browser) throws IOException, InterruptedException {
		TestDataPath = cfn.TestDataPathOf("CustomerTestData.properties");
		Browser = browser;
		cfn.getAndOpenBrowser(browser);		
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
	public void afterClass() {
		driver.quit();
	}
	
	@Test(priority=21001, description="TC_2_10_01 Customer visits ShearCircle page" )
	public void TC_2_10_01_Customer_visitsShearCircle() throws IOException {			
		CR.ShearCircle_LaunchApplication();			
	}
	
	@Test(priority=21002, description="TC_2_10_02 Customer clicks Login on ShearCircle home page " )
	public void TC_2_10_02_Customer_clicks_JoinOurCircleButton() throws IOException {			
		CR.ShearCircle_Click_Login_OR_JoinOurCircle("Click_Login");			
	}
	
	@Test(priority=21003, description="TC_2_10_03 Customer clicks on Login with Google button" )
	public void TC_2_10_03_CustomerclicksonLoginwithFacebookbutton() throws IOException {			
		CR.Click_DoNotHaveAccountjoinourcircle_Loginwith_FaceBook_Google_Bottons("Click_LoginwithGoogle");		
	}
	
	@Test(priority=21004, description="TC_2_10_04  Customer Login with Google user credentials with which they have registered with ShearCircle " )
	public void TC_2_10_03_CustomerLoginwithGoogleuserwithregisteredSC() throws IOException {			
		CR.Click_Login_Google_Button();		
	}
	
	@Test(priority=21005, description="TC_2_10_05 Customer checks dashboard page and clicks Logout from dashboard" )
	public void TC_2_10_05_Customer_CheckcheckDashboardpageandLogout() throws IOException {			
		CR.Customer_JoinOurCircle_LogOutpage();	
	}
}
