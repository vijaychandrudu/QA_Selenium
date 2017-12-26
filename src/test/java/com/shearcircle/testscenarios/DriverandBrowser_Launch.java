package com.shearcircle.testscenarios;

import org.testng.annotations.Test;


import com.shearcircle.objectrepository.Customer_Module_Page_Objects;
import com.shearcircle.pagecomponents.Customer_Module_Page_Components;
import com.shearcircle.utilities.CommonFunctions;
import com.shearcircle.utilities.StaticVariables;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;

public class DriverandBrowser_Launch extends StaticVariables {
	public String TestDataPath;
	public Customer_Module_Page_Components CR;
	public CommonFunctions cfn;
	public static WebDriver driver;
	
	public DriverandBrowser_Launch() throws IOException, InterruptedException{
		cfn = new CommonFunctions();
		//CR = new Customer_Module_Page_Components();	
	}
		
	@BeforeTest
	@Parameters("browser")
	public void beforeTest(@Optional("chrome") String browser) throws IOException, InterruptedException {
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

	@AfterTest
	public void afterTest() {
		driver.quit();		
	}	
	
	/*@Test(priority=0, description="ShearCircle Launchbowser Application.")
	public void goToApplication() throws IOException{	
		//ExtentTestManager.getTest().setDescription("ShearCircle Launchbowser Application.");
		CR.ShearCircle_LaunchApplication();		
	}*/
			
	/*@Test(priority=1, description="1.1 Scenario: Customer visits ShearCircle and Customer clicks JoinOurCircle" )
	public void Customer_visitsShearCircle_clicks_JoinOurCircle() throws IOException {			
		CR.ShearCircle_LaunchApplication();
		CR.ShearCircle_Click_Login_OR_JoinOurCircle("Click_JoinOurCircle");		
	}
	
	@Test(priority=2, description="1.2 Scenario: Scenario: Customer clicks on Join Our Circle button on Are you a Customer?" )
	public void Customer_clicksonJoinOurCirclebuttononAreyouaCustomer() throws IOException {		
		CR.ShearCircle_Click_Customer_OR_Professional_JoinOurCircle("Click_CustomerJoinCircle");
		CR.ShearCircle_Verify_Customer_Registrationform_Fieldvalidation();
	}	
	
	@Test(priority=4, description="1.3 Scenario: Scenario: Customer clicks on Join Our Circle button after entering valid details"
			+ " and accepting the terms of service, privacy policy & billing agreement. " )
	public void Customer_clicksonJoinOurCirclebuttonafterenteringvaliddetails() throws IOException {			
		CR.ShearCircle_Customer_Registrationwithvaliddata();
	}
	
	@Test(priority=5, description="1.5 Scenario: Scenario: Customer clicks on Join Our Circle button after entering invalid details "
			+ "and accepting the terms of service, privacy policy & billing agreement. " )
	public void Customer_clicksonJoinOurCirclebuttonafterenteringInvaliddetails() throws IOException {			
		CR.ShearCircle_Customer_Registrationwithinvaliddata();
	}
	
	@Test(priority=6, description="1.6 Scenario: Scenario: Customer clicks on Join Our Circle button after entering valid details "
			+ "and without accepting the terms of service, privacy policy & billing agreement." )
	public void Customer_clicksonJoinOurCirclebuttonafterenteringvaliddetailswithoutacceptingTandC() throws IOException {			
		CR.ShearCircle_Customer_Registrationwithvaliddata_without_termsofservice();
	}
	
	@Test(priority=7, description="1.7 Scenario: Scenario: Customer clicks on the hyperlinks in Customer Registration page.")
	public void Customer_clicksonthehyperlinksinCustomerRegistrationpage() throws IOException {			
		CR.ShearCircle_Verify_Customer_Registrationform_HyperLynks();
	}

	@Test(priority=8, description="2.1 Scenario: Scenario: Customer clicks Login on ShearCircle home page.")
	public void Customer_clicksLoginonShearCirclehomepage() throws IOException {		
		CR.ShearCircle_LaunchApplication();
		CR.ShearCircle_Click_Login_OR_JoinOurCircle("Click_Login");
		CR.ShearCircle_Verify_Customer_Login_page_Filed_validation();	
	}	
	
	@Test(priority=9, description="2.3 Scenario: Scenario: Customer Login with invalid Username(Email id) & valid Password." )
	public void Customer_LoginwithInvalidUsernameandvalidPassword() throws IOException {		
		//CR.ShearCircle_LaunchApplication();
		CR.ShearCircle_Click_Login_OR_JoinOurCircle("Click_Login");
		CR.ShearCircle_Customer_Login_valid_invalid_combination("Enter_Invalid_EmailandValidPassword");		
	}
	@Test(priority=10, description="2.4 Scenario: Scenario: Customer Login with valid Username(Email id) & invalid Password." )
	public void Customer_LoginwithvalidUsernameandInvalidPassword() throws IOException {		
		//CR.ShearCircle_LaunchApplication();
		CR.ShearCircle_Click_Login_OR_JoinOurCircle("Click_Login");
		CR.ShearCircle_Customer_Login_valid_invalid_combination("Enter_Valid_EmailandInvalid_Password");		
	}
	@Test(priority=11, description="2.5 Scenario: Scenario: Customer clicks on Sign in button without entering Username & Password." )
	public void  Customer_clicksonSigninbuttonwithoutenteringUsernameandPassword() throws IOException {		
		CR.ShearCircle_LaunchApplication();
		CR.ShearCircle_Click_Login_OR_JoinOurCircle("Click_Login");
		CR.ShearCircle_Customer_Login_valid_invalid_combination("Enter_without_EmailandPassword");		
	}
	@Test(priority=12, description="2.12 Scenario: Scenario: Customer clicks on Join Now/Join Our Circle link." )
	public void Customer_DonthaveAccountyet_JoinOurCircle_Loginpage() throws IOException {		
		//CR.ShearCircle_LaunchApplication();
		CR.ShearCircle_Click_Login_OR_JoinOurCircle("Click_Login");
		CR.DonthaveAccountyet_JoinOurCircle_Loginpage();		
	}
	
	@Test(priority=13, description="2.2 Scenario: Scenario: Customer Login with registered Username(Email id) & Password." )
	public void Customer_LoginwithregisteredUsernameandPassword() throws IOException {		
		//CR.ShearCircle_LaunchApplication();
		CR.ShearCircle_Click_Login_OR_JoinOurCircle("Click_Login");
		CR.ShearCircle_Customer_Login_valid_invalid_combination("Enter_Valid_EmailandPassword");
		CR.Customer_JoinOurCircle_LogOutpage();
	}
	
	@Test(priority=14, description="2.6 Scenario: Customer clicks on Login with Facebook button." )
	public void Customer_clicksonLoginwithFacebook() throws IOException {		
		CR.ShearCircle_LaunchApplication();
		CR.ShearCircle_Click_Login_OR_JoinOurCircle("Click_Login");
		CR.Click_DoNotHaveAccountjoinourcircle_Loginwith_FaceBook_Google_Bottons("Click_LoginwithFaceBook");		
	}
	
	@Test(priority=15, description="2.7 Scenario: Customer Login with Facebook user credentials with which they have registered with ShearCircle." )
	public void Customer_clicksonLoginwithFacebookusercredentialsregisteredwithShearCircle() throws IOException {			
		CR.Customer_LoginwithFacebook();
		CR.Customer_JoinOurCircle_LogOutpage();
	}
	
	@Test(priority=16, description="2.6 Scenario: Customer clicks on Login with Facebook button." )
	public void Customer_clicksonLoginwithFacebook1() throws IOException {		
		CR.ShearCircle_LaunchApplication();
		CR.ShearCircle_Click_Login_OR_JoinOurCircle("Click_Login");
		CR.Click_DoNotHaveAccountjoinourcircle_Loginwith_FaceBook_Google_Bottons("Click_LoginwithFaceBook");
		
	}
	
	@Test(priority=17, description="2.8 Scenario: Customer Login with Facebook user credentials that is not registered with ShearCircle." )
	public void Customer_clicksonLoginwithFacebookusercredentialswithoutregisteredwithShearCircle() throws IOException {		
		
		CR.Customer_LoginwithFacebook_not_registerewith_ShearCircle();		
	}
	
	@Test(priority=18, description="2.9 Scenario: Customer clicks on Login with Google button." )
	public void Customer_clicksonLoginwithGoogle1() throws IOException {		
		CR.ShearCircle_LaunchApplication();
		CR.ShearCircle_Click_Login_OR_JoinOurCircle("Click_Login");
		CR.Click_DoNotHaveAccountjoinourcircle_Loginwith_FaceBook_Google_Bottons("Click_LoginwithGoogle");
		
	}
	
	@Test(priority=19, description="2.10 Scenario: Customer Login with Google user credentials with which they have registered with ShearCircle")
	public void Customer_clicksonLoginwithGoogleusercredentialswithregisteredwithShearCircle() throws IOException {			
		CR.Click_Login_Google_Button();
		CR.Customer_JoinOurCircle_LogOutpage();
	}
	
	@Test(priority=20, description="2.9 Scenario: Customer clicks on Login with Google button.")
	public void Customer_clicksonLoginwithGoogle() throws IOException {		
		CR.ShearCircle_LaunchApplication();
		CR.ShearCircle_Click_Login_OR_JoinOurCircle("Click_Login");
		CR.Click_DoNotHaveAccountjoinourcircle_Loginwith_FaceBook_Google_Bottons("Click_LoginwithGoogle");		
	}
	
	@Test(priority=21, description="2.11 Scenario: Customer Login with Google user credentials that is not registered with ShearCircle" )
	public void Customer_clicksonLoginwithGoogleusercredentialswithoutregisteredwithShearCircle() throws IOException {				
		CR.customer_LoginwithGoogle_not_Registeredwith_ShearCircle();
	}
	
	
	@Test(priority=22, description="2.12 Scenario: Customer clicks on Join Now/Join Our Circle link")
	public void Customer_Click_DoNotHaveAccountjoinourcircle() throws IOException {		
		CR.ShearCircle_LaunchApplication();
		CR.ShearCircle_Click_Login_OR_JoinOurCircle("Click_Login");
		CR.Click_DoNotHaveAccountjoinourcircle_Loginwith_FaceBook_Google_Bottons("Click_Donthaveaccount_JoinOurCircle");
		
	}
	
	@Test(priority=23,description="2.14 Scenario: Customer Resets password with valid Username")
	public void Customer_ResetspasswordwithvalidUsername() throws IOException {			
		CR.ShearCircle_Verify_Customer_forgotPassword("Valid", "Click Send instructions to reset password");		
	}
	
	
	@Test(priority=24,description="2.17 Scenario: Customer clicks Cancel in Reset Password page.")
	public void Customer_clicks_CancelinResetPasswordpage() throws IOException {				
		CR.ShearCircle_Verify_Customer_forgotPassword("Valid", "Click Cancel");
	}
	
	@Test(priority=24, description="Customer ForgotPassword Invalid_EmailId_ClickSendinstructionstoresetpassword.")
	public void Customer_ForgotPassword_Invalid_EmailId_ClickSendinstructionstoresetpassword() throws IOException {				
		CR.ShearCircle_Verify_Customer_forgotPassword("InValid", "Click Send instructions to reset password");
	}
	
	@Test(priority=25, description="Customer_ForgotPassword_Invalid_EmailId_ClickCancel")
	public void Customer_ForgotPassword_Invalid_EmailId_ClickCancel() throws IOException {				
		CR.ShearCircle_Verify_Customer_forgotPassword("InValid", "Click Cancel");	
	}*/	

	
}
