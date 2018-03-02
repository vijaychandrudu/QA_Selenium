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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;

public class TS_001_SubscriberVisitsJoinOurcirclePage extends StaticVariables {
	public Subscriber_Module_Page_Components SR;
	public String TestDataPath;
	public CommonFunctions cfn;
	public static WebDriver driver;

	public TS_001_SubscriberVisitsJoinOurcirclePage() throws IOException, InterruptedException {
		cfn = new CommonFunctions();
	}

	@BeforeClass
	@Parameters("browser")
	public void beforeclass(@Optional("chrome") String browser) throws IOException, InterruptedException {
		TestDataPath = cfn.TestDataPathOf("SubscriberTestData.properties");
		Browser = browser;
		driver = cfn.getDriver();
		SR = new Subscriber_Module_Page_Components(driver);
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

	@Test(priority = 1001, description = "Subscriber visits Join Our Circle page")
	public void TC_1_001_Subscriber_visitsJoinOurCirclepage() throws Exception {
		SR.launchApplication();
	}

	@Test(priority = 1002, description = "Subscriber clickon JoinOur Circle Button ")
	public void TC_1_002_Subscriber_clickOn_JoinOurCircleButton() throws Exception {
		SR.clickOn_JoinOurCircle_Button();
	}

	@Test(priority = 1003, description = " Subscriber clic on JoinOur Circle button under Are you aProfessional section")
	public void TC_1_003_Subscriber_click_AreYouProfessional_SectionUnder_JCButton() throws Exception {
		SR.click_AreYouProfessional_SectionUnder_JCButton();
	}

	@Test(priority = 1004, description = "Subscriber Check Fieldvalidions on Join Our Circle page")
	public void TC_1_004_Subscriber_joinOurCircle_Page_Filedvalidations() throws Exception {
		SR.joinOurCircle_Page_Filedvalidations();
	}

	@Test(priority = 1005, description = "Check the field validations ")
	public void TC_1_005_Subscriber_checkFieldValidations() throws Exception {
		SR.checkFieldValidations();
	}

	@Test(priority = 1006, description = "Check whether the validation messages are removed")
	public void TC_1_006_Subscriber_check_Validation_ErrorMessages_AreRemoved() throws Exception {
		SR.check_Validation_ErrorMessages_AreRemoved();
	}

	@Test(priority = 1007, description = "Check whether Terms of Service link is functioning")
	public void TC_1_007_Subscriber_checkTermsofServicelink() throws Exception {
		SR.checkTermsofServicelink();
	}

	@Test(priority = 1008, description = "Check whether the Close button in Terms & Conditions popup is clickable")
	public void TC_1_008_Subscriber_clickOn_CloseButton_TermsAndConditions_Popup_IsClose() throws Exception {
		SR.clickOn_CloseButton_TermsAndConditions_Popup_IsClose();
	}

	@Test(priority = 1009, description = "Check whether Privacy Policy link is functioning")
	public void TC_1_009_Subscriber_checkPrivacyPolicylink() throws Exception {
		SR.check_PrivacyPolicylink();
	}

	@Test(priority = 1010, description = " Check whether the Close button in Privacy Policy popup is clickable")
	public void TC_1_010_Subscriber_clickOn_CloseButton_PrivacyPolicy_Popup_IsClose() throws Exception {
		SR.clickOn_CloseButton_PrivacyPolicy_Popup_IsClose();

	}

	@Test(priority = 1011, description = "Check whether the Sign in link is functioning")
	public void TC_1_011_Subscriber_click_SignIn_Link() throws Exception {
		SR.click_SignIn_Link();
	}

	@Test(priority = 1012, description = "Create account by entering invalid data")
	public void TC_1_012_Subscriber_create_Account_ByEntering_InvalidData() throws Exception {
		SR.create_Account_ByEntering_InvalidData();
	}

	@Test(priority = 1013, description = "create Account Enter by Valid data and Wrong ReTypePassword")
	public void TC_1_013_Subscriber_createAccount_Enter_ValidDataAnd_WrongReType_Password() throws Exception {
		SR.createAccount_Enter_ValidDataAnd_WrongReType_Password();
	}

	@Test(priority = 1014, description = "create Account enter by Valid data  and without Accepting Terms and Billing Agreement")
	public void TC_1_014_Subscriber_createAccount_Enter_ValidDataAnd_Without_AcceptingTermsAndBillingAgreement()
			throws Exception {
		SR.createAccount_Enter_ValidDataAnd_Without_AcceptingTermsAndBillingAgreement();
	}

	@Test(priority = 1015, description = "Create account by entering an existing subdomain")
	public void TC_1_015_Subscriber_existingEmailValidation() throws Exception {
		SR.existingSubdomainValidation();
	}

	@Test(priority = 1016, description = "Create account byentering existing Subscriber account email id")
	public void TC_1_016_Subscriber_existing_Subscriber_EmailValidation() throws Exception {
		SR.existing_Subscriber_EmailValidation();
	}

	@Test(priority = 1017, description = "Create account by entering an existing Customer account email id")
	public void TC_1_017_Subscriber_existing_Customer_EmailValidation() throws Exception {
		SR.existing_Customer_EmailValidation();
	}
}
