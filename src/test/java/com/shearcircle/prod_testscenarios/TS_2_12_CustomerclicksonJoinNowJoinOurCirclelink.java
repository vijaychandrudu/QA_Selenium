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

public class TS_2_12_CustomerclicksonJoinNowJoinOurCirclelink extends StaticVariables {
	public String TestDataPath;
	public Customer_Module_Page_Components CR;
	public CommonFunctions cfn;
	public static WebDriver driver;
	
	public TS_2_12_CustomerclicksonJoinNowJoinOurCirclelink() throws IOException, InterruptedException{
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
	
	@Test(priority=21201, description="TC_2_12_01 Customer visits ShearCircle page" )
	public void TC_2_12_01_Customer_visitsShearCircle() throws IOException {			
		CR.ShearCircle_LaunchApplication();			
	}
	
	@Test(priority=21202, description="TC_2_12_02 Customer clicks Login on ShearCircle home page " )
	public void TC_2_12_02_Customer_clicks_JoinOurCircleButton() throws IOException {			
		CR.ShearCircle_Click_Login_OR_JoinOurCircle("Click_Login");			
	}
	
	@Test(priority=21203, description="TC_2_12_03  Customer clicks on Join Now/Join Our Circle link" )
	public void TC_2_12_03_Customer_Click_DoNotHaveAccountjoinourcircle() throws IOException {			
		CR.Click_DoNotHaveAccountjoinourcircle_Loginwith_FaceBook_Google_Bottons("Click_Donthaveaccount_JoinOurCircle");		
	}	

}
