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

public class TS_2_11_CustomerLoginwithGoogleuserwithnotregisteredShearCircle extends StaticVariables {
	public String TestDataPath;
	public Customer_Module_Page_Components CR;
	public CommonFunctions cfn;
	public static WebDriver driver;
	
	public TS_2_11_CustomerLoginwithGoogleuserwithnotregisteredShearCircle() throws IOException, InterruptedException{
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
	
	@Test(priority=21101, description="TC_2_11_01 Customer visits ShearCircle page" )
	public void TC_2_11_01_Customer_visitsShearCircle() throws IOException {			
		CR.ShearCircle_LaunchApplication();			
	}
	
	@Test(priority=21102, description="TC_2_11_02 Customer clicks Login on ShearCircle home page " )
	public void TC_2_11_02_Customer_clicks_JoinOurCircleButton() throws IOException {			
		CR.ShearCircle_Click_Login_OR_JoinOurCircle("Click_Login");			
	}
	
	@Test(priority=21103, description="TC_2_11_03 Customer clicks on Login with Google button" )
	public void TC_2_11_03_CustomerclicksonLoginwithFacebookbutton() throws IOException {			
		CR.Click_DoNotHaveAccountjoinourcircle_Loginwith_FaceBook_Google_Bottons("Click_LoginwithGoogle");		
	}
	
	@Test(priority=21104, description="TC_2_11_04  Customer Login with Google user credentials with which they have registered with ShearCircle " )
	public void TC_2_11_03_CustomerLoginwithGoogleuserwithnotregisteredSC() throws IOException {			
		CR.customer_LoginwithGoogle_not_Registeredwith_ShearCircle();		
	}
	
	}
