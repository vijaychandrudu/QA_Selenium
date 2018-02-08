package com.shearcircle.prod_testscenarios;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.shearcircle.pagecomponents.Subscriber_Module_Page_Components;
import com.shearcircle.utilities.CommonFunctions;
import com.shearcircle.utilities.StaticVariables;

public class TS_002_SubscriberClicksOnStartFreeTrialButton extends StaticVariables {
		CommonFunctions cfn = new CommonFunctions();
		Subscriber_Module_Page_Components SR;

		@BeforeClass
		@Parameters("browser")
		public void beforeclass(@Optional("chrome") String browser) throws IOException, InterruptedException {
			TestDataPath = cfn.TestDataPathOf("SubscriberTestData.properties");
			Browser = browser;
			cfn.getAndOpenBrowser(browser);
			SR = new Subscriber_Module_Page_Components();
			System.out.println("test");
		}

		@AfterMethod
		public void StatusScreenShots(ITestResult testResult) throws IOException, InterruptedException {
			cfn.ScreenshotOnPassFail(testResult);
			Thread.sleep(1000);
		
		}

		@AfterClass
		public void afterClass() {
		//	driver.quit();
		}

		/*@AfterMethod
		public void afterMethod() {
			driver.quit();
		}*/

		@Test(priority=0,description = "Subscriber visits Join Our Circle page")
		public void TC_2_001_visitsJoinOurCirclepage() throws Exception {
			SR.createAccountStartFreeTrialbutton();			
		}
		@Test(priority=0,description = "Subscriber visits Join Our Circle page")
		public void TC_2_002_visitsJoinOurCirclepage() throws Exception {
			SR.createAccountStartFreeTrialbutton();			
		}

		
		
		
}
