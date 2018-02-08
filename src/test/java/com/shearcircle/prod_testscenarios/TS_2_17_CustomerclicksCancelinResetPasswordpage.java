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

public class TS_2_17_CustomerclicksCancelinResetPasswordpage extends StaticVariables {
	public String TestDataPath;
	public Customer_Module_Page_Components CR;
	public CommonFunctions cfn;
	public static WebDriver driver;
	
	public TS_2_17_CustomerclicksCancelinResetPasswordpage() throws IOException, InterruptedException{
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
	public void afterClass() {
		driver.quit();
	}*/
	
	@Test(priority=21701, description="TC_2_17_01 Customer visits ShearCircle page" )
	public void TC_2_17_01_Customer_visitsShearCircle() throws IOException {			
		CR.ShearCircle_LaunchApplication();			
	}
	
	@Test(priority=21702, description="TC_2_17_02 Customer clicks Login on ShearCircle home page " )
	public void TC_2_17_02_Customer_clicks_JoinOurCircleButton() throws IOException {			
		CR.ShearCircle_Click_Login_OR_JoinOurCircle("Click_Login");			
	}	

	@Test(priority=21703, description="TC_2_17_03  Customer clicks Cancel in Reset Password page." )
	public void TC_2_17_03_Customer_Click_Cancellink() throws IOException {	
		CR.ShearCircle_Verify_Customer_forgotPassword("Valid", "Click Cancel");		
	}	

}
