package com.shearcircle.prod_testscenarios;

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

public class TS_2_08_CustomerLoginwithFacebookuserwhichnotregisteredShearCircle extends StaticVariables {
	public String TestDataPath;
	public Customer_Module_Page_Components CR;
	public CommonFunctions cfn;
	public static WebDriver driver;
	
	public TS_2_08_CustomerLoginwithFacebookuserwhichnotregisteredShearCircle() throws IOException, InterruptedException{
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

	/*@AfterClass
	public void afterClass() {
		driver.quit();
	}*/
	
	@Test(priority=2801, description="TC_2_8_01 Customer visits ShearCircle page" )
	public void TC_2_8_01_Customer_visitsShearCircle() throws IOException {			
		CR.ShearCircle_LaunchApplication();			
	}
	
	@Test(priority=2802, description="TC_2_8_02 Customer clicks Login on ShearCircle home page " )
	public void TC_2_8_02_Customer_clicks_JoinOurCircleButton() throws IOException {			
		CR.ShearCircle_Click_Login_OR_JoinOurCircle("Click_Login");			
	}
	
	@Test(priority=2803, description="TC_2_8_03 Customer clicks on Login with Facebook button" )
	public void TC_2_8_03_CustomerclicksonLoginwithFacebookbutton() throws IOException {			
		CR.Click_DoNotHaveAccountjoinourcircle_Loginwith_FaceBook_Google_Bottons("Click_LoginwithFaceBook");		
	}	
	
	@Test(priority=2804, description="TC_2_8_04  Customer Login with Facebook user credentials that is not registered with ShearCircle" )
	public void TC_2_8_04_CustomerLoginwithFacebookUserwithnotregisteredSC() throws IOException {			
		CR.Customer_LoginwithFacebook_not_registerewith_ShearCircle();		
	}
	
}
