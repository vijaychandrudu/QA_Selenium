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

public class TS_3_03_CustomerClicksonMyappointments extends StaticVariables {
	public String TestDataPath;
	public Customer_Module_Page_Components CR;
	public CommonFunctions cfn;
	public static WebDriver driver;
	
	public TS_3_03_CustomerClicksonMyappointments() throws IOException, InterruptedException{
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
	@Test(priority=3, description="TC_3_3_001 Check the info in My Appointments for first time login/ without creating any bookings")
	public void TC_3_3_01_Customer_CheckMyAppointmentsFirsttimelogin_Or_Withoutadding() throws IOException {			
		CR.shearCircle_Verify_Customer_Clickson_MyAppoinments_firsttime_Login();			
	}
	
	@Test(priority=4, description="TC_3_2_002 Check the info in My Favorite where Salons are already added as Favorites")
	public void TC_3_3_02_Customer_CheckMyAppointmentsalreadyAdded() throws IOException {			
		CR.shearCircle_Verify_Customer_Clickson_MyAppoinmentsforExistingUser();			
	}	
	
	

}
