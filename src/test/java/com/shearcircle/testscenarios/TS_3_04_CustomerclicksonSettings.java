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

public class TS_3_04_CustomerclicksonSettings extends StaticVariables {
	public String TestDataPath;
	public Customer_Module_Page_Components CR;
	public CommonFunctions cfn;
	public static WebDriver driver;
	
	public TS_3_04_CustomerclicksonSettings() throws IOException, InterruptedException{
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
	
	@AfterClass
	public void logOut(){
		CR.Customer_JoinOurCircle_LogOutpage();
	}
	
	@Test(priority=30401, description="Customer visits ShearCircle page" )
	public void TC_3_4_1_Customer_visitsShearCircle() throws IOException {	
		ExtentTestManager.getTest().setDescription("Customer visits ShearCircle page");
		CR.ShearCircle_LaunchApplication();			
	}
	
	@Test(priority=30402, description="Customer clicks Login Button " )
	public void TC_3_4_2Customer_clicks_JoinOurCircleButton() throws IOException {	
		ExtentTestManager.getTest().setDescription("Customer clicks JoinOurCircle Button.");
		CR.ShearCircle_Click_Login_OR_JoinOurCircle("Click_Login");			
	}
	
	@Test(priority=30403, description="Customer Login with registered Username(Email id) & Password " )
	public void TC_3_4_3Customer_CheckRegisterWithShearCirclepage()throws IOException {	
		ExtentTestManager.getTest().setDescription("Customer Login with registered Username(Email id) & Password .");
		CR.ShearCircle_Customer_Login_valid_invalid_combination("Enter_Valid_EmailandPassword");			
	}
	@Test(priority=30404, description="TC_3_4_01 Check the info in Settings page")
	public void TC_3_4_01_Customer_ChecktheInfoinSettingspage() throws IOException {			
		ExtentTestManager.getTest().setDescription("Check the info in Settings page");			
		CR.verify_PrepopulatedvaluesinSettingspage();
	}
	@Test(priority=30405, description="TC_3_4_02 Check if the Cancel button is clickable in settings page")
	public void TC_3_4_02_Customer_CheckCancelButtonClickable() throws IOException {			
		ExtentTestManager.getTest().setDescription("Check the info in Settings page");
		CR.check_CancelButton_IsClickable();			
	}
	
	@Test(priority=30406, description="TC_3_4_03 Check the My dashboard Settings pagefield validation with entering invalid data")
	public void TC_3_4_03_Customer_CheckCheckFieldValidation() throws IOException {			
		ExtentTestManager.getTest().setDescription("Check the My dashboard Settings pagefield validation with entering invalid data");		
		CR.check_SettingsPageField_Validation_withInvaliddata();			
	}
	
	@Test(priority=30407, description="TC_3_4_04 Check the My dashboard Settings page mandatory fields with out entering data")
	public void TC_3_4_04_Customer_Checkmandatoryfields() throws IOException {			
		ExtentTestManager.getTest().setDescription("Check the My dashboard Settings page mandatory fields with out entering data");
		CR.check_MandatoryFieldsinSettingsPage();		
	}
	
	@Test(priority=30408, description="TC_3_4_05 Check whether Change Password link is clickable")
	public void TC_3_4_05_Customer_CheckChangePasswordlinkClickable() throws IOException {			
		ExtentTestManager.getTest().setDescription("Check whether Change Password link is clickable");
		CR.checkWhether_ChangePassword_LinkIs_Clickable();			
	}
	
	@Test(priority=30409, description="TC_3_4_06 Check whether the password can be updated without entering any data")
	public void TC_3_4_06_Customer_Checkpasswordupdatedwithoutenteringdata() throws IOException {			
		ExtentTestManager.getTest().setDescription("Check whether the password can be updated without entering any data");
		CR.check_WhetherThePassword_CanbeUpdated_WithOut_EnteringAnyData();			
	}
	
	@Test(priority=30410, description="TC_3_4_07 Check whether the password can be updated by entering new password less than 6 characters/spaces")
	public void TC_3_4_07_Customer_CheckPasswordwithlessthan6charsorspaces() throws IOException {			
		ExtentTestManager.getTest().setDescription("Check whether the password can be updated by entering new password less than 6 characters/spaces");
		CR.enteringNew_PasswordLessThan_SixCharacters_Or_Spaces("Enter_NewPwdLessThan6chars");
		CR.enteringNew_PasswordLessThan_SixCharacters_Or_Spaces("Enter_NewPwddWithspaces");
	}
	
	@Test(priority=30411, description="TC_3_4_08 Check whether password can be updated by entering valid data")
	public void TC_3_4_08_Customer_Checkpasswordupdatedwithvaliddata() throws IOException {			
		ExtentTestManager.getTest().setDescription("Check whether password can be updated by entering valid data");
		CR.password_CanBeUpdatedBy_Entering_ValidData();		
	}
	
	@Test(priority=30412, description="TC_3_4_09 Check whether the Cancel button is clickable in Secure password change page")
	public void TC_3_4_09_Customer_CheckCancelButtonclickable() throws IOException {			
		ExtentTestManager.getTest().setDescription("Check whether the Cancel button is clickable in Secure password change page");
		CR.verify_Cancel_Button_IsClickable_Changepasswordpage();		
	}
	

}
