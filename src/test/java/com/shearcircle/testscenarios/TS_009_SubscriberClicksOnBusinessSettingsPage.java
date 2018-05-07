package com.shearcircle.testscenarios;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
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

import utils.ExtentReports.ExtentTestManager;

import com.shearcircle.utilities.CommonFunctions;

public class TS_009_SubscriberClicksOnBusinessSettingsPage extends StaticVariables {
	
	public Subscriber_Module_Page_Components SR;
	public String TestDataPath;
	public CommonFunctions cfn;
	public static WebDriver driver;

	public TS_009_SubscriberClicksOnBusinessSettingsPage() throws IOException, InterruptedException {
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
	public void StatusScreenShots(ITestResult testResult) throws Exception {
		cfn.ScreenshotOnPassFail(testResult);
		Thread.sleep(1000);
		
	}

	/*@AfterClass
	public void afterClass() {
		 driver.quit();
	}*/

		
	@Test(priority = 9001, description = "Subscriber visits Join Our Circle page")
	public void TC__001_Subscriber_visitsJoinOurCirclepage() throws Exception {
		ExtentTestManager.getTest().setDescription("Subscriber visits Join Our Circle page");
		SR.launchApplication();
	}
    
	@Test(priority = 9002, description = "Log into Subscriber Account")
	public void TC_002_Subscriber_logIn_ToDashboard() throws Exception {
		ExtentTestManager.getTest().setDescription("Log into Subscriber Account");
		SR.logIn_ToDashboard();
	}
	@Test(priority = 9003, description = "Open Business Settings page")
	public void TC_9001_openbusinesssettingspage() throws Exception {
		ExtentTestManager.getTest().setDescription("Open Business Settings page");
		SR.openbusinesssettingspage();
	}
	@Test(priority = 9004, description = "Check the info/tabs in Business Settings page")
	public void TC_9002_businesspagetabsvalidation() throws Exception {
		ExtentTestManager.getTest().setDescription("Check the info/tabs in Business Settings page");
		SR.businesspagetabsvalidation();
	}
	
	@Test(priority = 9005, description = "Check the info in Business Details tab")
	public void TC_9_003_checkinfoinbusinessdetailstab() throws Exception { 
		ExtentTestManager.getTest().setDescription("Check the info in Business Details tab");
		SR.checkinfoinbusinessdetailstab();
	}
	@Test(priority = 9006, description = "Save changes without adding data in mandatory fields")
	public void TC_9_004_savechangeswithoutaddinganydata() throws Exception { 
		ExtentTestManager.getTest().setDescription("Save changes without adding data in mandatory fields");
		SR.savechangeswithoutaddinganydata();
	}
	
	@Test(priority = 9007, description = "Save changes by adding data in mandatory fields")
	public void TC_9_005_checkpopupmessgaeonsavingvaliddata() throws Exception { 
		ExtentTestManager.getTest().setDescription("Save changes by adding data in mandatory fields");
		SR.checkpopupmessgaeonsavingvaliddata();
	}
	@Test(priority = 9008, description = "Verify whether the Business details are updated")
	public void TC_9_006_Subscriber_verifywhether_BusinessDetails_Updated() throws Exception {
		ExtentTestManager.getTest().setDescription("Verify whether the Business details are updated");
		SR.verifywhether_BusinessDetails_Updated();
		SR.logIn_ToDashboard();
		SR.openbusinesssettingspage();
	}
	@Test(priority = 9009, description = "Check whether Business Name can be modified")
	public void TC_9_007_Subscriber_checkbusinessnamecanbemodified() throws Exception {
		ExtentTestManager.getTest().setDescription("Check whether Business Name can be modified");
		SR.checkbusinessnamecanbemodified();
	}
	@Test(priority = 9010, description = " Verify whether the Business Name has changed")
	public void TC_9_008_Subscriber_verify_BusinessNameChanged() throws Exception {
		ExtentTestManager.getTest().setDescription(" Verify whether the Business Name has changed");
		SR.verify_BusinessNameChanged();
		SR.logIn_ToDashboard();
		SR.openbusinesssettingspage();
	}
	
	@Test(priority = 9011, description = "Check whether Subdomain can be changed to an existing one")
	public void TC_9_009_Subscriber_checkexistsubdomainnamecanbemodified() throws Exception {
		ExtentTestManager.getTest().setDescription("Check whether Subdomain can be changed to an existing one");
		SR.checkexistsubdomainnamecanbemodified();
	}
	@Test(priority = 9012, description = "Check whether the Subdomain can be modified to a non existing one")
	public void TC_9_010_Subscriber_checkexistsubdomainnamecanbemodified() throws Exception {
		ExtentTestManager.getTest().setDescription("Check whether the Subdomain can be modified to a non existing one");
		SR.checknonexistsubdomainnamecanbemodified();
	}
	@Test(priority = 9013, description = "Check the info in Online Booking tab")
	public void TC_9_011_Subscriber_validateinfoinonlinebookingtab() throws Exception {
		ExtentTestManager.getTest().setDescription("Check the info in Online Booking tab");
		SR.validateinfoinonlinebookingtab();
	}
	@Test(priority = 9014, description = "Check the mandatory fields in Online Booking tab")
	public void TC_9_012_Subscriber_verifyonlineinfofieldsb() throws Exception {
		ExtentTestManager.getTest().setDescription("Check the mandatory fields in Online Booking tab");
		SR.verifyonlineinfofields("WithOutAddingData");
	}
	@Test(priority = 9015, description = "Check whether Booking Policy is applied")
	public void TC_9_013_Subscriber_checkbookingpolicyisapplied() throws Exception {
		ExtentTestManager.getTest().setDescription("Check whether Booking Policy is applied");
		SR.checkbookingpolicyisapplied();
	}
	/*@Test(priority = 9016, description = "Check whether Booking Policy is applied")
	public void TC_9_014_Subscriber_checkbookingpolicyisapplied() throws Exception {
		ExtentTestManager.getTest().setDescription("Check whether Booking Policy is applied");
		SR.checkbookingpolicyisapplied();
	}
	@Test(priority = 9017 , description = "Check whether the Calender settings can be saved")
	public void TC_9_015_checkcalendersettingscanbesaved() throws Exception { 
		SR.checkcalendersettingscanbesaved();
	}*/
	
	@Test(priority = 9018, description = "Check the info in Calendar tab")
	public void TC_9_016_Subscriber_checkinfoincalendartab() throws Exception {
		ExtentTestManager.getTest().setDescription("Check the info in Calendar tab");
		SR.checkinfoincalendartab();
	}
	@Test(priority = 9019, description = "Check whether the settings can be saved")
	public void TC_9_017_Subscriber_checkcalendersettingscanbesaved() throws Exception {
		ExtentTestManager.getTest().setDescription("Check whether the settings can be saved");
		SR.checkcalendersettingscanbesaved();
	}
	
/*	@Test(priority = 9020, description = "Check whether the settings can be saved")
	public void TC_9_018_Subscriber_checkcalendersettingscanbesaved() throws Exception {
		ExtentTestManager.getTest().setDescription("Check whether the settings can be saved");
		SR.checkcalendersettingscanbesaved();
	}
	*/
	@Test(priority = 9021, description = "Check the info in Staff Notification")
	public void TC_9_019_Subscriber_verifytabsinstaffnotificationpage() throws Exception {
		ExtentTestManager.getTest().setDescription("Check the info in Staff Notification");
		SR.verifytabsinstaffnotificationpage();
	}
	
	@Test(priority = 9022 , description = "Check for validations in Staff Notification page")
	public void TC_9_020_checkvalidationinstaffnotificationpage() throws Exception { 
		ExtentTestManager.getTest().setDescription("Check the info in Staff Notification");
		SR.checkvalidationinstaffnotificationpage();
	}
	/*@Test(priority = 9023 , description = "Check for validations in Staff Notification page")
	public void TC_9_021_checkvalidationinstaffnotificationpage() throws Exception { 
		ExtentTestManager.getTest().setDescription("Check the info in Staff Notification");
		SR.checkvalidationinstaffnotificationpage();
	}
	@Test(priority = 9024 , description = "Check for validations in Staff Notification page")
	public void TC_9_022_checkvalidationinstaffnotificationpage() throws Exception { 
		ExtentTestManager.getTest().setDescription("Check the info in Staff Notification");
	}
	@Test(priority = 9025 , description = "Check for validations in Staff Notification page")
	public void TC_9_023_checkvalidationinstaffnotificationpage() throws Exception { 
		ExtentTestManager.getTest().setDescription("Check the info in Staff Notification");
	}
	@Test(priority = 9026 , description = "Check for validations in Staff Notification page")
	public void TC_9_024_checkvalidationinstaffnotificationpage() throws Exception { 
		ExtentTestManager.getTest().setDescription("Check the info in Staff Notification");
	}*/
	
	@Test(priority = 9027 , description = "Check the info in Payment Settings")
	public void TC_9_025_checkinfoinpaymentsettings() throws Exception { 
		ExtentTestManager.getTest().setDescription("Check the info in Payment Settings");
		SR.checkinfoinpaymentsettings();
	}
	
	/*@Test(priority = 9028 , description = "Check the info in Payment Settings")
	public void TC_9_026_checkinfoinpaymentsettings() throws Exception { 
		ExtentTestManager.getTest().setDescription("Check the info in Payment Settings");
		SR.VerifywhetherPaymentSettingsAreapplied();
	}*/
	
	@Test(priority = 9029 , description = "Check whether the settings are saved after selecting any option")
	public void TC_9_027_select_select_AppropriateRadiobutton_InPaymentSettings() throws Exception { 
		ExtentTestManager.getTest().setDescription("Check whether the settings are saved after selecting any option");
		SR.select_AppropriateRadiobutton_InPaymentSettings();
	}
	@Test(priority = 9030 , description = "Verify whether the Payment Settings are applied")
	public void TC_9_028_VerifywhetherPaymentSettingsAreapplied() throws Exception { 
		ExtentTestManager.getTest().setDescription("Verify whether the Payment Settings are applied");
		SR.VerifywhetherPaymentSettingsAreapplied();
		SR.logIn_ToDashboard();
		SR.openbusinesssettingspage();
	}
	
	@Test(priority = 9031 , description = "Check the info in Manage Menu")
	public void TC_9_029_checkinfoinmanagemenu() throws Exception { 
		ExtentTestManager.getTest().setDescription("Check the info in Manage Menu");
		SR.checkinfoinmanagemenu();
	}
	@Test(priority = 9032 , description = "Verify the changes in Manage Menu")
	public void TC_9_030_verifychangesinmanagemenu() throws Exception { 
		ExtentTestManager.getTest().setDescription("Verify the changes in Manage Menu");
		SR.verifychangesinmanagemenu();
	}
	@Test(priority = 9033 , description = "Check info in Social Links tab")
	public void TC_9_031_checkinfoonsociallinkstab() throws Exception { 
		ExtentTestManager.getTest().setDescription("Check info in Social Links tab");
		SR.checkinfoonsociallinkstab();
	}
	
	@Test(priority = 9034 , description = "Check if the Save button is clickable after adding data in any field")
	public void TC_9_032_dataentryfieldvalidity() throws Exception { 
		ExtentTestManager.getTest().setDescription("Check if the Save button is clickable after adding data in any field");
		SR.dataentryfieldvalidity();
	}
	@Test(priority = 9035 , description = "Check the info in Business Hours tab")
	public void TC_9_033_checkinfoinbusinessinfopage() throws Exception { 
		ExtentTestManager.getTest().setDescription("Check the info in Business Hours tab");
		SR.checkinfoinbusinessinfopage();
	}
	
	@Test(priority = 9036, description = "Check for Validations if Updated without specifying business hours")
	public void TC_9_034_check_UpdatedwithoutSpecifyingBusinesshours() throws Exception { 
		ExtentTestManager.getTest().setDescription("Check for Validations if Updated without specifying business hours");
		SR.check_UpdatedwithoutSpecifyingBusinesshours();
		
	}
	@Test(priority = 9037, description = "Check whether the Business Hours can be added")
	public void TC_9_035_checkwhether_BusinessHours_added() throws Exception { 
		ExtentTestManager.getTest().setDescription("Check whether the Business Hours can be added");
		SR.checkwhether_BusinessHours_added();
		
	}
	@Test(priority = 9038, description = "Check whether the Business Hours can be added")
	public void TC_9_036_checkwhether_BusinessHours_added() throws Exception { 
		ExtentTestManager.getTest().setDescription("Check whether the Business Hours can be added");
		SR.checkwhether_BusinessHours_added();
	}
	@Test(priority = 9039, description = "Check whether the Add Holiday button is clickable")
	public void TC_9_037_checkwhether_AddHoliday_ButtonIsClickable() throws Exception { 
		ExtentTestManager.getTest().setDescription("Check whether the Add Holiday button is clickable");
		SR.checkwhether_AddHoliday_ButtonIsClickable();
		
	}
	@Test(priority = 9040, description = "Check whether the close button is clickable")
	public void TC_9_038_checkwhether_CloseButton_IsClickable() throws Exception { 
		ExtentTestManager.getTest().setDescription("Check whether the close button is clickable");
		SR.checkwhether_CloseButton_IsClickable();
		
	}
	@Test(priority = 9041, description = "Check the field validations in Add Holiday popup")
	public void TC_9_039_check_FieldValidations_InAddHolidayPopup() throws Exception { 
		ExtentTestManager.getTest().setDescription("Check the field validations in Add Holiday popup");
		SR.check_FieldValidations_InAddHolidayPopup();
		
	}
}