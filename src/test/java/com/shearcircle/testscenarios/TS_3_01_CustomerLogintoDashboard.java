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

public class TS_3_01_CustomerLogintoDashboard extends StaticVariables {
	public String TestDataPath;
	public Customer_Module_Page_Components CR;
	public CommonFunctions cfn;
	public static WebDriver driver;
	
	public TS_3_01_CustomerLogintoDashboard() throws IOException, InterruptedException{
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

	@AfterTest
	public void afterTest() {
		driver.quit();
	}	
		
	@Test(priority=3101, description="Customer visits ShearCircle page" )
	public void TC_3_1_1_Customer_visitsShearCircle() throws IOException {			
		CR.ShearCircle_LaunchApplication();			
	}
	
	@Test(priority=3102, description="Customer clicks Login Button " )
	public void TC_3_1_2_Customer_clicks_JoinOurCircleButton() throws IOException {			
		CR.ShearCircle_Click_Login_OR_JoinOurCircle("Click_Login");			
	}
	
	@Test(priority=3103, description="Customer Login with registered Username(Email id) & Password " )
	public void TC_3_1_3_Customer_CheckRegisterWithShearCirclepage() throws IOException {			
		CR.ShearCircle_Customer_Login_valid_invalid_combination("Enter_Valid_EmailandPassword");			
	}
	@Test(priority=3104, description="TC_3_1_01 Customer checks Dashboard page field validation")
	public void TC_3_1_01_Customer_CheckDashboardfieldsvalidation() throws IOException {			
		CR.shearCircle_Verify_Customer_Dashboard_fieldValidation();			
	}
	
	@Test(priority=3105, description="TC_3_1_02 Customer Check whether My Favorite is clickable")
	public void TC_3_1_02_Customer_CheckMyFavouritesclickable() throws IOException {			
		CR.shearCircle_Verify_Customer_Dashboard_clickson_MyFavourites();			
	}
	@Test(priority=3106, description="TC_3_1_03 Customer Check whether My Appointments is clickable")
	public void TC_3_1_03_Customer_CheckMyAppointmentsclickable() throws IOException {			
		CR.shearCircle_Verify_Customer_Clickson_MyAppoinments();			
	}
	@Test(priority=3107, description="TC_3_1_04 Customer Check whether Settings is clickable")
	public void TC_3_1_04_Customer_CheckSettingsclickable() throws IOException {			
		CR.shearCircle_Verify_Customer_Clickson_Settings();			
	}
	
	@Test(priority=3108, description="TC_3_1_05 Customer Check whether My Account button is clickable")
	public void TC_3_1_05_Customer_CheckMyAccountbuttonisclickable() throws IOException {			
		CR.shearCircle_Verify_Customer_Myaccount_Buttonis_Clickable("My Favorites");
		CR.shearCircle_Verify_Customer_Myaccount_Buttonis_Clickable("My Appointments");
		CR.shearCircle_Verify_Customer_Myaccount_Buttonis_Clickable("Settings");
	}
	
	@Test(priority=3109, description="TC_3_1_06 Check whether Change Profile Picture button is clickable")
	public void TC_3_1_06_Customer_CheckChangeProfilePicturebuttonclickable()throws IOException {			
		CR.shearCircle_Customer_Verify_Change_Profile_Picture_Buttonis_Clickable();	
	}
	
	@Test(priority=3112, description="TC_3_1_09 Check whether Change Profile Picture button is clickable")
	public void TC_3_1_09_CheckSearchbuttonclickable()throws IOException {			
		CR.shearCircle_Verify_Customer_Search_Button_IsClickable();	
	}
	
	@Test(priority=3113, description="TC_3_1_10 Check whether the Logout button is clickable")
	public void TC_3_1_10_CheckLogoutbuttonclickable()throws IOException {			
		CR.Customer_JoinOurCircle_LogOutpage();
	}

}
