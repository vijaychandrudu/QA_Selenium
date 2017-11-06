package com.shearcircle.testscenarios;

import org.testng.annotations.Test;


import com.shearcircle.objectrepository.Customer_Module_Page_Objects;
import com.shearcircle.pagecomponents.Customer_Module_Page_Components;
import com.shearcircle.utilities.CommonFunctions;
import com.shearcircle.utilities.StaticVariables;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
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

public class CustomerModule extends StaticVariables {
	public String TestDataPath;
	public Customer_Module_Page_Components CR;
	public CommonFunctions cfn;
	public static WebDriver driver;
	
	public CustomerModule() throws IOException, InterruptedException{
		cfn = new CommonFunctions();
		//CR = new Customer_Module_Page_Components();	
	}
		
	@BeforeClass
	@Parameters("browser")
	public void beforeclass(@Optional("chrome") String browser) throws IOException, InterruptedException {
		TestDataPath = cfn.TestDataPathOf("CustomerTestData.properties");
		Browser = browser;
		cfn.getAndOpenBrowser(browser);		
		driver = cfn.getDriver();		
		CR = new Customer_Module_Page_Components(driver);
		System.out.println(driver.getWindowHandles());
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
	
	@Test(priority=0, description="ShearCircle Launchbowser Application.")
	public void goToApplication() throws IOException{	
		//ExtentTestManager.getTest().setDescription("ShearCircle Launchbowser Application.");
		CR.ShearCircle_LaunchApplication();		
	}
	
	@Test(priority=1,description="Customer ForgotPassword Valid EmailId Click Sendinstructionstoresetpassword.")
	public void Customer_ForgotPassword_Valid_EmailId_ClickSendinstructionstoresetpassword() throws IOException {			
		CR.ShearCircle_Verify_Customer_forgotPassword("Valid", "Click Send instructions to reset password");
		/*CR.ShearCircle_Verify_Customer_forgotPassword("Valid", "Click Cancel");
		CR.ShearCircle_Verify_Customer_forgotPassword("InValid", "Click Send instructions to reset password");
		CR.ShearCircle_Verify_Customer_forgotPassword("InValid", "Click Cancel");*/
	}
	
	
	@Test(priority=2,description="Customer ForgotPassword Valid EmailId Click Cancel.")
	public void Customer_ForgotPassword_Valid_EmailId_ClickCancel() throws IOException {		
		/*CR = new Customer_Module_Page_Components();*/			
		CR.ShearCircle_Verify_Customer_forgotPassword("Valid", "Click Cancel");
	}
	
	@Test(priority=3, description="Customer ForgotPassword Invalid_EmailId_ClickSendinstructionstoresetpassword.")
	public void Customer_ForgotPassword_Invalid_EmailId_ClickSendinstructionstoresetpassword() throws IOException {				
		CR.ShearCircle_Verify_Customer_forgotPassword("InValid", "Click Send instructions to reset password");
	}
	
	@Test(priority=4, description="Customer_ForgotPassword_Invalid_EmailId_ClickCancel")
	public void Customer_ForgotPassword_Invalid_EmailId_ClickCancel() throws IOException {				
		CR.ShearCircle_Verify_Customer_forgotPassword("InValid", "Click Cancel");	
	}	
	
	
	@Test(priority=5, description="1.1 Scenario: Customer visits ShearCircle and Customer clicks JoinOurCircle" )
	public void Customer_visitsShearCircle_clicks_JoinOurCircle() throws IOException {			
		CR.ShearCircle_LaunchApplication();
		CR.ShearCircle_Click_Login_OR_JoinOurCircle("Click_JoinOurCircle");		
	}
	
	@Test(priority=6, description="1.2 Scenario: Customer clicks on Join Our Circle button on Are you a Customer?" )
	public void Customer_clicksonJoinOurCirclebuttononAreyouaCustomer() throws IOException {		
		CR.ShearCircle_Click_Customer_OR_Professional_JoinOurCircle("Click_CustomerJoinCircle");
		CR.ShearCircle_Verify_Customer_Registrationform_Fieldvalidation();
	}
	
	/*@Test(priority=7, description="Customer Registration Form Fieldvalidation" )
	public void Customer_Registration_Form_Fieldvalidation() throws IOException {		
		CR.ShearCircle_Verify_Customer_Registrationform_Fieldvalidation();		
	}*/
	
	@Test(priority=7, description="1.3 Scenario: Customer clicks on Join Our Circle button after entering valid details"
			+ " and accepting the terms of service, privacy policy & billing agreement. " )
	public void Customer_clicksonJoinOurCirclebuttonafterenteringvaliddetails() throws IOException {			
		CR.ShearCircle_Customer_Registrationwithvaliddata();
	}
	
	@Test(priority=8, description="1.5 Scenario: Customer clicks on Join Our Circle button after entering invalid details "
			+ "and accepting the terms of service, privacy policy & billing agreement. " )
	public void Customer_clicksonJoinOurCirclebuttonafterenteringInvaliddetails() throws IOException {			
		CR.ShearCircle_Customer_Registrationwithinvaliddata();
	}
	
	@Test(priority=9, description="1.6 Scenario: Customer clicks on Join Our Circle button after entering valid details "
			+ "and without accepting the terms of service, privacy policy & billing agreement." )
	public void Customer_clicksonJoinOurCirclebuttonafterenteringvaliddetailswithoutacceptingTandC() throws IOException {			
		CR.ShearCircle_Customer_Registrationwithvaliddata_without_termsofservice();
	}
	
	@Test(priority=10, description="1.7 Scenario: Customer clicks on the hyperlinks in Customer Registration page. " )
	public void Customer_clicksonthehyperlinksinCustomerRegistrationpage() throws IOException {			
		CR.ShearCircle_Verify_Customer_Registrationform_HyperLynks();
	}

	
	@Test(priority=10, description="Customer DonthaveAccountyet_JoinOurCircle_Loginpage" )
	public void Customer_DonthaveAccountyet_JoinOurCircle_Loginpage() throws IOException {		
		CR.ShearCircle_LaunchApplication();
		CR.ShearCircle_Click_Login_OR_JoinOurCircle("Click_Login");
		CR.DonthaveAccountyet_JoinOurCircle_Loginpage();		
	}

	
}
