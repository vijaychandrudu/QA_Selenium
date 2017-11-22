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

public class TS_3_01_Customerlogintocustomerdashboardforthefirsttime extends StaticVariables {
	public String TestDataPath;
	public Customer_Module_Page_Components CR;
	public CommonFunctions cfn;
	public static WebDriver driver;
	
	public TS_3_01_Customerlogintocustomerdashboardforthefirsttime() throws IOException, InterruptedException{
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
	
	@Test(priority=0, description="Customer visits ShearCircle page" )
	public void TC_001_Customer_visitsShearCircle() throws IOException {			
		CR.ShearCircle_LaunchApplication();			
	}
	
	@Test(priority=1, description="Customer clicks Login Button " )
	public void Customer_clicks_JoinOurCircleButton() throws IOException {			
		CR.ShearCircle_Click_Login_OR_JoinOurCircle("Click_Login");			
	}
	
	@Test(priority=2, description="Customer Login with registered Username(Email id) & Password " )
	public void Customer_CheckRegisterWithShearCirclepage() throws IOException {			
		CR.ShearCircle_Customer_Login_valid_invalid_combination("Enter_Valid_EmailandPassword");			
	}
	@Test(priority=3, description="TC_3_1_001 Customer checks Dashboard page field validation")
	public void TC_3_1_01_Customer_CheckDashboardfieldsvalidation() throws IOException {			
		CR.shearCircle_Verify_Customer_Dashboard_VieldValidation();			
	}
	
	@Test(priority=4, description="TC_3_1_002 Customer Check whether My Favorite is clickable")
	public void TC_3_1_02_Customer_CheckMyFavouritesclickable() throws IOException {			
		CR.shearCircle_Verify_Customer_Dashboard_clickson_MyFavourites();			
	}
	

}
