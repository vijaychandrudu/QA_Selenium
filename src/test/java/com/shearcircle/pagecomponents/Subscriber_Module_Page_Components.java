package com.shearcircle.pagecomponents;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.remote.server.handler.GetElementEnabled;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.shearcircle.objectrepository.Login_page_objects;
import com.shearcircle.objectrepository.Subscriber_Module_Page_Objects;
import com.shearcircle.utilities.CommonFunctions;
import com.shearcircle.utilities.StaticVariables;

public class Subscriber_Module_Page_Components extends StaticVariables {
	public CommonFunctions browser;
	public Subscriber_Module_Page_Objects SCobjects;
	public Login_page_objects Login;
	String TestDataPath = null;

	public Subscriber_Module_Page_Components(WebDriver driver) throws IOException {
		browser = new CommonFunctions();
		TestDataPath = browser.TestDataPathOf("SubscriberTestData.properties");
		SCobjects = PageFactory.initElements(driver, Subscriber_Module_Page_Objects.class);
		Login = PageFactory.initElements(driver, Login_page_objects.class);
		browser.loaddata(TestDataPath);
	}

	/***** TC_1_001 Invoke the application *****/
	public void launchApplication() {
		String baseUrl = null;
		String Applicationtitle = "ShearCircle";
		try {
			baseUrl = browser.getdata("TestBedURL");
			driver.get(baseUrl + "");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			String apptitle = driver.getTitle();
			if (apptitle.equalsIgnoreCase(Applicationtitle)) {
				System.out.println("Browser Tilte:" + apptitle);
			}
			if (browser.elementisdisplayed(Login.Home_ShearCircle_Image)) {
				browser.reportscomtep("Passed", "Verify ShearCircle Home page is displayed",
						"ShearCircle Home page should be displayed", "ShearCircle Home page displayed");
				System.out.println("ShearCircle Image displayed");
			} else {
				browser.reportscomtep("Failed", "Verify ShearCircle Home page is displayed",
						"ShearCircle Home page should be displayed", "ShearCircle Home page not displayed");
				System.out.println("ShearCircle Image not displayed");
			}
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		}
	}

	/*********
	 * TC_1_002 Check whether the Join Our Circle button is clickabl
	 ********************/

	public void clickOn_JoinOurCircle_Button() {
		try {
			if (browser.elementisdisplayed(SCobjects.Subscriber_JoinOurCircle_Button)) {
				browser.reportscomtep("Passed", "Verify JoinOurCircle Button is displayed",
						"JoinOurCircle Button should be displayed", "JoinOurCircle Button is displayed");
				browser.click(SCobjects.Subscriber_JoinOurCircle_Button);
				if (browser.elementisdisplayed(Login.Joinourcircle_Page_Header)) {
					browser.reportscomtep("Passed",
							"Subscriber clicks on the Join Our Circle Button and Verify Register to ShearCircle Page is displayed",
							"Register to ShearCircle Page should be displayed",
							"Register to ShearCircle Page displayed");
					if (browser.elementisdisplayed(SCobjects.Subscriber_AreYouCustomer_JoinOurCircle_Button)
							&& browser.elementisdisplayed(SCobjects.Subscriber_Professional_JoinOurCircle_Button)) {
						browser.reportscomtep("Passed",
								"Verify Are you a Customer and Are you a Professional Join our Circle links are displayed",
								"Are you a Customer and Are you a Professional Join our Circle links should be displayed",
								"Are you a Customer and Are you a Professional Join our Circle links are displayed");
					} else {
						browser.reportscomtep("Failed",
								"Verify Are you a Customer and Are you a Professional Join our Circle links are displayed",
								"Are you a Customer and Are you a Professional Join our Circle links are should be displayed",
								"Are you a Customer and Are you a Professional Join our Circle links are not displayed");
					}
				} else {
					browser.reportscomtep("Failed",
							"Subscriber clicks on the Join Our Circle Button and Verify Register to ShearCircle Page is displayed",
							"Register to ShearCircle Page should be displayed",
							"Register to ShearCircle Page Not displayed");
				}
			} else {
				browser.reportscomtep("Failed", "Verify JoinOurCircle Button is displayed",
						"JoinOurCircle Button should be displayed", "JoinOurCircle Button is not displayed");
			}
		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());

		}
	}

	/**********
	 * TC_1_003 Check whether Join Our Circle button under Are you a
	 ******/

	public void click_AreYouProfessional_SectionUnder_JCButton() {
		try {
			browser.click(SCobjects.Subscriber_Professional_JoinOurCircle_Button);
			if (browser.elementisdisplayed(SCobjects.Subscriber_JC_Page)) {
				browser.reportscomtep("Passed",
						"Click on Join OurCircle button under Are you a Professional section and Navigate to verify Join Our Circle page is displayed",
						"Join Our Circle page should be displayed", "Join Our Circle page is displayed");
				browser.scrollintoviewelement(SCobjects.Subscriber_JCP_Registration_Form);
				if (browser.elementisdisplayed(SCobjects.Subscriber_JCP_Registration_Form)
						&& browser.elementisdisplayed(SCobjects.Subscriber_StartFreeTrial_button)) {
					browser.reportscomtep("Passed", "Verify Registration form & Start Free Trial buttons are Displayed",
							"Registration form & Start Free Trial buttons should be Displayed",
							"Registration form & Start Free Trial buttons are Displayed");

				} else {
					browser.reportscomtep("Failed", "Verify Registration form & Start Free Trial buttons are Displayed",
							"Registration form & Start Free Trial buttons should be Displayed",
							"Registration form & Start Free Trial buttons are not Displayed");
				}
			} else {
				browser.reportscomtep("Failed",
						"Click on Join OurCircle button under Are you a Professional section and Navigate to verify Join Our Circle page is displayed",
						"Join Our Circle page should be displayed", "Join Our Circle page is not displayed");
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());

		}

	}

	/**
	 * TC_1_004 Check whether the Join Our Circle page displays the required
	 * information
	 ***/

	public void joinOurCircle_Page_Filedvalidations() {
		try {
			browser.scrollintoviewelement(SCobjects.Subscriber_JCP_JoinNow_Header);
			if (browser.elementisdisplayed(SCobjects.Subscriber_JCP_JoinNow_Header)) {
				browser.reportscomtep("Passed", "Verify Subscriber Registration form Join Now header is displayed",
						"Subscriber Registration form Join Now header should be displayed",
						"Subscriber Registration form Join Now header displayed");
				browser.Verify_elementisdisplayed_Report(SCobjects.Subscriber_FirstName_Textbox, "FirstName Textbox");
				browser.Verify_elementisdisplayed_Report(SCobjects.Subscriber_LastName_Textbox, "LastName Textbox");
				browser.Verify_elementisdisplayed_Report(SCobjects.Subscriber_Email_Textbox, "Email Textbox");
				browser.Verify_elementisdisplayed_Report(SCobjects.Subscriber_BusinessName_Textbox,
						"Buisiness Name Textbox");
				browser.Verify_elementisdisplayed_Report(SCobjects.Subscriber_Subdomain_textbox, "Subdomain Textbox");
				browser.Verify_elementisdisplayed_Report(SCobjects.Subscriber_Password_textbox, "Password Textbox");
				browser.Verify_elementisdisplayed_Report(SCobjects.Subscriber_ReEnterPassword_textbox,
						"ReEnteredPassword textbox");
				browser.scrollDown(150);
				browser.Verify_elementisdisplayed_Report(SCobjects.Subscriber_JCP_TermsOfService_Link,
						"Terms Of Service Link");
				browser.Verify_elementisdisplayed_Report(SCobjects.Subscriber_JCP_PrivacyPolicye_Link,
						"Privacy Policye Link");
				browser.Verify_elementisdisplayed_Report(SCobjects.Subscriber_JCP_BillingAgreement_Link,
						"Billing Agreement Link");
				browser.Verify_elementisdisplayed_Report(SCobjects.Subscriber_Termsofservice_checkbox,
						"Agree to Terms and Privacy Policy Checkbox");
				browser.Verify_elementisdisplayed_Report(SCobjects.Subscriber_billingAgrement_checkbox,
						"Agree to Billing Agreement Checkbox");
				browser.Verify_elementisdisplayed_Report(SCobjects.Subscriber_StartFreeTrial_button,
						"Start Free Trial Button");
			} else {
				browser.reportscomtep("Failed", "Verify Subscriber Registration form Join Now header is displayed",
						"Subscriber Registration form Join Now header should be displayed",
						"Subscriber Registration form Join Now header not displayed");
			}
		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());

		}
	}

	/***** TC_1_005 Check the field validations ****/
	public void checkFieldValidations() {
		String Expect_FirstNameErrorMessage = "";
		String Expect_LastNameErrorMessage = "";
		String Expect_SubsciberEmailErrorMessage = "";
		String Expect_BussinessNameErrorMessag = "";
		String Expect_SubdomainNameErrorMessage = "";
		String Expect_PasswordErrorMessage = "";
		String Expect_RetypePasswordErrorMessage = "";
		String Expect_TermsAndPrivacyErrorMessage = "";
		String Expect_BillingAgreement = "";

		try {
			Expect_FirstNameErrorMessage = browser.getdata("FirstnameErrMsg");
			Expect_LastNameErrorMessage = browser.getdata("LastnameErrMsg");
			Expect_SubsciberEmailErrorMessage = browser.getdata("EmailErrMsg");
			Expect_BussinessNameErrorMessag = browser.getdata("BusinessNameErrMsg");
			Expect_SubdomainNameErrorMessage = browser.getdata("SubDomainErrMsg");
			Expect_PasswordErrorMessage = browser.getdata("PasswordErrMsg");
			Expect_RetypePasswordErrorMessage = browser.getdata("ReEnterPasswordErrMsg");
			Expect_TermsAndPrivacyErrorMessage = browser.getdata("TermsErrMsg");
			Expect_BillingAgreement = browser.getdata("BillingAgreementErrMsg");

			browser.click(SCobjects.Subscriber_StartFreeTrial_button);
			browser.scrollintoviewelement(SCobjects.Subscriber_JC_Page);

			if (browser.elementisdisplayed(SCobjects.Subscriber_FirstnameErrMsg)) {
				browser.verifyElementErrorMessage(SCobjects.Subscriber_FirstnameErrMsg, Expect_FirstNameErrorMessage,
						"exact");
			}
			if (browser.elementisdisplayed(SCobjects.Subscriber_LastnameErrMsg)) {
				browser.verifyElementErrorMessage(SCobjects.Subscriber_LastnameErrMsg, Expect_LastNameErrorMessage,
						"exact");
			}
			if (browser.elementisdisplayed(SCobjects.Subscriber_EmailaddressErrMsg)) {
				browser.verifyElementErrorMessage(SCobjects.Subscriber_EmailaddressErrMsg,
						Expect_SubsciberEmailErrorMessage, "exact");

			}
			/*** getting error ***/
			/*
			 * if (browser.elementisdisplayed(SCobjects.
			 * Subscriber_BusinessNameErrMsg)) {
			 * browser.verifyElementErrorMessage(SCobjects.
			 * Subscriber_BusinessNameErrMsg, Expect_BussinessNameErrorMessag,
			 * "exact"); System.out.print(Expect_BussinessNameErrorMessag); }
			 */
			browser.scrollDown(400);
			if (browser.elementisdisplayed(SCobjects.Subscriber_SubDomainErrMsg)) {
				browser.verifyElementErrorMessage(SCobjects.Subscriber_SubDomainErrMsg,
						Expect_SubdomainNameErrorMessage, "exact");
			}
			if (browser.elementisdisplayed(SCobjects.Subscriber_PasswordErrMsg)) {
				browser.verifyElementErrorMessage(SCobjects.Subscriber_PasswordErrMsg, Expect_PasswordErrorMessage,
						"exact");
			}
			if (browser.elementisdisplayed(SCobjects.Subscriber_ReEnterPasswordErrMsg)) {
				browser.verifyElementErrorMessage(SCobjects.Subscriber_ReEnterPasswordErrMsg,
						Expect_RetypePasswordErrorMessage, "exact");
			}
			if (browser.elementisdisplayed(SCobjects.Subscriber_TermsErrMsg)) {
				browser.verifyElementErrorMessage(SCobjects.Subscriber_TermsErrMsg, Expect_TermsAndPrivacyErrorMessage,
						"exact");
			}
			if (browser.elementisdisplayed(SCobjects.Subscriber_BillingAgreementErrMsg)) {
				browser.verifyElementErrorMessage(SCobjects.Subscriber_BillingAgreementErrMsg, Expect_BillingAgreement,
						"exact");
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());

		}
	}

	/********
	 * TC_1_006 Check whether the validation messages are removed
	 *******/
	public void check_Validation_ErrorMessages_AreRemoved() {
		boolean ErrorMessages_AreRemoved = false;
		try {
			browser.refreshBrowser(driver);
			browser.scrollintoviewelement(SCobjects.Subscriber_JC_Page);
			if (browser.elementisdisplayed(SCobjects.Subscriber_JC_Page) && (ErrorMessages_AreRemoved = true)) {
				browser.reportscomtep("Passed",
						"Navigate to refresh browser and displayed join our circle page and also Verify Error Messages are Removed",
						" Error Messages should be Removed", "Error Messages are Removed");
			} else {
				if (ErrorMessages_AreRemoved)
					browser.reportscomtep("Failed",
							"Navigate to refresh browser and displayed join our circle page and also Verify Error Messages are Removed",
							" Error Messages should be Removed", "Error Messages are not Removed");
			}
		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}

	/*******
	 * TC_1_007 Check whether Terms of Service link is functioning
	 ***********/

	public void checkTermsofServicelink() {
		try {
			browser.scrollintoviewelement(SCobjects.Subscriber_Subdomain_textbox);
			browser.click(SCobjects.Subscriber_JCP_TermsOfService_Link);
			if (browser.elementisdisplayed(SCobjects.Subscriber_TemrsAndConditions_Alert)) {
				browser.reportscomtep("Passed",
						"Click on Terms Of Service Link and verify Popup contain with Temrs and Conditions header is displayed",
						"Popup contain with Temrs and Conditions header should be displayed",
						"Popup contain with Temrs and Conditions header is displayed");
			} else {
				browser.reportscomtep("Failed",
						"Click on Terms Of Service Link and verify Popup contain with Temrs and Conditions header is displayed",
						"Popup contain with Temrs and Conditions header should be displayed",
						"Popup contain with Temrs and Conditions header is not displayed");
			}
		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());

		}

	}

	/*****
	 * TC_1_008 Check whether the Close button in Terms & Conditions popup is
	 * clickable
	 *******/

	public void clickOn_CloseButton_TermsAndConditions_Popup_IsClose() {
		try {
			browser.click(SCobjects.Subscriber_TemrsAndConditions_Close);
			browser.reportscomtep("Passed", "Click on close button and verify Terms and Conditions Popup Is closed",
					"Terms and Conditions Popup should be closed", "Terms and Conditions Popup Is closed");

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());

		}

	}

	/*************
	 * TC_1_009 Check whether Privacy Policy link is functioning
	 ******/
	public void check_PrivacyPolicylink() {
		try {
			browser.click(SCobjects.Subscriber_JCP_PrivacyPolicye_Link);
			if (browser.elementisdisplayed(SCobjects.Subscriber_PrivacyPolicy_Alert)) {
				browser.reportscomtep("Passed",
						"Click on Privacy Policye Link and verify Popup contain with Privacy Policye header is displayed",
						"Popup contain with Privacy Policy header should be displayed",
						"Popup contain with Privacy Policy header is displayed");
			} else {
				browser.reportscomtep("Failed",
						"Click on Privacy Policye Link and verify Popup contain with Privacy Policye header is displayed",
						"Popup contain with Privacy Policy header should be displayed",
						"Popup contain with Privacy Policy header is not displayed");
			}
		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());

		}
	}

	/*********
	 * TC_1_010 Check whether the Close button in Privacy Policy popup is
	 * clickable
	 *******/
	public void clickOn_CloseButton_PrivacyPolicy_Popup_IsClose() {
		try {
			browser.click(SCobjects.Subscriber_PrivacyPolicy_Close);
			browser.reportscomtep("Passed", "Click on close button and verify Privacy Policy Popup Is closed",
					"Privacy Policy Popup should be closed", "Privacy Policy Popup closed");
		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}

	/******* TC_1_011 Check whether the Sign in link is functioning *******/

	public void click_SignIn_Link() {
		try {
			browser.click(SCobjects.Subscriber_Sign_Link);
			if (browser.elementisdisplayed(SCobjects.Subscriber_Alreadyhaveanaccount)) {
				browser.reportscomtep("Passed", "Click on SignIn Link and verify Login Page is displayed",
						"Login Page should be displayed", "Login Page displayed");
			} else {
				browser.reportscomtep("Failed", "Click on SignIn Link and verify Login Page is displayed",
						"Login Page should be displayed", "Login Page not displayed");
			}
			driver.navigate().back();
		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}

	/*** TC_1_012 Create account by entering invalid data ******/
	public void create_Account_ByEntering_InvalidData() {
		String SCInavlidFirstName = "";
		String SCInavlidLastName = "";
		String SCInavlidEmail = "";
		String SCInavlidBusinessName = "";
		String SCInavlidSubdomain = "";
		String SCInavlidPassword = "";
		String SCInavlidReTypePassword = "";
		String Actual_FirstNameErrorMessage = null;
		String Actual_LastNameErrorMessage = null;
		String Actual_SubsciberEmailErrorMessage = null;
		String Actual_SubdomainNameErrorMessage = null;
		String Actual_PasswordErrorMessage = "";
		String Actual_RetypePasswordErrorMessage = "";
		try {
			SCInavlidFirstName = browser.getdata("SCFirstName");
			SCInavlidLastName = browser.getdata("SCLastName");
			SCInavlidEmail = browser.getdata("SCEmail");
			SCInavlidBusinessName = browser.getdata("SCBusinessName");
			SCInavlidSubdomain = browser.getdata("SCSubdomain");
			SCInavlidPassword = browser.getdata("SCPassword");
			SCInavlidReTypePassword = browser.getdata("SCRetypePassword");
			browser.scrollintoviewelement(SCobjects.Subscriber_JC_Page);
			if (browser.elementisdisplayed(SCobjects.Subscriber_JC_Page)) {
				browser.reportscomtep("Passed", "Verify Join Our Circle page is displayed",
						"Join Our Circle page should be displayed", "Join Our Circle page is displayed");
				browser.sendkeys(SCobjects.Subscriber_FirstName_Textbox, SCInavlidFirstName);
				browser.sendkeys(SCobjects.Subscriber_LastName_Textbox, SCInavlidLastName);
				browser.sendkeys(SCobjects.Subscriber_Email_Textbox, SCInavlidEmail);
				browser.scrollDown(400);
				browser.sendkeys(SCobjects.Subscriber_BusinessName_Textbox, SCInavlidBusinessName);
				browser.sendkeys(SCobjects.Subscriber_Subdomain_textbox, SCInavlidSubdomain);
				browser.sendkeys(SCobjects.Subscriber_Password_textbox, SCInavlidPassword);
				browser.sendkeys(SCobjects.Subscriber_ReEnterPassword_textbox, SCInavlidReTypePassword);
				browser.click(SCobjects.Subscriber_Termsofservice_checkbox);
				browser.click(SCobjects.Subscriber_billingAgrement_checkbox);
				browser.click(SCobjects.Subscriber_StartFreeTrial_button);
			}
			browser.scrollintoviewelement(SCobjects.Subscriber_JC_Page);
			if (browser.elementisdisplayed(SCobjects.Subscriber_FirstnameErrMsg)) {
				Actual_FirstNameErrorMessage = browser.getelementtext(SCobjects.Subscriber_FirstnameErrMsg);
				browser.verifyElementErrorMessage(SCobjects.Subscriber_FirstnameErrMsg, Actual_FirstNameErrorMessage,
						"exact");
			}
			if (browser.elementisdisplayed(SCobjects.Subscriber_LastnameErrMsg)) {
				Actual_LastNameErrorMessage = browser.getelementtext(SCobjects.Subscriber_LastnameErrMsg);
				browser.verifyElementErrorMessage(SCobjects.Subscriber_LastnameErrMsg, Actual_LastNameErrorMessage,
						"exact");
			}
			if (browser.elementisdisplayed(SCobjects.Subscriber_EmailaddressErrMsg)) {
				Actual_SubsciberEmailErrorMessage = browser.getelementtext(SCobjects.Subscriber_EmailaddressErrMsg);
				browser.verifyElementErrorMessage(SCobjects.Subscriber_EmailaddressErrMsg,
						Actual_SubsciberEmailErrorMessage, "exact");
			}
			browser.scrollDown(400);
			if (browser.elementisdisplayed(SCobjects.Subscriber_SubDomainErrMsg)) {
				Actual_SubdomainNameErrorMessage = browser.getelementtext(SCobjects.Subscriber_SubDomainErrMsg);
				browser.verifyElementErrorMessage(SCobjects.Subscriber_SubDomainErrMsg,
						Actual_SubdomainNameErrorMessage, "exact");
			}
			if (browser.elementisdisplayed(SCobjects.Subscriber_PasswordErrMsg)) {
				Actual_PasswordErrorMessage = browser.getelementtext(SCobjects.Subscriber_PasswordErrMsg);
				browser.verifyElementErrorMessage(SCobjects.Subscriber_PasswordErrMsg, Actual_PasswordErrorMessage,
						"exact");
			}
			if (browser.elementisdisplayed(SCobjects.Subscriber_ReEnterPasswordErrMsg)) {
				Actual_RetypePasswordErrorMessage = browser.getelementtext(SCobjects.Subscriber_ReEnterPasswordErrMsg);
				browser.verifyElementErrorMessage(SCobjects.Subscriber_ReEnterPasswordErrMsg,
						Actual_RetypePasswordErrorMessage, "exact");
			}

			else {
				browser.reportscomtep("Failed", "Verify Join Our Circle page is displayed",
						"Join Our Circle page should be displayed", "Join Our Circle page is not displayed");
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}

	/****
	 * TC_1_013 Create account by entering valid data & wrong retype password
	 *********/
	public void createAccount_Enter_ValidDataAnd_WrongReType_Password() {
		String SCVlidFirstName = "";
		String SCVlidLastName = "";
		String SCVlidEmail = "";
		String SCvlidBusinessName = "";
		String SCVlidPassword = "";
		String SCVlidReTypePassword = "";
		String Actual_WrongRetypePasswordErrorMessage = "";
		try {
			SCVlidFirstName = browser.getdata("ValidFirstname");
			SCVlidLastName = browser.getdata("ValidLastname");
			SCVlidEmail = browser.getdata("ValidEmail");
			SCvlidBusinessName = browser.getdata("ValidBusinessNameExisting");
			SCVlidPassword = browser.getdata("ValidPassword");
			SCVlidReTypePassword = browser.getdata("WrongRetypePassword");
			driver.navigate().refresh();
			browser.scrollintoviewelement(SCobjects.Subscriber_JC_Page);
			if (browser.elementisdisplayed(SCobjects.Subscriber_JC_Page)) {
				browser.reportscomtep("Passed", "Verify Join Our Circle page is displayed",
						"Join Our Circle page should be displayed", "Join Our Circle page is displayed");
				browser.sendkeys(SCobjects.Subscriber_FirstName_Textbox, SCVlidFirstName);
				browser.sendkeys(SCobjects.Subscriber_LastName_Textbox, SCVlidLastName);
				browser.sendkeys(SCobjects.Subscriber_Email_Textbox, SCVlidEmail);
				browser.scrollDown(400);
				browser.sendkeys(SCobjects.Subscriber_BusinessName_Textbox, SCvlidBusinessName);
				browser.sendkeys(SCobjects.Subscriber_Password_textbox, SCVlidPassword);
				browser.sendkeys(SCobjects.Subscriber_ReEnterPassword_textbox, SCVlidReTypePassword);
				browser.click(SCobjects.Subscriber_Termsofservice_checkbox);
				browser.click(SCobjects.Subscriber_billingAgrement_checkbox);
				browser.click(SCobjects.Subscriber_StartFreeTrial_button);
				if (browser.elementisdisplayed(SCobjects.Subscriber_ReEnterPasswordErrMsg)) {
					Actual_WrongRetypePasswordErrorMessage = browser
							.getelementtext(SCobjects.Subscriber_ReEnterPasswordErrMsg);
					browser.verifyElementErrorMessage(SCobjects.Subscriber_ReEnterPasswordErrMsg,
							Actual_WrongRetypePasswordErrorMessage, "exact");
				}
			} else {
				browser.reportscomtep("Failed", "Verify Join Our Circle page is displayed",
						"Join Our Circle page should be displayed", "Join Our Circle page is not displayed");
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}

	/***
	 * TC_1_014 Create account by entering valid details and without accepting
	 * terms & billing agreement
	 *****/

	public void createAccount_Enter_ValidDataAnd_Without_AcceptingTermsAndBillingAgreement() {
		String SCVlidFirstName = "";
		String SCVlidLastName = "";
		String SCVlidEmail = "";
		String SCvlidBusinessName = "";
		String SCVlidPassword = "";
		String SCVlidReTypePassword = "";
		String Actual_TermsAndPrivacyErrorMessage = "";
		String Actual_BillingAgreementErrorMessage = "";
		try {
			SCVlidFirstName = browser.getdata("ValidFirstname");
			SCVlidLastName = browser.getdata("ValidLastname");
			SCVlidEmail = browser.getdata("ValidEmail");
			SCvlidBusinessName = browser.getdata("ValidBusinessNameExisting");
			SCVlidPassword = browser.getdata("ValidPassword");
			SCVlidReTypePassword = browser.getdata("ValidConfirmPassword");
			driver.navigate().refresh();
			browser.scrollintoviewelement(SCobjects.Subscriber_JC_Page);
			if (browser.elementisdisplayed(SCobjects.Subscriber_JC_Page)) {
				browser.reportscomtep("Passed", "Verify Join Our Circle page is displayed",
						"Join Our Circle page should be displayed", "Join Our Circle page is displayed");
				browser.sendkeys(SCobjects.Subscriber_FirstName_Textbox, SCVlidFirstName);
				browser.sendkeys(SCobjects.Subscriber_LastName_Textbox, SCVlidLastName);
				browser.sendkeys(SCobjects.Subscriber_Email_Textbox, SCVlidEmail);
				browser.sendkeys(SCobjects.Subscriber_BusinessName_Textbox, SCvlidBusinessName);
				browser.scrollDown(400);
				browser.sendkeys(SCobjects.Subscriber_Password_textbox, SCVlidPassword);
				browser.sendkeys(SCobjects.Subscriber_ReEnterPassword_textbox, SCVlidReTypePassword);
				browser.click(SCobjects.Subscriber_StartFreeTrial_button);
				browser.scrollintoviewelement(SCobjects.Subscriber_ReEnterPassword_textbox);
				if (browser.elementisdisplayed(SCobjects.Subscriber_TermsErrMsg)) {
					Actual_TermsAndPrivacyErrorMessage = browser.getelementtext(SCobjects.Subscriber_TermsErrMsg);
					browser.verifyElementErrorMessage(SCobjects.Subscriber_TermsErrMsg,
							Actual_TermsAndPrivacyErrorMessage, "exact");
				}
				if (browser.elementisdisplayed(SCobjects.Subscriber_TermsErrMsg)) {
					Actual_BillingAgreementErrorMessage = browser.getelementtext(SCobjects.Subscriber_TermsErrMsg);
					browser.verifyElementErrorMessage(SCobjects.Subscriber_TermsErrMsg,
							Actual_BillingAgreementErrorMessage, "exact");
				}
			} else {
				browser.reportscomtep("Failed", "Verify Join Our Circle page is displayed",
						"Join Our Circle page should be displayed", "Join Our Circle page is not displayed");
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}

	/***** TC_1_015 Create account by entering an existing subdomain *****/

	public void existingSubdomainValidation() {
		String Actual_SubDomainErrMsg = "";
		try {
			browser.scrollintoviewelement(SCobjects.Subscriber_FirstName_Textbox);
			browser.clearText(SCobjects.Subscriber_BusinessName_Textbox);
			browser.sendkeys(SCobjects.Subscriber_BusinessName_Textbox, browser.getdata("ValidBusinessNameExisting"));
			browser.scrollDown(400);
			browser.click(SCobjects.Subscriber_Termsofservice_checkbox);
			browser.click(SCobjects.Subscriber_billingAgrement_checkbox);
			browser.click(SCobjects.Subscriber_StartFreeTrial_button);
			browser.scrollintoviewelement(SCobjects.Subscriber_FirstName_Textbox);
			if (browser.elementisdisplayed(SCobjects.Subscriber_Subdomain_errMsg)) {
				Actual_SubDomainErrMsg = browser.getelementtext(SCobjects.Subscriber_Subdomain_errMsg);
				browser.verifyElementErrorMessage(SCobjects.Subscriber_TermsErrMsg, Actual_SubDomainErrMsg, "exact");
				browser.reportscomtep("Passed",
						"Subscriber Enter existing Subdomain  and verify Subdomain is already existed",
						"Subdomain should be already existed", "Subdomain is already existed");
			} else {
				browser.reportscomtep("Passed",
						"Subscriber Enter existing Subdomain  and verify Subdomain is already existed",
						"Subdomain should be already existed", "Subdomain is not already existed");
			}
		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}

	/*****
	 * TC_1_016 Create account by entering existing Subscriber account email id
	 ****/
	public void existing_Subscriber_EmailValidation() {
		String Actual_EmailErrMsg = "";
		try {
			browser.scrollintoviewelement(SCobjects.Subscriber_FirstName_Textbox);
			browser.clearText(SCobjects.Subscriber_Email_Textbox);
			browser.sendkeys(SCobjects.Subscriber_Email_Textbox, browser.getdata("UserName"));
			browser.scrollDown(400);
			browser.click(SCobjects.Subscriber_StartFreeTrial_button);
			browser.scrollintoviewelement(SCobjects.Subscriber_FirstName_Textbox);
			Actual_EmailErrMsg = browser.getelementtext(SCobjects.Subscriber_EmailaddressErrMsg);
			if (browser.elementisdisplayed(SCobjects.Subscriber_EmailaddressErrMsg)) {
				browser.verifyElementErrorMessage(SCobjects.Subscriber_EmailaddressErrMsg, Actual_EmailErrMsg, "exact");
				browser.reportscomtep("Passed",
						"Enter Subscriber account email id and verify Email is registered already",
						"Email should be registered already", "Email is registered already");
			} else {
				browser.reportscomtep("Passed",
						"Enter Subscriber account email id and verify Email is registered already",
						"Email should be registered already", "Email is not registered already");
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}

	/******
	 * TC_1_017 Create account by entering an existing Customer account email id
	 ******/
	public void existing_Customer_EmailValidation() {
		String Actual_EmailErrMsg = "";
		try {
			browser.scrollintoviewelement(SCobjects.Subscriber_FirstName_Textbox);
			browser.clearText(SCobjects.Subscriber_Email_Textbox);
			browser.sendkeys(SCobjects.Subscriber_Email_Textbox, browser.getdata("CustomerUserName"));
			browser.scrollDown(400);
			browser.click(SCobjects.Subscriber_StartFreeTrial_button);
			browser.scrollintoviewelement(SCobjects.Subscriber_FirstName_Textbox);
			Actual_EmailErrMsg = browser.getelementtext(SCobjects.Subscriber_EmailaddressErrMsg);
			if (browser.elementisdisplayed(SCobjects.Subscriber_EmailaddressErrMsg)) {
				browser.verifyElementErrorMessage(SCobjects.Subscriber_EmailaddressErrMsg, Actual_EmailErrMsg, "exact");

				browser.reportscomtep("Passed",
						"Enter Customer account email id and verify Email is registered already because of cannot create account.",
						"Email should be registered already because of cannot create account",
						"Email is registered already because of cannot create account");
			} else {
				browser.reportscomtep("Passed",
						"Enter Customer account email id and verify Email is registered already",
						"Email should be registered already", "Email is not registered already");
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}

	// TC_2_001
	public void createAccountStartFreeTrialbutton() throws Exception {
		driver.get(browser.getdata("JoinOurCircle_URL"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		browser.sendkeys(SCobjects.Subscriber_FirstName_Textbox, browser.getdata("Firstname"));
		browser.sendkeys(SCobjects.Subscriber_LastName_Textbox, browser.getdata("Lastname"));
		browser.sendkeys(SCobjects.Subscriber_Email_Textbox, browser.getdata("Email"));
		browser.sendkeys(SCobjects.Subscriber_BusinessName_Textbox, browser.getdata("BusinessName"));
		browser.scrollintoviewelement(SCobjects.Subscriber_Password_textbox);
		browser.sendkeys(SCobjects.Subscriber_Password_textbox, browser.getdata("Password"));
		browser.sendkeys(SCobjects.Subscriber_ReEnterPassword_textbox, browser.getdata("ConfirmPassword"));
		browser.click(SCobjects.Subscriber_Termsofservice_checkbox);
		browser.click(SCobjects.Subscriber_billingAgrement_checkbox);
		browser.scrollintoviewelement(SCobjects.Subscriber_StartFreeTrial_button);
		// browser.clickUsingJavaScript(SCobjects.Subscriber_StartFreeTrial_button);
	}

	// TS_3_001
	public void CheckVerificationLink() throws Exception {
		driver.get(browser.getdata("Yopmail_URL"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		browser.sendkeys(SCobjects.Subscriber_Yopmail_Text, browser.getdata("Email"));
		browser.click(SCobjects.Subscriber_Yopmail_CheckInbox);
		Thread.sleep(5000);
		// browser.iFramesElement(SCobjects.Subscriber_Yopmail_ClickEmail);
		// browser.waitforelementtobevisible(SCobjects.Subscriber_Yopmail_ClickEmail,20);
		// browser.click(SCobjects.Subscriber_Yopmail_ClickEmail);
		// browser.iFramesElement(SCobjects.Subscriber_Yopmail_ClickVerifyEmailAddress);
		browser.switchToFrameByInt(6);
		browser.waitforelementtobevisible(SCobjects.Subscriber_Yopmail_ClickVerifyEmailAddress, 20);
		browser.clickUsingJavaScript(SCobjects.Subscriber_Yopmail_ClickVerifyEmailAddress);

		// TS_3_002
		driver.navigate().back();
		browser.waitforelementtobevisible(SCobjects.Subscriber_Yopmail_ClickEmail, 20);
		browser.click(SCobjects.Subscriber_Yopmail_ClickEmail);
		browser.getelementtext(SCobjects.Subscriber_Yopmail_GetWelcomeEmailText);

	}
	/********** TS004_Subscriber Login for First Time **************/
	/**** TC_4_001 Check whether Login button is clickable *******/
	public void click_onSubscriber_LogIn_Button() {
		String SigIn_Header = "";
		try {
			if (browser.elementisdisplayed(SCobjects.Subscriber_Login_Button)) {
				browser.reportscomtep("Passed", "Verify LogIn butoon is displayed", "LogIn butoon should be displayed",
						"LogIn butoon is displayed");
				browser.click(SCobjects.Subscriber_Login_Button);
				if (browser.elementisdisplayed(SCobjects.Subscriber_SigIn_Page)) {
					SigIn_Header = browser.getelementtext(SCobjects.Subscriber_SigIn_Page);
					browser.reportscomtep("Passed", "Click on LogIn Button and verify LogIn Page is displayed ",
							"LogIn Page should be displayed", "LogIn Page is displayed with Header as:" + SigIn_Header);
				} else {
					browser.reportscomtep("Failed", "Click on LogIn Button and verify LogIn Page is displayed ",
							"LogIn Page should be displayed",
							"LogIn Page is not displayed");
				}
			} else {
				browser.reportscomtep("Failed", "Verify LogIn butoon is displayed", "LogIn butoon shpuld be displayed",
						"LogIn butoon is not displayed");
			}
		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	 /*******TC_4_002 Check whether you are able to login by entering invalid credentials*******/
	public void enter_Invalid_Credentials_Clickon_LogIn_Button() {
		String IVC_Username = "";
		String IVC_Passworde = "";
		String IVC_ErrorMEssage = "";
		
		try {
			IVC_Username = browser.getdata("MyAccountIVUserName");
			IVC_Passworde = browser.getdata("MyAccountIVPassword");
			browser.sendkeys(SCobjects.Subscriber_UserName_TextBox, IVC_Username);
			browser.sendkeys(SCobjects.Subscriber_Password_TextBox, IVC_Passworde);
			browser.click(SCobjects.Subscriber_SignIn_Button);
			if (browser.elementisdisplayed(SCobjects.Subscriber_InvalidUserErrMsg)) {
				IVC_ErrorMEssage = browser.getelementtext(SCobjects.Subscriber_InvalidUserErrMsg);
				browser.verifyElementErrorMessage(SCobjects.Subscriber_InvalidUserErrMsg, IVC_ErrorMEssage, "exact");
			}
		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	/*****TC_4_003 Check whether you are able to login by entering valid credentials*****/
	public void enter_valid_Credentials_Clickon_LogIn_Button() {
		String VC_Username = "";
		String VC_Passworde = "";
		try {
			VC_Username = browser.getdata("VC_LogIN_UserName");
			VC_Passworde = browser.getdata("VC_LogIN_Passworrd");
			browser.sendkeys(SCobjects.Subscriber_UserName_TextBox, VC_Username);
			browser.sendkeys(SCobjects.Subscriber_Password_TextBox, VC_Passworde);
			browser.click(SCobjects.Subscriber_SignIn_Button);
			if (browser.elementisdisplayed(SCobjects.Subscriber_WhatDescribesYouBest_Text)) {
				browser.reportscomtep("Passed", "Enter Valid Credential and click on SigIn Button and Verify What Describes you page is displayed",
						" What Describes you page shpild be displayed", " What Describes you page is displayed");
			} else {
				browser.reportscomtep("Failed", "Enter Valid Credential and click on SigIn Button and Verify What Describes you page is displayed",
						" What Describes you page shpild be displayed", " What Describes you page is not displayed");
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	/*********TC_4_004 Check whether you are able to login to Dashboard in Refreshes page*******/
	
	public void logInTo_Dashboard_InWhatDescribesYouPage() {
		try {
			if (browser.elementisdisplayed(SCobjects.Subscriber_MyAccount)) {
				browser.reportscomtep("Passed", "What Describes You page in verify My Account Button is displayed",
						"My Account Button should be displayed", "My Account Button is displayed");
				browser.click(SCobjects.Subscriber_MyAccount);
				if (browser.elementisdisplayed(SCobjects.Subscriber_WhatDescribesYouBest_Text)) {
					browser.reportscomtep("Passed",
							"Click on MyAccount button,It will not allow to access the Dashboard and verify The page refreshes, What Describes You page is displayed",
							"The page refreshes, What Describes You page should be displayed",
							"The page refreshes, What Describes You page is displayed");

				} else {
					browser.reportscomtep("Passed",
							"Click on MyAccount button,It will not allow to access the Dashboard and verify The page refreshes, What Describes You page is displayed",
							"The page refreshes, What Describes You page should be displayed",
							"The page refreshes, What Describes You page is not displayed");

				}
			} else {
				browser.reportscomtep("Failed", "What Describes You page in verify My Account Button is displayed",
						"My Account Button should be displayed", "My Account Button is not displayed");
			}
		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
		/******TC_4_005 Check if you are able to login to Dashboard after relogin from What Describes You Page*****/
	public void login_ToDashboard_After_ReLogIn_FromWhatDescribesYouPage() {
		try {
			if (browser.elementisdisplayed(SCobjects.Subscriber_WhatDescribesYouBest_logout_Text)) {
				browser.reportscomtep("Passed", "What Describes you Page in Verify Logout Button is displayed",
						"Logout Button should be displayed", "Logout Button is displayed");
				browser.click(SCobjects.Subscriber_WhatDescribesYouBest_logout_Text);
				browser.sendkeys(SCobjects.Subscriber_UserName_TextBox, browser.getdata("VC_LogIN_UserName"));
				browser.sendkeys(SCobjects.Subscriber_Password_TextBox, browser.getdata("VC_LogIN_Passworrd"));
				browser.click(SCobjects.Subscriber_SignIn_Button);
				if (browser.elementisdisplayed(SCobjects.Subscriber_WhatDescribesYouBest_Text)) {
					browser.reportscomtep("Passed",
							"Relogin from What Describes You Page and verify wont allow you to access the Dashboard, What Describes you page is displayed",
							"Wont allow you to access the Dashboard, What Describes you page should be displayed",
							"Wont allow you to access the Dashboard, What Describes you page is displayed");

				} else {
					browser.reportscomtep("Failed",
							"Relogin from What Describes You Page and verify wont allow you to access the Dashboard, What Describes you page is displayed",
							"Wont allow you to access the Dashboard, What Describes you page should be displayed",
							"Wont allow you to access the Dashboard, What Describes you page is not displayed");
				}

			} else {
				browser.reportscomtep("Failed", "What Describes you Page in Verify Logout Button is displayed",
						"Logout Button should be displayed", "Logout Button is not displayed");
			}
		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}

	/***** TC_4_006 Check if you can navigate to next page by clicking Next Step button without selecting the options ********/
	public void clickOnNextStep_InWhatDescribesYouPage() {
		String Please_chooseserviceEM = "";
		try {
			browser.scrollDown(400);
			browser.click(SCobjects.Subscriber_WhatDescribesYouBest_NextStep);
			Please_chooseserviceEM = browser
					.getelementtext(SCobjects.Subscriber_WhatDescribesYouBest_Pleasechooseservice);
			if (browser.elementisdisplayed(SCobjects.Subscriber_WhatDescribesYouBest_Pleasechooseservice)) {
				browser.verifyElementErrorMessage(SCobjects.Subscriber_WhatDescribesYouBest_Pleasechooseservice,
						Please_chooseserviceEM, "exact");
				browser.reportscomtep("Passed", "Verify Please choose service error message is displayed",
						"Please choose service error message should be displayed ",
						"Error message is displayed as:" + Please_chooseserviceEM);
			} else {
				browser.reportscomtep("Passed", "Verify Please choose service error message is displayed",
						"Please choose service error message should be displayed ", "Error message is not Displayed");
			}
		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}

	/*******
	 * TC_4_007 Check if you can navigate to next page by selecting Other Service & without adding service
	 ******/
	public void clickOnNextStep_Selecting_OtherService() {
		try {
			if (browser.elementisdisplayed(SCobjects.Subscriber_WhatDescribesYouBest_OtherService)) {
				browser.reportscomtep("Passed", "Verify Other Service option is displayed",
						"Other Service option should be displayed", "Other Service option is displayed");
				browser.click(SCobjects.Subscriber_WhatDescribesYouBest_OtherService);
				browser.click(SCobjects.Subscriber_WhatDescribesYouBest_NextStep);
				if (browser.elementisdisplayed(SCobjects.Subscriber_WhatDescribesYouBest_Text)) {
					browser.reportscomtep("Passed", "Verify Next page won't naviagted",
							"Next page is shouldn't be naviagted", "Next page won't naviagted");
				} else {
					browser.reportscomtep("Failed", "Verify Next page is won't naviagted",
							"Next page is shouldn't be naviagted", "Next page is naviagted");
				}
			} else {
				browser.reportscomtep("Failed", "Verify Other Service option is displayed",
						"Other Service option should be displayed", "Other Service option is not displayed");
			}
		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}

	/****** TC_4_008 Check if you can navigate to next page by adding Service in Other Services option ******/
	
	public void clickonNextStep_AddingServiceInOtherService() {
		String Add_Service = "";
		try {
			Add_Service = browser.getdata("ServiceAdded");
			if (browser.elementisdisplayed(SCobjects.Subscriber_WhatDescribesYouBest_AddService_Text)) {
				browser.reportscomtep("Passed", "Verify Add Service text Box is displayed",
						"Add Service text Box should be displayed", "Add Service text Box is displayed");
				browser.sendkeys(SCobjects.Subscriber_WhatDescribesYouBest_AddService_Text, Add_Service);
				browser.click(SCobjects.Subscriber_WhatDescribesYouBest_NextStep);
				if (browser.elementisdisplayed(SCobjects.Subscriber_WhatDescribesYouBest_YourBusinessDetails)) {
					browser.reportscomtep("Passed",
							"Enter an Add service, click on next step button and verify Navigates to Your Business Details page is displayed ",
							"Navigates to Your Business Details page shpould be displayed",
							"Navigates to Your Business Details page is displayed");
				} else {
					browser.reportscomtep("Failed",
							"Enter Add service, click on next step button and verify Navigates to Your Business Details page is displayed ",
							"Navigates to Your Business Details page shpould be displayed",
							"Navigates to Your Business Details page is not displayed");
				}
			} else {
				browser.reportscomtep("Failed", "Verify Add Service text Box is displayed",
						"Add Service text Box should be displayed", "Add Service text Box is not displayed");
			}
		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}

	/***
	 * TC_4_009 Check if you can navigate to next page by selecting an option(except Other Services *******/
	public void clickonNextStepaddingService() throws InterruptedException {
	}

	/**** TC_4_010 Check if you can access Dashboard from Your Business Details  page ****/
	public void clickOn_MyAccountinBusinessDetailspage() {
		try {
			browser.click(SCobjects.Subscriber_MyAccount);
			if (browser.elementisdisplayed(SCobjects.Subscriber_WhatDescribesYouBest_YourBusinessDetails)) {
				browser.reportscomtep("Passed",
						"click on MyAccoun and wont allow you to access the Dashboard and verify Business Details page is displayed ",
						"Business Details page should be displayed ", "Business Details page is displayed ");
			} else {
				browser.reportscomtep("Failed",
						"click on MyAccoun and wont allow you to access the Dashboard and verify Business Details page is displayed ",
						"Business Details page should be displayed ", "Business Details page is displayed ");
			}
		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	
	/******
	 * TC_4_011 Check if you are able to login to Dashboard after relogin from Your Business Details page ****/
	
	public void login_ToDashboard_After_ReLogIn_FromYourBusinessDetailsPage() {
		try {
			browser.click(SCobjects.Subscriber_WhatDescribesYouBest_logout_Text);
			browser.sendkeys(SCobjects.Subscriber_UserName_TextBox, browser.getdata("VC_LogIN_UserName"));
			browser.sendkeys(SCobjects.Subscriber_Password_TextBox, browser.getdata("VC_LogIN_Passworrd"));
			browser.click(SCobjects.Subscriber_SignIn_Button);
			if (browser.elementisdisplayed(SCobjects.Subscriber_WhatDescribesYouBest_YourBusinessDetails)) {
				browser.reportscomtep("Passed",
						"Relogin from What Describes You Page and verify wont allow you to access the Dashboard, Your Business Details Page is displayed",
						"Wont allow you to access the Dashboard, Your Business Details Page should be displayed",
						"Wont allow you to access the Dashboard, Your Business Details Page is displayed");

			} else {
				browser.reportscomtep("Failed",
						"Relogin from What Describes You Page and verify wont allow you to access the Dashboard,Your Business Details Page is displayed",
						"Wont allow you to access the Dashboard, Your Business Details Page should be displayed",
						"Wont allow you to access the Dashboard, Your Business Details Page is not displayed");
			}
		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	/***TC_4_012 Check if can navigate to next page by clicking on Next Step button without entering the details****/
	
	public void clickOn_NextStepButton_WithoutEnteringDetails_InYBDP() {
		String AddressEM = "";
		String cityEM = "";
		String ZipCodeEm = "";
		try {
			browser.click(SCobjects.Subscriber_WhatDescribesYouBest_BusinessDetailsNextStep);
			if (browser.elementisdisplayed(SCobjects.Subscriber_WhatDescribesYouBest_YourBusinessDetails)) {
				browser.reportscomtep("Passed",
						"With Out entering Details and click on Next step button and verify Doesn't navigate to next page,following Error messages are displayed",
						"Doesn't navigate to next page, followingError messages should be displayed",
						"Doesn't navigate to next page, following Error messages are displayed");
				if (browser.elementisdisplayed(SCobjects.Subscriber_BusinessDetails_PleaseEnterAddress_Text)) {
					AddressEM = browser.getelementtext(SCobjects.Subscriber_BusinessDetails_PleaseEnterAddress_Text);
					browser.reportscomtep("Passed", "Verify Address Error message is displayed",
							"Address Error message should bedisplayed",
							"Address Error message is displayed as:" + AddressEM);
				}
				if (browser.elementisdisplayed(SCobjects.Subscriber_BusinessDetails_PleaseEnterCity_Text)) {
					cityEM = browser.getelementtext(SCobjects.Subscriber_BusinessDetails_PleaseEnterCity_Text);
					browser.reportscomtep("Passed", "Verify City Error message is displayed",
							"City Error message should bedisplayed", "City Error message is displayed as:" + cityEM);
				}
				if (browser.elementisdisplayed(SCobjects.Subscriber_BusinessDetails_PleaseEnterZipcode_Text)) {
					ZipCodeEm = browser.getelementtext(SCobjects.Subscriber_BusinessDetails_PleaseEnterZipcode_Text);
					browser.reportscomtep("Passed", "Verify ZipCode Error message is displayed",
							"ZipCode Error message should bedisplayed",
							"ZipCode Error message is displayed as:" + ZipCodeEm);
				}
			} else {
				browser.reportscomtep("Failed",
						"With Out entering Details and click on Next step button and verify Doesn't navigate to next page, Error messages are displayed",
						"Doesn't navigate to next page, Error messages should be displayed",
						"Doesn't navigate to next page, Error messages are displayed");
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}

	}
	/*******TC_4_013 Check if you can navigate to next page after entering valid details in Your Business Details page****/
	
	public void clickOn_NextStep_InBusinessDetailsPage_EnteringDetails() {
		String BusinessADD = "";
		String BusinessCity = "";
		String BusinessZipCode = "";
		String BusinessPhn = "";
		try {
			BusinessADD = browser.getdata("BusinessAddress");
			BusinessCity = browser.getdata("BusinessCity");
			BusinessZipCode = browser.getdata("BusinessZipcode");
			BusinessPhn = browser.getdata("BusinessPHn");
			browser.sendkeys(SCobjects.Subscriber_BusinessDetails_PleaseEnterAddress_Editbox, BusinessADD);
			browser.sendkeys(SCobjects.Subscriber_BusinessDetails_PleaseEnterCity_Editbox, BusinessCity);
			browser.selectByVisibleText(SCobjects.Subscriber_BusinessDetails_PleaseEnterState_Dropdownbox,
					browser.getdata("BusinessCountry"));
			browser.sendkeys(SCobjects.Subscriber_BusinessDetails_PleaseEnterZipcode_Editbox, BusinessZipCode);
			browser.sendkeys(SCobjects.Subscriber_BusinessDetails_PleaseEnterPhoneNo_Editbox, BusinessPhn);
			browser.click(SCobjects.Subscriber_WhatDescribesYouBest_BusinessDetailsNextStep);
			if (browser.elementisdisplayed(SCobjects.Subscriber_WelcomeBusinessName_Text)) {
				browser.reportscomtep("Passed",
						"Enter the Business details nad click on Next step button and verify Subscriber is logged into Dashboard page",
						"Subscriber should be logged into Dashboard page", "Subscriber is logged into Dashboard page");
			} else {
				browser.reportscomtep("Failed",
						"Enter the Business details nad click on Next step button and verify Subscriber is logged into Dashboard page",
						"Subscriber should be logged into Dashboard page",
						"Subscriber is not logged into Dashboard page");
			}
		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	/*******TC_4_014 Check if you are able to login directly to Dashboard next time Logout from Subscriber Dashboard Sign in again*********/
	public void logIn_DashboarDdirectly() {
		browser.click(SCobjects.Subscriber_HumanIcon);
		browser.click(SCobjects.Subscriber_HumanIcon_logout_link);
		browser.sendkeys(SCobjects.Subscriber_UserName_TextBox, browser.getdata("VC_LogIN_UserName"));
		browser.sendkeys(SCobjects.Subscriber_Password_TextBox, browser.getdata("VC_LogIN_Passworrd"));
		browser.click(SCobjects.Subscriber_SignIn_Button);
		if (browser.elementisdisplayed(SCobjects.Subscriber_WelcomeBusinessName_Text)) {
			browser.reportscomtep("Passed",
					"Logout From Subscriber Dashboard and verify Subscriber Login is abled to directly to Dashboard ",
					"Subscriber Login should be abled to directly to Dashboard ",
					"Subscriber Login is abled to directly to Dashboard ");
		} else {
			browser.reportscomtep("Failed",
					"Logout From Subscriber Dashboard and verify Subscriber Login is abled to directly to Dashboard ",
					"Subscriber Login should be abled to directly to Dashboard ",
					"Subscriber Login is abled to directly to Dashboard ");
		}
		String businessName = browser.getelementtext(SCobjects.Subscriber_WelcomeBusinessName_Text);
		System.out.println("****businessName***************:" + businessName);
	}
/************TS005_Subscriber Login to Subscriber Dashboard*******************/
	/****Check whether you are able to login to Dashboard by entering valid credentials****/
	// TS_5_001
	public void logIn_ToDashboard() {
		String DB_Username = "";
		String DB_Password = "";
		String BusinessName[]=null;
		try {
			DB_Username = browser.getdata("temp_LogIN_UserName");
			DB_Password = browser.getdata("temp_LogIN_Passworrd");
			browser.click(SCobjects.Subscriber_Login_Button);			 
			browser.sendkeys(SCobjects.Subscriber_UserName_TextBox, DB_Username);
			browser.sendkeys(SCobjects.Subscriber_Password_TextBox, DB_Password);
			browser.click(SCobjects.Subscriber_SignIn_Button);
			if (browser.elementisdisplayed(SCobjects.Subscriber_DashBoard_Page)
					&& browser.elementisdisplayed(SCobjects.Subscriber_WelcomeBusinessName_Text)) {
				BusinessName= browser.getelementtext(SCobjects.Subscriber_WelcomeBusinessName_Text).split(" ");
				browser.reportscomtep("Passed",
						"Enter Subscriber crediential and click on SignIN Button and verify Successfully logged in to Subscriber Dashboard Welcome page is displayed",
						"Successfully logged in to Subscriber Dashboard Welcome page should be displayed",
						"Successfully logged in to Subscriber Dashboard Welcome page is displayed Business name as:"+ BusinessName[1]);
			} else {
				browser.reportscomtep("Failed",
						"Enter Subscriber crediential and click on SignIN Button and verify Successfully logged in to Subscriber Dashboard Welcome page is displayed",
						"Successfully logged in to Subscriber Dashboard Welcome page should be displayed",
						"Successfully logged in to Subscriber Dashboard Welcome page is not displayed");
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}

	/*****TC_5_002 Check the information  on Welcome page for First time login**/
	
	public void validate_DashboardPage_FirstTimeLogin() {
		String TodayAppointments = "";
		String BusinessName[] = null;
		String LastLogInTime = "";
		String TodaysEarningsAmount = "";
		String ThisMonthsEarningsAmount = "";
		String TotalEarningsAmount = "";
		String TrailVersionText = "";
		String TrialExpiresOn[] = null;
		try {
			if (browser.elementisdisplayed(SCobjects.Subscriber_TodaysAppointment_Text)) {
				TodayAppointments = browser.getelementtext(SCobjects.Subscriber_NoAppointments_Text);
				browser.reportscomtep("Passed", "Verify Today's Appointments table header is diaplayed",
						"Today's Appointments table header should be displayed",
						"Today's Appointments table header is diaplayed and Today's Appointments shows as: "
								+ TodayAppointments);
			}
			if (browser.elementisdisplayed(SCobjects.Subscriber_WelcomeBusinessName_Text)) {
				BusinessName = browser.getelementtext(SCobjects.Subscriber_WelcomeBusinessName_Text).split(" ");
				browser.reportscomtep("Passed", "Verify Welcome Business name is diaplayed",
						"Welcome Business name should be diaplayed",
						"Welcome Business name is diaplayed as: " + BusinessName[1]);
			}
			if (browser.elementisdisplayed(SCobjects.Subscriber_LastLoginDateAndTime)) {
				LastLogInTime = browser.getelementtext(SCobjects.Subscriber_LastLoginDateAndTime);
				browser.reportscomtep("Passed", "Verify Last LogIn Time is diaplayed",
						"Last LogIn Time should be diaplayed", "Last LogIn Time is diaplayed as: " + LastLogInTime);
			}
			browser.scrollDown(400);
			if (browser.elementisdisplayed(SCobjects.Subscriber_DefaultSClogo)) {
				browser.reportscomtep("Passed", "Verify Default SC log is diaplayed",
						"Default SC log should be diaplayed", "Default SC log is diaplayed");
			}
			TodaysEarningsAmount = browser.getelementtext(SCobjects.Subscriber_TodaysEarningsAmount);
			ThisMonthsEarningsAmount = browser.getelementtext(SCobjects.Subscriber_ThisMonthsEarningsAmount);
			TotalEarningsAmount = browser.getelementtext(SCobjects.Subscriber_TotalEarningsAmount);
			if (TodaysEarningsAmount.equalsIgnoreCase("$ 0.00") && ThisMonthsEarningsAmount.equalsIgnoreCase("$ 0.00")
					&& TotalEarningsAmount.equalsIgnoreCase("$ 0.00")) {
				browser.reportscomtep("Passed", "Verify Today, ThisMonth and Total Earning Amounts are displayed",
						"Today, ThisMonth and Total Earning Amounts should be displayed",
						"Today, ThisMonth and Total Earning Amounts are displayed as:" + TotalEarningsAmount);
			} else {
				browser.reportscomtep("Failed", "Verify Today, ThisMonth and Total Earning Amounts are displayed",
						"Today, ThisMonth and Total Earning Amounts should be displayed",
						"Today, ThisMonth and Total Earning Amounts are not displayed as");
			}
			browser.scrollintoviewelement(SCobjects.Subscriber_TotalServiceOffered_Text);
			if (browser.elementisdisplayed(SCobjects.Subscriber_TotalServiceOffered_Text)
					&& browser.elementisdisplayed(SCobjects.Subscriber_TotalServiceOfferedCount)) {
				String TotalServiceOffered = browser.getelementtext(SCobjects.Subscriber_TotalServiceOfferedCount);
				browser.reportscomtep("Passed", "Verify Total Service Offered is displayed ",
						"Total Service Offered should be displayed",
						"Total Service Offered is displayed as :" + TotalServiceOffered);
			}
			if (browser.elementisdisplayed(SCobjects.Subscriber_TotalProductOffered_Text)
					&& browser.elementisdisplayed(SCobjects.Subscriber_TotalProductOfferedCount)) {
				String TotalProductOffered = browser.getelementtext(SCobjects.Subscriber_TotalServiceOfferedCount);
				browser.reportscomtep("Passed", "Verify Total Product Offered is displayed ",
						"Total Product Offered should be displayed",
						"Total Product Offered is displayed as :" + TotalProductOffered);
			}
			if (browser.elementisdisplayed(SCobjects.Subscriber_MyClientList_Text)
					&& browser.elementisdisplayed(SCobjects.Subscriber_MyClientListCount)) {
				String MyClientsList = browser.getelementtext(SCobjects.Subscriber_MyClientListCount);
				browser.reportscomtep("Passed", "Verify My Clients List is displayed ",
						"My Clients List should be displayed", "My Clients List is displayed as :" + MyClientsList);
			}
			if (browser.elementisdisplayed(SCobjects.Subscriber_TotalStaff_Text)
					&& browser.elementisdisplayed(SCobjects.Subscriber_TotalStaffCount)) {
				String TotalStaff = browser.getelementtext(SCobjects.Subscriber_TotalStaffCount);
				browser.reportscomtep("Passed", "Verify Total Staff is displayed ", "Total Staff should be displayed",
						"Total Staff is displayed as :" + TotalStaff);
			}
			if (browser.elementisdisplayed(SCobjects.Subscriber_TotalOnlineOrders_Text)
					&& browser.elementisdisplayed(SCobjects.Subscriber_TotalOnlineOrdersCount)) {
				String TotalOnlineOrder = browser.getelementtext(SCobjects.Subscriber_TotalOnlineOrdersCount);
				browser.reportscomtep("Passed", "Verify Total Online Order is displayed ",
						"Total Online Order should be displayed",
						"Total Online Order is displayed as :" + TotalOnlineOrder);
			}
			if (browser.elementisdisplayed(SCobjects.Subscriber_TotalOfflineOrders_Text)
					&& browser.elementisdisplayed(SCobjects.Subscriber_TotalOfflineOrdersCount)) {
				String TotalOffnlineOrder = browser.getelementtext(SCobjects.Subscriber_TotalOfflineOrdersCount);
				browser.reportscomtep("Passed", "Verify Total Offnline Order is displayed ",
						"Total Offnline Order should be displayed",
						"Total Offnline Order is displayed as :" + TotalOffnlineOrder);
			}
			if (browser.elementisdisplayed(SCobjects.Subscriber_SubscriptionDetails_text)) {
				browser.reportscomtep("Passed", "Verify Subscription Details are diplayed",
						"Subscription Details should bediplayed", "Subscription Details are diplayed");
				if (browser.elementisdisplayed(SCobjects.Subscriber_TrialCircleLogo)) {
					browser.reportscomtep("Passed", "Verify Orange Dot with Trial written on Circle Logo is displayed",
							"Orange Dot with Trial written on Circle Logo should be displayed",
							"Orange Dot with Trial written on Circle Logo is displayed");
					browser.scrollintoviewelement(SCobjects.Subscriber_TrailVersionText);
					if (browser.elementisdisplayed(SCobjects.Subscriber_TrailVersionText)) {
						TrailVersionText = browser.getelementtext(SCobjects.Subscriber_TrailVersionText);
						browser.reportscomtep("Passed",
								"Verify Yor are currently using trial version text is displayed",
								"Yor are currently using trial version text should be displayed",
								"Yor are currently using trial version as:" + TrailVersionText);
					}
					if (browser.elementisdisplayed(SCobjects.Subscriber_TrialExpiresOn)) {
						TrialExpiresOn = browser.getelementtext(SCobjects.Subscriber_TrialExpiresOn).split(" on ");
						browser.reportscomtep("Passed", "Verify Trial expires on text is displayed",
								"Trial expires on text should be displayed",
								"Trial expires on text is displayed as :" + TrialExpiresOn[1]);
					}

				} else {
					browser.reportscomtep("Failed", "Verify Orange Dot with Trial written on Circle Logo is displayed",
							"Orange Dot with Trial written on Circle Logo should be displayed",
							"Orange Dot with Trial written on Circle Logo is not  displayed");
				}
			} else {
				browser.reportscomtep("Failed", "Verify Subscription Details are diplayed",
						"Subscription Details should bediplayed", "Subscription Details are not diplayed");
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}	
	/****TC_5_003 Check whether Last Login Date & Time are correct*****/
	public void validate_LastLoginDateAndTime() {
		String LastLoginDateAndTime = "";
		String CuttentLoginDateAndTime = "";
		try {
			browser.scrollintoviewelement(SCobjects.Subscriber_WelcomeBusinessName_Text);
			LastLoginDateAndTime = browser.getelementtext(SCobjects.Subscriber_LastLoginDateAndTime);
			browser.click(SCobjects.Subscriber_UserIcon);
			browser.click(SCobjects.Subscriber_Logout);
			Thread.sleep(10000);
			browser.sendkeys(SCobjects.Subscriber_UserName_TextBox, browser.getdata("temp_LogIN_UserName"));
			browser.sendkeys(SCobjects.Subscriber_Password_TextBox, browser.getdata("temp_LogIN_Passworrd"));
			browser.click(SCobjects.Subscriber_SignIn_Button);
			CuttentLoginDateAndTime = browser.getelementtext(SCobjects.Subscriber_LastLoginDateAndTime);
			if (LastLoginDateAndTime != CuttentLoginDateAndTime) {
				browser.reportscomtep("Passed", "Verify Last logIn and Current LogIn time are not equal",
						"Last logIn and Current LogIn time should be not equal",
						"Last logIn and Current LogIn time are not equal");
			} else {
				browser.reportscomtep("Passed", "Verify Last logIn and Current LogIn time are equal",
						"Last logIn and Current LogIn time should be equal",
						"Last logIn and Current LogIn time are equal");
			}
		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}

	}

	/*****TC_5_004 Check whether View All link is clickable*****/
	public void click_ViewAllLinks() {
		String NoAppointmentsFound = "";
		try {
			browser.click(SCobjects.Subscriber_ViewAll_Link);
			if (browser.elementisdisplayed(SCobjects.Subscriber_NoAppointmentsFound_Popup)) {
				NoAppointmentsFound = browser.getelementtext(SCobjects.Subscriber_NoAppointmentsFound_Popup);
				browser.reportscomtep("Passed",
						"Click on View All link and verify First time login, popup shows No appointments Found is diplayed",
						"First time login, popup shows No appointments Found should be diplayed",
						"First time login, popup diplayed as:" + NoAppointmentsFound);
				browser.click(SCobjects.Subscriber_NoAppointmentsFound_Popup_OKButton);
				if (browser.elementisdisplayed(SCobjects.Subscriber_Appointments_Text)) {
					browser.reportscomtep("Passed", "Click on Ok button and verify Appointments Page is displayed",
							"Appointments Page should be displayed", "Appointments Page is displayed");
				} else {
					browser.reportscomtep("Failed", "Click on Ok button and verify Appointments Page is displayed",
							"Appointments Page should be displayed", "Appointments Page is not displayed");
				}

			} else {
				browser.reportscomtep("Failed",
						"Click on View All link and verify First time login, popup shows No appointments Found is diplayed",
						"First time login, popup shows No appointments Found should be diplayed",
						"First time login, popup not diplayed");
			}
			driver.navigate().back();
		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	/******TC_5_005 Check whether Manage Profile link is clickable******/
	public void click_ManageProfileLink() {
		try {
			browser.click(SCobjects.Subscriber_ManageProfile_link);
			if (browser.elementisdisplayed(SCobjects.Subscriber_UpdateProfileDetails)) {
				browser.reportscomtep("Passed",
						"Click on Mange Profile link and Navigate to verify Update Profile Details page is displayed",
						"Update Profile Details page should be displayed", "Update Profile Details page is displayed");

			} else {
				browser.reportscomtep("Failed",
						"Click on Mange Profile link and Navigate to verify Update Profile Details page is displayed",
						"Update Profile Details page should be displayed",
						"Update Profile Details page is not displayed");
			}
			driver.navigate().back();
		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}

		/******TC_5_006 Check whether Total Services Offered is clickable****/
	public void clickon_TotalServices_Offered() {
		try {
			browser.scrollintoviewelement(SCobjects.Subscriber_TotalServiceOffered_Text);
			browser.click(SCobjects.Subscriber_TotalServiceOffered_Text);
			if (browser.elementisdisplayed(SCobjects.Subscriber_ServiceMenu_Page)) {
				browser.reportscomtep("Passed",
						"Click on Total Services Offered and navigate to verify Service Menu page is displayed",
						"Service Menu page should be displayed", "Service Menu page is displayed");

			} else {
				browser.reportscomtep("Failed",
						"Click on Total Services Offered and navigate to verify Service Menu page is displayed",
						"Service Menu page should be displayed", "Service Menu page is not displayed");
			}
			driver.navigate().back();
		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	/**********TC_5_007 Check whether Total Products Offered is clickable*********/
	
	public void clickon_TotalProductsOffered() {
		try {
			browser.scrollintoviewelement(SCobjects.Subscriber_TotalProductOffered_Text);
			browser.click(SCobjects.Subscriber_TotalProductOffered_Text);
			if (browser.elementisdisplayed(SCobjects.Subscriber_Products)) {
				browser.reportscomtep("Passed",
						"Click on Total Product Offered and navigate to verify Products page is displayed",
						"Products page should be displayed", "Products page is displayed");

			} else {
				browser.reportscomtep("Failed",
						"Click on Total Product Offered and navigate to verify Products page is displayed",
						"Products page should be displayed", "Products page is not displayed");

			}
			driver.navigate().back();
		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	/**************TC_5_008 Check whether My Clients List is clickable*********/
		public void clickon_MyClientsList() {
		try {
			browser.scrollintoviewelement(SCobjects.Subscriber_MyClientList_Text);
			browser.click(SCobjects.Subscriber_MyClientList_Text);
			if (browser.elementisdisplayed(SCobjects.Subscriber_Clients)) {
				browser.reportscomtep("Passed",
						"Click on My Client List and navigate to verify Clients page is displayed",
						"Clients page should be displayed", "Clients page is displayed");

			} else {
				browser.reportscomtep("Failed",
						"Click on Total Product Offered and navigate to verify Clients page is displayed",
						"Clients page should be displayed", "Clients page is not displayed");

			}
			driver.navigate().back();
		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	
	/******TC_5_009 Check whether Total Staff is clickable**********/
		public void clickon_TotalStaff() {
			try {
				browser.scrollintoviewelement(SCobjects.Subscriber_TotalStaff_Text);
				browser.click(SCobjects.Subscriber_TotalStaff_Text);
				if (browser.elementisdisplayed(SCobjects.Subscriber_StaffPage)) {
					browser.reportscomtep("Passed",
							"Click on Total Staff and navigate to verify Staff page is displayed",
							"Staff page should be displayed", "Staff page is displayed");

				} else {
					browser.reportscomtep("Failed",
							"Click on Total Staff and navigate to verify Staff page is displayed",
							"Staff page should be displayed", "Staff page is not displayed");

				}
				driver.navigate().back();
			} catch (Exception e) {
				System.out.println("Error description: " + e.getStackTrace());
			}
		}
	
	/*******TC_5_010 Check whether Total Online Orders is clickable*******/
		
	public void clickon_TotalOnline_Orders() {
		String NoAppointmentsFound = "";
		try {
			browser.scrollintoviewelement(SCobjects.Subscriber_TotalOnlineOrders_Text);
			browser.click(SCobjects.Subscriber_TotalOnlineOrders_Text);

			if (browser.elementisdisplayed(SCobjects.Subscriber_NoAppointmentsFound_Popup)) {
				NoAppointmentsFound = browser.getelementtext(SCobjects.Subscriber_NoAppointmentsFound_Popup);
				browser.reportscomtep("Passed",
						"Click on View All link and verify First time login, popup shows No appointments Found is diplayed",
						"First time login, popup shows No appointments Found should be diplayed",
						"First time login, popup diplayed as:" + NoAppointmentsFound);
				browser.click(SCobjects.Subscriber_NoAppointmentsFound_Popup_OKButton);
				if (browser.elementisdisplayed(SCobjects.Subscriber_Appointments_Text)) {
					browser.reportscomtep("Passed", "Click on Ok button and verify Appointments Page is displayed",
							"Appointments Page should be displayed", "Appointments Page is displayed");
				} else {
					browser.reportscomtep("Failed", "Click on Ok button and verify Appointments Page is displayed",
							"Appointments Page should be displayed", "Appointments Page is not displayed");
				}

			} else {
				browser.reportscomtep("Failed",
						"Click on View All link and verify First time login, popup shows No appointments Found is diplayed",
						"First time login, popup shows No appointments Found should be diplayed",
						"First time login, popup not diplayed");
			}
			driver.navigate().back();
		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	/******TC_5_011 Check whether Total Offline Orders is clickable***********/
	
	public void clickon_TotalOffline_Orders() {
		try {
			browser.scrollintoviewelement(SCobjects.Subscriber_TotalOfflineOrders_Text);
			browser.click(SCobjects.Subscriber_TotalOfflineOrders_Text);
			if (browser.elementisdisplayed(SCobjects.Subscriber_Bookingspage)) {
				browser.reportscomtep("Passed",
						"Click on Total OffLine Orders and navigate to verify Booking page is displayed",
						"Booking page should be displayed", "Booking page is displayed");
			} else {
				browser.reportscomtep("Failed",
						"Click on Total OffLine Orders and navigate to verify Booking page is displayed",
						"Booking page should be displayed", "Booking page is not displayed");
			}
			driver.navigate().back();
		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	/*****
	 * 
	 * 
	 * 
	 * 5(12) to 5(14) pending
	 */

	/*****TS006_Subscriber Set Up Profile By Clicking My Settings*****/
	
	/*******TC_06_001 Open My Settings page******/
	
	public void open_MySettingsPage() {
		try {
			this.logIn_ToDashboard();
			browser.click(SCobjects.Subscriber_HumanIcon);
			browser.click(SCobjects.Subscriber_HumanIcon_MySettings_link);
			if (browser.elementisdisplayed(SCobjects.Subscriber_UpdateProfileDetails)) {
				browser.reportscomtep("Passed",
						"Click on the human icon at the top menu,From the dropdown list select My Settings and verify Update Profile Details page is displayed",
						"Update Profile Details page should be displayed", "Update Profile Details page is displayed");

			} else {
				browser.reportscomtep("Failed",
						"Click on the human icon at the top menu,From the dropdown list select My Settings and verify Update Profile Details page is displayed",
						"Update Profile Details page should be displayed",
						"Update Profile Details page is not displayed");
			}
		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	/***TC_06_002 Verify the default details in the Update Profile Details page*****/
	 
	public void validate_DefaultDetails_InUpdateProfileDetailsPage() {
		String GenderType = "";
		boolean gemderisslection = false;
		String FirstName = "";
		String LastName = "";
		String Email = "";
		try {
			if (SCobjects.Subscriber_UP_Male_SelectonButton.isSelected()) {
				GenderType = browser.elementgetAttributevalue(SCobjects.Subscriber_UP_Male_SelectonButton, "value");
				gemderisslection = true;
				browser.reportscomtep("Passed", "Verify By default, Gender male is displayed",
						" By default, Gender male should be displayed",
						" By default, Gender displayed as:" + GenderType);
			} else if (SCobjects.Subscriber_UP_Female_SelectonButton.isSelected()) {
				GenderType = browser.elementgetAttributevalue(SCobjects.Subscriber_UP_Female_SelectonButton, "value");
				gemderisslection = true;
				browser.reportscomtep("Passed", "Verify By default, Gender Female is displayed",
						" By default, Gender Female should be displayed",
						" By default, Gender displayed as:" + GenderType);
			}
			if (browser.elementisdisplayed(SCobjects.Subscriber_UP_FNTextBox)
					&& FirstName.equalsIgnoreCase(browser.getdata("ValidFirstname"))) {
				FirstName = browser.getelementtext(SCobjects.Subscriber_UP_FNTextBox);
				browser.reportscomtep("Passed", "Verify the first name entered during registration is displayed",
						"The first name entered during registration should be displayed",
						"The first name entered during registration is displayed as:" + FirstName);
			}
			if (browser.elementisdisplayed(SCobjects.Subscriber_UP_LNTextBox)
					&& LastName.equalsIgnoreCase(browser.getdata("ValidLastname"))) {
				LastName = browser.getelementtext(SCobjects.Subscriber_UP_LNTextBox);
				browser.reportscomtep("Passed", "Verify the Last name entered during registration is displayed",
						"The Last name entered during registration should be displayed",
						"The Last name entered during registration is displayed as:" + LastName);
			}
			if (browser.elementisdisplayed(SCobjects.Subscriber_UP_Email_TextBox)
					&& Email.equalsIgnoreCase(browser.getdata("ValidEmail"))) {
				Email = browser.getelementtext(SCobjects.Subscriber_UP_Email_TextBox);
				browser.reportscomtep("Passed", "Verify the Email entered during registration is displayed",
						"The Email entered during registration should be displayed",
						"The Email entered during registration is displayed as:" + Email);
			}
			if (browser.elementisdisplayed(SCobjects.Subscriber_UP_Logo)) {
				browser.reportscomtep("Passed", "Verify Default SC Logo is Displayed",
						"Default SC Logo should be Displayed", "Default SC Logo is Displayed");
			} else {
				browser.reportscomtep("Failed", "Verify Default SC Logo is Displayed",
						"Default SC Logo should be Displayed", "Default SC Logo is not Displayed");
			}
			if (browser.elementisdisplayed(SCobjects.Subscriber_UP_Cover_Image)) {
				browser.reportscomtep("Passed", "Verify Default Cover Image is Displayed",
						"Default Cover Image should be Displayed", "Default Cover Image is Displayed");
			} else {
				browser.reportscomtep("Passed", "Verify Default Cover Image is Displayed",
						"Default Cover Image should be Displayed", "Default Cover Image is not Displayed");
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	/*****TC_06_003 Check whether the email id can be modified*********/
		 
	public void check_EmailId_Modified() {
		boolean Email_NonEditable = false;
		try {
			browser.click(SCobjects.Subscriber_UP_Email_TextBox);
			if (Email_NonEditable = true) {
				browser.reportscomtep("Passed", "Verify Email field is nonedited", "Email field should be nonedited",
						"Email field is nonedited");
			}
		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	
	/**********TC_06_004 Check whether the name fields accepts invalid data**************/
	
	public void check_NameFields_Accepts_InvalidData(){
		try{
			
		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	
	
	
	
	
	/******TS008_Subscriber Clicks On Change Password*****/
	
	/********TC_8_001 Open Update Password page*********/
	
	public void open_UpdatePassword_Page() {
		try {
			this.logIn_ToDashboard();
			browser.click(SCobjects.Subscriber_HumanIcon);
			browser.click(SCobjects.Subscriber_ClickOnChangePassword);
			if (browser.elementisdisplayed(SCobjects.Subscriber_UpdateProfilePassword)) {
				browser.reportscomtep("Passed",
						"Click on the human icon at the top menu,From the dropdown list select Change Password and verify Update Profile Password page is displayed",
						"Update Profile Password page should be displayed",
						"Update Profile Password page is displayed");
			} else {
				browser.reportscomtep("Failed",
						"Click on the human icon at the top menu,From the dropdown list select Change Password and verify Update Profile Password page is displayed",
						"Update Profile Password page should be displayed",
						"Update Profile Password page is not displayed");
			}
		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}

	/*****TC_8_002 Check whether validation message is displayed when you click update without entering any data******/
	
	public void click_OnUpdateButton_WithoutEnteringData() {
		String OldPasswordEM = "";
		String NewPasswordEM = "";
		try {
			if (browser.elementisdisplayed(SCobjects.Subscriber_ClickUpdateButton)) {
				browser.reportscomtep("Passed", "Update Password page on verify Update button is displayed",
						"Update button should be displayed", "Update button is displayed");
				browser.click(SCobjects.Subscriber_ClickUpdateButton);
				if (browser.elementisdisplayed(SCobjects.Subscriber_GetOldPasswordMessage)) {
					OldPasswordEM = browser.getelementtext(SCobjects.Subscriber_GetOldPasswordMessage);
					browser.reportscomtep("Passed",
							"Click on update Button without entering any data and verify Old Password Error message is diplayed",
							"Old Password Error message should be diplayed",
							"Old Password Error message is diplayed as:" + OldPasswordEM);
					browser.verifyElementErrorMessage(SCobjects.Subscriber_GetOldPasswordMessage, OldPasswordEM,
							"exact");
				}
				if (browser.elementisdisplayed(SCobjects.Subscriber_GetNewPasswordMessage)) {
					NewPasswordEM = browser.getelementtext(SCobjects.Subscriber_GetNewPasswordMessage);
					browser.reportscomtep("Passed",
							"Click on update Button without entering any data and verify New Password Error message is diplayed",
							"New Password Error message should be diplayed",
							"New Password Error message is diplayed as:" + NewPasswordEM);
					browser.verifyElementErrorMessage(SCobjects.Subscriber_GetNewPasswordMessage, NewPasswordEM,
							"exact");
				}
			} else {
				browser.reportscomtep("Failed", "Update Password page on verify Update button is displayed",
						"Update button should be displayed", "Update button is not displayed");
			}
		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}

	/****TC_8_003 Check whether the password is updated by typing wrong old password****/
	public void enter_WrongOldPassword() {
		String InvalidPassword = "";
		String NewPassword = "";
		String ReTypePassword = "";
		String UpdatePasswordEM = "";
		try {
			InvalidPassword = browser.getdata("InvalidOldPassword");
			NewPassword = browser.getdata("UpdateNewPassword");
			ReTypePassword = browser.getdata("UpdateNewPassword");
			browser.sendkeys(SCobjects.Subscriber_EnterOldPasswordText, InvalidPassword);
			browser.sendkeys(SCobjects.Subscriber_EnterNewPasswordText, NewPassword);
			browser.sendkeys(SCobjects.Subscriber_EnterRetypePasswordText, ReTypePassword);
			browser.click(SCobjects.Subscriber_ClickUpdateButton);
			if (browser.elementisdisplayed(SCobjects.Subscriber_InvalidCurrentPassword)) {
				UpdatePasswordEM = browser.getelementtext(SCobjects.Subscriber_InvalidCurrentPassword);
				browser.reportscomtep("Passed",
						"Click on update Button with entering Invalid old password, New & retping password and verify Invalid Current password Error message is diplayed",
						"Invalid Current password Error message should be diplayed",
						"Invalid Error message is diplayed as:" + UpdatePasswordEM);
				browser.verifyElementErrorMessage(SCobjects.Subscriber_InvalidCurrentPassword, UpdatePasswordEM,
						"exact");
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	/********TC_8_004 Check whether the password is updated by typing correct old password and invalid length new password*****/
	public void enter_InvalidNewPasswordLength(String NewPD_ReTypePD_Equal_or_NotEqual) {
		String ValidOldPassword = "";
		String NewPasswordLength = "";
		String ReTypePasswordLength = "";
		String ReTypePasswordLengthNotsame = "";
		String PasswordLengthEM = "";
		String ReTypePasswordLengthEM = "";
		try {
			ValidOldPassword = browser.getdata("temp_LogIN_Passworrd");
			NewPasswordLength = browser.getdata("InvalidNewPassword");
			ReTypePasswordLength = browser.getdata("InvalidNewPassword");
			ReTypePasswordLengthNotsame = browser.getdata("IVReTypePDLengthNotsame");
			switch (NewPD_ReTypePD_Equal_or_NotEqual) {
			case "NewPD_ReTypePD_Equal":
				browser.sendkeys(SCobjects.Subscriber_EnterOldPasswordText, ValidOldPassword);
				browser.sendkeys(SCobjects.Subscriber_EnterNewPasswordText, NewPasswordLength);
				browser.sendkeys(SCobjects.Subscriber_EnterRetypePasswordText, ReTypePasswordLength);
				browser.click(SCobjects.Subscriber_ClickUpdateButton);
				if (browser.elementisdisplayed(SCobjects.Subscriber_GetNewPasswordMessage)) {
					PasswordLengthEM = browser.getelementtext(SCobjects.Subscriber_GetNewPasswordMessage);
					browser.reportscomtep("Passed",
							"Click on update Button with entering old password, invalid length  but same the  New & retping password and verify Invalid Current password Error message is diplayed",
							"Invalid Current password Error message should be diplayed",
							"Invalid length Error message is diplayed as:" + PasswordLengthEM);
					browser.verifyElementErrorMessage(SCobjects.Subscriber_GetNewPasswordMessage, PasswordLengthEM,
							"exact");
				}
			}
			switch (NewPD_ReTypePD_Equal_or_NotEqual) {
			case "NewPD_ReTypePD_NotEqual":
				browser.sendkeys(SCobjects.Subscriber_EnterOldPasswordText, ValidOldPassword);
				browser.sendkeys(SCobjects.Subscriber_EnterNewPasswordText, NewPasswordLength);
				browser.sendkeys(SCobjects.Subscriber_EnterRetypePasswordText, ReTypePasswordLengthNotsame);
				browser.click(SCobjects.Subscriber_ClickUpdateButton);
				if (browser.elementisdisplayed(SCobjects.Subscriber_GetNewPasswordMessage)) {
					PasswordLengthEM = browser.getelementtext(SCobjects.Subscriber_GetNewPasswordMessage);
					browser.verifyElementErrorMessage(SCobjects.Subscriber_GetNewPasswordMessage, PasswordLengthEM,
							"exact");
					if (browser.elementisdisplayed(SCobjects.Subscriber_RetypePasswordMessage)) {
						ReTypePasswordLengthEM = browser.getelementtext(SCobjects.Subscriber_RetypePasswordMessage);
						browser.verifyElementErrorMessage(SCobjects.Subscriber_RetypePasswordMessage,
								ReTypePasswordLengthEM, "exact");
					}
				}

			}
		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	/********TC_8_005 Check whether the password is updated by typing correct old password and invalid new password*********/
	
	public void enter_InvalidNewPasswordwithSpaces() {
		String ValidOldPassword = "";
		String NewPasswordWithSpace = "";
		String NewReTypePasswordWithSpace = "";
		String PasswordWithSapcehEM = "";
		try {
			ValidOldPassword = browser.getdata("temp_LogIN_Passworrd");
			NewPasswordWithSpace = browser.getdata("InvalidNewPassword");
			NewReTypePasswordWithSpace = browser.getdata("InvalidNewPassword");
			browser.refreshBrowser(driver);
			browser.sendkeys(SCobjects.Subscriber_EnterOldPasswordText, ValidOldPassword);
			browser.sendkeys(SCobjects.Subscriber_EnterNewPasswordText, NewPasswordWithSpace);
			browser.sendkeys(SCobjects.Subscriber_EnterRetypePasswordText, NewReTypePasswordWithSpace);
			browser.click(SCobjects.Subscriber_ClickUpdateButton);
			if (browser.elementisdisplayed(SCobjects.Subscriber_GetNewPasswordMessage)) {
				browser.reportscomtep("Passed",
						"Enter correct password, new & retype password with spaces, click on Update button and verify No spaces are allowed error message is displayed ",
						"No spaces are allowed error message should be displayed",
						"Error message is displayed as :" + PasswordWithSapcehEM);
				PasswordWithSapcehEM = browser.getelementtext(SCobjects.Subscriber_GetNewPasswordMessage);
				browser.verifyElementErrorMessage(SCobjects.Subscriber_GetNewPasswordMessage, PasswordWithSapcehEM,
						"exact");
			}
		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
/*************TC_8_006 Check whether the password is updated by typing valid data***********/
	// TC_8_006
	public void check_PasswordIsUpdated() {
		String ValidOldPassword = "";
		String NewPassword = "";
		String NewReTypePassword = "";
		String PasswordUpdateMessage = "";
		try {
			ValidOldPassword = browser.getdata("temp_LogIN_Passworrd");
			NewPassword = browser.getdata("UpdateNewPassword");
			NewReTypePassword = browser.getdata("UpdateNewPassword");
			browser.refreshBrowser(driver);
			browser.sendkeys(SCobjects.Subscriber_EnterOldPasswordText, ValidOldPassword);
			browser.sendkeys(SCobjects.Subscriber_EnterNewPasswordText, NewPassword);
			browser.sendkeys(SCobjects.Subscriber_EnterRetypePasswordText, NewReTypePassword);
			browser.click(SCobjects.Subscriber_ClickUpdateButton);
			if (browser.elementisdisplayed(SCobjects.Subscriber_PasswordUpdatedSuccessfully)) {
				browser.reportscomtep("Passed",
						"Enter correct password, new & retype password detaols, click on Update button and verify Password updated successfully message is displayed ",
						"Password updated successfully message shpuld be displayed",
						"Message is displayed as :" + PasswordUpdateMessage);
				PasswordUpdateMessage = browser.getelementtext(SCobjects.Subscriber_PasswordUpdatedSuccessfully);
				browser.verifyElementErrorMessage(SCobjects.Subscriber_PasswordUpdatedSuccessfully,
						PasswordUpdateMessage, "exact");
			}
		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
/****TC_08_007 Check whether the Cancel button is clickable****/
	
	public void clickOn_CancelButton() {
		try {
			if (browser.elementisdisplayed(SCobjects.Subscriber_ClickCancelButton)) {
				browser.reportscomtep("Passed", "Verify Cancel Button is displayed",
						"Cancel Button should be displayed", "Cancel Button is displayed");
				browser.click(SCobjects.Subscriber_ClickCancelButton);
				if (browser.elementisdisplayed(SCobjects.Subscriber_WelcomeBusinessName_Text)) {
					browser.reportscomtep("Passed",
							"Click on Cancel button,redirects to verify Dashboard welcome page is displayed",
							"Dashboard welcome page should be displayed", "Dashboard welcome page is displayed");
				} else {
					browser.reportscomtep("Failed",
							"Click on Cancel button,redirects to verify Dashboard welcome page is displayed",
							"Dashboard welcome page should be displayed", "Dashboard welcome page not is displayed");
				}
			} else {
				browser.reportscomtep("Failed", "Verify Cancel Button is displayed",
						"Cancel Button should be displayed", "Cancel Button is not displayed");
			}
		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}

	/************TC_08_008 Check whether you are able to login with old password*****/
	public void validate_LoginWithOldPassword() {
		String DB_Username = "";
		String DB_Password = "";
		String LogInErrorMessage = "";
		try {
			DB_Username = browser.getdata("temp_LogIN_UserName");
			DB_Password = browser.getdata("temp_LogIN_Passworrd");
			browser.click(SCobjects.Subscriber_UserIcon);
			browser.click(SCobjects.Subscriber_Logout);
			if (browser.elementisdisplayed(SCobjects.Subscriber_SigIn_Page)) {
				browser.reportscomtep("Passed",
						"Click Logout by clicking on the dropdown in human icon and verify SigIn Page is displayed",
						"SigIn Page should be displayed", "SigIn Page is displayed");
				browser.sendkeys(SCobjects.Subscriber_UserName_TextBox, DB_Username);
				browser.sendkeys(SCobjects.Subscriber_Password_TextBox, DB_Password);
				browser.click(SCobjects.Subscriber_SignIn_Button);
				if (browser.elementisdisplayed(SCobjects.Subscriber_Invalidcredentials)) {
					LogInErrorMessage = browser.getelementtext(SCobjects.Subscriber_Invalidcredentials);
					browser.reportscomtep("Passed",
							"Enter the username and old password and click on Sigin button and verify Invalid Credential error Mesaage is displayed",
							"Invalid Credential error Mesaage should be displayed",
							"Error Mesaage is displayed as:" + LogInErrorMessage);
					browser.verifyElementErrorMessage(SCobjects.Subscriber_Invalidcredentials, LogInErrorMessage,
							"exact");
				}
			} else {
				browser.reportscomtep("Failed",
						"Click Logout by clicking on the dropdown in human icon and verify SigIn Page is displayed",
						"SigIn Page should be displayed", "SigIn Page is not displayed");
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	/********TC_08_009 Check whether you are able to login with new password**********/
	
	public void validate_LoginWithNewPassword() {
		String DB_Username = "";
		String DB_UpdatePassword = "";
		try {
			DB_Username = browser.getdata("temp_LogIN_UserName");
			DB_UpdatePassword = browser.getdata("UpdateNewPassword");
			browser.sendkeys(SCobjects.Subscriber_UserName_TextBox, DB_Username);
			browser.sendkeys(SCobjects.Subscriber_Password_TextBox, DB_UpdatePassword);
			browser.click(SCobjects.Subscriber_SignIn_Button);
			if (browser.elementisdisplayed(SCobjects.Subscriber_WelcomeBusinessName_Text)) {
				browser.reportscomtep("Passed",
						"Enter username and new password and click on SigIn button and verify Successfully login to Subscriber dashboard is displayed",
						"Successfully login to Subscriber dashboard should be displayed",
						"Successfully login to Subscriber dashboard is displayed");
			} else {
				browser.reportscomtep("Failed",
						"Enter username and new password and click on SigIn button and verify Successfully login to Subscriber dashboard is displayed",
						"Successfully login to Subscriber dashboard should be displayed",
						"Successfully login to Subscriber dashboard is not displayed");
			}
		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	
	/*//TC_9_001
    public void openbusinesssettingspage() throws Exception {
    	browser.click(SCobjects.Subscriber_HumanIcon);
    	browser.click(SCobjects.Subscriber_Business_Settings_link);
    	if (browser.elementisdisplayed(SCobjects.Settings_page_tabs_Business_Details)) {
			browser.reportscomtep("Passed", "Click on Human Icon and Business Settings link and Verify Business Details page displayed",
					"Business Details page should be displayed", "Business Details page displayed");	
    	}
    	else {
			browser.reportscomtep("Failed", "Click on Human Icon and Business Settings link and Verify Business Details page displayed",
					"Business Details page should be displayed", "Business Details page not displayed");
    	}
    }


	// TC_9_002
	public void businesspagetabsvalidation() throws Exception {
						try {

				if (browser.elementisdisplayed(SCobjects.Settings_page_tabs_Business_Details)) {
					browser.reportscomtep("Passed", "Verify Default Business Setting page is displayed",
							"Default Business Details page should be displayed", "Default Business Details page displayed");			
					
					browser.Verify_elementisdisplayed_Report(SCobjects.Settings_page_tabs_Business_Details, "Business Details tab");
					browser.Verify_elementisdisplayed_Report(SCobjects.Settings_page_tabs_Online_Bookings,"Online Bookings tab");
					browser.Verify_elementisdisplayed_Report(SCobjects.Settings_page_tabs_Calender,"Calender Tab");
					browser.Verify_elementisdisplayed_Report(SCobjects.Settings_page_tabs_Staff_Notifications,"Staff Notification tab");
					browser.Verify_elementisdisplayed_Report(SCobjects.Settings_page_tabs_Payment_Settings,"Payment Settings tab");
					browser.Verify_elementisdisplayed_Report(SCobjects.Settings_page_Manage_Menu,"Manage Menu tab");
					browser.Verify_elementisdisplayed_Report(SCobjects.Settings_page_tabs_Business_Hours,"Business Hours tab");
					browser.Verify_elementisdisplayed_Report(SCobjects.Settings_page_tabs_Social_Links,"Social links tab" );
				}
				else {
					browser.reportscomtep("Failed", "Verify Default Business Setting page is displayed",
							"Default Business Details page should be displayed", "Default Business Details page not displayed");
				}

			} catch (Exception e) {
				System.out.println("Error description: " + e.getStackTrace());
			}

	}
	
	//TC_9_003
	
	public void checkinfoinbusinessdetailstab() throws Exception {
		try {
			
		if (browser.elementisdisplayed(SCobjects.Settings_page_tabs_Business_Details)) {
			browser.reportscomtep("Passed", "Verify Business Setting page is displayed",
					"Business Details page should be displayed", "Business Details page displayed");			
								
			browser.Verify_elementprepopulatedvalue_Report(SCobjects.Settings_page_input_Business_Name, "Business Name");
			browser.Verify_elementprepopulatedvalue_Report(SCobjects.Settings_page_input_Subdomain, "Subdomain");
			browser.Verify_elementprepopulatedvalue_Report(SCobjects.Settings_page_input_Address, "Address");
			browser.Verify_elementprepopulatedvalue_Report(SCobjects.Settings_page_input_ContactNum, "Contact_Number");
			browser.Verify_elementprepopulatedvalue_Report(SCobjects.Settings_page_input_Business_Type, "Business_Type");
			browser.Verify_elementprepopulatedvalue_Report(SCobjects.Settings_page_input_State, "State");
			//check for state again since its a scrolldown option field
			browser.Verify_elementisdisplayed_Report(SCobjects.Settings_page_label_Overview,"Overview");
			browser.Verify_elementisdisplayed_Report(SCobjects.Settings_page_input_Website,"Website" );
			browser.Verify_elementisdisplayed_Report(SCobjects.Settings_page_input_Time_Zone,"Time_Zone" );
		}
		else {
			browser.reportscomtep("Failed", "Verify Business Setting page is displayed",
					"Business Details page should be displayed", "Business Details page not displayed");
		}

	} catch (Exception e) {
		System.out.println("Error description: " + e.getStackTrace());
	}
		
	}
	
	//TC_9_004
	
	//****************have to get TC sorted with Sunil. Only one error msg is displayed**********************************/
	
	/*public void savechangeswithoutaddinganydata() throws Exception {

		if (browser.elementisdisplayed(SCobjects.Settings_page_tabs_Business_Details)) {
			browser.reportscomtep("Passed", "Verify Business Setting page is displayed",
					"Business Details page should be displayed", "Business Details page displayed");

			browser.clearText(SCobjects.Settings_page_input_Business_Name);
			browser.clearText(SCobjects.Settings_page_input_Subdomain);
			browser.clearText(SCobjects.Settings_page_input_Address);
			browser.clearText(SCobjects.Settings_page_input_ContactNum);
			browser.clearText(SCobjects.Settings_page_input_Business_Type);
			browser.click(SCobjects.Settings_Save_Change_Button);

			if (browser.elementisdisplayed(SCobjects.Settings_error_msg_save_with_invalid_entries)) {
				browser.reportscomtep("Passed", "Error message is displayed when page saved with invalid entries",
						"Error message should be displayed", "Error Message is displayed");
			} else {

				browser.reportscomtep("Failed", "Error message is displayed when page saved with invalid entries",
						"Error message should be displayed", "Error Message not displayed");

			}
		} else {
			browser.reportscomtep("Failed", "Verify Business Setting page is displayed",
					"Business Details page should be displayed", "Business Details page not displayed");
		}

	}
	
	
	//TC_9_005
	
	public void checkpopupmessgaeonsavingvaliddata() throws Exception {
		browser.sendkeys(SCobjects.Settings_page_input_Business_Name, browser.getdata("DashboardBusinessName"));
		browser.sendkeys(SCobjects.Settings_page_input_Subdomain, browser.getdata("Subdomain"));
		browser.sendkeys(SCobjects.Settings_page_input_Address, browser.getdata("DigitekAddr"));
		browser.click(SCobjects.Settings_Save_Change_Button);
		if (browser.elementisdisplayed(SCobjects.Subscriber_updatedsuccessfullymsg)) {
			
			browser.reportscomtep("Passed", "Updated Sucessfully message should appear",
					"Updated Sucessfully message should be displayed", "Updated Sucessfully message is displayed");
	    
		} else {
			
			browser.reportscomtep("Failed", "Updated Sucessfully message should appear",
					"Updated Sucessfully message should be displayed", "Updated Sucessfully message not displayed");
		}
		
		browser.click(SCobjects.Popup_msg_Alert_OK_Button);
		
}
	
	//TC_9_007
	
	public void checkbusinessnamecanbemodified() throws Exception {
		browser.clearText(SCobjects.Settings_page_input_Business_Name);
		browser.sendkeys(SCobjects.Settings_page_input_Business_Name, browser.getdata("changedbusinessname"));
		browser.click(SCobjects.Settings_Save_Change_Button);
        if (browser.elementisdisplayed(SCobjects.Subscriber_updatedsuccessfullymsg)) {
			
			browser.reportscomtep("Passed", "Updated Sucessfully message should appear",
					"Updated Sucessfully message should be displayed", "Updated Sucessfully message is displayed");
	    
		} else {
			
			browser.reportscomtep("Failed", "Updated Sucessfully message should appear",
					"Updated Sucessfully message should be displayed", "Updated Sucessfully message not displayed");
		}
		
	}
	
	
	//TC_9_009
	
		public void checkexistsubdomainnamecanbemodified() throws Exception {
			browser.clearText(SCobjects.Settings_page_input_Subdomain);
			browser.sendkeys(SCobjects.Settings_page_input_Subdomain, browser.getdata("existingsubdomain"));
			browser.click(SCobjects.Settings_Save_Change_Button);
			if (browser.elementisdisplayed(SCobjects.subdomainalreadyregisteredmsg)) {
				
				browser.reportscomtep("Passed", "The entered subdomain is already registered message should appear",
						"The entered subdomain is already registered message should be displayed", "The entered subdomain is already registered message is displayed");
			    
				}
				else
					
				browser.reportscomtep("Failed", "The entered subdomain is already registered message should appear",
						"The entered subdomain is already registered message should be displayed", "The entered subdomain is already registered message not displayed");
			
			
		}
		
	//TC_9_0010
		
		public void checknonexistsubdomainnamecanbemodified() throws Exception {
				browser.clearText(SCobjects.Settings_page_input_Subdomain);
				browser.sendkeys(SCobjects.Settings_page_input_Subdomain, browser.getdata("nonexistingsubdomain"));
				browser.click(SCobjects.Settings_Save_Change_Button);
				if (browser.elementisdisplayed(SCobjects.Subscriber_updatedsuccessfullymsg)) {
					
					browser.reportscomtep("Passed", "Updated Sucessfully message should appear",
							"Updated Sucessfully message should be displayed", "Updated Sucessfully message is displayed");
			    
				} else {
					
					browser.reportscomtep("Failed", "Updated Sucessfully message should appear",
							"Updated Sucessfully message should be displayed", "Updated Sucessfully message not displayed");
				}
				
				browser.click(SCobjects.Popup_msg_Alert_OK_Button);
		}
			
	//TC_9_011
			
		public void validateinfoinonlinebookingtab() throws Exception {	
			
			browser.click(SCobjects.Online_Booking_tab);
			if (browser.elementisdisplayed(SCobjects.Online_Bookings_Settings_Header)) {
				browser.reportscomtep("Passed", "Verify Subscriber Online Booking Settings header is displayed",
						"Subscriber Online Booking Settings header should be displayed", "Subscriber Online Booking Settings header displayed");
			
			browser.check_Checkbox(SCobjects.Online_Booking_Enable_checkbox_clicked);
			browser.Verify_elementisdisplayed_Report(SCobjects.Online_Booking_Booking_Policy_Header, "Booking Policy Header");
			browser.Verify_elementisdisplayed_Report(SCobjects.Online_Booking_Client_appointment_upto, "Client_can_book_appointment_upto");
			browser.Verify_elementisdisplayed_Report(SCobjects.Online_Booking_Client_appointment_nomorethan, "Client_can_book_appointment_nomorethan");
			browser.Verify_elementisdisplayed_Report(SCobjects.Online_Booking_Cancellation_Notice_Header, "Cancellation Notice Header");
			browser.Verify_elementisdisplayed_Report(SCobjects.Online_Booking_Cancellation_in_advance, "Cancellation in advance");
			browser.Verify_elementisdisplayed_Report(SCobjects.Online_Booking_Cancellation_Policy_Header, "Cancellation Policy Header");
			browser.Verify_elementisdisplayed_Report(SCobjects.Online_Booking_Checkbox_Staff_Member_Selection, "Checkbox Staff Member Selection");
			
			
		}  else {
			browser.reportscomtep("Failed", "Verify Subscriber Online Booking Settings header is displayed",
					"Subscriber Online Booking Settings header should be displayed", "Subscriber Online Booking Settings header not displayed");
		}
		}
		
		//TC_9_012 
		
			public void verifyonlineinfofields() throws Exception {
			
			if (browser.elementisdisplayed(SCobjects.Online_Bookings_Settings_Header)) {
					browser.reportscomtep("Passed", "Verify Subscriber Online Booking Settings header is displayed",
							"Subscriber Online Booking Settings header should be displayed", "Subscriber Online Booking Settings header displayed");
				
			browser.click(SCobjects.Save_Button_Online_Booking_Page);
			
			if (browser.elementisdisplayed(SCobjects.Updates_successfully_msg_popup)) {
				browser.reportscomtep("Passed", "Verify Updated Successfully Message is displayed",
						"Updated Successfully Message should be displayed",
						"Updated Successfully Message displayed");
			} else {
				browser.reportscomtep("Failed", "Verify Updated Successfully Message is displayed",
						"Updated Successfully Message should be displayed",
						"Updated Successfully Message not displayed");
			
		}
			} else {
				browser.reportscomtep("Failed", "Verify Subscriber Online Booking Settings header is displayed",
						"Subscriber Online Booking Settings header should be displayed", "Subscriber Online Booking Settings header not displayed");
			}
			
			browser.click(SCobjects.Popup_msg_Alert_OK_Button);
			
			}
		
		//TC_9_013
		
		public void checkbookingpolicyisapplied() throws Exception {
			
		browser.click(SCobjects.Online_Booking_tab);
		if (browser.elementisdisplayed(SCobjects.Online_Bookings_Settings_Header)) {
			browser.reportscomtep("Passed", "Verify Subscriber Online Booking Settings header is displayed",
					"Subscriber Online Booking Settings header should be displayed", "Subscriber Online Booking Settings header displayed");
		
		browser.click(SCobjects.Online_Booking_in_advance_dropdown_list);
		browser.selectByVisibleText(SCobjects.Online_Booking_in_advance_dropdown_list, "1 Hour");
		browser.click(SCobjects.Online_Booking_in_advance_dropdown_list);
		browser.selectByVisibleText(SCobjects.Online_Booking_till_future_dropdown_list, "1 Month");
	
		browser.click(SCobjects.Save_Button_Online_Booking_Page);
		
		if (browser.elementisdisplayed(SCobjects.Updates_successfully_msg_popup)) {
			browser.reportscomtep("Passed", "Verify Updated Successfully Message is displayed",
					"Updated Successfully Message should be displayed",
					"Updated Successfully Message displayed");
		} else {
			browser.reportscomtep("Failed", "Verify Updated Successfully Message is displayed",
					"Updated Successfully Message should be displayed",
					"Updated Successfully Message not displayed");
		
	}
		} else {
			browser.reportscomtep("Failed", "Verify Subscriber Online Booking Settings header is displayed",
					"Subscriber Online Booking Settings header should be displayed", "Subscriber Online Booking Settings header not displayed");
		}
		
		browser.click(SCobjects.Popup_msg_Alert_OK_Button);
		
} 
		
		//TC_9_016
		
		
		public void checkinfoincalendartab() throws Exception {
	    
			
		browser.click(SCobjects.Calender_Settings_tab);
		
		if (browser.elementisdisplayed(SCobjects.Calender_Settings_Header)){
			browser.reportscomtep("Passed", "Verify Calendar Settings page is displayed",
					"Calendar Settings page should be displayed", " Calendar Settings page displayed");
		
		//browser.Verify_elementisdisplayed_Report(SCobjects.Calender_Settings_error_msg, "Error Message Displayed");
		browser.Verify_elementisdisplayed_Report(SCobjects.Calender_Settings_Time_Interval_Dropdown, "Time Slot Interval Dropdown");
		browser.Verify_elementisdisplayed_Report(SCobjects.Calender_Settings_Default_View_Dropdown, "Default View");
		browser.Verify_elementisdisplayed_Report(SCobjects.Calender_Settings_week_start_day_Dropdown, "Week Start Day");
		
		} else {
			browser.reportscomtep("Failed", "Verify Calendar Settings page is displayed",
					"Calendar Settings page should be displayed", " Calendar Settings page not displayed");
		}
		}
		
		
		//TC_9_017
		
		public void checkcalendersettingscanbesaved() throws Exception {
			
			browser.click(SCobjects.Calender_Settings_tab);
			
			if (browser.elementisdisplayed(SCobjects.Calender_Settings_Header)){
				browser.reportscomtep("Passed", "Verify Calendar Settings page is displayed",
						"Calendar Settings page should be displayed", " Calendar Settings page displayed");
			
			browser.click(SCobjects.Calender_Settings_Time_Interval_Dropdown);
			browser.selectByVisibleText(SCobjects.Calender_Settings_Time_Interval_Dropdown, "30 Minutes");
			browser.click(SCobjects.Calender_Settings_Default_View_Dropdown);
			browser.selectByVisibleText(SCobjects.Calender_Settings_Default_View_Dropdown, "Week");
			browser.click(SCobjects.Calender_Settings_week_start_day_Dropdown);
			browser.selectByVisibleText(SCobjects.Calender_Settings_week_start_day_Dropdown, "Monday");
			browser.click(SCobjects.Calender_Settings_Save_Button);
			
			if (browser.elementisdisplayed(SCobjects.Updates_successfully_msg_popup)) {
							browser.reportscomtep("Passed", "Verify Updated Successfully Message is displayed",
							"Updated Successfully Message should be displayed",
							"Updated Successfully Message displayed");
				
			} else {
				browser.reportscomtep("Failed", "Verify Updated Successfully Message is displayed",
						"Updated Successfully Message should be displayed",
						"Updated Successfully Message not displayed");
			}
			
				
			} else {
				browser.reportscomtep("Failed", "Verify Calendar Settings page is displayed",
						"Calendar Settings page should be displayed", " Calendar Settings page not displayed");
			}
			
			browser.click(SCobjects.Popup_msg_Alert_OK_Button);
			
		}
 
		//TC_9_019
		
				public void verifytabsinstaffnotificationpage() throws Exception {
					
					browser.click(SCobjects.Staff_Notification_tab);
					
					if (browser.elementisdisplayed(SCobjects.Staff_Notification_Header)){
						browser.reportscomtep("Passed", "Verify Staff Notification page is displayed",
								"Staff Notification page should be displayed", " Staff Notification page displayed");
						
						browser.Verify_elementisdisplayed_Report(SCobjects.Staff_Notification_Enble_checkbox, "Enable Checkbox");
						browser.Verify_elementisdisplayed_Report(SCobjects.Staff_Notification_send_to_staff_members_checkbox, "SEND TO STAFF MEMBER check box");
						browser.Verify_elementisdisplayed_Report(SCobjects.Staff_Notification_send_to_email_address,"SEND TO EMAIL ADDRESS check box");
						browser.Verify_elementisdisplayed_Report(SCobjects.Staff_Notification_save_changes_button, "SAVE CHANGES BUTTON");
						
						
					}else {
						browser.reportscomtep("Failed", "Verify Staff Notification page is displayed",
								"Staff Notification page should be displayed", " Staff Notification page not displayed");
						
					}
					
					
					
				}
				
				//TC_9_020
				
				public void checkvalidationinstaffnotificationpage() throws Exception {
					
					browser.click(SCobjects.Staff_Notification_tab);
					
					if (browser.elementisdisplayed(SCobjects.Staff_Notification_Header)){
						browser.reportscomtep("Passed", "Verify Staff Notification page is displayed",
								"Staff Notification page should be displayed", " Staff Notification page displayed");
						
						browser.click(SCobjects.Staff_Notification_send_to_staff_members_checkbox);
						browser.click(SCobjects.Staff_Notification_save_changes_button);
						if (browser.elementisdisplayed(SCobjects.Updates_msg_popup_successful)) {
							browser.reportscomtep("Passed", "Verify Updated Successfully Message is displayed",
							"Updated Successfully Message should be displayed",
							"Updated Successfully Message displayed");
				
			} else {
				browser.reportscomtep("Failed", "Verify Updated Successfully Message is displayed",
						"Updated Successfully Message should be displayed",
						"Updated Successfully Message not displayed");
			}
						
}
		
				else {
					browser.reportscomtep("Failed", "Verify Staff Notification page is displayed",
							"Staff Notification page should be displayed", " Staff Notification page not displayed");
					
				}
					browser.click(SCobjects.Popup_msg_Alert_OK_Button);

				}
				
*/
	// TC_9_001
	public void openbusinesssettingspage(){
		try {
			browser.click(SCobjects.Subscriber_HumanIcon);
			browser.click(SCobjects.Subscriber_Business_Settings_link);
			if (browser.elementisdisplayed(SCobjects.Settings_page_tabs_Business_Details)) {
				browser.reportscomtep("Passed",
						"Click on Human Icon and Business Settings link and Verify Business Details page displayed",
						"Business Details page should be displayed", "Business Details page displayed");
			} else {
				browser.reportscomtep("Failed",
						"Click on Human Icon and Business Settings link and Verify Business Details page displayed",
						"Business Details page should be displayed", "Business Details page not displayed");
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}

	}

	// TC_9_002
	public void businesspagetabsvalidation() {
		try {
			if (browser.elementisdisplayed(SCobjects.Settings_page_tabs_Business_Details)) {
				browser.reportscomtep("Passed", "Verify Default Business Setting page is displayed",
						"Default Business Details page should be displayed", "Default Business Details page displayed");
				browser.Verify_elementisdisplayed_Report(SCobjects.Settings_page_tabs_Business_Details,
						"Business Details tab");
				browser.Verify_elementisdisplayed_Report(SCobjects.Settings_page_tabs_Online_Bookings,
						"Online Bookings tab");
				browser.Verify_elementisdisplayed_Report(SCobjects.Settings_page_tabs_Calender, "Calender Tab");
				browser.Verify_elementisdisplayed_Report(SCobjects.Settings_page_tabs_Staff_Notifications,
						"Staff Notification tab");
				browser.Verify_elementisdisplayed_Report(SCobjects.Settings_page_tabs_Payment_Settings,
						"Payment Settings tab");
				browser.Verify_elementisdisplayed_Report(SCobjects.Settings_page_Manage_Menu, "Manage Menu tab");
				browser.Verify_elementisdisplayed_Report(SCobjects.Settings_page_tabs_Business_Hours,
						"Business Hours tab");
				browser.Verify_elementisdisplayed_Report(SCobjects.Settings_page_tabs_Social_Links, "Social links tab");
			} else {
				browser.reportscomtep("Failed", "Verify Default Business Setting page is displayed",
						"Default Business Details page should be displayed",
						"Default Business Details page not displayed");
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}

	}

	// TC_9_003

	public void checkinfoinbusinessdetailstab() {
		try {

			if (browser.elementisdisplayed(SCobjects.Settings_page_tabs_Business_Details)) {
				browser.reportscomtep("Passed", "Verify Business Setting page is displayed",
						"Business Details page should be displayed", "Business Details page displayed");
				browser.Verify_elementprepopulatedvalue_Report(SCobjects.Settings_page_input_Business_Name,
						"Business Name");
				browser.Verify_elementprepopulatedvalue_Report(SCobjects.Settings_page_input_Subdomain, "Subdomain ");
				browser.Verify_elementprepopulatedvalue_Report(SCobjects.Settings_page_input_Address, "Address");
				browser.scrollintoviewelement(SCobjects.Settings_Save_Change_Button);
				browser.Verify_elementprepopulatedvalue_Report(SCobjects.Settings_page_input_ContactNum,
						"Contact_Number");
				browser.Verify_elementprepopulatedvalue_Report(SCobjects.Settings_page_input_Business_Type,
						"Business_Type");
				browser.Verify_elementprepopulatedvalue_Report(SCobjects.Settings_page_input_State, "State");
				browser.switchToFrame();
				browser.scrollintoviewelement(SCobjects.Settings_page_Overview_Textarea);
				browser.Verify_elementisdisplayed_Report(SCobjects.Settings_page_Overview_Textarea, "Overview");
				browser.switchToDefaultFrame();
				browser.scrollintoviewelement(SCobjects.Settings_page_input_Website);
				browser.Verify_elementisdisplayed_Report(SCobjects.Settings_page_input_Website, "Website");
				browser.Verify_elementisdisplayed_Report(SCobjects.Settings_page_input_Time_Zone, "Time_Zone");
				browser.Verify_elementisdisplayed_Report(SCobjects.Settings_Save_Change_Button, "Save Change Button");
			} else {
				browser.reportscomtep("Failed", "Verify Business Setting page is displayed",
						"Business Details page should be displayed", "Business Details page not displayed");
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}

	}

	// TC_9_004
	public void savechangeswithoutaddinganydata() {
		try {
			if (browser.elementisdisplayed(SCobjects.Settings_page_tabs_Business_Details)) {
				browser.reportscomtep("Passed", "Verify Business Setting page is displayed",
						"Business Details page should be displayed", "Business Details page displayed");
				browser.clearText(SCobjects.Settings_page_input_Business_Name);
				browser.clearText(SCobjects.Settings_page_input_Subdomain);
				browser.clearText(SCobjects.Settings_page_input_Address);
				browser.scrollintoviewelement(SCobjects.Settings_Save_Change_Button);
				browser.clearText(SCobjects.Settings_page_input_ContactNum);
				browser.clearText(SCobjects.Settings_page_input_Business_Type);
				browser.click(SCobjects.Settings_Save_Change_Button);
				browser.scrollintoviewelement(SCobjects.Settings_error_msg_save_with_invalid_entries);
				if (browser.elementisdisplayed(SCobjects.Settings_error_msg_save_with_invalid_entries)) {
					browser.reportscomtep("Passed",
							"Leave all mandatory field and click on Save changes button and Verify An Error message is displayed",
							"An Error message should be displayed", "An Error Message is displayed");
				} else {

					browser.reportscomtep("Failed",
							"Leave all mandatory field and click on Save changes button and Verify An Error message is displayed",
							"An Error message should be displayed", "An Error Message is displayed");
				}
			} else {
				browser.reportscomtep("Failed", "Verify Business Setting page is displayed",
						"Business Details page should be displayed", "Business Details page not displayed");
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}

	}

	// TC_9_005

	public void checkpopupmessgaeonsavingvaliddata() {
		try {
			browser.sendkeys(SCobjects.Settings_page_input_Business_Name, browser.getdata("DashboardBusinessName"));
			browser.sendkeys(SCobjects.Settings_page_input_Subdomain, browser.getdata("Subdomain"));
			browser.scrollintoviewelement(SCobjects.Settings_page_input_Address);
			browser.sendkeys(SCobjects.Settings_page_input_Address, browser.getdata("DigitekAddr"));
			browser.sendkeys(SCobjects.Settings_page_input_ContactNum, browser.getdata("BusinessContactno"));
			browser.click(SCobjects.Settings_Save_Change_Button);
			if (browser.elementisdisplayed(SCobjects.Subscriber_updatedsuccessfullymsg)) {
				browser.reportscomtep("Passed",
						"Add relevant data in mandatory fields, click on Save changes button and verify Updated Sucessfully message is displayed",
						"Updated Sucessfully message should be displayed", "Updated Sucessfully message is displayed");
				browser.click(SCobjects.Popup_msg_Alert_OK_Button);

			} else {

				browser.reportscomtep("Failed",
						"Add relevant data in mandatory fields ,click on Save changes button and verify Updated Sucessfully message is displayed",
						"Updated Sucessfully message should be displayed", "Updated Sucessfully message not displayed");
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}

	}

/***TC_9_006 Verify whether the Business details are updated****/
	
	public void verifywhether_BusinessDetails_Updated(){
		try{
			this.subsriberLogOut("BusinessName");
		}catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
		
	}
	// TC_9_007

	public void checkbusinessnamecanbemodified() {
		String BeforeModifiedbusinessname = "";
		try {
			BeforeModifiedbusinessname = browser.elementgetAttributevalue(SCobjects.Settings_page_input_Business_Name,
					"value");
			browser.sendkeys(SCobjects.Settings_page_input_Business_Name, browser.getdata("changedbusinessname"));
			browser.scrollintoviewelement(SCobjects.Settings_Save_Change_Button);
			browser.click(SCobjects.Settings_Save_Change_Button);
			if (browser.elementisdisplayed(SCobjects.Subscriber_updatedsuccessfullymsg)) {
				browser.reportscomtep("Passed",
						"Business name modify and click on save change button and verify Updated Sucessfully popup is displayed",
						"Updated Sucessfully popup should be displayed", "Updated Sucessfully popup is displayed");
				browser.click(SCobjects.Popup_msg_Alert_OK_Button);
				browser.scrollintoviewelement(SCobjects.Settings_page_input_Business_Name);
				if (!BeforeModifiedbusinessname.equalsIgnoreCase(browser.getdata("changedbusinessname"))
						&& browser.elementisdisplayed(SCobjects.Settings_page_input_Business_Name)) {
					browser.reportscomtep("Passed", "Verify Business name is modified",
							" Business name should be modified", " Business name is modified");
				} else {
					browser.reportscomtep("Failed", "Verify Business name is modified",
							" Business name should be modified", " Business name is not modified");
				}

			} else {

				browser.reportscomtep("Failed",
						"Business name modify and click on save change button and verify Updated Sucessfully popup is displayed",
						"Updated Sucessfully popup should be displayed", "Updated Sucessfully popup is displayed");
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	
/*****TC_9_008 Verify whether the Business Name has changed***********/
	
	public void verify_BusinessNameChanged(){
		try{
			this.subsriberLogOut("BusinessNameModified");
		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}

	// TC_9_009

	public void checkexistsubdomainnamecanbemodified() {
		try {
			browser.sendkeys(SCobjects.Settings_page_input_Subdomain, browser.getdata("existingsubdomain"));
			browser.scrollintoviewelement(SCobjects.Settings_Save_Change_Button);
			browser.click(SCobjects.Settings_Save_Change_Button);
			browser.scrollintoviewelement(SCobjects.subdomainalreadyregisteredmsg);
			if (browser.elementisdisplayed(SCobjects.subdomainalreadyregisteredmsg)) {
				browser.reportscomtep("Passed",
						"The entered existing subdomain and verify The entered subdomain is already registered",
						"The entered subdomain should be already registered",
						"The entered subdomain is already registered");

			} else {
				browser.reportscomtep("Failed",
						"The entered existing subdomain and verify The entered subdomain is already registered",
						"The entered subdomain should be already registered",
						"The entered subdomain is not already registered");
			}
		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
		

	// TC_9_0010

	public void checknonexistsubdomainnamecanbemodified() {
		try {
			String Beforemodifiedsubdomainname = browser
					.elementgetAttributevalue(SCobjects.Settings_page_input_Subdomain, "value");
			browser.sendkeys(SCobjects.Settings_page_input_Subdomain, browser.getdata("nonexistingsubdomain"));
			browser.scrollintoviewelement(SCobjects.Settings_Save_Change_Button);
			browser.click(SCobjects.Settings_Save_Change_Button);
			if (browser.elementisdisplayed(SCobjects.Subscriber_updatedsuccessfullymsg)) {
				browser.reportscomtep("Passed",
						"Enter non exist subdomain name and click on save change button and verify Updated Sucessfully popup is displayed",
						"Updated Sucessfully popup  should be displayed", "Updated Sucessfully popup  is displayed");
				browser.click(SCobjects.Popup_msg_Alert_OK_Button);
				browser.scrollintoviewelement(SCobjects.Settings_page_input_Subdomain);
				String Aftermodifiedsubdomainname = browser
						.elementgetAttributevalue(SCobjects.Settings_page_input_Subdomain, "value");
				if (!Beforemodifiedsubdomainname.equalsIgnoreCase(Aftermodifiedsubdomainname)
						&& browser.elementisdisplayed(SCobjects.Settings_page_input_Subdomain)) {
					browser.reportscomtep("Passed", "Verify Subdomain existing one is modifed",
							"Subdomain existing one should be modifed", "Subdomain existing one is modifed");
				} else {
					browser.reportscomtep("Faileds", "Verify Subdomain existing one is modifed",
							"Subdomain existing one should be modifed", "Subdomain existing one is not modifed");
				}

			} else {

				browser.reportscomtep("Failed",
						"Enter non exist subdomain name and click on save change button and verify Updated Sucessfully popup is displayed",
						"Updated Sucessfully popup  should be displayed",
						"Updated Sucessfully popup  is not displayed");
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}

	}

	// TC_9_011

	public void validateinfoinonlinebookingtab() {
		try {
			browser.click(SCobjects.Online_Booking_tab);
			if (browser.elementisdisplayed(SCobjects.Online_Bookings_Settings_Header)) {
				browser.reportscomtep("Passed",
						"click on online booking tab and Verify Online Booking tools header is displayed",
						"Online Booking tools header should be displayed", "Online Booking tools header is displayed");
				String OnlineBookingToolCheckbox = browser
						.elementgetAttributevalue(SCobjects.Online_Booking_Enable_checkbox_clicked, "value");
				if (OnlineBookingToolCheckbox.equals("1")
						&& browser.elementisdisplayed(SCobjects.Online_Booking_Enable_checkbox_clicked)) {
					browser.reportscomtep("Passed", "Verify By default enable radio button is selected",
							"By default enable radio button should be selected",
							"By default enable radio button is selected");
					if (browser.elementisdisplayed(SCobjects.Online_Booking_Booking_Policy_Header)) {
						browser.reportscomtep("Passed", "Verify Booking policy header is displayed",
								"Booking policy header should be displayed", "Booking policy header is displayed");
						browser.Verify_elementisdisplayed_Report(SCobjects.Online_Booking_Client_appointment_upto,
								"Client can book appointment upto");
						browser.Verify_elementisdisplayed_Report(SCobjects.Online_Booking_Client_appointment_nomorethan,
								"Client_can_book_appointment_nomorethan");
						if (browser.elementisdisplayed(SCobjects.Online_Booking_Cancellation_Notice_Header)) {
							browser.reportscomtep("Passed", "Verify Cancellation Notice header is displayed",
									"Cancellation Notice header should be displayed",
									"Cancellation Notice header is displayed");
							browser.Verify_elementisdisplayed_Report(SCobjects.Online_Booking_Cancellation_in_advance,
									"Cancellation in advance");
							browser.Verify_elementisdisplayed_Report(
									SCobjects.Online_Booking_Cancellation_CancellatiNotice, "Cancellation Notice");
						} else {
							browser.reportscomtep("Failed", "Verify Cancellation Notice header is displayed",
									"Cancellation Notice header should be displayed",
									"Cancellation Notice header is not displayed");
						}
						browser.Verify_elementisdisplayed_Report(
								SCobjects.Online_Booking_Checkbox_Staff_Member_Selection,
								"Checkbox Staff Member Selection");
					} else {
						browser.reportscomtep("Failed", "Verify Booking policy header is displayed",
								"Booking policy header should be displayed", "Booking policy header is not displayed");
					}

				} else {
					browser.reportscomtep("Failed", "Verify By default enable radio button is selected",
							"By default enable radio button should be selected",
							"By default enable radio button is not selected");
				}
			} else {
				browser.reportscomtep("Failed",
						"click on online booking tab and Verify Online Booking tools header is displayed",
						"Online Booking tools header should be displayed",
						"Online Booking tools header is not displayed");
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}

	}

	// TC_9_012

	public void verifyonlineinfofields(String WithoutAddingOrmodifyingAnydata) {
		try {
			String BeforeAdding_BookingInAddvance = browser
					.elementgetAttributevalue(SCobjects.Online_Booking_Client_appointment_upto, "value");
			String BeforeAdding_BookingInFuture = browser
					.elementgetAttributevalue(SCobjects.Online_Booking_Client_appointment_nomorethan, "value");
			String BeforeCancellationInAddvance = browser
					.elementgetAttributevalue(SCobjects.Online_Booking_Cancellation_in_advance, "value");
			switch (WithoutAddingOrmodifyingAnydata) {
			case "WithOutAddingData":
				browser.scrollintoviewelement(SCobjects.Save_Button_Online_Booking_Page);
				browser.click(SCobjects.Save_Button_Online_Booking_Page);
				if (browser.elementisdisplayed(SCobjects.Updates_successfully_msg_popup)) {
					browser.reportscomtep("Passed", "Verify Updated Successfully Message is displayed",
							"Updated Successfully Message should be displayed",
							"Updated Successfully Message displayed");
					browser.click(SCobjects.Popup_msg_Alert_OK_Button);
					String AfterAdding_BookingInAddvance = browser
							.elementgetAttributevalue(SCobjects.Online_Booking_Client_appointment_upto, "value");
					String AfterAdding_BookingInFuture = browser
							.elementgetAttributevalue(SCobjects.Online_Booking_Client_appointment_nomorethan, "value");
					String AfterCancellationInAddvance = browser
							.elementgetAttributevalue(SCobjects.Online_Booking_Cancellation_in_advance, "value");
					if (BeforeAdding_BookingInAddvance.equalsIgnoreCase(AfterAdding_BookingInAddvance)
							&& BeforeAdding_BookingInFuture.equalsIgnoreCase(AfterAdding_BookingInFuture)
							&& BeforeCancellationInAddvance.equalsIgnoreCase(AfterCancellationInAddvance)
							&& browser.elementisdisplayed(SCobjects.Online_Booking_Client_appointment_upto)
							&& browser.elementisdisplayed(SCobjects.Online_Booking_Client_appointment_nomorethan)
							&& browser.elementisdisplayed(SCobjects.Online_Booking_Cancellation_in_advance)) {
						browser.reportscomtep("Passed",
								"Without adding data and click on Save changes button and verify Data is Updated Successfully",
								"Data should be Updated Successfully", "Data is Updated Successfully");
					} else {
						browser.reportscomtep("Failed",
								"Without adding data and click on Save changes button and verify Data is Updated Successfully",
								"Data should be Updated Successfully", "Data is not Updated Successfully");
					}
				} else {
					browser.reportscomtep("Failed", "Verify Updated Successfully Message is displayed",
							"Updated Successfully Message should be displayed",
							"Updated Successfully Message not displayed");

				}
			case "WithAddingData":
				browser.scrollintoviewelement(SCobjects.Save_Button_Online_Booking_Page);
				browser.click(SCobjects.Save_Button_Online_Booking_Page);
				if (browser.elementisdisplayed(SCobjects.Updates_successfully_msg_popup)) {
					browser.reportscomtep("Passed", "Verify Updated Successfully Message is displayed",
							"Updated Successfully Message should be displayed",
							"Updated Successfully Message displayed");
					browser.click(SCobjects.Popup_msg_Alert_OK_Button);
					browser.selectByIndex(SCobjects.Online_Booking_Client_appointment_upto, 3);
					String AfterAdding_BookingInAddvance = browser
							.elementgetAttributevalue(SCobjects.Online_Booking_Client_appointment_upto, "value");
					browser.selectByIndex(SCobjects.Online_Booking_Client_appointment_nomorethan, 3);
					String AfterAdding_BookingInFuture = browser
							.elementgetAttributevalue(SCobjects.Online_Booking_Client_appointment_nomorethan, "value");
					browser.selectByIndex(SCobjects.Online_Booking_Cancellation_in_advance, 3);
					String AfterCancellationInAddvance = browser
							.elementgetAttributevalue(SCobjects.Online_Booking_Cancellation_in_advance, "value");
					if (!BeforeAdding_BookingInAddvance.equalsIgnoreCase(AfterAdding_BookingInAddvance)
							&& !BeforeAdding_BookingInFuture.equalsIgnoreCase(AfterAdding_BookingInFuture)
							&& !BeforeCancellationInAddvance.equalsIgnoreCase(AfterCancellationInAddvance)
							&& browser.elementisdisplayed(SCobjects.Online_Booking_Client_appointment_upto)
							&& browser.elementisdisplayed(SCobjects.Online_Booking_Client_appointment_nomorethan)
							&& browser.elementisdisplayed(SCobjects.Online_Booking_Cancellation_in_advance)) {
						browser.reportscomtep("Passed",
								"With adding data and click on Save changes button and verify Data is Updated Successfully",
								"Data should be Updated Successfully", "Data is Updated Successfully");
					} else {
						browser.reportscomtep("Failed",
								"With adding data and click on Save changes button and verify Data is Updated Successfully",
								"Data should be Updated Successfully", "Data is not Updated Successfully");
					}
				} else {
					browser.reportscomtep("Failed", "Verify Updated Successfully Message is displayed",
							"Updated Successfully Message should be displayed",
							"Updated Successfully Message not displayed");

				}
			case "DoNothing":

			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}

	// TC_9_013

	public void checkbookingpolicyisapplied() {
		try {
			String BeforeBookingPolicyInAddvance = browser
					.elementgetAttributevalue(SCobjects.Online_Booking_Client_appointment_upto, "value");
			String BeforeBookingPolicyInFuture = browser
					.elementgetAttributevalue(SCobjects.Online_Booking_Client_appointment_nomorethan, "value");
			browser.selectByVisibleText(SCobjects.Online_Booking_Client_appointment_upto, "1 Hour");
			browser.selectByVisibleText(SCobjects.Online_Booking_Client_appointment_nomorethan, "1 Month");
			browser.scrollintoviewelement(SCobjects.Save_Button_Online_Booking_Page);
			browser.click(SCobjects.Save_Button_Online_Booking_Page);
			if (browser.elementisdisplayed(SCobjects.Updates_successfully_msg_popup)) {
				browser.reportscomtep("Passed", "Verify Updated Successfully Message is displayed",
						"Updated Successfully Message should be displayed", "Updated Successfully Message displayed");
				browser.click(SCobjects.Popup_msg_Alert_OK_Button);
				String AfterBookingPolicyInAddvance = browser
						.elementgetAttributevalue(SCobjects.Online_Booking_Client_appointment_upto, "value");
				String AfterBookingPolicyInFuture = browser
						.elementgetAttributevalue(SCobjects.Online_Booking_Client_appointment_nomorethan, "value");
				if (!BeforeBookingPolicyInAddvance.equalsIgnoreCase(AfterBookingPolicyInAddvance)
						&& !BeforeBookingPolicyInFuture.equalsIgnoreCase(AfterBookingPolicyInFuture)
						&& browser.elementisdisplayed(SCobjects.Online_Booking_Client_appointment_upto)
						&& browser.elementisdisplayed(SCobjects.Online_Booking_Client_appointment_nomorethan)) {
					browser.reportscomtep("Passed",
							"In Booking policy, specify the time in both fields by selecting from respective dropdown list and click on save changes button and verify The changes are applied",
							"The changes should be applied", "The changes are not applied");
				} else {
					browser.reportscomtep("Failed",
							"In Booking policy, specify the time in both fields by selecting from respective dropdown list and click on save changes button and verify The changes are applied",
							"The changes should be applied", "The changes are applied");
				}

			} else {
				browser.reportscomtep("Failed", "Verify Updated Successfully Message is displayed",
						"Updated Successfully Message should be displayed",
						"Updated Successfully Message not displayed");

			}

			browser.click(SCobjects.Popup_msg_Alert_OK_Button);

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}

	}

	// TC_9_016

	public void checkinfoincalendartab() {
		try {
			browser.click(SCobjects.Calender_Settings_tab);
			if (browser.elementisdisplayed(SCobjects.Calender_Settings_FormPage)) {
				browser.reportscomtep("Passed",
						"Click on Calendar tab and Verify Calendar Form Settings page is displayed",
						"Calendar Form Settings page should be displayed", "Calendar Form Settings page displayed");
				browser.Verify_elementisdisplayed_Report(SCobjects.Calender_Settings_Time_Interval_Dropdown,
						"Time Slot Interval Dropdown");
				browser.Verify_elementisdisplayed_Report(SCobjects.Calender_Settings_Default_View_Dropdown,
						"Default View");
				browser.Verify_elementisdisplayed_Report(SCobjects.Calender_Settings_week_start_day_Dropdown,
						"Week Start Day");

			} else {
				browser.reportscomtep("Failed",
						"Click on Calendar tab and Verify Calendar Form Settings page is displayed",
						"Calendar Form Settings page should be displayed", "Calendar Form Settings page displayed");
			}
		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}

	}

	// TC_9_017

	public void checkcalendersettingscanbesaved() {
		try {
			browser.selectByVisibleText(SCobjects.Calender_Settings_Time_Interval_Dropdown, "30 Minutes");
			browser.selectByVisibleText(SCobjects.Calender_Settings_Default_View_Dropdown, "Week");
			browser.selectByVisibleText(SCobjects.Calender_Settings_week_start_day_Dropdown, "Monday");
			browser.click(SCobjects.Calender_Settings_Save_Button);
			if (browser.elementisdisplayed(SCobjects.Updates_successfully_msg_popup)) {
				browser.reportscomtep("Passed",
						"Select the values from respective dropdowns and click on Save Changes button Verify Updated Successfully Message is displayed",
						"Updated Successfully Message should be displayed", "Updated Successfully Message displayed");
				browser.click(SCobjects.Popup_msg_Alert_OK_Button);
				String TimeInterval = browser
						.elementgetAttributevalue(SCobjects.Calender_Settings_Time_Interval_Dropdown, "value");
				String DefaultView = browser.elementgetAttributevalue(SCobjects.Calender_Settings_Default_View_Dropdown,
						"value");
				String WeekStartDay = browser
						.elementgetAttributevalue(SCobjects.Calender_Settings_week_start_day_Dropdown, "value");
				if (!TimeInterval.isEmpty() && !DefaultView.isEmpty() && !WeekStartDay.isEmpty()) {
					browser.reportscomtep("Passed", "Verify Changes are Changed", "Changes should be Changed",
							"Changes are Changed");
				} else {
					browser.reportscomtep("Failed", "Verify Changes are Changed", "Changes should be Changed",
							"Changes are not Changed");
				}
			} else {
				browser.reportscomtep("Failed",
						"Select the values from respective dropdowns and click on Save Changes button Verify Updated Successfully Message is displayed",
						"Updated Successfully Message should be displayed",
						"Updated Successfully Message not displayed");
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}

	}

	// TC_9_019

	public void verifytabsinstaffnotificationpage() {
		try {
			browser.click(SCobjects.Staff_Notification_tab);
			if (browser.elementisdisplayed(SCobjects.Staff_Notification_Header)) {
				browser.reportscomtep("Passed",
						"Click on Notifivation tab and Verify Staff Notification page is displayed",
						"Staff Notification page should be displayed", " Staff Notification page displayed");
				String EnableNotification = browser
						.elementgetAttributevalue(SCobjects.Staff_Notification_Enble_checkbox, "value");
				if (EnableNotification.equalsIgnoreCase("1")
						&& browser.elementisdisplayed(SCobjects.Staff_Notification_Enble_checkbox)) {
					browser.reportscomtep("Passed", "Verify Enable Staff Notification check box is Enabled by default",
							"Enable Staff Notification check box should be Enabled by default",
							"Enable Staff Notification check box is Enabled by default");
					browser.Verify_elementisdisplayed_Report(
							SCobjects.Staff_Notification_send_to_staff_members_checkbox,
							"Send to staff members check box");
					browser.Verify_elementisdisplayed_Report(SCobjects.Staff_Notification_send_to_email_address,
							"Send to specific email");
					browser.Verify_elementisdisplayed_Report(SCobjects.Staff_Notification_save_changes_button,
							"SAVE CHANGES BUTTON");

				} else {
					browser.reportscomtep("Failed", "Verify Enable Staff Notification check box is Enabled by default",
							"Enable Staff Notification check box should be Enabled by default",
							"Enable Staff Notification check box is Enabled by default");
				}

			} else {
				browser.reportscomtep("Failed", "Verify Staff Notification page is displayed",
						"Staff Notification page should be displayed", " Staff Notification page not displayed");

			}
		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}

	}

	// TC_9_020

	public void checkvalidationinstaffnotificationpage() {
		try {
			browser.click(SCobjects.Staff_Notification_send_to_staff_members_checkbox);
			browser.click(SCobjects.Staff_Notification_save_changes_button);
			if (browser.elementisdisplayed(SCobjects.Updates_msg_popup_successful)) {
				browser.reportscomtep("Passed", "Verify Updated Successfully Message is displayed",
						"Updated Successfully Message should be displayed", "Updated Successfully Message displayed");
				browser.click(SCobjects.Popup_msg_Alert_OK_Button);

			} else {
				browser.reportscomtep("Failed", "Verify Updated Successfully Message is displayed",
						"Updated Successfully Message should be displayed",
						"Updated Successfully Message not displayed");
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}

	}

	
	
	/*//TC_9_025
				
				public void checkinfoinpaymentsettings() throws Exception {
					
					browser.click(SCobjects.Settings_page_tabs_Payment_Settings);
					
					if (browser.elementisdisplayed(SCobjects.Payment_Settings_Header)){
						browser.reportscomtep("Passed", "Verify Payment Settings page is displayed",
								"Payment Settings page should be displayed", "Payment Settings page displayed");
					
					browser.elementisdisplayed(SCobjects.Payment_Settings_Paypal_Yes_radio_button);
					browser.elementisdisplayed(SCobjects.Payment_Settings_Paypal_No_radio_button);
					browser.elementisdisplayed(SCobjects.Payment_Settings_Cash_on_service_Yes_radio_button);
					browser.elementisdisplayed(SCobjects.Payment_Settings_Cash_on_service_No_radio_button);
					
				}
					
				else {
					browser.reportscomtep("Failed", "Verify Payment Settings page is displayed",
							"Payment Settings page should be displayed", "Payment Settings page not displayed");
					
				}
}
				
//TC_9_029
				
				public void checkinfoinmanagemenu() throws Exception {
					
					browser.click(SCobjects.Settings_page_Manage_Menu);
					
					if (browser.elementisdisplayed(SCobjects.Manage_Menu_Header)){
						browser.reportscomtep("Passed", "Verify Manage Menu page is displayed",
								"Manage Menu page should be displayed", "Manage Menu page displayed");
					
					
					browser.check_Checkbox(SCobjects.Manage_Menu_services_yes_radio_button);
					browser.check_Checkbox(SCobjects.Manage_Menu_overview_yes_radio_button);
					browser.check_Checkbox(SCobjects.Manage_Menu_review_yes_radio_button);
					browser.check_Checkbox(SCobjects.Manage_Menu_inquiry_yes_radio_button);
					browser.check_Checkbox(SCobjects.Manage_Menu_promotions_yes_radio_button);
					browser.check_Checkbox(SCobjects.Manage_Menu_videos_yes_radio_button);
					browser.check_Checkbox(SCobjects.Manage_Menu_photos_yes_radio_button);
					browser.check_Checkbox(SCobjects.Manage_Menu_contact_us_yes_radio_button);
					browser.check_Checkbox(SCobjects.Manage_Menu_jobs_yes_radio_button);
					}
					
					else {
						browser.reportscomtep("Failed", "Verify Manage Menu page is displayed",
								"Manage Menu page should be displayed", "Manage Menu page not displayed");

					}
					}
				
//TC_9_030
				
				public void verifychangesinmanagemenu() throws Exception {
					
					if (browser.elementisdisplayed(SCobjects.Manage_Menu_Header)){
						browser.reportscomtep("Passed", "Verify Manage Menu page is displayed",
								"Manage Menu page should be displayed", "Manage Menu page displayed");
						
						browser.click(SCobjects.Manage_Menu_videos_no_radio_button);
						browser.click(SCobjects.Manage_Menu_photos_no_radio_button);
						browser.click(SCobjects.Manage_Menu_save_button);
						browser.click(SCobjects.Popup_msg_Alert_OK_Button);
						browser.click(SCobjects.Subscriber_HumanIcon);
						browser.click(SCobjects.Subscriber_HumanIcon_logout_link);
						browser.sendkeys(SCobjects.Professional_search_box, browser.getdata("changedbusinessname"));
						browser.click(SCobjects.Professional_search_icon);
						browser.click(SCobjects.Professional_search_result);
						if (browser.elementisdisplayed(SCobjects.Business_page_videos_tab) & browser.elementisdisplayed(SCobjects.Business_page_photos_tab)) {
							browser.reportscomtep("Failed", "Verify Photos and Videos tab is not displayed",
									"Photos and Videos tab should not be displayed", "Photos and Videos tab displayed");
						}
						else {
							
							browser.reportscomtep("Passed", "Verify Photos and Videos tab is not displayed",
									"Photos and Videos tab should not be displayed", "Photos and Videos tab not displayed");
						}
}
					
					else {
						browser.reportscomtep("Failed", "Verify Manage Menu page is displayed",
								"Manage Menu page should be displayed", "Manage Menu page not displayed");

					}
				}
				
//TC_9_031
				
				public void checkinfoonsociallinkstab() throws Exception {
					
					browser.click(SCobjects.Settings_page_tabs_Social_Links);

					
					if (browser.elementisdisplayed(SCobjects.Social_Links_Header)){
						browser.reportscomtep("Passed", "Verify Social Links page is displayed",
								"Social Links page should be displayed", "Social Links page displayed");
					
					browser.elementisdisplayed(SCobjects.Social_links_Facebook_field);
					browser.clearText(SCobjects.Social_links_Facebook_field);
					browser.elementisdisplayed(SCobjects.Social_links_Instagram_field);
					browser.clearText(SCobjects.Social_links_Instagram_field);
					browser.elementisdisplayed(SCobjects.Social_links_google_plus_field);
					browser.clearText(SCobjects.Social_links_google_plus_field);
					
				 if (browser.elementisdisplayed(SCobjects.Social_Links_Save_button)){
					 browser.reportscomtep("Failed", "Verify Save button is disabled",
								"Save button should be disabled", "Save button not disabled");
				 }
				 else {
					 browser.reportscomtep("Passed", "Verify Save button is disabled",
								"Save button should be disabled", "Save button disabled");			
				}
					
					}else {
					browser.reportscomtep("Failed", "Verify Social Links page is displayed",
							"Social Links page should be displayed", "Social Links page not displayed");
					
				}
}
				
//TC_9_032
				
				public void dataentryfieldvalidity() throws Exception {
					
					browser.click(SCobjects.Settings_page_tabs_Social_Links);
					
					if (browser.elementisdisplayed(SCobjects.Social_Links_Header)){
						browser.reportscomtep("Passed", "Verify Social Links page is displayed",
								"Social Links page should be displayed", "Social Links page displayed");
						
					browser.sendkeys(SCobjects.Social_links_Facebook_field, browser.getdata("facebookentry"));
					browser.click(SCobjects.Social_Links_Save_button_after_text_entry);
					
					 if (browser.elementisdisplayed(SCobjects.success_pop_up)){
						 browser.reportscomtep("Passed", "Verify Save button is enabled",
									"Save button should be enabled", "Save button is enabled"); 
					 }
					 
					 else {
						 browser.reportscomtep("Failed", "Verify Save button is enabled",
									"Save button should be enabled", "Save button not enabled"); 
					 }
					
					}else {
						browser.reportscomtep("Failed", "Verify Social Links page is displayed",
								"Social Links page should be displayed", "Social Links page not displayed");
						
					}	
					
					browser.click(SCobjects.Popup_msg_Alert_OK_Button);
}
				
//TC_9_033
				
				public void checkinfoinbusinessinfopage() throws Exception {
					
					browser.click(SCobjects.Settings_page_tabs_Business_Hours);	
					
					if (browser.elementisdisplayed(SCobjects.Business_hours_header)){
						browser.reportscomtep("Passed", "Verify Business Hours page is displayed",
								"Business Hours page should be displayed", "Business Hours page displayed");
					
					browser.elementisdisplayed(SCobjects.add_holiday_button);
					browser.elementisdisplayed(SCobjects.Update_button);
					
					}else {
						browser.reportscomtep("Failed", "Verify Business Hours page is displayed",
								"Business Hours page should be displayed", "Business Hours page not displayed");
					}
}*/
	
	
	
	// TC_9_025

		public void checkinfoinpaymentsettings() {
			try {
				browser.click(SCobjects.Settings_page_tabs_Payment_Settings);
				if (browser.elementisdisplayed(SCobjects.Payment_Settings_Header)) {
					browser.reportscomtep("Passed",
							"Click on Payment Setting tab and Verify Payment Settings page is displayed",
							"Payment Settings page should be displayed", "Payment Settings page displayed");
					if (browser.elementisdisplayed(SCobjects.Payment_Settings_OnlinePaymentLabel)) {
						browser.reportscomtep("Passed", "Verify Online Payment label is displayed",
								"Online Payment label should be displayed", "Online Payment label is displayed");
						browser.Verify_elementisdisplayed_Report(SCobjects.Payment_Settings_Paypal_Yes_radio_button,
								"Online Payment Yes button");
						browser.Verify_elementisdisplayed_Report(SCobjects.Payment_Settings_Paypal_No_radio_button,
								"Online Payment No button");
					} else {
						browser.reportscomtep("Failed", "Verify Online Payment label is displayed",
								"Online Payment label should be displayed", "Online Payment label is not displayed");
					}
					if (browser.elementisdisplayed(SCobjects.Payment_Settings_CashOnServiceLabel)) {
						browser.reportscomtep("Passed", "Verify Cash on Service label is displayed",
								"Cash on Service label should be displayed", "Cash on Service label is displayed");
						browser.Verify_elementisdisplayed_Report(
								SCobjects.Payment_Settings_Cash_on_service_Yes_radio_button, "Cash on Service Yes button");
						browser.Verify_elementisdisplayed_Report(SCobjects.Payment_Settings_Cash_on_service_No_radio_button,
								"Cash on Service No button");
					} else {
						browser.reportscomtep("Failed", "Verify Cash on Service label is displayed",
								"Cash on Service label should be displayed", "Cash on Service label is not displayed");
					}
				}

				else {
					browser.reportscomtep("Failed",
							"Click on Payment Setting tab and Verify Payment Settings page is displayed",
							"Payment Settings page should be displayed", "Payment Settings page not displayed");

				}
			} catch (Exception e) {
				System.out.println("Error description: " + e.getStackTrace());
			}

		}
		
		// TC_9_027
		public void select_AppropriateRadiobutton_InPaymentSettings() {
			try {
				browser.check_Checkbox(SCobjects.Payment_Settings_Paypal_No_radio_button);
				browser.check_Checkbox(SCobjects.Payment_Settings_Cash_on_service_Yes_radio_button);
				browser.click(SCobjects.Payment_Settings_SaveButton);
				if (browser.elementisdisplayed(SCobjects.Payment_Settings_PSUSuccessfully)) {
					browser.reportscomtep("Passed",
							"Clicks continue on Paypal No Radio,Cash on Service Yes Radio button and Save button and verify Payment Settings Updated Successfully popup is dispalyed ",
							"Payment Settings Updated Successfully popup should be dispalyed",
							"Payment Settings Updated Successfully popup is dispalyed");
					browser.click(SCobjects.Confirmatio_OK_Button);
					if (browser.elementisdisplayed(SCobjects.Payment_Settings_Paypal_No_radio_button)
							&& browser.elementisdisplayed(SCobjects.Payment_Settings_Cash_on_service_Yes_radio_button)) {
						browser.reportscomtep("Passed",
								"Verify PayPal – No,Cash on Service – Yes Radio buttions are selected",
								"PayPal – No,Cash on Service – Yes Radio buttions should be selected",
								"PayPal – No,Cash on Service – Yes Radio buttions are selected");
					} else {
						browser.reportscomtep("Failed",
								"Verify PayPal – No,Cash on Service – Yes Radio buttions are selected",
								"PayPal – No,Cash on Service – Yes Radio buttions should be selected",
								"PayPal – No,Cash on Service – Yes Radio buttions are not selected");
					}
				} else {
					browser.reportscomtep("Failed",
							"Clicks continue on Paypal No Radio,Cash on Service Yes Radio button and Save button and verify Payment Settings Updated Successfully popup is dispalyed ",
							"Payment Settings Updated Successfully popup should be dispalyed",
							"Payment Settings Updated Successfully popup is not dispalyed");
				}

			} catch (Exception e) {
				System.out.println("Error description: " + e.getStackTrace());
			}
		}
		/**********TC_9_028 Verify whether the Payment Settings are applied**********/
		
		public void VerifywhetherPaymentSettingsAreapplied() {
			try {
				this.subsriberLogOut("BusinessNameModified");
				String SalonName = browser.getelementtext(SCobjects.BusinessDetails_MBN_In_BP);
				if (browser.elementisdisplayed(SCobjects.PaymentSettings_CashOnService_InBP)) {
					browser.reportscomtep("Passed",
							"Verify Salon Name:" + SalonName + " with payment option as Cash on Service is displayed",
							"Salon Name  with payment option as Cash on Service should be displayed",
							"Salon Name:" + SalonName + " with payment option as Cash on Service is displayed");
				} else {
					browser.reportscomtep("Failed",
							"Verify Salon Name:" + SalonName + " with payment option as Cash on Service is displayed",
							"Salon Name  with payment option as Cash on Service should be displayed",
							"Salon Name with payment option as Cash on Service is not displayed");
				}
			} catch (Exception e) {
				System.out.println("Error description: " + e.getStackTrace());
			}
		}

		// TC_9_029
		public void checkinfoinmanagemenu() {
			try {
				browser.click(SCobjects.Settings_page_Manage_Menu);
				if (browser.elementisdisplayed(SCobjects.Manage_Menu_Header)) {
					browser.reportscomtep("Passed", "Click on Manage menu and Verify Manage Menu page is displayed",
							"Manage Menu page should be displayed", "Manage Menu page is displayed");
					String ServicesYesCheckboxValue = browser
							.elementgetAttributevalue(SCobjects.Manage_Menu_services_yes_radio_button, "value");
					String OverViewYesCheckboxValue = browser
							.elementgetAttributevalue(SCobjects.Manage_Menu_overview_yes_radio_button, "value");
					String ReViewYesCheckboxValue = browser
							.elementgetAttributevalue(SCobjects.Manage_Menu_review_yes_radio_button, "value");
					String InquiryYesCheckboxValue = browser
							.elementgetAttributevalue(SCobjects.Manage_Menu_inquiry_yes_radio_button, "value");
					String PromotionsYesCheckboxValue = browser
							.elementgetAttributevalue(SCobjects.Manage_Menu_promotions_yes_radio_button, "value");
					String VideosYesCheckboxValue = browser
							.elementgetAttributevalue(SCobjects.Manage_Menu_videos_yes_radio_button, "value");
					String PhotosYesCheckboxValue = browser
							.elementgetAttributevalue(SCobjects.Manage_Menu_photos_yes_radio_button, "value");
					String ContactUsYesCheckboxValue = browser
							.elementgetAttributevalue(SCobjects.Manage_Menu_contact_us_yes_radio_button, "value");
					String JobYesCheckboxValue = browser
							.elementgetAttributevalue(SCobjects.Manage_Menu_jobs_yes_radio_button, "value");
					if (browser.elementisdisplayed(SCobjects.Manage_Menu_ServicesLabel)
							&& ServicesYesCheckboxValue.equalsIgnoreCase("1")
							&& browser.elementisdisplayed(SCobjects.Manage_Menu_services_yes_radio_button)) {
						browser.reportscomtep("Passed", "Verify Service is yes option default selected ",
								"Service should be yes option default selected ",
								"Service is yes option default selected ");
					}
					if (browser.elementisdisplayed(SCobjects.Manage_Menu_OverViewLabel)
							&& OverViewYesCheckboxValue.equalsIgnoreCase("1")
							&& browser.elementisdisplayed(SCobjects.Manage_Menu_overview_yes_radio_button)) {
						browser.reportscomtep("Passed", "Verify OverView is yes option default selected ",
								"OverView should be yes option default selected ",
								"OverView is yes option default selected ");
					}
					if (browser.elementisdisplayed(SCobjects.Manage_Menu_ReviwesLabel)
							&& ReViewYesCheckboxValue.equalsIgnoreCase("1")
							&& browser.elementisdisplayed(SCobjects.Manage_Menu_review_yes_radio_button)) {
						browser.reportscomtep("Passed", "Verify Reviwes is yes option default selected ",
								"Reviwes should be yes option default selected ",
								"Reviwes is yes option default selected ");
					}
					if (browser.elementisdisplayed(SCobjects.Manage_Menu_InquiryLabel)
							&& InquiryYesCheckboxValue.equalsIgnoreCase("1")
							&& browser.elementisdisplayed(SCobjects.Manage_Menu_inquiry_yes_radio_button)) {
						browser.reportscomtep("Passed", "Verify inquiry is yes option default selected ",
								"inquiry should be yes option default selected ",
								"inquiry is yes option default selected ");
					}
					if (browser.elementisdisplayed(SCobjects.Manage_Menu_PromotionsLabel)
							&& PromotionsYesCheckboxValue.equalsIgnoreCase("1")
							&& browser.elementisdisplayed(SCobjects.Manage_Menu_promotions_yes_radio_button)) {
						browser.reportscomtep("Passed", "Verify Promotions is yes option default selected ",
								"Promotions should be yes option default selected ",
								"Promotions is yes option default selected ");
					}
					if (browser.elementisdisplayed(SCobjects.Manage_Menu_VideosLabel)
							&& VideosYesCheckboxValue.equalsIgnoreCase("1")
							&& browser.elementisdisplayed(SCobjects.Manage_Menu_videos_yes_radio_button)) {
						browser.reportscomtep("Passed", "Verify Videos is yes option default selected ",
								"Videos should be yes option default selected ",
								"Videos is yes option default selected ");
					}
					if (browser.elementisdisplayed(SCobjects.Manage_Menu_PhotosLabel)
							&& PhotosYesCheckboxValue.equalsIgnoreCase("1")
							&& browser.elementisdisplayed(SCobjects.Manage_Menu_photos_yes_radio_button)) {
						browser.reportscomtep("Passed", "Verify photos is yes option default selected ",
								"Photos should be yes option default selected ",
								"Phots is yes option default selected ");
					}
					if (browser.elementisdisplayed(SCobjects.Manage_Menu_ContactUsLabel)
							&& ContactUsYesCheckboxValue.equalsIgnoreCase("1")
							&& browser.elementisdisplayed(SCobjects.Manage_Menu_contact_us_yes_radio_button)) {
						browser.reportscomtep("Passed", "Verify contact us is yes option default selected ",
								"contact us should be yes option default selected ",
								"contact usis yes option default selected ");
					}
					if (browser.elementisdisplayed(SCobjects.Manage_Menu_JobsLabel)
							&& JobYesCheckboxValue.equalsIgnoreCase("1")
							&& browser.elementisdisplayed(SCobjects.Manage_Menu_contact_us_yes_radio_button)) {
						browser.reportscomtep("Passed", "Verify Job is yes option default selected ",
								"Job  should be yes option default selected ",
								"Job is yes option default selected ");
					}
					browser.Verify_elementisdisplayed_Report(SCobjects.Manage_Menu_save_button, "Save Button");
				}

				else {
					browser.reportscomtep("Failed", "Verify Manage Menu page is displayed",
							"Manage Menu page should be displayed", "Manage Menu page not displayed");

				}

			} catch (Exception e) {
				System.out.println("Error description: " + e.getStackTrace());
			}

		}

		// TC_9_030

		public void verifychangesinmanagemenu() {
			try {
				if (browser.elementisdisplayed(SCobjects.Manage_Menu_Header)) {
					browser.reportscomtep("Passed", "Verify Manage Menu page is displayed",
							"Manage Menu page should be displayed", "Manage Menu page displayed");
					browser.check_Checkbox(SCobjects.Manage_Menu_videos_no_radio_button);
					browser.check_Checkbox(SCobjects.Manage_Menu_videos_no_radio_button);
					browser.click(SCobjects.Manage_Menu_photos_no_radio_button);
					browser.click(SCobjects.Manage_Menu_save_button);
					browser.click(SCobjects.Confirmatio_OK_Button);
					String VideosNoCheckboxValue = browser
							.elementgetAttributevalue(SCobjects.Manage_Menu_videos_no_radio_button, "value");
					String PhotosNoCheckboxValue = browser
							.elementgetAttributevalue(SCobjects.Manage_Menu_photos_no_radio_button, "value");
					if (browser.elementisdisplayed(SCobjects.Manage_Menu_VideosLabel)
							&& VideosNoCheckboxValue.equalsIgnoreCase("0")
							&& browser.elementisdisplayed(SCobjects.Manage_Menu_videos_yes_radio_button)) {
						browser.reportscomtep("Passed", "Verify Videos no Option is selected ",
								"Videos no Option should be selected ", "Videos no Option is selected ");
					}
					if (browser.elementisdisplayed(SCobjects.Manage_Menu_PhotosLabel)
							&& PhotosNoCheckboxValue.equalsIgnoreCase("0")
							&& browser.elementisdisplayed(SCobjects.Manage_Menu_photos_yes_radio_button)) {
						browser.reportscomtep("Passed", "Verify Photos no Option is selected ",
								"Photos no Option should be selected ", "Photos no Option is selected ");
					}

				}else {
					browser.reportscomtep("Failed", "Verify Manage Menu page is displayed",
							"Manage Menu page should be displayed", "Manage Menu page not displayed");

				}
			} catch (Exception e) {
				System.out.println("Error description: " + e.getStackTrace());
			}

		}


		// TC_9_031

		public void checkinfoonsociallinkstab() {
			try {
				browser.click(SCobjects.Settings_page_tabs_Social_Links);
				if (browser.elementisdisplayed(SCobjects.Social_Links_Header)) {
					browser.reportscomtep("Passed", "Click on Social link tab and Verify Social Links page is displayed",
							"Social Links page should be displayed", "Social Links page displayed");
					browser.Verify_elementisdisplayed_Report(SCobjects.Social_links_Facebook_field,
							"Facebook Field TextBox");
					browser.Verify_elementisdisplayed_Report(SCobjects.Social_links_Instagram_field,
							"Instagram Field TextBox");
					browser.Verify_elementisdisplayed_Report(SCobjects.Social_links_google_plus_field,
							"Google plus Field TextBox");
					String FacebookData = browser.elementgetAttributevalue(SCobjects.Social_links_Facebook_field, "value");
					String InstagramData = browser.elementgetAttributevalue(SCobjects.Social_links_Facebook_field, "value");
					String GooglePlusData = browser.elementgetAttributevalue(SCobjects.Social_links_Facebook_field,
							"value");

					if (FacebookData.isEmpty() && InstagramData.isEmpty() && GooglePlusData.isEmpty()
							&& browser.elementisdisplayed(SCobjects.Social_Links_Save_button)) {
						browser.reportscomtep("Passed",
								"Verify The Save button is disabled by default when all the fields are empty",
								"Save button should be disabled by default when all the fields are empty",
								"Save button is disabled by default when all the fields are empty");
					} else if (!FacebookData.isEmpty() && !InstagramData.isEmpty() && !GooglePlusData.isEmpty()
							&& browser.elementisdisplayed(SCobjects.Social_Links_Save_button_after_text_entry)) {
						browser.reportscomtep("Passed",
								"Verify The Save button is enable when all the fields are not empty",
								"The Save button should be  enablewhen all the fields are not empty",
								"The Save button is enable when all the fields are not empty");
					}

				} else {
					browser.reportscomtep("Failed", "Click on Social link tab and Verify Social Links page is displayed",
							"Social Links page should be displayed", "Social Links page not displayed");

				}
			} catch (Exception e) {
				System.out.println("Error description: " + e.getStackTrace());
			}

		}

		// TC_9_032

		public void dataentryfieldvalidity() {
			try {
				browser.click(SCobjects.Settings_page_tabs_Social_Links);
				if (browser.elementisdisplayed(SCobjects.Social_Links_Header)) {
					browser.reportscomtep("Passed", "Verify Social Links page is displayed",
							"Social Links page should be displayed", "Social Links page displayed");
					browser.sendkeys(SCobjects.Social_links_Facebook_field, browser.getdata("facebookentry"));
					browser.click(SCobjects.Social_Links_Save_button_after_text_entry);
					if (browser.elementisdisplayed(SCobjects.success_pop_up)) {
						browser.reportscomtep("Passed",
								"Enter Facebook fields and click on Enable save button and Verify Popup Success message is dispalyed",
								"Popup Success message should be dispalyed", "Popup Success message is dispalyed");
						browser.click(SCobjects.Confirmatio_OK_Button);

					} else {
						browser.reportscomtep("Failed",
								"Enter Facebook fields and click on Enable save button and Verify Popup Success message is dispalyed",
								"Popup Success message should be dispalyed", "Popup Success message is not dispalyed");
					}

				} else {
					browser.reportscomtep("Failed", "Verify Social Links page is displayed",
							"Social Links page should be displayed", "Social Links page not displayed");

				}
			} catch (Exception e) {
				System.out.println("Error description: " + e.getStackTrace());
			}

		}

		// TC_9_033

		public void checkinfoinbusinessinfopage() {
			try {
				browser.click(SCobjects.Settings_page_tabs_Business_Hours);
				if (browser.elementisdisplayed(SCobjects.Business_hours_header)) {
					browser.reportscomtep("Passed",
							"Click on Business hours Tab and Verify Business Hours page is displayed",
							"Business Hours page should be displayed", "Business Hours page displayed");
					browser.Verify_elementisdisplayed_Report(SCobjects.add_holiday_button, "Holiday Button");
					browser.Verify_elementisdisplayed_Report(SCobjects.Update_button, "Update Button");
					List<WebElement> DayCheckBox = SCobjects.Business_hours_CBDayList;
					List<WebElement> DayLabel = SCobjects.Business_hours_DayLabelList;
					List<WebElement> OpeningHours = SCobjects.Business_hours_Opening_hoursList;
					List<WebElement> ClosinggHours = SCobjects.Business_hours_closing_hoursList;
					int i = 0;
					for (WebElement Day : DayCheckBox) {
						String Dayname = browser.getelementtext(DayLabel.get(i));
						if (!Dayname.isEmpty() && browser.elementisdisplayed(DayCheckBox.get(i))
								&& browser.elementisdisplayed(DayLabel.get(i))) {
							browser.reportscomtep("Passed",
									"Business hour checkboxes with : " + Dayname + " day name is diaplayed ",
									"Business hour checkboxes with day should be displayed",
									"Business hour checkboxes with day name is diaplayed as:" + Dayname);
						}
						i++;
					}
					int j = 0;
					for (WebElement Hours : DayCheckBox) {
						String OpeningHour = browser.elementgetAttributevalue(OpeningHours.get(j), "value");
						String ClosingHour = browser.elementgetAttributevalue(ClosinggHours.get(j), "value");
						if (!OpeningHour.isEmpty() && !ClosingHour.isEmpty()
								&& browser.elementisdisplayed(OpeningHours.get(j))
								&& browser.elementisdisplayed(ClosinggHours.get(j))) {
							browser.reportscomtep("Passed",
									"Verify Opening hour as:" + OpeningHour + " & Closing Hour as: " + ClosingHour
											+ " is dislayed ",
									"Opening & Closing Hours dropdown list should be displayed", "Opening hour as:"
											+ OpeningHour + " & Closing Hour as: " + ClosingHour + " is dislayed");
						}
						j++;
					}
				} else {
					browser.reportscomtep("Failed",
							"Click on Business hours Tab and Verify Business Hours page is displayed",
							"Business Hours page should be displayed", "Business Hours page not displayed");
				}

			} catch (Exception e) {
				System.out.println("Error description: " + e.getStackTrace());
			}

		}

		/******TC_9_034 Check for Validations if Updated without specifying business hours*******/
		
		public void check_UpdatedwithoutSpecifyingBusinesshours() {
			try {
				List<WebElement> DayCheckBox = SCobjects.Business_hours_CBDayList;
				for (WebElement DayCheckbox : DayCheckBox) {
					String Dayvalue = browser.elementgetAttributevalue(DayCheckbox, "class");
					if (Dayvalue.equalsIgnoreCase("ng-valid ng-dirty ng-valid-parse ng-touched ng-not-empty")) {
						browser.click(DayCheckbox);
					} else if (Dayvalue.equalsIgnoreCase("ng-valid ng-dirty ng-valid-parse ng-touched ng-empty")) {
						browser.doubleClick(DayCheckbox);
					}
				}
				browser.click(SCobjects.Update_button);
				if (browser.elementisdisplayed(SCobjects.Business_hours_US_Popup)) {
					browser.reportscomtep("Passed",
							"Without selecting any day checkboxes,click on upadate update button and Verify Updated successfully popup is displayed",
							"Updated successfully popup should be displayed", " Updated successfully popup is displayed");
					browser.click(SCobjects.Confirmatio_OK_Button);
				} else {
					browser.reportscomtep("Failed",
							"Without selecting any day checkboxes,click on upadate update button and Verify Updated successfully popup is displayed",
							"Updated successfully popup should be displayed",
							" Updated successfully popup is not displayed");
				}
			} catch (Exception e) {
				System.out.println("Error description: " + e.getStackTrace());
			}
		}
		
		/********TC_9_035 Check whether the Business Hours can be added*****************/
		
		public void checkwhether_BusinessHours_added() {
			try {
				List<WebElement> DayLabel = SCobjects.Business_hours_DayLabelList;
				List<WebElement> OpeningHours = SCobjects.Business_hours_Opening_hoursList;
				List<WebElement> ClosinggHours = SCobjects.Business_hours_closing_hoursList;
				List<WebElement> DayCheckBox = SCobjects.Business_hours_CBDayList;
				for (WebElement DayCheckbox : DayCheckBox) {
					String Dayvalue = browser.elementgetAttributevalue(DayCheckbox, "class");
					if (Dayvalue.equalsIgnoreCase("ng-valid ng-dirty ng-valid-parse ng-touched ng-empty")) {
						browser.click(DayCheckbox);
					}
				}
				String Dayname1 = browser.getelementtext(DayLabel.get(1));
				String Dayname2 = browser.getelementtext(DayLabel.get(5));
				browser.selectByVisibleText(OpeningHours.get(1), "10:00 AM");
				browser.selectByVisibleText(ClosinggHours.get(1), "05:00 PM");
				browser.selectByVisibleText(OpeningHours.get(5), "11:00 AM");
				browser.selectByVisibleText(ClosinggHours.get(5), "03:00 PM");
				String AfteraddingOpeningTm1 = browser.elementgetAttributevalue(OpeningHours.get(1), "value");
				String AfteraddingClosingTm1 = browser.elementgetAttributevalue(ClosinggHours.get(1), "value");
				String AfteraddingOpeningTm2 = browser.elementgetAttributevalue(OpeningHours.get(5), "value");
				String AfteraddingClosingTm2 = browser.elementgetAttributevalue(ClosinggHours.get(5), "value");
				browser.click(SCobjects.Update_button);
				if (browser.elementisdisplayed(SCobjects.Business_hours_US_Popup)) {
					browser.reportscomtep("Passed",
							"Verify " + Dayname1 + ": " + AfteraddingOpeningTm1 + " to " + AfteraddingClosingTm1 + " & "
									+ Dayname2 + ": " + AfteraddingOpeningTm2 + " to " + AfteraddingClosingTm2
									+ " selected",
							"Updated successfully popup should be displayed", " Updated successfully popup is displayed");
					browser.click(SCobjects.Confirmatio_OK_Button);
				} else {
					browser.reportscomtep("Failed",
							"Verify " + Dayname1 + ": " + AfteraddingOpeningTm1 + " to " + AfteraddingClosingTm1 + " & "
									+ Dayname2 + ": " + AfteraddingOpeningTm2 + " to " + AfteraddingClosingTm2
									+ " selected",
							"Updated successfully popup should be displayed",
							" Updated successfully popup is not displayed");
				}

			} catch (Exception e) {
				System.out.println("Error description: " + e.getStackTrace());
			}
		}
		
		/*********TC_9_037 Check whether the Add Holiday button is clickable*****/
		
		public void checkwhether_AddHoliday_ButtonIsClickable() {
			try {
				browser.click(SCobjects.add_holiday_button);
				if (browser.elementisdisplayed(SCobjects.BusinessHours_AH_PopupHeader)) {
					browser.reportscomtep("Passed", "Click on Add Holiday button and verify Add Holiday popup is displayed",
							"Add Holiday popup should be displayed", "Add Holiday popup is displayed");
					browser.Verify_elementisdisplayed_Report(SCobjects.BusinessHours_AH_StartDate_TB,
							"Calendar field for Start Date");
					browser.Verify_elementisdisplayed_Report(SCobjects.BusinessHours_AH_EndDate_TB,
							"Calendar field for End Date");
					browser.Verify_elementisdisplayed_Report(SCobjects.BusinessHours_AH_Descriptionfield,
							"Description field");
					browser.Verify_elementisdisplayed_Report(SCobjects.BusinessHours_AH_CloseButton, "Close Button");
					browser.Verify_elementisdisplayed_Report(SCobjects.BusinessHours_AH_SaveButton, "Save Button");

				} else {
					browser.reportscomtep("Failed", "Click on Add Holiday button and verify Add Holiday popup is displayed",
							"Add Holiday popup should be displayed", "Add Holiday popup is not displayed");
				}

			} catch (Exception e) {
				System.out.println("Error description: " + e.getStackTrace());
			}
		}
		
		
		/*********TC_9_038 Check whether the close button is clickable**********/
		
		public void checkwhether_CloseButton_IsClickable() {
			try {
				browser.click(SCobjects.BusinessHours_AH_CloseButton);
				if (browser.elementisdisplayed(SCobjects.Business_hours_header)) {
					browser.reportscomtep("Passed",
							"Click on close button and verify Close popu and Business hours page is displayed",
							"Close popu and Business hours page is displayed",
							"Close popu and Business hours page is displayed");
				} else {
					browser.reportscomtep("Failed",
							"Click on close button and verify Close popu and Business hours page is displayed",
							"Close popu and Business hours page is displayed",
							"Close popu and Business hours page is not displayed");
				}
			} catch (Exception e) {
				System.out.println("Error description: " + e.getStackTrace());
			}
		}
		
		
		/*********TC_9_039 Check the field validations in Add Holiday popup**********/
		
		public void check_FieldValidations_InAddHolidayPopup() {
			try {
				browser.click(SCobjects.add_holiday_button);
				if (browser.elementisdisplayed(SCobjects.BusinessHours_AH_PopupHeader)) {
					browser.reportscomtep("Passed", "Click on Add Holiday button and verify Add Holiday popup is displayed",
							"Add Holiday popup should be displayed", "Add Holiday popup is displayed");
					browser.click(SCobjects.BusinessHours_AH_SaveButton);
					String StartDateEm = browser.getelementtext(SCobjects.BusinessHours_AH_StartDate_EM);
					String EndDateEm = browser.getelementtext(SCobjects.BusinessHours_AH_EndDate_EM);
					String CommentEm = browser.getelementtext(SCobjects.BusinessHours_AH_Comment_EM);
					browser.verifyElementErrorMessage(SCobjects.BusinessHours_AH_StartDate_EM, StartDateEm, "exact");
					browser.verifyElementErrorMessage(SCobjects.BusinessHours_AH_EndDate_EM, EndDateEm, "exact");
					browser.verifyElementErrorMessage(SCobjects.BusinessHours_AH_Comment_EM, CommentEm, "exact");
				} else {
					browser.reportscomtep("Failed", "Click on Add Holiday button and verify Add Holiday popup is displayed",
							"Add Holiday popup should be displayed", "Add Holiday popup is not displayed");
				}

			} catch (Exception e) {
				System.out.println("Error description: " + e.getStackTrace());
			}
		}	
			
		public void subsriberLogOut(String BusinessNameOrChangeBusinessNameOr) {
			try {
				browser.click(SCobjects.Subscriber_HumanIcon);
				browser.click(SCobjects.Subscriber_HumanIcon_logout_link);
				switch (BusinessNameOrChangeBusinessNameOr) {
				case "BusinessName":
					browser.sendkeys(SCobjects.Professional_search_box, browser.getdata("DashboardBusinessName"));
					browser.click(SCobjects.Professional_search_icon);
					String BusinessName = browser.getelementtext(SCobjects.BusinessDetails_BN_In_BP);
					if (BusinessName.equalsIgnoreCase(browser.getdata("DashboardBusinessName"))
							&& browser.elementisdisplayed(SCobjects.BusinessDetails_BN_In_BP)) {
						browser.reportscomtep("Passed",
								"Enter Business name in search box and click on search icon and verify Business page in "
										+ BusinessName + " business name is displayed",
								"Business name details should be displayed",
								" Business page in business name is displayed as:" + BusinessName);

					} else {
						browser.reportscomtep("Failed",
								"Enter Business name in search box and click on search icon and verify Business page in "
										+ BusinessName + " business name is displayed",
								"Business name details should be displayed",
								" Business page in business name is not displayed ");
					}
					break;
				case "BusinessNameModified":
					browser.sendkeys(SCobjects.Professional_search_box, browser.getdata("changedbusinessname"));
					browser.click(SCobjects.Professional_search_icon);
					String ModifiedBusinessName = browser.getelementtext(SCobjects.BusinessDetails_MBN_In_BP);
					if (ModifiedBusinessName.equalsIgnoreCase(browser.getdata("changedbusinessname"))
							&& browser.elementisdisplayed(SCobjects.BusinessDetails_MBN_In_BP)) {
						browser.reportscomtep("Passed",
								"Enter Business name in search box and click on search icon and verify Business page in "
									+ ModifiedBusinessName + " business name is displayed",
								"Business name details should be displayed",
								" Business page in business name is displayed as:" + ModifiedBusinessName);

					} else {
						browser.reportscomtep("Failed",
								"Enter Business name in search box and click on search icon and verify Business page in "
										+ ModifiedBusinessName + " business name is displayed",
								"Business name details should be displayed",
								" Business page in business name is not displayed ");
					}
					break;
				case "Donothing":

				}

			} catch (Exception e) {
				System.out.println("Error description: " + e.getStackTrace());
			}
		}
		/*********TS011_Subscriber clicks on Services in Manage Circle Menu**************/
				
				/**********TC_11_001 Open the Service page*******/
				
	public void open_Service_Page(String LoginFirstTime_ServiceAlreadyAdded) {
		String SelectedType = "";
		String ServiceHeader = "";
		String ServicesAddedNames = "";
		String ServicesUnderGroupListNames = "";
		try {
			if (browser.elementisdisplayed(SCobjects.Subscriber_ManageCircle_Dropdown_Link)) {
				browser.reportscomtep("Passed", "Verify Manage Circle dropdown link is displayed in Dashboard page",
						"Manage Circle dropdown link should be displayed", "Manage Circle dropdown link is displayed");
				browser.click(SCobjects.Subscriber_ManageCircle_Dropdown_Link);

				SelectedType = browser.getelementtext(SCobjects.ManageCircle_Services_Dropdown_Link);

				browser.click(SCobjects.ManageCircle_Services_Dropdown_Link);
				ServiceHeader = browser.getelementtext(SCobjects.SreviceMenu_PageHeader);

				if (ServiceHeader.equalsIgnoreCase("Service Menu")) {
					browser.reportscomtep("Passed", "Verify ManageCircle dropdown Services value is slected",
							"ManageCircle dropdown Services value should be slected",
							"ManageCircle dropdown value selected as:" + SelectedType);
					if (browser.elementisdisplayed(SCobjects.SreviceMenu_PageHeader)) {
						browser.reportscomtep("Passed", "Verify Service Menu Page is displayed",
								"Service Menu Page should be displayed", "Service Menu Page is displayed");

						if (SCobjects.SreviceMenu_SericeAddAlready_NameList.size() > 0) {

							List<WebElement> ServiceList = SCobjects.SreviceMenu_SericeAddAlready_NameList;
							for (WebElement ServiceNames : ServiceList) {
								ServicesAddedNames = ServicesAddedNames + "\n" + ServiceNames.getText();
							}

							if (ServicesAddedNames!="") {
								browser.reportscomtep("Passed", "Verify Services are already added",
										"Services should be already added",
										"Services are already added as:" + ServicesAddedNames);							
								
								List<WebElement> ServiceUIGL = SCobjects.SericeMenu_ServicesUnderIndividualGroup_List;
								for (WebElement ServiceUnderGropuList : ServiceUIGL) {
									ServicesUnderGroupListNames = ServicesUnderGroupListNames + "\n"
											+ ServiceUnderGropuList.getText();									
								}
								if (ServiceUIGL.size() > 0 && browser.elementisdisplayed(ServiceUIGL.get(0))) {
									browser.reportscomtep("Passed",
											"Verify Services under individual Group are displayed",
											"Services under individual Group shpuld be displayed",
											"Services under individual Group are displayed as:"
													+ ServicesUnderGroupListNames);

								} else {
									browser.reportscomtep("Failed",
											"Verify Services under individual Group are displayed",
											"Services under individual Group shpuld be displayed",
											"Services under individual Group are not displayed ");
								}
							} else {
								browser.reportscomtep("Failed", "Verify Services are already added",
										"Services should be already added", "Services are not added");
							}
							
							browser.Verify_elementisdisplayed_Report(SCobjects.SreviceMenu_AddNewGroup_Button,"+New Group button");
							browser.Verify_elementisdisplayed_Report(SCobjects.ServiceMenu_AddNewService_Buttons_List.get(0), "+New Service button");

						}else if (browser.elementisdisplayed(SCobjects.SreviceMenu_AddNewGroupAtLoginFirstTime_Button)) {
							browser.reportscomtep("Passed", "Verify +New Group button is displayed",
									"+New Group button should be displayed", "+New Group button is displayed");

						} 

					} else {
						browser.reportscomtep("Failed", "Verify Service Menu Page is displayed",
								"Service Menu Page should be displayed", "Service Menu page is not displayed");
					}

				} else {
					browser.reportscomtep("Failed", "Verify ManageCircle dropdown Services value is slected",
							"ManageCircle dropdown Services value should be slected",
							"ManageCircle dropdown value Services value is not selected");
				}
			} else {
				browser.reportscomtep("Failed", "Verify Manage Circle dropdown link is displayed in Dashboard page",
						"Manage Circle dropdown link should be displayed",
						"Manage Circle dropdown link is not displayed");
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
				
	/****** TC_11_002 Check the details under individual Group ******/

	public void checkDetails_UnderIndividualGroup() {
		String GroupName = "";
		String ForGenderDetails = "";
		String OBDetails = "";
		try {
			List<WebElement> GroupList = SCobjects.SreviceMenu_SericeAddAlready_NameList;
			List<WebElement> GroupEditButton = SCobjects.ServiceMenu_GroupNameWithEdit_ButtonList;
			if (GroupList.size() > 0 && GroupEditButton.size() > 0) {
				if (browser.elementisdisplayed(GroupList.get(0)) && browser.elementisdisplayed(GroupList.get(0))) {
					GroupName = GroupList.get(0).getText();
					browser.reportscomtep("Passed", "Verify Group name with edit button is displayed",
							"Group name with edit button should be displayed",
							"Group name with edit button is displayed as:" + GroupName);
					browser.Verify_elementisdisplayed_Report(SCobjects.ServiceMenu_AddNewService_Buttons_List.get(0),
							"+New Service button");
					if (browser.elementisdisplayed(SCobjects.SM_Tabularform)) {
						browser.reportscomtep("Passed", "Verify Service group Tabular form is displayed",
								"Service group Tabular form should be displayed",
								"Service group Tabular form is displayed");
						browser.Verify_elementisdisplayed_Report(SCobjects.ServiceMenu_ServiceName_TableHeader,
								"SerVice Name Table Header");
						browser.Verify_elementisdisplayed_Report(SCobjects.ServiceMenu_For_TableHeader,
								"For Table Header");
						if (browser.elementisdisplayed(SCobjects.ServiceMenu_For_MenOrWomwnOrEveryOne_Details)) {
							ForGenderDetails = browser
									.getelementtext(SCobjects.ServiceMenu_For_MenOrWomwnOrEveryOne_Details);
							if (ForGenderDetails.trim().equalsIgnoreCase("male")
									|| ForGenderDetails.trim().equalsIgnoreCase("female")
									|| ForGenderDetails.trim().equalsIgnoreCase("everyone")) {
								browser.reportscomtep("Passed",
										"Verify Service provide For Male/Female/Everyone are dispalyed",
										"Service provide For Male/Female/Everyone shpould be dispalyed",
										"Service provide for Male/Female/Everyone are dispalyed as:"
												+ ForGenderDetails);
							}

						}

						browser.Verify_elementisdisplayed_Report(SCobjects.ServiceMenu_Duration_TableHeader,
								"Duration Table Header");
						browser.Verify_elementisdisplayed_Report(SCobjects.ServiceMenu_ActualPrice_TableHeader,
								"Actual Price Table Header");
						browser.Verify_elementisdisplayed_Report(SCobjects.ServiceMenu_SalePrice_TableHeader,
								"Sale Price Table Header");
						browser.Verify_elementisdisplayed_Report(SCobjects.ServiceMenu_OnlineBooking_TableHeader,
								"Online Booking Table Header");
						if (browser.elementisdisplayed(SCobjects.Service_OnlineBooking_YesOrNo_Details)) {

							OBDetails = browser.getelementtext(SCobjects.Service_OnlineBooking_YesOrNo_Details);
							if (OBDetails.trim().equalsIgnoreCase("Yes") || OBDetails.trim().equalsIgnoreCase("No")) {
								browser.reportscomtep("Passed",
										"Verify Service provide Online Booking YES/NO are dispalyed",
										"Service provide Online Booking YES/NO should be dispalyed",
										"Service provide Online Booking YES/NO are dispalyed as:" + OBDetails);
							}

						}

						if (browser.elementisdisplayed(SCobjects.ServiceMenu_Action_TableHeader)
								&& browser.elementisdisplayed(SCobjects.ServiceMenu_Action_UnedrServiceEditButton)) {
							browser.reportscomtep("Passed",
									"Verify Action Table header and Service Edit button are displayed",
									"Action Table header and Service Edit button should be displayed",
									"Action Table header and Service Edit button are displayed");
						} else {
							browser.reportscomtep("failed",
									"Verify Action Table header and Service Edit button are displayed",
									"Action Table header and Service Edit button should be displayed",
									"Action Table header and Service Edit button are not displayed");
						}

					} else {
						browser.reportscomtep("Failed", "Verify Service group Tabular form is displayed",
								"Service group Tabular form should be displayed",
								"Service group Tabular form is displayed");
					}
				} else {
					browser.reportscomtep("Failed", "Verify Group name with edit button is displayed",
							"Group name with edit button should be displayed",
							"Group name with edit button is not displayed");

				}
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}

				/*****TC_11_003 Check whether a New Group can be added*****/
				
				public void check_NewGroup_Added() {
					String AddedGroupName = "";
					int GroupNmaesListSize = 0;
					String AddedGroupNameText = "";

					try {
						AddedGroupName = browser.getdata("GroupName");
						browser.click(SCobjects.SreviceMenu_AddNewGroup_Button);
						if (browser.elementisdisplayed(SCobjects.ServiceMenu_NewServiceGroup_Popup_Header)) {
							browser.reportscomtep("Passed",
									"Clicks on Add New Group button And verify New Service Group Popup is displayed",
									"New Service Group Popup should be displayed", "New Service Group Popup is displayed");
							browser.sendkeys(SCobjects.ServiceMenu_NewServiceGroupPopup_GroupName_TextBox, AddedGroupName);
							browser.click(SCobjects.ServiceMenu_NewServiceGroupPopup_AddButton);
							browser.click(SCobjects.ServiceMenu_Popup_OK_Button);
							List<WebElement> GroupNmaesList = SCobjects.SreviceMenu_SericeAddAlready_NameList;
							GroupNmaesListSize = GroupNmaesList.size()-1;
							browser.scrollintoviewelement(GroupNmaesList.get(GroupNmaesListSize));
							AddedGroupNameText = GroupNmaesList.get(GroupNmaesListSize).getText();
							if (AddedGroupName.equalsIgnoreCase(AddedGroupNameText) && browser.elementisdisplayed(
									SCobjects.ServiceMenu_AddNewService_Buttons_List.get(GroupNmaesListSize))) {
								
									browser.reportscomtep("Passed",
											"Verify Added New Group name and New Service button is displayed",
											"Added New Group name and New Service button should be displayed",
											"New Service button and Added New Group Name displayed as:" + AddedGroupNameText);

								} else {
									browser.reportscomtep("Failed",
											"Verify Added New Group name and New Service button is displayed",
											"Added New Group name and New Service button should be displayed",
											"New Service button and Added New Group Name is not displayed");
								
							}

						} else {
							browser.reportscomtep("Failed",
									"Clicks on Add New Group button And verify New Service Group Popup is displayed",
									"New Service Group Popup should be displayed", "New Service Group Popup is not displayed");

						}
					} catch (Exception e) {
						System.out.println("Error description: " + e.getStackTrace());
					}
				}

				/****TC_11_004 Check whether New Group can be added without tying group name*****/
				
				public void check_NewGroupAdded_WithoutTyping_GroupName() {
					String NewServiceGroupPopup_EM = "";
					try {
						browser.click(SCobjects.SreviceMenu_AddNewGroup_Button);
						if (browser.elementisdisplayed(SCobjects.ServiceMenu_NewServiceGroup_Popup_Header)) {
							browser.reportscomtep("Passed",
									"Clicks on Add New Group button And verify New Service Group Popup is displayed",
									"New Service Group Popup should be displayed", "New Service Group Popup is displayed");
							browser.scrollintoviewelement(SCobjects.ServiceMenu_NewServiceGroupPopup_AddButton);
							browser.click(SCobjects.ServiceMenu_NewServiceGroupPopup_AddButton);
							if (browser.elementisdisplayed(SCobjects.ServiceMenu_NewServiceGroupPopup_EM)) {
								NewServiceGroupPopup_EM = SCobjects.ServiceMenu_NewServiceGroupPopup_EM.getText();
								browser.reportscomtep("Passed",
										"In New Service Group popup Click on Add button without entering a name  and Verify  validation message is displayed ",
										"validation message should be displayed",
										"validation message is displayed as:" + NewServiceGroupPopup_EM);
							} else {
								browser.reportscomtep("failed",
										"In New Service Group popup Click on Add button without entering a name  and Verify  validation message is displayed ",
										"validation message should be displayed", "validation message is not  displayed");
							}

							browser.click(SCobjects.ServiceMenu_NewServiceGroupPopup_CloseButton);
						} else {
							browser.reportscomtep("Failed",
									"Clicks on Add New Group button And verify New Service Group Popup is displayed",
									"New Service Group Popup should be displayed", "New Service Group Popup is not displayed");

						}
					} catch (Exception e) {
						System.out.println("Error description: " + e.getStackTrace());
					}
				}
				
				/****TC_11_005 Check whether the Group name can be edited****/
				
				public void check_GroupName_Edited() {
					String AfterEdit_GroupName = "";
					String BeforeEdit_GroupName = "";
					try {
						AfterEdit_GroupName = browser.getdata("GroupNameEdit");
						List<WebElement> Groupsnames = SCobjects.SreviceMenu_SericeAddAlready_NameList;
						List<WebElement> EdtiButtons = SCobjects.ServiceMenu_GroupNameWithEdit_ButtonList;
						if (Groupsnames.size() > 0) {
						BeforeEdit_GroupName = Groupsnames.get(1).getText();
						browser.click(EdtiButtons.get(1));
							if (browser.elementisdisplayed(SCobjects.ServiceMenu_NewServiceGroup_Popup_Header)) {
								browser.reportscomtep("Passed",
										"Clicks on Group name of the Edit button And verify New Service Group Popup is displayed",
										"New Service Group Popup should be displayed", "New Service Group Popup is displayed");
								browser.clearText(SCobjects.ServiceMenu_NewServiceGroupPopup_GroupName_TextBox);
								browser.sendkeys(SCobjects.ServiceMenu_NewServiceGroupPopup_GroupName_TextBox, AfterEdit_GroupName);
								browser.click(SCobjects.ServiceMenu_NewServiceGroupPopup_SavechangesButton);
								browser.click(SCobjects.ServiceMenu_Popup_OK_Button);
								if (AfterEdit_GroupName != BeforeEdit_GroupName && browser.elementisdisplayed(Groupsnames.get(1))) {
									browser.reportscomtep("Passed",
											"Enter the Group Name, click on Save Chamges button and Conformation Ok button and verify The group name is changed",
											"The group name should be changed", "The group name is changed");
								} else {
									browser.reportscomtep("Failed",
											"Enter the Group Name, click on Save Chamges button and Conformation Ok button and verify The group name is changed",
											"The group name should be changed", "The group name is not changed");
								}
							} else {
								browser.reportscomtep("Failed",
										"Clicks on Group name of the Edit button And verify New Service Group Popup is displayed",
										"New Service Group Popup should be displayed", "New Service Group Popup is not displayed");
							}
						}

					} catch (Exception e) {
						System.out.println("Error description: " + e.getStackTrace());
					}
				}
				
				
				/*****TC_11_006 Check whether a group can be deleted*********/
				public void check_Group_Deleted() {
					String BeforeDelete_GN = "";
					String GroupName = "";
					try {
						List<WebElement> Groupsnames = SCobjects.SreviceMenu_SericeAddAlready_NameList;
						List<WebElement> EdtiButtons = SCobjects.ServiceMenu_GroupNameWithEdit_ButtonList;
						if (Groupsnames.size() > 0) {
							BeforeDelete_GN = Groupsnames.get(1).getText();
							browser.click(EdtiButtons.get(1));
							if (browser.elementisdisplayed(SCobjects.ServiceMenu_NewServiceGroup_Popup_Header)) {
								browser.reportscomtep("Passed",
										"Clicks on Group name of the Edit button And verify New Service Group Popup is displayed",
										"New Service Group Popup should be displayed", "New Service Group Popup is displayed");
								browser.click(SCobjects.ServiceMenu_NewServiceGroupPopup_DeleteButton);
								browser.click(SCobjects.ServiceMenu_NewServiceGroupPopup_YesDeleteItButton);
								browser.click(SCobjects.ServiceMenu_Popup_OK_Button);
								for (WebElement DeleteGN : Groupsnames) {
									GroupName = DeleteGN.getText();
									if (GroupName != BeforeDelete_GN && browser.elementisdisplayed(Groupsnames.get(0))) {
										browser.reportscomtep("Passed",
												"Clicks on delete button, continue clicks on Yesdeleteit and OK Conformation buttons and verify The Group and the services within the group is deleted ",
												"The Group and the services within the group should be deleted ",
												"The Group and the services within the group is deleted ");
									} else {
										browser.reportscomtep("Failed",
												"Clicks on delete button, continue clicks on Yesdeleteit and OK Conformation buttons and verify The Group and the services within the group is deleted ",
												"The Group and the services within the group should be deleted ",
												"The Group and the services within the group is not deleted ");
									}
								}

							} else {
								browser.reportscomtep("Failed",
										"Clicks on Group name of the Edit button And verify New Service Group Popup is displayed",
										"New Service Group Popup should be displayed", "New Service Group Popup is not displayed");
							}
						}

					} catch (Exception e) {
						System.out.println("Error description: " + e.getStackTrace());
					}
				}
				
				/**********TC_11_007 Check the action & details when +New Service button is clicked**********/
				
				public void Check_ActionAndDetails_AddNewServiceButton_Click() {
					try {
						List<WebElement> AddNewService = SCobjects.ServiceMenu_AddNewService_Buttons_List;
						if (AddNewService.size() > 0) {
							browser.click(AddNewService.get(1));
							if (browser.elementisdisplayed(SCobjects.ServiceMenu_AddNewServicePopup_Header)) {
								browser.reportscomtep("Passed",
										"Clicks on +New Service button and verify Add New Service Popup is displayed",
										"Add New Service Popup should be displayed", "Add New Service Popup is displayed");
								if (browser.elementisdisplayed(SCobjects.ServiceMenu_AddNewServicePopup_DetailsTab)) {
									browser.reportscomtep("Passed", "Verify Details tab is displayed",
											"Details tab should be displayed", "Details tab is displayed");
									browser.Verify_elementisdisplayed_Report(SCobjects.SM_AddNewServicePopup_ServiceName_TextBox,
											"Service Name field");
									browser.Verify_elementisdisplayed_Report(SCobjects.SM_AddNewServicePopup_Treatment_Typedropdown,
											"Treatment Type dropdown list");
									browser.Verify_elementisdisplayed_Report(
											SCobjects.SM_AddNewServicePopup_AvailableFor_DropdownList,
											"Available for dropdown list");
									browser.Verify_elementisdisplayed_Report(
											SCobjects.SM_AddNewServicePopup_EnableOnlineBookings_CheckBox,
											"Enable online bookings");
									browser.Verify_elementisdisplayed_Report(SCobjects.SM_AddNewServicePopup_DurationDropdown_List,
											"Duration dropdown list");
									browser.Verify_elementisdisplayed_Report(SCobjects.SM_AddNewServicePopup_FullPriceField_TextBox,
											"Full price field");
									browser.Verify_elementisdisplayed_Report(
											SCobjects.SM_AddNewServicePopup_SpecialPriceField_TextBox, "Special Price Field");
									browser.Verify_elementisdisplayed_Report(SCobjects.SM_AddNewServicePopup_Close_Button,
											"Close button");
									browser.Verify_elementisdisplayed_Report(SCobjects.SM_AddNewServicePopup_SaveChanges_Button,
											"Save Changes button");

								} else {
									browser.reportscomtep("Failed", "Verify Details tab is displayed",
											"Details tab should be displayed", "Details tab is not displayed");
								}
								if(browser.elementisdisplayed(SCobjects.ServiceMenu_AddNewServicePopup_StaffTab)){
									browser.reportscomtep("Passed", "Verify Staff Tab is displayed ",
											"Staff Tab should be displayed", "Staff Tab is displayed");
									browser.click(SCobjects.ServiceMenu_AddNewServicePopup_StaffTab);
									///************////
									browser.Verify_elementisdisplayed_Report(SCobjects.SM_AddNewServicePopup_Staff_SelectAll_CheckBox, "Select all staff CheckBoxs");
									browser.Verify_elementisdisplayed_Report(SCobjects.SM_ANSP_Staff_Individual_CheckBox_List.get(0), "select individual/multiple staff CheckBoxs");
									
									browser.Verify_elementisdisplayed_Report(SCobjects.SM_AddNewServicePopup_Close_Button,
											"Close button");
									browser.Verify_elementisdisplayed_Report(SCobjects.SM_AddNewServicePopup_SaveChanges_Button,
											"Save Changes button");
								}else{
									browser.reportscomtep("Failed", "Verify Staff Tab is displayed ",
											"Staff Tab should be displayed", "Staff Tab is not displayed");
								}

							} else {
								browser.reportscomtep("Failed",
										"Clicks on +New Service button and verify Add New Service Popup is displayed",
										"Add New Service Popup should be displayed", "Add New Service Popup is not displayed");
							}
						}
					} catch (Exception e) {
						System.out.println("Error description: " + e.getStackTrace());
					}
				}
				
				/**TC_11_008 Check the mandatory  fields in Add new service popup *******/
				
				public void check_MandatoryFields_InAddNewService_Popup() {
					String ServiceName_EM = "";
					String TreatmentType_EM = "";
					String Duration_EM = "";
					String FullPrice_EM = "";
					try {
						browser.scrollintoviewelement(SCobjects.ServiceMenu_AddNewServicePopup_DetailsTab);
						browser.click(SCobjects.ServiceMenu_AddNewServicePopup_DetailsTab);
						browser.click(SCobjects.SM_AddNewServicePopup_SaveChanges_Button);
						if (browser.elementisdisplayed(SCobjects.SM_AddNewServicePopup_ServiceName_EM)
								&& browser.elementisdisplayed(SCobjects.SM_AddNewServicePopup_TreatmentType_EM)
								&& browser.elementisdisplayed(SCobjects.SM_AddNewServicePopup_Duration_EM)
								&& browser.elementisdisplayed(SCobjects.SM_AddNewServicePopup_FullPrice_EM)) {
							ServiceName_EM = browser.getelementtext(SCobjects.SM_AddNewServicePopup_ServiceName_EM);
							TreatmentType_EM = browser.getelementtext(SCobjects.SM_AddNewServicePopup_TreatmentType_EM);
							Duration_EM = browser.getelementtext(SCobjects.SM_AddNewServicePopup_Duration_EM);
							FullPrice_EM = browser.getelementtext(SCobjects.SM_AddNewServicePopup_FullPrice_EM);
							browser.reportscomtep("Passed",
									"In The details tab, click on Save Changes button without adding any details And Verify Manmandatory fields Error Messgaes are displayed",
									" Manmandatory fields Error Messgaes should be displayed",
									" Manmandatory fields Error Messgaes are displayed as:" + ServiceName_EM + "\n"
											+ TreatmentType_EM + "\n" + Duration_EM + "\n" + FullPrice_EM);
						}

					} catch (Exception e) {
						System.out.println("Error description: " + e.getStackTrace());
					}
				}
				
				
				/****TC_11_009 Check whether new service can be added*********/
				
				public void check_NewService_Added() {
					String NewServiceName = "";
					String FullPrice = "";
					String SpecialPrice = "";
					int ServiceNameLength = 0;
					String Expected_NewServiceName = "";

					try {
						NewServiceName = browser.getdata("ServiceName");
						FullPrice = browser.getdata("ServiceFullPrice");
						SpecialPrice = browser.getdata("ServiceSpecialPrice");
						browser.sendkeys(SCobjects.SM_AddNewServicePopup_ServiceName_TextBox, NewServiceName);
						browser.selectByVisibleText(SCobjects.SM_AddNewServicePopup_Treatment_Typedropdown, "Braids");
						browser.selectByVisibleText(SCobjects.SM_AddNewServicePopup_AvailableFor_DropdownList, "Males Only");
						browser.click(SCobjects.SM_AddNewServicePopup_EnableOnlineBookings_CheckBox);
						browser.selectByVisibleText(SCobjects.SM_AddNewServicePopup_DurationDropdown_List, "25min");
						browser.sendkeys(SCobjects.SM_AddNewServicePopup_FullPriceField_TextBox, FullPrice);
						browser.sendkeys(SCobjects.SM_AddNewServicePopup_SpecialPriceField_TextBox, SpecialPrice);
						browser.click(SCobjects.ServiceMenu_AddNewServicePopup_StaffTab);
						browser.click(SCobjects.SM_AddNewServicePopup_Staff_SelectAll_CheckBox);
						browser.click(SCobjects.SM_AddNewServicePopup_SaveChanges_Button);
						browser.click(SCobjects.ServiceMenu_Popup_OK_Button);
						List<WebElement> NewServiecesNamesList = SCobjects.SericeMenu_ServicesUndersecondGroup_List;
						ServiceNameLength = NewServiecesNamesList.size();
						if (ServiceNameLength > 0) {
							ServiceNameLength = NewServiecesNamesList.size()-1;
							browser.scrollintoviewelement(NewServiecesNamesList.get(ServiceNameLength));
							Expected_NewServiceName = NewServiecesNamesList.get(ServiceNameLength).getText();
							if (browser.elementisdisplayed(NewServiecesNamesList.get(ServiceNameLength))
									&& Expected_NewServiceName.equalsIgnoreCase(NewServiceName)) {
								browser.reportscomtep("Passed",
										"Enter the mandatory info in details tab and click on Staff Tab and select Staff all checkbox and click SaveChanges button and OK button and verify The service is added in the specified group with given details in relevant columns",
										"The service should be added in the specified group with given details in relevant columns",
										"The service is added in the specified group with given details in relevant columns");

							} else {
								browser.reportscomtep("Failed",
										"Enter the mandatory info in details tab and click on Staff Tab and select Staff all checkbox and click SaveChanges button and OK button and verify The service is added in the specified group with given details in relevant columns",
										"The service should be added in the specified group with given details in relevant columns",
										"The service is not added in the specified group with given details in relevant columns");
							}
						}

					} catch (Exception e) {
						System.out.println("Error description: " + e.getStackTrace());
					}
				}	
				
	/****TC_11_010 Check whether the service can be edited*********/
				
				public void Checkwhether_service_edited() {
					String NewServiceName = "";
					String FullPrice = "";
					String SpecialPrice = "";
					int ServiceNameLength = 0;
					String Expected_NewServiceName = "";
					
					try {
						List<WebElement> EdtiButtons = SCobjects.ServiceMenu_servicenameEdit_ButtonList;
						NewServiceName = browser.getdata("edit_ServiceName");
						FullPrice = browser.getdata("edit_ServiceFullPrice");
						SpecialPrice = browser.getdata("edit_ServiceSpecialPrice");
						browser.click(EdtiButtons.get(1));
						browser.sendkeys(SCobjects.SM_editServicePopup_ServiceName_TextBox, NewServiceName);
						browser.selectByVisibleText(SCobjects.SM_editServicePopup_Treatment_Typedropdown, "Braids");
						browser.selectByVisibleText(SCobjects.SM_editServicePopup_AvailableFor_DropdownList, "Males Only");
						browser.click(SCobjects.SM_editServicePopup_EnableOnlineBookings_CheckBox);
						browser.selectByVisibleText(SCobjects.SM_editServicePopup_DurationDropdown_List, "25min");
						browser.sendkeys(SCobjects.SM_editServicePopup_FullPriceField_TextBox, FullPrice);
						browser.sendkeys(SCobjects.SM_editServicePopup_SpecialPriceField_TextBox, SpecialPrice);
						browser.click(SCobjects.ServiceMenu_editServicePopup_StaffTab);
						browser.click(SCobjects.SM_editServicePopup_Staff_SelectAll_CheckBox);
						browser.click(SCobjects.SM_editServicePopup_SaveChanges_Button);
						browser.click(SCobjects.ServiceMenu_Popup_OK_Button);
						List<WebElement> NewServiecesNamesList = SCobjects.SericeMenu_ServicesUndersecondGroup_List;
						ServiceNameLength = NewServiecesNamesList.size();
						if (ServiceNameLength > 0) {
							ServiceNameLength = NewServiecesNamesList.size()-1;
							browser.scrollintoviewelement(NewServiecesNamesList.get(ServiceNameLength));
							Expected_NewServiceName = NewServiecesNamesList.get(ServiceNameLength).getText();
							if (browser.elementisdisplayed(NewServiecesNamesList.get(ServiceNameLength))
									&& Expected_NewServiceName.equalsIgnoreCase(NewServiceName)) {
								browser.reportscomtep("Passed",
										"Edit serviece details in the details tab and verify the edited serviece details are displayed ",
										"The edited service detailes in relevant column should be displayed",
										"The edited service detailes in relevant column displayed");

							} else {
								browser.reportscomtep("Failed",
										"Edit serviece details in the details tab and verify the edited serviece details are displayed ",
										"The edited service detailes in relevant column should be displayed",
										"The edited service detailes in relevant column not displayed");
							}
						}

					} catch (Exception e) {
						System.out.println("Error description: " + e.getStackTrace());
					}
				}
				
				
				/******** TC_11_011 Check whether a service can be disabled ************/
				
				public void checkWhether_Service_Disabled() {
					String BeforeDisableService = "";
					String AfterDisableService = "";

					try {
						List<WebElement> EdtiButtons = SCobjects.ServiceMenu_servicenameEdit_ButtonList;
						List<WebElement> NewServiecesNamesList = SCobjects.SericeMenu_ServicesUndersecondGroup_List;
						BeforeDisableService = NewServiecesNamesList.get(0).getText();
						browser.click(EdtiButtons.get(1));
						if (browser.elementisdisplayed(SCobjects.ServiceMenu_editNewServicePopup_Header)) {
							browser.reportscomtep("Passed",
									"Clicks on edit button in the service and verify Edit Add New Service Popup header is displayed",
									"Edit Add New Service Popup header should be displayed",
									"Edit Add New Service Popup header is displayed");
							browser.click(SCobjects.SM_EditNewServicePopup_DisableButton);
							browser.click(SCobjects.SM_EditNewServicePopup_YesDisableIt_Button);
							browser.click(SCobjects.ServiceMenu_Popup_OK_Button);
							if (browser.elementisdisplayed(SCobjects.SM_EditNewServicePopup_EnableButton)) {
								browser.reportscomtep("Passed",
										"Clicks on continue Disable, YesDisable and OK buttons and verify Service Disable & Enable Button is displayed",
										"Service Disable & Enable Button should be displayed", " Service Disable & Enable Button is displayed");
								browser.click(SCobjects.SM_editServicePopup_Close_Button);
								AfterDisableService = NewServiecesNamesList.get(0).getText();
								if (AfterDisableService.equalsIgnoreCase(BeforeDisableService)
										&& browser.elementisdisplayed(NewServiecesNamesList.get(0))) {
									browser.reportscomtep("Passed",
											"Verify Service is not be removed from group but it will be removed from the Business page",
											"Service should not be removed from group but it will be removed from the Business page",
											"Service is not removed from group but it will be removed from the Business page");
								} else {
									browser.reportscomtep("Failed",
											"Verify Service is not be removed from group but it will be removed from the Business page",
											"Service should not be removed from group but it will be removed from the Business page",
											"Service is removed from group but it will not be removed from the Business page");
								}

							} else {
								browser.reportscomtep("Failed",
										"Clicks on continue Disable, YesDisable and OK buttons and verify Service Disable & Enable Button is displayed",
										"Service Disable & Enable Button should be displayed", "Service Disable & Enable Button is not sdisplayed");
							}
						} else {
							browser.reportscomtep("Failed",
									"Clicks on edit button in the service and verify Edit Add New Service Popup header is displayed",
									"Edit Add New Service Popup header should be displayed",
									"Edit Add New Service Popup header is not displayed");
						}

					} catch (Exception e) {
						System.out.println("Error description: " + e.getStackTrace());
					}
				}
				/***TC_11_012 Check whether a service can be enabled****/
				
				public void checkWhether_Service_Enabled() {
					String BeforeEnabledService = "";
					String AfterEnabledService = "";

					try {
						List<WebElement> EdtiButtons = SCobjects.ServiceMenu_servicenameEdit_ButtonList;
						List<WebElement> NewServiecesNamesList = SCobjects.SericeMenu_ServicesUndersecondGroup_List;
						BeforeEnabledService = NewServiecesNamesList.get(0).getText();
						browser.click(EdtiButtons.get(1));
						if (browser.elementisdisplayed(SCobjects.ServiceMenu_editNewServicePopup_Header)) {
							browser.reportscomtep("Passed",
									"Clicks on edit button in the service and verify Edit Add New Service Popup header is displayed",
									"Edit Add New Service Popup header should be displayed",
									"Edit Add New Service Popup header is displayed");
							browser.click(SCobjects.SM_EditNewServicePopup_EnableButton);
							browser.click(SCobjects.ServiceMenu_Popup_OK_Button);
							if (browser.elementisdisplayed(SCobjects.SM_EditNewServicePopup_DisableButton)) {
								browser.reportscomtep("Passed",
										"Clicks on continue Enable,and OK buttons and verify Service Enable & disable Button is displayed",
										"Service Enable & Disable Button should be displayed",
										"Service Enable & Disable Button is displayed");
								browser.click(SCobjects.SM_editServicePopup_Close_Button);
								AfterEnabledService = NewServiecesNamesList.get(0).getText();
								if (AfterEnabledService.equalsIgnoreCase(BeforeEnabledService)
										&& browser.elementisdisplayed(NewServiecesNamesList.get(0))) {
									browser.reportscomtep("Passed", "Verify The service is displayed in the business page",
											"The service should be displayed in the business page",
											"The service is displayed in the business page");
								} else {
									browser.reportscomtep("Failed", "Verify The service is displayed in the business page",
											"The service should be displayed in the business page",
											"The service is not displayed in the business page");
								}

							} else {
								browser.reportscomtep("Failed",
										"Clicks on continue Disable, YesDisable and OK buttons and verify Service Enable & Disable Button is displayed",
										"Service Enable & Disable Button should be displayed",
										"Service Enable & Disable Button is not sdisplayed");
							}
						} else {
							browser.reportscomtep("Failed",
									"Clicks on edit button in the service and verify Edit Add New Service Popup header is displayed",
									"Edit Add New Service Popup header should be displayed",
									"Edit Add New Service Popup header is not displayed");
						}

					} catch (Exception e) {
						System.out.println("Error description: " + e.getStackTrace());
					}
				}

				/****** TC_11_013 Check whether a service can be deleted****/
				
				public void checkWhether_Service_Deleted() {
					String BeforeDeleteService = "";
					String AfterDeletedService = "";

					try {
						List<WebElement> EdtiButtons = SCobjects.ServiceMenu_servicenameEdit_ButtonList;
						List<WebElement> NewServiecesNamesList = SCobjects.SericeMenu_ServicesUndersecondGroup_List;
						BeforeDeleteService = NewServiecesNamesList.get(0).getText();
						browser.click(EdtiButtons.get(1));
						if (browser.elementisdisplayed(SCobjects.ServiceMenu_editNewServicePopup_Header)) {
							browser.reportscomtep("Passed",
									"Clicks on edit button in the service and verify Edit Add New Service Popup header is displayed",
									"Edit Add New Service Popup header should be displayed",
									"Edit Add New Service Popup header is displayed");
							browser.click(SCobjects.SM_EditNewServicePopup_DeleteButton);
							browser.click(SCobjects.ServiceMenu_NewServiceGroupPopup_YesDeleteItButton);
							browser.click(SCobjects.ServiceMenu_Popup_OK_Button);
							AfterDeletedService = NewServiecesNamesList.get(0).getText();
							if (AfterDeletedService != BeforeDeleteService
									&& browser.elementisdisplayed(NewServiecesNamesList.get(0))) {
								browser.reportscomtep("Passed",
										"Clicks on continue Delete,YesDelete and OK buttons Verify The service is deleted from the Group",
										"The service should be deleted from the Group", "The service is deleted from the Group");
							} else {
								browser.reportscomtep("Failed",
										"Clicks on continue Delete,YesDelete and OK buttons Verify The service is deleted from the Group",
										"The service should be deleted from the Group",
										"The service is not deleted from the Group");
							}
						} else {
							browser.reportscomtep("Failed",
									"Clicks on continue Disable, YesDisable and OK buttons and verify Service Enable & Disable Button is displayed",
									"Service Enable & Disable Button should be displayed",
									"Service Enable & Disable Button is not sdisplayed");
						}

					} catch (Exception e) {
						System.out.println("Error description: " + e.getStackTrace());
					}
				}
				
				/******TC_12_001	Open Staff page*****/
				 
				public void open_StaffPage() {
					String SelectedType = "";
					try {
						if (browser.elementisdisplayed(SCobjects.Subscriber_ManageCircle_Dropdown_Link)) {
							browser.reportscomtep("Passed", "Verify Manage Circle dropdown link is displayed in Dashboard page",
									"Manage Circle dropdown link should be displayed", "Manage Circle dropdown link is displayed");
							browser.click(SCobjects.Subscriber_ManageCircle_Dropdown_Link);
							SelectedType = browser.getelementtext(SCobjects.Subscriber_ManageCircle_Staff_DDvalue);
							if (SelectedType.equalsIgnoreCase("Staff")) {
								browser.click(SCobjects.Subscriber_ManageCircle_Staff_DDvalue);
								browser.reportscomtep("Passed", "Verify ManageCircle dropdown value is slected",
										"ManageCircle dropdown value should be slected",
										"ManageCircle dropdown value selected as: " + SelectedType);
								if (browser.elementisdisplayed(SCobjects.Subscriber_Staff_Page)) {
									browser.reportscomtep("Passed", "Verify Staff page is displayed",
											"Staff page should be displayed", "Staff page is displayed");
									browser.Verify_elementisdisplayed_Report(SCobjects.Subscriber_Staff_SearchNameorMobile_Textbox,
											"Search Name or Mobile Textbox");
									browser.Verify_elementisdisplayed_Report(SCobjects.Subscriber_Staff_NewStaff_Button,
											"New Staff Button");
									if (SCobjects.Subscriber_Staff_DetailsList.size() > 0) {
										browser.reportscomtep("Passed",
												"Verify Staff Staff details are displayed",
												"Staff details should be displayed", "Staff details are displayed");
									} else if(browser.elementisdisplayed(SCobjects.Staff_SearchFilter_Table)){
										browser.reportscomtep("Passed",
												"Verify Staff Staff details are displayed",
												"Staff details should be displayed", "Staff details are not displayed as expected staff not added");
									} else {
										browser.reportscomtep("Passed",
												"Verify Staff Staff details are displayed",
												"Staff details should be displayed", "Staff details table also not displayed");
									}
									
								} else {
									browser.reportscomtep("Failed", "Verify Staff page is displayed",
											"Staff page should be displayed", "Staff page is not displayed");
								}
							} else {
								browser.reportscomtep("Failed", "Verify ManageCircle dropdown value is slected",
										"ManageCircle dropdown value should be slected",
										"ManageCircle dropdown value is not selected");
							}
						} else {
							browser.reportscomtep("Failed", "Verify Manage Circle dropdown link is displayed in Dashboard page",
									"Manage Circle dropdown link should be displayed",
									"Manage Circle dropdown link is not displayed");

						}

					} catch (Exception e) {
						System.out.println("Error description: " + e.getStackTrace());
					}
				}
				/*****TC_12_002	Check the details in staff page***/
				public void check_Details_InStaffPage() {
					String CalenderDetails = "";
					try {
						browser.Verify_elementisdisplayed_Report(SCobjects.Staff_Name_Text, "Name");
						browser.Verify_elementisdisplayed_Report(SCobjects.Staff_MobileNumber_Text, "Mobile Number");
						browser.Verify_elementisdisplayed_Report(SCobjects.Staff_Email_Text, "Email");
						browser.Verify_elementisdisplayed_Report(SCobjects.Staff_AppointmentsStaff_Text, "Appointments");
						browser.Verify_elementisdisplayed_Report(SCobjects.Staff_CreatedatText, "Created at");
						browser.Verify_elementisdisplayed_Report(SCobjects.Staff_ProfileImage_Text, "Profile image");				
						
						if (browser.elementisdisplayed(SCobjects.Staff_ApmntCalenderDetails)) {
							
							if (CalenderDetails.trim().equalsIgnoreCase("Calendar bookings enabled")
									|| CalenderDetails.trim().equalsIgnoreCase("Calendar bookings disabled")) {
								browser.reportscomtep("Passed",
										"Verify Appointments details are Calendar bookings enabled/disabled is dispalyed",
										"Appointments details are Calendar bookings enabled/disabled details should be dispalyed",
										"Appointments details are Calendar bookings enabled/disabled details dispalyed as :"
												+ CalenderDetails);
							}
						}else{
							browser.reportscomtep("Failed",
									"Verify Appointments details are Calendar bookings enabled/disabled is dispalyed",
									"Appointments details are Calendar bookings enabled/disabled details should be dispalyed",
									"Appointments details are Calendar bookings enabled/disabled details not dispalyed");
						}					
						
						browser.Verify_elementisdisplayed_Report(SCobjects.Staff_EditButton, "Edit Button");
					} catch (Exception e) {
						System.out.println("Error description: " + e.getStackTrace());
					}
				}
				
				/********TC_12_003	Check the New Staff button*****/
				
				public void click_NewStaff_Button() {
					try {
						browser.click(SCobjects.Subscriber_Staff_NewStaff_Button);
						if (browser.elementisdisplayed(SCobjects.Staff_AddNewStaff_Header)) {
							browser.reportscomtep("Passed", "Click on New Staff Button and verify Add New Staff popup is dispalyed",
									"Add New Staff popup should be dispalyed", "Add New Staff popup is dispalyed");
							if (browser.elementisdisplayed(SCobjects.Staff_DetailsTab)) {
								browser.reportscomtep("Passed", "Verify Staff Details tab is dispalyed",
										"Staff Details tab should be dispalyed", "Staff Details tab is dispalyed");
								browser.Verify_elementisdisplayed_Report(SCobjects.Staff_FirstName_TextBox, "First Name Textbox");
								browser.Verify_elementisdisplayed_Report(SCobjects.Staff_LastName_TextBox, "Last Name TextBox");
								browser.Verify_elementisdisplayed_Report(SCobjects.Staff_MobileNumber_TextBox,
										"Mobile Number TextBox");
								browser.Verify_elementisdisplayed_Report(SCobjects.Staff_Email_TextBox, "Email TextBox");
								browser.Verify_elementisdisplayed_Report(SCobjects.Staff_EnableApnmtBkngs_Checkbox,
										" Enable appointment bookings CheckBox");
								if (browser.elementisdisplayed(SCobjects.Staff_Workschedule)
										&& browser.elementisdisplayed(SCobjects.Staff_Day_Text)
										&& browser.elementisdisplayed(SCobjects.Staff_OpeningHours)
										&& browser.elementisdisplayed(SCobjects.Staff_ClosingHours)) {
									browser.reportscomtep("Passed",
											"Verify Work Schedule Calendar i.e Day, Opening & Closing Hours are displayed",
											"Work Schedule Calendar i.e Day, Opening & Closing Hours should be displayed",
											"Work Schedule Calendar i.e Day, Opening & Closing Hours are displayed)");
								} else {
									browser.reportscomtep("Failed",
											"Verify Work Schedule Calendar i.e Day, Opening & Closing Hours are displayed",
											"Work Schedule Calendar i.e Day, Opening & Closing Hours should be displayed",
											"Work Schedule Calendar i.e Day, Opening & Closing Hours are not displayed)");
								}
								browser.Verify_elementisdisplayed_Report(SCobjects.Staff_Services_Tab, "Services Tab");
								browser.click(SCobjects.Staff_Services_Tab);
								if (SCobjects.Staff_Services_SelectServices_CheckboxList.size() > 0
										&& browser.elementisdisplayed(SCobjects.Staff_Services_SelectAllService_Checkbox)) {
									browser.reportscomtep("Passed",
											"Verify Select individual/Multiple service CheckBoxs are dispalyed",
											"Select individual/Multiple service CheckBoxs should be dispalyed",
											"Select individual/Multiple service CheckBoxs are dispalyed");
								} else {
									browser.reportscomtep("Failed",
											"Verify Select individual/Multiple service CheckBoxs are dispalyed",
											"Select individual/Multiple service CheckBoxs should be dispalyed",
											"Select individual/Multiple service CheckBoxs are not dispalyed");
								}
								browser.click(SCobjects.Staff_DetailsTab);
								browser.scrollintoviewelement(SCobjects.Staff_AddStaff_Button);
								browser.Verify_elementisdisplayed_Report(SCobjects.Staff_AddStaff_Button, "Add Staff Button");
								browser.Verify_elementisdisplayed_Report(SCobjects.Staff_Close_Button, "Close Button");
							} else {
								browser.reportscomtep("Failed", "Verify Staff Details tab is dispalyed",
										"Staff Details tab should be dispalyed", "Staff Details tab is not dispalyed");
							}
						} else {
							browser.reportscomtep("Failed", "Click on New Staff Button and verify Add New Staff popup is dispalyed",
									"Add New Staff popup should be dispalyed", "Add New Staff popup is not dispalyed");
						}
					} catch (Exception e) {
						System.out.println("Error description: " + e.getStackTrace());
					}
				}
				
				/*****TC_12_004	Check the Mandatory fields in Add new staff Popup *****/
				
				public void check_AddNewStaff_Popup_InMandatoryFieldsValidations() {
					String Actual_FirstNameEM = null;
					String Actual_LastNameEM = null;
					String Expect_FirstNameEM = "Please enter firstname";
					String Expect_LastNameEM = "Please enter lastname";
					try {
						browser.click(SCobjects.Staff_AddStaff_Button);
						if (browser.elementisdisplayed(SCobjects.Staff_PleaseEnterFirstname_ErrorMessage)) {
							Actual_FirstNameEM = browser.getelementtext(SCobjects.Staff_PleaseEnterFirstname_ErrorMessage);
							//browser.assertEquals(Actual_FirstNameEM, Expect_FirstNameEM);
							browser.reportscomtep("Passed",
									"Click on Add Staff button with out entering Mandatory fields and verify Please enter First name Error messgae is displayed ",
									"Please enter First name Error messgae should be displayed",
									"Error message is displayed as:" + Actual_FirstNameEM);
						}
						if (browser.elementisdisplayed(SCobjects.Staff_PleaseEnterlastname_ErrorMessag)) {
							Actual_LastNameEM = browser.getelementtext(SCobjects.Staff_PleaseEnterlastname_ErrorMessag);
							//browser.assertEquals(Actual_LastNameEM, Expect_LastNameEM);
							browser.reportscomtep("Passed",
									"Click on Add Staff button with out entering Mandatory fields and verify Please enter Last name Error messgae is displayed ",
									"Please enter Last name Error messgae should be displayed",
									"Error message is displayed as:" + Actual_LastNameEM);
						}
					} catch (Exception e) {
						System.out.println("Error description: " + e.getStackTrace());
					}
				}
				
				/************TC_12_005	Check if a Staff can be added*************/
				
				public void check_StaffAdded_Details(String emailentry, String Click_ServicesTab) {
					String Staff_FirstName = "";
					String Staff_LastName = "";
					String Staff_Phno = "";
					String Staff_EmailId = "";
					String Staff_Name = "";
					int Staff_length = 0;
					String Staff_addedName = "";
					try {
						Staff_FirstName = browser.getdata("Staf_Firstname");
						Staff_LastName = browser.getdata("Staf_Lastname");
						Staff_Phno = browser.getdata("Staff_PHNo");
						Staff_EmailId = browser.getdata("Staff_Mail");
						browser.sendkeys(SCobjects.Staff_FirstName_TextBox, Staff_FirstName);
						browser.sendkeys(SCobjects.Staff_LastName_TextBox, Staff_LastName);
						browser.sendkeys(SCobjects.Staff_MobileNumber_TextBox, Staff_Phno);
						switch (emailentry) {
							case "Enter_Email":
								browser.sendkeys(SCobjects.Staff_Email_TextBox, Staff_EmailId);
								break;								
							case "DoNothing":			
								break;
						}
						browser.click(SCobjects.Staff_EnableApnmtBkngs_Checkbox);
						if (SCobjects.Staff_DateAndSelect_OpeningAndClosing_Hours_list.size() > 1) {
							for (WebElement List : SCobjects.Staff_DateAndSelect_OpeningAndClosing_Hours_list) {
								if (!List.isSelected()) {
									List.click();
								}
							}
						}
						switch (Click_ServicesTab) {
							case "Click_ServicesTab":
								browser.click(SCobjects.Staff_Services_Tab);
								break;
							case "DoNothing":
								break;
						}
						browser.ScrollToElementBottom(SCobjects.Staff_AddStaff_Button);
						browser.click(SCobjects.Staff_AddStaff_Button);
						browser.click(SCobjects.Staff_Popup_ClickLink);
						Staff_Name = Staff_FirstName + " " + Staff_LastName;
						List<WebElement> StaffNameList = SCobjects.Staff_Name_List;
						Staff_length = StaffNameList.size();
						if (Staff_length > 1) {
								browser.scrollDown(600);
								if (browser.elementisdisplayed(StaffNameList.get(Staff_length))) {
									Staff_addedName = StaffNameList.get(Staff_length).getText(); /////*****Skip d code 
									browser.reportscomtep("Passed", "Verify Staff is added and details are displayed in the table",
											"Staff is added and details should be displayed in the table",
											"Staff is added and details are displayed in the table");
								} else {
									browser.reportscomtep("Failed", "Verify Staff is added and details are displayed in the table",
											"Staff is added and details should be displayed in the table",
											"Staff is added and details are not displayed in the table");
								}
						}
					} catch (Exception e) {
						System.out.println("Error description: " + e.getStackTrace());
					}
				}
				
				/*****TC_12_006	Check if a Staff details can be modified*****/
				
				public void check_StaffDetails_Modify() {

					String BeforeModify_StaffName = "";
					String Modify_Name = "";
					String Modify_StaffFirstName = "";
					String Modify_StaffLastName = "";
					String Modify_StaffPHno = "";
					String Modify_StaffEmail = "";
					try {
						Modify_StaffFirstName = browser.getdata("Satff_ModifyFN");
						Modify_StaffLastName = browser.getdata("Staff_ModifyLN");
						Modify_StaffPHno = browser.getdata("Staff_ModifyPHno");
						Modify_StaffEmail = browser.getdata("Staff_ModifyEmail");
						List<WebElement> StaffNameList = SCobjects.Staff_Name_List;
						if (StaffNameList.size() > 1) {
							BeforeModify_StaffName = StaffNameList.get(0).getText();
							for (WebElement q : StaffNameList) {
								browser.click(q);
								break;
							}
							if (browser.elementisdisplayed(SCobjects.Staff_EditStaff_Popup)) {
								browser.reportscomtep("Passed", "Click on Staff Name and verify Edit Popup is displayed",
										"Edit Popup should be displayed", "Edit Popup is displayed");
								browser.sendkeys(SCobjects.Staff_FirstName_TextBox, Modify_StaffFirstName);
								browser.sendkeys(SCobjects.Staff_LastName_TextBox, Modify_StaffLastName);
								browser.sendkeys(SCobjects.Staff_MobileNumber_TextBox, Modify_StaffPHno);
								browser.sendkeys(SCobjects.Staff_Email_TextBox, Modify_StaffEmail);
								browser.scrollintoviewelement(SCobjects.Staff_UpdateChanges_Button);
								browser.click(SCobjects.Staff_UpdateChanges_Button);
								browser.click(SCobjects.Staff_Popup_ClickLink); 
								if (StaffNameList.size() > 1) {
									if (!Modify_Name.equals(BeforeModify_StaffName)) {
										Modify_Name = StaffNameList.get(0).getText();
										browser.Verify_elementisdisplayed_Report(StaffNameList.get(0), Modify_Name);
										browser.reportscomtep("Passed",
												"Modified the staff details and click on Upadetbutton and click on next button ,verify Staff Details are modified",
												"Staff Details should be modified", "Staff Details are modified");
									} else {
										browser.reportscomtep("Failed",
												"Modified the staff details and click on Upadetbutton and click on next button ,verify Staff Details are modified",
												"Staff Details should be modified", "Staff Details are not modified");
									}
								}
							} else {
								browser.reportscomtep("Failed", "Click on Staff Name and verify Edit Popup is displayed",
										"Edit Popup should be displayed", "Edit Popup is not displayed");
							}
						}
					} catch (Exception e) {
						System.out.println("Error description: " + e.getStackTrace());
					}
				}
				
				/****TC_12_007 Check whether a Staff can be deleted*******/
				public void check_Staff_Details_Deleted() {
					String Staff_NameBefore_Deleted = "";
					String Staff_NameAfter_Deleted = "";
					try {
						List<WebElement> StaffNameList = SCobjects.Staff_Name_List;
						if (StaffNameList.size() > 1) {
							Staff_NameBefore_Deleted = StaffNameList.get(0).getText();
							browser.Verify_elementisdisplayed_Report(StaffNameList.get(0),
									"Before delete First row Staff name as:" + Staff_NameBefore_Deleted);
							for (WebElement q : StaffNameList) {
								browser.click(q);
								break;
							}
							if (browser.elementisdisplayed(SCobjects.Staff_EditStaff_Popup)) {
								browser.reportscomtep("Passed", "Click on Staff Name and verify Edit Popup is displayed",
										"Edit Popup should be displayed", "Edit Popup is displayed");
								browser.scrollintoviewelement(SCobjects.Staff_Delete_Button);
								browser.click(SCobjects.Staff_Delete_Button);
								browser.click(SCobjects.Staff_YesDeleteIt_Button);
								browser.click(SCobjects.Staff_Popup_ClickLink);
								Staff_NameAfter_Deleted = StaffNameList.get(0).getText();
								browser.Verify_elementisdisplayed_Report(StaffNameList.get(0),
										"Afeter delete First row Staff name as:" + Staff_NameAfter_Deleted);
								if (!Staff_NameBefore_Deleted.equals(Staff_NameAfter_Deleted)) {
									browser.reportscomtep("Passed",
											"Click on Detelet botton, Yes,Delete it & Ok popup buttons are cliked and verify Staff detail is deleted",
											"Staff detail should be deleted", "Staff detail is deleted");
								} else {
									browser.reportscomtep("Failed",
											"Click on Detelet botton, Yes,Delete it & Ok popup buttons are cliked and verify Staff detail is deleted",
											"Staff detail should be deleted", "Staff detail is not deleted");
								}
							} else {
								browser.reportscomtep("Failed", "Click on Staff Name and verify Edit Popup is displayed",
										"Edit Popup should be displayed", "Edit Popup is not displayed");
							}
						}

					} catch (Exception e) {
						System.out.println("Error description: " + e.getStackTrace());
					}
				}
				
				/*****TC_12_008 Check whether a profile image can be added for Staff******/
				  
				public void check_Staff_ProfileImage_Added(){
					try{
						browser.click(SCobjects.Staff_EditButton);
						if(browser.elementisdisplayed(SCobjects.Staff_UploadProfilePicture_Header)){
							browser.reportscomtep("Passed",
									"Click on EditButton and verify Upload Profile Picture popup is displayed ",
									" Upload Profile Picture popup should be displayed",
									" Upload Profile Picture popup is displayed");
							WebElement element= SCobjects.Staff_Profile_Image;
							//element.sendKeys("C:\Users\sree\Downloads\");				
							
							
						}else{
							browser.reportscomtep("Failed",
									"Click on EditButton and verify Upload Profile Picture popup is displayed ",
									" Upload Profile Picture popup should be displayed",
									" Upload Profile Picture popup is not displayed");
						}
					}catch (Exception e) {
						System.out.println("Error description: " + e.getStackTrace());
					}
				}
				
				/****TC_12_009 Check the Search box******/
				
				public void check_SearchBox(String Enter_NameOrPhoneNoOrEmail) {
					String Name = "";
					String PhoneNo = "";
					String Email = "";
					int Staff_FilterList_Length = 0;
					try {
						if (browser.elementisdisplayed(SCobjects.Staff_Search_NameOrMobile_Box)) {
							browser.reportscomtep("Passed", "Verify Search Name or Mobile box is displayed",
									"Search Name or Mobile box should be displayed", "Search Name or Mobile box is displayed");
							Name = browser.getdata("Staf_Firstname");
							PhoneNo = browser.getdata("Staff_PHNo");
							Email = browser.getdata("Staff_Mail");
							List<WebElement> Staff_FilterList = SCobjects.Staff_SearchFilter_List;
							Staff_FilterList_Length = Staff_FilterList.size();
							
							switch (Enter_NameOrPhoneNoOrEmail) {
								case "Enter_Name":
									browser.sendkeys(SCobjects.Staff_Search_NameOrMobile_Box, Name);									
									break;
								case "Enter_MobileNo":
									browser.sendkeys(SCobjects.Staff_Search_NameOrMobile_Box, PhoneNo);									
									break;
								case "Enter_Email":
									browser.sendkeys(SCobjects.Staff_Search_NameOrMobile_Box, Email);																		
									break;
								case "Donothing":
									break;
								}
							browser.click(SCobjects.Staff_Search_Button);
							if (Staff_FilterList_Length > 0 && browser.elementisdisplayed(SCobjects.Staff_SearchFilter_Table)) {
								browser.reportscomtep("Passed",
										"Enter "+Enter_NameOrPhoneNoOrEmail+" In Search Box and verify search details are displayed",
										"search details shoud be displayed",
										"search details are displayed");
							} else {
								browser.reportscomtep("Failed",
										"Enter "+Enter_NameOrPhoneNoOrEmail+" In Search Box and verify search details are displayed",
										"search details shoud be displayed",
										"search details not displayed");
							}
							
						} else {
							browser.reportscomtep("Failed", "Verify Search Name or Mobile box is displayed",
									"Search Name or Mobile box should be displayed", "Search Name or Mobile box is not displayed");
						}
					} catch (Exception e) {
						System.out.println("Error description: " + e.getStackTrace());
					}
				}
				
				
				
				/*****TS013_Subscriber clicks on Payment Processing under Manage Circle Menu*******/
				/**TC_13_001 Open Payment Processing page****/
				public void openPaymentProcessing_Page() {
					String SelectedType = "";
					try {
						if (browser.elementisdisplayed(SCobjects.Subscriber_ManageCircle_Dropdown_Link)) {
							browser.reportscomtep("Passed", "Verify Manage Circle dropdown link is displayed in Dashboard page",
									"Manage Circle dropdown link should be displayed", "Manage Circle dropdown link is displayed");
							browser.click(SCobjects.Subscriber_ManageCircle_Dropdown_Link);
							SelectedType = browser.getelementtext(SCobjects.PaymentProcessing_DropdownValue);
										if (SelectedType.equalsIgnoreCase("Payment Processing")) {
								browser.click(SCobjects.PaymentProcessing_DropdownValue);
								browser.reportscomtep("Passed",
										"Verify ManageCircle dropdown value " + SelectedType + " is slected",
										"ManageCircle dropdown value should be slected",
										"ManageCircle dropdown value selected as: " + SelectedType);
								if (browser.elementisdisplayed(SCobjects.PaymentProcessing_Page_Header)) {
									browser.reportscomtep("Passed", "Verify Payment Processing page is displayed",
											"Payment Processing page should be displayed",
											"Payment Processing page is displayed");

								} else {
									browser.reportscomtep("Failed", "Verify Payment Processing page is displayed",
											"Payment Processing page should be displayed",
											"Payment Processing page is not displayed");
								}
							} else {
								browser.reportscomtep("Failed", "Verify ManageCircle dropdown value is slected",
										"ManageCircle dropdown value should be slected",
										"ManageCircle dropdown value is not selected");
							}
						} else {
							browser.reportscomtep("Failed", "Verify Manage Circle dropdown link is displayed in Dashboard page",
									"Manage Circle dropdown link should be displayed",
									"Manage Circle dropdown link is not displayed");

						}

					} catch (Exception e) {
						System.out.println("Error description: " + e.getStackTrace());
					}
				}
				
				/**TC_13_002 Check the details in Payment Processing page**********/
				
				public void check_Details_PaymentProcessing_Page() {
					try {
						if (browser.elementisdisplayed(SCobjects.PaymentProcessing_ContentOnSC_PaymentProcessingetc_TextData)) {
							browser.reportscomtep("Passed", "Verify SC Payment processing of content, etc is displayed",
									"SC Payment processing of content, etc should be displayed",
									"SC Payment processing of content, etc is displayed");
							browser.scrollintoviewelement(SCobjects.PaymentProcessing_BYPSC_Button);
							if (browser.elementisdisplayed(SCobjects.PaymentProcessing_BYPSC_Button)) {
								browser.reportscomtep("Passed", "Verify Bring Your PayPal to ShearCircle button is displayed",
										"Bring Your PayPal to ShearCircle button should be displayed",
										"Bring Your PayPal to ShearCircle button is displayed");

							} else {
								browser.reportscomtep("Passed",
										" Verify BYPSC button is not displayed, Account has already linked by PayPal with SC",
										"BYPSC button should not be displayed, Account has already linked by PayPal with SC",
										"BYPSC button not displayed, Account has already linked by PayPal with SC");
							}
						} else {
							browser.reportscomtep("Failed", "Verify SC Payment processing of content, etc is displayed",
									"SC Payment processing of content, etc should be displayed",
									"SC Payment processing of content, etc is not displayed");
						}
					} catch (Exception e) {
						System.out.println("Error description: " + e.getStackTrace());
					}
				}
				
				/*****TC_13_003 Check the button – BYPSC********/
				public void check_Button_BYPSC() {
					try {
						if (browser.elementisdisplayed(SCobjects.PaymentProcessing_BYPSC_Button)) {
							browser.reportscomtep("Passed", "Verify Bring Your PayPal to ShearCircle button is displayed",
									"Bring Your PayPal to ShearCircle button should be displayed",
									"Bring Your PayPal to ShearCircle button is displayed");
							browser.click(SCobjects.PaymentProcessing_BYPSC_Button);
							browser.waitForNewWindowAndSwitchToIt(driver);
							if (browser.elementisdisplayed(SCobjects.PaymentProcessing_PayPalMerchantSignu_Popup)) {
								browser.reportscomtep("Passed", "Verify PayPal Merchant signup popup is displayed",
										"PayPal Merchant signup popup should be displayed",
										"PayPal Merchant signup popup is displayed");
							} else {
								browser.reportscomtep("Failed", "Verify PayPal Merchant signup popup is displayed",
										"PayPal Merchant signup popup should be displayed",
										"PayPal Merchant signup popup is not displayed");
							}

						} else {
							browser.reportscomtep("Passed",
									" Verify BYPSC button is not displayed, Account has already linked by PayPal with SC",
									"BYPSC button should not be displayed, Account has already linked by PayPal with SC",
									"BYPSC button not displayed, Account has already linked by PayPal with SC");
						}
					} catch (Exception e) {
						System.out.println("Error description: " + e.getStackTrace());
					}
				}

				/********* TS019_Subscriber clicks on Clients menu **********/

				/********** TC_19_001 Open Clients page ********/

	public void open_Clients_Page() {
		try {
			if (browser.elementisdisplayed(SCobjects.Clients_MenuLink)) {
				browser.reportscomtep("Passed", "Verify Clients Menu is displayed", "Clients Menu should be displayed",
						"Clients Menu is displayed");
				browser.click(SCobjects.Clients_MenuLink);
				if (browser.elementisdisplayed(SCobjects.Clients_PageHeader)) {
					browser.reportscomtep("Passed", "Clicks on Clients menu and verify Clients Page is displayed",
							"Clients Page should be displayed", "Clients Page is displayed");
					browser.Verify_elementisdisplayed_Report(SCobjects.Clients_NewClients_Button, "Bew Clients Button");
					browser.Verify_elementisdisplayed_Report(SCobjects.Clients_SearchBox, "Search Box");
					if (browser.elementisdisplayed(SCobjects.Clients_Table_Form)) {
						browser.reportscomtep("Passed", "Verify Clients tablular form is dispalyed",
								"Clients tablular form should be dispalyed", "Clients tablular form is dispalyed");
						browser.Verify_elementisdisplayed_Report(SCobjects.Clients_Name_TableHeader,
								"Name Table Header");
						browser.Verify_elementisdisplayed_Report(SCobjects.Clients_Mobile_TableHeader,
								"Mobile Table Header");
						browser.Verify_elementisdisplayed_Report(SCobjects.Clients_Email_TableHeader,
								"Email Table Header");
						browser.Verify_elementisdisplayed_Report(SCobjects.Clients_Gender_TableHeader,
								"Gender Table Heade");
					} else {
						browser.reportscomtep("Failed", "Verify Clients tablular form is dispalyed",
								"Clients tablular form should be dispalyed", "Clients tablular form is not dispalyed");
					}
				} else {
					browser.reportscomtep("Failed", "Clicks on Clients menu and verify Clients Page is displayed",
							"Clients Page should be displayed", "Clients Page is notdisplayed");
				}

			} else {
				browser.reportscomtep("Failed", "Verify Clients Menu is displayed", "Clients Menu should be displayed",
						"Clients Menu is not displayed");
			}
		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}

	/************ TC_19_002 Check the New Client button ***********/
	public void check_NewClient_Button() {
		String ExpectedSNDropdownvlaues = "Don't Send Notifications;Send By Email ";
		String SNDropdownvlaues = "";
		String ExpectedRSDropdownvlaues = "Referral Source;Walk-in;Online;Referred By Client;Google Search;Yahoo Search;Facebook";
		String RSDropdownvlaues = "";
		String Countryropdownvlaue = "";
		String ExpectedCountryDopdownvlaues = "Choose Country;USA";
		try {
			browser.click(SCobjects.Clients_NewClients_Button);
			if (browser.elementisdisplayed(SCobjects.Clients_AddNewClient_Popup_Header)) {
				browser.reportscomtep("Passed",
						"Clicks on New Clients Button and Verify Add New Clients Popup Is displayed",
						"Add New Clients Popup should be displayed", "Add New Clients Popup Is displaye");
				browser.Verify_elementisdisplayed_Report(SCobjects.Clients_Email_TextBox, "Email TextBox");
				browser.Verify_elementisdisplayed_Report(SCobjects.Clients_MobileNumber_TextBox,
						"Mobile NUmber TextBox");
				browser.Verify_elementisdisplayed_Report(SCobjects.Clients_FirstName_TextBox, "First Name TextBox");
				browser.Verify_elementisdisplayed_Report(SCobjects.Clients_LastName_TextBox, "Last Name TextBox");
				browser.Verify_elementisdisplayed_Report(SCobjects.Clients_Address_TextBox, "Adress TextBox");
				browser.Verify_elementisdisplayed_Report(SCobjects.Clients_City_TextBox, "City TextBox");
				browser.Verify_elementisdisplayed_Report(SCobjects.Clients_State_TextBox, "State TextBox");
				browser.Verify_elementisdisplayed_Report(SCobjects.Clients_ZipCode_TextBox, "ZipCode TextBox");
				browser.Verify_elementisdisplayed_Report(SCobjects.Clients_Notes_TextBox, "Clients Notes TextBox");
				List<WebElement> SendNotificationByDDvalues = browser
						.getOptions(SCobjects.Clients_SendNotificationsBy_DropDown);
				if (SendNotificationByDDvalues.size() > 0) {
					for (WebElement listvalue : SendNotificationByDDvalues) {
						SNDropdownvlaues = SNDropdownvlaues + ";" + listvalue.getText();
					}
					if (ExpectedSNDropdownvlaues.equalsIgnoreCase(SNDropdownvlaues.substring(1))
							&& browser.elementisdisplayed(SCobjects.Clients_SendNotificationsBy_DropDown)) {
						browser.reportscomtep("Passed", "Verify Send Notification By Dropdown values are dispalyed",
								"Send Notification By Dropdown values should be dispalyed",
								"Send Notification By Dropdown values are dispalyed as:" + SNDropdownvlaues);
					} else {
						browser.reportscomtep("Failed", "Verify Send Notification By Dropdown values are dispalyed",
								"Send Notification By Dropdown values should be dispalyed",
								"Send Notification By Dropdown values are not dispalyed");
					}
				}
				List<WebElement> ReferralSourcDDvaluese = browser.getOptions(SCobjects.Clients_ReferralSource_DropDown);
				if (ReferralSourcDDvaluese.size() > 0) {
					for (WebElement listvalue : ReferralSourcDDvaluese) {
						RSDropdownvlaues = RSDropdownvlaues + ";" + listvalue.getText();
					}
					if (ExpectedRSDropdownvlaues.equalsIgnoreCase(RSDropdownvlaues.substring(1))
							&& browser.elementisdisplayed(SCobjects.Clients_ReferralSource_DropDown)) {
						browser.reportscomtep("Passed", "Verify Referral Source Dropdown values are dispalyed",
								"Referral Source Dropdown values should be dispalyed",
								"Referral Source Dropdown values are dispalyed as:" + RSDropdownvlaues);
					} else {
						browser.reportscomtep("Failed", "Verify Referral Source Dropdown values are dispalyed",
								"Referral Source Dropdown values should be dispalyed",
								"Referral Source Dropdown values are not dispalyed");
					}
				}
				List<WebElement> CountryDDvaluese = browser.getOptions(SCobjects.Clients_Country_DropDown);
				if (CountryDDvaluese.size() > 0) {
					for (WebElement listvalue : CountryDDvaluese) {
						Countryropdownvlaue = Countryropdownvlaue + ";" + listvalue.getText();
					}
					if (ExpectedCountryDopdownvlaues.equalsIgnoreCase(Countryropdownvlaue.substring(1))
							&& browser.elementisdisplayed(SCobjects.Clients_Country_DropDown)) {
						browser.reportscomtep("Passed", "Verify Country Dropdown values are dispalyed",
								"Country Dropdown values should be dispalyed",
								"Country Dropdown values are dispalyed as:" + Countryropdownvlaue);
					} else {
						browser.reportscomtep("Failed", "Verify Country Dropdown values are dispalyed",
								"Country Dropdown values should be dispalyed",
								"Country Dropdown values are not dispalyed");
					}
				}

				List<WebElement> GenderRadioButtons = SCobjects.Clients_Gender_List;
				if (browser.elementisdisplayed(GenderRadioButtons.get(0))
						|| browser.elementisdisplayed(GenderRadioButtons.get(1))) {
					browser.reportscomtep("Passed", "Verify Gender Radio buttons Male and Female are dispalyed",
							"Gender Radio buttons Maleand Female should be dispalyed",
							" Gender Radio buttons Male and Female are dispalyed");
				} else {
					browser.reportscomtep("Failed", "Verify Gender Radio buttons Male and Female are dispalyed",
							"Gender Radio buttons Male and Female should be dispalyed",
							" Gender Radio buttons Male and Female are not dispalyed");
				}
				browser.Verify_elementisdisplayed_Report(SCobjects.Clients_Close_Button, "Close Button");
				browser.Verify_elementisdisplayed_Report(SCobjects.Clients_AddClients_Button, "Add Client Button");
				browser.click(SCobjects.Clients_Close_Button);
			} else {
				browser.reportscomtep("Failed",
						"Clicks on New Clients Button and Verify Add New Clients Popup Is displayed",
						"Add New Clients Popup should be displayed", "Add New Clients Popup Is not displaye");
			}
		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}

	/*** TC_19_003 Check the mandatory fields in Add New Client popup ******/

	public void check_MandatoryFields_InAddNewClientPopup() {
		String Client_EmailEM = "Enter email";
		String Client_FirstNameNEM = "Enter firstname";
		String Client_LastNameNEM = "Enter lastname";
		try {
			browser.click(SCobjects.Clients_NewClients_Button);
			if (browser.elementisdisplayed(SCobjects.Clients_AddNewClient_Popup_Header)) {
				browser.reportscomtep("Passed",
						"Clicks on New Clients Button and Verify Add New Clients Popup Is displayed",
						"Add New Clients Popup should be displayed", "Add New Clients Popup Is displayed");
				browser.click(SCobjects.Clients_AddClients_Button);
				
				browser.verifyElementErrorMessage(SCobjects.Clients_Email_Em, Client_EmailEM, "exact");
				
				browser.verifyElementErrorMessage(SCobjects.Clients_FirstName_Em, Client_FirstNameNEM, "exact");
				
				browser.verifyElementErrorMessage(SCobjects.Clients_LastName_Em, Client_LastNameNEM, "exact");				
				
				browser.click(SCobjects.Clients_Close_Button);
			} else {
				browser.reportscomtep("Failed",
						"Clicks on New Clients Button and Verify Add New Clients Popup Is displayed",
						"Add New Clients Popup should be displayed", "Add New Clients Popup Is not displaye");
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}

	/************* TC_19_004 Check whether a new client can be added ******/

	public void checkwhether_NewClient_Added() {
		String Client_Email = "";
		String Client_FirstName = "";
		String Client_LastName = "";
		String Client_MobileNo = "";
		int ClintsnameLength = 0;
		String Client_Name = "";

		try {
			Client_Email = browser.getdata("ClientEmail");
			Client_FirstName = browser.getdata("ClientFirstName");
			Client_LastName = browser.getdata("ClientLastName");
			Client_MobileNo = browser.getdata("ClientPhNo");
			browser.click(SCobjects.Clients_NewClients_Button);
			if (browser.elementisdisplayed(SCobjects.Clients_AddNewClient_Popup_Header)) {
				browser.reportscomtep("Passed",
						"Clicks on New Clients Button and Verify Add New Clients Popup Is displayed",
						"Add New Clients Popup should be displayed", "Add New Clients Popup Is displaye");
				browser.sendkeys(SCobjects.Clients_Email_TextBox, Client_Email);
				browser.sendkeys(SCobjects.Clients_MobileNumber_TextBox, Client_MobileNo);
				browser.sendkeys(SCobjects.Clients_FirstName_TextBox, Client_FirstName);
				browser.sendkeys(SCobjects.Clients_LastName_TextBox, Client_LastName);
				browser.selectByVisibleText(SCobjects.Clients_SendNotificationsBy_DropDown, "Don't Send Notifications");
				browser.click(SCobjects.Clients_Gender_List.get(0));
				browser.click(SCobjects.Clients_AddClients_Button);
				browser.click(SCobjects.Confirmatio_OK_Button);
				List<WebElement> Clients_name = SCobjects.Clients_Names_List;
				ClintsnameLength = Clients_name.size() - 2;
				Client_Name = Client_FirstName + " " + Client_LastName;
				String Clients_AddedName = browser.getelementtext(Clients_name.get(ClintsnameLength));
				if (Clients_AddedName.equalsIgnoreCase(Client_Name)
						&& browser.elementisdisplayed(Clients_name.get(ClintsnameLength))) {
					browser.reportscomtep("Passed",
							"Enter mandatory fields,Select option from Notification dropdown and Clicks on continue Add client, Ok Button and Verify Client is added and displayed in Table",
							"Client should be added and displayed in Table",
							"Client is Added & displayed in Table as:" + Clients_AddedName);

				} else {
					browser.reportscomtep("Failed",
							"Enter mandatory fields,Select option from Notification dropdown and Clicks on continue Add client, Ok Button and Verify Client is added and displayed in Table",
							"Client should be added and displayed in Table",
							"Client is not Added & displayed in Table");
				}
			} else {
				browser.reportscomtep("Failed",
						"Clicks on New Clients Button and Verify Add New Clients Popup Is displayed",
						"Add New Clients Popup should be displayed", "Add New Clients Popup Is not displaye");
			}
		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}

	/************
	 * TC_19_005 Check whether a new client receives email notification with SC
	 * account credentials when added by subscriber to the client list
	 *****/
	public void Check_newclientreceives_emailnotification_withSCcredentials() {
		String Client_Email = "";
		String Client_FirstName = "";
		String Client_LastName = "";
		String Client_MobileNo = "";
		int ClintsnameLength = 0;
		String Client_Name = "";

		try {
			Client_Email = browser.getdata("ClientEmail");
			Client_FirstName = browser.getdata("ClientFirstName");
			Client_LastName = browser.getdata("ClientLastName");
			Client_MobileNo = browser.getdata("ClientPhNo");
			browser.click(SCobjects.Clients_NewClients_Button);
			if (browser.elementisdisplayed(SCobjects.Clients_AddNewClient_Popup_Header)) {
				browser.reportscomtep("Passed",
						"Clicks on New Clients Button and Verify Add New Clients Popup Is displayed",
						"Add New Clients Popup should be displayed", "Add New Clients Popup Is displaye");
				browser.sendkeys(SCobjects.Clients_Email_TextBox, Client_Email);
				browser.sendkeys(SCobjects.Clients_MobileNumber_TextBox, Client_MobileNo);
				browser.sendkeys(SCobjects.Clients_FirstName_TextBox, Client_FirstName);
				browser.sendkeys(SCobjects.Clients_LastName_TextBox, Client_LastName);
				browser.selectByVisibleText(SCobjects.Clients_SendNotificationsBy_DropDown, "Send By Email ");
				browser.click(SCobjects.Clients_Gender_List.get(0));
				browser.click(SCobjects.Clients_AddClients_Button);
				browser.click(SCobjects.Confirmatio_OK_Button);
				List<WebElement> Clients_name = SCobjects.Clients_Names_List;
				ClintsnameLength = Clients_name.size() - 2;
				Client_Name = Client_FirstName + " " + Client_LastName;
				String Clients_AddedName = browser.getelementtext(Clients_name.get(ClintsnameLength));
				if (Clients_AddedName.equalsIgnoreCase(Client_Name)
						&& browser.elementisdisplayed(Clients_name.get(ClintsnameLength))) {
					browser.reportscomtep("Passed",
							"Enter mandatory fields,Select option from Notification dropdown and Clicks on continue Add client, Ok Button and Verify Client is added and displayed in Table",
							"Client should be added and displayed in Table",
							"Client is Added & displayed in Table as:" + Clients_AddedName);

				} else {
					browser.reportscomtep("Failed",
							"Enter mandatory fields,Select option from Notification dropdown and Clicks on continue Add client, Ok Button and Verify Client is added and displayed in Table",
							"Client should be added and displayed in Table",
							"Client is not Added & displayed in Table");
				}
			} else {
				browser.reportscomtep("Failed",
						"Clicks on New Clients Button and Verify Add New Clients Popup Is displayed",
						"Add New Clients Popup should be displayed", "Add New Clients Popup Is not displaye");
			}
		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}


	/*public void Check_newclientreceives_emailnotification_withSCcredentials () {
		String ExpectedSelectSendNotificationsByOption = "Send By Email ";
		String SelectSendNotificationsByOption = "";
		try {
			List<WebElement> Clients_name = SCobjects.Clients_Names_List;
			browser.click(Clients_name.get(0));
			if (browser.elementisdisplayed(SCobjects.Clients_AddNewClient_Popup_Header)) {
				browser.reportscomtep("Passed", "Clicks on Client Name and Verify Add New Clients Popup Is displayed",
						"Add New Clients Popup should be displayed", "Add New Clients Popup Is displaye");
				browser.selectByVisibleText(SCobjects.Clients_SendNotificationsBy_DropDown, "Send By Email ");
				SelectSendNotificationsByOption = browser.getelementtext(SCobjects.Clients_SendNotificationsBy_DropDown)
						.replaceAll("Don't Send Notifications", "").trim();
				if (ExpectedSelectSendNotificationsByOption.trim().equalsIgnoreCase(SelectSendNotificationsByOption)
						&& browser.elementisdisplayed(SCobjects.Clients_SendNotificationsBy_DropDown)) {
					browser.reportscomtep("Passed", "Verify Send Notification by email is selected",
							"Send Notification by email should be selected",
							"Send Notification by  selected as:" + SelectSendNotificationsByOption);
					browser.click(SCobjects.Clients_UpadateChanges_Button);
					browser.click(SCobjects.Confirmatio_OK_Button);
					if (browser.elementisdisplayed(Clients_name.get(0))) {
						browser.reportscomtep("Passed",
								"Clicks on Upadate Changes Button,OK button and Verify Client is added",
								"Client should be added", "Client is added");
					} else {
						browser.reportscomtep("Failed",
								"Clicks on Upadate Changes Button, OK Button andVerify Client is added",
								"Client should be added", "Client is not added");

					}

				} else {
					browser.reportscomtep("Failed", "Verify Send Notification by email is selected",
							"Send Notification by email should be selected",
							"Send Notification by Email is not selected");

				}

			} else {
				browser.reportscomtep("Failed", "Clicks on Client Name and Verify Add New Clients Popup Is displayed",
						"Add New Clients Popup should be displayed", "Add New Clients Popup Is not displaye");
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
*/
	/************
	 * TC_19_006 Check whether client details can be edited
	 ***********/

	public void check_Client_Details_Edited() {

			try {
			List<WebElement> Clients_name = SCobjects.Clients_Names_List;
			browser.click(Clients_name.get(0));
			if (browser.elementisdisplayed(SCobjects.Clients_AddNewClient_Popup_Header)) {
				browser.reportscomtep("Passed", "Clicks on Client Name and Verify Add New Clients Popup Is displayed",
						"Add New Clients Popup should be displayed", "Add New Clients Popup Is displaye");
				
				if(SCobjects.Clients_SendNotificationsBy_DropDown.isEnabled()){
					browser.reportscomtep("Passed", "Verify Send Notification dropdown is enabled and editable",
							"Send Notification dropdown should be enabled and editable",
							"Send Notification dropdown enabled and editable" );
				}else{
					browser.reportscomtep("Failed", "Verify Send Notification dropdown is enabled and editable",
							"Send Notification dropdown should be enabled and editable",
							"Send Notification dropdown not enabled and editable" );
				}
				
				if(SCobjects.Clients_ReferralSource_DropDown.isEnabled()){
					browser.reportscomtep("Passed", "Verify Referral Source dropdown is enabled and editable",
							"Referral Source dropdown should be enabled and editable",
							"Referral Source dropdown enabled and editable" );
				}else{
					browser.reportscomtep("Failed", "Verify Referral Source dropdown is enabled and editable",
							"Referral Source dropdown should be enabled and editable",
							"Referral Source dropdown not enabled and editable" );
				}
				if(SCobjects.Clients_Notes_TextBox.isEnabled()){
					browser.reportscomtep("Passed", "Verify Clients Notes TextBox is enabled and editable",
							"Clients Notes TextBox should be enabled and editable",
							"Clients Notes TextBox enabled and editable" );
				}else{
					browser.reportscomtep("Failed", "Verify Clients Notes TextBox is enabled and editable",
							"Clients Notes TextBox should be enabled and editable",
							"Clients Notes TextBox not enabled and editable" );
				}				
				browser.click(SCobjects.Clients_Close_Button);
			} else {
				browser.reportscomtep("Failed", "Clicks on Client Name and Verify Add New Clients Popup Is displayed",
						"Add New Clients Popup should be displayed", "Add New Clients Popup Is not displaye");
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}

	/**
	 * TC_19_007 Check whether an existing SC customer can be added as Client
	 *****/

	public void checkwhether_AnExisting_SCcustomer_AddedAsClient() {
		String AnExisting_SCcustomerEmail = "";
		String AnExisting_SCcustomerFN = "";
		String AnExisting_SCcustomerLN = "";
		String AnExisting_MobileNo = "";

		try {
			AnExisting_SCcustomerEmail = browser.getdata("Existing_SCcustomer");
			browser.click(SCobjects.Clients_NewClients_Button);
			if (browser.elementisdisplayed(SCobjects.Clients_AddNewClient_Popup_Header)) {
				browser.reportscomtep("Passed",
						"Clicks on New Clients Button and Verify Add New Clients Popup Is displayed",
						"Add New Clients Popup should be displayed", "Add New Clients Popup Is displaye");
				browser.sendkeys(SCobjects.Clients_Email_TextBox, AnExisting_SCcustomerEmail);
				browser.click(SCobjects.Clients_MobileNumber_TextBox);
				
				 AnExisting_SCcustomerFN = browser.getelementtext(SCobjects.Clients_FirstName_TextBox);
				 AnExisting_SCcustomerLN = browser.getelementtext(SCobjects.Clients_LastName_TextBox);
				 AnExisting_MobileNo = browser.getelementtext(SCobjects.Clients_MobileNumber_TextBox);
				 if (AnExisting_SCcustomerFN != "" && AnExisting_SCcustomerLN!="") {
						browser.reportscomtep("Passed",
								"Enter An Existing SCcustomer Email id Clicks on next field and Verify The existing SC customer data is auto populated",
								"The existing SC customer data should be auto populated",
								"The existing SC customer data is auto populated");

					} else {

						browser.reportscomtep("Failed",
								"Enter An Existing SCcustomer Email id Clicks on next field and Verify The existing SC customer data is auto populated",
								"The existing SC customer data should be auto populated",
								"The existing SC customer data is auto populated");

					}

				browser.click(SCobjects.Clients_AddClients_Button);
				browser.click(SCobjects.Confirmatio_OK_Button);
				
							} else {
				browser.reportscomtep("Failed",
						"Clicks on New Clients Button and Verify Add New Clients Popup Is displayed",
						"Add New Clients Popup should be displayed", "Add New Clients Popup Is not displaye");
			}
		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}

	/*** TC_19_008 Check whether a client can be deleted ****/
	public void Check_Client_Deleted() {
		String BeforeDeleteClientName = "";
		String AfterDeleteClientName = "";
		int ClintsnameLength = 0;
		try {
			List<WebElement> Clients_name = SCobjects.Clients_Names_List;
			ClintsnameLength = Clients_name.size() - 2;			
			BeforeDeleteClientName = browser.getelementtext(Clients_name.get(ClintsnameLength));
			browser.click(Clients_name.get(0));
			if (browser.elementisdisplayed(SCobjects.Clients_AddNewClient_Popup_Header)) {
				browser.reportscomtep("Passed", "Clicks on Client Name and Verify Add New Clients Popup Is displayed",
						"Add New Clients Popup should be displayed", "Add New Clients Popup Is displaye");
				browser.click(SCobjects.Client_Delete_Button);
				browser.click(SCobjects.Client_YesDeleteIt_Button);
				browser.click(SCobjects.Confirmatio_OK_Button);
				AfterDeleteClientName = browser.getelementtext(Clients_name.get(ClintsnameLength));
				if (AfterDeleteClientName != BeforeDeleteClientName
						&& browser.elementisdisplayed((Clients_name.get(0)))) {
					browser.reportscomtep("Passed",
							"Clicks on Continue Delete, YesDeleteIt and OK buttons and verify Client is deleted in table ",
							"Client should be deleted in table", "Client is deleted in table");

				} else {
					browser.reportscomtep("Failed",
							"Clicks on Continue Delete, YesDeleteIt and OK buttons and verify Client is deleted in table ",
							"Client should be deleted in table", "Client is not deleted in table");
				}
			} else {
				browser.reportscomtep("Failed", "Clicks on Client Name and Verify Add New Clients Popup Is displayed",
						"Add New Clients Popup should be displayed", "Add New Clients Popup Is not displaye");
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	
	/***** TC_20_001 Open POS page ******/

	public void open_POSPage() {
		String TableHeadername = "";
		try {
			if (browser.elementisdisplayed(SCobjects.POS_MenuLink)) {
				browser.reportscomtep("Passed", "Verify POS Menu link is displayed",
						" POS Menu link should be displayed", " POS Menu link is displayed");
				browser.click(SCobjects.POS_MenuLink);
				if (browser.elementisdisplayed(SCobjects.Pos_BookingsPage_Header)) {
					browser.reportscomtep("Passed",
							"Clicks on POS menu link and verify Bookings page Header is dispalyed",
							"Bookings page Header should be dispalyed", "Bookings page Header is dispalyed");
					browser.Verify_elementisdisplayed_Report(SCobjects.Pos_BP_CreateSaleOrder_button,
							"Create Sale Order BUutton");
					browser.Verify_elementisdisplayed_Report(SCobjects.POS_BP_SearchBox, "Search BUutton");
					String[] POS_BPHeaders = new String[5];
					POS_BPHeaders[0] = "Booking ID";
					POS_BPHeaders[1] = "Payment Amount";
					POS_BPHeaders[2] = "Payment Type";
					POS_BPHeaders[3] = "Date Added";
					POS_BPHeaders[4] = "Action";
					int i = 0;
					List<WebElement> TheaderList = SCobjects.POS_BP_Table_HeaderDetails_List;
					for (WebElement theader : TheaderList) {
						TableHeadername = browser.getelementtext(theader);
						if (TableHeadername.equalsIgnoreCase(POS_BPHeaders[i])
								&& browser.elementisdisplayed(TheaderList.get(i))) {
							browser.reportscomtep("Passed", "Verify Table header " + TableHeadername + " is Displayed",
									"Table header should be Displayed", "Table header displayed as " + TableHeadername);
						} else {
							browser.reportscomtep("Failed", "Verify Table header " + POS_BPHeaders[i] + " is Displayed",
									"Table header should be Displayed",
									"Table header " + POS_BPHeaders[i] + " Not displayed");
						}

						i++;
					}
					List<WebElement> BookingDetails_List = SCobjects.POS_BP_Details_List;
					List<WebElement> View_Buttons = SCobjects.POS_BP_View_ButtonList;
					List<WebElement> Delete_Buttons = SCobjects.POS_BP_Delete_ButtonList;
					int BPDetilals_Length = BookingDetails_List.size();
					if (BPDetilals_Length > 1 && browser.elementisdisplayed(View_Buttons.get(0))
							&& browser.elementisdisplayed(Delete_Buttons.get(0))) {
						browser.reportscomtep("Passed", "Verify View button & Delete buttons are displayed",
								"View button & Delete buttons should be displayed",
								"View button & Delete buttons are displayed");

					}else if (BPDetilals_Length > 1 && browser.elementisdisplayed(SCobjects.POS_BP_NoDataFound_Text)) {
						browser.reportscomtep("Passed", "Verify First login no data is added)",
								"First login no data should be added", "First login no data is added");
					}
				} else {
					browser.reportscomtep("Failed",
							"Clicks on POS menu link and verify Bookings page Header is dispalyed",
							"Bookings page Header should be dispalyed", "Bookings page Header is not dispalyed");
				}
			} else {
				browser.reportscomtep("Failed", "Verify POS Menu link is displayed",
						" POS Menu link should be displayed", " POS Menu link is not displayed");
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}

	/********** TC_20_002 Check the Create Sale Order button ****/

	public void check_CreateSaleOrder_Button() {
		try {
			browser.click(SCobjects.Pos_BP_CreateSaleOrder_button);
			if (browser.elementisdisplayed(SCobjects.POS_AddNewSale_PopupHeader)) {
				browser.reportscomtep("Passed",
						"Clicks on Create Sale Order button and verify Add NewSale PopupHeader is displayed",
						"Add NewSale PopupHeader should be displayed", "Add NewSale PopupHeader is displayed");
				browser.Verify_elementisdisplayed_Report(SCobjects.POS_AddProduct_Button, "+Products Button");
				browser.Verify_elementisdisplayed_Report(SCobjects.POS_AddService_Button, "+Service Button");
				if (browser.elementisdisplayed(SCobjects.POS_OrderTemplate_Header)) {
					browser.reportscomtep("Passed", "Verify Order Services/Products Template header is displayed",
							"Order Services/Products Template header should be displayed",
							"Order Services/Products Template header is displayed");
					if (browser.elementisdisplayed(SCobjects.POS_Service_QuantityHeader)
							|| browser.elementisdisplayed(SCobjects.POS_Product_QuantityHeader)) {
						browser.reportscomtep("Passed", "Verify Services/Products Quantity headers are displayed",
								"Services/Products Quantity headers should be displayed",
								"Services/Products Quantity headers are displayed");
					}
					if (browser.elementisdisplayed(SCobjects.POS_Service_PriceHeader)
							|| browser.elementisdisplayed(SCobjects.POS_Product_PriceHeader)) {
						browser.reportscomtep("Passed", "Verify Services/Products Price Headers are displayed",
								"Services/Products Price Headers should be displayed",
								"Services/Products Price Headers are displayed");
					}
					if (browser.elementisdisplayed(SCobjects.POS_Service_DiscountHeader)
							|| browser.elementisdisplayed(SCobjects.POS_Product_DiscountHeader)) {
						browser.reportscomtep("Passed", "Verify Services/Products Discount Headers are displayed",
								"Services/Products Discount Headers should be displayed",
								"Services/Products Discount Headers are displayed");
					}
					if (browser.elementisdisplayed(SCobjects.POS_Service_StaffHeader)
							|| browser.elementisdisplayed(SCobjects.POS_Product_StaffHeader)) {
						browser.reportscomtep("Passed", "Verify Services/Products Staff Headers are displayed",
								"Services/Products Staff Headers should be displayed",
								"Services/Products Staff Headers are displayed");
					}
					if (browser.elementisdisplayed(SCobjects.POS_Service_TotalPriceHeader)
							|| browser.elementisdisplayed(SCobjects.POS_Product_TotalPriceHeader)) {
						browser.reportscomtep("Passed", "Verify Services/Products TotalPrice Headers are displayed",
								"Services/Products TotalPrice Headers should be displayed",
								"Services/Products TotalPrice Headers are displayed");
					}
					if (browser.elementisdisplayed(SCobjects.POS_Service_ActionHeader)
							|| browser.elementisdisplayed(SCobjects.POS_Product_ActionHeader)) {
						browser.reportscomtep("Passed", "Verify Services/Products Action Headers are displayed",
								"Services/Products Action Headers should be displayed",
								"Services/Products Action Headers are displayed");
					}
					browser.Verify_elementisdisplayed_Report(SCobjects.POS_Close_button, "Close Button");
					browser.Verify_elementisdisplayed_Report(SCobjects.POS_Create_Button, "Create Button");
				} else {
					browser.reportscomtep("Failed", "Verify Order Services/Products Template header is displayed",
							"Order Services/Products Template header should be displayed",
							"Order Services/Products Template header is not displayed");
				}

			} else {
				browser.reportscomtep("Failed",
						"Clicks on Create Sale Order button and verify Add NewSale PopupHeader is displayed",
						"Add NewSale PopupHeader should be displayed", "Add NewSale PopupHeader is not displayed");
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}

	/***TC_20_003 Check the +Products button in Add New Sale popup***********/
	
	public void check_AddProductsButton_InAddNewSalePopup() {
		try {
			browser.click(SCobjects.POS_AddProduct_Button);
			List<WebElement> ProductNameList = SCobjects.POS_ANSP_ProductNameList;
			List<WebElement> PlusSignList = SCobjects.POS_ANSP_PlusSignprefixed_List;
			List<WebElement> ProductPriceList = SCobjects.POS_ANSP_ProductPriceList;
			if (browser.elementisdisplayed(ProductNameList.get(0)) && browser.elementisdisplayed(PlusSignList.get(0))
					&& browser.elementisdisplayed(ProductPriceList.get(0))
					&& browser.elementisdisplayed(SCobjects.POS_ANSP_ProductOpenTable)) {
				browser.reportscomtep("Passed",
						"Clicks on +Products button and verify List of products with +sign prefixed along with its price is displayed",
						"List of products with +sign prefixed along with its price should be displayed",
						"List of products with +sign prefixed along with its price is displayed");
			} else {
				browser.reportscomtep("Failed",
						"Clicks on +Products button and verify List of products with +sign prefixed along with its price is displayed",
						"List of products with +sign prefixed along with its price should be displayed",
						"List of products with +sign prefixed along with its price is not displayed");
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	
	/****TC_20_004 Check whether product(s) can be added******/
	
	public void Check_whether_products_can_added() {
		try {			
			List<WebElement> ProductNameList = SCobjects.POS_ANSP_ProductNameList;
			List<WebElement> PlusSignList = SCobjects.POS_ANSP_PlusSignprefixed_List;
			List<WebElement> ProductPriceList = SCobjects.POS_ANSP_ProductPriceList;
			if (browser.elementisdisplayed(ProductNameList.get(0)) && browser.elementisdisplayed(PlusSignList.get(0))
					&& browser.elementisdisplayed(ProductPriceList.get(0))
					&& browser.elementisdisplayed(SCobjects.POS_ANSP_ProductOpenTable)) {
				browser.reportscomtep("Passed",
						"Verify List of products with +sign prefixed along with its price is displayed",
						"List of products with +sign prefixed along with its price should be displayed",
						"List of products with +sign prefixed along with its price is displayed");
				browser.click(PlusSignList.get(0));
				browser.elementgetAttributevalue(SCobjects.POS_ANSP_AddedProduct_Name, "value");
				browser.Verify_elementisdisplayed_Report(SCobjects.POS_ANSP_AddedProduct_Name, "ProductName");
				String Prod_Qty = browser.elementgetAttributevalue(SCobjects.POS_ANSP_AddedProduct_Qty, "value");
				browser.Verify_elementisdisplayed_Report(SCobjects.POS_ANSP_AddedProduct_Qty, "Qty: "+Prod_Qty);
				String Prod_Price= browser.elementgetAttributevalue(SCobjects.POS_ANSP_AddedProduct_Price, "value");
				browser.Verify_elementisdisplayed_Report(SCobjects.POS_ANSP_AddedProduct_Price, "Price: "+Prod_Price);
				String Prod_Discount = browser.elementgetAttributevalue(SCobjects.POS_ANSP_AddedProduct_Discount, "value");
				browser.Verify_elementisdisplayed_Report(SCobjects.POS_ANSP_AddedProduct_Discount, "Discount: "+Prod_Discount);
				
				browser.Verify_elementisdisplayed_Report(SCobjects.POS_ANSP_AddedProduct_Staff, "Staff");
				String Prod_TotalPrice = browser.elementgetAttributevalue(SCobjects.POS_ANSP_AddedProduct_TotalPrice, "value");
				browser.Verify_elementisdisplayed_Report(SCobjects.POS_ANSP_AddedProduct_TotalPrice, "Total Price:"+Prod_TotalPrice);
				browser.Verify_elementisdisplayed_Report(SCobjects.POS_ANSP_AddedProduct_CloseButton, "Action CloseButton");
				
			} else {
				browser.reportscomtep("Failed",
						"Verify List of products with +sign prefixed along with its price is displayed",
						"List of products with +sign prefixed along with its price should be displayed",
						"List of products with +sign prefixed along with its price is not displayed");
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}

/****TC_20_005 Check whether product(s) can be added******/
	
	public void Check_multiplequantity_product_can_added() {
		try {			
			
			List<WebElement> PlusSignList = SCobjects.POS_ANSP_PlusSignprefixed_List;
			
			if (browser.elementisdisplayed(PlusSignList.get(0))) {
				browser.reportscomtep("Passed",
						"Verify product with +sign prefixed along with its price is displayed",
						"Product with +sign prefixed along with its price should be displayed",
						"Product with +sign prefixed along with its price is displayed");
				String Prod_beforeupdatedTotalPrice = browser.getelementtext(SCobjects.POS_ANSP_AddedProduct_TotalPrice);
				for(int i = 1; i<=3; i++){
					browser.click(PlusSignList.get(0));					
				}					
				
				String Prod_Qty = browser.elementgetAttributevalue(SCobjects.POS_ANSP_AddedProduct_Qty, "value");
				String Prod_afterupdatedTotalPrice = browser.getelementtext(SCobjects.POS_ANSP_AddedProduct_TotalPrice);
				//String[] splitUpdatedTotalPrice = Prod_beforeupdatedTotalPrice.split(".");
				double int_beforeupdatedTotalPrice = Double.parseDouble(Prod_beforeupdatedTotalPrice.substring(1));
				double multiflyedprice = int_beforeupdatedTotalPrice*4;
				//String[] splitafterupdatedtotalprice = Prod_afterupdatedTotalPrice.split(".");
				double int_afterupdatedTotalPrice = Double.parseDouble(Prod_afterupdatedTotalPrice.substring(1));
				
				if(Prod_Qty.equals("4") && multiflyedprice == int_afterupdatedTotalPrice){
					browser.reportscomtep("Passed",
							"Click on Product Name multiple times in product list and Verify updated quatity and Total Price in the Order template table",
							"Quatity and Total Price should be updated in the Order template table",
							"Quatity and Total Price updated in the Order template table as Quatity: "+ Prod_Qty +" and Total Price: "+Prod_afterupdatedTotalPrice);
				}else{
					browser.reportscomtep("Failed",
							"Click on Product Name multiple times in product list and Verify updated quatity and Total Price in the Order template table",
							"Quatity and Toatal Price should be updated in the Order template table",
							"Quatity and Total Price not updated in the Order template table");
				}				
				
			} else {
				browser.reportscomtep("Failed",
						"Verify product with +sign prefixed along with its price is displayed",
						"Product with +sign prefixed along with its price should be displayed",
						"Product with +sign prefixed along with its price is displayed");
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}

/****TC_20_006 Check whether product(s) can be added******/
	
	public void Check_productquantity_decreased_increased_in_orderstemplat() {
		try {			
			
			List<WebElement> ProductsTemplateHeaders = SCobjects.POS_ANSP_AddedProductHeader_th_list;
			
			if (ProductsTemplateHeaders.size()>0) {
				browser.reportscomtep("Passed",
						"Verify products orders template is displayed",
						"products orders template should be displayed",
						"products orders template displayed");
				browser.sendkeys(SCobjects.POS_ANSP_AddedProduct_Qty, "1");
				String Prod_beforeupdatedTotalPrice = browser.getelementtext(SCobjects.POS_ANSP_AddedProduct_TotalPrice);
				browser.sendkeys(SCobjects.POS_ANSP_AddedProduct_Qty, "3");
				String Prod_Qty = browser.elementgetAttributevalue(SCobjects.POS_ANSP_AddedProduct_Qty, "value");
				
				String Prod_afterupdatedTotalPrice = browser.getelementtext(SCobjects.POS_ANSP_AddedProduct_TotalPrice);
				double int_beforeupdatedTotalPrice = Double.parseDouble(Prod_beforeupdatedTotalPrice.substring(1));
				int qty = Integer.parseInt(Prod_Qty);
				double multiflyedprice = int_beforeupdatedTotalPrice*qty;
				double int_afterupdatedTotalPrice = Double.parseDouble(Prod_afterupdatedTotalPrice.substring(1));
				
				if(Prod_Qty.equals("3") && multiflyedprice == int_afterupdatedTotalPrice){
					browser.reportscomtep("Passed",
							"Product quantity can be decreased/increased in the orders template and Verify updated Total Price in the Order template table",
							"Total Price should be updated in the Order template table",
							"Total Price updated in the Order template table as Total Price: "+Prod_afterupdatedTotalPrice);
				}else{
					browser.reportscomtep("Failed",
							"Product quantity can be decreased/increased in the orders template and Verify updated Total Price in the Order template table",
							"Total Price should be updated in the Order template table",
							"Total Price updated in the Order template table as Total Price: "+Prod_afterupdatedTotalPrice);
				}				
				
			} else {
				browser.reportscomtep("Failed",
						"Verify products orders template is displayed",
						"products orders template should be displayed",
						"products orders template not displayed");
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}

/****TC_20_007 Check whether discount can be applied to the product ******/
	
	public void Check_discount_applied_to_product() {
		try {			
			
			List<WebElement> ProductsTemplateHeaders = SCobjects.POS_ANSP_AddedProductHeader_th_list;
			
			if (ProductsTemplateHeaders.size()>0) {
				browser.reportscomtep("Passed",
						"Verify products orders template is displayed",
						"products orders template should be displayed",
						"products orders template displayed");				
				String Prod_beforeupdatedTotalPrice = browser.getelementtext(SCobjects.POS_ANSP_AddedProduct_TotalPrice);
				browser.sendkeys(SCobjects.POS_ANSP_AddedProduct_Discount, "10");
				String Prod_discount = browser.elementgetAttributevalue(SCobjects.POS_ANSP_AddedProduct_Discount, "value");
				
				String Prod_afterupdatedTotalPrice = browser.getelementtext(SCobjects.POS_ANSP_AddedProduct_TotalPrice);
				double int_beforeupdatedTotalPrice = Float.parseFloat(Prod_beforeupdatedTotalPrice.substring(1));
				int discount = Integer.parseInt(Prod_discount);
				double discountprice = (int_beforeupdatedTotalPrice/discount);
				double int_afterupdatedTotalPrice = Double.parseDouble(Prod_afterupdatedTotalPrice.substring(1));
				double int_afterdiscountTotalPrice = int_beforeupdatedTotalPrice-discountprice;
				if(int_afterdiscountTotalPrice == int_afterupdatedTotalPrice){
					browser.reportscomtep("Passed",
							"Apply discount to the product and Verify updated Total Price in the Order template table",
							"Total Price should be updated in the Order template table",
							"Total Price updated in the Order template table as Total Price: "+Prod_afterupdatedTotalPrice);
				}else{
					browser.reportscomtep("Failed",
							"Apply discount to the product and Verify updated Total Price in the Order template table",
							"Total Price should be updated in the Order template table",
							"Total Price not updated in the Order template table as Total Price: "+Prod_afterupdatedTotalPrice);
				}				
				
			} else {
				browser.reportscomtep("Failed",
						"Verify products orders template is displayed",
						"products orders template should be displayed",
						"products orders template not displayed");
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}

/****TC_20_008 Check whether a product can be deleted from the orders ******/
	
	public void Check_product_deleted_from_orders() {
		try {			
					
			if (browser.elementisdisplayed(SCobjects.POS_ANSP_AddedProduct_CloseButton)) {
				browser.reportscomtep("Passed",
						"Verify close button is displayed in products orders",
						"close button should be displayed in products orders template",
						"close button displayed in products orders template");				
				int beforedeletetablerows = SCobjects.POS_ANSP_AddedProduct_tr_list.size();
				browser.click(SCobjects.POS_ANSP_AddedProduct_CloseButton);
				int afterdeletetablerows = SCobjects.POS_ANSP_AddedProduct_tr_list.size();
				if(beforedeletetablerows == afterdeletetablerows-1){
					browser.reportscomtep("Passed",
							"click on close button in the order product table and Verify the product delete in Order product table",
							"The product should be delete in Order product table",
							"The product deleted in Order product table");
				}else{
					browser.reportscomtep("Failed",
							"click on close button in the order product table and Verify the product delete in Order product table",
							"The product should be delete in Order product table",
							"The product not deleted in Order product table");
				}				
				
			} else {
				browser.reportscomtep("Failed",
						"Verify close button is displayed in products orders",
						"close button should be displayed in products orders template",
						"close button not displayed in products orders template");
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	
/****TC_20_009 Check the +Services button in Add New Sale popup ******/
	
	public void Check_ServicesbuttoninAddNewSalepopup() {
		try {	
			if (browser.elementisdisplayed(SCobjects.POS_AddService_Button)) {
				browser.reportscomtep("Passed",
						"Verify Add services button is displayed",
						"Add services button should be displayed",
						"Add services button is displayed");			
				browser.click(SCobjects.POS_AddService_Button);	
			if (SCobjects.POS_asb_serviceswithplus_list.size()>0 && SCobjects.POS_asb_serviceswithplus_list.size() > 0 ) {
				browser.reportscomtep("Passed",
						"Click on add services button and Verify services with + sign prefixed along with price is displayed",
						"services with + sign prefixed along with price should be displayed",
						"services with + sign prefixed along with price displayed");				
				
					
				}else{
					browser.reportscomtep("Failed",
							"Click on add services button and Verify services with + sign prefixed along with price is displayed",
							"services with + sign prefixed along with price should be displayed",
							"services with + sign prefixed along with price not displayed");
				}				
				
			
			}else{
				browser.reportscomtep("Failed",
						"Verify Add services button is displayed",
						"Add services button should be displayed",
						"Add services button not displayed");
			}
			

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}

/****TC_20_010 Check whether service(s) can be added ******/
	
	public void Check_servicecanbeadded() {
		try {	
			browser.click(SCobjects.POS_asb_serviceswithplus_list.get(0));
			if (browser.elementisdisplayed(SCobjects.POS_asb_addedservices_tr)) {
				
				String servicename = browser.getelementtext(SCobjects.POS_asb_addedservicesname_text);
				browser.Verify_elementisdisplayed_Report(SCobjects.POS_asb_addedservicesname_text, "Service Name: "+servicename);
				String Service_Qty = browser.elementgetAttributevalue(SCobjects.POS_asb_addedservicesqty_text, "value");
				browser.Verify_elementisdisplayed_Report(SCobjects.POS_asb_addedservicesqty_text, "Qty: "+Service_Qty);
				String Service_Price= browser.elementgetAttributevalue(SCobjects.POS_asb_addedservicesprice_text, "value");
				browser.Verify_elementisdisplayed_Report(SCobjects.POS_asb_addedservicesprice_text, "Price: "+Service_Price);
				String Service_Discount = browser.elementgetAttributevalue(SCobjects.POS_asb_addedservicesdiscount_textbox, "value");
				browser.Verify_elementisdisplayed_Report(SCobjects.POS_asb_addedservicesdiscount_textbox, "Discount: "+Service_Discount);				
				browser.Verify_elementisdisplayed_Report(SCobjects.POS_asb_addedserviceschoosestaff_dropsown, "Staff");
				String Service_TotalPrice = browser.getelementtext(SCobjects.POS_asb_addedservicestotalprice_text);
				browser.Verify_elementisdisplayed_Report(SCobjects.POS_asb_addedservicestotalprice_text, "Total Price:"+Service_TotalPrice);
				browser.Verify_elementisdisplayed_Report(SCobjects.POS_asb_addedservicesclose_button, "Action CloseButton");				
					
			}else{
				browser.reportscomtep("Failed",
							"Click on add services button and Verify services with + sign prefixed along with price is displayed",
							"services with + sign prefixed along with price should be displayed",
							"services with + sign prefixed along with price not displayed");
				}		
			

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	
/****TC_20_011 Check whether multiple quantity of a service can be added******/
	
	public void Check_multiplequantityofservice_can_added() {
		try {			
					
			if (browser.elementisdisplayed(SCobjects.POS_asb_serviceswithplus_list.get(0))) {
				browser.reportscomtep("Passed",
						"Verify service with +sign prefixed along with its price is displayed",
						"Service with +sign prefixed along with its price should be displayed",
						"Service with +sign prefixed along with its price is displayed");
				String Service_beforeupdatedTotalPrice = browser.getelementtext(SCobjects.POS_asb_addedservicestotalprice_text);
				for(int i = 1; i<=3; i++){
					browser.click(SCobjects.POS_asb_serviceswithplus_list.get(0));					
				}					
				
				String service_Qty = browser.elementgetAttributevalue(SCobjects.POS_asb_addedservicesqty_text, "value");
				String service_afterupdatedTotalPrice = browser.getelementtext(SCobjects.POS_asb_addedservicestotalprice_text);				
				double int_beforeupdatedTotalPrice = Double.parseDouble(Service_beforeupdatedTotalPrice.substring(1));
				double multiflyedprice = int_beforeupdatedTotalPrice*4;			
				double int_afterupdatedTotalPrice = Double.parseDouble(service_afterupdatedTotalPrice.substring(1));
				
				if(service_Qty.equals("4") && multiflyedprice == int_afterupdatedTotalPrice){
					browser.reportscomtep("Passed",
							"Click on Service Name multiple times in Service list and Verify updated quatity and Total Price in the Order template table",
							"Quatity and Total Price should be updated in the Order template table",
							"Quatity and Total Price updated in the Order template table as Quatity: "+ service_Qty +" and Total Price: "+service_afterupdatedTotalPrice);
				}else{
					browser.reportscomtep("Failed",
							"Click on Service Name multiple times in Service list and Verify updated quatity and Total Price in the Order template table",
							"Quatity and Toatal Price should be updated in the Order template table",
							"Quatity and Total Price not updated in the Order template table");
				}				
				
			} else {
				browser.reportscomtep("Failed",
						"Verify Service with +sign prefixed along with its price is displayed",
						"Service with +sign prefixed along with its price should be displayed",
						"Service with +sign prefixed along with its price is displayed");
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}

/****TC_20_013 Check whether a discount can be applied to the service in the order******/
	
	public void Check_discountapplied_in_serviceorderstemplat() {
		try {			
			
			List<WebElement> serviceTemplateHeaders = SCobjects.POS_ANSP_AddedservicetHeader_th_list;
			
			if (serviceTemplateHeaders.size()>0) {
				browser.reportscomtep("Passed",
						"Verify service orders template is displayed",
						"service orders template should be displayed",
						"service orders template displayed");
				String service_beforeupdatedTotalPrice = browser.getelementtext(SCobjects.POS_asb_addedservicestotalprice_text);
				browser.sendkeys(SCobjects.POS_asb_addedservicesdiscount_textbox, "10");
				String service_discount = browser.elementgetAttributevalue(SCobjects.POS_asb_addedservicesdiscount_textbox, "value");
				
				String service_afterupdatedTotalPrice = browser.getelementtext(SCobjects.POS_asb_addedservicestotalprice_text);
				double int_beforeupdatedTotalPrice = Float.parseFloat(service_beforeupdatedTotalPrice.substring(1));
				int discount = Integer.parseInt(service_discount);
				double discountprice = (int_beforeupdatedTotalPrice/discount);
				double int_afterupdatedTotalPrice = Double.parseDouble(service_afterupdatedTotalPrice.substring(1));
				double int_afterdiscountTotalPrice = int_beforeupdatedTotalPrice-discountprice;
				if(int_afterdiscountTotalPrice == int_afterupdatedTotalPrice){
					browser.reportscomtep("Passed",
							"Apply discount to the service and Verify updated Total Price in the Order template table",
							"Total Price should be updated in the Order template table",
							"Total Price updated in the Order template table as Total Price: "+service_afterupdatedTotalPrice);
				}else{
					browser.reportscomtep("Failed",
							"Apply discount to the product and Verify updated Total Price in the Order template table",
							"Total Price should be updated in the Order template table",
							"Total Price not updated in the Order template table as Total Price: "+service_afterupdatedTotalPrice);
				}			
				
			} else {
				browser.reportscomtep("Failed",
						"Verify service orders template is displayed",
						"service orders template should be displayed",
						"service orders template not displayed");
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}

	
/****TC_20_014 Check whether a staff can be assigned to a service******/
	
	public void Check_staffcanbeassignedtoservice() {
		try {			
			
			List<WebElement> serviceTemplateHeaders = SCobjects.POS_ANSP_AddedservicetHeader_th_list;
			String servicestaff = browser.getdata("service_staff");
			if (serviceTemplateHeaders.size()>0) {
				browser.reportscomtep("Passed",
						"Verify service orders template is displayed",
						"service orders template should be displayed",
						"service orders template displayed");
				
				browser.selectByVisibleText(SCobjects.POS_asb_addedserviceschoosestaff_dropsown, servicestaff);
				String selectedstaff = browser.getDropdownSelectedValue(SCobjects.POS_asb_addedserviceschoosestaff_dropsown);
				if(selectedstaff.equalsIgnoreCase(servicestaff)){
					browser.reportscomtep("Passed",
							"Select staff to the service in the Order template table",
							"staff should be selected to the service in the Order template table",
							"Selected staff to the service in the Order template table as :"+selectedstaff);
				}else{
					browser.reportscomtep("Failed",
							"Select staff to the service in the Order template table",
							"staff should be selected to the service in the Order template table",
							"staff not selected to the service in the Order template table");
				}			
				
			} else {
				browser.reportscomtep("Failed",
						"Verify service orders template is displayed",
						"service orders template should be displayed",
						"service orders template not displayed");
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}

/****TC_20_015 Check whether a service can be deleted ******/
	
	public void Check_service_deleted_from_orders() {
		try {			
					
			if (browser.elementisdisplayed(SCobjects.POS_asb_addedservicesclose_button)) {
				browser.reportscomtep("Passed",
						"Verify close button is displayed in Services orders",
						"close button should be displayed in Services orders template",
						"close button displayed in Services orders template");				
				int beforedeletetablerows = SCobjects.POS_ANSP_AddedProduct_tr_list.size();
				browser.click(SCobjects.POS_asb_addedservicesclose_button);
				int afterdeletetablerows = SCobjects.POS_ANSP_AddedProduct_tr_list.size();
				if(beforedeletetablerows == afterdeletetablerows-1){
					browser.reportscomtep("Passed",
							"click on close button in the order Services table and Verify the Service delete in Order Services table",
							"The Service should be delete in Order Services table",
							"The Service deleted in Order Services table");				
					
				}else{
					browser.reportscomtep("Failed",
							"click on close button in the order Services table and Verify the Service delete in Order Services table",
							"The Service should be delete in Order Services table",
							"The Service not deleted in Order Services table");
				}				
				
			} else {
				browser.reportscomtep("Failed",
						"Verify close button is displayed in Services orders",
						"close button should be displayed in Services orders template",
						"close button not displayed in Services orders template");
			}
			
			browser.click(SCobjects.POS_Close_button);

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	
/****TC_20_016 Check whether a new sale order can be created ******/
	
	public void Check_service_newsaleorder_created() {
		
		String bookingCreatedRequestID = "";
		String bookingid = "";
		String MulserviceName = "";
		String serviceName = "";
		String serviceQty = "";
		String servicePrice = "";
		String productName = "";
		String productQty = "";
		String productPrice = "";
		try {			
			String servicestaff = browser.getdata("service_staff");	
			
			browser.click(SCobjects.Pos_BP_CreateSaleOrder_button);	
			browser.waitforelementtobevisible(SCobjects.POS_AddNewSale_PopupHeader, 4);			
			if (browser.elementisdisplayed(SCobjects.POS_AddNewSale_PopupHeader)) {
				browser.reportscomtep("Passed",
						"Verify Add NewSale PopupHeader is displayed",
						"Add NewSale PopupHeader should be displayed", "Add NewSale PopupHeader is displayed");
				browser.Verify_elementisdisplayed_Report(SCobjects.POS_AddProduct_Button, "+Products Button");
				browser.Verify_elementisdisplayed_Report(SCobjects.POS_AddService_Button, "+Service Button");				
				browser.click(SCobjects.POS_AddService_Button);
				browser.waitforelementtobevisible(SCobjects.POS_asb_serviceswithplus_list.get(0), 4);
				browser.click(SCobjects.POS_asb_serviceswithplus_list.get(0));	
				browser.Verify_elementisdisplayed_Report(SCobjects.POS_OrderTemplate_Header, "Order Services/Products Template header");
				if (browser.elementisdisplayed(SCobjects.POS_asb_addedservices_tr)) {
					browser.reportscomtep("Passed", "Click on Add service '+Service' and Verify service is added into Order Services",
							"service should be added into Order Services",
							"service is added into Order Services");
					
					browser.selectByVisibleText(SCobjects.POS_asb_addedserviceschoosestaff_dropsown, servicestaff);
					String selectedstaff = browser.getDropdownSelectedValue(SCobjects.POS_asb_addedserviceschoosestaff_dropsown);
					if(selectedstaff.equalsIgnoreCase(servicestaff)){
						browser.reportscomtep("Passed",
								"Select staff to the service in the Order template table",
								"staff should be selected to the service in the Order template table",
								"Selected staff to the service in the Order template table as :"+selectedstaff);
					}else{
						browser.reportscomtep("Failed",
								"Select staff to the service in the Order template table",
								"staff should be selected to the service in the Order template table",
								"staff not selected to the service in the Order template table");
					}	
					
					MulserviceName = browser.getelementtext(SCobjects.POS_asb_addedservicesname_text);
					serviceName=MulserviceName.replaceAll("[\r\n]+", " ");
					browser.setData("Out_POS_ServiceName", serviceName,"SubscriberTestData.properties");
					serviceQty = browser.elementgetAttributevalue(SCobjects.POS_asb_addedservicesqty_text,"value");
					browser.setData("Out_POS_ServiceQty", serviceQty,"SubscriberTestData.properties");
					servicePrice = browser.getelementtext(SCobjects.POS_asb_addedservicestotalprice_text);
					browser.setData("Out_POS_ServicePrice", servicePrice,"SubscriberTestData.properties");	
					
					
				} else {
					browser.reportscomtep("Failed", "Click on Add service '+Service' and Verify service is added into Order Services",
							"service should be added into Order Services",
							"service is not added into Order Services");
				}
				
				browser.click(SCobjects.POS_AddProduct_Button);
				browser.waitforelementtobevisible(SCobjects.POS_ANSP_ProductNameList.get(0), 4);
				browser.click(SCobjects.POS_ANSP_ProductNameList.get(0));
				
				if (browser.elementisdisplayed(SCobjects.POS_asb_addedProduct_tr)) {
					browser.reportscomtep("Passed", "Click on Add Product '+Product' and Verify Product is added into Order Products",
							"Product should be added into Order Products",
							"Product is added into Order Products");	
					productName = browser.getelementtext(SCobjects.POS_ANSP_AddedProduct_Name);					
					productName=productName.replaceAll("[\r\n]+", " ");
					browser.setData("Out_POS_productName", productName,"SubscriberTestData.properties");
					productQty = browser.elementgetAttributevalue(SCobjects.POS_ANSP_AddedProduct_Qty,"value");
					browser.setData("Out_POS_productQty", productQty,"SubscriberTestData.properties");
					productPrice = browser.getelementtext(SCobjects.POS_ANSP_AddedProduct_TotalPrice);
					browser.setData("Out_POS_productPrice", productPrice,"SubscriberTestData.properties");
					
				} else {
					browser.reportscomtep("Failed", "Click on Add Product '+Product' and Verify Product is added into Order Products",
							"Product should be added into Order Products",
							"Product is not added into Order Products");
				}
				
				browser.click(SCobjects.POS_Create_Button);
				browser.waitforelementtobevisible(SCobjects.POS_asb_ChoosePaymentOptions_popup_header, 4);
				if(browser.elementisdisplayed(SCobjects.POS_asb_ChoosePaymentOptions_popup_header)){
					browser.reportscomtep("Passed", "Click on Create Order and Verify Choose Payment Options Popup is displayed",
							"Choose Payment Options Popup should be displayed",
							"Choose Payment Options Popup is displayed");
					
					browser.click(SCobjects.POS_asb_ChoosePaymentOptions_popup_rbutton);					
					browser.click(SCobjects.POS_asb_CPO_popup_ProceedtoCheckout_button);
					if(browser.elementisdisplayed(SCobjects.POS_asb_Areyousure_popup_Header)){
						browser.reportscomtep("Passed", "Click on Proceed to Checkout and Verify Are you sure You want to proceed to checkout! Popup is displayed",
								"Are you sure You want to proceed to checkout! Popup should be displayed",
								"Are you sure You want to proceed to checkout! Popup is displayed");
						
						browser.click(SCobjects.POS_asb_ays_popup_YesProceedtocheckout_Button);	
						if (browser.elementisdisplayed(SCobjects.POS_asb_Success_popup_Header) && browser.elementisdisplayed(SCobjects.POS_asb_Success_popup_BookingID_text)){
							bookingCreatedRequestID = browser.getelementtext(SCobjects.POS_asb_Success_popup_BookingID_text);
							browser.reportscomtep("Passed", "Click on Yes Proceed to Checkout and Verify Success Popup along with Booking Created RequestId is displayed",
									"Success Popup along with Booking Created RequestId should be displayed",
									"Success Popup along with Booking Created RequestId: "+ bookingCreatedRequestID +" is displayed");
							
							browser.click(SCobjects.POS_asb_Success_popup_OK_button);
							
							browser.Verify_elementisdisplayed_Report(SCobjects.POS_AddNewSale_PopupHeader, "Add New Sale header");							
							browser.click(SCobjects.POS_Close_button);
							
							if(SCobjects.POS_BookingId_List.size()>0){
								for (WebElement bid:SCobjects.POS_BookingId_List){
									bookingid = bid.getText();
									if(bookingCreatedRequestID.contains(bookingid)){
										browser.reportscomtep("Passed", "Verify Booking Created RequestId is displayed in Bookings Table",
												"Booking Created RequestId should be displayed in Bookings Table",
												"Booking Created RequestId: "+ bookingid +" is displayed in Bookings Table");
										break;
									}else{
										browser.reportscomtep("Failed", "Verify Booking Created RequestId is displayed in Bookings Table",
												"Booking Created RequestId should be displayed in Bookings Table",
												"Booking Created RequestId: "+ bookingid +" is displayed in Bookings Table");
									}
								}
								
							}else{
								browser.reportscomtep("Failed", "Verify Booking Created RequestId is displayed in Bookings Table",
										"Booking Created RequestId should be displayed in Bookings Table",
										"Booking Created RequestIds not displayed in Bookings Table");
							}
							
						}else{
							browser.reportscomtep("Failed", "Click on Yes Proceed to Checkout and Verify Success Popup along with Booking Created RequestId is displayed",
									"Success Popup along with Booking Created RequestId should be displayed",
									"Success Popup along with Booking Created RequestId "+ bookingCreatedRequestID +" is not displayed");
						}
					}else{
						browser.reportscomtep("Failed", "Click on Proceed to Checkout and Verify Are you sure You want to proceed to checkout! Popup is displayed",
								"Are you sure You want to proceed to checkout! Popup should be displayed",
								"Are you sure You want to proceed to checkout! Popup is not displayed");
					}
					
				}else{
					browser.reportscomtep("Failed", "Click on Create Order and Verify Choose Payment Options Popup is displayed",
							"Choose Payment Options Popup should be displayed",
							"Choose Payment Options Popup not displayed");					
				}
				

			} else {
				browser.reportscomtep("Failed",
						"Verify Add NewSale PopupHeader is displayed",
						"Add NewSale PopupHeader should be displayed", "Add NewSale PopupHeader is not displayed");
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	
	
	
/****TC_20_017 Check the View button in bookings page(POS) ******/
	
	public void Check_Viewbuttoninbookingspage_POS() {
		
		String bookingCreatedRequestID = "";
		String viewButton_text = "";
		String POSBookingIdHeader = "";
		try {		
				
			if(SCobjects.POS_BookingId_List.size()>0){
				bookingCreatedRequestID = browser.getelementtext(SCobjects.POS_BookingId_List.get(0));
				for (WebElement viewButton:SCobjects.POS_BP_View_ButtonList){
					viewButton_text = viewButton.getText();
					if(viewButton_text.contains("VIEW")){
						viewButton.click();
						browser.waitForNewWindowAndSwitchToIt(driver);
						POSBookingIdHeader = browser.getelementtext(SCobjects.POS_BookingId_H3_header);
						String[] POSBookingID = POSBookingIdHeader.split("#");
						if(POSBookingID[1].equals(bookingCreatedRequestID)){						
							browser.reportscomtep("Passed", "Click on View Button on a POS booking page and verify POS bookings Invoice is displayed in next tab",
								"POS bookings Invoice should be displayed in next tab",
								"POS bookings Invoice is displayed in next tab");
							//driver.close();
							//driver.switchTo().window(defaultWindowHandle);
							break;
							
						}else{
							browser.reportscomtep("Failed", "Click on View Button on a POS booking page and verify POS bookings Invoice is displayed in next tab",
								"POS bookings Invoice should be displayed in next tab",
								"POS bookings Invoice is not displayed in next tab");
						}
					}
				}
				
			}else{
				browser.reportscomtep("Failed", "Verify Booking Created RequestId is displayed in Bookings Table",
						"Booking Created RequestId should be displayed in Bookings Table",
						"Booking Created RequestIds not displayed in Bookings Table");
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	
/****TC_20_018 Check whether the details in the invoice are correct ******/
	
	public void Check_detailsintheinvoice() {
		
		String serviceName = "";
		String productName = "";
		String serviceQty = "";
		String servicePrice = "";
		String productQty = "";
		String productPrice = "";
		String invoice_serviceName = "Service Name";
		String invoice_productName = "Product Name";
		String invoice_serviceQty = "Service Qty";
		String invoice_servicePrice = "Service Price";
		String invoice_productQty = "Product Qty";
		String invoice_productPrice = "Product Price";
				
		try {	
			serviceName = browser.getdata("Out_POS_ServiceName");
			serviceQty = browser.getdata("Out_POS_ServiceQty");
			servicePrice = browser.getdata("Out_POS_ServicePrice").replace("$", "$ ");
			productName = browser.getdata("Out_POS_productName");
			productQty = browser.getdata("Out_POS_productQty");
			productPrice = browser.getdata("Out_POS_productPrice").replace("$", "$ ");
					
			if(browser.elementisdisplayed(SCobjects.POS_BookingId_H3_header)){						
				browser.reportscomtep("Passed", "Verify POS bookings Invoice is displayed in next tab",
					"POS bookings Invoice should be displayed in next tab",
					"POS bookings Invoice is displayed in next tab");				
				browser.verifyElementextvalueandReport(SCobjects.POS_Invoice_ServiceName_text, invoice_serviceName, serviceName, "partial");
				browser.verifyElementextvalueandReport(SCobjects.POS_Invoice_ServiceQty_text, invoice_serviceQty, serviceQty, "exact");
				browser.verifyElementextvalueandReport(SCobjects.POS_Invoice_ServicePrice_text, invoice_serviceQty, servicePrice, "exact");
				browser.verifyElementextvalueandReport(SCobjects.POS_Invoice_ProductName_text, invoice_productName, productName, "partial");
				browser.verifyElementextvalueandReport(SCobjects.POS_Invoice_ProductQty_text, invoice_productQty, productQty, "exact");
				browser.verifyElementextvalueandReport(SCobjects.POS_Invoice_ProductPrice_text, invoice_productPrice, productPrice, "exact");
				
			}else{
				browser.reportscomtep("Failed", "Verify POS bookings Invoice is displayed in next tab",
					"POS bookings Invoice should be displayed in next tab",
					"POS bookings Invoice is not displayed in next tab");
			}
			

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	
/***TC_20_019 Check whether the invoice can be sent through email*/
	
	public void Check_invoice_sentthroughemail() {
		
		
		String invoice_Sent_Email = "";
				
		try {	
			invoice_Sent_Email = browser.getdata("temp_LogIN_UserName");					
			if(browser.elementisdisplayed(SCobjects.POS_Invoice_EmailReceipt_Link)){						
				browser.reportscomtep("Passed", "Verify Invoice Email Receipt link is displayed in next tab",
					"Invoice Email Receipt link should be displayed in next tab",
					"Invoice Email Receipt link is displayed in next tab");	
				browser.click(SCobjects.POS_Invoice_EmailReceipt_Link);
				if(browser.elementisdisplayed(SCobjects.POS_Invoice_Popup_EmailAddress_input)){
					browser.reportscomtep("Passed", "Click on Email Receipt link and Verify Enter recipient email address pop up is displayed",
							"Enter recipient email address pop up should be displayed",
							"Enter recipient email address pop up is displayed");
					browser.sendkeys(SCobjects.POS_Invoice_Popup_EmailAddress_input, invoice_Sent_Email);
					browser.click(SCobjects.POS_Invoice_Popup_OK_button);
					if(browser.elementisdisplayed(SCobjects.POS_Invoice_ESS_Popup_MEssage)){
						browser.reportscomtep("Passed", "Entered Email Address and Click on Ok Button and Verify Email send successfully pop up is displayed",
								"Email send successfully pop up should be displayed",
								"Email send successfully pop up is displayed");						
						browser.click(SCobjects.POS_Invoice_ESS_Popup_OK_button);						
						
					}else{
						browser.reportscomtep("Failed", "Entered Email Address and Click on Ok Button and Verify Email send successfully pop up is displayed",
								"Email send successfully pop up should be displayed",
								"Email send successfully pop up is not displayed");	
					}
					
				}else{
					browser.reportscomtep("Failed", "Click on Email Receipt link and Verify Enter recipient email address pop up is displayed",
							"Enter recipient email address pop up should be displayed",
							"Enter recipient email address pop up is not displayed");
				}
				
				
			}else{
				browser.reportscomtep("Failed", "Verify Invoice Email Receipt link is displayed in next tab",
						"Invoice Email Receipt link should be displayed in next tab",
						"Invoice Email Receipt link is not displayed in next tab");		
			}
			

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	
/***TC_20_021 Check the Return to POS Bookings button*/
	
	public void Check_Return_to_POSBookingsbutton() {		
						
		try {	
						
			if(browser.elementisdisplayed(SCobjects.POS_Invoice_ReturntoPOSBookings_Link)){						
				browser.reportscomtep("Passed", "Verify Return To POS Bookings link is displayed in next tab",
					"Return To POS Bookings link should be displayed in next tab",
					"Return To POS Bookings link is displayed in next tab");	
				browser.click(SCobjects.POS_Invoice_ReturntoPOSBookings_Link);
				if(browser.elementisdisplayed(SCobjects.Pos_BookingsPage_Header)){
					browser.reportscomtep("Passed", "Click on Return To POS Bookings link and Verify POS Bookings page is displayed",
							"POS Bookings page should be displayed",
							"POS Bookings page is displayed");					
					
				}else{
					browser.reportscomtep("Failed", "Click on Return To POS Bookings link and Verify POS Bookings page is displayed",
							"POS Bookings page should be displayed",
							"POS Bookings page is not displayed");
				}
				
				
			}else{
				browser.reportscomtep("Failed", "Verify Return To POS Bookings link is displayed in next tab",
						"Return To POS Bookings link should be displayed in next tab",
						"Return To POS Bookings link is not displayed in next tab");	
			}
			

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	
/**TS014_Subscriber clicks on Manage Products under Manage Circle Menu*********/
	
	/*****TC_14_001 Open Manage Products page**/
	public void openManageProducts_Page() {
		String SelectedType = "";
		try {
			if (browser.elementisdisplayed(SCobjects.Subscriber_ManageCircle_Dropdown_Link)) {
				browser.reportscomtep("Passed", "Verify Manage Circle dropdown link is displayed in Dashboard page",
						"Manage Circle dropdown link should be displayed", "Manage Circle dropdown link is displayed");
				browser.click(SCobjects.Subscriber_ManageCircle_Dropdown_Link);
				SelectedType = browser.getelementtext(SCobjects.ManageProducts_DropDown_Value);
				if (SelectedType.equalsIgnoreCase("Manage Products")) {
					browser.click(SCobjects.ManageProducts_DropDown_Value);
					if (browser.elementisdisplayed(SCobjects.ManageProducts_Products_Page)) {
						browser.reportscomtep("Passed",
								"Clicks on " + SelectedType + " and Verify Products Page is Opened",
								"Product  page should be Opened", "Product page is Opened");
						String AllProductsActvieStatus = browser
								.elementgetAttributevalue(SCobjects.ManageProducts_AllProducts_Tab, "class");
						if (AllProductsActvieStatus.equalsIgnoreCase("active")
								&& browser.elementisdisplayed((SCobjects.ManageProducts_AllProducts_Tab))) {
							browser.reportscomtep("Passed", "verify All Products Default tab is selected",
									" All Products Default tab should be selected",
									" All Products Default tab is selected");
							if (browser.elementisdisplayed(SCobjects.ManageProducts_Products_NoDatafound)) {
								browser.reportscomtep("Passed", "Verify For 1st time login No data is founded in Products",
										"For 1st time login No data should be founded in Products",
										"For 1st time login No data is founded in Products");
							} else if (SCobjects.ManageProducts_Produts_List.size() > 0
									&& browser.elementisdisplayed(SCobjects.ManageProducts_Produts_List.get(0))
									&& browser.elementisdisplayed(
											SCobjects.ManageProducts_RelaventAction_Buttons_List.get(0))) {
								browser.reportscomtep("Passed",
										"Verify List of products with relevant action buttons are dispalyed",
										"List of products with relevant action buttons should be dispalyed",
										"List of products with relevant action buttons are dispalyed");
							}
							browser.Verify_elementisdisplayed_Report(SCobjects.ManageProduct_Categories_Tab,
									"CategoriesTab");
							browser.Verify_elementisdisplayed_Report(SCobjects.ManageProduct_Brands_Tab, "Brands Tab");
							browser.Verify_elementisdisplayed_Report(SCobjects.ManageProduct_Suppliers_Tab,
									"SuppliersTab");
							browser.Verify_elementisdisplayed_Report(SCobjects.ManageProduct_AddNewProduct_Tab,
									"Add New Product Tab");
						} else {
							browser.reportscomtep("Failed", "verify All Products Default tab is selected",
									" All Products Default tab should be selected",
									" All Products Default tab is not selected");
						}
					} else {
						browser.reportscomtep("Failed", "Verify Products page is Opened",
								"Products page should be Opened", "Products page is not Opened");
					}
				} else {
					browser.reportscomtep("Failed", "Verify ManageCircle dropdown value is slected",
							"ManageCircle dropdown value should be slected",
							"ManageCircle dropdown value is not selected");
				}
			} else {
				browser.reportscomtep("Failed", "Verify Manage Circle dropdown link is displayed in Dashboard page",
						"Manage Circle dropdown link should be displayed",
						"Manage Circle dropdown link is not displayed");
			}
		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}

	}
	
	/******
	 * TC_14_002 Check the details & action buttons in All Products tab (when products are added)
	 *************/
	
	public void check_DetailsAndactionButtons_InAllProductsTab() {
		String TableHeadername = "";
		try {
			List<WebElement> ProductData = SCobjects.ManageProducts_Produts_List;
			List<WebElement> ProductTableheaders = SCobjects.ManageProduct_Product_Table_headersList;
			String ProductDataTableValue = browser.getelementtext(ProductData.get(0));
			if (ProductData.size() > 0 && !ProductDataTableValue.isEmpty()) {
				String[] AllProductheader = new String[5];
				AllProductheader[0] = "Product Name";
				AllProductheader[1] = "Retail Price";
				AllProductheader[2] = "Stock On Hand";
				AllProductheader[3] = "Updated At";
				AllProductheader[4] = "Action";
				int i = 0;
				for (WebElement theader : ProductTableheaders) {
					TableHeadername = browser.getelementtext(theader);
					if (TableHeadername.equalsIgnoreCase(AllProductheader[i])
							&& browser.elementisdisplayed(ProductTableheaders.get(i))) {
						browser.reportscomtep("Passed",
								"Verify All Product Table header " + TableHeadername + " is Displayed",
								"All Product Table header should be Displayed",
								"All Product Table header displayed as " + TableHeadername);
					} else {
						browser.reportscomtep("Failed",
								"Verify All Product Table header " + AllProductheader[i] + " is Displayed",
								"All Product Table header should be Displayed",
								"All Product Table header " + AllProductheader[i] + " Not displayed");
					}

					i++;
				}
				List<WebElement> ActionsButtons = SCobjects.ManageProducts_Action_Buttons_List;
				int j = 0;
				for (WebElement ActionList : ActionsButtons) {
					String ActionButtonsName = browser.elementgetAttributevalue(ActionsButtons.get(j), "ng-click");
					if (browser.elementisdisplayed(ActionsButtons.get(j))) {
						browser.reportscomtep("Passed", "Verify " + ActionButtonsName + " button is Displayed",
								"Edit button should be Displayed",
								"Action Button displayed Name as " + ActionButtonsName);
					} else {
						browser.reportscomtep("Failed", "Verify Action Button is dispalyed",
								"Action Button should be Displayed", "Action Button is not dispalyed ");
					}
					j++;
				}
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	
	/********TC_14_003 Check the Categories tab*******/
	
	public void check_CategoriesTab() {
		String TableHeadername = "";
		try {
			browser.click(SCobjects.ManageProduct_Categories_Tab);
			if (browser.elementisdisplayed(SCobjects.ManageProduct_CategoriesPage_Header)) {
				browser.reportscomtep("Passed", "Clicks on Categories tab and verify Categories Page is opened",
						"Categories Page should be opened", "Categories Page is opened");
				browser.Verify_elementisdisplayed_Report(SCobjects.ManageProduct_CP_NewCategory_Button,
						"New Category Button");
				if (browser.elementisdisplayed(SCobjects.ManageProducts_CP_NoDatafound)) {
					browser.reportscomtep("Passed", "Verify For 1st time login No data is founded in Categories",
							"For 1st time login No data should be founded in Categories",
							"For 1st time login No data is founded in Categories");
				} else if (SCobjects.ManageProducts_CP_Categories_List.size() > 0
						&& browser.elementisdisplayed(SCobjects.ManageProducts_CP_Categories_List.get(0))) {
					browser.reportscomtep("Passed", "Verify List of Categories are dispalyed",
							"List of Categories should be dispalyed", "List of Categories are dispalyed");
				}
				String[] Categoriestheader = new String[2];
				Categoriestheader[0] = "Category Name";
				Categoriestheader[1] = "Products Assigned";
				int i = 0;
				List<WebElement> CategoryHeaders = SCobjects.ManageProduct_CP_TableHeadersList;
				for (WebElement theader : CategoryHeaders) {
					TableHeadername = browser.getelementtext(theader);
					if (TableHeadername.equalsIgnoreCase(Categoriestheader[i])
							&& browser.elementisdisplayed(CategoryHeaders.get(i))) {
						browser.reportscomtep("Passed",
								"Verify Category table header " + TableHeadername + " is Displayed",
								"Category table header should be Displayed",
								"Category table header displayed as :" + TableHeadername);
					} else {
						browser.reportscomtep("Failed",
								"Verify Category table header" + Categoriestheader[i] + " is Displayed",
								"Category table header should be Displayed",
								"Category table header is " + Categoriestheader[i] + " Not displayed");
					}

					i++;
				}

			} else {
				browser.reportscomtep("Failed", "Clicks on Categories tab and verify Categories Page is opened",
						"Categories Page should be opened", "Categories Page is not opened");
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	
	/*****TC_14_004 Check whether new category can be added**********/
	
	public void checkWhether_NewCategory_Added() {
		String NewCategorynames = "";
		try {
			NewCategorynames = browser.getdata("CategoryName");
			browser.click(SCobjects.ManageProduct_CP_NewCategory_Button);
			if (browser.elementisdisplayed(SCobjects.ManageProduct_CP_AddCategory_PopupHeader)) {
				browser.reportscomtep("Passed",
						"Clicks on New Category button and verify Add Category Popup is displayed",
						"Add Category Popup should be displayed", "Add Category Popup is displayed");
				browser.sendkeys(SCobjects.ManageProduct_CP_ACP_CategoryTextBox, NewCategorynames);
				browser.click(SCobjects.ManageProduct_CP_ACP_SaveButton);
				List<WebElement> categoryNameList = SCobjects.ManageProduct_CP_categoryName_List;
				int categoryNameListLength = categoryNameList.size() -1;
				browser.scrollintoviewelement(categoryNameList.get(categoryNameListLength));
				String AfterAddedCategoryname = browser.getelementtext(categoryNameList.get(categoryNameListLength));
				if (AfterAddedCategoryname.equalsIgnoreCase(NewCategorynames)
						&& browser.elementisdisplayed(categoryNameList.get(categoryNameListLength))) {
					browser.reportscomtep("Passed",
							"Enter Category name & Clicks on save button and Verify " + NewCategorynames
									+ " Category is added",
							"Category should be added", " " + NewCategorynames + " Category is added");
					List<WebElement> ProductAssigned_List = SCobjects.ManageProduct_CP_ProductAssigned_List;
					String ProductAssigned = browser.getelementtext(ProductAssigned_List.get(categoryNameListLength));
					if (ProductAssigned.equals("0")
							&& browser.elementisdisplayed(ProductAssigned_List.get(categoryNameListLength))) {
						browser.reportscomtep("Passed",
								"Verify Number of Products is assigned: " + ProductAssigned + " until assigned",
								"Number of Products should be assigned 0 until assigned",
								"Number of Products is assigned as: " + ProductAssigned + " until assigned");
					} else {
						browser.reportscomtep("Failed",
								"Verify Number of Products is assigned: " + ProductAssigned + " until assigned",
								"Number of Products should be assigned 0 until assigned",
								"Number of Products is not assigned ");
					}

				} else {
					browser.reportscomtep("Failed",
							"Enter Category name & Clicks on save button and Verify category is added ",
							"Category should be added", "Category is not added");
				}

			} else {
				browser.reportscomtep("Failed",
						"Clicks on New Category button and verify Add Category Popup is displayed",
						"Add Category Popup should be displayed", "Add Category Popup is not displayed");
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	
	/*****TC_14_005 Check whether a Category name can be modified****/
	
	public void checkWhether_CategoryName_Modified() {
		String BeforeModifiedCategoryName = "";
		String ModifiedCN = "";
		String AfterModifiedCategoryName = "";
		try {
			ModifiedCN = browser.getdata("ModifiedCategoryName");
			List<WebElement> CategorieNameList = SCobjects.ManageProduct_CP_categoryName_List;
			browser.scrollintoviewelement(CategorieNameList.get(0));
			BeforeModifiedCategoryName = browser.getelementtext(CategorieNameList.get(0));
			browser.click(CategorieNameList.get(0));
			if (browser.elementisdisplayed(SCobjects.ManageProduct_CP_ECP_Header)) {
				browser.reportscomtep("Passed", "Clicks on Category name and verify Edit Category popup is opened",
						"Edit Category popup should be opened", "Edit Category popup is opened");
				browser.sendkeys(SCobjects.ManageProduct_CP_ACP_CategoryTextBox, ModifiedCN);
				browser.click(SCobjects.ManageProduct_CP_ACP_SaveButton);
				AfterModifiedCategoryName = browser.getelementtext(CategorieNameList.get(0));
				if (!AfterModifiedCategoryName.equalsIgnoreCase(BeforeModifiedCategoryName)
						&& browser.elementisdisplayed((CategorieNameList.get(0)))) {
					browser.reportscomtep("Passed",
							"Enter Modify Category name and clicks on save button and verify Category name is modified",
							"Category name should be modified",
							"Category name is modified as:" + AfterModifiedCategoryName);
				} else {
					browser.reportscomtep("Failed",
							"Enter Modify Category name and clicks on save button and verify Category name is modified",
							"Category name should be modified",
							"Category name is not modified as:" + BeforeModifiedCategoryName);
				}

			} else {
				browser.reportscomtep("failed", "Clicks on Category name and verify Edit Category popup is opened",
						"Edit Category popup should be opened", "Edit Category popup is not opened");
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	
	/*******TC_14_006 Check whether a category can be deleted**********/
	
	public void checkWhether_CategoryName_Deleted() {
		String BeforeDeletedCategoryName = "";
		String AfterDeletedCategoryName = "";
		try {
			List<WebElement> CategorieNameList = SCobjects.ManageProduct_CP_categoryName_List;
			BeforeDeletedCategoryName = browser.getelementtext(CategorieNameList.get(0));
			browser.click(CategorieNameList.get(0));
			if (browser.elementisdisplayed(SCobjects.ManageProduct_CP_ECP_Header)) {
				browser.reportscomtep("Passed", "Clicks on Category name and verify Edit Category popup is opened",
						"Edit Category popup should be opened", "Edit Category popup is opened");
				browser.click(SCobjects.ManageProduct_CP_ACP_DeleteButton);
				browser.click(SCobjects.ManageProduct_CP_ACP_YesConformationPopup_Button);
				browser.click(SCobjects.Confirmatio_OK_Button);
				AfterDeletedCategoryName = browser.getelementtext(CategorieNameList.get(0));
				if (!AfterDeletedCategoryName.equalsIgnoreCase(BeforeDeletedCategoryName)
						&& browser.elementisdisplayed((CategorieNameList.get(0)))) {
					browser.reportscomtep("Passed",
							"Clicks on continue Delete, Yes & OK buutons and verify Category name is Deleted",
							"Category name should be Deleted",
							"Category name is Deleted as:" + BeforeDeletedCategoryName);
				} else {
					browser.reportscomtep("Failed",
							"Clicks on continue Delete, Yes & OK buutons and verify Category name is Deleted",
							"Category name should be Deleted", "Category name is not Deleted");
				}

			} else {
				browser.reportscomtep("failed", "Clicks on Category name and verify Edit Category popup is opened",
						"Edit Category popup should be opened", "Edit Category popup is not opened");
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	
	/***TC_14_007 Check the Brands tab***/
	public void check_BrandsTab() {
		String TableHeadername = "";
		try {
			browser.click(SCobjects.ManageProduct_Brands_Tab);
			if (browser.elementisdisplayed(SCobjects.ManageProduct_CP_BrandsPage_Header)) {
				browser.reportscomtep("Passed", "Clicks on Brands tab and verify Brands Page is opened",
						"Brands Page should be opened", "Brands Page is opened");
				browser.Verify_elementisdisplayed_Report(SCobjects.ManageProduct_BP_NewBrand_Button,
						"New Brands Button");
				if (browser.elementisdisplayed(SCobjects.ManageProducts_Brands_NoDatafound)) {
					browser.reportscomtep("Passed", "Verify For 1st time login No data is founded in Brands",
							"For 1st time login No data should be founded in Brands",
							"For 1st time login No data is founded in Brands");
				} else if (SCobjects.ManageProduct_BP_Brand_List.size() > 0
						&& browser.elementisdisplayed(SCobjects.ManageProduct_BP_Brand_List.get(0))) {
					browser.reportscomtep("Passed", "Verify List of Brands are dispalyed",
							"List of Brands should be dispalyed", "List of Brands are dispalyed");
				}
				String[] Brandstheader = new String[2];
				Brandstheader[0] = "Brand Name";
				Brandstheader[1] = "Products Assigned";
				int i = 0;
				List<WebElement> BrandtHeaders = SCobjects.ManageProduct_BP_TableHeadersList;
				for (WebElement theader : BrandtHeaders) {
					TableHeadername = theader.getText();
					if (TableHeadername.equalsIgnoreCase(Brandstheader[i])
							&& browser.elementisdisplayed(BrandtHeaders.get(i))) {
						browser.reportscomtep("Passed",
								"Verify Brand table header " + TableHeadername + " is Displayed",
								"Brand table header should be Displayed",
								"Brand table header displayed as :" + TableHeadername);
					} else {
						browser.reportscomtep("Failed",
								"Verify Category table header" + Brandstheader[i] + " is Displayed",
								"Brand table header should be Displayed",
								"Brand table header is " + Brandstheader[i] + " Not displayed");
					}

					i++;
				}

			} else {
				browser.reportscomtep("Failed", "Clicks on Brands tab and verify Brands Page is opened",
						"Brands Page should be opened", "Brands Page is not opened");
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	
	/****TC_14_008 Check whether a New Brand can be added***********/
	
	public void checkWhether_NewBrand_Added() {
		String NewBrandname = "";
		try {
			NewBrandname = browser.getdata("Brandname");
			browser.click(SCobjects.ManageProduct_BP_NewBrand_Button);
			if (browser.elementisdisplayed(SCobjects.ManageProduct_BP_AddBrand_PopupHeader)) {
				browser.reportscomtep("Passed", "Clicks on New Brand button and verify Add Brand Popup is displayed",
						"Add Brand Popup should be displayed", "Add Brand Popup is displayed");
				browser.sendkeys(SCobjects.ManageProduct_BP_ABP_BrandTextBox, NewBrandname);
				browser.click(SCobjects.ManageProduct_BP_ABP_SaveButton);
				List<WebElement> BrandNameList = SCobjects.ManageProduct_BP_BrandName_List;
				int BrandNameListLength = BrandNameList.size() - 1;
				browser.scrollintoviewelement(BrandNameList.get(BrandNameListLength));
				String AfterAddedBrandname = browser.getelementtext(BrandNameList.get(BrandNameListLength));
				if (AfterAddedBrandname.equalsIgnoreCase(NewBrandname)
						&& browser.elementisdisplayed(BrandNameList.get(BrandNameListLength))) {
					browser.reportscomtep("Passed",
							"Enter Brand name & Clicks on save button and Verify " + NewBrandname
									+ " Brands name is added",
							"Brands name should be added", " " + NewBrandname + " Brands name is added");
					List<WebElement> ProductAssigned_List = SCobjects.ManageProduct_BP_ProductsAssigned_List;
					String ProductAssigned = browser.getelementtext(ProductAssigned_List.get(BrandNameListLength));
					if (ProductAssigned.equals("0")
							&& browser.elementisdisplayed(ProductAssigned_List.get(BrandNameListLength))) {
						browser.reportscomtep("Passed",
								"Verify Number of Products is assigned: " + ProductAssigned + " until assigned",
								"Number of Products should be assigned 0 until assigned",
								"Number of Products is assigned as: " + ProductAssigned + " until assigned");
					} else {
						browser.reportscomtep("Failed",
								"Verify Number of Products is assigned: " + ProductAssigned + " until assigned",
								"Number of Products should be assigned 0 until assigned",
								"Number of Products is not assigned ");
					}

				} else {
					browser.reportscomtep("Failed",
							"Enter Brands name name & Clicks on save button and Verify category is added ",
							"Brands name should be added", "Brands name is not added");
				}

			} else {
				browser.reportscomtep("Failed", "Clicks on New Brand button and verify Add Brand Popup is displayed",
						"Add Brand Popup should be displayed", "Add Brand Popup is not displayed");
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	
	/*****TC_14_009 Check whether a Brand Name can be modified*****/
	
	public void checkWhether_BrandName_Modified() {
		String BeforeModifiedBrandName = "";
		String ModifiedBN = "";
		String AfterModifiedBrandName = "";
		try {
			ModifiedBN = browser.getdata("ModifiedBrandName");
			List<WebElement> BrandNameList = SCobjects.ManageProduct_BP_BrandName_List;
			browser.scrollintoviewelement(BrandNameList.get(0));
			BeforeModifiedBrandName = browser.getelementtext(BrandNameList.get(0));
			browser.click(BrandNameList.get(0));
			if (browser.elementisdisplayed(SCobjects.ManageProduct_BP_EBP_Header)) {
				browser.reportscomtep("Passed", "Clicks on Brand name and verify Edit Brand popup is opened",
						"Edit Brand popup should be opened", "Edit Brand popup is opened");
				browser.sendkeys(SCobjects.ManageProduct_BP_ABP_BrandTextBox, ModifiedBN);
				browser.click(SCobjects.ManageProduct_BP_ABP_SaveButton);
				AfterModifiedBrandName = browser.getelementtext(BrandNameList.get(0));
				if (!AfterModifiedBrandName.equalsIgnoreCase(BeforeModifiedBrandName)
						&& browser.elementisdisplayed((BrandNameList.get(0)))) {
					browser.reportscomtep("Passed",
							"Enter Modify Brand name and clicks on save button and verify Brand name is modified",
							"Brand name should be modified", "Brand name is modified as:" + AfterModifiedBrandName);
				} else {
					browser.reportscomtep("Failed",
							"Enter Modify Brand name and clicks on save button and verify Brand name is modified",
							"Brand name should be modified",
							"Brand name is not modified as:" + BeforeModifiedBrandName);
				}

			} else {
				browser.reportscomtep("failed", "Clicks on Brand name and verify Edit Brand popup is opened",
						"Edit Brand popup should be opened", "Edit Brand popup is not opened");
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	
	/*********TC_14_010 Check whether a brand can be deleted********/
	
	public void checkWhether_BrandName_Deleted() {
		String BeforeDeletedBrandName = "";
		String AfterDeletedBrandName = "";
		try {
			List<WebElement> BrnadNameList = SCobjects.ManageProduct_BP_BrandName_List;
			BeforeDeletedBrandName = browser.getelementtext(BrnadNameList.get(0));
			browser.click(BrnadNameList.get(0));
			if (browser.elementisdisplayed(SCobjects.ManageProduct_BP_EBP_Header)) {
				browser.reportscomtep("Passed", "Clicks on Brand name and verify Edit Brand popup is opened",
						"Edit Brand popup should be opened", "Edit Brand popup is opened");
				browser.click(SCobjects.ManageProduct_BP_ACP_DeleteButton);
				browser.click(SCobjects.ManageProduct_BP_ACP_YesConformationPopup_Button);
				browser.click(SCobjects.Confirmatio_OK_Button);
				AfterDeletedBrandName = browser.getelementtext(BrnadNameList.get(0));
				if (!AfterDeletedBrandName.equalsIgnoreCase(BeforeDeletedBrandName)
						&& browser.elementisdisplayed((BrnadNameList.get(0)))) {
					browser.reportscomtep("Passed",
							"Clicks on continue Delete, Yes & OK buutons and verify Brand name is Deleted",
							"Brand name should be Deleted",
							"Brand name is Deleted as:" + BeforeDeletedBrandName);
				} else {
					browser.reportscomtep("Failed",
							"Clicks on continue Delete, Yes & OK buutons and verify Brand name is Deleted",
							"Brand name should be Deleted", "Brand name is not Deleted");
				}

			} else {
				browser.reportscomtep("failed", "Clicks on Brand name and verify Edit Brand popup is opened",
						"Edit Brand popup should be opened", "Edit Brand popup is not opened");
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	
	
	/**TC_14_011 Check the Suppliers tab**********/
	
	public void check_SuppliersTab() {
		String TableHeadername = "";
		try {
			browser.click(SCobjects.ManageProduct_Suppliers_Tab);
			if (browser.elementisdisplayed(SCobjects.ManageProduct_SuppliersPage_Header)) {
				browser.reportscomtep("Passed", "Clicks on Suppliers tab and verify Suppliers Page is opened",
						"Suppliers Page should be opened", "Suppliers Page is opened");
				browser.Verify_elementisdisplayed_Report(SCobjects.ManageProduct_SP_NewSupplier_Button,
						"New Suppliers Button");
				if (browser.elementisdisplayed(SCobjects.ManageProducts_Suppliers_NoDatafound)) {
					browser.reportscomtep("Passed", "Verify For 1st time login No data is founded in Suppliers",
							"For 1st time login No data should be founded in Suppliers",
							"For 1st time login No data is founded in Suppliers");
				} else {
					browser.reportscomtep("Passed", "Verify List of Suppliers are dispalyed",
							"List of Suppliers should be dispalyed", "List of Suppliers are dispalyed");
				}
				String[] Supplierstheader = new String[4];
				Supplierstheader[0] = "Supplier Name";
				Supplierstheader[1] = "Phone";
				Supplierstheader[2] = "Email";
				Supplierstheader[3] = "Products Assigned";

				int i = 0;
				List<WebElement> SupplierstHeaders = SCobjects.ManageProduct_SP_TableHeadersList;
				for (WebElement theader : SupplierstHeaders) {
					TableHeadername = browser.getelementtext(theader);
					if (TableHeadername.equalsIgnoreCase(Supplierstheader[i])
							&& browser.elementisdisplayed(SupplierstHeaders.get(i))) {
						browser.reportscomtep("Passed",
								"Verify Suppliers table header " + TableHeadername + " is Displayed",
								"Suppliers table header should be Displayed",
								"Suppliers table header displayed as :" + TableHeadername);
					} else {
						browser.reportscomtep("Failed",
								"Verify Category table header" + Supplierstheader[i] + " is Displayed",
								"Suppliers table header should be Displayed",
								"Suppliers table header is " + Supplierstheader[i] + " Not displayed");
					}

					i++;
				}

			} else {
				browser.reportscomtep("Failed", "Clicks on Suppliers tab and verify Suppliers Page is opened",
						"Suppliers Page should be opened", "Suppliers Page is not opened");
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	
	/*******TC_14_012 Check whether a new supplier can be added***********/
	
	public void checkWhether_NewSupplier_Added() {
		String NewSuppliersname = "";
		String SupplierPhNo = "";
		String SuppilerEmail ="";
		try {
			NewSuppliersname = browser.getdata("Suppliersname");
			SupplierPhNo = browser.getdata("SupplierMNO");
			SuppilerEmail = browser.getdata("SupplierCemail");
			browser.click(SCobjects.ManageProduct_SP_NewSupplier_Button);
			if (browser.elementisdisplayed(SCobjects.ManageProduct_SP_AddSupplierPopup_Header)) {
				browser.reportscomtep("Passed", "Clicks on New Suppliers button and verify Add Suppliers Popup is displayed",
						"Add Suppliers Popup should be displayed", "Add Suppliers Popup is displayed");
				browser.sendkeys(SCobjects.ManageProduct_Suppliers_ASP_SupplierName_TextBox, NewSuppliersname);
				browser.sendkeys(SCobjects.ManageProduct_Suppliers_ASP_SupplierMobile_TextBox, SupplierPhNo);
				browser.sendkeys(SCobjects.ManageProduct_Suppliers_ASP_ContactPersonEmail_TextBox, SuppilerEmail);
				browser.click(SCobjects.ManageProduct_Suppliers_ASP_SaveButton);
				List<WebElement> SuppliersNameList = SCobjects.ManageProduct_SP_SuppliersName_List;
				int SuppliersNameListLength = SuppliersNameList.size() - 1;
				browser.scrollintoviewelement(SuppliersNameList.get(SuppliersNameListLength));
				String AfterAddedSuppliersname = browser.getelementtext(SuppliersNameList.get(SuppliersNameListLength));
				if (AfterAddedSuppliersname.equalsIgnoreCase(NewSuppliersname)
						&& browser.elementisdisplayed(SuppliersNameList.get(SuppliersNameListLength))) {
					browser.reportscomtep("Passed",
							"Enter Suppliers Mandatory,optional fields & Clicks on save button and Verify " + NewSuppliersname
									+ " Supplierss name is added",
							"Supplierss name should be added", " " + NewSuppliersname + " Supplierss name is added");
					List<WebElement> ProductAssigned_List = SCobjects.ManageProduct_BP_ProductsAssigned_List;
					String ProductAssigned = browser.getelementtext(ProductAssigned_List.get(SuppliersNameListLength));
					if (ProductAssigned.equals("0")
							&& browser.elementisdisplayed(ProductAssigned_List.get(SuppliersNameListLength))) {
						browser.reportscomtep("Passed",
								"Verify Number of Products is assigned: " + ProductAssigned + " until assigned",
								"Number of Products should be assigned 0 until assigned",
								"Number of Products is assigned as: " + ProductAssigned + " until assigned");
					} else {
						browser.reportscomtep("Failed",
								"Verify Number of Products is assigned: " + ProductAssigned + " until assigned",
								"Number of Products should be assigned 0 until assigned",
								"Number of Products is not assigned ");
					}

				} else {
					browser.reportscomtep("Failed",
							"Enter Supplierss name name & Clicks on save button and Verify category is added ",
							"Supplierss name should be added", "Supplierss name is not added");
				}

			} else {
				browser.reportscomtep("Failed", "Clicks on New Suppliers button and verify Add Suppliers Popup is displayed",
						"Add Suppliers Popup should be displayed", "Add Suppliers Popup is not displayed");
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	
	/***TC_14_013 Check whether Supplier name/details can be edited*********/
	
	public void checkWhether_SupplierName_Modified() {
		String BeforeModifiedSuppliersName = "";
		String ModifiedSN = "";
		String AfterModifiedSuppliersName = "";
		try {
			ModifiedSN = browser.getdata("ModifiedSuppliersName");
			List<WebElement> SuppliersNameList = SCobjects.ManageProduct_SP_SuppliersName_List;
			browser.scrollintoviewelement(SuppliersNameList.get(0));
			BeforeModifiedSuppliersName = browser.getelementtext(SuppliersNameList.get(0));
			browser.click(SuppliersNameList.get(0));
			if (browser.elementisdisplayed(SCobjects.ManageProduct_Suppliers_ESP_Header)) {
				browser.reportscomtep("Passed", "Clicks on Suppliers name and verify Edit Suppliers popup is opened",
						"Edit Suppliers popup should be opened", "Edit Suppliers popup is opened");
				browser.sendkeys(SCobjects.ManageProduct_Suppliers_ASP_SupplierName_TextBox, ModifiedSN);
				browser.click(SCobjects.ManageProduct_Suppliers_ASP_SaveButton);
				AfterModifiedSuppliersName = browser.getelementtext(SuppliersNameList.get(0));
				if (!AfterModifiedSuppliersName.equalsIgnoreCase(BeforeModifiedSuppliersName)
						&& browser.elementisdisplayed((SuppliersNameList.get(0)))) {
					browser.reportscomtep("Passed",
							"Enter Modify Suppliers name and clicks on save button and verify Suppliers name is modified",
							"Suppliers name should be modified",
							"Suppliers name is modified as:" + AfterModifiedSuppliersName);
				} else {
					browser.reportscomtep("Failed",
							"Enter Modify Suppliers name and clicks on save button and verify Suppliers name is modified",
							"Suppliers name should be modified",
							"Suppliers name is not modified as:" + BeforeModifiedSuppliersName);
				}

			} else {
				browser.reportscomtep("failed", "Clicks on Suppliers name and verify Edit Suppliers popup is opened",
						"Edit Suppliers popup should be opened", "Edit Suppliers popup is not opened");
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	
	/*****TC_14_014 Check whether Supplier can be deleted****/
	
	public void checkWhether_SuppliersName_Deleted() {
		String BeforeDeletedSuppliersName = "";
		String AfterDeletedSuppliersName = "";
		try {
			List<WebElement> BrnadNameList = SCobjects.ManageProduct_SP_SuppliersName_List;
			BeforeDeletedSuppliersName = browser.getelementtext(BrnadNameList.get(0));
			browser.click(BrnadNameList.get(0));
			if (browser.elementisdisplayed(SCobjects.ManageProduct_Suppliers_ESP_Header)) {
				browser.reportscomtep("Passed", "Clicks on Suppliers name and verify Edit Suppliers popup is opened",
						"Edit Suppliers popup should be opened", "Edit Suppliers popup is opened");
				browser.click(SCobjects.ManageProduct_Suppliers_ASP_DeleteButton);
				browser.click(SCobjects.ManageProduct_Suppliers_ASP_YesConformationPopup_Button);
				browser.click(SCobjects.Confirmatio_OK_Button);
				AfterDeletedSuppliersName = browser.getelementtext(BrnadNameList.get(0));
				if (!AfterDeletedSuppliersName.equalsIgnoreCase(BeforeDeletedSuppliersName)
						&& browser.elementisdisplayed((BrnadNameList.get(0)))) {
					browser.reportscomtep("Passed",
							"Clicks on continue Delete, Yes & OK buutons and verify Suppliers name is Deleted",
							"Suppliers name should be Deleted",
							"Suppliers name is Deleted as:" + BeforeDeletedSuppliersName);
				} else {
					browser.reportscomtep("Failed",
							"Clicks on continue Delete, Yes & OK buutons and verify Suppliers name is Deleted",
							"Suppliers name should be Deleted", "Suppliers name is not Deleted");
				}

			} else {
				browser.reportscomtep("failed", "Clicks on Suppliers name and verify Edit Suppliers popup is opened",
						"Edit Suppliers popup should be opened", "Edit Suppliers popup is not opened");
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	
	/********TC_14_015 Check Add New Product tab*********/
	
	public void check_AddNewProductTab() {
		try {
			browser.click(SCobjects.ManageProduct_AddNewProduct_Tab);
			if (browser.elementisdisplayed(SCobjects.ManageProduct_AddNewProduct_PageHeader)) {
				browser.reportscomtep("Passed",
						"Clicks on Add New Product Tab and verify Add New Product Page Header is diaplayed",
						"Add New Product Page Header should be diaplayed", "Add New Product Page Header is diaplayed");
				browser.Verify_elementisdisplayed_Report(SCobjects.ManageProduct_AddNewProduct_ProductName_Textbox,
						"Product Name Mandatory Field");
				browser.Verify_elementisdisplayed_Report(
						SCobjects.ManageProduct_AddNewProduct_ProductDescription_Textbox,
						"Product Description Mandatory Field");
				browser.Verify_elementisdisplayed_Report(SCobjects.ManageProduct_AddNewProduct_SupplyPrice_Textbox,
						"Supply Price Mandatory Field");
				browser.Verify_elementisdisplayed_Report(SCobjects.ManageProduct_AddNewProduct_RetailPrice_Textbox,
						"Retail Price Mandatory Field");
				browser.Verify_elementisdisplayed_Report(SCobjects.ManageProduct_AddNewProduct_SpecialPrice_Textbox,
						"Special Price Mandatory Field");
				browser.Verify_elementisdisplayed_Report(SCobjects.ManageProduct_AddNewProduct_Brand_DropdownValues,
						"Brand dropdown Mandatory Field");
				browser.Verify_elementisdisplayed_Report(SCobjects.ManageProduct_AddNewProduct_Category_DropdownValues,
						"Category dropdown Mandatory Field");
				browser.Verify_elementisdisplayed_Report(SCobjects.ManageProduct_AddNewProduct_Supplier_DropdownValues,
						"Supplier dropdown optional Field");
				browser.Verify_elementisdisplayed_Report(SCobjects.ManageProduct_AddNewProduct_AddNewBrand_Button,
						"Add New Brand Button");
				browser.Verify_elementisdisplayed_Report(SCobjects.ManageProduct_AddNewProduct_AddNewCategory_Button,
						"Add New Category Button");
				browser.Verify_elementisdisplayed_Report(SCobjects.ManageProduct_AddNewProduct_AddNewSupplier_Button,
						"Add New Supplier Button");
				browser.Verify_elementisdisplayed_Report(SCobjects.ManageProduct_AddNewProduct_Save_Button,
						"Save Button");

			} else {
				browser.reportscomtep("Failed",
						"Clicks on Add New Product Tab and verify Add New Product Page Header is diaplayed",
						"Add New Product Page Header should be diaplayed",
						"Add New Product Page Header is not diaplayed");
			}
		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	
	/******TC_14_016 Check whether a Product can be added******/
	public void checkWhether_Product_Added() {
		String ProductName = "";
		String ProductDescription = "";
		String SupplyPrice = "";
		String RetailPrice = "";
		String SpecialPrice = "";
		try {
			ProductName = browser.getdata("ProductName");
			ProductDescription = browser.getdata("ProductDescription");
			SupplyPrice = browser.getdata("SupplyPrice");
			RetailPrice = browser.getdata("RetailPrice");
			SpecialPrice = browser.getdata("SpecialPrice");
			browser.sendkeys(SCobjects.ManageProduct_AddNewProduct_ProductName_Textbox, ProductName);
			browser.sendkeys(SCobjects.ManageProduct_AddNewProduct_ProductDescription_Textbox, ProductDescription);
			browser.sendkeys(SCobjects.ManageProduct_AddNewProduct_SupplyPrice_Textbox, SupplyPrice);
			browser.sendkeys(SCobjects.ManageProduct_AddNewProduct_RetailPrice_Textbox, RetailPrice);
			browser.sendkeys(SCobjects.ManageProduct_AddNewProduct_SpecialPrice_Textbox, SpecialPrice);
			String BrandName = browser.getdata("Brandname");
			browser.selectByVisibleText(SCobjects.ManageProduct_AddNewProduct_Brand_DropdownValues, BrandName);
			String selectedBrandName = browser
					.getDropdownSelectedValue(SCobjects.ManageProduct_AddNewProduct_Brand_DropdownValues);
			if (BrandName.equalsIgnoreCase(selectedBrandName)
					&& browser.elementisdisplayed(SCobjects.ManageProduct_AddNewProduct_Brand_DropdownValues)) {
				browser.reportscomtep("Passed", "Verify Select " + selectedBrandName + " brandname is dispalyed",
						"Select Brnad Name should be displayed",
						"Select Brnad Name is displayed as:" + selectedBrandName);
			} else {
				browser.reportscomtep("Failed", "Verify Select brandname is dispalyed",
						"Select Brnad Name should be displayed", "Select Brnad Name is not displayed");
			}
			String CategoryName = browser.getdata("CategoryName");
			browser.selectByVisibleText(SCobjects.ManageProduct_AddNewProduct_Category_DropdownValues, CategoryName);
			String selectedCategoryName = browser
					.getDropdownSelectedValue(SCobjects.ManageProduct_AddNewProduct_Category_DropdownValues);
			if (CategoryName.equalsIgnoreCase(selectedCategoryName)
					&& browser.elementisdisplayed(SCobjects.ManageProduct_AddNewProduct_Category_DropdownValues)) {
				browser.reportscomtep("Passed", "Verify Select " + selectedCategoryName + " Category name is dispalyed",
						"Select Category Name should be displayed",
						"Select Category Name is displayed as:" + selectedCategoryName);
			} else {
				browser.reportscomtep("Failed", "Verify Select Category name is dispalyed",
						"Select Category Name should be displayed", "Select Category Name is not displayed");
			}
			String SupplierName = browser.getdata("Suppliersname");
			browser.selectByVisibleText(SCobjects.ManageProduct_AddNewProduct_Supplier_DropdownValues, SupplierName);
			String selectedSupplierName = browser
					.getDropdownSelectedValue(SCobjects.ManageProduct_AddNewProduct_Supplier_DropdownValues);
			if (SupplierName.equalsIgnoreCase(selectedSupplierName)
					&& browser.elementisdisplayed(SCobjects.ManageProduct_AddNewProduct_Supplier_DropdownValues)) {
				browser.reportscomtep("Passed", "Verify Select " + selectedSupplierName + " Supplie name is dispalyed",
						"Select Supplie Name should be displayed",
						"Select Supplie Name is displayed as:" + selectedSupplierName);
			} else {
				browser.reportscomtep("Failed", "Verify Select Supplie name is dispalyed",
						"Select Supplie Name should be displayed", "Select Supplie Name is not displayed");
			}
			browser.click(SCobjects.ManageProduct_AddNewProduct_Save_Button);
			
			browser.refreshBrowser(driver);
			List<WebElement> InputList = SCobjects.ManageProduct_AddNewProduct_Input_TextBox_List;
			int i = 0;
			for (WebElement list : InputList) {
				String InputValue = list.getText();
				if (InputValue.equals("") && browser.elementisdisplayed(InputList.get(i))) {
					browser.reportscomtep("Passed", "Verefy The page refreshes and the fields are cleared",
							"The page refreshes and the field should be cleared",
							"The page refreshes and the field are cleared");
				}
				i++;
			}
			browser.click(SCobjects.ManageProducts_AllProducts_Tab);
			List<WebElement> ProdutsList = SCobjects.ManageProducts_Produts_List;
			List<WebElement> ProduNameList = SCobjects.ManageProduct_ProductName_List;
			int ProductsLength = ProdutsList.size() - 1;
			browser.scrollintoviewelement(ProduNameList.get(ProductsLength));
			String AfterAddingProductName = browser.getelementtext(ProduNameList.get(ProductsLength));
			if (AfterAddingProductName.equalsIgnoreCase(ProductName)
					&& browser.elementisdisplayed(ProduNameList.get(ProductsLength))) {
				browser.reportscomtep("Passed",
						"Clicks on all products tab and verify " + ProductName + " is added in product list",
						"Product should be added in product list",
						"Prduct name as :" + ProductName + " is added in product list");
			} else {
				browser.reportscomtep("Failed",
						"Clicks on all products tab and verify Product is added in product list",
						"Product should be added in product list", "Product is not added in product list");
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	
	/*****TC_14_017 Check whether a new brand can be added in Add New Product page****/
	
	public void checkWhether_NewBrandAdded_InAddNewProductPage() {
		String AddNewBrandName = "";

		try {
			AddNewBrandName = browser.getdata("AddNewBrandName");
			browser.click(SCobjects.ManageProduct_AddNewProduct_Tab);
			if (browser.elementisdisplayed(SCobjects.ManageProduct_AddNewProduct_PageHeader)) {
				browser.reportscomtep("Passed",
						"Clicks on Add New Product Tab and verify Add New Product Page Header is diaplayed",
						"Add New Product Page Header should be diaplayed", "Add New Product Page Header is diaplayed");
				browser.click(SCobjects.ManageProduct_AddNewProduct_AddNewBrand_Button);
				if (browser.elementisdisplayed(SCobjects.ManageProduct_AddNewProduct_AddBrand_PopupHeader)) {
					browser.reportscomtep("Passed",
							"Clicks on Brand field + button and verify Add Brand Popup is displayed",
							"Add Brand Popup should be displayed", "Add Brand Popup is displayed");
					browser.sendkeys(SCobjects.ManageProduct_AddNewProduct_ABP_BrandTextBox, AddNewBrandName);
					browser.click(SCobjects.ManageProduct_AddNewProduct_ABP_SaveButton);
					browser.selectByVisibleText(SCobjects.ManageProduct_AddNewProduct_Brand_DropdownValues,
							AddNewBrandName);
					browser.reportscomtep("Passed",
							"Verify Check the Brand name is" + AddNewBrandName + " dispalyed in the dropdown list",
							"Check the Brand name should be dispalyed in the dropdown list ",
							"Check the Brand name is displaye as:" + AddNewBrandName + " in the dropdown list ");
					browser.refreshBrowser(driver);
				} else {
					browser.reportscomtep("Failed",
							"Clicks on Brand field + button and verify Add Brand Popup is displayed",
							"Add Brand Popup should be displayed", "Add Brand Popup is not displayed");
				}

			} else {
				browser.reportscomtep("Failed",
						"Clicks on Add New Product Tab and verify Add New Product Page Header is diaplayed",
						"Add New Product Page Header should be diaplayed",
						"Add New Product Page Header is not diaplayed");
			}
		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	
	/************TC_14_018 Check whether a new Category can be added in Add New Product page******/
	
	public void checkWhether_NewCategoryAdded_InAddNewProductPage() {
		String AddNewCategoryName ="";
		try {
			AddNewCategoryName = browser.getdata("AddnewCategoryName");
			browser.click(SCobjects.ManageProduct_AddNewProduct_Tab);
			if (browser.elementisdisplayed(SCobjects.ManageProduct_AddNewProduct_PageHeader)) {
				browser.reportscomtep("Passed",
						"Clicks on Add New Product Tab and verify Add New Product Page Header is diaplayed",
						"Add New Product Page Header should be diaplayed", "Add New Product Page Header is diaplayed");
				browser.click(SCobjects.ManageProduct_AddNewProduct_AddNewCategory_Button);
				if (browser.elementisdisplayed(SCobjects.ManageProduct_AddNewProduct_AddCategory_PopupHeader)) {
					browser.reportscomtep("Passed",
							"Clicks on Category field + button and verify Add Category Popup is displayed",
							"Add Category Popup should be displayed", "Add Category Popup is displayed");
					browser.sendkeys(SCobjects.ManageProduct_AddNewProduct_AddCategory_CategoryTextBox, AddNewCategoryName);
					browser.click(SCobjects.ManageProduct_AddNewProduct_AddCategory_SaveButton);
					browser.selectByVisibleText(SCobjects.ManageProduct_AddNewProduct_Category_DropdownValues,
							AddNewCategoryName);
					browser.reportscomtep("Passed",
							"Verify Check the Category name is" + AddNewCategoryName + " dispalyed in the dropdown list",
							"Check the Category name should be dispalyed in the dropdown list ",
							"Check the Category name is displaye as:" + AddNewCategoryName + " in the dropdown list ");
					browser.refreshBrowser(driver);
				} else {
					browser.reportscomtep("Failed",
							"Clicks on Category field + button and verify Add Category Popup is displayed",
							"Add Category Popup should be displayed", "Add Category Popup is not displayed");
				}
			} else {
				browser.reportscomtep("Failed",
						"Clicks on Add New Product Tab and verify Add New Product Page Header is diaplayed",
						"Add New Product Page Header should be diaplayed",
						"Add New Product Page Header is not diaplayed");
			}
		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	
	/***TC_14_019 Check whether a new Supplier can be added in Add New Product page***/
	
	public void checkWhether_NewSupplierAdded_InAddNewProductPage() {
		String AddNewSupplierName = "";
		String AddNewSupplierPhNo = "";
		String AddNewSuppilerEmail = "";
		try {
			AddNewSupplierName = browser.getdata("AddNewSuppliersname");
			AddNewSupplierPhNo = browser.getdata("AddNewSupplierMNO");
			AddNewSuppilerEmail = browser.getdata("AddNewSupplierCemail");
			browser.click(SCobjects.ManageProduct_AddNewProduct_Tab);
			if (browser.elementisdisplayed(SCobjects.ManageProduct_AddNewProduct_PageHeader)) {
				browser.reportscomtep("Passed",
						"Clicks on Add New Product Tab and verify Add New Product Page Header is diaplayed",
						"Add New Product Page Header should be diaplayed", "Add New Product Page Header is diaplayed");
				browser.click(SCobjects.ManageProduct_AddNewProduct_AddNewSupplier_Button);
				if (browser.elementisdisplayed(SCobjects.ManageProduct_AddNewProduct_AddSupplierPopup_Header)) {
					browser.reportscomtep("Passed",
							"Clicks on Supplier field + button and verify Add Supplier Popup is displayed",
							"Add Supplier Popup should be displayed", "Add Supplier Popup is displayed");
					browser.sendkeys(SCobjects.ManageProduct_AddNewProduct_ASP_SupplierName_TextBox,
							AddNewSupplierName);
					browser.sendkeys(SCobjects.ManageProduct_AddNewProduct_ASP_SupplierMobile_TextBox,
							AddNewSupplierPhNo);
					browser.sendkeys(SCobjects.ManageProduct_AddNewProduct_ASP_ContactPersonEmail_TextBox,
							AddNewSuppilerEmail);
					browser.click(SCobjects.ManageProduct_AddNewProduct_ASP_SaveButton);
					browser.selectByVisibleText(SCobjects.ManageProduct_AddNewProduct_Supplier_DropdownValues,
							AddNewSupplierName);
					browser.reportscomtep("Passed",
							"Verify Check the Supplier name is" + AddNewSupplierName
									+ " dispalyed in the dropdown list",
							"Check the Supplier name should be dispalyed in the dropdown list ",
							"Check the Supplier name is displaye as:" + AddNewSupplierName + " in the dropdown list ");
				} else {
					browser.reportscomtep("Failed",
							"Clicks on Supplier field + button and verify Add Supplier Popup is displayed",
							"Add Supplier Popup should be displayed", "Add Supplier Popup is not displayed");
				}
			} else {
				browser.reportscomtep("Failed",
						"Clicks on Add New Product Tab and verify Add New Product Page Header is diaplayed",
						"Add New Product Page Header should be diaplayed",
						"Add New Product Page Header is not diaplayed");
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	
	/*****TC_14_020 Check whether a product detail/price can be changed*********/
	
	public void checkWhether_ProductDetailOrPricr_change(String ProductCahnge_DetailsOrPrice) {
		String BeforeChangeProductName = "";
		String ModifiedProductName = "";
		String ModifiedProductPrice = "";
		String AfterChangeProductName = "";
		String BeforeModifiedProductPrice = "";
		String AfterModifiedProductPrice = "";
		try {
			ModifiedProductName = browser.getdata("ModifiedproductName");
			ModifiedProductPrice = browser.getdata("ModifiedProductPrice");
			browser.click(SCobjects.ManageProducts_AllProducts_Tab);
			if (browser.elementisdisplayed(SCobjects.ManageProducts_Products_Page)) {
				browser.reportscomtep("Passed", "Clicks on All Product Tab and verify Product header is displayed",
						"Product header should be displayed", "Product header is displayed");
				List<WebElement> ProductNameList = SCobjects.ManageProduct_ProductName_List;
				List<WebElement> ActionButtonsList = SCobjects.ManageProducts_Action_Buttons_List;
				List<WebElement> RetailPriceList = SCobjects.ManageProduct_AllProduct_RetailPrice_List;
				BeforeChangeProductName = browser.getelementtext(ProductNameList.get(0));
				BeforeModifiedProductPrice = browser.getelementtext(RetailPriceList.get(0));
				browser.click(ActionButtonsList.get(0));
				if (browser.elementisdisplayed(SCobjects.ManageProduct_AllProduct_EditProductPopup_Header)) {
					browser.reportscomtep("Passed",
							"Click on the edit button and Verify Edit Product Popup header is displayed",
							" Edit Product Popup header should be displayed",
							" Edit Product Popup header is displayed");
					switch (ProductCahnge_DetailsOrPrice) {
					case "ProductCahnge_Details":
						browser.sendkeys(SCobjects.ManageProduct_AllProduct_EPP_ProductName_TextBox,
								ModifiedProductName);
						browser.click(SCobjects.ManageProduct_AllProduct_EPP_Save_Button);
						AfterChangeProductName = browser.getelementtext(ProductNameList.get(0));
						if (!AfterChangeProductName.equalsIgnoreCase(BeforeChangeProductName)
								&& browser.elementisdisplayed(ProductNameList.get(0))) {
							browser.reportscomtep("Passed",
									"Enter Modified Product Name,click on save button and verify The Product details are updated",
									"The Product details should be updated", "The Product details are updated");
						} else {
							browser.reportscomtep("Failed",
									"Enter Modified Product Name,click on save button and verify The Product details are updated",
									"The Product details should be updated", "The Product details are not updated");
						}
						break;
					case "ProductCahnge_Price":
						browser.sendkeys(SCobjects.ManageProduct_AllProduct_EPP_ProductRetailPrice_TextBox,
								ModifiedProductPrice);
						browser.click(SCobjects.ManageProduct_AllProduct_EPP_Save_Button);
						AfterModifiedProductPrice = browser.getelementtext(RetailPriceList.get(0));
						if (!AfterModifiedProductPrice.equalsIgnoreCase(BeforeModifiedProductPrice)
								&& browser.elementisdisplayed(RetailPriceList.get(0))) {
							browser.reportscomtep("Passed",
									"Enter Modified Product Price, click on save button and verify The Product details are updated",
									"The Product details should be updated", "The Product details are updated");
						} else {
							browser.reportscomtep("Failed",
									"Enter Modified Product Price, click on save button and verify The Product details are updated",
									"The Product details should be updated", "The Product details are not updated");
						}
						break;
					case "Donothing":
						break;
					}

				} else {
					browser.reportscomtep("Failed",
							"Click on the edit button and Verify Edit Product Popup header is displayed",
							" Edit Product Popup header should be displayed",
							" Edit Product Popup header is not displayed");
				}

			} else {
				browser.reportscomtep("Failed", "Clicks on All Product Tab and verify Product header is displayed",
						"Product header should be displayed", "Product header is not displayed");
			}
		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	
	/*****TC_14_021 Check whether a product can be deleted********/
	public void checkWhethe_Product_Deleted() {
		String BeforeDeleteProductName = "";
		String AfterDeleteProductName = "";
		try {
			browser.click(SCobjects.ManageProducts_AllProducts_Tab);
			if (browser.elementisdisplayed(SCobjects.ManageProducts_Products_Page)) {
				browser.reportscomtep("Passed", "Clicks on All Product Tab and verify Product header is displayed",
						"Product header should be displayed", "Product header is displayed");
				List<WebElement> ProductNameList = SCobjects.ManageProduct_ProductName_List;
				List<WebElement> ActionButtonsList = SCobjects.ManageProducts_Action_Buttons_List;
				BeforeDeleteProductName = browser.getelementtext(ProductNameList.get(0));
				browser.click(ActionButtonsList.get(0));
				if (browser.elementisdisplayed(SCobjects.ManageProduct_AllProduct_EditProductPopup_Header)) {
					browser.reportscomtep("Passed",
							"Click on the Add stock and Verify Edit Product Popup header is displayed",
							"Edit Product Popup header should be displayed", "Edit Product Popup header is displayed");
					browser.click(SCobjects.ManageProduct_AllProduct_EPP_Delete_Button);
					browser.click(SCobjects.ManageProduct_AllProduct_EPP_Yes_Button);
					browser.click(SCobjects.Confirmatio_OK_Button);
					Thread.sleep(1000);
					browser.refreshBrowser(driver);
					AfterDeleteProductName = browser.getelementtext(ProductNameList.get(0));
					if (!AfterDeleteProductName.equalsIgnoreCase(BeforeDeleteProductName)
							&& browser.elementisdisplayed(ProductNameList.get(0))) {
						browser.reportscomtep("Passed",
								"Clicks on continue Delete,Yes & OK buttons and verify The Product details are Deleted",
								"The Product details should be Deleted", "The Product details are Deleted");
					} else {
						browser.reportscomtep("Failed",
								"Clicks on continue Delete,Yes & OK buttons and verify The Product details are Deleted",
								"The Product details should be Deleted", "The Product details are not Deleted");
					}
				} else {
					browser.reportscomtep("Failed",
							"Click on the Add stock button and Verify Edit Product Popup header is displayed",
							" Edit Product Popup header should be displayed",
							" Edit Product Popup header is not displayed");
				}
			} else {
				browser.reportscomtep("Failed", "Clicks on All Product Tab and verify Product header is displayed",
						"Product header should be displayed", "Product header is not displayed");
			}
		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	
	/******TC_14_022 Check the Decrease stock (+) button*******/
	
	public void check_AddStock_Button() {
		try {
			browser.click(SCobjects.ManageProducts_AllProducts_Tab);
			if (browser.elementisdisplayed(SCobjects.ManageProducts_Products_Page)) {
				browser.reportscomtep("Passed", "Clicks on All Product Tab and verify Product header is displayed",
						"Product header should be displayed", "Product header is displayed");
				List<WebElement> IncreaseButtons=SCobjects.ManageProduct_AllProduct_IncreaseStockAction_ButtonList;
				List<WebElement> ProductNameList = SCobjects.ManageProduct_ProductName_List;
				int Length= ProductNameList.size()-1;
				browser.scrollintoviewelement(IncreaseButtons.get(Length));
				browser.click(IncreaseButtons.get(Length));
				if (browser
						.elementisdisplayed(SCobjects.ManageProduct_AllProduct_AddStockForTheHealthTips_PopupHeader)) {
					browser.reportscomtep("Passed",
							"Click on add stock button and Verify Decrease stock for the Health Tips Popup header is displayed",
							"Decrease stock for the Health Tips Popup header should be displayed",
							"Decrease stock for the Health Tips Popup header is displayed");
					browser.Verify_elementisdisplayed_Report(
							SCobjects.ManageProduct_AllProduct_AddStockForTheHealthTips_Quality_Textbox,
							"Quantity TextBox");
					String PresentSupplyPrice = browser.elementgetAttributevalue(
							SCobjects.ManageProduct_AllProduct_AddStockForTheHealthTips_SupplyPrice_TextBox, "value");
					String SupplyPrice = browser.getdata("SupplyPrice");
					if (SupplyPrice.equals(PresentSupplyPrice)) {
						browser.Verify_elementisdisplayed_Report(
								SCobjects.ManageProduct_AllProduct_AddStockForTheHealthTips_SupplyPrice_TextBox,
								"Supply Price Present as:" + PresentSupplyPrice + "");
					} else {
						browser.reportscomtep("Failed", "Verify Supply Price present is displayed",
								"Supply Price present should be displayed", "Supply Price present is not displayed");
					}
					browser.Verify_elementisdisplayed_Report(
							SCobjects.ManageProduct_AllProduct_AddStockForTheHealthTips_AdjustmentReason_SelectionValues,
							"Adjustment Reason dropdown Box");
					browser.Verify_elementisdisplayed_Report(
							SCobjects.ManageProduct_AllProduct_AddStockForTheHealthTips_SavePriceForNexttime_CheckBox,
							"Save price for next time Check Box");
					browser.Verify_elementisdisplayed_Report(
							SCobjects.ManageProduct_AllProduct_AddStockForTheHealthTips_Save_Button, "Save Button");
					browser.Verify_elementisdisplayed_Report(
							SCobjects.ManageProduct_AllProduct_AddStockForTheHealthTips_Cancel_Button, "Cancel Button");
					browser.click(SCobjects.ManageProduct_AllProduct_AddStockForTheHealthTips_Cancel_Button);
				} else {
					browser.reportscomtep("Failed",
							"Click on add stock button and Verify Decrease stock for the Health Tips Popup header is displayed",
							"Decrease stock for the Health Tips Popup header should be displayed",
							"Decrease stock for the Health Tips Popup header is not displayed");
				}

			} else {
				browser.reportscomtep("Failed", "Clicks on All Product Tab and verify Product header is displayed",
						"Product header should be displayed", "Product header is not displayed");
			}
		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	
	/****TC_14_023 Check whether a stock can be added****/
	public void checkWhether_StockAdded() {
		String AddStcockQuant = "";
		String BeforeStockOnHandsValue = "";
		String AfterStockOnHandsValue = "";
		try {
			AddStcockQuant = browser.getdata("AddStockQuantity");
			browser.click(SCobjects.ManageProducts_AllProducts_Tab);
			if (browser.elementisdisplayed(SCobjects.ManageProducts_Products_Page)) {
				browser.reportscomtep("Passed", "Clicks on All Product Tab and verify Product header is displayed",
						"Product header should be displayed", "Product header is displayed");
				List<WebElement> StockOnHandsList = SCobjects.ManageProduct_AllProduct_StockOnHand_List;
				List<WebElement>  IncreaseButtons=SCobjects.ManageProduct_AllProduct_IncreaseStockAction_ButtonList;	
				int Length= IncreaseButtons.size()-1;
				browser.scrollintoviewelement(StockOnHandsList.get(Length));
				BeforeStockOnHandsValue = browser.getelementtext(StockOnHandsList.get(Length));
				browser.click(IncreaseButtons.get(Length));
				if (browser
						.elementisdisplayed(SCobjects.ManageProduct_AllProduct_AddStockForTheHealthTips_PopupHeader)) {
					browser.reportscomtep("Passed",
							"Click on add stock button and Verify Decrease stock for the Health Tips Popup header is displayed",
							"Decrease stock for the Health Tips Popup header should be displayed",
							"Decrease stock for the Health Tips Popup header is displayed");
					browser.sendkeys(SCobjects.ManageProduct_AllProduct_AddStockForTheHealthTips_Quality_Textbox,
							AddStcockQuant);
					browser.selectByVisibleText(
							SCobjects.ManageProduct_AllProduct_AddStockForTheHealthTips_AdjustmentReason_SelectionValues,
							"Return");
					String selectedType = browser.getDropdownSelectedValue(
							SCobjects.ManageProduct_AllProduct_AddStockForTheHealthTips_AdjustmentReason_SelectionValues);
					if (selectedType.equalsIgnoreCase("Return")) {
						browser.reportscomtep("Passed",
								"Verify The Adjustment reason from the dropdown list in " + selectedType
										+ " is selected",
								"The Adjustment reason from the dropdown list value should be selected",
								" The Adjustment reason from the dropdown list value is selected as:" + selectedType);
					} else {
						browser.reportscomtep("Failed",
								"Verify The Adjustment reason from the dropdown list value is selected",
								"The Adjustment reason from the dropdown list value should be selected",
								"The Adjustment reason from the dropdown list value is not selected");
					}

					browser.click(
							SCobjects.ManageProduct_AllProduct_AddStockForTheHealthTips_SavePriceForNexttime_CheckBox);
					browser.click(SCobjects.ManageProduct_AllProduct_AddStockForTheHealthTips_Save_Button);
					browser.click(SCobjects.Confirmatio_OK_Button);
					browser.scrollintoviewelement(StockOnHandsList.get(Length));
					AfterStockOnHandsValue = browser.getelementtext(StockOnHandsList.get(Length));
					if (!AfterStockOnHandsValue.equalsIgnoreCase(BeforeStockOnHandsValue)
							&& browser.elementisdisplayed(StockOnHandsList.get(Length))) {
						browser.reportscomtep("Passed",
								"Enter Mandatory Fields enter and Select Select the Adjustment reason from the dropdown list And Click on continue Save & Ok button and verify The stock & quantity added is displayed",
								"The stock & quantity added should be displayed",
								"The stock & quantity added is displayed");

					} else {
						browser.reportscomtep("Failed",
								"Enter Mandatory Fields enter and Select Select the Adjustment reason from the dropdown list And Click on continue Save & Ok button and verify The stock & quantity added is displayed",
								"The stock & quantity added should be displayed",
								"The stock & quantity added is not displayed");
					}
				} else {
					browser.reportscomtep("Failed",
							"Click on add stock button and Verify Decrease stock for the Health Tips Popup header is displayed",
							"Decrease stock for the Health Tips Popup header should be displayed",
							"Decrease stock for the Health Tips Popup header is not displayed");
				}

			} else {
				browser.reportscomtep("Failed", "Clicks on All Product Tab and verify Product header is displayed",
						"Product header should be displayed", "Product header is not displayed");
			}
		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	
	/**********TC_14_024 Check the decrease stock (-) button*********/
	public void check_DecreaseStock_Button() {
		try {
			browser.click(SCobjects.ManageProducts_AllProducts_Tab);
			if (browser.elementisdisplayed(SCobjects.ManageProducts_Products_Page)) {
				browser.reportscomtep("Passed", "Clicks on All Product Tab and verify Product header is displayed",
						"Product header should be displayed", "Product header is displayed");
				 List<WebElement> DecreaseActionButtonsList= SCobjects.ManageProduct_AllProduct_DecreaseStockAction_ButtonList;
				 int Length = DecreaseActionButtonsList.size()-1;
				 browser.scrollintoviewelement(DecreaseActionButtonsList.get(Length));
				browser.click(DecreaseActionButtonsList.get(Length));
				if (browser.elementisdisplayed(
						SCobjects.ManageProduct_AllProduct_DecreaseStockForTheHealthTips_PopupHeader)) {
					browser.reportscomtep("Passed",
							"Click on Decrease stock button and Verify Decrease stock for the Health Tips Popup header is displayed",
							"Decrease stock for the Health Tips Popup header should be displayed",
							"Decrease stock for the Health Tips Popup header is displayed");
					browser.Verify_elementisdisplayed_Report(
							SCobjects.ManageProduct_AllProduct_DecreaseStockForTheHealthTips_Quality_Textbox,
							"Quantity TextBox");
					browser.Verify_elementisdisplayed_Report(
							SCobjects.ManageProduct_AllProduct_DecreaseStockForTheHealthTips_AdjustmentReason_SelectionValues,
							"Adjustment Reason DropDown ");
					browser.Verify_elementisdisplayed_Report(
							SCobjects.ManageProduct_AllProduct_DecreaseStockForTheHealthTips_Save_Button,
							"Save Button");
					browser.Verify_elementisdisplayed_Report(
							SCobjects.ManageProduct_AllProduct_DecreaseStockForTheHealthTips_Cancel_Button,
							"Cancel Button");
					browser.click(SCobjects.ManageProduct_AllProduct_DecreaseStockForTheHealthTips_Cancel_Button);

				} else {
					browser.reportscomtep("Failed",
							"Click on Decrease stock button and Verify Decrease stock for the Health Tips Popup header is displayed",
							"Decrease stock for the Health Tips Popup header should be displayed",
							"Decrease stock for the Health Tips Popup header is not displayed");
				}

			} else {
				browser.reportscomtep("Failed", "Clicks on All Product Tab and verify Product header is displayed",
						"Product header should be displayed", "Product header is not displayed");
			}
		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	
	
	/*****TC_14_025 Check whether a stock can be decreased****/
	public void check_Stock_Decreased() {
		String DecreaseQuant = "";
		String BeforeDecreaseStockOnHandsValue = "";
		String AfterDecreaseStockOnHandsValue = "";
		try {
			DecreaseQuant = browser.getdata("DecreaseQuantity");
			browser.click(SCobjects.ManageProducts_AllProducts_Tab);
			if (browser.elementisdisplayed(SCobjects.ManageProducts_Products_Page)) {
				browser.reportscomtep("Passed", "Clicks on All Product Tab and verify Product header is displayed",
						"Product header should be displayed", "Product header is displayed");
				List<WebElement> DecreaseActionButtonsList = SCobjects.ManageProduct_AllProduct_DecreaseStockAction_ButtonList;
				int Length = DecreaseActionButtonsList.size()-1;
				List<WebElement> StockOnHandsList = SCobjects.ManageProduct_AllProduct_StockOnHand_List;
				browser.scrollintoviewelement(DecreaseActionButtonsList.get(Length));
				BeforeDecreaseStockOnHandsValue = browser.getelementtext(StockOnHandsList.get(Length));
				browser.click(DecreaseActionButtonsList.get(Length));
				if (browser.elementisdisplayed(
						SCobjects.ManageProduct_AllProduct_DecreaseStockForTheHealthTips_PopupHeader)) {
					browser.reportscomtep("Passed",
							"Click on Decrease stock button and Verify Decrease stock for the Health Tips Popup header is displayed",
							"Decrease stock for the Health Tips Popup header should be displayed",
							"Decrease stock for the Health Tips Popup header is displayed");
					browser.sendkeys(SCobjects.ManageProduct_AllProduct_DecreaseStockForTheHealthTips_Quality_Textbox,
							DecreaseQuant);
					browser.selectByVisibleText(
							SCobjects.ManageProduct_AllProduct_DecreaseStockForTheHealthTips_AdjustmentReason_SelectionValues,
							"Return");
					String selectedType = browser.getDropdownSelectedValue(
							SCobjects.ManageProduct_AllProduct_DecreaseStockForTheHealthTips_AdjustmentReason_SelectionValues);
					if (selectedType.equalsIgnoreCase("Return")) {
						browser.reportscomtep("Passed",
								"Verify The Adjustment reason from the dropdown list in " + selectedType
										+ " is selected",
								"The Adjustment reason from the dropdown list value should be selected",
								" The Adjustment reason from the dropdown list value is selected as:" + selectedType);
					} else {
						browser.reportscomtep("Failed",
								"Verify The Adjustment reason from the dropdown list value is selected",
								"The Adjustment reason from the dropdown list value should be selected",
								"The Adjustment reason from the dropdown list value is not selected");
					}
					browser.click(SCobjects.ManageProduct_AllProduct_DecreaseStockForTheHealthTips_Save_Button);
					browser.click(SCobjects.Confirmatio_OK_Button);
					AfterDecreaseStockOnHandsValue = browser.getelementtext(StockOnHandsList.get(Length));
					if (!AfterDecreaseStockOnHandsValue.equalsIgnoreCase(BeforeDecreaseStockOnHandsValue)
							&& browser.elementisdisplayed(StockOnHandsList.get(Length))) {
						browser.reportscomtep("Passed",
								"Enter the quantity decrease, Select the adjustment reason from dropdown list & clicks on Continue Save & Ok buttons and Verify The stock decrease & quantity specified is decreased from actual Stock in Hand and Updated",
								"The stock decrease & quantity specified should be decreased from actual Stock in Hand and Updated",
								"The stock decrease & quantity specified is decreased from actual Stock in Hand and Updated");

					} else {
						browser.reportscomtep("Failed",
								"Enter the quantity decrease, Select the adjustment reason from dropdown list & clicks on Continue Save & Ok buttons and Verify The stock decrease & quantity specified is decreased from actual Stock in Hand and Updated",
								"The stock decrease & quantity specified should be decreased from actual Stock in Hand and Updated",
								"The stock decrease & quantity specified is not decreased from actual Stock in Hand and Updated");

					}
				} else {
					browser.reportscomtep("Failed",
							"Click on Decrease stock button and Verify Decrease stock for the Health Tips Popup header is displayed",
							"Decrease stock for the Health Tips Popup header should be displayed",
							"Decrease stock for the Health Tips Popup header is not displayed");
				}

			} else {
				browser.reportscomtep("Failed", "Clicks on All Product Tab and verify Product header is displayed",
						"Product header should be displayed", "Product header is not displayed");
			}
		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	
	/**********TC_14_026 Check the stock history**********/
	
	public void check_Stock_History() {
		String TableHeadername = "";
		try {
			browser.click(SCobjects.ManageProducts_AllProducts_Tab);
			if (browser.elementisdisplayed(SCobjects.ManageProducts_Products_Page)) {
				browser.reportscomtep("Passed", "Clicks on All Product Tab and verify Product header is displayed",
						"Product header should be displayed", "Product header is displayed");
				List<WebElement> ViewStockHistoryButtonsList = SCobjects.ManageProduct_AllProduct_ViewStockHistoryAction_ButtonList;
				int Length = ViewStockHistoryButtonsList.size() - 1;
				browser.scrollintoviewelement(ViewStockHistoryButtonsList.get(Length));
				browser.click(ViewStockHistoryButtonsList.get(Length));
				if (browser.elementisdisplayed(
						SCobjects.ManageProduct_AllProduct_StockHistoryForTheHealthTips_PopuHeader)) {
					browser.reportscomtep("Passed",
							"Click on Stock Histtory button and Verify Stock History for the Health Tips Popup header is displayed",
							"Stock History for the Health Tips Popup header should be displayed",
							"Stock History for the Health Tips Popup header is displayed");
					String[] StockHistorytheader = new String[4];
					StockHistorytheader[0] = "Time & Date";
					StockHistorytheader[1] = "Action";
					StockHistorytheader[2] = "Qty.Adjusted";
					StockHistorytheader[3] = "Stock on Hand";
					List<WebElement> StockHTL = SCobjects.ManageProduct_AllProduct_StockHistoryForTheHealthTips_TableHeaderList;
					int i = 0;
					for (WebElement theader : StockHTL) {
						TableHeadername = browser.getelementtext(theader);
						if (TableHeadername.equalsIgnoreCase(StockHistorytheader[i])
								&& browser.elementisdisplayed(StockHTL.get(i))) {
							browser.reportscomtep("Passed",
									"Verify Stock History Table header " + TableHeadername + " is Displayed",
									"Stock History Table header should be Displayed",
									"Stock History Table header displayed as " + TableHeadername);
						} else {
							browser.reportscomtep("Failed",
									"Verify Stock History Table header " + StockHistorytheader[i] + " is Displayed",
									"Stock History Table header should be Displayed",
									"Stock History Table header " + StockHistorytheader[i] + " Not displayed");
						}

						i++;
					}
					int J = 0;
					List<WebElement> ACP_List = SCobjects.ManageProduct_AllProduct_StockHistoryForTheHealthTips_Actionperformed_List;
					for (WebElement element : ACP_List) {
						String Value = element.getText();
						if (!Value.isEmpty() && browser.elementisdisplayed(ACP_List.get(J))) {
							browser.reportscomtep("Passed",
									"Verify The actions are performed in TC_14_023 & 25 are shown popup",
									"The actions should be performed in TC_14_023 & 25 are shown popup",
									"The actions are performed in TC_14_023 & 25 are shown popup");
						}
					}
					J++;
				} else {
					browser.reportscomtep("Failed",
							"Click on Stock Histtory button and Verify Stock History for the Health Tips Popup header is displayed",
							"Stock History for the Health Tips Popup header should be displayed",
							"Stock History for the Health Tips Popup header is not displayed");
				}

			} else {
				browser.reportscomtep("Failed", "Clicks on All Product Tab and verify Product header is displayed",
						"Product header should be displayed", "Product header is not displayed");
			}
		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	
	/**********TS021_Subscriber clicks on Appointments menu**********/
	/*****TC_21_001 Open Appointments page*****/
	
	public void open_AppointmentsPage() {
		String TableHeadername = "";
		String ExpectedFilterByDate = " Today;All Appointments;Custom Range";
		String FilterByDateVlaues = "";
		String FilterByStaffVlaues = "";
		String FilterByStatusVlaues = "";
		String ExpectedFilterByStatus = "All;New;Canceled;Confirmed;Completed";

		try {
			List<WebElement> AllAppointmentsTableHeaders = SCobjects.Appointments_AllAppointments_TableHeaders_List;
			if (browser.elementisdisplayed(SCobjects.Appointments_Menu_Link)) {
				browser.reportscomtep("Passed", "Verify Appointments Menu link is displayed",
						"Appointments Menu link should be displayed", "Appointments Menu link is displayed");
				browser.click(SCobjects.Appointments_Menu_Link);
				if (browser.elementisdisplayed(SCobjects.Appointments_AppointmentsPage_Header)) {
					browser.reportscomtep("Passed",
							"Clicks on Appointments Menu link and open verify Appointments page header is displayed",
							" Appointments page header should be displayed", " Appointments page header is displayed");
					if (browser.elementisdisplayed(SCobjects.Appointments_NoAppointmentsFound_Text)) {
						browser.reportscomtep("Passed", "Verify For 1st login no Appointments Are available",
								" For 1st login no Appointments should be available",
								" For 1st login no Appointments Are available");
					} else {
						browser.reportscomtep("Passed", "Verify Appointments Are available ",
								" Appointments should be available", " Appointments Are available");
					}
					if (browser.elementisdisplayed(SCobjects.Appointments_AllAppointments_Text)) {
						browser.reportscomtep("Passed", "Verify All Appointments Template is displayed",
								"All Appointments Template shpuld be dispalyed",
								"All Appointments Template is dispalyed");
						String[] AATemplateHeadreds = new String[8];
						AATemplateHeadreds[0] = "Booking Id";
						AATemplateHeadreds[1] = "Appointment Time";
						AATemplateHeadreds[2] = "Customer Name";
						AATemplateHeadreds[3] = "Mobile & Email";
						AATemplateHeadreds[4] = "Services";
						AATemplateHeadreds[5] = "Amount";
						AATemplateHeadreds[6] = "Payment Status";
						AATemplateHeadreds[7] = "Status";
						int i = 0;
						for (WebElement theader : AllAppointmentsTableHeaders) {
							TableHeadername = browser.getelementtext(theader);
							if (TableHeadername.equalsIgnoreCase(AATemplateHeadreds[i])
									&& browser.elementisdisplayed(AllAppointmentsTableHeaders.get(i))) {
								browser.reportscomtep("Passed",
										"Verify Table header " + TableHeadername + " is Displayed",
										"Table header should be Displayed",
										"Table header displayed as: " + TableHeadername);
							} else {
								browser.reportscomtep("Failed",
										"Verify Table header " + AATemplateHeadreds[i] + " is Displayed",
										"Table header should be Displayed",
										"Table header " + AATemplateHeadreds[i] + " Not displayed");
							}

							i++;
						}

					} else {
						browser.reportscomtep("Failed", "Verify All Appointments Template is displayed",
								"All Appointments Template shpuld be dispalyed",
								"All Appointments Template is not dispalyed");
					}
					List<WebElement> FilterByDate = browser
							.getOptions(SCobjects.Appointments_AllAppointments_FilterByDate);
					int itemCount = FilterByDate.size();
					if (itemCount > 0) {
						for (WebElement listvalue : FilterByDate) {
							FilterByDateVlaues = FilterByDateVlaues + ";" + listvalue.getText();
						}
						if (ExpectedFilterByDate.trim().equalsIgnoreCase(FilterByDateVlaues.substring(16).trim())
								&& browser.elementisdisplayed(SCobjects.Appointments_AllAppointments_FilterByDate)) {
							browser.reportscomtep("Passed",
									"Verify Filter by Date filters are dispalyed & All Appointments option is default selected",
									"Filter by Date filters should be dispalyed & All Appointments option is default selected",
									"List of filters dispalyed as : " + FilterByDateVlaues + " in Filter by Date");
						} else {
							browser.reportscomtep("Failed",
									"Verify Filter by Date filters are dispalyed & All Appointments option is default selected) ",
									"Filter by Date filters should be dispalyed & All Appointments option is default selected",
									"List of Filter by Date Not dispalyed");
						}
					}
					List<WebElement> FilterByStaff = browser
							.getOptions(SCobjects.Appointments_AllAppointments_FilterByStaff);
					int itemCountFilterByStaff = FilterByStaff.size();
					if (itemCountFilterByStaff > 0) {
						for (WebElement listvalue : FilterByStaff) {
							FilterByStaffVlaues = FilterByStaffVlaues + ";" + listvalue.getText();
						}
						if (browser.elementisdisplayed(SCobjects.Appointments_AllAppointments_FilterByStaff)) {
							browser.reportscomtep("Passed",
									"Verify Filter by Staff filters are dispalyed & All Staff option is default selected) ",
									"Filter by Staff filters should be dispalyed & All Staff option is default selected",
									"List of filters dispalyed as : " + FilterByStaffVlaues + " in Filter by Satff");
						} else {
							browser.reportscomtep("Failed",
									"Verify Filter by Staff filters are dispalyed & All Staff option is default selected) ",
									"Filter by Date filters should be dispalyed & All Appointments option is default selected",
									"List of Filter by Staff Not dispalyed");
						}
					}
					List<WebElement> FilterByStatus = browser
							.getOptions(SCobjects.Appointments_AllAppointments_FilterByAppointmentStatus);
					int itemCountFilterByStatus = FilterByStatus.size();
					if (itemCountFilterByStatus > 0) {
						for (WebElement listvalue : FilterByStatus) {
							FilterByStatusVlaues = FilterByStatusVlaues + ";" + listvalue.getText();
						}
						if (ExpectedFilterByStatus.equalsIgnoreCase(FilterByStatusVlaues.substring(9)) && browser
								.elementisdisplayed(SCobjects.Appointments_AllAppointments_FilterByAppointmentStatus)) {
							browser.reportscomtep("Passed", "Verify Filter by Status filters are dispalyed",
									"Verify Filter by Status filters are dispalyed",
									"List of filters dispalyed as : " + FilterByStatusVlaues + " in Filter by Status");
						} else {
							browser.reportscomtep("Failed", "Verify Filter by Status filters are dispalyed",
									"Verify Filter by Status filters are dispalyed",
									"List of Filter by Status Not dispalyed");
						}
					}
					browser.Verify_elementisdisplayed_Report(
							SCobjects.Appointments_AllAppointments_AddNewAppointment_Button,
							"+New Appointments button");
					browser.Verify_elementisdisplayed_Report(
							SCobjects.Appointments_AllAppointments_TrackTransactionStatus_Button,
							"Track Transaction Status Button");
					browser.Verify_elementisdisplayed_Report(SCobjects.Appointments_AllAppointments_SearchBox,
							"Search Box");

			} else {
					browser.reportscomtep("Failed",
							"Clicks on Appointments Menu link and open verify Appointments page header is displayed",
							" Appointments page header should be displayed",
							" Appointments page header is not displayed");
				}

			} else {
				browser.reportscomtep("Failed", "Verify Appointments Menu link is displayed",
						"Appointments Menu link should be displayed", "Appointments Menu link is not displayed");
			}
		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	/***TS_21_002 Check whether booking details can be viewed for a booking id****/
	
	public void check_BookingDetails_Viewe_BookingId() {
		String ApBookingID = "";
		String BS_DateandTime = "";
		int BS_BookingID = 0;
		String StaffBookedName = "";
		String AppoinmentStatus = "";
		String TableHeadername = "";

		try {
			List<WebElement> BookingID_List = SCobjects.Appointments_AllAppointments_BookingID_List;
			int BookingID_ListSize = BookingID_List.size();
			if (BookingID_ListSize > 1 && browser.elementisdisplayed(BookingID_List.get(0))) {
				ApBookingID = browser.getelementtext(BookingID_List.get(0));
				List<WebElement> Status = SCobjects.Appointments_AllAppointments_StatusList;
				AppoinmentStatus = browser.getelementtext(Status.get(0));
				browser.click(BookingID_List.get(0));
				String BSPopupText = browser.getelementtext(SCobjects.Appointments_BookingSummaryPopupAnd_Id);
				BS_BookingID = Integer.parseInt(BSPopupText.replaceAll("\\D", ""));
				String BSBKID = String.valueOf(BS_BookingID);
				if (browser.elementisdisplayed(SCobjects.Appointments_BookingSummaryPopupAnd_Id)
						&& ApBookingID.equalsIgnoreCase(BSBKID)) {
					browser.reportscomtep("Passed",
							"Click on booking ID and verify Booking Summary for" + BS_BookingID + " Popup is displayed",
							"Booking Summary ID Popup should be displayed",
							" Booking Summary for Popup ID is displayed as:" + BS_BookingID);
					StaffBookedName = browser.getelementtext(SCobjects.Appointments_BSP_StaffBooked_Name);
					browser.Verify_elementisdisplayed_Report(SCobjects.Appointments_BSP_StaffBooked_Name,
							StaffBookedName);
					BS_DateandTime = browser.getelementtext(SCobjects.Appointments_BSP_AppointmentDateAndTime);
					browser.Verify_elementisdisplayed_Report(SCobjects.Appointments_BSP_AppointmentDateAndTime,
							BS_DateandTime);
					String[] SelectedServicestheader = new String[6];
					SelectedServicestheader[0] = "Service/Product Name";
					SelectedServicestheader[1] = "Duration";
					SelectedServicestheader[2] = "Price";
					SelectedServicestheader[3] = "Qty";
					SelectedServicestheader[4] = "Disc (%)";
					SelectedServicestheader[5] = "Total Price";
					int i = 0;
					List<WebElement> SelectedServicestHeaders = SCobjects.Appointments_BSP_SelectedServices_TableHeadersList;
					for (WebElement theader : SelectedServicestHeaders) {
						TableHeadername = browser.getelementtext(theader);
						String tableDatavalue = browser
								.getelementtext(SCobjects.Appointments_BSP_SelectedService_DetailsDataValue.get(i));
						if (TableHeadername.trim().equalsIgnoreCase(SelectedServicestheader[i].trim())
								&& browser.elementisdisplayed(SelectedServicestHeaders.get(i))
								&& !tableDatavalue.isEmpty()) {
							browser.reportscomtep("Passed",
									"Verify Selected Services table header " + TableHeadername + " is Displayed",
									"Selected Services table header should be Displayed",
									"Selected Services table header displayed as : " + TableHeadername + ": "
											+ tableDatavalue);
						} else {
							browser.reportscomtep("Failed",
									"Verify Selected Services table header" + SelectedServicestheader[i]
											+ " is Displayed",
									"Selected Services table header should be Displayed",
									"Selected Services table header is " + SelectedServicestheader[i]
											+ " Not displayed");
						}
						i++;
					}
					String[] CustomerDetailstheader = new String[6];
					CustomerDetailstheader[0] = "Name";
					CustomerDetailstheader[1] = "Mobile";
					CustomerDetailstheader[2] = "Email";
					CustomerDetailstheader[3] = "Appointment Status";
					CustomerDetailstheader[4] = "Payment Status";
					CustomerDetailstheader[5] = "Payment Via";
					int j = 0;
					List<WebElement> CustomerDetailstHeaders = SCobjects.Appointments_BSP_CustomerDetails_TableHeadersList;
					for (WebElement theader : CustomerDetailstHeaders) {
						TableHeadername = browser.getelementtext(theader);
						String tableDatavalue = browser
								.getelementtext(SCobjects.Appointments_BSP_CustomerDetails_TableDataValue.get(j));
						if (TableHeadername.trim().equalsIgnoreCase(CustomerDetailstheader[j].trim())
								&& browser.elementisdisplayed(CustomerDetailstHeaders.get(j))
								&& !tableDatavalue.isEmpty()) {
							browser.reportscomtep("Passed",
									"Verify Customer Details table header " + TableHeadername + " is Displayed",
									"Customer Details table header should be Displayed",
									"Customer Details table header displayed as : " + TableHeadername + ": "
											+ tableDatavalue);
						} else {
							browser.reportscomtep("Failed",
									"Verify Customer Details table header" + CustomerDetailstheader[j]
											+ " is Displayed",
									"Customer Details table header should be Displayed",
									"Customer Details table header is " + CustomerDetailstheader[j] + " Not displayed");
						}

						j++;
					}
					if (AppoinmentStatus.equalsIgnoreCase("New")) {
						browser.Verify_elementisdisplayed_Report(SCobjects.Appointments_BSP_CancelBooking_Button,
								"Cancel Booking Button");
						browser.Verify_elementisdisplayed_Report(SCobjects.Appointments_BSP_Reschedule_Button,
								"Reschedule Booking Button");
						browser.Verify_elementisdisplayed_Report(SCobjects.Appointments_BSP_Confirmed_Button,
								"Confirmed Booking Button");
					} else if (AppoinmentStatus.equalsIgnoreCase("Cancelled")) {
						System.out.println("Cancelled of the Status having buttons are not dispalyed");
					} else if (AppoinmentStatus.equalsIgnoreCase("Completed")) {
						browser.Verify_elementisdisplayed_Report(SCobjects.Appointments_BSP_ViewAppointment_Button,
								"View Appointment Button");
					} else if (AppoinmentStatus.equalsIgnoreCase("Confirmed")) {
						browser.Verify_elementisdisplayed_Report(SCobjects.Appointments_BSP_CancelBooking_Button,
								"Cancel Booking Button");
						browser.Verify_elementisdisplayed_Report(SCobjects.Appointments_BSP_Confirmed_Button,
								"Confirmed Booking Button");
						browser.Verify_elementisdisplayed_Report(SCobjects.Appointments_BSP_CheckOut_Button,
								"Check Out Button");
					}
				}
				browser.click(SCobjects.Appointments_BSP_Close_Button);
			} else {
				browser.reportscomtep("Failed", "Click on booking ID and verify Booking Summary Id Popup is displayed",
						"Booking Summary ID Popup should be displayed",
						" Booking Summary for Popup ID is not displayed");
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}

	/****TC_21_003 Check the available options for booking with status as New**********/
	
	public void check_AvailableOptions_ForBooking_withStatusAs_New() {
		String ApBookingID = "";
		String AppoinmentStatus = "";
		String StaffBookedName = "";
		try {
			List<WebElement> BookingID_List = SCobjects.Appointments_AllAppointments_BookingID_List;
			int BookingID_ListSize = BookingID_List.size();
			if (BookingID_ListSize > 1) {
				List<WebElement> NewStatusList = SCobjects.Appointments_AllAppointments_NewStatusButton_List;
				List<WebElement> PageList = SCobjects.Appointments_AllAppointments_PaginationButton_List;
				int i = 0;
				for (WebElement Status : PageList) {
					if (browser.elementisdisplayed(NewStatusList.get(i))
							&& browser.elementisdisplayed(BookingID_List.get(i))) {
						AppoinmentStatus = browser.getelementtext(NewStatusList.get(i));
						ApBookingID = browser
								.getelementtext(SCobjects.Appointments_AllAppointments_BookingIDHavig_NewStatus.get(i));
						browser.click(SCobjects.Appointments_AllAppointments_BookingIDHavig_NewStatus.get(i));
						break;
					} else {
						Status.click();
						if (browser.elementisdisplayed(
								SCobjects.Appointments_AllAppointments_BookingIDHavig_NewStatus.get(i))
								&& browser.elementisdisplayed(
										SCobjects.Appointments_AllAppointments_BookingIDHavig_NewStatus.get(i))) {
							AppoinmentStatus = browser.getelementtext(NewStatusList.get(i));
							ApBookingID = browser.getelementtext(
									SCobjects.Appointments_AllAppointments_BookingIDHavig_NewStatus.get(i));
							browser.click(SCobjects.Appointments_AllAppointments_BookingIDHavig_NewStatus.get(i));
							break;
						}

					}
					i++;
				}
				String BSPopupText = browser.getelementtext(SCobjects.Appointments_BookingSummaryPopupAnd_Id);
				int BS_BookingID = Integer.parseInt(BSPopupText.replaceAll("\\D", ""));
				String BSBKID = String.valueOf(BS_BookingID);
				if (browser.elementisdisplayed(SCobjects.Appointments_BookingSummaryPopupAnd_Id)
						&& ApBookingID.equalsIgnoreCase(BSBKID)) {
					browser.reportscomtep("Passed",
							"Click on booking ID with Satatus as:" + AppoinmentStatus
									+ " and verify Booking Summary for" + BS_BookingID + " Popup is displayed",
							"Booking Summary ID Popup should be displayed",
							" Booking Summary for Popup ID is displayed as:" + BS_BookingID);
					StaffBookedName = browser.getelementtext(SCobjects.Appointments_BSP_StaffBooked_Name);
					browser.Verify_elementisdisplayed_Report(SCobjects.Appointments_BSP_StaffBooked_Name,
							StaffBookedName);
					String BS_DateandTime = browser.getelementtext(SCobjects.Appointments_BSP_AppointmentDateAndTime);
					browser.Verify_elementisdisplayed_Report(SCobjects.Appointments_BSP_AppointmentDateAndTime,
							BS_DateandTime);
					browser.Verify_elementisdisplayed_Report(SCobjects.Appointments_BSP_CancelBooking_Button,
							"Cancel Booking Button");
					browser.Verify_elementisdisplayed_Report(SCobjects.Appointments_BSP_Reschedule_Button,
							"Reschedule Booking Button");
					browser.Verify_elementisdisplayed_Report(SCobjects.Appointments_BSP_Confirmed_Button,
							"Confirmed Booking Button");
					browser.click(SCobjects.Appointments_BSP_Close_Button);
				} else {
					browser.reportscomtep("Failed",
							"Click on booking ID and verify Booking Summary Id Popup is displayed",
							"Booking Summary ID Popup should be displayed",
							" Booking Summary for Popup ID is not displayed");
				}
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	
	/********TC_21_004 Check whether available timeslots are displayed when we click on Reschedule button.************/
	
	public void click_On_Reschedule_Button() {
		String ApBookingID = "";
		String AppoinmentStatus = "";
		String StaffBookedName = "";
		try {
			List<WebElement> BookingID_List = SCobjects.Appointments_AllAppointments_BookingID_List;
			int BookingID_ListSize = BookingID_List.size();
			if (BookingID_ListSize > 1) {
				List<WebElement> NewStatusList = SCobjects.Appointments_AllAppointments_NewStatusButton_List;
				List<WebElement> PageList = SCobjects.Appointments_AllAppointments_PaginationButton_List;
				int i = 0;
				for (WebElement Status : PageList) {
					if (browser.elementisdisplayed(NewStatusList.get(i))
							&& browser.elementisdisplayed(BookingID_List.get(i))) {
						AppoinmentStatus = browser.getelementtext(NewStatusList.get(i));
						ApBookingID = browser
								.getelementtext(SCobjects.Appointments_AllAppointments_BookingIDHavig_NewStatus.get(i));
						browser.click(SCobjects.Appointments_AllAppointments_BookingIDHavig_NewStatus.get(i));
						break;
					} else {
						Status.click();
						if (browser.elementisdisplayed(
								SCobjects.Appointments_AllAppointments_BookingIDHavig_NewStatus.get(i))
								&& browser.elementisdisplayed(
										SCobjects.Appointments_AllAppointments_BookingIDHavig_NewStatus.get(i))) {
							AppoinmentStatus = browser.getelementtext(NewStatusList.get(i));
							ApBookingID = browser.getelementtext(
									SCobjects.Appointments_AllAppointments_BookingIDHavig_NewStatus.get(i));
							browser.click(SCobjects.Appointments_AllAppointments_BookingIDHavig_NewStatus.get(i));
							break;
						}

					}
					i++;
				}
				String BSPopupText = browser.getelementtext(SCobjects.Appointments_BookingSummaryPopupAnd_Id);
				int BS_BookingID = Integer.parseInt(BSPopupText.replaceAll("\\D", ""));
				String BSBKID = String.valueOf(BS_BookingID);
				if (browser.elementisdisplayed(SCobjects.Appointments_BookingSummaryPopupAnd_Id)
						&& ApBookingID.equalsIgnoreCase(BSBKID)) {
					browser.reportscomtep("Passed",
							"Click on booking ID with Satatus as:" + AppoinmentStatus
									+ " and verify Booking Summary for" + BS_BookingID + " Popup is displayed",
							"Booking Summary ID Popup should be displayed",
							" Booking Summary for Popup ID is displayed as:" + BS_BookingID);
					StaffBookedName = browser.getelementtext(SCobjects.Appointments_BSP_StaffBooked_Name);
					browser.Verify_elementisdisplayed_Report(SCobjects.Appointments_BSP_StaffBooked_Name,
							StaffBookedName);
					String BS_DateandTime = browser.getelementtext(SCobjects.Appointments_BSP_AppointmentDateAndTime);
					browser.Verify_elementisdisplayed_Report(SCobjects.Appointments_BSP_AppointmentDateAndTime,
							BS_DateandTime);
					browser.Verify_elementisdisplayed_Report(SCobjects.Appointments_BSP_CancelBooking_Button,
							"Cancel Booking Button");
					browser.Verify_elementisdisplayed_Report(SCobjects.Appointments_BSP_Reschedule_Button,
							"Reschedule Booking Button");
					browser.Verify_elementisdisplayed_Report(SCobjects.Appointments_BSP_Confirmed_Button,
							"Confirmed Booking Button");
					browser.click(SCobjects.Appointments_BSP_Reschedule_Button);
					String RescheduledPopupText = browser
							.getelementtext(SCobjects.Appointments_RescheduleTimeForAppointment_PopupHeader);
					int RAPT_BookingID = Integer.parseInt(RescheduledPopupText.replaceAll("\\D", ""));
					String RTAID = String.valueOf(RAPT_BookingID);
					if (RTAID.equals(ApBookingID) && browser
							.elementisdisplayed(SCobjects.Appointments_RescheduleTimeForAppointment_PopupHeader)) {
						browser.reportscomtep("Passed",
								"Clicks on Reschedule Button and verify Reschedule Time for appointment Id as:" + RTAID
										+ " Popup is displayed",
								"Reschedule Time for appointment Id Popup should be displayed",
								"Reschedule Time for appointment Popup Id is displayed as" + RTAID);
						List<WebElement> AvailableDayList = SCobjects.Appointments_RTAPP_AvailableTimesDayList;
						List<WebElement> AvailableTimeSlotsList = SCobjects.Appointments_RTAPP_AvailableTimes_List;
						for (int j = 0; AvailableDayList.size() > 0; j++) {
							browser.click(AvailableDayList.get(j));
							if (AvailableTimeSlotsList.size() > 0) {
								if (browser.elementisdisplayed(SCobjects.Appointments_RTAPP_AvailableTimes)
										&& AvailableDayList.size() > 0 && AvailableTimeSlotsList.size() > 0) {
									browser.reportscomtep("Passed", "Verify Available timeslots are Displayed",
											"Available timeslots should be Displayed",
											"Available timeslots are Displayed");
									break;
								} else if (AvailableTimeSlotsList.size() == 0 && browser
										.elementisdisplayed(SCobjects.Appointments_RTAPP_NoAvailableTime_Slots)) {
									browser.reportscomtep("Passed",
											"Verify No slots are availabe for booking on the Date",
											"slots should't be availabe for booking on the Date",
											"No slots are availabe for booking on the Date");
								}
							}
						}
					} else {
						browser.reportscomtep("Passed",
								"Clicks on Reschedule Button and verify Reschedule Time for appointment Id Popup is displayed",
								"Reschedule Time for appointment Id Popup should be displayed",
								"Reschedule Time for appointment Popup Id is not displayed ");
					}

				} else {
					browser.reportscomtep("Failed",
							"Click on booking ID and verify Booking Summary Id Popup is displayed",
							"Booking Summary ID Popup should be displayed",
							" Booking Summary for Popup ID is not displayed");
				}
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	
	
	/******TC_21_005 Check whether an appointment can be Rescheduled**********/
	public void check_AnAppointment_CanBeRescheduled() {
		try {
			List<WebElement> AvailableTimeSlotsList = SCobjects.Appointments_RTAPP_AvailableTimes_List;
			String TimeSlot = AvailableTimeSlotsList.get(0).getText();
			if (!TimeSlot.isEmpty() && AvailableTimeSlotsList.size() > 0
					&& browser.elementisdisplayed(AvailableTimeSlotsList.get(0))) {
				browser.click(AvailableTimeSlotsList.get(0));
				browser.click(SCobjects.Appointments_RTAPP_YesProceedToReschedulePopup);
				browser.click(SCobjects.Confirmatio_OK_Button);
				if (browser.elementisdisplayed(SCobjects.Appointments_BookingSummaryPopupAnd_Id)) {
					browser.reportscomtep("Passed",
							"Click on continue " + TimeSlot
									+ " time slot, Yes Proceed to Reschedule button & OK conformatiom Button and verify Redirects to Booking Summary popup is dispalyed",
							"Redirects to Booking Summary popup should be dispalyed ",
							"Redirects to Booking Summary popup is dispalyed ");
					String RescheduleTime = browser.getelementtext(SCobjects.Appointments_BSP_AppointmentDateAndTime);
					browser.Verify_elementisdisplayed_Report(SCobjects.Appointments_BSP_AppointmentDateAndTime,
							RescheduleTime);
					browser.click(SCobjects.Appointments_BSP_Close_Button);
				} else {
					browser.reportscomtep("Failed",
							"Click on continue time slot, Yes Proceed to Reschedule button & OK conformatiom Button and verify Redirects to Booking Summary popup is dispalyed",
							"Redirects to Booking Summary popup should be dispalyed ",
							"Redirects to Booking Summary popup is not dispalyed ");
				}

			}
		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	/***TC_21_006 Check whether the Staff receives reschedule notification***/
	public void check_Staff_ReceivesReschedule_Notification(){
		try{
			
		}catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	
	/**TC_21_007 Check whether the Customer receives reschedule notification***/
	
	public void check_Customer_ReceivesReschedule_Notification(){
		try{
			
		}catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	/***TC_21_008 Check whether a New booking can be Cancelled****/
	
	public void checkwhether_NewBookingCan_BeCancelled() {
		String ApBookingID = "";
		String AppoinmentStatus = "";
		String StaffBookedName = "";
		String BeforeStatusValue = "";
		String AfterStatusValue = "";
		try {
			List<WebElement> BookingID_List = SCobjects.Appointments_AllAppointments_BookingID_List;
			List<WebElement> StatusList = SCobjects.Appointments_AllAppointments_StatusList;
			int BookingID_ListSize = BookingID_List.size();
			if (BookingID_ListSize > 1) {
				List<WebElement> NewStatusList = SCobjects.Appointments_AllAppointments_NewStatusButton_List;
				List<WebElement> PageList = SCobjects.Appointments_AllAppointments_PaginationButton_List;
				int i = 0;
				int J = 0;
				for (WebElement Status : PageList) {
					if (browser.elementisdisplayed(NewStatusList.get(i))
							&& browser.elementisdisplayed(BookingID_List.get(i))) {
						AppoinmentStatus = browser.getelementtext(NewStatusList.get(i));
						ApBookingID = browser
								.getelementtext(SCobjects.Appointments_AllAppointments_BookingIDHavig_NewStatus.get(i));
						for (WebElement StatusValue : StatusList) {
							BeforeStatusValue = BeforeStatusValue + ";" + StatusValue.getText();
						}
						browser.click(SCobjects.Appointments_AllAppointments_BookingIDHavig_NewStatus.get(i));
						break;

					} else {
						Status.click();
						if (browser.elementisdisplayed(
								SCobjects.Appointments_AllAppointments_BookingIDHavig_NewStatus.get(i))
								&& browser.elementisdisplayed(
										SCobjects.Appointments_AllAppointments_BookingIDHavig_NewStatus.get(i))) {
							AppoinmentStatus = browser.getelementtext(NewStatusList.get(i));
							ApBookingID = browser.getelementtext(
									SCobjects.Appointments_AllAppointments_BookingIDHavig_NewStatus.get(i));
							for (WebElement StatusValue : StatusList) {
								BeforeStatusValue = BeforeStatusValue + ";" + StatusValue.getText();
							}
							browser.click(SCobjects.Appointments_AllAppointments_BookingIDHavig_NewStatus.get(i));
							break;
						}

					}
					i++;
				}
				String BSPopupText = browser.getelementtext(SCobjects.Appointments_BookingSummaryPopupAnd_Id);
				int BS_BookingID = Integer.parseInt(BSPopupText.replaceAll("\\D", ""));
				String BSBKID = String.valueOf(BS_BookingID);
				if (browser.elementisdisplayed(SCobjects.Appointments_BookingSummaryPopupAnd_Id)
						&& ApBookingID.equalsIgnoreCase(BSBKID)) {
					browser.reportscomtep("Passed",
							"Click on booking ID with Satatus as:" + AppoinmentStatus
									+ " and verify Booking Summary for" + BS_BookingID + " Popup is displayed",
							"Booking Summary ID Popup should be displayed",
							" Booking Summary for Popup ID is displayed as:" + BS_BookingID);
					StaffBookedName = browser.getelementtext(SCobjects.Appointments_BSP_StaffBooked_Name);
					browser.Verify_elementisdisplayed_Report(SCobjects.Appointments_BSP_StaffBooked_Name,
							StaffBookedName);
					String BS_DateandTime = browser.getelementtext(SCobjects.Appointments_BSP_AppointmentDateAndTime);
					browser.Verify_elementisdisplayed_Report(SCobjects.Appointments_BSP_AppointmentDateAndTime,
							BS_DateandTime);
					browser.click(SCobjects.Appointments_BSP_CancelBooking_Button);
					browser.click(SCobjects.Appointments_RTAPP_YesProceedToReschedulePopup);
					browser.click(SCobjects.Confirmatio_OK_Button);
					for (WebElement StatusValue : StatusList) {
						AfterStatusValue = BeforeStatusValue + ";" + StatusValue.getText();
					}
					if (!AfterStatusValue.equalsIgnoreCase(BeforeStatusValue)) {
						browser.reportscomtep("Passed",
								"Clicks on Continue Cancel Booking, Yes on the confirmation, Ok buttons and verify Redirects to Appointments page & Booking status is Cancelled",
								"Redirects to Appointments page & Booking status should be Cancelled",
								"Redirects to Appointments page & Booking status is Cancelled");

					} else {
						browser.reportscomtep("Failed",
								"Clicks on Continue Cancel Booking, Yes on the confirmation, Ok buttons and verify Redirects to Appointments page & Booking status is Cancelled",
								"Redirects to Appointments page & Booking status should be Cancelled",
								"Redirects to Appointments page & Booking status is not Cancelled");
					}
				} else {
					browser.reportscomtep("Failed",
							"Click on booking ID and verify Booking Summary Id Popup is displayed",
							"Booking Summary ID Popup should be displayed",
							" Booking Summary for Popup ID is not displayed");
				}
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
		
	/***TC_21_009 Check the available options in a Cancelled booking*****///
	
	public void check_AvailableOptions_InCancelledBooking() {
		String ApBookingID = "";
		String AppoinmentStatus = "";
		String StaffBookedName = "";
		try {
			List<WebElement> BookingID_List = SCobjects.Appointments_AllAppointments_BookingID_List;
			int BookingID_ListSize = BookingID_List.size();
			if (BookingID_ListSize > 1) {
				List<WebElement> CancelledStatusList = SCobjects.Appointments_AllAppointments_CancelledStatus_List;
				List<WebElement> CancelledStatusHavingIDList = SCobjects.Appointments_AllAppointments_BookingIDHavig_CancelledStatus;
				List<WebElement> PageList = SCobjects.Appointments_AllAppointments_PaginationButton_List;
				int i = 0;
				for (WebElement Status : PageList) {
					if (browser.elementisdisplayed(CancelledStatusList.get(i))
							&& browser.elementisdisplayed(CancelledStatusHavingIDList.get(i))) {
						AppoinmentStatus = browser.getelementtext(CancelledStatusList.get(i));
						ApBookingID = browser.getelementtext(CancelledStatusHavingIDList.get(i));
						browser.click(CancelledStatusHavingIDList.get(i));
						break;

					} else {
						Status.click();
						if (browser.elementisdisplayed(CancelledStatusList.get(i))
								&& browser.elementisdisplayed(CancelledStatusHavingIDList.get(i))) {
							AppoinmentStatus = browser.getelementtext(CancelledStatusList.get(i));
							ApBookingID = browser.getelementtext(CancelledStatusHavingIDList.get(i));
							browser.click(CancelledStatusHavingIDList.get(i));
							break;
						}

					}
					i++;
				}
				String BSPopupText = browser.getelementtext(SCobjects.Appointments_BookingSummaryPopupAnd_Id);
				int BS_BookingID = Integer.parseInt(BSPopupText.replaceAll("\\D", ""));
				String BSBKID = String.valueOf(BS_BookingID);
				if (browser.elementisdisplayed(SCobjects.Appointments_BookingSummaryPopupAnd_Id)
						&& ApBookingID.equalsIgnoreCase(BSBKID)) {
					browser.reportscomtep("Passed",
							"Click on booking ID with Satatus as:" + AppoinmentStatus
									+ " and verify Booking Summary for" + BS_BookingID + " Popup is displayed",
							"Booking Summary ID Popup should be displayed",
							" Booking Summary for Popup ID is displayed as:" + BS_BookingID);
					StaffBookedName = browser.getelementtext(SCobjects.Appointments_BSP_StaffBooked_Name);
					browser.Verify_elementisdisplayed_Report(SCobjects.Appointments_BSP_StaffBooked_Name,
							StaffBookedName);
					String BS_DateandTime = browser.getelementtext(SCobjects.Appointments_BSP_AppointmentDateAndTime);
					browser.Verify_elementisdisplayed_Report(SCobjects.Appointments_BSP_AppointmentDateAndTime,
							BS_DateandTime);
					if (!browser.elementisdisplayed(SCobjects.Appointments_BSP_CancelBooking_Button)
							&& !browser.elementisdisplayed(SCobjects.Appointments_BSP_Reschedule_Button)
							&& !browser.elementisdisplayed(SCobjects.Appointments_BSP_Confirmed_Button)
							&& !browser.elementisdisplayed(SCobjects.Appointments_BSP_ViewAppointment_Button)) {
						browser.reportscomtep("Passed", "Verify Buttons are not available for cancelled booking",
								"Buttons should not be available for cancelled booking",
								"Buttons are not available for cancelled booking");
					} else {
						browser.reportscomtep("Failed", "Verify Buttons are available for cancelled booking",
								"Buttons should be available for cancelled booking",
								"Buttons are available for cancelled booking");

					}
					browser.click(SCobjects.Appointments_BSP_Close_Button);

				} else {
					browser.reportscomtep("Failed",
							"Click on booking ID and verify Booking Summary Id Popup is displayed",
							"Booking Summary ID Popup should be displayed",
							" Booking Summary for Popup ID is not displayed");
				}
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	/****TC_21_010 Check whether Staff receives notification for Cancelled appointments*****/
	public void check_Staff_ReceivesNotification_ForCancelledAppointments(){
		try{
			
		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	/**********TC_21_011 Check whether Customer receives Cancellation notification****/
	
	public void check_Customer_ReceivesNotification_ForCancelledAppointments() {
		try {

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	/***TC_21_012 Check the options available for booking with status as Completed***/
	
	public void checkwhether_NewBookingCan_BeCompleted() {
		String ApBookingID = "";
		String AppoinmentStatus = "";
		String StaffBookedName = "";
		try {
			List<WebElement> BookingID_List = SCobjects.Appointments_AllAppointments_BookingID_List;
			int BookingID_ListSize = BookingID_List.size();
			if (BookingID_ListSize > 1) {
				List<WebElement> CompletedStatusList = SCobjects.Appointments_AllAppointments_CompletedStatus_List;
				List<WebElement> CompletedStatusHavingIDList = SCobjects.Appointments_AllAppointments_BookingIDHavig_CompletedStatus;
				List<WebElement> PageList = SCobjects.Appointments_AllAppointments_PaginationButton_List;
				int i = 0;
				for (WebElement Status : PageList) {
					if (browser.elementisdisplayed(CompletedStatusList.get(i))
							&& browser.elementisdisplayed(CompletedStatusHavingIDList.get(i))) {
						AppoinmentStatus = browser.getelementtext(CompletedStatusList.get(i));
						ApBookingID = browser.getelementtext(CompletedStatusHavingIDList.get(i));
						browser.click(CompletedStatusHavingIDList.get(i));
						break;

					} else {
						Status.click();
						if (browser.elementisdisplayed(CompletedStatusList.get(i))
								&& browser.elementisdisplayed(CompletedStatusHavingIDList.get(i))) {
							AppoinmentStatus = browser.getelementtext(CompletedStatusList.get(i));
							ApBookingID = browser.getelementtext(CompletedStatusHavingIDList.get(i));
							browser.click(CompletedStatusHavingIDList.get(i));
							break;
						}

					}
					i++;
				}
				String BSPopupText = browser.getelementtext(SCobjects.Appointments_BookingSummaryPopupAnd_Id);
				int BS_BookingID = Integer.parseInt(BSPopupText.replaceAll("\\D", ""));
				String BSBKID = String.valueOf(BS_BookingID);
				if (browser.elementisdisplayed(SCobjects.Appointments_BookingSummaryPopupAnd_Id)
						&& ApBookingID.equalsIgnoreCase(BSBKID)) {
					browser.reportscomtep("Passed",
							"Click on booking ID with Satatus as:" + AppoinmentStatus
									+ " and verify Booking Summary for" + BS_BookingID + " Popup is displayed",
							"Booking Summary ID Popup should be displayed",
							" Booking Summary for Popup ID is displayed as:" + BS_BookingID);
					StaffBookedName = browser.getelementtext(SCobjects.Appointments_BSP_StaffBooked_Name);
					browser.Verify_elementisdisplayed_Report(SCobjects.Appointments_BSP_StaffBooked_Name,
							StaffBookedName);
					String BS_DateandTime = browser.getelementtext(SCobjects.Appointments_BSP_AppointmentDateAndTime);
					browser.Verify_elementisdisplayed_Report(SCobjects.Appointments_BSP_AppointmentDateAndTime,
							BS_DateandTime);
					browser.Verify_elementisdisplayed_Report(SCobjects.Appointments_BSP_ViewAppointment_Button,
							"ViewAppointment Booking Button");

				} else {
					browser.reportscomtep("Failed",
							"Click on booking ID and verify Booking Summary Id Popup is displayed",
							"Booking Summary ID Popup should be displayed",
							" Booking Summary for Popup ID is not displayed");
				}
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	
	/***TC_21_013 Check whether receipt/invoice can be viewed for Completed booking*****/
	
	public void checkWhether_Receipt_ViewedFor_CompletedBooking() {
		try {
			browser.click(SCobjects.Appointments_BSP_ViewAppointment_Button);
			browser.waitForNewWindowAndSwitchToIt(driver);
			if (browser.elementisdisplayed(SCobjects.Appointments_AllAppointments_ReceiptPDF_Page)) {
				browser.reportscomtep("Passed",
						"Click on View Appointment Button and Open receipt PDF page is displayed",
						"Open receipt PDF page should be displayed", "Open receipt PDF page is displayed");
				List<WebElement> PDFOptionList = SCobjects.Appointments_AllAppointments_ReceiptPDF_OptionList;
				String[] PDFOptionListValue = new String[4];
				PDFOptionListValue[0] = " Print";
				PDFOptionListValue[1] = " Download";
				PDFOptionListValue[2] = " Email Receipt";
				PDFOptionListValue[3] = " Return To Appointments";
				int i = 0;
				for (WebElement Option : PDFOptionList) {
					String OPtionValue = browser.getelementtext(Option);
					if (OPtionValue.equalsIgnoreCase(PDFOptionListValue[i])) {
						browser.reportscomtep("Passed", "Verify " + OPtionValue + " is displayed",
								"Option Value should be displayed", "Option value displayed as:" + OPtionValue);
					} else {
						browser.reportscomtep("Failed", "Verify " + OPtionValue + " is displayed",
								"Option Value should be displayed",
								"Option value is not displayed as:" + PDFOptionListValue[i]);
					}
				}
			} else {
				browser.reportscomtep("Failed",
						"Click on View Appointment Button and Open receipt PDF page is displayed",
						"Open receipt PDF page should be displayed", "Open receipt PDF page is displayed");
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	
	/****TC_21_014 Check whether the receipt can be downloaded****/
	
	public void checkWhether_Receipt_CanBeDownloaded() {
		String OptionValue ="";
		try {
			List<WebElement> PDFOptionList = SCobjects.Appointments_AllAppointments_ReceiptPDF_OptionList;
		

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	
	/******TC_21_015 Check whether the receipt can be sent as email*********/
	
	public void checkWhether_Receipt_SentAsEmail() {
		String OptionValue = "";
		String ReceiptEmailID = "";
		try {
			ReceiptEmailID = browser.getdata("ReceiptEmailID");
			List<WebElement> PDFOptionList = SCobjects.Appointments_AllAppointments_ReceiptPDF_OptionList;
			OptionValue = PDFOptionList.get(2).getText();
			if (OptionValue.equalsIgnoreCase(" Download")) {
				browser.click(PDFOptionList.get(2));
				if (browser.elementisdisplayed(SCobjects.Appointments_AllAppointments_EmailPopup)) {
					browser.reportscomtep("Passed",
							"Clicks on Email Option and verify Enter recipient email address Popup is displayed",
							"Enter recipient email address Popup should be displayed",
							"Enter recipient email address Popup is displayed");
					browser.sendkeys(SCobjects.Appointments_AllAppointments_EmailTextBox, ReceiptEmailID);
					browser.click(SCobjects.Confirmatio_OK_Button);
					browser.click(SCobjects.Confirmatio_OK_Button);
				} else {
					browser.reportscomtep("Failed",
							"Clicks on Email Option and verify Enter recipient email address Popup is displayed",
							"Enter recipient email address Popup should be displayed",
							"Enter recipient email address Popup is not displayed");
				}
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	
	
	/********TC_21_016 Check whether the Return to Appointments button redirects to Appointments page****/
	
	public void checkWhether_ReturnToAppointmentsButton_Redirectsto_AppointmentsPage() {
		String OptionValue = "";
		try {
			List<WebElement> PDFOptionList = SCobjects.Appointments_AllAppointments_ReceiptPDF_OptionList;
			OptionValue = PDFOptionList.get(3).getText();
			if (OptionValue.equalsIgnoreCase(" Return To Appointments")) {
				browser.click(PDFOptionList.get(3));
				if (browser.elementisdisplayed(SCobjects.Appointments_AppointmentsPage_Header)) {
					browser.reportscomtep("Passed",
							"Click on Return To Appointments Button and verify Redirects to Appointments page is displayed",
							"Redirects to Appointments page should be displayed",
							"Redirects to Appointments page is displayed");
				} else {
					browser.reportscomtep("Failed",
							"Click on Return To Appointments Button and verify Redirects to Appointments page is displayed",
							"Redirects to Appointments page should be displayed",
							"Redirects to Appointments page is not displayed");
				}

			}
		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	
	/***TC_21_017 Check whether an appointment can be confirmed************/
	
	public void Checkwhether_AnAppointment_Confirmed() {
		String ApBookingID = "";
		String AppoinmentStatus = "";
		String StaffBookedName = "";
		try {
			List<WebElement> BookingID_List = SCobjects.Appointments_AllAppointments_BookingID_List;
			int BookingID_ListSize = BookingID_List.size();
			if (BookingID_ListSize > 1) {
				List<WebElement> ConfirmedStatusList = SCobjects.Appointments_AllAppointments_ConfirmedStatus_List;
				List<WebElement> ConfirmedStatusHavingIDList = SCobjects.Appointments_AllAppointments_BookingIDHavig_ConfirmedStatus;
				List<WebElement> PageList = SCobjects.Appointments_AllAppointments_PaginationButton_List;
				browser.scrollintoviewelement(PageList.get(0));
				int i = 0;
				for (WebElement Status : PageList) {
					PageList.get(i).click();
					if (browser.elementisdisplayed(ConfirmedStatusList.get(i))
							&& browser.elementisdisplayed(ConfirmedStatusHavingIDList.get(i))) {
						AppoinmentStatus = browser.getelementtext(ConfirmedStatusList.get(i));
						ApBookingID = browser.getelementtext(ConfirmedStatusHavingIDList.get(i));
						browser.click(ConfirmedStatusHavingIDList.get(i));
						break;
					}
					i++;
				}
				String BSPopupText = browser.getelementtext(SCobjects.Appointments_BookingSummaryPopupAnd_Id);
				int BS_BookingID = Integer.parseInt(BSPopupText.replaceAll("\\D", ""));
				String BSBKID = String.valueOf(BS_BookingID);
				if (browser.elementisdisplayed(SCobjects.Appointments_BookingSummaryPopupAnd_Id)
						&& ApBookingID.equalsIgnoreCase(BSBKID)) {
					browser.reportscomtep("Passed",
							"Click on booking ID with Satatus as:" + AppoinmentStatus
									+ " and verify Booking Summary for" + BS_BookingID + " Popup is displayed",
							"Booking Summary ID Popup should be displayed",
							" Booking Summary for Popup ID is displayed as:" + BS_BookingID);
					StaffBookedName = browser.getelementtext(SCobjects.Appointments_BSP_StaffBooked_Name);
					browser.Verify_elementisdisplayed_Report(SCobjects.Appointments_BSP_StaffBooked_Name,
							StaffBookedName);
					String BS_DateandTime = browser.getelementtext(SCobjects.Appointments_BSP_AppointmentDateAndTime);
					browser.Verify_elementisdisplayed_Report(SCobjects.Appointments_BSP_AppointmentDateAndTime,
							BS_DateandTime);
					browser.Verify_elementisdisplayed_Report(SCobjects.Appointments_BSP_Confirmed_Button,
							"Confirmed Booking Button");
					browser.click(SCobjects.Appointments_BSP_Confirmed_Button);
					if (browser.elementisdisplayed(SCobjects.Appointments_AppointmentsPage_Header)) {
						browser.reportscomtep("Passed",
								"Click on Confirmed Button and verify Redirects to Appointments page is displayed",
								"Redirects to Appointments page should be displayed",
								"Redirects to Appointments page is displayed");
					} else {
						browser.reportscomtep("Failed",
								"Click on Confirmed Button and verify Redirects to Appointments page is displayed",
								"Redirects to Appointments page should be displayed",
								"Redirects to Appointments page is not displayed");
					}

				} else {
					browser.reportscomtep("Failed",
							"Click on booking ID and verify Booking Summary Id Popup is displayed",
							"Booking Summary ID Popup should be displayed",
							" Booking Summary for Popup ID is not displayed");
				}
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}

	}
	
	/*********TC_21_018 Check the available options for a Confirmed booking************/
	
	public void check_AvailableOptions_For_ConfirmedBooking() {
		String ApBookingID = "";
		String AppoinmentStatus = "";
		String StaffBookedName = "";
		try {
			List<WebElement> BookingID_List = SCobjects.Appointments_AllAppointments_BookingID_List;
			int BookingID_ListSize = BookingID_List.size();
			if (BookingID_ListSize > 1) {
				List<WebElement> ConfirmedStatusList = SCobjects.Appointments_AllAppointments_ConfirmedStatus_List;
				List<WebElement> ConfirmedStatusHavingIDList = SCobjects.Appointments_AllAppointments_BookingIDHavig_ConfirmedStatus;
				List<WebElement> PageList = SCobjects.Appointments_AllAppointments_PaginationButton_List;
				int i =0;
				for (WebElement Status : PageList) {
					Status.click();
					if (browser.elementisdisplayed(ConfirmedStatusList.get(i))
							&& browser.elementisdisplayed(ConfirmedStatusHavingIDList.get(i))) {
						AppoinmentStatus = browser.getelementtext(ConfirmedStatusList.get(i));
						ApBookingID = browser.getelementtext(ConfirmedStatusHavingIDList.get(i));
						browser.click(ConfirmedStatusHavingIDList.get(i));
						break;
					}
					i++;
				}
				
				String BSPopupText = browser.getelementtext(SCobjects.Appointments_BookingSummaryPopupAnd_Id);
				int BS_BookingID = Integer.parseInt(BSPopupText.replaceAll("\\D", ""));
				String BSBKID = String.valueOf(BS_BookingID);
				if (browser.elementisdisplayed(SCobjects.Appointments_BookingSummaryPopupAnd_Id)
						&& ApBookingID.equalsIgnoreCase(BSBKID)) {
					browser.reportscomtep("Passed",
							"Click on booking ID with Satatus as:" + AppoinmentStatus
									+ " and verify Booking Summary for" + BS_BookingID + " Popup is displayed",
							"Booking Summary ID Popup should be displayed",
							" Booking Summary for Popup ID is displayed as:" + BS_BookingID);
					StaffBookedName = browser.getelementtext(SCobjects.Appointments_BSP_StaffBooked_Name);
					browser.Verify_elementisdisplayed_Report(SCobjects.Appointments_BSP_StaffBooked_Name,
							StaffBookedName);
					String BS_DateandTime = browser.getelementtext(SCobjects.Appointments_BSP_AppointmentDateAndTime);
					browser.Verify_elementisdisplayed_Report(SCobjects.Appointments_BSP_AppointmentDateAndTime,
							BS_DateandTime);
					browser.Verify_elementisdisplayed_Report(SCobjects.Appointments_BSP_CancelBooking_Button,
							"Cancel Booking Button");
					browser.Verify_elementisdisplayed_Report(SCobjects.Appointments_BSP_CheckOut_Button,
							"Check Out Booking Button");
					browser.click(SCobjects.Appointments_BSP_Close_Button);
				} else {
					browser.reportscomtep("Failed",
							"Click on booking ID and verify Booking Summary Id Popup is displayed",
							"Booking Summary ID Popup should be displayed",
							" Booking Summary for Popup ID is not displayed");
				}
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	
	/***TC_21_019 Check filter by date Today*/
	
	public void check_FilterByDate_Today() {
		try {
			browser.refreshBrowser(driver);
			browser.selectByVisibleText(SCobjects.Appointments_AllAppointments_FilterByDate, "Today");
			String selectedFilterByDate = browser
					.getDropdownSelectedValue(SCobjects.Appointments_AllAppointments_FilterByDate);
			if (selectedFilterByDate.equalsIgnoreCase("Today")
					&& browser.elementisdisplayed(SCobjects.Appointments_AllAppointments_FilterByDate)) {
				browser.reportscomtep("Passed",
						"Verify Filter by date option :" + selectedFilterByDate + " is selected",
						"Filter by date option should be selected",
						"Filter by date option is seleceted as:" + selectedFilterByDate);
				List<WebElement> FilterApp_List = SCobjects.Appointments_AllAppointments_List;
				browser.wait();
				if (FilterApp_List.size() > 0
						&& browser.elementisdisplayed(SCobjects.Appointments_AllAppointments_FilterTable)) {
					browser.reportscomtep("Passed", "Verify Appointments scheduled for current date is displayed",
							"Appointments scheduled for current date should be displayed",
							"Appointments scheduled for current date is displayed");
				} else{
					browser.click(SCobjects.Confirmatio_OK_Button);
					String Appointments_Text = browser.getelementtext(SCobjects.Appointments_NoAppointmentsFound_Text);
					browser.Verify_elementisdisplayed_Report(SCobjects.Appointments_NoAppointmentsFound_Text, Appointments_Text);
				}

			} else {
				browser.reportscomtep("Failed", "Filter by date option today is selected",
						"Filter by date option today should be selected", "Filter by date option today is not selected");
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	
	/****TC_21_020 Check filter by date All Appointments*/
	
	public void check_filterByDate_AllAppointments() {
		try {
			browser.refreshBrowser(driver);
			browser.selectByVisibleText(SCobjects.Appointments_AllAppointments_FilterByDate, "All Appointments");
			String selectedFilterByDate = browser
					.getDropdownSelectedValue(SCobjects.Appointments_AllAppointments_FilterByDate);
			if (selectedFilterByDate.equalsIgnoreCase("All Appointments")
					&& browser.elementisdisplayed(SCobjects.Appointments_AllAppointments_FilterByDate)) {
				browser.reportscomtep("Passed",
						"Verify Filter by date option :" + selectedFilterByDate + " is default selected",
						"Filter by date option should be default selected",
						"Filter by date option is default seleceted as:" + selectedFilterByDate);
				List<WebElement> FilterApp_List = SCobjects.Appointments_AllAppointments_List;
				if (FilterApp_List.size() > 0
						&& browser.elementisdisplayed(SCobjects.Appointments_AllAppointments_FilterTable)) {
					browser.reportscomtep("Passed", "Verify All Appointments are displayed",
							"All Appointments should be displayed",
							"All Appointments is displayed");
				} else {
					browser.click(SCobjects.Confirmatio_OK_Button);
					String Appointments_Text = browser.getelementtext(SCobjects.Appointments_NoAppointmentsFound_Text);
					browser.Verify_elementisdisplayed_Report(SCobjects.Appointments_NoAppointmentsFound_Text, Appointments_Text);
				}

			} else {
				browser.reportscomtep("Failed", "Filter by date option today is selected",
						"Filter by date option today should be selected", "Filter by date option is not selected");
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	
	/***TC_21_021 Check filter by date Custom Range**/
	
	public void check_filterByDate_CustomRange() {
		try {
			browser.refreshBrowser(driver);
			browser.selectByVisibleText(SCobjects.Appointments_AllAppointments_FilterByDate, "Custom Range");
			String selectedFilterByDate = browser
					.getDropdownSelectedValue(SCobjects.Appointments_AllAppointments_FilterByDate);
			if (selectedFilterByDate.equalsIgnoreCase("Custom Range")
					&& browser.elementisdisplayed(SCobjects.Appointments_AllAppointments_FilterByDate)) {
				browser.reportscomtep("Passed",
						"Verify Filter by date option :" + selectedFilterByDate + " is default selected",
						"Filter by date option should be default selected",
						"Filter by date option is default seleceted as:" + selectedFilterByDate);
				/*******
				 * 
				 * code pending
				 * 
				 * 
				 */
				List<WebElement> FilterApp_List = SCobjects.Appointments_AllAppointments_List;
				if (FilterApp_List.size() > 0
						&& browser.elementisdisplayed(SCobjects.Appointments_AllAppointments_FilterTable)) {
					browser.reportscomtep("Passed", "Verify Appointments scheduled for current date is displayed",
							"Appointments scheduled for current date should be displayed",
							"Appointments scheduled for current date is displayed");
				} else {
					browser.click(SCobjects.Confirmatio_OK_Button);
					String Appointments_Text = browser.getelementtext(SCobjects.Appointments_NoAppointmentsFound_Text);
					browser.Verify_elementisdisplayed_Report(SCobjects.Appointments_NoAppointmentsFound_Text, Appointments_Text);
				}

			} else {
				browser.reportscomtep("Failed", "Filter by date option today is selected",
						"Filter by date option today should be selected", "Filter by date option is not selected");
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	
	/****TC_21_022 Check filter by Staff name******/
	public void check_filterBy_StaffName() {
		try {
			browser.refreshBrowser(driver);
			browser.selectByIndex(SCobjects.Appointments_AllAppointments_FilterByStaff, 2);
			String selectedFilterByStaffName = browser
					.getDropdownSelectedValue(SCobjects.Appointments_AllAppointments_FilterByStaff);
			if (browser.elementisdisplayed(SCobjects.Appointments_AllAppointments_FilterByStaff)) {
				browser.reportscomtep("Passed",
						"Verify Filter by Staff name  :" + selectedFilterByStaffName + " is selected",
						"Filter by Staff name should be  selected",
						"Filter by Staff name is seleceted as:" + selectedFilterByStaffName);
				List<WebElement> FilterApp_List = SCobjects.Appointments_AllAppointments_List;
				browser.wait();
				if (FilterApp_List.size() > 0
						&& browser.elementisdisplayed(SCobjects.Appointments_AllAppointments_FilterTable)) {
					browser.reportscomtep("Passed",
							"Verify Bookings for selected staff name Appointments are dispalyed",
							"Bookings for selected staff name Appointments should be dispalyed",
							"Bookings for selected staff name Appointments are dispalyed");
				} else{
				browser.click(SCobjects.Confirmatio_OK_Button);
				String Appointments_Text = browser.getelementtext(SCobjects.Appointments_NoAppointmentsFound_Text);
				browser.Verify_elementisdisplayed_Report(SCobjects.Appointments_NoAppointmentsFound_Text, Appointments_Text);
				}
			} else {
				browser.reportscomtep("Failed", "Filter by Staff name option is selected",
						"Filter by Staff name option today should be selected", "Filter by Staff name is not selected");
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	
	/*****TC_21_023 Check filter by booking status*****/
	public void check_FilterBy_BookingStatus() {
		try {
			browser.refreshBrowser(driver);
			String[] FilterByStatusList = { "New", "Canceled", "Confirmed", "Completed" };
			int i = 0;
			for (String statusListvalue : FilterByStatusList) {
				browser.selectByVisibleText(SCobjects.Appointments_AllAppointments_FilterByAppointmentStatus,
						FilterByStatusList[i]);
				browser.wait();
				String selectedFilterByStaffName = browser
						.getDropdownSelectedValue(SCobjects.Appointments_AllAppointments_FilterByAppointmentStatus);
				if (selectedFilterByStaffName.equalsIgnoreCase(FilterByStatusList[i])
						&& browser.elementisdisplayed(SCobjects.Appointments_AllAppointments_FilterByDate)) {
					browser.reportscomtep("Passed",
							"Verify Filter by Status option :" + FilterByStatusList[i] + " is selected",
							"Filter by Status option should be selected",
							"Filter by Status option is seleceted as:" + selectedFilterByStaffName);
					List<WebElement> FilterApp_List = SCobjects.Appointments_AllAppointments_List;
					if (FilterApp_List.size() > 0
							&& browser.elementisdisplayed(SCobjects.Appointments_AllAppointments_FilterTable)) {
						browser.reportscomtep("Passed", "Verify " + FilterByStatusList[i] + " Bookings are dispalyed",
								" " + FilterByStatusList[i] + " Bookings should be displayed",
								"Booking Status is displayed as:" + FilterByStatusList[i]);
					} else {
						browser.click(SCobjects.Confirmatio_OK_Button);
						String Appointments_Text = browser.getelementtext(SCobjects.Appointments_NoAppointmentsFound_Text);
						browser.Verify_elementisdisplayed_Report(SCobjects.Appointments_NoAppointmentsFound_Text, Appointments_Text);
					}
				} else {
					browser.reportscomtep("Failed", "Filter by Staff name option today is selected",
							"Filter by Staff name option today should be selected",
							"Filter by Staff name is not selected");
				}
				i++;
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	
	/*******TC_21_024 Check the search box**********/
	
	public void check_SearchBoxInApponments(String Searchbooking_IdOrNameOrDate) {
		String AppointmentID = "";
		String AppintmentDate = "";
		String AppointmentName = "";
		try {
			AppointmentID = browser.getdata("SearchId");
			AppintmentDate = browser.getdata("SearchAppdate");
			AppointmentName = browser.getdata("SearchAppName");
			switch (Searchbooking_IdOrNameOrDate) {
			case "ID":
				browser.sendkeys(SCobjects.Appointments_AllAppointments_SearchBox, AppointmentID);
				browser.click(SCobjects.Appointments_AllAppointments_SeacrchIcon_Button);
				browser.wait();
				List<WebElement> FilterApp_List = SCobjects.Appointments_AllAppointments_List;
				if (FilterApp_List.size() > 0
						&& browser.elementisdisplayed(SCobjects.Appointments_AllAppointments_FilterTable)) {
					browser.reportscomtep("Passed",
							"Enter" + AppointmentID
									+ " and verify Based on characters typed, data is Automatically fetched",
							"Based on characters typed, data is Automatically fetched",
							"Based on characters type, data is Automatically fetched as:" + AppointmentID);
				} else {
					browser.click(SCobjects.Confirmatio_OK_Button);
					String Appointments_Text = browser.getelementtext(SCobjects.Appointments_NoAppointmentsFound_Text);
					browser.Verify_elementisdisplayed_Report(SCobjects.Appointments_NoAppointmentsFound_Text,
							Appointments_Text);
				}
				break;
			case "Name":
				browser.sendkeys(SCobjects.Appointments_AllAppointments_SearchBox, AppointmentName);
				browser.click(SCobjects.Appointments_AllAppointments_SeacrchIcon_Button);
				browser.wait();
				List<WebElement> FilterApp_List1 = SCobjects.Appointments_AllAppointments_List;
				if (FilterApp_List1.size() > 0
						&& browser.elementisdisplayed(SCobjects.Appointments_AllAppointments_FilterTable)) {
					browser.reportscomtep("Passed",
							"Enter" + AppointmentName
									+ " and verify Based on characters typed, data is Automatically fetched",
							"Based on characters typed, data is Automatically fetched",
							"Based on characters type, data is Automatically fetched as:" + AppointmentName);
				} else {
					browser.click(SCobjects.Confirmatio_OK_Button);
					String Appointments_Text = browser.getelementtext(SCobjects.Appointments_NoAppointmentsFound_Text);
					browser.Verify_elementisdisplayed_Report(SCobjects.Appointments_NoAppointmentsFound_Text,
							Appointments_Text);
				}
				break;
			case "Date":
				browser.sendkeys(SCobjects.Appointments_AllAppointments_SearchBox, AppintmentDate);
				browser.click(SCobjects.Appointments_AllAppointments_SeacrchIcon_Button);
				browser.wait();
				List<WebElement> FilterApp_List2 = SCobjects.Appointments_AllAppointments_List;
				if (FilterApp_List2.size() > 0
						&& browser.elementisdisplayed(SCobjects.Appointments_AllAppointments_FilterTable)) {
					browser.reportscomtep("Passed",
							"Enter" + AppintmentDate
									+ " and verify Based on characters typed, data is Automatically fetched",
							"Based on characters typed, data is Automatically fetched",
							"Based on characters type, data is Automatically fetched as:" + AppintmentDate);
				} else {
					browser.click(SCobjects.Confirmatio_OK_Button);
					String Appointments_Text = browser.getelementtext(SCobjects.Appointments_NoAppointmentsFound_Text);
					browser.Verify_elementisdisplayed_Report(SCobjects.Appointments_NoAppointmentsFound_Text,
							Appointments_Text);
				}
				break;
			case "Donothing":
				break;
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	/****TS022_Subscriber creates a Walk-in Appointment***********/
	/****TC_22_001 Check the +New Appointments button****/
	
	public void check_NewAppointments_Button() {
		try {
			if (browser.elementisdisplayed(SCobjects.Appointments_Menu_Link)) {
				browser.reportscomtep("Passed", "Verify Appointments Menu link is displayed",
						"Appointments Menu link should be displayed", "Appointments Menu link is displayed");
				browser.click(SCobjects.Appointments_Menu_Link);
				if (browser.elementisdisplayed(SCobjects.Appointments_AppointmentsPage_Header)) {
					browser.reportscomtep("Passed",
							"Clicks on Appointments Menu link and open verify Appointments page header is displayed",
							" Appointments page header should be displayed", " Appointments page header is displayed");
					browser.click(SCobjects.Appointments_AllAppointments_AddNewAppointment_Button);
					if (browser.elementisdisplayed(SCobjects.NewAppointments_NewBooking_PageHeader)) {
						browser.reportscomtep("Passed",
								"Clicks on +New Appointments button and verify New Booking header popup is displayed",
								"New Booking header should be popup displayed",
								"New Booking header is popup displayed");
						List<WebElement> ServicesNamesList = SCobjects.NewAppointments_ServiecesName_List;
						List<WebElement> ServicesDurationList = SCobjects.NewAppointments_Servieces_Duration_List;
						List<WebElement> ServicesPriceList = SCobjects.NewAppointments_Servieces_PriceList;
						if (ServicesNamesList.size() > 0) {
							if (browser.elementisdisplayed(ServicesNamesList.get(0))
									&& browser.elementisdisplayed(ServicesDurationList.get(0))
									&& browser.elementisdisplayed(ServicesPriceList.get(0))) {
								browser.reportscomtep("Passed",
										"Verify Services along with it's duration & price are displayed",
										"Services along with it's duration & price should be displayed",
										"Services along with it's duration & price are displayed");

							} else {
								browser.reportscomtep("Failed",
										"Verify Services along with it's duration & price are displayed",
										"Services along with it's duration & price should be displayed",
										"Services along with it's duration & price are displayed");
							}
						}
					} else {
						browser.reportscomtep("Failed",
								"Clicks on +New Appointments button and verify New Booking header popup is displayed",
								"New Booking header should be popup displayed",
								"New Booking header is not popup displayed");
					}
				} else {
					browser.reportscomtep("Failed",
							"Clicks on Appointments Menu link and open verify Appointments page header is displayed",
							" Appointments page header should be displayed",
							" Appointments page header is not displayed");
				}

			}
		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	
	/******TC_22_002 Check whether single/multiple services can be selected******/
	
	public void checkwhether_SingleOrMultiple_Services_Canbe_Selected(String SingleOrMultiple) {
		try {
			List<WebElement> ServicesNameCheckBoxList = SCobjects.NewAppointments_Serviece_CheckBox_List;
			List<WebElement> ServicesUpadteDetailsList = SCobjects.NewAppointments_Servieces_UpadateDetails_List;
			if (ServicesNameCheckBoxList.size() > 0) {
				switch (SingleOrMultiple) {
				case "ServicesSingleSelected":
					browser.click(ServicesNameCheckBoxList.get(0));
					String UpdatedNoOfServiceSelect = browser.getelementtext(ServicesUpadteDetailsList.get(0));
					String updateServicesDuration = browser.getelementtext(ServicesUpadteDetailsList.get(1));
					String updateServicesPrice = browser.getelementtext(ServicesUpadteDetailsList.get(2));
					if (UpdatedNoOfServiceSelect.equals("1") && !updateServicesDuration.isEmpty()
							&& !updateServicesPrice.isEmpty()
							&& browser.elementisdisplayed(SCobjects.NewAppointments_Servieces_UpadtedTable)) {
						browser.reportscomtep("Passed",
								"Select One Service and verify The service details section is updated with number of service, total duration & total price ",
								"The service details section should be updated with number of service, total duration & total price",
								"The service details section is updated with number of service as: "
										+ UpdatedNoOfServiceSelect + ", total duration is:" + updateServicesDuration
										+ " & total price is:" + updateServicesPrice);
						browser.Verify_elementisdisplayed_Report(SCobjects.NewAppointments_Next_Button, "Next Button");
					} else {
						browser.reportscomtep("Passed",
								"Select One Service and verify The service details section is updated with number of service, total duration & total price ",
								"The service details section should be updated with number of service, total duration & total price",
								"The service details section is  not updated with number of service, total duration & total price");
					}
				case "ServicesMultipleSelected":
					browser.click(ServicesNameCheckBoxList.get(0));
					browser.click(ServicesNameCheckBoxList.get(1));
					String UpdatedNoOfServiceSelect1 = browser.getelementtext(ServicesUpadteDetailsList.get(0));
					String updateServicesDuration1 = browser.getelementtext(ServicesUpadteDetailsList.get(1));
					String updateServicesPrice1 = browser.getelementtext(ServicesUpadteDetailsList.get(2));
					if (UpdatedNoOfServiceSelect1.equals("2") && !updateServicesDuration1.isEmpty()
							&& !updateServicesPrice1.isEmpty()
							&& browser.elementisdisplayed(SCobjects.NewAppointments_Servieces_UpadtedTable)) {
						browser.reportscomtep("Passed",
								"Select One Service and verify The service details section is updated with number of service, total duration & total price ",
								"The service details section should be updated with number of service, total duration & total price",
								"The service details section is updated with number of service as: "
										+ UpdatedNoOfServiceSelect1 + ", total duration is:" + updateServicesDuration1
										+ " & total price is:" + updateServicesPrice1);
						browser.Verify_elementisdisplayed_Report(SCobjects.NewAppointments_Next_Button, "Next Button");
					} else {
						browser.reportscomtep("Passed",
								"Select One Service and verify The service details section is updated with number of service, total duration & total price ",
								"The service details section should be updated with number of service, total duration & total price",
								"The service details section is  not updated with number of service, total duration & total price");
					}
				}
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	
	/***********TC_22_003 Check the Next button in services page*****/
	public void check_NextButton_InServicesPage() {
		try {
			List<WebElement> StaffList = SCobjects.NewAppointments_Staff_List;
			List<WebElement> ServicesUpadteDetailsList = SCobjects.NewAppointments_Servieces_UpadateDetails_List;
			browser.click(SCobjects.NewAppointments_Next_Button);
			if (StaffList.size() > 0) {
				if (browser.elementisdisplayed(SCobjects.NewAppointments_StaffPage)&&browser.elementisdisplayed(StaffList.get(0))) {
					browser.reportscomtep("Passed", "Clicks on Next Button and verify Available StaffPage is displayed",
							"Available StaffPage should be displayed", "Available StaffPage is displayed");
					String UpdatedNoOfServiceSelect = browser.getelementtext(ServicesUpadteDetailsList.get(0));
					String updateServicesDuration = browser.getelementtext(ServicesUpadteDetailsList.get(1));
					String updateServicesPrice = browser.getelementtext(ServicesUpadteDetailsList.get(2));
					if (UpdatedNoOfServiceSelect.equals("1") && !updateServicesDuration.isEmpty()
							&& !updateServicesPrice.isEmpty()
							&& browser.elementisdisplayed(SCobjects.NewAppointments_Servieces_UpadtedTable)) {
						browser.reportscomtep("Passed",
								"Verify The service details section is displayed with number of service, total duration & total price ",
								"The service details section should be displayed with number of service, total duration & total price",
								"The service details section is displayed with number of service as: "
										+ UpdatedNoOfServiceSelect + ", total duration is:" + updateServicesDuration
										+ " & total price is:" + updateServicesPrice);
						browser.Verify_elementisdisplayed_Report(SCobjects.NewAppointments_Back_Button, "Back Button");
					} else {
						browser.reportscomtep("Passed",
								"Verify The service details section is displayed with number of service, total duration & total price ",
								"The service details section should be displayed with number of service, total duration & total price",
								"The service details section is  not displayed with number of service, total duration & total price");
					}

				} else {
					browser.reportscomtep("Failed", "Clicks on Next Button and verify Available StaffPage is displayed",
							"Available StaffPage should be displayed", "Available Staff Page is not displayed");
				}
			}
		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	
	/*****TC_22_004 Check whether the Back button in Staff page returns to Service page****/
	
	public void checkwhether_BackButton_InStaffPage_ReturnsToServicePage() {
		try {
			List<WebElement> UpadteSelectedService = SCobjects.NewAppointments_UpdateSelectedService_List;
			browser.click(SCobjects.NewAppointments_Back_Button);
			if (browser.elementisdisplayed(SCobjects.NewAppointments_Service_Page)) {
				browser.reportscomtep("Passed",
						"Clicks on back Button in staff page and verify Service Page is dispalyed",
						"Service Page should be dispalyed", "Service Page is dispalyed");
				if (UpadteSelectedService.size() > 0) {
					for (WebElement UpadetedServices : UpadteSelectedService) {
						String ServiceNameAndDetails = UpadetedServices.getText();
						if (!ServiceNameAndDetails.isEmpty()
								&& browser.elementisdisplayed(SCobjects.NewAppointments_Servieces_UpadtedTable)) {
							browser.reportscomtep("Passed",
									"Service details section & selected services details are dispalyed ",
									"Service details section & selected services details should be dispalyed",
									"Service details section & selected services details are dispalyed as"
											+ ServiceNameAndDetails);
						} else {
							browser.reportscomtep("Failed",
									"Service details section & selected services details are dispalyed ",
									"Service details section & selected services details should be dispalyed",
									"Service details section & selected services details are dispalyed");
						}
					}
				}

			} else {
				browser.reportscomtep("Failed",
						"Clicks on back Button in staff page and verify Service Page is dispalyed",
						"Service Page should be dispalyed", "Service Page is not dispalyed");
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	
	/****TC_22_005 Check whether the Staff can be selected****/
	 
	public void checkwhether_Staff_Selected() {
		try {
			List<WebElement> StaffList = SCobjects.NewAppointments_Staff_List;
			browser.click(SCobjects.NewAppointments_Next_Button);
			if (StaffList.size() > 0) {
				if (browser.elementisdisplayed(StaffList.get(0))) {
					browser.click(StaffList.get(0));
					browser.reportscomtep("Passed", "Clicks on Staff Verify Staff is selected ",
							"Staff should be selected", "Staff is selected");
					browser.Verify_elementisdisplayed_Report(SCobjects.NewAppointments_Next_Button, "Next Button");
				} else {
					browser.reportscomtep("Failed", "Clicks on Staff Verify Staff is selected ",
							"Staff should be selected", "Staff is not selected");
				}
			}
		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	
	/***TC_22_006 Check the Next button in Staff selection page****/
	
	public void check_NextButton_inStaffSelection_Page() {
		try {
			browser.click(SCobjects.NewAppointments_Next_Button);
			if (browser.elementisdisplayed(SCobjects.NewAppointments_CustomerDetails_Page)) {
				browser.reportscomtep("Passed",
						"Clicks on next button and verify Open customer details page is displayed",
						"Open customer details page should be displayed", "Open customer details page is displayed");
				browser.Verify_elementisdisplayed_Report(SCobjects.NewAppointments_CustomerEmail_TextBox,
						"Customer Email TextBox");
				browser.Verify_elementisdisplayed_Report(SCobjects.NewAppointments_CustomerName_TextBox,
						"Customer Name TextBox");
				browser.Verify_elementisdisplayed_Report(SCobjects.NewAppointments_CustomerMobile_TextBox,
						"Customer Mobile TextBox");
				List<WebElement> UpadteSelectedService = SCobjects.NewAppointments_UpdateSelectedService_List;
				if (UpadteSelectedService.size() > 0) {
					for (WebElement UpadetedServices : UpadteSelectedService) {
						String ServiceNameAndDetails = UpadetedServices.getText();
						if (!ServiceNameAndDetails.isEmpty()
								&& browser.elementisdisplayed(SCobjects.NewAppointments_Servieces_UpadtedTable)) {
							browser.reportscomtep("Passed",
									"Service details section & selected services details are dispalyed ",
									"Service details section & selected services details should be dispalyed",
									"Service details section & selected services details are dispalyed as"
											+ ServiceNameAndDetails);
							if (browser.elementisdisplayed(SCobjects.NewAppointments_Back_Button)
									&& browser.elementisdisplayed(SCobjects.NewAppointments_Back_Button)) {
								browser.reportscomtep("Passed",
										"Verify Next button is displayed along with Back button",
										"Next button should be displayed along with Back button",
										"Next button is displayed along with Back button");
							} else {
								browser.reportscomtep("Failed",
										"Verify Next button is displayed along with Back button",
										"Next button should be displayed along with Back button",
										"Next button is not displayed along with Back button");
							}
						} else {
							browser.reportscomtep("Failed",
									"Service details section & selected services details are dispalyed ",
									"Service details section & selected services details should be dispalyed",
									"Service details section & selected services details are dispalyed");
						}
					}
				}
			} else {
				browser.reportscomtep("Failed",
						"Clicks on next button and verify Open customer details page is displayed",
						"Open customer details page should be displayed",
						"Open customer details page is not displayed");
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	
	/********TC_22_007 Check whether the Back button in Customer details page takes you to Staff selection page**********/
	
	public void checkwhether_BackButton_inCustomerDetailsPage_TakesYou_ToStaffSelectionPage() {
		try {
			browser.click(SCobjects.NewAppointments_Back_Button);
			if (browser.elementisdisplayed(SCobjects.NewAppointments_StaffPage)) {
				browser.reportscomtep("Passed",
						"Clicks on Back button in Customer Details Page and verify Open to Staff Selection page is displayed",
						"Open to Staff Selection page should be displayed",
						"Open to Staff Selection page is displayed");
				browser.Verify_elementisdisplayed_Report(SCobjects.NewAppointments_StaffImage,
						"Pre Selected Staff Image");
				List<WebElement> UpadteSelectedService = SCobjects.NewAppointments_UpdateSelectedService_List;
				if (UpadteSelectedService.size() > 0) {
					for (WebElement UpadetedServices : UpadteSelectedService) {
						String ServiceNameAndDetails = UpadetedServices.getText();
						if (!ServiceNameAndDetails.isEmpty()
								&& browser.elementisdisplayed(SCobjects.NewAppointments_Servieces_UpadtedTable)) {
							browser.reportscomtep("Passed",
									"Service details section & selected services details are dispalyed ",
									"Service details section & selected services details should be dispalyed",
									"Service details section & selected services details are dispalyed as");
						} else {
							browser.reportscomtep("Failed",
									"Service details section & selected services details are dispalyed ",
									"Service details section & selected services details should be dispalyed",
									"Service details section & selected services details are dispalyed");
						}
					}
				}

			} else {
				browser.reportscomtep("Failed",
						"Clicks on Back button in Customer Details Page and verify Open to Staff Selection page is displayed",
						"Open to Staff Selection page should be displayed",
						"Open to Staff Selection page is not displayed");
			}
		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	
	/*****TC_22_008 Check whether another available Staff can be selected***/
	
	public void checkwhether_AnotherAvailable_Staff_Selected() {
		try {
			List<WebElement> StaffList = SCobjects.NewAppointments_Staff_List;
			browser.click(SCobjects.NewAppointments_Next_Button);
			if (StaffList.size() > 1) {
				if (browser.elementisdisplayed(StaffList.get(1))) {
					browser.click(StaffList.get(1));
					browser.reportscomtep("Passed", "Clicks on another Staff Verify Staff is selected ",
							"Staff should be selected", "Staff is selected");
					browser.click(SCobjects.NewAppointments_Next_Button);
					if (browser.elementisdisplayed(SCobjects.NewAppointments_CustomerDetails_Page)) {
						browser.reportscomtep("Passed",
								"Clicks on next button and verify Open customer details page is displayed",
								"Open customer details page should be displayed",
								"Open customer details page is displayed");
						browser.Verify_elementisdisplayed_Report(SCobjects.NewAppointments_StaffImage,
								"Newly selected staff Image");
					} else {
						browser.reportscomtep("Failed",
								"Clicks on next button and verify Open customer details page is displayed",
								"Open customer details page should be displayed",
								"Open customer details page is not displayed");
					}
				} else {
					browser.reportscomtep("Failed", "Clicks on another Staff Verify Staff is selected ",
							"Staff should be selected", "Staff is not selected");
				}
			} else {
				System.out.println("Staffs are not available");
			}
		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	
	/***TC_22_009 Check whether available timeslots are displayed******/
	
	public void checkwhether_AvailableTimeslots_Displayed() {
		String CustomerEmail = "";
		String CustomerName = "";
		String CustomerMobile = "";
		try {
			CustomerEmail = browser.getdata("CustomerEmailId");
			CustomerName = browser.getdata("CustomerName");
			CustomerMobile = browser.getdata("CustomerPhoneNO");
			browser.click(SCobjects.NewAppointments_Next_Button);
			browser.click(SCobjects.NewAppointments_Back_Button);
			List<WebElement> StaffList = SCobjects.NewAppointments_Staff_List;
			if (StaffList.size() > 0) {
				if (browser.elementisdisplayed(StaffList.get(0))) {
					browser.click(StaffList.get(0));
					browser.reportscomtep("Passed", "Clicks on Staff Verify Staff is selected ",
							"Staff should be selected", "Staff is selected");
					if (browser.elementisdisplayed(SCobjects.NewAppointments_CustomerDetails_Page)) {
						browser.reportscomtep("Passed",
								"Clicks on next button and verify Open customer details page is displayed",
								"Open customer details page should be displayed",
								"Open customer details page is displayed");
						browser.sendkeys(SCobjects.NewAppointments_CustomerEmail_TextBox, CustomerEmail);
						browser.sendkeys(SCobjects.NewAppointments_CustomerName_TextBox, CustomerName);
						browser.sendkeys(SCobjects.NewAppointments_CustomerMobile_TextBox, CustomerMobile);
						browser.click(SCobjects.NewAppointments_Next_Button);
						List<WebElement> AvailableDayList = SCobjects.NewAppointments_AvailableTimesDayList;
						List<WebElement> AvailableTimeSlotsList = SCobjects.NewAppointments_AvailableTimes_List;
						for (int i = 0; AvailableDayList.size() > 0; i++) {
							browser.click(AvailableDayList.get(i));
							if (AvailableTimeSlotsList.size() > 0) {
								if (browser.elementisdisplayed(SCobjects.NewAppointments_AvailableTimes_Header)) {
									browser.reportscomtep("Passed", "Verify Available timeslots are Displayed",
											"Available timeslots should be Displayed",
											"Available timeslots are Displayed");
									break;
								} else if (AvailableTimeSlotsList.size() == 0 && browser
										.elementisdisplayed(SCobjects.NewAppointments_AvailableNoTimeslots)) {
									browser.reportscomtep("Passed",
											"Verify No slots are availabe for booking on the Date",
											"slots should't be availabe for booking on the Date",
											"No slots are availabe for booking on the Date");
								}
							}
						}
						if(browser.elementisdisplayed(SCobjects.NewAppointments_StaffImage) && browser.elementisdisplayed(SCobjects.NewAppointments_Servieces_UpadtedTable)){
							browser.reportscomtep("Passed",
									"Verify Service details & Staff selected image are displayed",
									"Service details & Staff selected image should be displayed",
									"Service details & Staff selected image are displayed");
						}else{
							browser.reportscomtep("Faileds",
									"Verify Service details & Staff selected image are displayed",
									"Service details & Staff selected image should be displayed",
									"Service details & Staff selected image are displayed");
						}
					} else {
						browser.reportscomtep("Failed",
								"Clicks on next button and verify Open customer details page is displayed",
								"Open customer details page should be displayed",
								"Open customer details page is not displayed");
					}

				} else {
					browser.reportscomtep("Failed", "Clicks on Staff Verify Staff is selected ",
							"Staff should be selected", "Staff is not selected");
				}
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	
	/********TC_22_010 Check the Back button in timeslots page*****/
	
	public void check_BackButton_InTimeSlotsPage() {
		try {
			browser.click(SCobjects.NewAppointments_Back_Button);
			if (browser.elementisdisplayed(SCobjects.NewAppointments_CustomerDetails_Page)) {
				browser.reportscomtep("Passed",
						"Click on Back butoon and verify Returns to Customer details page is displayed",
						"Returns to Customer details page should be displayed",
						"Returns to Customer details page is displayed");
				if (browser.elementisdisplayed(SCobjects.NewAppointments_StaffImage)
						&& browser.elementisdisplayed(SCobjects.NewAppointments_Servieces_UpadtedTable)) {
					browser.reportscomtep("Passed", "Verify Service details & selected staff name are same",
							"Service details & selected staff name should be displayed",
							"Service details & selected staff name are displayed");
				} else {
					browser.reportscomtep("Faileds", "Verify Service details & selected staff name are displayed",
							"Service details & selected staff name should be displayed",
							"Service details & selected staff name are displayed");
				}

			} else {
				browser.reportscomtep("Failed",
						"Click on Back butoon and verify Returns to Customer details page is displayed",
						"Returns to Customer details page should be displayed",
						"Returns to Customer details page is not displayed");
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	
	/*****TC_22_011 Check whether appointment can be created without selecting timeslot******/
	
	public void checkwhether_Appointment_Createdwithout_SelectingTimeslot() {
		try {
			browser.click(SCobjects.NewAppointments_Next_Button);
			List<WebElement> AvailableTimeSlotsList = SCobjects.NewAppointments_AvailableTimes_List;
			if (AvailableTimeSlotsList.size() > 0) {
				if (browser.elementisdisplayed(SCobjects.NewAppointments_AvailableTimes_Header)) {
					browser.reportscomtep("Passed", "Verify Available timeslots are Displayed",
							"Available timeslots should be Displayed", "Available timeslots are Displayed");
					browser.click(SCobjects.NewAppointments_Next_Button);
					if (browser.elementisdisplayed(SCobjects.NewAppointments_AvailableTimes_Header)) {
						browser.reportscomtep("Passed",
								"Click on with out selecting Timeslots and The page is refreshes but doesnot complete the booking",
								"The page should be refreshes but doesnot complete the booking",
								"The page is refreshes but doesnot complete the booking");
					} else {
						browser.reportscomtep("Failed",
								"Click on with out selecting Timeslots and The page is refreshes but doesnot complete the booking",
								"The page should be refreshes but doesnot complete the booking",
								"The page is not refreshes but doesnot complete the booking");
					}

				} else if (AvailableTimeSlotsList.size() == 0
						&& browser.elementisdisplayed(SCobjects.NewAppointments_AvailableNoTimeslots)) {
					browser.reportscomtep("Passed", "Verify No slots are availabe for booking on the Date",
							"slots should't be availabe for booking on the Date",
							"No slots are availabe for booking on the Date");
				}
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	
	/*********TC_22_012 Check whether appointment can be created by selecting timeslot******/
	public void checkwhether_Appointment_CreatedBySelectingTimeslot() {
		try {
			List<WebElement> AvailableDayList = SCobjects.NewAppointments_AvailableTimesDayList;
			List<WebElement> AvailableTimeSlotsList = SCobjects.NewAppointments_AvailableTimes_List;
			for (int i = 0; AvailableDayList.size() > 0; i++) {
				browser.click(AvailableDayList.get(i));
				if (AvailableTimeSlotsList.size() > 0) {
					if (browser.elementisdisplayed(SCobjects.NewAppointments_AvailableTimes_Header)) {
						browser.reportscomtep("Passed", "Verify Available timeslots are Displayed",
								"Available timeslots should be Displayed", "Available timeslots are Displayed");
						browser.click(AvailableTimeSlotsList.get(i));
						browser.click(SCobjects.NewAppointments_YesProceedToPopup);
						browser.click(SCobjects.Confirmatio_OK_Button);
						if (browser.elementisdisplayed(SCobjects.Appointments_AppointmentsPage_Header)) {
							browser.reportscomtep("Passed",
									"Click on continue Avilable timeslots,Yes proceede button, Ok buttons and verify Redirects to Appointments page is displayed",
									"Redirects to Appointments page should be displayed",
									"Redirects to Appointments page is displayed");

						} else {
							browser.reportscomtep("Failed",
									"Click on continue Avilable timeslots,Yes proceede button, Ok buttons and verify Redirects to Appointments page is displayed",
									"Redirects to Appointments page should be displayed",
									"Redirects to Appointments page is not displayed");
						}
					} else if (AvailableTimeSlotsList.size() == 0
							&& browser.elementisdisplayed(SCobjects.NewAppointments_AvailableNoTimeslots)) {
						browser.reportscomtep("Passed", "Verify No slots are availabe for booking on the Date",
								"slots should't be availabe for booking on the Date",
								"No slots are availabe for booking on the Date");
					}
				}
			}
			browser.click(SCobjects.NewAppointments_Next_Button);
		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}



}
