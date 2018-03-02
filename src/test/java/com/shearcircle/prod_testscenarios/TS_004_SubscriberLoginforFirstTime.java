package com.shearcircle.prod_testscenarios;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.shearcircle.pagecomponents.Subscriber_Module_Page_Components;
import com.shearcircle.utilities.CommonFunctions;
import com.shearcircle.utilities.StaticVariables;

public class TS_004_SubscriberLoginforFirstTime extends StaticVariables {
	CommonFunctions cfn = new CommonFunctions();
	Subscriber_Module_Page_Components SR;

	@BeforeClass
	@Parameters("browser")
	public void beforeclass(@Optional("chrome") String browser) throws IOException, InterruptedException {
		TestDataPath = cfn.TestDataPathOf("SubscriberTestData.properties");
		Browser = browser;
		cfn.getAndOpenBrowser(browser);
		SR = new Subscriber_Module_Page_Components(driver);

	}

	@AfterMethod
	public void StatusScreenShots(ITestResult testResult) throws IOException, InterruptedException {
		cfn.ScreenshotOnPassFail(testResult);
		Thread.sleep(1000);
	}

	/*@Test(priority = 0, description = "Valid Login button is clickable and Signin page is displayed")
	public void TC_4_001_loginButtonClickable() throws Exception {
		SR.loginButtonClickable();
	}

	@Test(priority = 0, description = "Checking whether able to login by entering invalid credentials")
	public void TC_4_002_loginUsingInvalidCredentials() throws Exception {
		SR.loginUsingInvalidCredentials();
	}

	@Test(priority = 0, description = "Checking whether able to login by entering Valid credentials")
	public void TC_4_003_loginUsingValidCredentials() throws Exception {
		SR.loginUsingValidCredentials();
	}

	@Test(priority = 0, description = "Checking whether able to login by entering Valid credentials")
	public void TC_4_004_loginintoDashboard() throws Exception {
		SR.loginintoDashboard();
	}

	@Test(priority = 0, description = "Checking whether able to login into Dashboard by relogin from What Describes You Page")
	public void TC_4_005_signinfromWhatDescribesYouPage() throws Exception {
		SR.signinfromWhatDescribesYouPage();
	}

	@Test(priority = 0, description = "Checking whether we can navigate to next page by clicking Next Step button without selecting the options")
	public void TC_4_006_clickonNextStepinWhatDescribesYouPage() throws Exception {
		SR.clickonNextStepinWhatDescribesYouPage();
	}

	@Test(priority = 0, description = "Checking whether we can navigate to next page by not adding service in Other Service option ")
	public void TC_4_007_clickonNextStepSelectingOtherService() throws Exception {
		SR.clickonNextStepSelectingOtherService();
	}

	@Test(priority = 0, description = "Checking whether we can navigate to next page by adding Service in Other Services option")
	public void TC_4_008_clickonNextStepaddingServiceinOtherService() throws Exception {
		SR.clickonNextStepaddingServiceinOtherService();
	}
	@Test(priority = 0, description = "Check if you can navigate to next page by selecting an option (except Other Services)")
	public void TC_4_009_clickonNextStepaddingService() throws Exception {
		SR.clickonNextStepaddingService();
	}


	@Test(priority = 0, description = "Checking whether we can access Dashboard from Your Business Details page")
	public void TC_4_010_clickonMyAccountinBusinessDetailspage() throws Exception {
		SR.clickonMyAccountinBusinessDetailspage();
	}

	@Test(priority = 0, description = "Checking whether able to login into Dashboard by relogin from Your Business Details page")
	public void TC_4_011_ReloginintoBusinessDetailspage() throws Exception {
		SR.ReloginintoBusinessDetailspage();
	}

	@Test(priority = 0, description = "Checking whether able to login into Dashboard by relogin from Your Business Details page")
	public void TC_4_012_clickonNextStepinBusinessDetailspage() throws Exception {
		SR.clickonNextStepinBusinessDetailspage();
	}

	@Test(priority = 0, description = "Checking whether we can navigate to next page after entering valid details in Your Business Details page")
	public void TC_4_013_clickonNextStepinBusinessDetailspageEnteringdetails() throws Exception {
		SR.clickonNextStepinBusinessDetailspageEnteringdetails();
	}

	@Test(priority = 0, description = "Checking whether we were able to login directly to Dashboard")
	public void TC_4_014_loginintoDashboarddirectly() throws Exception {
		SR.loginintoDashboarddirectly();
	}
*/
}
