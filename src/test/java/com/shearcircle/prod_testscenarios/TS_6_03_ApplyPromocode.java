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

import utils.ExtentReports.ExtentTestManager;

public class TS_6_03_ApplyPromocode extends StaticVariables {
	public String TestDataPath;
	public Customer_Module_Page_Components CR;
	public CommonFunctions cfn;
	public static WebDriver driver;
	
	public TS_6_03_ApplyPromocode() throws IOException, InterruptedException{
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
	
	@Test(priority=60301, description="Customer visits ShearCircle page" )
	public void Customer_visitsShearCircle() throws IOException {	
		ExtentTestManager.getTest().setDescription("Customer visits ShearCircle page");
		CR.ShearCircle_LaunchApplication();			
	}
	
	@Test(priority=60302, description="Customer clicks Login Button " )
	public void TC_3_4_2_Customer_clicks_JoinOurCircleButton() throws IOException {	
		ExtentTestManager.getTest().setDescription("Customer clicks JoinOurCircle Button.");
		CR.ShearCircle_Click_Login_OR_JoinOurCircle("Click_Login");			
	}
	
	@Test(priority=60303, description="Customer Login with registered Username(Email id) & Password " )
	public void TC_3_4_3_Customer_CheckRegisterWithShearCirclepage()throws IOException {	
		ExtentTestManager.getTest().setDescription("Customer Login with registered Username(Email id) & Password .");
		CR.ShearCircle_Customer_Login_valid_invalid_combination("Enter_Valid_EmailandPassword");			
	}
	
	@Test(priority=60308, description="Check whether Have a Promocode? link is clickable " )
	public void TC_6_03_02_Verify_Promocode_Linkis_Clickable()throws IOException {	
		ExtentTestManager.getTest().setDescription("Check whether Have a Promocode? link is clickable");
		CR.Verify_Promocode_Linkis_Clickable();			
	}
	@Test(priority=60309, description="Check the details in Enter Promocode popup" )
	public void TC_6_03_03_Verify_Detailsin_Promocode_Popup()throws IOException {	
		ExtentTestManager.getTest().setDescription("Check the details in Enter Promocode popup");
		CR.Verify_Detailsin_Promocode_Popup();			
	}
	@Test(priority=60310, description="Check the validation if Apply button is clicked without entering promocode" )
	public void TC_6_03_04_Verify_Applybutton_Without_Entering_Promocode()throws IOException {	
		ExtentTestManager.getTest().setDescription("Check the validation if Apply button is clicked without entering promocode");
		CR.Verify_Applybutton_Without_Entering_Promocode();			
	}
	
	@Test(priority=60211, description="Check the validation if Apply button is clicked after entering invalid promocode" )
	public void TC_6_03_05_Verify_Applybutton__Entering_Invalid_Promocode()throws IOException {	
		ExtentTestManager.getTest().setDescription("Check the validation if Apply button is clicked after entering invalid promocode");
		CR.Verify_Applybutton__Entering_Invalid_Promocode();			
	}
	
	@Test(priority=60212, description="Check when Apply button is clicked after entering valid promocode" )
	public void TC_6_03_06_Verify_Applybutton_Entering_Valid_Promocode()throws IOException {	
		ExtentTestManager.getTest().setDescription("Check when Apply button is clicked after entering valid promocode");
		CR.Verify_Applybutton_Entering_Valid_Promocode();			
	}
	
	}

