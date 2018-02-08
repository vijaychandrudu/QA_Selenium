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

public class TS_6_02_BookingAppointmentAfterSignIn_PayPal extends StaticVariables {
	public String TestDataPath;
	public Customer_Module_Page_Components CR;
	public CommonFunctions cfn;
	public static WebDriver driver;
	
	public TS_6_02_BookingAppointmentAfterSignIn_PayPal() throws IOException, InterruptedException{
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
	
	@Test(priority=60201, description="Customer visits ShearCircle page" )
	public void Customer_visitsShearCircle() throws IOException {	
		ExtentTestManager.getTest().setDescription("Customer visits ShearCircle page");
		CR.ShearCircle_LaunchApplication();			
	}
	
	@Test(priority=60202, description="Customer clicks Login Button " )
	public void TC_3_4_2_Customer_clicks_JoinOurCircleButton() throws IOException {	
		ExtentTestManager.getTest().setDescription("Customer clicks JoinOurCircle Button.");
		CR.ShearCircle_Click_Login_OR_JoinOurCircle("Click_Login");			
	}
	
	@Test(priority=60203, description="Customer Login with registered Username(Email id) & Password " )
	public void TC_3_4_3_Customer_CheckRegisterWithShearCirclepage()throws IOException {	
		ExtentTestManager.getTest().setDescription("Customer Login with registered Username(Email id) & Password .");
		CR.ShearCircle_Customer_Login_valid_invalid_combination("Enter_Valid_EmailandPassword");			
	}
	
	@Test(priority=60208, description="Check whether you are redirected to PayPal page when you click confirm after selecting PayPal option " )
	public void TC_6_02_03_Verify_Paypal_Page_Isdisplayed()throws IOException {	
		ExtentTestManager.getTest().setDescription("Check whether you are redirected to PayPal page when you click confirm after selecting PayPal option ");
		CR.Verify_Paypal_Page_Isdisplayed();			
	}
	@Test(priority=60209, description="Check whether the cart details are correct in the PayPal page" )
	public void TC_6_02_04_Verify_CartDetails_Paypal_Page()throws IOException {	
		ExtentTestManager.getTest().setDescription("Check whether the cart details are correct in the PayPal page");
		CR.Verify_CartDetails_Paypal_Page();			
	}
	@Test(priority=60210, description="Check whether you can cancel the PayPal checkout" )
	public void TC_6_02_05_Verify_Cancel_Paypal_checkout()throws IOException {	
		ExtentTestManager.getTest().setDescription("Check whether you can cancel the PayPal checkout");
		CR.Verify_Cancel_Paypal_checkout();			
	}
	
	@Test(priority=60211, description="Check whether the Go to Home link redirects to Home page	" )
	public void TC_6_02_06_Verify_Gotohome_Link()throws IOException {	
		ExtentTestManager.getTest().setDescription("Check whether the Go to Home link redirects to Home page");
		CR.Verify_Gotohome_Link();			
	}
	
	@Test(priority=60212, description="Check the appointment status after Cancelling PayPal transaction	" )
	public void TC_6_02_07_Verify_Appoinment_Status_After_Cancellation()throws IOException {	
		ExtentTestManager.getTest().setDescription("Check the appointment status after Cancelling PayPal transaction");
		CR.Verify_Appoinment_Status_After_Cancellation();			
	}
	
	}

