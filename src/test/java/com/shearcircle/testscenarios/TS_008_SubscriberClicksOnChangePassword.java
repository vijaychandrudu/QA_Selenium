package com.shearcircle.testscenarios;

import java.io.IOException;

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

public class TS_008_SubscriberClicksOnChangePassword {

	CommonFunctions cfn = new CommonFunctions();
	Subscriber_Module_Page_Components SR;

	@BeforeClass
	@Parameters("browser")
	public void beforeclass(@Optional("chrome") String browser) throws IOException, InterruptedException {
		String TestDataPath = cfn.TestDataPathOf("SubscriberTestData.properties");
		String Browser = browser;
		cfn.getAndOpenBrowser(browser);
		SR = new Subscriber_Module_Page_Components();
		System.out.println("test");
	}

	@AfterMethod
	public void StatusScreenShots(ITestResult testResult) throws Exception {
		cfn.ScreenshotOnPassFail(testResult);
		Thread.sleep(1000);
		
	}

	@AfterClass
	public void afterClass() {
		// driver.quit();
	}

	/*
	 * @AfterMethod public void afterMethod() { driver.quit(); }
	 */

	@Test(priority = 0, description = "Open Update Password page")
	public void TC_8_001_OpenUpdatePasswordpage() throws Exception {
		SR.updatePasswordPage();

	}

	@Test(priority = 0, description = "Check whether validation message is displayed when you click update without entering any data")
	public void TC_8_002_clickOnUpdateButtonWithoutEnteringData() throws Exception {
		SR.clickOnUpdateButtonWithoutEnteringData();

	}

	@Test(priority = 0, description = "Check whether the password is updated by typing wrong old password")
	public void TC_8_003_enterWrongOldPassword() throws Exception {
		SR.enterWrongOldPassword();

	}

	@Test(priority = 0, description = "Check whether the password is updated by typing correct old password and invalid length new password")
	public void TC_8_004_enterInvalidNewPasswordLength() throws Exception {
		SR.enterInvalidNewPasswordLength();

	}

	@Test(priority = 0, description = "Check whether the password is updated by typing correct old password and invalid new password")
	public void TC_8_005_enterInvalidNewPasswordwithSpaces() throws Exception {
		SR.enterInvalidNewPasswordwithSpaces();

	}

	@Test(priority = 0, description = "Check whether the password is updated by typing valid data")
	public void TC_8_006_checkPasswordIsUpdated() throws Exception {
		SR.checkPasswordIsUpdated();

	}

	@Test(priority = 0, description = "Check whether the Cancel button is clickable")
	public void TC_8_007_clickOnCancelButton() throws Exception {
		SR.clickOnCancelButton();

	}

	@Test(priority = 0, description = "Check whether you are able to login with old password")
	public void TC_8_008_validateLoginWithOldPassword() throws Exception {
		SR.validateLoginWithOldPassword();

	}

	@Test(priority = 0, description = "Check whether you are able to login with new password")
	public void TC_8_009_validateLoginWithNewPassword() throws Exception {
		SR.validateLoginWithNewPassword();

	}

}
