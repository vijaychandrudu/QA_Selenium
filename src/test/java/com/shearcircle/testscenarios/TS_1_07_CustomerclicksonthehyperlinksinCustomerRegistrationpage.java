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

public class TS_1_07_CustomerclicksonthehyperlinksinCustomerRegistrationpage extends StaticVariables {
	public String TestDataPath;
	public Customer_Module_Page_Components CR;
	public CommonFunctions cfn;
	public static WebDriver driver;
	
	public TS_1_07_CustomerclicksonthehyperlinksinCustomerRegistrationpage() throws IOException, InterruptedException{
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
	
	@Test(priority=1701, description="TC_1_7_01 Customer visits ShearCircle page" )
	public void TC_1_7_01_Customer_visitsShearCircle() throws IOException {			
		CR.ShearCircle_LaunchApplication();			
	}
	
	@Test(priority=1702, description="TC_1_7_02 Customer clicks Join Our Circle Button " )
	public void TC_1_7_02_Customer_clicks_JoinOurCircleButton() throws IOException {			
		CR.ShearCircle_Click_Login_OR_JoinOurCircle("Click_JoinOurCircle");			
	}
	
	@Test(priority=1703, description="TC_1_7_03 Customer Check Register With ShearCircle page where they can register either as a Customer or as a Professional")
	public void TC_1_7_03_Customer_CheckRegisterWithShearCirclepage() throws IOException {			
		CR.ShearCircle_Click_Customer_OR_Professional_JoinOurCircle("Click_CustomerJoinCircle");			
	}
	@Test(priority=1704, description="TC_1_7_04 Customer Check Registration page all fields" )
	public void TC_1_7_04_Customer_CheckRegistrationpageallfields() throws IOException {			
		CR.ShearCircle_Verify_Customer_Registrationform_Fieldvalidation();			
	}
	@Test(priority=1705, description="TC_1_7_05  Customer clicks on the hyperlinks in Customer Registration page." )
	public void TC_1_7_05_CustomerclicksonJoinOurCirclebuttonafterenteringvaliddetails() throws IOException {			
		CR.ShearCircle_Verify_Customer_Registrationform_HyperLynks();			
	}

}
