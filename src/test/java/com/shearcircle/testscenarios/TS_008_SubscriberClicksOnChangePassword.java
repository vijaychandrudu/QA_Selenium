package com.shearcircle.testscenarios;

import java.io.IOException;

import org.testng.annotations.Test;

import com.shearcircle.pagecomponents.Subscriber_Module_Page_Components;
import com.shearcircle.utilities.CommonFunctions;
import com.shearcircle.utilities.StaticVariables;

import utils.ExtentReports.ExtentTestManager;

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

public class TS_008_SubscriberClicksOnChangePassword extends StaticVariables {
	public Subscriber_Module_Page_Components SR;
	public String TestDataPath;
	public CommonFunctions cfn;
	public static WebDriver driver;

	public TS_008_SubscriberClicksOnChangePassword() throws IOException, InterruptedException {
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

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

	@Test(priority = 8000, description = "Subscriber visits Join Our Circle page")
	public void TC_8_000_Subscriber_visitsJoinOurCirclepage() throws Exception {
		ExtentTestManager.getTest().setDescription("Subscriber visits Join Our Circle page");
		SR.launchApplication();
	}

	@Test(priority = 8001, description = "Subscriber open Update Password page")
	public void TC_8_001_Subscriber_open_UpdatePassword_Page() throws Exception {
		ExtentTestManager.getTest().setDescription("Subscriber open Update Password page");
		SR.open_UpdatePassword_Page();
	}

	@Test(priority = 8002, description = "Subscriber check whether validation message is displayed when you click update without entering any data")
	public void TC_8_002_Subscriber_clickOnUpdateButtonWithoutEnteringData() throws Exception {
		ExtentTestManager.getTest().setDescription(
				"Subscriber check whether validation message is displayed when you click update without entering any data");
		SR.click_OnUpdateButton_WithoutEnteringData();
	}

	@Test(priority = 8003, description = "Subscriber check whether the password is updated by typing wrong old password")
	public void TC_8_003_Subscriber_enterWrongOldPassword() throws Exception {
		ExtentTestManager.getTest()
				.setDescription("Subscriber check whether the password is updated by typing wrong old password");
		SR.enter_WrongOldPassword();
	}

	@Test(priority = 8004, description = "Subscriber check whether the password is updated by typing correct old password and invalid length new password")
	public void TC_8_004_Subscriber_enterInvalidNewPasswordLength() throws Exception {
		ExtentTestManager.getTest().setDescription(
				"Subscriber check whether the password is updated by typing correct old password and invalid length new password");
		SR.enter_InvalidNewPasswordLength("NewPD_ReTypePD_Equal");
	}

	@Test(priority = 8005, description = "Subscriber check whether the password is updated by typing correct old password and invalid new password")
	public void TC_8_005_Subscriber_enterInvalidNewPasswordwithSpaces() throws Exception {
		ExtentTestManager.getTest().setDescription(
				"Subscriber check whether the password is updated by typing correct old password and invalid new password");
		SR.enter_InvalidNewPasswordwithSpaces();
	}

	@Test(priority = 8006, description = "Subscriber check whether the password is updated by typing valid data")
	public void TC_8_006_Subscriber_checkPasswordIsUpdated() throws Exception {
		SR.check_PasswordIsUpdated();
	}

	@Test(priority = 8007, description = "Subscriber check whether the Cancel button is clickable")
	public void TC_8_007_Subscriber_cclickOnCancelButton() throws Exception {
		ExtentTestManager.getTest().setDescription("Subscriber check whether the Cancel button is clickable");
		SR.clickOn_CancelButton();
	}

	@Test(priority = 8008, description = "Subscriber check whether you are able to login with old password")
	public void TC_8_008_Subscriber_validate_LoginWithOldPassword() throws Exception {
		ExtentTestManager.getTest().setDescription("Subscriber check whether you are able to login with old password");
		SR.validate_LoginWithOldPassword();
	}

	@Test(priority = 8009, description = "Subscriber check whether you are able to login with new password")
	public void TC_8_009_Subscriber_validate_LoginWithNewPassword() throws Exception {
		ExtentTestManager.getTest().setDescription("Subscriber check whether you are able to login with new password");
		SR.validate_LoginWithNewPassword();
	}
}
