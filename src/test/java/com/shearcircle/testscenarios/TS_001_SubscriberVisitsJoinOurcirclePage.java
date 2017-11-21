package com.shearcircle.testscenarios;

import org.testng.annotations.Test;

import com.shearcircle.pagecomponents.Subscriber_Module_Page_Components;
import com.shearcircle.utilities.CommonFunctions;
import com.shearcircle.utilities.StaticVariables;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;

public class TS_001_SubscriberVisitsJoinOurcirclePage extends StaticVariables {
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
		driver.quit();
	}

	/*@AfterMethod
	public void afterMethod() {
		driver.quit();
	}*/

	@Test(priority=0,description = "Subscriber visits Join Our Circle page")
	public void TC_1_001_visitsJoinOurCirclepage() throws Exception {
		SR.launchApplication();
		SR.visitsJoinOurCirclepage();
	}

	@Test(priority=1,dependsOnMethods= "TC_1_001_visitsJoinOurCirclepage", description = "Create account by entering an existing subdomain")
	public void TC_1_002_CreateAccountBySubdomain() throws Exception {
			SR.CreateAccountBySubdomain();
	}

	@Test(priority=2,description = "Check whether Join Our Circle button under Are you a Professional section is clickable ")
	public void TC_1_003_CheckJoinOurCircleButton() throws Exception {
		SR.checkJoinOurCircleButton();
	}
	
	@Test(priority=3,description = "Check whether the Join Our Circle page displays the required information ")
	public void TC_1_004_validateElementsOnJoinOurCirclepage() throws Exception {
		SR.validateElementsOnJoinOurCirclepage();
	}
	@Test(priority=4,description = "Check the field validations ")
	public void TC_1_005_checkFieldValidations() throws Exception {
		SR.checkFieldValidations();
	}
	@Test(priority=5,description = "Check whether the validation messages are removed")
	public void TC_1_006_checkFieldValidationsAreCleared() throws Exception {
		SR.checkFieldValidationsAreCleared();
	}
	@Test(priority=6,description = "Check whether Terms of Service link is functioning, Check whether the Close button in Terms & Conditions popup is clickable")
	public void TC_1_007_008_checkTermsofServicelink() throws Exception {
		SR.checkTermsofServicelink();
	}
	@Test(priority=7,description = "Check whether Privacy Policy link is functioning, Check whether the Close button in Privacy Policy popup is clickable")
	public void TC_1_009_010_checkPrivacyPolicylink() throws Exception {
		SR.checkPrivacyPolicylink();
	}
	
	@Test(priority=8,description = "Check whether the Sign in link is functioning")
	public void TC_1_011_012_checkFieldValidations() throws Exception {
		SR.signinLinkFunctioning();
		System.out.println("Covered in TC_1_005");
	}	
	@Test(priority=9,description = "Create account by entering valid data & wrong retype password")
	public void TC_1_013_retypePasswordValidation() throws Exception {
		SR.retypePasswordValidation();
	}	
	@Test(priority=10,description = "Create account by entering valid details and without accepting terms & billing agreement")
	public void TC_1_014_acceptTermsAndBillingValidation() throws Exception {
		SR.acceptTermsAndBillingValidation();
	}	
	@Test(priority=11,description = "Create account by entering an existing subdomain")
	public void TC_1_015_existingSubdomainValidation() throws Exception {
		SR.existingSubdomainValidation();
	}	
	@Test(priority=12,description = "Create account by entering existing Subscriber and Customer account email id")
	public void TC_1_016_017_existingEmailValidation() throws Exception {
		SR.existingEmailValidation();
	}	
	
	
}
