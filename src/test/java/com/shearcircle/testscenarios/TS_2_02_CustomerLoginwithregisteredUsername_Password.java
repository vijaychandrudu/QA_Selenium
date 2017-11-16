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

public class TS_2_02_CustomerLoginwithregisteredUsername_Password extends StaticVariables {
	public String TestDataPath;
	public Customer_Module_Page_Components CR;
	public CommonFunctions cfn;
	public static WebDriver driver;
	
	public TS_2_02_CustomerLoginwithregisteredUsername_Password() throws IOException, InterruptedException{
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
	
	@Test(priority=0, description="TC_001 Customer visits ShearCircle page" )
	public void TC_001_Customer_visitsShearCircle() throws IOException {			
		CR.ShearCircle_LaunchApplication();			
	}
	
	@Test(priority=1, description="TC_002 Customer clicks Login on ShearCircle home page " )
	public void TC_002_Customer_clicks_JoinOurCircleButton() throws IOException {			
		CR.ShearCircle_Click_Login_OR_JoinOurCircle("Click_Login");			
	}
	
	@Test(priority=2, description="TC_003 Customer Login with registered Username(Email id) & Password " )
	public void TC_003_Customer_CheckRegisterWithShearCirclepage() throws IOException {			
		CR.ShearCircle_Customer_Login_valid_invalid_combination("Enter_Valid_EmailandPassword");			
	}
	
	@Test(priority=3, description="TC_004 Customer checks dashboard page and clicks Logout from dashboard " )
	public void TC_004_Customer_CheckcheckDashboardpageandLogout() throws IOException {			
		CR.Customer_JoinOurCircle_LogOutpage();			
	}
	

}
