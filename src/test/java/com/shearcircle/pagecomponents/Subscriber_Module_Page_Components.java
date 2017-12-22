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
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.remote.server.handler.GetElementEnabled;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.shearcircle.objectrepository.Login_page_objects;
import com.shearcircle.objectrepository.Subscriber_Module_Page_Objects;
import com.shearcircle.utilities.CommonFunctions;
import com.shearcircle.utilities.StaticVariables;

public class Subscriber_Module_Page_Components extends StaticVariables {
	CommonFunctions browser;
	String TestDataPath;
	// public static WebDriver driver;
	public Subscriber_Module_Page_Objects SCobjects;
	public Login_page_objects Login;

	public Subscriber_Module_Page_Components() throws IOException {
		browser = new CommonFunctions();
		TestDataPath = browser.TestDataPathOf("SubscriberTestData.properties");
		SCobjects = PageFactory.initElements(driver, Subscriber_Module_Page_Objects.class);
		Login = PageFactory.initElements(driver, Login_page_objects.class);
		browser.loaddata(TestDataPath);
	}

	// Application launch
	public void launchApplication() {
		String baseUrl = null;
		try {
			// browser.loaddata(TestDataPath);
			baseUrl = browser.getdata("TestBedURL");
			driver.get(baseUrl + "");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			String apptitle = driver.getTitle();
			if (apptitle.equalsIgnoreCase(baseUrl)) {
				System.out.println("Browser Tilte:" + apptitle);
			}

			if (browser.elementisdisplayed(Login.Home_ShearCircle_Image)) {
				System.out.println("ShearCircle Image displayed");
			} else {
				System.out.println("ShearCircle Image not displayed");
			}

		} catch (Exception e) {
			System.out.println("Exception: " + e);
		}
	}

	public void Subscriber_Registration() {

		String FirstName = null;
		String LastName = null;
		String ProfessionalEmail = null;
		String Password = null;
		String BusinessName = null;
		String Subdomain = null;
		browser.loaddata(TestDataPath);
		FirstName = browser.getdata("FirstName");
		LastName = browser.getdata("LastName");
		BusinessName = browser.getdata("BusinessName");
		Password = browser.getdata("Password");
		ProfessionalEmail = browser.getdata("ProfessionalEmail");
		Subdomain = browser.getdata("Subdomain");

		try {

			if (browser.elementisdisplayed(Login.Home_JoinOurCircle_Link)) {
				browser.reportscomtep("Passed", "Verify JoinCircle link is displayed",
						"JoinCircle link should be displayed", "JoinCircle link is displayed");
				browser.click(Login.Home_JoinOurCircle_Link);
				// browser.wait(5);

				browser.Verify_elementisdisplayed_Report(SCobjects.Subscriber_FirstName_Textbox, "FirstName textbox");
				browser.sendkeys(SCobjects.Subscriber_FirstName_Textbox, FirstName);
				browser.Verify_elementisdisplayed_Report(SCobjects.Subscriber_LastName_Textbox, "LastName textbox");
				browser.sendkeys(SCobjects.Subscriber_LastName_Textbox, LastName);
				browser.Verify_elementisdisplayed_Report(SCobjects.Subscriber_Email_Textbox, "Email textbox");
				browser.sendkeys(SCobjects.Subscriber_Email_Textbox, ProfessionalEmail);
				browser.Verify_elementisdisplayed_Report(SCobjects.Subscriber_BusinessName_Textbox,
						"buisiness textbox");
				browser.sendkeys(SCobjects.Subscriber_BusinessName_Textbox, BusinessName);
				browser.Verify_elementisdisplayed_Report(SCobjects.Subscriber_Subdomain_textbox, "Subdomain textbox");
				browser.sendkeys(SCobjects.Subscriber_Subdomain_textbox, Subdomain);
				browser.Verify_elementisdisplayed_Report(SCobjects.Subscriber_Password_textbox, "Password textbox");
				browser.sendkeys(SCobjects.Subscriber_Password_textbox, Password);
				browser.Verify_elementisdisplayed_Report(SCobjects.Subscriber_ReEnterPassword_textbox,
						"ReEnteredPassword textbox");
				browser.sendkeys(SCobjects.Subscriber_ReEnterPassword_textbox, Password);
				browser.Verify_elementisdisplayed_Report(SCobjects.Subscriber_Termsofservice_checkbox,
						"Termsofservice checkbox");
				browser.check_Checkbox(SCobjects.Subscriber_Termsofservice_checkbox);
				browser.Verify_elementisdisplayed_Report(SCobjects.Subscriber_billingAgrement_checkbox,
						"billingagrement Checkbox");
				browser.check_Checkbox(SCobjects.Subscriber_billingAgrement_checkbox);
				browser.Verify_elementisdisplayed_Report(SCobjects.Subscriber_JoinOurCircle_Button,
						"JoinCircle Button");
				browser.click(SCobjects.Subscriber_JoinOurCircle_Button);
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}

	}

	// TS001_Subscriber Visits Join Our Circle Page

	// TC_1_001
	public void visitsJoinOurCirclepage() throws Exception {
		String text = browser.getelementtext(SCobjects.Subscriber_JoinOurCircle_Button);
		System.out.println("Button has displayed :" + text);
	}

	// TC_1_002
	public void CreateAccountBySubdomain() throws Exception {
		try {
			browser.clickUsingJavaScript(SCobjects.Subscriber_JoinOurCircle_Button);
			if (browser.elementisdisplayed(SCobjects.Subscriber_Customer_JoinOurCircle_Button)) {
				browser.reportscomtep("Passed",
						"Click on Joinour circle link and verify Register With ShearCircle page is displayeSCobjects.Subscriber_Professional_JoinOurCircle_Button, browserd",
						"Register With ShearCircle page should displayed", "Register With ShearCircle page displayed");
				browser.Verify_elementisdisplayed_Report(SCobjects.Subscriber_Customer_JoinOurCircle_Button,
						browser.getdata("AreyouaCustomer"));
				browser.Verify_elementisdisplayed_Report(SCobjects.Subscriber_Customer_JoinOurCircle_Button,
						browser.getdata("AreyouaProfessional"));
			} else {
				browser.reportscomtep("Failed",
						"Click on Joinour circle link and verify Register With ShearCircle page is displayed",
						"Register With ShearCircle page should displayed",
						"Register With ShearCircle page not displayed");
			}
		} catch (WebDriverException e) {
			e.printStackTrace();
		}
	}

	// TC_1_003
	public void checkJoinOurCircleButton() throws Exception {
		browser.clickUsingJavaScript(SCobjects.Subscriber_Professional_JoinOurCircle_Button);
		browser.explicitWaitUsingElementToBeClickable(SCobjects.Subscriber_Professional_JoinOurCircle_Button);
	}

	// TC_1_004
	public void validateElementsOnJoinOurCirclepage() throws Exception {
		// browser.explicitWaitUsingElementToBeClickable(SCobjects.Subscriber_Professional_JoinOurCircle_Button);
		browser.FindNumberOfTextBoxes();
		browser.FindNumberOfCheckBoxes();
		browser.FindNumberOfLinks();
		browser.FindNumberOfDropdown();
	}

	// TC_1_005
	public void checkFieldValidations() throws Exception {

		browser.scrollintoviewelement(SCobjects.Subscriber_StartFreeTrial_button);
		browser.clickUsingJavaScript(SCobjects.Subscriber_StartFreeTrial_button);
		Thread.sleep(3000);
		browser.assertionByusingWebElement(SCobjects.Subscriber_FirstnameErrMsg, browser.getdata("FirstnameErrMsg"));
		browser.assertionByusingWebElement(SCobjects.Subscriber_LastnameErrMsg, browser.getdata("LastnameErrMsg"));
		browser.assertionByusingWebElement(SCobjects.Subscriber_EmailaddressErrMsg, browser.getdata("EmailErrMsg"));
		browser.assertionByusingWebElement(SCobjects.Subscriber_SubDomainErrMsg, browser.getdata("SubDomainErrMsg"));
		browser.scrollintoviewelement(SCobjects.Subscriber_PasswordErrMsg);
		browser.assertionByusingWebElement(SCobjects.Subscriber_PasswordErrMsg, browser.getdata("PasswordErrMsg"));
		browser.assertionByusingWebElement(SCobjects.Subscriber_ReEnterPasswordErrMsg,
				browser.getdata("ReEnterPasswordErrMsg"));
		browser.assertionByusingWebElement(SCobjects.Subscriber_TermsErrMsg, browser.getdata("TermsErrMsg"));
		browser.scrollintoviewelement(SCobjects.Subscriber_BillingAgreementErrMsg);
		browser.assertionByusingWebElement(SCobjects.Subscriber_BillingAgreementErrMsg,
				browser.getdata("BillingAgreementErrMsg"));
		driver.navigate().refresh();
		// Enter some invalid data then click on Start Free Trail button
		browser.sendkeys(SCobjects.Subscriber_FirstName_Textbox, browser.getdata("InvalidData"));
		browser.sendkeys(SCobjects.Subscriber_LastName_Textbox, browser.getdata("InvalidData"));
		browser.sendkeys(SCobjects.Subscriber_Email_Textbox, browser.getdata("InvalidData"));
		browser.scrollintoviewelement(SCobjects.Subscriber_Password_textbox);
		browser.sendkeys(SCobjects.Subscriber_Password_textbox, browser.getdata("InvalidataForPassword"));
		browser.sendkeys(SCobjects.Subscriber_ReEnterPassword_textbox, browser.getdata("InvalidataForPassword"));

		Thread.sleep(2000);
		// validate error messages
		browser.scrollintoviewelement(SCobjects.Subscriber_FirstnameErrMsg);
		browser.assertionByusingWebElement(SCobjects.Subscriber_FirstnameErrMsg, browser.getdata("NameErrMsg"));
		browser.assertionByusingWebElement(SCobjects.Subscriber_LastnameErrMsg, browser.getdata("NameErrMsg"));
		browser.assertionByusingWebElement(SCobjects.Subscriber_EmailaddressErrMsg, browser.getdata("EmailErrMsg1"));
		browser.scrollintoviewelement(SCobjects.Subscriber_PasswordErrMsg);
		browser.assertionByusingWebElement(SCobjects.Subscriber_PasswordErrMsg, browser.getdata("PasswordErrMsg1"));
		browser.assertionByusingWebElement(SCobjects.Subscriber_ReEnterPasswordErrMsg,
				browser.getdata("ReEnterPasswordErrMsg1"));

	}

	// TC_1_006
	public void checkFieldValidationsAreCleared() throws Exception {
		driver.navigate().refresh();
		browser.elementisdisplayed(SCobjects.Subscriber_FirstnameErrMsg);
	}

	// TC_1_007&8
	public void checkTermsofServicelink() throws Exception {
		browser.scrollintoviewelement(SCobjects.Subscriber_TermsOfService_link);
		browser.click(SCobjects.Subscriber_TermsOfService_link);
		browser.elementisdisplayed(SCobjects.Subscriber_TemrsAndConditions_Alert);
		browser.click(SCobjects.Subscriber_TemrsAndConditions_Close);
	}

	// TC_1_009&10
	public void checkPrivacyPolicylink() throws Exception {
		browser.scrollintoviewelement(SCobjects.Subscriber_PrivacyPolicy_link);
		browser.click(SCobjects.Subscriber_PrivacyPolicy_link);
		browser.elementisdisplayed(SCobjects.Subscriber_TemrsAndConditions_Alert);
		browser.click(SCobjects.Subscriber_PrivacyPolicy_link);

	}

	// TC_1_011
	public void signinLinkFunctioning() throws Exception {
		browser.scrollintoviewelement(SCobjects.Subscriber_Sign_Link);
		browser.click(SCobjects.Subscriber_Sign_Link);
		browser.elementisdisplayed(SCobjects.Subscriber_Alreadyhaveanaccount);
		driver.navigate().back();
		Thread.sleep(2000);
	}

	// TC_1_012
	public void invalidDatavalidations() throws Exception {
		System.out.println("Covered in TC_1_005");
	}

	// TC_1_013
	public void retypePasswordValidation() throws Exception {
		driver.navigate().refresh();
		// Enter some valid data then click on Start Free Trail button
		browser.sendkeys(SCobjects.Subscriber_FirstName_Textbox, browser.getdata("InvalidData"));
		browser.sendkeys(SCobjects.Subscriber_LastName_Textbox, browser.getdata("InvalidData"));
		browser.sendkeys(SCobjects.Subscriber_Email_Textbox, browser.getdata("InvalidData"));
		browser.scrollintoviewelement(SCobjects.Subscriber_Password_textbox);
		browser.sendkeys(SCobjects.Subscriber_Password_textbox, browser.getdata("InvalidData"));
		browser.sendkeys(SCobjects.Subscriber_ReEnterPassword_textbox, browser.getdata("InvalidataForPassword"));
		browser.click(SCobjects.Subscriber_TermsOfService_link);
		browser.click(SCobjects.Subscriber_billingAgrement_checkbox);
		/*
		 * browser.scrollintoviewelement(SCobjects.Subscriber_StartFreeTrial_button);
		 * browser.clickUsingJavaScript(SCobjects.Subscriber_StartFreeTrial_button);
		 */
		Thread.sleep(2000);
		browser.assertionByusingWebElement(SCobjects.Subscriber_ReEnterPasswordErrMsg,
				browser.getdata("ConformPasswordErrMsg"));
	}

	// TC_1_014
	public void acceptTermsAndBillingValidation() throws Exception {
		browser.click(SCobjects.Subscriber_TermsOfService_link);
		browser.click(SCobjects.Subscriber_billingAgrement_checkbox);
		browser.scrollintoviewelement(SCobjects.Subscriber_StartFreeTrial_button);
		browser.clickUsingJavaScript(SCobjects.Subscriber_StartFreeTrial_button);
		Thread.sleep(2000);
		browser.scrollintoviewelement(SCobjects.Subscriber_TermsErrMsg);
		browser.assertionByusingWebElement(SCobjects.Subscriber_TermsErrMsg, browser.getdata("TermsErrMsg"));
		browser.assertionByusingWebElement(SCobjects.Subscriber_BillingAgreementErrMsg,
				browser.getdata("BillingAgreementErrMsg"));
	}

	// TC_1_015
	public void existingSubdomainValidation() throws Exception {
		browser.click(SCobjects.Subscriber_TermsOfService_link);
		browser.click(SCobjects.Subscriber_billingAgrement_checkbox);
		browser.scrollintoviewelement(SCobjects.Subscriber_BusinessName_Textbox);
		browser.clearText(SCobjects.Subscriber_BusinessName_Textbox);
		browser.sendkeys(SCobjects.Subscriber_BusinessName_Textbox, browser.getdata("BusinessNameExisting"));
		SCobjects.Subscriber_BusinessName_Textbox.sendKeys(Keys.RETURN);
		browser.assertionByusingWebElement(SCobjects.Subscriber_Subdomain_errMsg, browser.getdata("SubDomainErrMsg1"));

	}

	// TC_1_016 & 17
	public void existingEmailValidation() throws Exception {
		browser.scrollintoviewelement(SCobjects.Subscriber_Email_Textbox);
		browser.clearText(SCobjects.Subscriber_Email_Textbox);
		browser.sendkeys(SCobjects.Subscriber_Email_Textbox, browser.getdata("UserName"));
		SCobjects.Subscriber_BusinessName_Textbox.sendKeys(Keys.RETURN);
		browser.assertionByusingWebElement(SCobjects.Subscriber_EmailaddressErrMsg, browser.getdata("EmailErrMsg2"));
		browser.clearText(SCobjects.Subscriber_Email_Textbox);
		browser.sendkeys(SCobjects.Subscriber_Email_Textbox, browser.getdata("CustomerUserName"));
		SCobjects.Subscriber_BusinessName_Textbox.sendKeys(Keys.RETURN);
		browser.assertionByusingWebElement(SCobjects.Subscriber_EmailaddressErrMsg, browser.getdata("EmailErrMsg2"));
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

	// TS_4_001
	public void loginButtonClickable() throws InterruptedException {
		launchApplication();
		driver.manage().window().maximize();
		browser.clickUsingJavaScript(SCobjects.Subscriber_Login_Button);
		browser.waitforelementtobevisible(SCobjects.Subscriber_SignIn_Text, 5);

	}

	// TS_4_002
	public void loginUsingInvalidCredentials() throws InterruptedException {
		browser.sendkeys(SCobjects.Subscriber_UserName_TextBox, browser.getdata("MyAccountIVUserName"));
		browser.sendkeys(SCobjects.Subscriber_Password_TextBox, browser.getdata("MyAccountIVPassword"));
		browser.clickUsingJavaScript(SCobjects.Subscriber_SignIn_Button);
		Thread.sleep(3000);
		browser.assertionByusingWebElement(SCobjects.Subscriber_InvalidUserErrMsg,
				browser.getdata("InvalidUserErrMsg"));
		
	}

	// TS_4_003 //Before execute this create new credentials and verify from mail also
	public void loginUsingValidCredentials() throws InterruptedException {
		browser.clearText(SCobjects.Subscriber_UserName_TextBox);
		browser.clearText(SCobjects.Subscriber_Password_TextBox);
		browser.sendkeys(SCobjects.Subscriber_UserName_TextBox, browser.getdata("MyAccountUserName"));
		browser.sendkeys(SCobjects.Subscriber_Password_TextBox, browser.getdata("MyAccountPassword"));
		browser.clickUsingJavaScript(SCobjects.Subscriber_SignIn_Button);
		browser.elementisdisplayed(SCobjects.Subscriber_WhatDescribesYouBest_Text);
		Thread.sleep(3000);
	}

	// TS_4_004
	public void loginintoDashboard() throws InterruptedException {
		browser.clickUsingJavaScript(SCobjects.Subscriber_MyAccount);
		browser.elementisdisplayed(SCobjects.Subscriber_WhatDescribesYouBest_Text);
		Thread.sleep(3000);
	}

	// TS_4_005
	public void signinfromWhatDescribesYouPage() throws InterruptedException {
		browser.clickUsingJavaScript(SCobjects.Subscriber_WhatDescribesYouBest_logout_Text);
		browser.elementisdisplayed(SCobjects.Subscriber_UserName_TextBox);
		browser.sendkeys(SCobjects.Subscriber_UserName_TextBox, browser.getdata("MyAccountUserName"));
		browser.sendkeys(SCobjects.Subscriber_Password_TextBox, browser.getdata("MyAccountPassword"));
		browser.clickUsingJavaScript(SCobjects.Subscriber_SignIn_Button);
		Thread.sleep(1500);
		browser.elementisdisplayed(SCobjects.Subscriber_WhatDescribesYouBest_Text);
		Thread.sleep(1500);
	}

	// TS_4_006
	public void clickonNextStepinWhatDescribesYouPage() throws InterruptedException {
		browser.clickUsingJavaScript(SCobjects.Subscriber_WhatDescribesYouBest_NextStep);
		String Message = browser.getelementtext(SCobjects.Subscriber_WhatDescribesYouBest_Pleasechooseservice);
		System.out.println("***********" + Message + "********");
		Thread.sleep(1500);
		browser.assertionByusingWebElement(SCobjects.Subscriber_WhatDescribesYouBest_Pleasechooseservice,
				browser.getdata("NextStepErrMsg"));		
	}

	// TS_4_007
	public void clickonNextStepSelectingOtherService() throws InterruptedException {
		browser.scrollintoviewelement(SCobjects.Subscriber_WhatDescribesYouBest_OtherService);
		browser.clickUsingJavaScript(SCobjects.Subscriber_WhatDescribesYouBest_OtherService);
		browser.clickUsingJavaScript(SCobjects.Subscriber_WhatDescribesYouBest_NextStep);
		Thread.sleep(1500);
		browser.elementisdisplayed(SCobjects.Subscriber_WhatDescribesYouBest_OtherService);
		Thread.sleep(3000);
	}

	// TS_4_008
	public void clickonNextStepaddingServiceinOtherService() throws InterruptedException {
		browser.scrollintoviewelement(SCobjects.Subscriber_WhatDescribesYouBest_OtherService);
		browser.clickUsingJavaScript(SCobjects.Subscriber_WhatDescribesYouBest_OtherService);
		browser.sendkeys(SCobjects.Subscriber_WhatDescribesYouBest_AddService_Text, browser.getdata("ServiceAdded"));
		browser.clickUsingJavaScript(SCobjects.Subscriber_WhatDescribesYouBest_AddService_button);
		Thread.sleep(3000);
		//browser.clickUsingJavaScript(SCobjects.Subscriber_WhatDescribesYouBest_NextStep);
		browser.elementisdisplayed(SCobjects.Subscriber_WhatDescribesYouBest_YourBusinessDetails);

	}

	// TS_4_009
		public void clickonNextStepaddingService() throws InterruptedException {
		//unable to come back for other selection like spa....
		}
	// TS_4_010
	public void clickonMyAccountinBusinessDetailspage() throws InterruptedException {
		browser.clickUsingJavaScript(SCobjects.Subscriber_MyAccount);
		browser.elementisdisplayed(SCobjects.Subscriber_WhatDescribesYouBest_YourBusinessDetails);
		Thread.sleep(3000);
	}

	// TS_4_011
	public void ReloginintoBusinessDetailspage() throws InterruptedException {
		browser.clickUsingJavaScript(SCobjects.Subscriber_WhatDescribesYouBest_logout_Text);
		Thread.sleep(3000);
		browser.clickUsingJavaScript(SCobjects.Subscriber_Login_Button);
		browser.elementisdisplayed(SCobjects.Subscriber_WhatDescribesYouBest_YourBusinessDetails);
		browser.sendkeys(SCobjects.Subscriber_UserName_TextBox, browser.getdata("MyAccountUserName"));
		browser.sendkeys(SCobjects.Subscriber_Password_TextBox, browser.getdata("MyAccountPassword"));
		browser.clickUsingJavaScript(SCobjects.Subscriber_SignIn_Button);
		Thread.sleep(2000);
		browser.elementisdisplayed(SCobjects.Subscriber_WhatDescribesYouBest_YourBusinessDetails);
		Thread.sleep(000);
	}

	// TS_4_012
	public void clickonNextStepinBusinessDetailspage() throws InterruptedException {
		browser.scrollintoviewelement(SCobjects.Subscriber_WhatDescribesYouBest_YourBusinessDetails);
		browser.clickUsingJavaScript(SCobjects.Subscriber_WhatDescribesYouBest_BusinessDetailsNextStep);
		String Message1 = browser.getelementtext(SCobjects.Subscriber_BusinessDetails_PleaseEnterAddress_Text);
		System.out.println("***********" + Message1 + "********");
		String Message2 = browser.getelementtext(SCobjects.Subscriber_BusinessDetails_PleaseEnterCity_Text);
		System.out.println("***********" + Message2 + "********");
		//browser.scrollintoviewelement(SCobjects.Subscriber_BusinessDetails_PleaseEnterZipcode_Text);
		String Message3 = browser.getelementtext(SCobjects.Subscriber_BusinessDetails_PleaseEnterZipcode_Text);
		System.out.println("***********" + Message3 + "********");
		Thread.sleep(3000);
	}

	// TS_4_013
	public void clickonNextStepinBusinessDetailspageEnteringdetails() throws InterruptedException {
		
		browser.scrollintoviewelement(SCobjects.Subscriber_WhatDescribesYouBest_YourBusinessDetails);
		browser.sendkeys(SCobjects.Subscriber_BusinessDetails_PleaseEnterAddress_Editbox,
				browser.getdata("BusinessAddress"));
		browser.sendkeys(SCobjects.Subscriber_BusinessDetails_PleaseEnterCity_Editbox, browser.getdata("BusinessCity"));
		browser.selectByVisibleText(SCobjects.Subscriber_BusinessDetails_PleaseEnterState_Dropdownbox,browser.getdata("BusinessCountry") );
		//browser.scrollintoviewelement(SCobjects.Subscriber_BusinessDetails_PleaseEnterZipcode_Editbox);
		browser.sendkeys(SCobjects.Subscriber_BusinessDetails_PleaseEnterZipcode_Editbox,
				browser.getdata("BusinessZipcode"));
		browser.clickUsingJavaScript(SCobjects.Subscriber_WhatDescribesYouBest_BusinessDetailsNextStep);
		Thread.sleep(1500);
		browser.elementisdisplayed(SCobjects.Subscriber_WelcomeBusinessName_Text);
		String businessName = browser.getelementtext(SCobjects.Subscriber_WelcomeBusinessName_Text);
		System.out.println(businessName);
		Thread.sleep(3000);
	}

	// TS_4_014
	public void loginintoDashboarddirectly() throws InterruptedException {
		browser.clickUsingJavaScript(SCobjects.Subscriber_HumanIcon);
		Thread.sleep(500);
		browser.clickUsingJavaScript(SCobjects.Subscriber_HumanIcon_logout_link);
		Thread.sleep(1500);
		browser.sendkeys(SCobjects.Subscriber_UserName_TextBox, browser.getdata("MyAccountUserName"));
		browser.sendkeys(SCobjects.Subscriber_Password_TextBox, browser.getdata("MyAccountPassword"));
		browser.clickUsingJavaScript(SCobjects.Subscriber_SignIn_Button);
		Thread.sleep(1500);
		browser.elementisdisplayed(SCobjects.Subscriber_WelcomeBusinessName_Text);
		String businessName = browser.getelementtext(SCobjects.Subscriber_WelcomeBusinessName_Text);
		System.out.println("****businessName***************:"+businessName);
	}

	// TS_5_001
	public void loginToDashboard() throws Exception {
		launchApplication();
		browser.clickUsingJavaScript(SCobjects.Subscriber_Login_Button);
		browser.sendkeys(SCobjects.Subscriber_UserName_TextBox, browser.getdata("DashboardUserName"));
		browser.sendkeys(SCobjects.Subscriber_Password_TextBox, browser.getdata("DashboardPassword"));
		// browser.scrollintoviewelement(SCobjects.Subscriber_SignIn_Button);
		browser.clickUsingJavaScript(SCobjects.Subscriber_SignIn_Button);
		Thread.sleep(3000);
	}

	// TS_5_002
	public void validateDashboardElementsFirstTimeLogin() throws Exception {
		// NoAppointments text has displayed or not?
		browser.elementisdisplayed(SCobjects.Subscriber_TodaysAppointment_Text);
		browser.elementisdisplayed(SCobjects.Subscriber_NoAppointments_Text);
		// Welcome Business Name+

		String businessName = browser.getelementtext(SCobjects.Subscriber_WelcomeBusinessName_Text);
		System.out.println(businessName);
		if (businessName.contains(browser.getdata("DashboardBusinessName"))) {
			System.out.println("Business Name is displayed");
		} else {
			System.out.println("Business Name is not displayed");
		}
		// Last login date & time – First Time
		String lastLoginDateAndTime = browser.getelementtext(SCobjects.Subscriber_LastLoginDateAndTime);
		System.out.println("Last Login Date " + lastLoginDateAndTime + "is displayed");
		// Default SC logo
		browser.elementisdisplayed(SCobjects.Subscriber_DefaultSClogo);
		// Today's/This Month's / Total Earnings – $0.00
		String TodaysEarningsAmount = browser.getelementtext(SCobjects.Subscriber_TodaysEarningsAmount);
		System.out.println("********TodaysEarningsAmount  is : " + TodaysEarningsAmount + " displayed*********");
		String ThisMonthsEarningsAmount = browser.getelementtext(SCobjects.Subscriber_ThisMonthsEarningsAmount);
		System.out
				.println("********ThisMonthsEarningsAmount  is : " + ThisMonthsEarningsAmount + " displayed*********");
		String TotalEarningsAmount = browser.getelementtext(SCobjects.Subscriber_TotalEarningsAmount);
		System.out.println("********TotalEarningsAmount  is : " + TotalEarningsAmount + " displayed*********");

		if (TodaysEarningsAmount.equals("$0.00") && ThisMonthsEarningsAmount.equals("$0.00")
				&& TotalEarningsAmount.equals("$0.00")) {
			System.out.println(
					"***************Today's/This Month's / Total Earnings is displayed value : $0.00**********");
		} else {
			System.out.println(
					"********Today's/This Month's / Total Earnings  is displayed value is not equal to  : $0.00********");
		}

		// Total Service Offered – 0 / Total Products Offered – 0 /My Clients List – 0 /
		// Total Staff – 0 /Total Online Orders – 0 / Total Offline Orders – 0/
		browser.displayTextWithValue(SCobjects.Subscriber_TotalServiceOffered_Text,
				SCobjects.Subscriber_TotalServiceOfferedCount);
		browser.displayTextWithValue(SCobjects.Subscriber_TotalProductOffered_Text,
				SCobjects.Subscriber_TotalProductOfferedCount);
		browser.displayTextWithValue(SCobjects.Subscriber_MyClientList_Text, SCobjects.Subscriber_MyClientListCount);
		browser.displayTextWithValue(SCobjects.Subscriber_TotalStaff_Text, SCobjects.Subscriber_TotalStaffCount);
		browser.displayTextWithValue(SCobjects.Subscriber_TotalOnlineOrders_Text,
				SCobjects.Subscriber_TotalOnlineOrdersCount);
		browser.displayTextWithValue(SCobjects.Subscriber_TotalOfflineOrders_Text,
				SCobjects.Subscriber_TotalOfflineOrdersCount);

		// Subscription Details- /Orange Dot with Trial written in it / You are
		// currently using trial version / Trial expires on dd/mmm/yyyy
		String Subscription = browser.getelementtext(SCobjects.Subscriber_SubscriptionDetails_text);
		System.out.println(Subscription + "is  displayed");
		browser.elementisdisplayed(SCobjects.Subscriber_TrialCircleLogo);
		String TrailVersionText = browser.getelementtext(SCobjects.Subscriber_TrailVersionText);
		System.out.println(TrailVersionText + " is  displayed");
		String TrialExpiresOn = browser.getelementtext(SCobjects.Subscriber_TrialExpiresOn);
		System.out.println(TrialExpiresOn + " is  displayed");

	}

	// TS_5_003
	public void validateLastLoginDateAndTime() throws Exception {
		String LastLoginDateAndTime1 = browser.getelementtext(SCobjects.Subscriber_LastLoginDateAndTime);
		browser.click(SCobjects.Subscriber_UserIcon);
		browser.click(SCobjects.Subscriber_Logout);
		Thread.sleep(2000);
		browser.sendkeys(SCobjects.Subscriber_UserName_TextBox, browser.getdata("DashboardUserName"));
		browser.sendkeys(SCobjects.Subscriber_Password_TextBox, browser.getdata("DashboardPassword"));
		browser.scrollintoviewelement(SCobjects.Subscriber_SignIn_Button);
		browser.clickUsingJavaScript(SCobjects.Subscriber_SignIn_Button);
		Thread.sleep(3000);
		String LastLoginDateAndTime2 = browser.getelementtext(SCobjects.Subscriber_LastLoginDateAndTime);
		System.out.println("LastLoginDateAndTime1>>>>>" + LastLoginDateAndTime1);
		System.out.println("LastLoginDateAndTime2>>>>>>>>" + LastLoginDateAndTime2);
		if (LastLoginDateAndTime1 != LastLoginDateAndTime2) {
			System.out.println("***********LastLoginDateAndTime is uptodate.....");
		} else {
			System.out.println("***********LastLoginDateAndTime is not uptodate.....");
		}

	}

	// TS_5_004to011
	public void validateAllLinksClickble() throws Exception {
		// TC_04
		browser.click(SCobjects.Subscriber_ViewAll_Link);
		// It will navigate to Appointments page.
		// driver.switchTo().alert().accept();
		browser.waitforelementtobevisible(SCobjects.Subscriber_Appointments_Text, 10);
		driver.navigate().back();
		Thread.sleep(2000);

		// TC_05
		browser.click(SCobjects.Subscriber_ManageProfile_link);
		// It will navigate to UpdateProfileDetails
		browser.waitforelementtobevisible(SCobjects.Subscriber_UpdateProfileDetails, 10);
		driver.navigate().back();
		Thread.sleep(2000);
		// TC_06
		browser.click(SCobjects.Subscriber_TotalServiceOffered_Text);
		// It will navigate to TotalServicesOffered page
		browser.waitforelementtobevisible(SCobjects.Subscriber_UpdateProfileDetails, 10);
		driver.navigate().back();
		Thread.sleep(2000);
		// TC_07
		browser.click(SCobjects.Subscriber_TotalProductOffered_Text);
		browser.waitforelementtobevisible(SCobjects.Subscriber_Products, 10);
		driver.navigate().back();
		Thread.sleep(2000);
		// TC_08
		browser.click(SCobjects.Subscriber_MyClientList_Text);
		browser.waitforelementtobevisible(SCobjects.Subscriber_Clients, 10);
		driver.navigate().back();
		Thread.sleep(2000);
		// TC_09
		browser.click(SCobjects.Subscriber_TotalStaff_Text);
		browser.waitforelementtobevisible(SCobjects.Subscriber_Clients, 10);
		driver.navigate().back();
		Thread.sleep(2000);
		// TC_010
		browser.click(SCobjects.Subscriber_TotalOnlineOrders_Text);
		browser.waitforelementtobevisible(SCobjects.Subscriber_Appointments_Text, 10);
		driver.navigate().back();
		Thread.sleep(2000);
		// TC_011
		browser.click(SCobjects.Subscriber_TotalOfflineOrders_Text);
		browser.waitforelementtobevisible(SCobjects.Subscriber_Bookingspage, 10);
		driver.navigate().back();
		Thread.sleep(2000);

	}

	// TS_8
	// TC_8_001
	public void updatePasswordPage() throws Exception {
		launchApplication();
		driver.manage().window().maximize();
		browser.clickUsingJavaScript(SCobjects.Subscriber_Login_Button);
		browser.sendkeys(SCobjects.Subscriber_UserName_TextBox, browser.getdata("DashboardUserName"));
		browser.sendkeys(SCobjects.Subscriber_Password_TextBox, browser.getdata("DashboardPassword"));
		// browser.scrollintoviewelement(SCobjects.Subscriber_SignIn_Button);
		browser.clickUsingJavaScript(SCobjects.Subscriber_SignIn_Button);
		Thread.sleep(3000);
		browser.click(SCobjects.Subscriber_UserIcon);
		browser.click(SCobjects.Subscriber_ClickOnChangePassword);
		browser.waitforelementtobevisible(SCobjects.Subscriber_UpdateProfilePassword, 10);

	}

	// TC_8_002
	public void clickOnUpdateButtonWithoutEnteringData() throws Exception {
		browser.clickUsingJavaScript(SCobjects.Subscriber_ClickUpdateButton);
		Thread.sleep(2000);
		browser.assertionByusingWebElement(SCobjects.Subscriber_GetOldPasswordMessage,
				browser.getdata("OldPasswordErrMsg"));
		browser.assertionByusingWebElement(SCobjects.Subscriber_GetNewPasswordMessage,
				browser.getdata("NewPasswordErrMsg"));
	}

	// TC_8_003
	public void enterWrongOldPassword() {
		browser.sendkeys(SCobjects.Subscriber_EnterOldPasswordText, browser.getdata("InvalidOldPassword"));
		browser.sendkeys(SCobjects.Subscriber_EnterNewPasswordText, browser.getdata("NewPassword"));
		browser.sendkeys(SCobjects.Subscriber_EnterRetypePasswordText, browser.getdata("NewPassword"));
		browser.clickUsingJavaScript(SCobjects.Subscriber_ClickUpdateButton);
		browser.waitforelementtobevisible(SCobjects.Subscriber_InvalidCurrentPassword, 10);
		browser.assertionByusingWebElement(SCobjects.Subscriber_InvalidCurrentPassword,
				browser.getdata("WrongPasswordErrMsg"));

	}

	// TC_8_004
	public void enterInvalidNewPasswordLength() {
		browser.sendkeys(SCobjects.Subscriber_EnterOldPasswordText, browser.getdata("OldPassword"));
		browser.sendkeys(SCobjects.Subscriber_EnterNewPasswordText, browser.getdata("InvalidNewPassword"));
		browser.tabMoveUsingKeys();
		browser.tabMoveUsingKeys();
		// Password must be minimum 6 letters
		browser.assertionByusingWebElement(SCobjects.Subscriber_GetNewPasswordMessage,
				browser.getdata("MinimumPasswordErrMsg"));
		browser.tabMoveUsingKeys();
		browser.click(SCobjects.Subscriber_ClickUpdateButton);
		browser.tabMoveUsingKeys();
		// Please enter the same value again
		browser.assertionByusingWebElement(SCobjects.Subscriber_RetypePasswordMessage,
				browser.getdata("RetypePasswordErrMsg"));

	}

	// TC_8_005
	public void enterInvalidNewPasswordwithSpaces() {
		browser.sendkeys(SCobjects.Subscriber_EnterOldPasswordText, browser.getdata("OldPassword"));
		browser.sendkeys(SCobjects.Subscriber_EnterNewPasswordText, browser.getdata("NewPasswordWithSpaces"));
		browser.sendkeys(SCobjects.Subscriber_EnterRetypePasswordText, browser.getdata("NewPasswordWithSpaces"));
		browser.tabMoveUsingKeys();
		// browser.click(SCobjects.Subscriber_ClickUpdateButton);
		// white space errmsg validation
		browser.assertionByusingWebElement(SCobjects.Subscriber_GetNewPasswordMessage,
				browser.getdata("WhiteSpaceErrMsg"));

	}

	// TC_8_006
	public void checkPasswordIsUpdated() throws Exception {
		browser.clearText(SCobjects.Subscriber_EnterOldPasswordText);
		browser.sendkeys(SCobjects.Subscriber_EnterOldPasswordText, browser.getdata("OldPassword"));
		browser.clearText(SCobjects.Subscriber_EnterNewPasswordText);
		browser.sendkeys(SCobjects.Subscriber_EnterNewPasswordText, browser.getdata("NewPassword"));
		browser.clearText(SCobjects.Subscriber_EnterRetypePasswordText);
		browser.sendkeys(SCobjects.Subscriber_EnterRetypePasswordText, browser.getdata("NewPassword"));
		browser.click(SCobjects.Subscriber_ClickUpdateButton);
		Thread.sleep(5000);
		// Password Updated Succesfully
		browser.assertionByusingWebElement(SCobjects.Subscriber_PasswordUpdatedSuccessfully,
				browser.getdata("PasswordSuccessMsg"));
		Thread.sleep(3000);
	}

	// TC_8_007
	public void clickOnCancelButton() {
		browser.click(SCobjects.Subscriber_ClickCancelButton);
		browser.waitforelementtobevisible(SCobjects.Subscriber_WelcomeBusinessName_Text, 10);

	}

	// TC_8_008
	public void validateLoginWithOldPassword() throws Exception {
		browser.click(SCobjects.Subscriber_UserIcon);
		browser.click(SCobjects.Subscriber_Logout);
		Thread.sleep(5000);
		browser.sendkeys(SCobjects.Subscriber_UserName_TextBox, browser.getdata("DashboardUserName"));
		browser.sendkeys(SCobjects.Subscriber_Password_TextBox, browser.getdata("OldPassword"));
		browser.click(SCobjects.Subscriber_SignIn_Button);

		Thread.sleep(5000);
		// Invalid Credentials error message
		browser.assertionByusingWebElement(SCobjects.Subscriber_Invalidcredentials,
				browser.getdata("InvalidCredentialsErrMsg"));
	}

	// TC_8_009
	public void validateLoginWithNewPassword() throws Exception {
		// Change pwd
		browser.clearText(SCobjects.Subscriber_Password_TextBox);
		browser.sendkeys(SCobjects.Subscriber_Password_TextBox, browser.getdata("NewPassword"));
		browser.clickUsingJavaScript(SCobjects.Subscriber_SignIn_Button);
		Thread.sleep(3000);

	}

}
