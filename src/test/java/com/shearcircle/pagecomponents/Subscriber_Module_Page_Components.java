package com.shearcircle.pagecomponents;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
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
	 * 5-12 to 5-14 pending
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
	
	//TC_9_001
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
	
	//****************have to get TC sorted with Sunil. Only one error msg is displayed**********************************//
	
	public void savechangeswithoutaddinganydata() throws Exception {
		
		if (browser.elementisdisplayed(SCobjects.Settings_page_tabs_Business_Details)) {
			browser.reportscomtep("Passed", "Verify Business Setting page is displayed",
					"Business Details page should be displayed", "Business Details page displayed");	
		
				browser.clearText(SCobjects.Settings_page_input_Business_Name);
				browser.clearText(SCobjects.Settings_page_input_Subdomain);
				browser.clearText(SCobjects.Settings_page_input_Address);
				browser.clearText(SCobjects.Settings_page_input_ContactNum);
				browser.clearText(SCobjects.Settings_page_input_Business_Type);
				browser.click(SCobjects.Settings_Save_Change_Button);
				
				if (browser.elementisdisplayed(SCobjects.Settings_error_msg_save_with_invalid_entries)){
					browser.reportscomtep("Passed", "Error message is displayed when page saved with invalid entries",
							"Error message should be displayed", "Error Message is displayed");
				}
				
				else {
					
					browser.reportscomtep("Failed", "Error message is displayed when page saved with invalid entries",
							"Error message should be displayed", "Error Message not displayed");
			
				
				}
		}
		else {
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
				
//TC_9_025
				
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
}

}
