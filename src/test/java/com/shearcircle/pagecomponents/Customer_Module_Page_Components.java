package com.shearcircle.pagecomponents;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestNGListener;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.shearcircle.objectrepository.Customer_Module_Page_Objects;
import com.shearcircle.objectrepository.Login_page_objects;
import com.shearcircle.utilities.CommonFunctions;
import com.shearcircle.utilities.StaticVariables;

import utils.ExtentReports.ExtentTestManager;
import utils.Listeners.TestListener;

public class Customer_Module_Page_Components extends StaticVariables {	
	//public static WebDriver driver;
	public Customer_Module_Page_Objects CustomerModule;
	public Login_page_objects Login;
	public CommonFunctions browser;	
	String TestDataPath = null;
	
	public Customer_Module_Page_Components(WebDriver driver) throws IOException {	
		browser = new CommonFunctions();		
		TestDataPath = browser.TestDataPathOf("CustomerTestData.properties");	
		browser.loaddata(TestDataPath);		
		CustomerModule = PageFactory.initElements(driver, Customer_Module_Page_Objects.class);
		Login = PageFactory.initElements(driver, Login_page_objects.class);				
	}
	
	
	//Application launch
	public void ShearCircle_LaunchApplication(){
		String baseUrl = null;
		String Applicationtitle = "ShearCircle";
	    try {   
	    	browser.loaddata(TestDataPath);
	    	baseUrl = browser.getdata("TestBedURL");	    	
	    	//baseUrl = "https://shearcircle.com/testbed/home";
	    	//System.out.println("App  URL:"+baseUrl);
	    	driver.get(baseUrl + "");
	    	driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);		    
		    String apptitle = driver.getTitle();
		    if (apptitle.equalsIgnoreCase(Applicationtitle)){
		    System.out.println("Browser Tilte:"+apptitle);     
		    }		    
		    
		    if(browser.elementisdisplayed(Login.Home_ShearCircle_Image)) {
		    	
		    	browser.reportscomtep("Passed", "Verify ShearCircle Home page is displayed", "ShearCircle Home page should be displayed", "ShearCircle Home page displayed");
				 System.out.println("ShearCircle Home page is displayed");
			 }else {
				 browser.reportscomtep("Failed", "Verify ShearCircle Home page is displayed", "ShearCircle Home page should be displayed", "ShearCircle Home page not displayed");
				 System.out.println("ShearCircle Image not displayed");
			 }
			  
		  }catch(Exception e){
				  System.out.println("Exception: "+e); 
		  }	
	}	
	
/******************Click Login or Join Our Circle buttons in Home page links with help of given input parameter********************/
	
	public void ShearCircle_Click_Login_OR_JoinOurCircle(String Login_JoinOurCircleflag) {
		try {
			
			if (browser.elementisdisplayed(Login.Home_Login_Link) && browser.elementisdisplayed(Login.Home_JoinOurCircle_Link)) {
				browser.reportscomtep("Passed", "Verify Login and Join Our Circle buttons are displayed",
						"Login and Join Our Circle buttons should be displayed", "Login and Join Our Circle buttons displayed");
				
				switch (Login_JoinOurCircleflag) {
				case "Click_Login":
					browser.click(Login.Home_Login_Link);
					
					if (browser.elementisdisplayed(Login.Login_Page_Header)) {
						browser.reportscomtep("Passed", "Verify Login page is displayed",
								"Login page should be displayed",
								"Login page displayed");
					} else {
						browser.reportscomtep("Failed", "Verify Login page is displayed",
								" Login page  should be displayed",
								"Login page not displayed");
					}
					break;
				case "Click_JoinOurCircle":
					browser.click(Login.Home_JoinOurCircle_Link);
					if (browser.elementisdisplayed(Login.Joinourcircle_Page_Header)) {
						browser.reportscomtep("Passed", "Customer clicks on the Join Our Circle Button and Verify Register to ShearCircle Page is displayed",
								"Register to ShearCircle Page should be displayed",
								"Register to ShearCircle Page displayed");
					} else {
						browser.reportscomtep("Failed", "Customer clicks on the Join Our Circle Button and Verify Register to ShearCircle Page is displayed",
								"Register to ShearCircle Page should be displayed",
								"Register to ShearCircle Page Not displayed");
					}
					break;
				}

			} else {
				browser.reportscomtep("Failed",  "Verify Login and Join Our Circle buttons are displayed",
						"Login and Join Our Circle buttonsare should be displayed", "Login and Join Our Circle buttons not displayed");
			}

		} catch (Exception e) {
			browser.reportscomtep("Failed",  "Verify Login and Join Our Circle buttons are displayed",
					"Login and Join Our Circle buttonsare should be displayed", "Login and Join Our Circle buttons not displayed");
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	/***************User Click on Customer or Professional Join Our Circle links with help of given input parameter*******************/
	
	public void ShearCircle_Click_Customer_OR_Professional_JoinOurCircle(String JoinOurCircleflag) {
		try {
			if (browser.elementisdisplayed(CustomerModule.customerJoinCircle_Link) && browser.elementisdisplayed(CustomerModule.ProfessionalJoinCircle_Link)) {
				browser.reportscomtep("Passed", "Verify Are you a Customer and Are you a Professional JoinCircle links are displayed",
						"Are you a Customer and Are you a Professional JoinCircle links are should be displayed", "Are you a Customer and Are you a Professional JoinCircle links displayed");
				
				switch (JoinOurCircleflag) {
				case "Click_CustomerJoinCircle":
					browser.click(CustomerModule.customerJoinCircle_Link);
					
					if (browser.elementisdisplayed(CustomerModule.Customer_Joincircle_navigation)) {
						browser.reportscomtep("Passed", "Verify Customer Registration form is displayed",
								"Customer Registration form should be displayed",
								"Customer Registration form displayed");
					} else {
						browser.reportscomtep("Failed", "Verify Customer Registration form is displayed",
								"Customer Registration form should be displayed",
								"Customer Registration form not displayed");
					}
					break;
				case "Click_ProfessionalJoinCircle":
					browser.click(CustomerModule.ProfessionalJoinCircle_Link);
					if (browser.elementisdisplayed(CustomerModule.Subscriber_Joincircle_navigation)) {
						browser.reportscomtep("Passed", "Verify Profession Registration form is displayed",
								"Profession Registration form should be displayed",
								"Profession Registration form displayed");
					} else {
						browser.reportscomtep("Failed", "Verify Profession Registration form is displayed",
								"Profession Registration form should be displayed",
								"Profession Registration form not displayed");
					}
					break;
				case "DoNothing":
					break;
				}

			} else {
				browser.reportscomtep("Failed", "Verify Are you a Customer and Are you a Professional JoinCircle links are displayed",
						"Are you a Customer and Are you a Professional JoinCircle links are should be displayed", "Are you a Customer and Are you a Professional JoinCircle links not displayed");
			}

		} catch (Exception e) {
			browser.reportscomtep("Failed", "Verify Are you a Customer and Are you a Professional JoinCircle links are displayed",
					"Are you a Customer and Are you a Professional JoinCircle links are should be displayed", "Are you a Customer and Are you a Professional JoinCircle links not displayed");
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	/***********************Verify Customer Registration form Field validation*****************************/
	public void ShearCircle_Verify_Customer_Registrationform_Fieldvalidation() {
		try {

			if (browser.elementisdisplayed(CustomerModule.Customer_JoinNow_Header)) {
				browser.reportscomtep("Passed", "Verify Customer Registration form Join Now header is displayed",
						"Customer Registration form Join Now header should be displayed", "Customer Registration form Join Now header displayed");
				
				browser.ScrollToElementBottom(CustomerModule.Customer_joinourcircle_button);
				
				browser.Verify_elementisdisplayed_Report(CustomerModule.Customer_FirstName_textbox,
						"First Name textbox");

				browser.Verify_elementisdisplayed_Report(CustomerModule.Customer_LastName_textbox, "Last Name textbox");

				browser.Verify_elementisdisplayed_Report(CustomerModule.Customer_Email_textbox, "Email textbox");

				browser.Verify_elementisdisplayed_Report(CustomerModule.Customer_Password_textbox,
						"Password textbox");

				browser.Verify_elementisdisplayed_Report(CustomerModule.Customer_ReEnterPassword_textbox,
						"ReEntered Password textbox");

				browser.Verify_elementisdisplayed_Report(CustomerModule.Customer_Termsofservice_checkbox,
						"Termsofservice checkbox");

				browser.Verify_elementisdisplayed_Report(CustomerModule.Customer_billingagrement_checkbox,
						"Billing agrement Checkbox");

				browser.Verify_elementisdisplayed_Report(CustomerModule.Customer_joinourcircle_button,
						"JoinCircle Button");

			} else {
				browser.reportscomtep("Failed", "Verify Customer Registration form Join Now header is displayed",
						"Customer Registration form Join Now header should be displayed", "Customer Registration form Join Now header  not displayed");
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}

	}
	
	/**************************Create Customer Registration with valid input data************************************/
	
	public void ShearCircle_Customer_Registrationwithvaliddata() {
		String FirstName = null;
		String LastName = null;
		String CustomerEmail = null;
		String Password = null;
		int GetRandomNo = 0;
		String AppendEmail= null;
		//browser.loaddata(TestDataPath);	

		try {
			FirstName = browser.getdata("FirstName");
			LastName = browser.getdata("LastName");
			CustomerEmail = browser.getdata("Email");
			Password = browser.getdata("Password");
			
			GetRandomNo = browser.getRandomNumberInRange(0000, 9999);
			AppendEmail =CustomerEmail+GetRandomNo+"@testmail.com";
			if (browser.elementisdisplayed(CustomerModule.Customer_JoinNow_Header)) {
				browser.reportscomtep("Passed", "Verify Customer Registration form Join Now header is displayed",
						"Customer Registration form Join Now header should be displayed", "Customer Registration form Join Now header displayed");
				browser.ScrollToElementBottom(CustomerModule.Customer_joinourcircle_button);
				browser.sendkeys(CustomerModule.Customer_FirstName_textbox, FirstName);

				browser.sendkeys(CustomerModule.Customer_LastName_textbox, LastName);

				browser.sendkeys(CustomerModule.Customer_Email_textbox, AppendEmail);

				browser.sendkeys(CustomerModule.Customer_Password_textbox, Password);

				browser.sendkeys(CustomerModule.Customer_ReEnterPassword_textbox, Password);
				browser.scrollDown(2);
				browser.check_Checkbox(CustomerModule.Customer_Termsofservice_checkbox);

				browser.check_Checkbox(CustomerModule.Customer_billingagrement_checkbox);

				browser.click(CustomerModule.Customer_joinourcircle_button);
				if (browser.elementisdisplayed(CustomerModule.Customer_Success_Message)
						&& browser.elementisdisplayed(CustomerModule.Customer_Success_Message1)) {
					browser.reportscomtep("Passed", "Customer clicks on Join Our Circle button after entering valid details and accepting the terms of service, privacy policy & billing agreement and Verify Customer Registration Success message popup is displayed",
							" A popup message appears which displays the message that the registration should be successful ",
							" A popup message appears which displays the message that the registration is successful");
					browser.click(CustomerModule.Customer_Confirmation_OK_Button);
				} else {
					browser.reportscomtep("Failed", "Customer clicks on Join Our Circle button after entering valid details and accepting the terms of service, privacy policy & billing agreement and Verify Customer Registration Success message popup is displayed",
							" A popup message appears which displays the message that the registration should be successful ",
							" A popup message Not appears which displays the message that the registration is successful");
				}

			} else {
				browser.reportscomtep("Failed", "Verify Customer Registration form Join Now header is displayed",
						"Customer Registration form Join Now header should be displayed", "Customer Registration form Join Now header  not displayed");
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	
	/**************************Create Customer Registration with Invalid input data************************************/
	
	public void ShearCircle_Customer_Registrationwithinvaliddata(){
			
		//browser.loaddata(TestDataPath);		
		try{	
			String FirstName = null;
			String LastName = null;
			String customerEmail = null;
			String Password = null;
			String ConfirmPassword = null;
			/*String Actual_FirstNameErrorMessage = null;
			String Actual_LastNameErrorMessage = null;
			String Actual_invalidEmailErrorMessage=null;
			String Actual_invalidPasswordErrorMessage=null;
			String Actual_invalidRePasswordErrorMessage=null;
			*/
			String Expct_FirstNameErrorMessage = "Alphabets only";		
			String Expct_LastNameErrorMessage = "Alphabets only";		
			String Expct_invalidEmailErrorMessage="Please enter a valid email address";		
			String Expct_invalidPasswordErrorMessage="Use 6 to 32 characters, no spaces";		
			String Expct_invalidRePasswordErrorMessage="Confirm Password should match with password";
			
			FirstName = browser.getdata("InvalidFirstName");
			LastName = browser.getdata("InvalidLastName");
			customerEmail = browser.getdata("InvalidEmail");
			Password = browser.getdata("InvalidPassword");
			ConfirmPassword = browser.getdata("InvalidConfirmPassword");
			
			if(browser.elementisdisplayed(CustomerModule.Customer_JoinNow_Header)){					
				browser.reportscomtep("Passed", "Verify Customer Registration form Join Now header is displayed",
						"Customer Registration form Join Now header should be displayed", "Customer Registration form Join Now header displayed");
				browser.ScrollToElementBottom(CustomerModule.Customer_joinourcircle_button);
				browser.sendkeys(CustomerModule.Customer_FirstName_textbox,FirstName);	
				browser.sendkeys(CustomerModule.Customer_LastName_textbox,LastName);
				browser.sendkeys(CustomerModule.Customer_Email_textbox,customerEmail);				
				browser.sendkeys(CustomerModule.Customer_Password_textbox,Password.trim());
				browser.sendkeys(CustomerModule.Customer_ReEnterPassword_textbox,ConfirmPassword.trim());
				browser.ScrollToElementBottom(CustomerModule.Customer_joinourcircle_button);
				Thread.sleep(3000);
				browser.check_Checkbox(CustomerModule.Customer_Termsofservice_checkbox);				
				browser.check_Checkbox(CustomerModule.Customer_billingagrement_checkbox);								
				browser.click(CustomerModule.Customer_joinourcircle_button);
				if(browser.elementisdisplayed(CustomerModule.Customer_invalidFirstname_errorMessage)){
					//Actual_FirstNameErrorMessage = browser.getelementtext(CustomerModule.Customer_invalidFirstname_errorMessage);
					browser.verifyElementErrorMessage(CustomerModule.Customer_invalidFirstname_errorMessage,Expct_FirstNameErrorMessage, "exact");
				}				
				
				if(browser.elementisdisplayed(CustomerModule.Customer_invalidLastname_errorMessage)){
					//Actual_LastNameErrorMessage = browser.getelementtext(CustomerModule.Customer_invalidLastname_errorMessage);
					browser.verifyElementErrorMessage(CustomerModule.Customer_invalidLastname_errorMessage,Expct_LastNameErrorMessage,"exact");
				}
				
				if(browser.elementisdisplayed(CustomerModule.Customer_invalidEmail_errorMessage)){
					//Actual_invalidEmailErrorMessage = browser.getelementtext(CustomerModule.Customer_invalidEmail_errorMessage);
					browser.verifyElementErrorMessage(CustomerModule.Customer_invalidEmail_errorMessage,Expct_invalidEmailErrorMessage,"exact");
				}
				
				if(browser.elementisdisplayed(CustomerModule.Customer_invalidPassword_errorMessage)){
					//Actual_invalidPasswordErrorMessage = browser.getelementtext(CustomerModule.Customer_invalidPassword_errorMessage);
					browser.verifyElementErrorMessage(CustomerModule.Customer_invalidPassword_errorMessage,Expct_invalidPasswordErrorMessage,"exact");
				}				
				
				if(browser.elementisdisplayed(CustomerModule.Customer_invalidRePassword_errorMessage)){
					//Actual_invalidRePasswordErrorMessage = browser.getelementtext(CustomerModule.Customer_invalidRePassword_errorMessage);
					browser.verifyElementErrorMessage(CustomerModule.Customer_invalidRePassword_errorMessage,Expct_invalidRePasswordErrorMessage,"exact");
				}
				
					
			
		}else {
			browser.reportscomtep("Failed", "Verify Customer Registration form Join Now header is displayed",
					"Customer Registration form Join Now header should be displayed", "Customer Registration form Join Now header  not displayed");
		}
			
		}catch(Exception e){
			System.out.println("Error description: " + e.getStackTrace() );
		}			
		
	}

/**************************Create Customer Registration with valid input data and without accepting terms of service***********************************/
	
	public void ShearCircle_Customer_Registrationwithvaliddata_without_termsofservice() {
		String FirstName = null;
		String LastName = null;
		String customerEmail = null;
		String Password = null;		
		String Actual_AcceptTermsandConditons_errorMessage = null;
		String Expct_AcceptTermsandConditons_errorMessage = "Please accept terms and conditions"; 
		String Actual_AcceptourbillingAgreement_errorMessage = null;
		String Expct_AcceptourbillingAgreement_errorMessage = "Please accept our billing agreement"; 
                   
		try {
			//browser.loaddata(TestDataPath);
			FirstName = browser.getdata("FirstName");
			LastName = browser.getdata("LastName");
			customerEmail = browser.getdata("Email");
			Password = browser.getdata("Password");
			if (browser.elementisdisplayed(CustomerModule.Customer_JoinNow_Header)) {
				browser.reportscomtep("Passed", "Verify Customer Registration form Join Now header is displayed",
						"Customer Registration form Join Now header should be displayed", "Customer Registration form Join Now header displayed");
				browser.ScrollToElementBottom(CustomerModule.Customer_joinourcircle_button);
				browser.sendkeys(CustomerModule.Customer_FirstName_textbox, FirstName);

				browser.sendkeys(CustomerModule.Customer_LastName_textbox, LastName);

				browser.sendkeys(CustomerModule.Customer_Email_textbox, customerEmail);

				browser.sendkeys(CustomerModule.Customer_Password_textbox, Password);

				browser.sendkeys(CustomerModule.Customer_ReEnterPassword_textbox, Password);
						
				//browser.check_Checkbox(CustomerModule.Customer_Termsofservice_checkbox);
				
				//browser.check_Checkbox(CustomerModule.Customer_billingagrement_checkbox);
				
				browser.click(CustomerModule.Customer_joinourcircle_button);				
										
				if(browser.elementisdisplayed(CustomerModule.Customer_AcceptTermsandConditons_errorMessage)){
					Actual_AcceptTermsandConditons_errorMessage= browser.getelementtext(CustomerModule.Customer_AcceptTermsandConditons_errorMessage);
					browser.assertEquals(Actual_AcceptTermsandConditons_errorMessage,Expct_AcceptTermsandConditons_errorMessage);
				}
				
				if(browser.elementisdisplayed(CustomerModule.Customer_AcceptourbillingAgreement_errorMessage)){
					Actual_AcceptourbillingAgreement_errorMessage = browser.getelementtext(CustomerModule.Customer_AcceptourbillingAgreement_errorMessage);
					browser.assertEquals(Actual_AcceptourbillingAgreement_errorMessage,Expct_AcceptourbillingAgreement_errorMessage);
				}						
				}else {
					browser.reportscomtep("Failed", "Verify Customer Registration form Join Now header is displayed",
							"Customer Registration form Join Now header should be displayed", "Customer Registration form Join Now header  not displayed");
				}
			
		}catch(Exception e){
			System.out.println("Error description: " + e.getStackTrace() );
		}			
		
	}

	/**************************Create Customer forgot Password with valid and Invalid input data************************************/	
	public void ShearCircle_Verify_Customer_forgotPassword(String p_in_Valid_or_Invalid, String p_in_FinalAction) {
		String CustomerValidEmail = null;		
		String CustomerInValidEmail = null;
		String invalid_Message;
		String valid_Message;
		String getmessage = null;
		//browser.loaddata(TestDataPath);		
		try{
			CustomerValidEmail = browser.getdata("CustomerForgotPasswordEmail");
			CustomerInValidEmail = browser.getdata("CustomerInValidEmail");
			invalid_Message = "No records for the Username";
			valid_Message = "Password Reset Instructions Sent Successfully";	

			/*if(browser.elmentisdisplayed(Login.Home_Login_Link)) {		

				browser.reportscomtep("Passed", "Verify Login link is displayed"  , "Login link should be displayed", "Login link is displayed");

				browser.click(Login.Home_Login_Link);*/				
			
				if(browser.elementisdisplayed(Login.Login_forgotPassword_Link)){

					browser.reportscomtep("Passed", "Verify Forgotpassword link is displayed"  , "Forgotpassword link should be displayed", "Forgotpassword link is displayed");
					
					browser.click(Login.Login_forgotPassword_Link);	

					
					if(browser.elementisdisplayed(Login.ResetPassword_Header)){

						browser.reportscomtep("Passed", "Verify Reset Password is displayed"  , "Reset Password should be displayed", "Reset Password is displayed");
						
						browser.Verify_elementisdisplayed_Report(Login.ResetPassword_UserName_textbox, "UserName textbox");
						browser.Verify_elementisdisplayed_Report(Login.ResetPassword_SendInstruction_Link, "Send Instruction ForgotPassword Button");
						browser.Verify_elementisdisplayed_Report(Login.ResetPassword_Cancel_textbox, "Cancel Link");
						
						if(p_in_Valid_or_Invalid.equalsIgnoreCase("Valid")) {
							browser.sendkeys(Login.ResetPassword_UserName_textbox,CustomerValidEmail);
							
						}else if(p_in_Valid_or_Invalid.equalsIgnoreCase("InValid")){
							browser.sendkeys(Login.ResetPassword_UserName_textbox,CustomerInValidEmail);
						}else if(p_in_Valid_or_Invalid.equalsIgnoreCase("DoNothing")){
							
						}
						
						switch(p_in_FinalAction) {
							case "Click Send instructions to reset password":
								browser.click(Login.ResetPassword_SendInstruction_Link);
								
								if(p_in_Valid_or_Invalid.equalsIgnoreCase("Valid")) {
									browser.waitforelementtobevisible(Login.ResetPassword_ValidMessage_text,10);
									getmessage = browser.getelementtext(Login.ResetPassword_ValidMessage_text);
									if(valid_Message.equalsIgnoreCase(getmessage)) {										
										browser.reportscomtep("Passed", p_in_FinalAction+" and Verify Reset Password Successful message is displayed"  , "Reset Password Successful message should be displayed", "Reset Password Successful message displayed as : "+ getmessage);
									}else {
										browser.reportscomtep("Failed", p_in_FinalAction+ " and Verify Reset Password Successful message is displayed"  , "Reset Password Successful message should be displayed", "Reset Password Successful message Not displayed as :"+valid_Message);
									}								
								}else if(p_in_Valid_or_Invalid.equalsIgnoreCase("InValid")){
									browser.waitforelementtobevisible(Login.ResetPassword_InvalidMessage_text,10);
									getmessage = browser.getelementtext(Login.ResetPassword_InvalidMessage_text);
									if(invalid_Message.equalsIgnoreCase(getmessage)) {
										browser.reportscomtep("Passed", p_in_FinalAction+" and Verify Reset Password invalid message is displayed"  , "Reset Password invalid message should be displayed", "Reset Password invalid message displayed as : "+ getmessage);
									}else {
										browser.reportscomtep("Failed", p_in_FinalAction+" and Verify Reset Password invalid message is displayed"  , "Reset Password invalid message should be displayed", "Reset Password invalid message Not displayed as : "+ invalid_Message);
									}
								}
									
								break;
							case "Click Cancel":	
								browser.click(Login.ResetPassword_Cancel_textbox);
								if(browser.elementisdisplayed(Login.Login_forgotPassword_Link)) {
									browser.reportscomtep("Passed", p_in_FinalAction+ " and Verify Customer navigate Reset Password page"  , "Customer should be navigate Reset Password page", "Customer navigated Reset Password page");
								}else {
									browser.reportscomtep("Failed", p_in_FinalAction+ " and Verify Customer navigate Reset Password page"  , "Customer should be navigate Reset Password page", "Customer Not navigated Reset Password page");
									
								}
							break;
							case "DoNothing":
							break;	
						}					
						
						
					}else {
						browser.reportscomtep("Failed", "Verify Reset Password is displayed"  , "Reset Password should be displayed", "Reset Password is Not displayed");
					}
						
				}else {
					browser.reportscomtep("Failed", "Verify Forgotpassword link is displayed"  , "Forgotpassword link should be displayed", "Forgotpassword link Not displayed");
				}
			/*}else {
				browser.reportscomtep("Failed", "Verify Login link is displayed"  , "Login link should be displayed", "Login link is not displayed");
			}*/
			
		}catch(Exception e){
			System.out.println("Error description: " + e.getStackTrace() );
		}	
	}
	
	/******************************  Customer clicks on the hyperlinks in Customer Registration page. ********************************/
	
	public void ShearCircle_Verify_Customer_Registrationform_HyperLynks() {
		
		try {

			if(browser.elementisdisplayed(CustomerModule.Customer_termsofservice_hyperlynk)){
				browser.reportscomtep("Passed", "Verify terms of service link is displayed"  , "terms of service link should be displayed", "terms of service link is displayed");
				
				browser.ScrollToElementBottom(CustomerModule.Customer_joinourcircle_button);				
				browser.click(CustomerModule.Customer_termsofservice_hyperlynk);
				
				if(browser.elementisdisplayed(CustomerModule.Customer_termsofservice_hyperlynk_header)){
					browser.reportscomtep("Passed", "Verify terms of service header is displayed"  , "terms of service header should be displayed", "terms of service header is displayed");
					browser.ScrollToElementBottom(CustomerModule.Customer_Termsofservice_Close_Button);
					browser.click(CustomerModule.Customer_Termsofservice_Close_Button);
				}else {
					browser.reportscomtep("Failed", "Verify terms of service header is displayed"  , "terms of service header should be displayed", "terms of service header is not displayed");
				}
				browser.click(CustomerModule.Customer_privacypolycy_hyperlynk);
				
				if(browser.elementisdisplayed(CustomerModule.Customer_privacypolycy_hyperlynk_header)){
					browser.reportscomtep("Passed", "Verify privacy polycy header is displayed"  , "privacy polycy header should be displayed", "privacy polycy header is displayed");
					browser.ScrollToElementBottom(CustomerModule.Customer_Privacypolycy_Close_Button);
					browser.click(CustomerModule.Customer_Privacypolycy_Close_Button);
				}else {
					browser.reportscomtep("Failed", "Verify privacy polycy header is displayed"  , "privacy polycy header should be displayed", "privacy polycy header is not displayed");
				}
				browser.waitforelementtobevisible(CustomerModule.Customer_billingaggrement_hyperlynk, 5);
				browser.click(CustomerModule.Customer_billingaggrement_hyperlynk);
			
				if(browser.elementisdisplayed(CustomerModule.Customer_billingaggrement_hyperlynk_header)){
					browser.reportscomtep("Passed", "Verify billing aggrement hyperlynk header is displayed"  , "billing aggrement hyperlynk header should be displayed", "billing aggrement hyperlynk header is displayed");
					browser.ScrollToElementBottom(CustomerModule.Customer_Billingaggrement_Close_Button);
					browser.click(CustomerModule.Customer_Billingaggrement_Close_Button);
				}else {
					browser.reportscomtep("Failed", "Verify billing aggrement hyperlynk header is displayed"  , "billing aggrement hyperlynk header should be displayed", " billing aggrement hyperlynk header is not displayed");
				}
				browser.ScrollToElementBottom(CustomerModule.Customer_signin_hyperlynk);	
				browser.click(CustomerModule.Customer_signin_hyperlynk);
				
				if(browser.elementisdisplayed(CustomerModule.Customer_signin_hyperlynk_header)){
					browser.reportscomtep("Passed", "Verify sign_in lynk header is displayed"  , "sign_in lynk header should be displayed", "sign_in lynk header is displayed");
				}else {
					browser.reportscomtep("Failed", "Verify sign_in lynk header is displayed"  , "sign_in lynk header should be displayed", "sign_in lynk header is not displayed");
				}
							
			}else {
				browser.reportscomtep("Failed", "Verify terms of service link is displayed"  , "terms of service link should be displayed", "terms of service link is not displayed");
			
					}
		}catch(Exception e){
			System.out.println("Error description: " + e.getStackTrace() );
		
		}
	}
	
		
	public void Click_DoNotHaveAccountjoinourcircle_Loginwith_FaceBook_Google_Bottons(String Click_FinalAction) {
		 browser.loaddata(TestDataPath);
		 try {
			 browser.ScrollToElementBottom(Login.Login_DonthaveaccountJoinOurCircle_Link);
		 if(browser.elementisdisplayed(Login.Login_DonthaveaccountJoinOurCircle_Link) && browser.elementisdisplayed(Login.Login_Facebook_Link) && browser.elementisdisplayed(Login.Login_Google_Link)) {
				browser.reportscomtep("Passed", "Verify Don't have an account yet JoinCircle, Login with FaceBook and Login with Google buttons are displayed", "Don't have an account yet JoinCircle, Login with FaceBook and Login with Google buttons should be displayed", "Don't have an account yet JoinCircle, Login with FaceBook and Login with Google buttons displayed");
				switch (Click_FinalAction){
					case "Click_Donthaveaccount_JoinOurCircle":
						//browser.ScrollToElementBottom(Login.Login_DonthaveaccountJoinOurCircle_Link);
						browser.click(Login.Login_DonthaveaccountJoinOurCircle_Link);
						
						if(browser.elementisdisplayed(CustomerModule.Customer_RegisterWithShearCircle_Header)){
							browser.reportscomtep("Passed", "click Don't have a ccout yet? JoinCircle link and verify Customer sent to Join Our Circle page"  , "Customer will be sent to Join Our Circle page", "Customer sent to Join Our Circle page");					
							
						}else {
							browser.reportscomtep("Failed", "click Don't have a ccout yet? JoinCircle link and verify Customer sent to Join Our Circle page"  , "Customer will be sent to Join Our Circle page", "Customer not sent to Join Our Circle page");				
						}	
						break;
					case "Click_LoginwithFaceBook":
						//browser.ScrollToElementBottom(Login.Login_Facebook_Link);
						browser.click(Login.Login_Facebook_Link);
						browser.waitForNewWindowAndSwitchToIt(driver);	
						if (browser.elementisdisplayed(Login.Facebook_Account_Header)) {
							browser.reportscomtep("Passed", "Verify Facebook Login popup is displayed",
									"Facebook Login popup  should be displayed",
									"Facebook Login popup displayed");
							
						}else {
							browser.reportscomtep("Failed", "Verify Facebook Login popup  is displayed",
									"Facebook Login popup should be displayed",
									"Facebook Login popup not displayed");
							}
						break;
					case "Click_LoginwithGoogle":	
						//browser.ScrollToElementBottom(Login.Login_Google_Link);
						browser.click(Login.Login_Google_Link);
						browser.waitForNewWindowAndSwitchToIt(driver);	
						if (browser.elementisdisplayed(Login.Google_EmailorPhone_Textbox)) {
							browser.reportscomtep("Passed", "Verify google popup is displayed",
									"Google Login popup  should be displayed",
									"Google Login popup displayed");
							
						}else {
							browser.reportscomtep("Failed", "Verify Google popup is displayed",
									"Google popup should be displayed",
									"Google popup not displayed");
						}		
						break;
				}
				
		 }else {
				browser.reportscomtep("Failed", "Verify Don't have an account yet JoinCircle, Login with FaceBook and Login with Google buttons are displayed", "Don't have an account yet JoinCircle, Login with FaceBook and Login with Google buttons should be displayed", "Don't have an account yet JoinCircle, Login with FaceBook and Login with Google buttons Not displayed");
			}
		 
		 }catch(Exception e){
			System.out.println("Error description: " + e.getStackTrace() );
		}			
	 }
	/**********************Shear Circle Login Page Field validation**************************/
	public void ShearCircle_Verify_Customer_Login_page_Filed_validation() {
		try {

			if (browser.elementisdisplayed(Login.Login_Page_Header)) {
				browser.reportscomtep("Passed", "Verify Customer Sign In To ShearCircle page header is displayed",
						"Sign In To ShearCircle page header should be displayed", "Sign In To ShearCircle page header displayed");			
				
				browser.Verify_elementisdisplayed_Report(Login.Login_UserName_textbox, "User Name textbox");
				browser.Verify_elementisdisplayed_Report(Login.Login_PassWord_textbox,"Password textbox");
				browser.ScrollToElementBottom(Login.Login_JoinOurCircle_Link);
				browser.Verify_elementisdisplayed_Report(Login.Login_signin_button,"SIGN IN Button");
				browser.Verify_elementisdisplayed_Report(Login.Login_forgotPassword_Link,"Forgot Your Password ? Link");
				browser.Verify_elementisdisplayed_Report(Login.Login_Facebook_Link,"Login with Facebook link");
				browser.Verify_elementisdisplayed_Report(Login.Login_Google_Link,"Login with Google link");
				browser.Verify_elementisdisplayed_Report(Login.Login_JoinOurCircle_Link,"Join Our Circle link" );
			}
			else {
				browser.reportscomtep("Failed", "Verify Sign In To ShearCircle page header is displayed",
						"Sign In To ShearCircle page header should be displayed", "Sign In To ShearCircle page header not displayed");
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}

	}
	/*******************Verify all Login Combinations(valid and Ivvalid)*******************************/
	public void ShearCircle_Customer_Login_valid_invalid_combination(String p_in_Valid_or_Invalid) {
		String CustomerValidEmail = null;		
		String CustomerInValidEmail = null;
		String CustomerValidPassword = null;		
		String CustomerInValidPassword = null;
		String InvalidUserName_ErrorMessage = null;
		String UserName_ErrorMassage = null;
		String Password_ErrorMassage = null;
		String InvalidPassword_Message = null;		
		//browser.loaddata(TestDataPath);
		
		try{
			CustomerValidEmail = browser.getdata("CustomerValidEmail");
			CustomerInValidEmail = browser.getdata("CustomerInValidEmail");		
			CustomerValidPassword = browser.getdata("CustomerValidPassword");
			CustomerInValidPassword = browser.getdata("CustomerInValidPassword");
			
			InvalidUserName_ErrorMessage = "User details not found";
			InvalidPassword_Message = "Invalid credentials";						 
			
			if(browser.elementisdisplayed(Login.Login_Page_Header)) {
				browser.reportscomtep("Passed", "Verify Login page is displayed"  , "Login page should be displayed", "Login page displayed");
				browser.click(Login.Home_Login_Link);					
					
					switch(p_in_Valid_or_Invalid) {
						case "Enter_Valid_EmailandPassword":							
							browser.sendkeys(Login.Login_UserName_textbox,CustomerValidEmail);
							browser.sendkeys(Login.Login_PassWord_textbox,CustomerValidPassword);
							//browser.movetoElement(Login.Login_signin_button);
							browser.ScrollToElementBottom(Login.Login_signin_button);
							browser.click(Login.Login_signin_button);
							
							if(browser.elementisdisplayed(Login.Customer_MyDashboard_Text)){
								browser.reportscomtep("Passed", "Customer enters valid Username and Password and clicks on Sign in button", "Customer should be navigate to the Customer Dashboard page", "Customer navigated to the Customer Dashboard page");
							}else {
								browser.reportscomtep("Failed", "Customer enters valid Username and Password and clicks on Sign in button", "Customer should be navigate to the Customer Dashboard page", "Customer Not navigated to the Customer Dashboard page");
							}							
							
							break;
						case "Enter_Invalid_EmailandValidPassword":	
							browser.sendkeys(Login.Login_UserName_textbox,CustomerInValidEmail);
							browser.sendkeys(Login.Login_PassWord_textbox,CustomerValidPassword);
							//browser.movetoElement(Login.Login_signin_button);
							browser.ScrollToElementBottom(Login.Login_signin_button);
							browser.click(Login.Login_signin_button);
							if(browser.verifyElementtext(Login.Login_ErrorMessage_Text,InvalidUserName_ErrorMessage,"exact")) {
								browser.reportscomtep("Passed", "Customer enters Invalid Username and Valid Password and clicks on Sign in button", "An error message should be displayed stating that the User details are not found", "An error message displayed stating that the User details are not found");
							}else {
								browser.reportscomtep("Failed", "Customer enters Invalid Username and Valid Password and clicks on Sign in button", "An error message should be displayed stating that the User details are not found", "An error message not displayed stating that the User details are not found");
							}
							break;
										
						case "Enter_Valid_EmailandInvalid_Password":							
							browser.sendkeys(Login.Login_UserName_textbox,CustomerValidEmail);
							browser.sendkeys(Login.Login_PassWord_textbox,CustomerInValidPassword);
							//browser.movetoElement(Login.Login_signin_button);
							browser.ScrollToElementBottom(Login.Login_signin_button);
							browser.click(Login.Login_signin_button);	
							if(browser.verifyElementtext(Login.Login_ErrorMessage_Text,InvalidPassword_Message,"exact")){								
								browser.reportscomtep("Passed", "Customer enters valid Username and Invalid Password and clicks on Sign in button", "An error message should be displayed stating that the credentials are invalid", "An error message displayed stating that the credentials are invalid ");
							}else {
								browser.reportscomtep("Failed", "Customer enters valid Username and Invalid Password and clicks on Sign in button", "An error message should be displayed stating that the credentials are invalid", "An error message not displayed stating that the credentials are invalid ");
							}
							
							break;
						case "Enter_without_EmailandPassword":	
							browser.clearText(Login.Login_UserName_textbox);
							browser.clearText(Login.Login_PassWord_textbox);
							//browser.movetoElement(Login.Login_signin_button);
							browser.ScrollToElementBottom(Login.Login_signin_button);
							browser.click(Login.Login_signin_button);							
							UserName_ErrorMassage = browser.elementgetAttributevalue(Login.Login_UserName_Errormessage_Text,"class");
							Password_ErrorMassage = browser.elementgetAttributevalue(Login.Login_PasswordErrorMessage_Text,"class");
							System.out.println("user error"+ UserName_ErrorMassage+ "&&" + "Password err"+ Password_ErrorMassage);
							if(UserName_ErrorMassage.contains("state-error") && Password_ErrorMassage.contains("state-error")) {
								browser.reportscomtep("Passed", "Customer clicks on Sign in button without entering Username & Password", "Customer should be prompted to enter valid Username & Password ", "Customer prompted to enter valid Username & Password");
							}else {
								browser.reportscomtep("Failed", "Customer clicks on Sign in button without entering Username & Password", "Customer should be prompted to enter valid Username & Password ", "Customer not prompted to enter valid Username & Password");
					
							}
							break;
						}	
						
					}else{
				browser.reportscomtep("Failed", "Verify Login page is displayed"  , "Login page should be displayed", "Login page not displayed");
			}
			
		}catch(Exception e){
			System.out.println("Error description: " + e.getStackTrace() );
		}	
	}
	/****************Customer Login with Facebook Account*********************/
	public void Customer_LoginwithFacebook(){
		String CustomerValidEmail = null;			
		String CustomerValidPassword = null;
		CustomerValidEmail = browser.getdata("CustomerSC_FBUsername");			
		CustomerValidPassword = browser.getdata("CustomerSC_FBPassword");
		try {						
			if (browser.elementisdisplayed(Login.Facebook_Account_Header)) {
				browser.reportscomtep("Passed", "Verify Facebook Login popup is displayed",
						"Facebook Login popup  should be displayed",
						"Facebook Login popup displayed");
				browser.sendkeys(Login.Facebook_EmailorPhone_Textbox, CustomerValidEmail);
				browser.sendkeys(Login.Facebook_Password_Textbox, CustomerValidPassword);
				//browser.explicitWaitUsingElementToBeClickable(Login.Facebook_Login_Link);
				browser.click(Login.Facebook_Login_Link);
				//String cHandle = driver.getWindowHandle();
				
				driver.switchTo().window(defaultWindowHandle);
				//browser.switchtoDefaultWindow(driver);	
				if(browser.elementisdisplayed(Login.Customer_MyDashboard_Text))
				{
					browser.reportscomtep("Passed", "Verify MyDashboard is  displayed",
							"MyDashboard  should be displayed", "MyDashboard  displayed");
				}else {
						browser.reportscomtep("Passed", "Verify MyDashboard is  displayed",
								"MyDashboard  should be displayed", "MyDashboard  displayed");
					}
			}else {
				browser.reportscomtep("Failed", "Verify Facebook Login popup  is displayed",
						"Facebook Login popup should be displayed",
						"Facebook Login popup not displayed");
				}
			
			
		}catch (Exception e) {
			browser.reportscomtep("Failed", "Facebool link is displayed",
					"Facebool link should be displayed", "Facebool link not displayed");
			System.out.println("Error description: " + e.getStackTrace());
		}
		
	}
	
	/******************Customer clicks on Login with Google button.*****************/	
	

		public void Click_Login_Google_Button(){
			String CustomerValidEmail = null;			
			String CustomerValidPassword = null;
			try {				
				CustomerValidEmail = browser.getdata("CustomerValidEmail");			
				CustomerValidPassword = browser.getdata("CustomerValidPassword");									
				if (browser.elementisdisplayed(Login.Google_EmailorPhone_Textbox)) {
					browser.reportscomtep("Passed", "Verify google popup is displayed",
							"Google Login popup  should be displayed",
							"Google Login popup displayed");
					//browser.click(Login.Google_Use_another_account_Link);
					browser.sendkeys(Login.Google_EmailorPhone_Textbox, CustomerValidEmail);
					browser.click(Login.Google_Next_Link);
					browser.sendkeys(Login.Google_Password_Textbox, CustomerValidPassword);
					browser.click(Login.Google_PasswordNext_Link);
					driver.switchTo().window(defaultWindowHandle);
					if(browser.elementisdisplayed(Login.Customer_MyDashboard_Text)){
						browser.reportscomtep("Passed", "Verify MyDashboard is  displayed",
								"MyDashboard  should be displayed", "MyDashboard  displayed");
					}else {
						browser.reportscomtep("Passed", "Verify MyDashboard is  displayed",
									"MyDashboard  should be displayed", "MyDashboard  displayed");
					}
				}else {
					browser.reportscomtep("Failed", "Verify Google popup is displayed",
							"Google popup should be displayed",
							"Google popup not displayed");
				}
			}catch (Exception e) {
				browser.reportscomtep("Failed", "Google link is displayed",
						"Google link should be displayed", "Google link not displayed");
				System.out.println("Error description: " + e.getStackTrace());
			}
		}
		
			
		/****Customer Login with Facebook user credentials that is not registered with ShearCircle******/

		public void Customer_LoginwithFacebook_not_registerewith_ShearCircle(){
			String CustomerFBEmail = null;			
			String CustomerFBPassword = null;
			try {				
				CustomerFBEmail = browser.getdata("CustomerNotSC_FBUsername");			
				CustomerFBPassword = browser.getdata("CustomerNotSC_FBPassword");	
				
				if (browser.elementisdisplayed(Login.Facebook_Account_Header)){
					browser.reportscomtep("Passed", "Verify Facebook Login popup is displayed",
							"Facebook Login popup  should be displayed",
							"Facebook Login popup displayed");
					browser.sendkeys(Login.Facebook_EmailorPhone_Textbox, CustomerFBEmail);
					browser.sendkeys(Login.Facebook_Password_Textbox, CustomerFBPassword);
					browser.click(Login.Facebook_Login_Link);
					if (browser.elementisdisplayed(Login.Facebook_Continue_Link)){
						browser.click(Login.Facebook_Continue_Link);
					}					
					driver.switchTo().window(defaultWindowHandle);
					if(browser.elementisdisplayed(CustomerModule.Customer_RegisterWithShearCircle_Header))
					{
						browser.reportscomtep("Passed", "Verify  Join our Circle  header displayed",
								" Join our Circle  header should be displayed","Join our Circle  header displayed");
					}else{
						browser.reportscomtep("Failed", "Verify Join our  header is  displayed",
									"Join our Circle  header  should be displayed", "Join our Circle header not displayed");
						}
				}else{
					browser.reportscomtep("Failed", "Verify Facebook Login popup  is displayed",
							"Facebook Login popup should be displayed",
							"Facebook Login popup not displayed");
				}	
						
			}catch (Exception e) {
						    System.out.println("Error description: " + e.getStackTrace());
			}
		}
		
		/***********************Customer Login with Google user credentials that is not registered with ShearCircle********/

		public void customer_LoginwithGoogle_not_Registeredwith_ShearCircle(){

			String CustomerGoogleEmail = null;			
			String CustomerGooglePassword = null;
			try {				
				CustomerGoogleEmail = browser.getdata("CustomerNotSC_GoogleUsername");			
				CustomerGooglePassword = browser.getdata("CustomerNotSC_GooglePassword");			
				if (browser.elementisdisplayed(Login.Google_Tocontinue_shearcircle_Text)){

					browser.reportscomtep("Passed", "Verify google popup is displayed",
							"Google Login popup  should be displayed","Google Login popup displayed");
					browser.sendkeys(Login.Google_EmailorPhone_Textbox, CustomerGoogleEmail);
					browser.click(Login.Google_Next_Link);
					browser.sendkeys(Login.Google_Password_Textbox, CustomerGooglePassword);
					browser.click(Login.Google_PasswordNext_Link);
					driver.switchTo().window(defaultWindowHandle);
					if(browser.elementisdisplayed(Login.Google_RegisterWithShearCircle_header)){
						browser.reportscomtep("Passed", "Verify Register With ShearCircle is  displayed",
								"Register With ShearCircle  should be displayed", "Register With ShearCircle  displayed");
					}else{
						browser.reportscomtep("Failed", "Verify Register With ShearCircle is  displayed",
									"Register With ShearCircle  should be displayed", "Register With ShearCircle  not displayed");
					}
				}else {
					browser.reportscomtep("Failed", "Verify Google popup is displayed",
								"Google popup should be displayed","Google popup not displayed");
				} 
							
			}catch(Exception e){
				System.out.println("Error description: " + e.getStackTrace());
			}
		}
		
		/**************************Customer clicks on Dont have Account yet JoinOurCircle link in Login page and verifying Customer sent to Join Our Circle page***********************************/
		public void Customer_JoinOurCircle_LogOutpage(){
			try{
				browser.click(Login.Customer_Logout_Button);				
				if(browser.elementisdisplayed(Login.Home_Login_Link)){
					browser.reportscomtep("Passed", "click LogOut button and verify Log out of the dashboard and return to Login page"  , "Log out of the dashboard and should be return to Login page", "Log out of the dashboard and return to Login page");					
					
				}else {
					browser.reportscomtep("Failed", "click LogOut button and verify Log out of the dashboard and return to Login page"  , "Log out of the dashboard and should be return to Login page", "Log out of the dashboard and Not return to Login page");				
				}						
				
			}catch(Exception e){
				System.out.println("Error description: " + e.getStackTrace() );
			}
			
		}
	
	/**************************Customer clicks on Dont have Account yet JoinOurCircle link in Login page and verifying Customer sent to Join Our Circle page***********************************/
	public void DonthaveAccountyet_JoinOurCircle_Loginpage(){
		try{
			browser.ScrollToElementBottom(Login.Login_DonthaveaccountJoinOurCircle_Link);
			browser.click(Login.Login_DonthaveaccountJoinOurCircle_Link);
			if(browser.elementisdisplayed(CustomerModule.Customer_RegisterWithShearCircle_Header)){
				browser.reportscomtep("Passed", "click Don't have a ccout yet? JoinCircle link and verify Customer sent to Join Our Circle page"  , "Customer will be sent to Join Our Circle page", "Customer sent to Join Our Circle page");					
				
			}else {
				browser.reportscomtep("Failed", "click Don't have a ccout yet? JoinCircle link and verify Customer sent to Join Our Circle page"  , "Customer will be sent to Join Our Circle page", "Customer not sent to Join Our Circle page");				
			}						
			
		}catch(Exception e){
			System.out.println("Error description: " + e.getStackTrace() );
		}
	}
		/***********************Customer Logged into Customer Dashboard for the first time*****************************/

		public void shearCircle_Verify_Customer_Dashboard_fieldValidation() {
			String WelcomeFullName = null;
			String LastLoginDateTime = null;
			String NumberofUpcomingBookings = null;
			String NumberofPastbookings = null;
			
			try {

				if (browser.elementisdisplayed(CustomerModule.Customer_Mydashboard_header)) {
					
					browser.reportscomtep("Passed", "Verify Customer Dashboard header is displayed",
							"Customer Dashboard header should be displayed", "Customer Dashboard header displayed");
					WelcomeFullName = browser.getelementtext(CustomerModule.Customer_Mydashboard_Welcome_Name_Header);
					browser.Verify_elementisdisplayed_Report(CustomerModule.Customer_Mydashboard_Welcome_Name_Header, WelcomeFullName);
					LastLoginDateTime = browser.getelementtext(CustomerModule.Customer_Mydashboard_LastLoginDatetime);
					browser.Verify_elementisdisplayed_Report(CustomerModule.Customer_Mydashboard_LastLoginDatetime, LastLoginDateTime);
					NumberofUpcomingBookings = browser.getelementtext(CustomerModule.Customer_Mydashboard_upcomingbookings_count);
					browser.Verify_elementisdisplayed_Report(CustomerModule.Customer_Mydashboard_upcomingbookings, "Mydashboard Number of Upcoming Bookings: "+NumberofUpcomingBookings);
					NumberofPastbookings = browser.getelementtext(CustomerModule.Customer_Mydashboard_Pastbookings_count);
					browser.Verify_elementisdisplayed_Report(CustomerModule.Customer_Mydashboard_Pastbookings, "Mydashboard Number of Past Bookings: "+ NumberofPastbookings);

					browser.Verify_elementisdisplayed_Report(CustomerModule.Customer_Mydashboard_Profilepicture,
							"Mydashboard Profilepicture--Default human icon ");

					browser.Verify_elementisdisplayed_Report(CustomerModule.Customer_Mydashboard_changeProfilepicture, "Mydashboard changeProfilepicture");

					browser.Verify_elementisdisplayed_Report(CustomerModule.Customer_MyFavourites_Button, "Mydashboard Myfavourites");

					browser.Verify_elementisdisplayed_Report(CustomerModule.Customer_Myappoinments_Button, "Mydashboard Myappoinments");
					
					browser.Verify_elementisdisplayed_Report(CustomerModule.Customer_Mydashboard_Settings_Button,
							"Mydashboard settings");
					
					browser.Verify_elementisdisplayed_Report(CustomerModule.Customer_Mydashboard_Logout,
							"Mydashboard Logout");

					browser.Verify_elementisdisplayed_Report(CustomerModule.Customer_Mydashboard_Myaccount,
							"Mydashboard Myaccount");
					
					browser.Verify_elementisdisplayed_Report(CustomerModule.Customer_Mydashboard_searchbar,
							"Mydashboard searchbar");
				
					
				} else {
					
					browser.reportscomtep("Failed", "Verify Customer Dashboard header is displayed",
							"Customer Dashboard header should be displayed", "Customer Dashboard header not displayed");
				}
			} catch (Exception e) {
				System.out.println("Error description: " + e.getStackTrace() );
			}
		}

		/***********************Customer clicks on My Favourites and verify list of added MyFavourites or No list added message *****************************/

		public void shearCircle_Verify_Customer_Dashboard_clickson_MyFavourites() {
			try {

				if (browser.elementisdisplayed(CustomerModule.Customer_MyFavourites_Button)) {
					
					browser.reportscomtep("Passed", "Verify MyFavourites Button is displayed in MyDashboard page",
							"MyFavourites Button should be displayed in MyDashboard page", "MyFavourites Button displayed in MyDashboard page");
					
					browser.click(CustomerModule.Customer_MyFavourites_Button);
					
					if(browser.elementisdisplayed(CustomerModule.Customer_Myfavourites_Header)){
						browser.reportscomtep("passed", "Click on MyFavourites Button and Verify Favourites page is displayed"  , "Favourites page should be displayed", "Favourites page displayed");
						
					} else {
						browser.reportscomtep("Failed", "Click on MyFavourites Button and Verify Favourites page is displayed"  , "Favourites page should be displayed", "Favourites page not displayed");
					}
					
					if(browser.elementisdisplayed(CustomerModule.Customer_Myfavourites_businesslist)){
						browser.reportscomtep("Passed", "Verify List of Favourites or No Favorites Added Yet message is displayed"  , "List of Favourites or No Favorites Added Yet message should be displayed", "List of Salons added as Favourites displayed");
						
						browser.Verify_elementisdisplayed_Report(CustomerModule.Customer_myfavourites_Bookme_Button,
								"MyFavourites businesslist Bookme Button");
						
						browser.Verify_elementisdisplayed_Report(CustomerModule.Customer_myfavourites_Remove_Button,
								"MyFavourites businesslist Remove Button");			
					
					}else if(browser.elementisdisplayed(CustomerModule.Customer_Myfavourites_NoList_Message)){
						browser.reportscomtep("Passed", "Verify List of Favourites or No Favorites Added Yet message is displayed"  , "List of Favourites or No Favorites Added Yet message should be displayed", "No Favorites Added Yet message displayed if no Salons are marked as Favorite/ 1st time login");
					}else{
						browser.reportscomtep("Failed", "Verify List of Favourites or No Favorites Added Yet message is displayed"  , "List of Favourites or No Favorites Added Yet message should be displayed", "List of Salons added as Favourites or No Favorites Added Yet message not displayed");
					}
										
					
				}else {
					browser.reportscomtep("Failed", "Verify MyFavourites Button is displayed in MyDashboard page",
							"MyFavourites Button should be displayed in MyDashboard page", "MyFavourites Button Not displayed in MyDashboard page");
				}
					
					}catch (Exception e) {
						System.out.println("Error description: " + e.getStackTrace());
				}
			}
		
		/***********************Customer clicks on My Favourites (in progress) *****************************/

		public void verify_MyFavorites_firsttimeloginorwithoutpreviouslyadded() {
			try {

				if (browser.elementisdisplayed(CustomerModule.Customer_MyFavourites_Button)) {
					
					browser.reportscomtep("Passed", "Verify MyFavourites Button is displayed in MyDashboard page",
							"MyFavourites Button should be displayed in MyDashboard page", "MyFavourites Button displayed in MyDashboard page");
					
					browser.click(CustomerModule.Customer_MyFavourites_Button);
					
					if(browser.elementisdisplayed(CustomerModule.Customer_Myfavourites_Header)){
						browser.reportscomtep("passed", "Click on MyFavourites Button and Verify Favourites page is displayed"  , "Favourites page should be displayed", "Favourites page displayed");
						
					} else {
						browser.reportscomtep("Failed", "Click on MyFavourites Button and Verify Favourites page is displayed"  , "Favourites page should be displayed", "Favourites page not displayed");
					}						
					
					if(browser.elementisdisplayed(CustomerModule.Customer_Myfavourites_NoList_Message)){
						browser.reportscomtep("Passed", "Verify No Favorites Added Yet message is displayed if no Salons are marked as Favorite/ 1st time login"  , "No Favorites Added Yet message should be displayed", "No Favorites Added Yet message displayed");
					}else{
						browser.reportscomtep("Failed", "Verify No Favorites Added Yet message is displayed if no Salons are marked as Favorite/ 1st time login"  , "No Favorites Added Yet message should be displayed", "No Favorites Added Yet message Not displayed");
					}
										
					
				}else {
					browser.reportscomtep("Failed", "Verify MyFavourites Button is displayed in MyDashboard page",
							"MyFavourites Button should be displayed in MyDashboard page", "MyFavourites Button Not displayed in MyDashboard page");
				}
					
					}catch (Exception e) {
						System.out.println("Error description: " + e.getStackTrace());
				}
			}
		
		/***********************Customer clicks on My Favourites and verify list of added MyFavourites *****************************/

		public void verify_MyFavoritewhereSalonsarealreadyadded() {
			try {

				if (browser.elementisdisplayed(CustomerModule.Customer_MyFavourites_Button)) {
					
					browser.reportscomtep("Passed", "Verify MyFavourites Button is displayed in MyDashboard page",
							"MyFavourites Button should be displayed in MyDashboard page", "MyFavourites Button displayed in MyDashboard page");
					
					browser.click(CustomerModule.Customer_MyFavourites_Button);
					
					if(browser.elementisdisplayed(CustomerModule.Customer_Myfavourites_Header)){
						browser.reportscomtep("passed", "Click on MyFavourites Button and Verify Favourites page is displayed"  , "Favourites page should be displayed", "Favourites page displayed");
						
					} else {
						browser.reportscomtep("Failed", "Click on MyFavourites Button and Verify Favourites page is displayed"  , "Favourites page should be displayed", "Favourites page not displayed");
					}
					
					if(browser.elementisdisplayed(CustomerModule.Customer_Myfavourites_businesslist)){
						browser.reportscomtep("Passed", "Verify List of Favourites is displayed where Salons are already added as Favorites"  , "List of Favourites should be displayed", "List of Salons added as Favourites displayed");
						
						browser.Verify_elementisdisplayed_Report(CustomerModule.Customer_myfavourites_Bookme_Button,
								"MyFavourites businesslist Bookme Button");
						
						browser.Verify_elementisdisplayed_Report(CustomerModule.Customer_myfavourites_Remove_Button,
								"MyFavourites businesslist Remove Button");						
					
					}else{
						browser.reportscomtep("Failed", "Verify List of Favourites is displayed where Salons are already added as Favorites"  , "List of Favourites should be displayed", "List of Salons added as Favourites Not displayed");
					}
										
					
				}else {
					browser.reportscomtep("Failed", "Verify MyFavourites Button is displayed in MyDashboard page",
							"MyFavourites Button should be displayed in MyDashboard page", "MyFavourites Button Not displayed in MyDashboard page");
				}
					
					}catch (Exception e) {
						System.out.println("Error description: " + e.getStackTrace());
				}
			}

		/******************************  Customer clicks on Book Me button in My Favourites ********************************/

		public void shearCircle_Verify_Bookme_Button_InmyFavourites() {
			
			try {

				if(browser.elementisdisplayed(CustomerModule.Customer_Myfavourites_businesslist)){
					browser.reportscomtep("Passed", "Verify list of favourites is displayed"  , "list of favourites should be displayed", "list of favourites is displayed");
				
					browser.click(CustomerModule.Customer_myfavourites_Bookme_Button);
					
					if(browser.elementisdisplayed(CustomerModule.Customer_Mydashboard_myfavourites_bookme_digitekheader)){
						browser.reportscomtep("Passed", "Click on Bookme button and Verify bookme digitek header is displayed"  , "bookme digitek header should be displayed", "bookme digitek header is displayed");
						
						/*browser.Verify_elementisdisplayed_Report(CustomerModule.Customer_Mydashboard_Welcome_Name_Header,
								"Mydashboard fullname");

						browser.Verify_elementisdisplayed_Report(CustomerModule.Customer_Mydashboard_myfavourites_bookme_services, "Mydashboard bookme services");

						browser.Verify_elementisdisplayed_Report(CustomerModule.Customer_Mydashboard_myfavourites_bookme_overview, "Mydashboard bookme overview");

						browser.Verify_elementisdisplayed_Report(CustomerModule.Customer_Mydashboard_myfavourites_bookme_inquiry, "Mydashboard bookme reviews");

						browser.Verify_elementisdisplayed_Report(CustomerModule.Customer_Mydashboard_myfavourites_bookme_reviews,
								"Mydashboard bookme inquiry");

						browser.Verify_elementisdisplayed_Report(CustomerModule.Customer_Mydashboard_myfavourites_bookme_promotions,
								"Mydashboard bookme promotions");

						browser.Verify_elementisdisplayed_Report(CustomerModule.Customer_Mydashboard_myfavourites_bookme_videos,
								"Mydashboard bookme videos");

						browser.Verify_elementisdisplayed_Report(CustomerModule.Customer_Mydashboard_myfavourites_bookme_photos,
								"Mydashboard bookme photos");
						
						browser.Verify_elementisdisplayed_Report(CustomerModule.Customer_Mydashboard_myfavourites_bookme_contactus,
								"Mydashboard bookme contactus");
						
						browser.Verify_elementisdisplayed_Report(CustomerModule.Customer_Mydashboard_myfavourites_bookme_jobs,
								"Mydashboard bookme jobs");

						browser.Verify_elementisdisplayed_Report(CustomerModule.Customer_Mydashboard_myfavourites_bookme_markedasfavourite,
								"Mydashboard bookme markedas favourite ");
						
						browser.Verify_elementisdisplayed_Report(CustomerModule.Customer_Mydashboard_myfavourites_bookme_share,
								"Mydashboard bookme share");*/

					}else {
						browser.reportscomtep("Failed", "Click on Bookme button and Verify bookme digitek header is displayed"  , "bookme digitek header should be displayed", "bookme digitek header is not displayed");
					}
				
					}else {
					browser.reportscomtep("Failed", "Verify list of favourites is displayed"  , "list of favourites should be displayed", "list of favourites is not displayed");
					}
							
						}catch(Exception e){
				System.out.println("Error description: " + e.getStackTrace() );
						
			}
					
			}
		

		

		/*****************************  Customer clicks on Remove button in My Favourites(in progress) *************************/
		
	public void shearCircle_Verify_Customer_RemoveButton_in_Myfavourites() {
			
			try {

				if(browser.elementisdisplayed(CustomerModule.Customer_Myfavourites_businesslist)){
					browser.reportscomtep("Passed", "Verify list of favourites is displayed"  , "list of favourites should be displayed", "list of favourites is displayed");
				
					browser.click(CustomerModule.Customer_myfavourites_Remove_Button);
					
					if(browser.elementisdisplayed(CustomerModule.Customer_Myfavourites_Remove_Header)){
						browser.reportscomtep("Passed", "Verify Removed popup is displayed"  , "Removed popup should be displayed", "Removed popup is displayed");
						browser.click(CustomerModule.Customer_Myfavourites_Remove_Popup_ok);
					
					}else {
						browser.reportscomtep("Failed", "Verify Removed popup is displayed"  , "Removed popup should be displayed", "Removed popup is not displayed");
						}	
					}else {
						browser.reportscomtep("Failed", "Verify list of favourites is displayed"  , "list of favourites should be displayed", "list of favourites is not displayed");
						}	
				}catch(Exception e){
					System.out.println("Error description: " + e.getStackTrace() );
				
				}
		
		}

	/*****************************  Customer clicks on My Appointments  *************************/

	public void shearCircle_Verify_Customer_clickson_MyappoinmentsandVerifyFields() {
			
		try {

			if (browser.elementisdisplayed(CustomerModule.Customer_Mydashboard_header)) {

				browser.reportscomtep("Passed", "Verify Customer Registration form My dashboard header is displayed",
						"Customer Registration form My dashboard header should be displayed",
						"Customer Registration form My dashboard header is displayed");

				browser.click(CustomerModule.Customer_Myappoinments_Button);
				

				if (browser.elementisdisplayed(
						CustomerModule.Customer_Myappoinments_Noappoinments_Message)) {
					browser.reportscomtep("Passed", "Verify no appoinments is displayed",
							"no appoinments should be displayed", "no appoinments is displayed");
					browser.Verify_elementisdisplayed_Report(CustomerModule.Customer_Mydashboard_Myappoinments_ID,
							"Myappoinments ID");

					browser.Verify_elementisdisplayed_Report(
							CustomerModule.Customer_Mydashboard_Myappoinments_Datetime, "Myappoinments datetime");

					browser.Verify_elementisdisplayed_Report(
							CustomerModule.Customer_Mydashboard_Myappoinments_businessname,
							"Myappoinments business name");

					browser.Verify_elementisdisplayed_Report(
							CustomerModule.Customer_Mydashboard_Myappoinments_amount, "Myappoinments Amount");

					browser.Verify_elementisdisplayed_Report(
							CustomerModule.Customer_Mydashboard_Myappoinments_appoinmentstatus,
							"Myappoinments Appinmentstatus");

					browser.Verify_elementisdisplayed_Report(
							CustomerModule.Customer_Mydashboard_Myappoinments_paymentstatus,
							"Myappoinments payment status");

					browser.Verify_elementisdisplayed_Report(
							CustomerModule.Customer_Mydashboard_Myappoinments_action, "Myappoinments action");

					browser.Verify_elementisdisplayed_Report(CustomerModule.Customer_Mydashboard_Myappoinments_type,
							"Myappoinments filter type");

					browser.Verify_elementisdisplayed_Report(
							CustomerModule.Customer_Mydashboard_Myappoinments_upcomingappinments,
							"Myappoinments upcoming appoinments");

					browser.Verify_elementisdisplayed_Report(
							CustomerModule.Customer_Mydashboard_Myappoinments_pastappinments,
							"Myappoinments past appoinments");

					browser.Verify_elementisdisplayed_Report(
							CustomerModule.Customer_Mydashboard_Myappoinments_status, "Myappoinments status");

					browser.Verify_elementisdisplayed_Report(
							CustomerModule.Customer_Mydashboard_Myappoinments_status_completed,
							"Myappoinments status completed");

					browser.Verify_elementisdisplayed_Report(
							CustomerModule.Customer_Mydashboard_Myappoinments_status_pending,
							"Myappoinments status pending");

					browser.Verify_elementisdisplayed_Report(
							CustomerModule.Customer_Mydashboard_Myappoinments_status_cancelled,
							"Myappoinments status cancelled");					
				} else {
					browser.reportscomtep("Failed", "Verify no appoinments is displayed",
							"no appoinments should be displayed", "no appoinments is not displayed");
				}

			} else {
				browser.reportscomtep("Failed", "Verify Customer Registration form My dashboard header is displayed",
						"Customer Registration form My dashboard header should be displayed",
						"Customer Registration form My dashboard header is not displayed");
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());

		}

	  }

	/*****************************  Customer clicks on Settings   *************************/

	/*public void shearCircle_Verify_Customer_clickson_Settings() {

		try {

			if (browser.elementisdisplayed(CustomerModule.Customer_Mydashboard_header)) {

				browser.reportscomtep("Passed", "Verify Customer Registration form My dashboard header is displayed",
						"Customer Registration form My dashboard header should be displayed",
						"Customer Registration form My dashboard header is displayed");

				browser.click(CustomerModule.Customer_Mydashboard_Settings_Button);
				browser.wait(5);

				if (browser.elementisdisplayed(CustomerModule.Customer_Mydashboard_settings_header)) {
					browser.reportscomtep("Passed", "Verify settings header is displayed",
							"settings header should be displayed", "settings header is displayed");
					browser.Verify_elementisdisplayed_Report(CustomerModule.Customer_Mydashboard_settings_FirstName,
							" dashboard settings firstname");

					browser.Verify_elementisdisplayed_Report(CustomerModule.Customer_Mydashboard_settings_LastName,
							"dashboard settings lastnme");

					browser.Verify_elementisdisplayed_Report(CustomerModule.Customer_Mydashboard_settings_Email,
							"dashboard settings EMail");

					browser.Verify_elementisdisplayed_Report(
							CustomerModule.Customer_Mydashboard_settings_Gender_Male, "dashboard settings male");

					browser.Verify_elementisdisplayed_Report(
							CustomerModule.Customer_Mydashboard_settings_Gender_Female, "dashboard settings female");

					browser.Verify_elementisdisplayed_Report(CustomerModule.Customer_Mydashboard_settings_Phone,
							"dashboard settings phone");

					browser.Verify_elementisdisplayed_Report(CustomerModule.Customer_Mydashboard_settings_Address,
							"dashboard settings address");

					browser.Verify_elementisdisplayed_Report(CustomerModule.Customer_Mydashboard_settings_city,
							"dashboard settings city");

					browser.Verify_elementisdisplayed_Report(CustomerModule.Customer_Mydashboard_settings_State,
							"dashboard settings state");

					browser.Verify_elementisdisplayed_Report(CustomerModule.Customer_Mydashboard_settings_Country,
							"dashboard settings country");

					browser.Verify_elementisdisplayed_Report(CustomerModule.Customer_Mydashboard_settings_zipcode,
							"dashboard settings zipcode");

					browser.Verify_elementisdisplayed_Report(
							CustomerModule.Customer_Mydashboard_settings_Birthday_date,
							"dashboard settings birthday date");

					browser.Verify_elementisdisplayed_Report(
							CustomerModule.Customer_Mydashboard_settings_Birthday_Month,
							"dashboard settings birthday month");

					browser.Verify_elementisdisplayed_Report(
							CustomerModule.Customer_Mydashboard_settings_changepassword_lynk,
							"dashboard settings changepassword lynk");

					browser.Verify_elementisdisplayed_Report(CustomerModule.Customer_Mydashboard_settings_cancel,
							"dashboard settings cancel");

					browser.Verify_elementisdisplayed_Report(CustomerModule.Customer_Mydashboard_settings_Update,
							"dashboard settings update");

				} else {
					browser.reportscomtep("Failed", "Verify settings header is displayed",
							"settings header should be displayed", "settings header is not displayed");
				}
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());

		}
	}*/

	/*****************************  Check whether My Appointments is clickable	  *************************/

	public void shearCircle_Verify_Customer_Clickson_MyAppoinments() {
			
		try {

			if (browser.elementisdisplayed(CustomerModule.Customer_Myappoinments_Button)) {		
				browser.reportscomtep("Passed", "Verify Myappoinments Button is displayed in MyDashboard page",
						"Myappoinments Button should be displayed in MyDashboard page", "Myappoinments Button displayed in MyDashboard page");

				browser.click(CustomerModule.Customer_Myappoinments_Button);
		
				if (browser.elementisdisplayed(CustomerModule.Customer_MyAppoinments_Header)){
					browser.reportscomtep("Passed", "Clicks on Myappoinments button and verify My appoinments header is displayed ",
							"My appoinments header should be displayed", "Myappoinments header displayed");					
					
					if(browser.elementisdisplayed(CustomerModule.Customer_Myappoinments_Table)){
						browser.reportscomtep("Passed", "Verify List of Myappoinments table or No appoinments Added Yet message is displayed"  , "List of Myappoinments table or No appoinments Added Yet message should be displayed", "List of MyAppointments table displayed");
						
						browser.Verify_elementisdisplayed_Report(CustomerModule.Customer_Myappoinments_View_Buttons.get(0),"List of Myappoinments with View button next to each booking");								
					
					}else if(browser.elementisdisplayed(CustomerModule.Customer_Myappoinments_Noappoinments_Message)){
						browser.reportscomtep("Passed", "Verify List of Myappoinments table or No appoinments Added Yet message is displayed"  , "List of Myappoinments table or No appoinments Added Yet message should be displayed", "No Appointment found Yet message displayed if no bookings are made/for 1st time login");
					}else{
						browser.reportscomtep("Failed", "Verify List of Myappoinments table or No appoinments Added Yet message is displayed"  , "List of Myappoinments table or No appoinments Added Yet message should be displayed", "List of MyAppointments or No Appointment found Yet message not displayed");
					}

				} else {
					browser.reportscomtep("Failed", "Clicks on Myappoinments button and verify My appoinments header is displayed ",
							"My appoinments header should be displayed", "Myappoinments header Not displayed");
					
				}
				
			} else {
				browser.reportscomtep("Failed", "Verify Myappoinments Button is displayed in MyDashboard page",
						"Myappoinments Button should be displayed in MyDashboard page", "Myappoinments Button Not displayed in MyDashboard page");
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());

		}


	}
	
	/*****************************  Check whether Settings is clickable	  *************************/

	public void shearCircle_Verify_Customer_Clickson_Settings() {
			
		try {
			String firstName = "";
			String lastName = "";
			String emailId="";
			String gender="";
			boolean genderSelection = false;

			if (browser.elementisdisplayed(CustomerModule.Customer_Mydashboard_header)){
				browser.reportscomtep("Passed", "Verify Customer My dashboard header is displayed",
						"Customer My dashboard header should be displayed",
						"Customers My dashboard header is displayed");

				browser.click(CustomerModule.Customer_Mydashboard_Settings_Button);		
				if (browser.elementisdisplayed(CustomerModule.Customer_Mydashboard_settings_header)) {
					browser.reportscomtep("Passed", "Verify settings header is displayed",
							"settings header should be displayed", "settings header displayed");
					firstName = browser.getelementtext(CustomerModule.Customer_Settings_FirstName);
					lastName = browser.getelementtext(CustomerModule.Customer_Settings_LastName);
					emailId = browser.getelementtext(CustomerModule.Customer_Settings_Email);
					
					if(CustomerModule.Customer_Settings_Gender_Male.isSelected()){
						gender = browser.elementgetAttributevalue(CustomerModule.Customer_Settings_Gender_Male, "value");
						genderSelection = true;
					}else if(CustomerModule.Customer_Settings_Gender_Female.isSelected()){
						gender = browser.elementgetAttributevalue(CustomerModule.Customer_Settings_Gender_Female, "value");
						genderSelection = true;
					}

					if (firstName != "" && lastName !="" && emailId!="" && genderSelection == true){
						browser.reportscomtep("Passed", "Verify Customer autopopulated data in Settings page",
								"Customer data should be autopopulated in Settings page",
								"Customer data autopopulated in Settings page for the fields FirstName: "+firstName+", LastNAme: "+lastName+", Email: "+emailId+", Gender: "+gender);
					}else{
						browser.reportscomtep("Passed", "Verify Customer autopopulated data in Settings page",
								"Customer data should be autopopulated in Settings page",
								"Customer data Not autopopulated in Settings page");
					}

				} else {
					browser.reportscomtep("Failed", "Verify settings header is displayed",
							"settings header should be displayed", "settings header not displayed");
				}
					
			} else {
				browser.reportscomtep("Failed", "Verify Customer Registration form My dashboard header is displayed",
						"Customer Registration form My dashboard header should be displayed",
						"Customer Registration form My dashboard header is not displayed");
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());

		}
	}
	
	/************************** Check whether Change Profile Picture button is Clickable	*************/

	public void shearCircle_Customer_Verify_Change_Profile_Picture_Buttonis_Clickable() {
		
	try {
		browser.click(CustomerModule.Customer_MyDashboard_Button);
		browser.waitforelementtobevisible(CustomerModule.Customer_Mydashboard_changeProfilepicture, 10);
		if (browser.elementisdisplayed(CustomerModule.Customer_Mydashboard_changeProfilepicture)) {		
			browser.reportscomtep("Passed", "Verify Change Profile picture Button is displayed in MyDashboard page",
					"Change profile picture Button should be displayed in MyDashboard page", "Change profile picture Button isplayed in MyDashboard page");

			browser.click(CustomerModule.Customer_Mydashboard_changeProfilepicture);

			browser.Verify_elementisdisplayed_Report(CustomerModule.Customer_Mydashboard_ChooseFile_Button, "Mydashboard Choosefile Button");
						
		} else {					
			browser.reportscomtep("Failed", "Verify Change Profile picture Button is displayed in MyDashboard page",
					"Change profile picture Button should be displayed in MyDashboard page", "Change profile picture Button is not displayed in MyDashboard page");

		}
	}catch(Exception e){
		System.out.println("Error description: " + e.getStackTrace() );
	}			
	}
	/************************** Check whether the Search button is clickable			*************/

	public void shearCircle_Verify_Customer_Search_Button_IsClickable() {
		
	try {

		if (browser.elementisdisplayed(CustomerModule.Customer_Mydashboard_Search_Button)) {		
			browser.reportscomtep("Passed", "Verify Search Button is displayed in Login page",
					"Search Button should be displayed in Login page", "Search Button is displayed in Login page");

			browser.click(CustomerModule.Customer_Mydashboard_Search_Button);
			browser.waitforelementtobevisible(CustomerModule.Customer_Search_Resultspage_Header, 20);
			browser.Verify_elementisdisplayed_Report(
					CustomerModule.Customer_Search_Resultspage_Header, "Opens the Search Results page and displays all available Salons");			
					
				} else {
					
			browser.reportscomtep("Failed", "Verify Search Button is displayed in Login page",
					"Search Button should be displayed in Login page", "Search Button is not displayed in Login page");
		}
	}catch(Exception e){
		System.out.println("Error description: " + e.getStackTrace() );
	}			
	}
		/*****************************  Check the info in My Appointments for first time login/ without creating any bookings	  *************************/

	public void shearCircle_Verify_Customer_Clickson_MyAppoinments_firsttime_Login() {
		
		try {

			if (browser.elementisdisplayed(CustomerModule.Customer_Myappoinments_Button)) {		
				browser.reportscomtep("Passed", "Verify Myappoinments Button is displayed in MyDashboard page",
						"Myappoinments Button should be displayed in MyDashboard page", "Myappoinments Button displayed in MyDashboard page");

				browser.click(CustomerModule.Customer_Myappoinments_Button);
		
				if (browser.elementisdisplayed(CustomerModule.Customer_Mydashboard_Myappoinments_header)){
					browser.reportscomtep("Passed", "Clicks on Myappoinments button and verify My appoinments header is displayed ",
							"My appoinments header should be displayed", "Myappoinments header displayed");					
					
					if(browser.elementisdisplayed(CustomerModule.Customer_Myappoinments_Noappoinments_Message)){
						browser.reportscomtep("Passed", "Verify List of Myappoinments table or No appoinments Added Yet message is displayed"  , "List of Myappoinments table or No appoinments Added Yet message should be displayed", "No Appointment found Yet message displayed if no bookings are made/for 1st time login");
					}else{
						browser.reportscomtep("Failed", "Verify List of Myappoinments table or No appoinments Added Yet message is displayed"  , "List of Myappoinments table or No appoinments Added Yet message should be displayed", "No Appointment found Yet message Not displayed if no bookings are made/for 1st time login");
					}

				} else {
					browser.reportscomtep("Failed", "Clicks on Myappoinments button and verify My appoinments header is displayed ",
							"My appoinments header should be displayed", "Myappoinments header Not displayed");
					
				}
				
			} else {
				browser.reportscomtep("Failed", "Verify Myappoinments Button is displayed in MyDashboard page",
						"Myappoinments Button should be displayed in MyDashboard page", "Myappoinments Button Not displayed in MyDashboard page");
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());

		}


	}
	/*****************************  Check info in My Appointments for account that has made bookings previously		  *************************/
	public void shearCircle_Verify_Customer_Clickson_MyAppoinmentsforExistingUser() {
		
		try {

			if (browser.elementisdisplayed(CustomerModule.Customer_Myappoinments_Button)) {		
				browser.reportscomtep("Passed", "Verify Myappoinments Button is displayed in MyDashboard page",
						"Myappoinments Button should be displayed in MyDashboard page", "Myappoinments Button displayed in MyDashboard page");

				browser.click(CustomerModule.Customer_Myappoinments_Button);
		
				if (browser.elementisdisplayed(CustomerModule.Customer_MyAppoinments_Header)){
					browser.reportscomtep("Passed", "Clicks on Myappoinments button and verify My appoinments header is displayed ",
							"My appoinments header should be displayed", "Myappoinments header displayed");					
					
					if(browser.elementisdisplayed(CustomerModule.Customer_Myappoinments_Table)){
						browser.reportscomtep("Passed", "Verify List of Myappoinments table or No appoinments Added Yet message is displayed"  , "List of Myappoinments table or No appoinments Added Yet message should be displayed", "List of MyAppointment table displayed");
						
						browser.Verify_elementisdisplayed_Report(CustomerModule.Customer_Myappoinments_View_Buttons.get(0),"List of Myappoinments with View button next to each booking");								
					
					}else{
						browser.reportscomtep("Failed", "Verify List of Myappoinments table or No appoinments Added Yet message is displayed"  , "List of Myappoinments table or No appoinments Added Yet message should be displayed", "List of MyAppointment table not displayed");
					}

				} else {
					browser.reportscomtep("Failed", "Clicks on Myappoinments button and verify My appoinments header is displayed ",
							"My appoinments header should be displayed", "Myappoinments header Not displayed");
					
				}
				
			} else {
				browser.reportscomtep("Failed", "Verify Myappoinments Button is displayed in MyDashboard page",
						"Myappoinments Button should be displayed in MyDashboard page", "Myappoinments Button Not displayed in MyDashboard page");
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());

		}
	}
	public void shearCircle_Verify_Customer_Clickson_MyAppoinments_Accountholder_Login() {
		
		try {

			if (browser.elementisdisplayed(CustomerModule.Customer_Mydashboard_header)) {

				browser.reportscomtep("Passed", "Verify Customer My dashboard header is displayed",
						"Customer My dashboard header should be displayed",
						"Customers My dashboard header is displayed");

				browser.click(CustomerModule.Customer_Myappoinments_Button);
			if (browser.elementisdisplayed(CustomerModule.Customer_Myappoinments_Table)) {
					browser.reportscomtep("Passed", "Verify list of appoinments is displayed with view button",
							"list of appoinments with view button should be displayed", "list of appoinments  with view button is displayed");
					
					browser.Verify_elementisdisplayed_Report(CustomerModule.Customer_Mydashboard_Myappoinments_View,
							"Mydashboard appoinments View");
					browser.Verify_elementisdisplayed_Report(CustomerModule.Customer_Myappoinments_Table,
							"Mydashboard appoinments pagebookings");
					browser.Verify_elementisdisplayed_Report(CustomerModule.Customer_Mydashboard_Myappoinments_ID,
							"My dashboard Myappoinments ID");

					browser.Verify_elementisdisplayed_Report(
							CustomerModule.Customer_Mydashboard_Myappoinments_Datetime, "Myappoinments datetime");

					browser.Verify_elementisdisplayed_Report(
							CustomerModule.Customer_Mydashboard_Myappoinments_businessname,
							"Myappoinments business name");

					browser.Verify_elementisdisplayed_Report(
							CustomerModule.Customer_Mydashboard_Myappoinments_amount, "Myappoinments Amount");

					browser.Verify_elementisdisplayed_Report(
							CustomerModule.Customer_Mydashboard_Myappoinments_appoinmentstatus,
							"Myappoinments Appinmentstatus");

					browser.Verify_elementisdisplayed_Report(
							CustomerModule.Customer_Mydashboard_Myappoinments_paymentstatus,
							"Myappoinments payment status");
					browser.Verify_elementisdisplayed_Report(CustomerModule.Customer_Mydashboard_Myappoinments_type,
							"Mydashboard Myappoinments Type");

					browser.Verify_elementisdisplayed_Report(CustomerModule.Customer_Mydashboard_Myappoinments_status,
							"Mydashboard Myappoinments Status");

					browser.Verify_elementisdisplayed_Report(CustomerModule.Customer_Mydashboard_Myappoinments_arrow_pagenumbers,
							"Mydashboard Myappoinments arrow pagenumbers");

				} else {
					browser.reportscomtep("Failed", "Verify list of appoinments is displayed with view button",
							"list of appoinments with view button should be displayed", "list of appoinments  with view button is not displayed");
				}
									
			} else {
				browser.reportscomtep("Failed", "Verify Customer Registration form My dashboard header is displayed",
						"Customer Registration form My dashboard header should be displayed",
						"Customer Registration form My dashboard header is not displayed");
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());

		}

	}
	
	/****************************Login ***************************/
	public void ShearCircle_Customer_Login() {
		String CustomerValidEmail = null;
		String CustomerValidPassword = null;
		browser.loaddata(TestDataPath);
		CustomerValidEmail = browser.getdata("CustomerValidEmail");
		CustomerValidPassword = browser.getdata("CustomerValidPassword");
		try {
			if (browser.elementisdisplayed(Login.Home_Login_Link)) {
				browser.reportscomtep("Passed", "Verify Login link is displayed", "Login link should be displayed",
						"Login link is displayed");
				browser.click(Login.Home_Login_Link);
				browser.sendkeys(Login.Login_UserName_textbox, CustomerValidEmail);
				browser.sendkeys(Login.Login_PassWord_textbox, CustomerValidPassword);
				browser.click(Login.Login_signin_button);
				//browser.assertEquals(browser.getelementtext(Login.MyDashboard_ValidMessage_text),"My Dashboard");
				browser.elementisdisplayed(CustomerModule.Customer_Mydashboard_header);
				browser.click(CustomerModule.Customer_MyAppoinments_Link);
			} else {
				browser.reportscomtep("Failed", "Verify Sign In To ShearCircle page header is displayed",
						"Sign In To ShearCircle page header should be displayed",
						"Sign In To ShearCircle page header not displayed");
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());

		}
	}
	
	
/******************TC_3_3_03	Check whether the View button is clickable ************/

	public void Check_View_Button_Is_clickable() {
		try {


			if (browser.elementisdisplayed(CustomerModule.Customer_MyAppoinments_Header)) {
				browser.reportscomtep("Passed", "Verify MyAppoinments Header is displayed ",
						"MyAppoinments Header should be displayed", "MyAppoinments Header displayed");
				if (browser.elementisdisplayed(CustomerModule.Customer_ClicksOnView_Button)) {
					browser.reportscomtep("Passed", "Verify view button is displayed ",
							"View button should be displayed for each booking", "view button displayed for each booking");
					browser.click(CustomerModule.Customer_ClicksOnView_Button);
					browser.waitForNewWindowAndSwitchToIt(driver);
					if (browser.elementisdisplayed(CustomerModule.Customer_ViewBookingSummary_Text)) {
						browser.reportscomtep("Passed", "Click on View button and Verify  View Booking Summary page in new tab is opened ",
								"View Booking Summary page in new tab should be opened",
								" View Booking Summary page in new tab open");
					} else {
						browser.reportscomtep("Failed", "Click on View button and Verify  View Booking Summary page in new tab is opened ",
								"View Booking Summary page in new tab should be opened",
								" View Booking Summary page in new tab not open");
					}
					//browser.switchtoDefaultWindow(driver);
					driver.switchTo().window(defaultWindowHandle);
				} else {
					browser.reportscomtep("Failed", "Verify view button is displayed ",
							"View button should be displayed for each booking", "view button displayed for each booking");
				}
			} else {
				browser.reportscomtep("Failed", "Verify MyAppoinments Header is displayed ",
						"MyAppoinments Header should be displayed", "MyAppoinments Header not displayed");
			}
		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}

	/*************
	 * TC_3_3_04 Check whether the page navigation forward arrows are clickable
	 ***************/
	
	public void checkWhether_ThePageNavigation_ForwardArrows_Clickable() {
		try {
			String PageLinkActiveStatus="";
			String PageLinkActiveStatus1="";
			browser.ScrollToXY(0, 250);
			if (browser.elementisdisplayed(CustomerModule.Customer_Page1_Link)) {
				browser.reportscomtep("Passed", "Verify  My Appaintments are defafulted in first page",
						" My Appaintments should be in first page", "Verify My Appaintments in first page");
				if (browser.elementisdisplayed(CustomerModule.Customer_NavigateToNextPage_Link)){
					browser.reportscomtep("Passed", "Verify navigate to next page i.e '>' link is displayed",
							"  Navigate to next page i.e '>' link should be displayed",
							" Navigate to next page i.e '>' link displayed");
					browser.click(CustomerModule.Customer_NavigateToNextPage_Link);
					browser.waitforelementtobevisible(CustomerModule.Customer_Myappoinments_Table, 15);
					Thread.sleep(10000);
					PageLinkActiveStatus = browser.elementgetAttributevalue(CustomerModule.Customer_NextPageActive_Link, "class");
					if(PageLinkActiveStatus.equalsIgnoreCase("active")){
						browser.reportscomtep("Passed", "Click on '>' link and Verify page 2 is displayed",
								"Verify page 2 should be displayed",
								"Verify page 2 displayed");	
					}else{
						browser.reportscomtep("Failed", "Click on '>' link and Verify page 2 is displayed",
								"  Navigate to next page i.e '>' link should be displayed",
								" Navigate to next page i.e '>' link displayed");	
					}
				} else {
					browser.reportscomtep("Failed", "Verify navigate to next page i.e '>' link is displayed",
							"  Navigate to next page i.e '>' link should be displayed",
							" Navigate to next page i.e '>' link not displayed");
				}
				
				if (browser.elementisdisplayed(CustomerModule.Customer_NavigateToLastPage_Link)){
					browser.reportscomtep("Passed", "Verify navigate to next page i.e '>>' link is displayed",
							"  Navigate to next page i.e '>>' link should be displayed",
							" Navigate to next page i.e '>>' link displayed");
					browser.click(CustomerModule.Customer_NavigateToLastPage_Link);
					browser.waitforelementtobevisible(CustomerModule.Customer_Myappoinments_Table, 15);
					Thread.sleep(10000);
					PageLinkActiveStatus1= browser.elementgetAttributevalue(CustomerModule.Customer_LastPageActive_Link, "class");
					if(PageLinkActiveStatus1.equalsIgnoreCase("active")){
						browser.reportscomtep("Passed", "Click on '>>' link and Verify Last page  is displayed",
								"Verify Last Page should be displayed",
								"Verify Last page displayed");	
					}else{
						browser.reportscomtep("Failed", "Click on '>>' link and Verify Last page is displayed",
								"Verify Last Page should be displayed",
								"Verify Last page not displayed");	
					}
				} else {
					browser.reportscomtep("Failed", "Verify navigate to next page i.e '<<' link is displayed",
							"  Navigate to next page i.e '>>' link should be displayed",
							" Navigate to next page i.e '>>' link not displayed");
				}
			} else {
				browser.reportscomtep("Failed", "Verify My Appaintments are defafulted in first page",
						"Verify My Appaintments should be in first page", "Verify My Appaintments not in first page");
			}
		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());

		}
	}
	/************
	 * TC_3_3_05 Check whether the page navigation backward arrows are clickable
	 ****************/

	public void checkWhether_ThePageNavigation_BackwardArrowsAre_Clickable() {
		try {
			String PageLinkActiveStatus="";
			String PageLinkActiveStatus1="";
			String LastpageNo = "";
			int pagelinkscount = 0;
			int selectedPageNo = 0;
			String PageNumber = "";
			browser.ScrollToXY(0, 250);
			if (browser.elementisdisplayed(CustomerModule.Customer_LastPageShowing_Link)){
				LastpageNo = browser.getelementtext(CustomerModule.Customer_LastPageShowing_Link);
				browser.reportscomtep("Passed", "Verify Last page i.e "+LastpageNo+" link is displayed",
						"  Last page i.e "+LastpageNo+" link should be displayed",
						" Last page i.e "+LastpageNo+" link displayed");
				if (browser.elementisdisplayed(CustomerModule.Customer_NaviagateToPreviousPage_Link)) {
					browser.reportscomtep("Passed", "Verify navigate to next page i.e '<' link is displayed",
							"  Navigate to next page i.e '<' link should be displayed",
							" Navigate to next page i.e '<' link displayed");
					browser.click(CustomerModule.Customer_NaviagateToPreviousPage_Link);
					browser.waitforelementtobevisible(CustomerModule.Customer_Myappoinments_Table, 15);
					Thread.sleep(10000);
					pagelinkscount = CustomerModule.Customer_PageNumber_Links.size();
					selectedPageNo = pagelinkscount-2;
					//if(selectedPageNo==5){
					/*for(int i =1; i<5;i++){
						Thread.sleep(10000);
						PageLinkActiveStatus = browser.elementgetAttributevalue(CustomerModule.Customer_Page_Links.get(selectedPageNo), "class");	
					}	*/
					PageLinkActiveStatus = browser.elementgetAttributevalue(CustomerModule.Customer_Page_Links, "class");						
						System.out.println("PageLinkActiveStatus: "+PageLinkActiveStatus);
					//}			
					
					if(PageLinkActiveStatus.equalsIgnoreCase("active")){
						PageNumber = CustomerModule.Customer_PageNumber_Links.get(selectedPageNo).getText();
						browser.reportscomtep("Passed", "Click on '<' link and Verify Last to previous page is displayed",
								"Last to previous page should be displayed",
								"Last to previous page i.e "+PageNumber+" displayed");	
					}else{
						browser.reportscomtep("Failed", "Click on '<' link and Verify Last to previous page is displayed",
								"Last to previous page should be displayed",
								"Last to previous page Not displayed");	
					}
				} else {
					browser.reportscomtep("Failed", "Verify navigate to next page i.e '<' link is displayed",
							"  Navigate to next page i.e '<' link should be displayed",
							" Navigate to next page i.e '<' link not displayed");
				}
				
				if (browser.elementisdisplayed(CustomerModule.Customer_NaviagateToFirstPage_Link)) {
					browser.reportscomtep("Passed", "Verify takes you to the first page i.e '<<' link is displayed",
							" Takes you to the first page i.e '<<' link should be displayed",
							" Takes you to the first page i.e '<<' link displayed");
					browser.click(CustomerModule.Customer_NaviagateToFirstPage_Link);
					browser.waitforelementtobevisible(CustomerModule.Customer_Page1_Link, 15);
					Thread.sleep(10000);
					PageLinkActiveStatus1 = browser.elementgetAttributevalue(CustomerModule.Customer_FirstPageActive_Link, "class");
					if(PageLinkActiveStatus1.equalsIgnoreCase("active")){
						browser.reportscomtep("Passed", "Click on '<<' link and Verify First page is displayed",
								"First Page should be displayed",
								"First page i.e 1 displayed");	
					}else{
						browser.reportscomtep("Failed", "Click on '<<' link and Verify First page is displayed",
								"First Page should be displayed",
								"First Page Not displayed");
					}
					
				} else {
					browser.reportscomtep("Failed", "Verify takes you to the first page i.e '<<' link is displayed",
							" Takes you to the first page i.e '<<' link should be displayed",
							" Takes you to the first page i.e '<<' link Not displayed");
				}
			} else {
				browser.reportscomtep("Failed", "Verify Last page i.e "+LastpageNo+" link is displayed",
						" Last page i.e "+LastpageNo+" link should be displayed",
						" Last page i.e "+LastpageNo+" link not displayed");
			}
		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());

		}
	}

	
	/***********************
	 * TC_3_3_06 Check whether the correct page is displayed by clicking on page number
	 *******************/
	public void checkWhether_TheCorrectPage_IsDIsplayedBy_ClickingoOnPage_Number() {
		try { 
			String PageLinkActiveStatus="";
			String PageNumber = "";
			boolean isPagetwodisplayed = false;
			browser.ScrollToXY(0, 250);
			if (browser.elementisdisplayed(CustomerModule.Customer_Page1_Link)) {
				browser.reportscomtep("Passed", "Verify My Appaintments are defafulted in first page",
						" My Appaintments should be in first page", "Verify My Appaintments in first page");				
				//browser.click(CustomerModule.Customer_Page1_Link);
				if (CustomerModule.Customer_PageNumber_Links.size()>3){
					for(WebElement link:CustomerModule.Customer_PageNumber_Links){
						PageNumber = link.getText();
						if(PageNumber.equalsIgnoreCase("2")){
							isPagetwodisplayed = true;
							browser.reportscomtep("Passed", "Verify Page '2' link is displayed",
									"Page i.e '2' link should be displayed",
									"Page i.e '2' link displayed");
							browser.click(link);
							browser.waitforelementtobevisible(CustomerModule.Customer_Myappoinments_Table, 15);
							Thread.sleep(10000);
							PageLinkActiveStatus = browser.elementgetAttributevalue(CustomerModule.Customer_NextPageActive_Link, "class");
							if(PageLinkActiveStatus.equalsIgnoreCase("active")){
								browser.reportscomtep("Passed", "Click on '2' link and Verify page 2 is displayed",
										"Verify page 2 should be displayed",
										"Verify page 2 displayed");	
								break;
								
							}else{
								browser.reportscomtep("Failed", "Click on '2' link and Verify page 2 is displayed",
										"Verify page 2 should be displayed",
										"Verify page 2 not displayed");	
								break;
							}
							
						
							}
					}
						
					if(isPagetwodisplayed==false){						
							browser.reportscomtep("Failed", "Verify Page '2' link is displayed",
									"Page '2' should be displayed",
									"Page '2' link not displayed");
						}
					
							
						}else{
							browser.reportscomtep("Failed", "Verify navigate to page i.e Page Number links are displayed More than 3",
									" Page Number links shoud be displayed More than 3",
									" Page Number links are Not displayed More than 3");
						}
					
					
				} else {
					browser.reportscomtep("Failed", "Verify My Appaintments are defafulted in first page",
							"Verify My Appaintments should be in first page", "Verify My Appaintments not in first page");
				}
			} catch (Exception e) {
				System.out.println("Error description: " + e.getStackTrace());
			}
	}

	/****************************
	 * TC_3_3_07 Check the available filters in Type
	 *********************/

	public void checkThe_Available_Filters_InType() {
		try {
			int itemCount = 0;
			String typeDropdownvlaues ="";
			String expectedTypeValues= "Type;Upcoming Appointments;Past Appointments";
			if (browser.elementisdisplayed(CustomerModule.Customer_MyAppoinments_Header)) {
				browser.reportscomtep("Passed", "Verify MyAppoinments Header is displayed ",
						"MyAppoinments Header should be displayed", "MyAppoinments Header displayed");
				if (browser.elementisdisplayed(CustomerModule.Customer_MyAppoinments_Type_Dropdown)) {
					browser.reportscomtep("Passed", "Verify Type dropdown box is dispalyed ",
							"Type dropdown box should be dispalyed", "Type dropdown box dispalyed");
					browser.scrollUp(200);
					List<WebElement> Type = browser.getOptions(CustomerModule.Customer_MyAppoinments_Type_Dropdown);
					itemCount = Type.size();
					if(itemCount>0){
						for(WebElement listvalue:Type) {
							typeDropdownvlaues = typeDropdownvlaues+";"+listvalue.getText();
							System.out.println("Type List value:"+typeDropdownvlaues);
						}
						if(expectedTypeValues.equalsIgnoreCase(typeDropdownvlaues.substring(1))){
							browser.reportscomtep("Passed", "Verify list of filters dispalyed in Type dropdown box.",
									"List of filters should be dispalyed in Type dropdown box.", "List of filters dispalyed as : "+typeDropdownvlaues+" in Type dropdown box.");
						}else{
							browser.reportscomtep("Failed", "Verify list of filters dispalyed in Type dropdown box.",
									"List of filters should be dispalyed in Type dropdown box.", "List of filters Not dispalyed in Type dropdown box.");
						}
					}

				} else {
					browser.reportscomtep("Failed", "Verify Type dropdown box is dispalyed ",
							"Type dropdown box should be dispalyed", "Type dropdown box not dispalyed");

				}
			} else {
				browser.reportscomtep("Failed", "Verify MyAppoinments Header is displayed ",
						"MyAppoinments Header should be displayed", "MyAppoinments Header Not displayed");
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());

		}
	}

	/****************************
	 * TC_3_3_08 Check the available filters in Status
	 *******************/

	public void checkThe_Available_FiltersInStatus() {
		try {
			int itemCount = 0;
			String typeDropdownvlaues ="";
			String expectedTypeValues= "Status;Completed;Pending;Canceled";
			
			if (browser.elementisdisplayed(CustomerModule.Customer_MyAppoinments_Header)) {
				browser.reportscomtep("Passed", "Verify MyAppoinments Header is displayed ",
						"MyAppoinments Header should be displayed", "MyAppoinments Header displayed");
				if (browser.elementisdisplayed(CustomerModule.Customer_MyAppoinments_Dropdown_Status)) {
					browser.reportscomtep("Passed", "Verify Status dropdown box is dispalyed ",
							"Status dropdown box should be dispalyed", "Status dropdown box dispalyed");
					
					List<WebElement> Status = browser.getOptions(CustomerModule.Customer_MyAppoinments_Dropdown_Status);
					itemCount = Status.size();
					if(itemCount>0){
						for(WebElement listvalue:Status) {
							typeDropdownvlaues = typeDropdownvlaues+";"+listvalue.getText();
							System.out.println("Type List value:"+typeDropdownvlaues);
						}
						if(expectedTypeValues.equalsIgnoreCase(typeDropdownvlaues.substring(1))){
							browser.reportscomtep("Passed", "Verify list of filters dispalyed in Status dropdown box.",
									"List of filters should be dispalyed in Status dropdown box.", "List of filters dispalyed as : "+typeDropdownvlaues+" in Status dropdown box.");
						}else{
							browser.reportscomtep("Failed", "Verify list of filters dispalyed in Status dropdown box.",
									"List of filters should be dispalyed in Status dropdown box.", "List of filters Not dispalyed in Status dropdown box.");
						}
					}
				} else {
					browser.reportscomtep("Failed", "Verify Status dropdown box is dispalyed ",
							"Status dropdown box should be dispalyed", "Status dropdown box not dispalyed");
				}
			} else {

				browser.reportscomtep("Failed", "Verify MyAppoinments Header is displayed ",
						"MyAppoinments Header should be displayed", "MyAppoinments Header not displayed");
			}
		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}

	/*****************************
	 * TC_3_3_09 Check the upcoming bookings
	 ************************/
	public void check_Upcoming_Bookings() {
		try {
			if (browser.elementisdisplayed(CustomerModule.Customer_MyAppoinments_Header)) {
				browser.reportscomtep("Passed", "Verify MyAppoinments Header is displayed ",
						"MyAppoinments Header should be displayed", "MyAppoinments Header displayed");
				browser.selectByVisibleText(CustomerModule.Customer_MyAppoinments_Type_Dropdown, "Upcoming Appointments");	
				Thread.sleep(10000);
				if (browser.elementisdisplayed(CustomerModule.Customer_UpcomingAppointments_Message)) {
					browser.reportscomtep("Passed", "Verify No Appointments Found message is displayed",
							"No Appointments Found message should be displayed",
							"No Appointments Found message displayed");
				} else {
					browser.reportscomtep("Failed", "Verify No Appointments Found message is displayed",
							"No Appointments Found message should be displayed",
							"No Appointments Found message not displayed");
				}
			} else {
				browser.reportscomtep("Failed", "Verify MyAppoinments Header is displayed ",
						"MyAppoinments Header should be displayed", "MyAppoinments Header not displayed");
			}
		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}

	/***************
	 * TC_3_3_10 Check the past bookings ***************{not Execute}
	 ***/

	public void checkThe_Past_Bookings() {
		try {
			if (browser.elementisdisplayed(CustomerModule.Customer_MyAppoinments_Header)) {
				browser.reportscomtep("Passed", "Verify MyAppoinments Header is displayed ",
						"MyAppoinments Header should be displayed", "MyAppoinments Header displayed");

				browser.selectByVisibleText(CustomerModule.Customer_MyAppoinments_Type_Dropdown, "Past Appointments");	
				
				if (browser.elementisdisplayed(CustomerModule.Customer_PastAppointments_List)) {
					browser.reportscomtep("Passed", "Verify Past Bookings of the list is Displayed",
							"Past Bookings of the listshould be displayed", "Past Bookings of the list  Displayed");
				} else {
					browser.reportscomtep("Failed", "Verify Past Bookings of the list is Displayed",
							"Past Bookings of the listshould be displayed", "Past Bookings of the list not  Displayed");
				}
			} else {
				browser.reportscomtep("Failed", "Verify MyAppoinments Header is displayed ",
						"MyAppoinments Header should be displayed", "MyAppoinments Header not displayed");
			}
		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}

	/********************** TC_3_3_11 Check the Completed bookings ************/

	public void check_Completed_Status_Bookings_AppointmentStatusandPamentStatus() {
		try {
			String appointmentStatus = "";
			String paymentStatus = "";
			String selectedType = "";
			String selectedStatus = "";
					
			boolean completedAppointmentStatustrue = false;
			boolean completedAppointmentStatusfalse = true;
			boolean completedPaymentStatustrue = false;
			boolean completedPaymentStatusfalse = true;
			if (browser.elementisdisplayed(CustomerModule.Customer_MyAppoinments_Header)) {
				browser.reportscomtep("Passed", "Verify MyAppoinments Header is displayed ",
						"MyAppoinments Header should be displayed", "MyAppoinments Header displayed");
				
				browser.selectByVisibleText(CustomerModule.Customer_MyAppoinments_Type_Dropdown, "Past Appointments");
				
				selectedType = browser.getDropdownSelectedValue(CustomerModule.Customer_MyAppoinments_Type_Dropdown);
				if(selectedType.equalsIgnoreCase("Past Appointments")){
					browser.reportscomtep("Passed", "Verify Selected MyAppoinments_Type dropdown value",
							"MyAppoinments_Type dropdown value should be selected", "MyAppoinments_Type dropdown value selected as : "+ selectedType );
				} else {
					browser.reportscomtep("Failed", "Verify Selected MyAppoinments_Type dropdown value",
							"MyAppoinments_Type dropdown value should be selected", "MyAppoinments_Type dropdown value Not selected");
				}	
				
				browser.selectByVisibleText(CustomerModule.Customer_MyAppoinments_Dropdown_Status, "Completed");	
				
				selectedStatus = browser.getDropdownSelectedValue(CustomerModule.Customer_MyAppoinments_Dropdown_Status);
				
				if(selectedStatus.equalsIgnoreCase("Completed")){
					browser.reportscomtep("Passed", "Verify Selected MyAppoinments_Status dropdown value",
							"MyAppoinments_Status dropdown value should be selected", "MyAppoinments_Status dropdown value selected as : "+ selectedStatus );
				} else {
					browser.reportscomtep("Failed", "Verify Selected MyAppoinments_Status dropdown value",
							"MyAppoinments_Status dropdown value should be selected", "MyAppoinments_Status dropdown value Not selected");
				}
				browser.ScrollToXY(0, 250);
				if (CustomerModule.Customer_AppointmentStatus_List.size()>0) {
					for(WebElement appointmentStatuselement : CustomerModule.Customer_AppointmentStatus_List){
						appointmentStatus = browser.getelementtext(appointmentStatuselement);
						System.out.println("AS: "+appointmentStatus);
						if(appointmentStatus.trim().equalsIgnoreCase("Completed")){
							completedAppointmentStatustrue = true;
						}else{
							completedAppointmentStatusfalse = false;
						}
					}
					
					if(completedAppointmentStatustrue && completedAppointmentStatusfalse ){
						browser.reportscomtep("Passed", "Verify AppointmentStatus for the bookings while selecting Status as 'Completed' ",
								"AppointmentStatus should be 'Completed' for the bookings while selecting Status as Completed", "AppointmentStatus displyed as 'Completed'");
					}else{
						browser.reportscomtep("Failed", "Verify AppointmentStatus for the bookings while selecting Status as 'Completed'",
								"AppointmentStatus should be 'Completed' for the bookings while selecting Status as 'Completed'", "AppointmentStatus Not displyed as 'Completed'");
					}									
					
				} else {
					browser.reportscomtep("Failed", "Verify AppointmentStatus for the bookings while selecting Status as 'Completed' ",
								"AppointmentStatus should be 'Completed' for the bookings while selecting Status as 'Completed'", "Booking Records not displayed");
				}
				
				if (CustomerModule.Customer_PaymentStatus_List.size()>0) {
					for(WebElement paymentStatuselement : CustomerModule.Customer_PaymentStatus_List){
						paymentStatus = browser.getelementtext(paymentStatuselement);
						if(paymentStatus.trim().equalsIgnoreCase("Paid")){
							completedPaymentStatustrue = true;
						}else{
							completedPaymentStatusfalse = false;
						}
					}
					
					if(completedPaymentStatustrue && completedPaymentStatusfalse){
						browser.reportscomtep("Passed", "Verify PaymentStatus for the bookings while selecting Status as Completed ",
								"PaymentStatus should be 'Completed' for the bookings while selecting Status as Completed", "PaymentStatus displyed as 'Paid'");
					}else{
						browser.reportscomtep("Failed", "Verify PaymentStatus for the bookings while selecting Status as Completed ",
								"PaymentStatus should be 'Completed' for the bookings while selecting Status as Completed", "PaymentStatus Not displyed as 'Paid'");
					}									
					
				} else {
					browser.reportscomtep("Failed", "Verify PaymentStatus for the bookings while selecting Status as Completed ",
								"PaymentStatus should be 'Completed' for the bookings while selecting Status as Completed", "Booking Records not displayed");
				}
			} else {
				browser.reportscomtep("Failed", "Verify MyAppoinments Header is displayed ",
						"MyAppoinments Header should be displayed", "MyAppoinments Header not displayed");
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}

	/********************* TC_3_3_12 Check the Pending bookings *************/
	public void checkThe_Pending_Bookings_AppointmentStatusandPamentStatus() {
		try {
			String appointmentStatus = "";
			String paymentStatus = "";
			String selectedType = "";
			String selectedStatus = "";
					
			boolean pendingAppointmentStatustrue = false;
			boolean pendingAppointmentStatusfalse = true;
			boolean pendingPaymentStatustrue = false;
			boolean pendingPaymentStatusfalse = true;
			if (browser.elementisdisplayed(CustomerModule.Customer_MyAppoinments_Header)) {
				browser.reportscomtep("Passed", "Verify MyAppoinments Header is displayed ",
						"MyAppoinments Header should be displayed", "MyAppoinments Header displayed");
				
				browser.selectByVisibleText(CustomerModule.Customer_MyAppoinments_Type_Dropdown, "Past Appointments");
				
				selectedType = browser.getDropdownSelectedValue(CustomerModule.Customer_MyAppoinments_Type_Dropdown);
				if(selectedType.equalsIgnoreCase("Past Appointments")){
					browser.reportscomtep("Passed", "Verify Selected MyAppoinments_Type dropdown value",
							"MyAppoinments_Type dropdown value should be selected", "MyAppoinments_Type dropdown value selected as : "+ selectedType );
				} else {
					browser.reportscomtep("Failed", "Verify Selected MyAppoinments_Type dropdown value",
							"MyAppoinments_Type dropdown value should be selected", "MyAppoinments_Type dropdown value Not selected");
				}	
				
				browser.selectByVisibleText(CustomerModule.Customer_MyAppoinments_Dropdown_Status, "Pending");	
				
				selectedStatus = browser.getDropdownSelectedValue(CustomerModule.Customer_MyAppoinments_Dropdown_Status);
				
				if(selectedStatus.equalsIgnoreCase("Pending")){
					browser.reportscomtep("Passed", "Verify Selected MyAppoinments_Status dropdown value",
							"MyAppoinments_Status dropdown value should be selected", "MyAppoinments_Status dropdown value selected as : "+ selectedStatus );
				} else {
					browser.reportscomtep("Failed", "Verify Selected MyAppoinments_Status dropdown value",
							"MyAppoinments_Status dropdown value should be selected", "MyAppoinments_Status dropdown value Not selected");
				}
				browser.ScrollToXY(0, 250);
				if (CustomerModule.Customer_AppointmentStatus_List.size()>0) {
					for(WebElement appointmentStatuselement : CustomerModule.Customer_AppointmentStatus_List){
						appointmentStatus = browser.getelementtext(appointmentStatuselement);
						System.out.println("AS: "+appointmentStatus);
						if(appointmentStatus.trim().equalsIgnoreCase("New") || appointmentStatus.trim().equalsIgnoreCase("Canceled") || appointmentStatus.trim().equalsIgnoreCase("")){
							pendingAppointmentStatustrue = true;
						}else if(appointmentStatus.equalsIgnoreCase("Completed")){
							pendingAppointmentStatusfalse = false;
						}
					}
					
					if(pendingAppointmentStatustrue && pendingAppointmentStatusfalse){
						browser.reportscomtep("Passed", "Verify AppointmentStatus for the bookings while selecting Status as 'Pending' ",
								"AppointmentStatus should be 'Canceled or New' for the bookings while selecting Status as 'Pending'", "AppointmentStatus displyed as 'New or Canceled'");
					}else{
						browser.reportscomtep("Failed", "Verify AppointmentStatus for the bookings while selecting Status as 'Pending' ",
								"AppointmentStatus should be 'Canceled or New' for the bookings while selecting Status as 'Pending'", "AppointmentStatus Not displyed as 'New or Canceled'");
					}									
					
				} else {
					browser.reportscomtep("Failed", "Verify AppointmentStatus for the bookings while selecting Status as 'Pending' ",
								"AppointmentStatus should be 'Canceled or New' for the bookings while selecting Status as 'Pending'", "Booking Records not displayed");
				}
				
				if (CustomerModule.Customer_PaymentStatus_List.size()>0) {
					for(WebElement paymentStatuselement : CustomerModule.Customer_PaymentStatus_List){
						paymentStatus = browser.getelementtext(paymentStatuselement);
						if(paymentStatus.trim().equalsIgnoreCase("Pending") || paymentStatus.trim().equalsIgnoreCase("Canceled") || paymentStatus.trim().equalsIgnoreCase("")){
							pendingPaymentStatustrue = true;
						}else if(paymentStatus.equalsIgnoreCase("Completed")){
							pendingPaymentStatusfalse = false;
						}
					}
					
					if(pendingPaymentStatustrue && pendingPaymentStatusfalse ){
						browser.reportscomtep("Passed", "Verify PaymentStatus for the bookings while selecting Status as 'Pending' ",
								"PaymentStatus should be 'Pending or Canceled' for the bookings while selecting Status as 'Pending'", "PaymentStatus displyed as 'Pending or Canceled" );
					}else{
						browser.reportscomtep("Failed", "Verify PaymentStatus for the bookings while selecting Status as 'Pending' ",
								"PaymentStatus should be 'Pending or Canceled' for the bookings while selecting Status as 'Pending'", "PaymentStatus Not displyed as 'Pending or Canceled" );
					}					
					
				} else {
					browser.reportscomtep("Failed", "Verify PaymentStatus for the bookings while selecting Status as 'Pending' ",
							"PaymentStatus should be 'Pending or Canceled' for the bookings while selecting Status as 'Pending'", "Booking Records not displayed");
				}
			} else {
				browser.reportscomtep("Failed", "Verify MyAppoinments Header is displayed ",
						"MyAppoinments Header should be displayed", "MyAppoinments Header not displayed");
			}
		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}

	/********************* TC_3_3_12 Check the canceled bookings *************/
	public void checkThe_Canceled_Bookings_AppointmentStatusandPamentStatus() {
		try {
			String appointmentStatus = "";
			String paymentStatus = "";
			String selectedType = "";
			String selectedStatus = "";
					
			boolean canceledAppointmentStatustrue = false;
			boolean canceledAppointmentStatusfalse = true;
			boolean canceledPaymentStatustrue = false;
			boolean canceledPaymentStatusfalse = true;
			if (browser.elementisdisplayed(CustomerModule.Customer_MyAppoinments_Header)) {
				browser.reportscomtep("Passed", "Verify MyAppoinments Header is displayed ",
						"MyAppoinments Header should be displayed", "MyAppoinments Header displayed");
				
				browser.selectByVisibleText(CustomerModule.Customer_MyAppoinments_Type_Dropdown, "Past Appointments");
				
				selectedType = browser.getDropdownSelectedValue(CustomerModule.Customer_MyAppoinments_Type_Dropdown);
				if(selectedType.equalsIgnoreCase("Past Appointments")){
					browser.reportscomtep("Passed", "Verify Selected MyAppoinments_Type dropdown value",
							"MyAppoinments_Type dropdown value should be selected", "MyAppoinments_Type dropdown value selected as : "+ selectedType );
				} else {
					browser.reportscomtep("Failed", "Verify Selected MyAppoinments_Type dropdown value",
							"MyAppoinments_Type dropdown value should be selected", "MyAppoinments_Type dropdown value Not selected");
				}	
				
				browser.selectByVisibleText(CustomerModule.Customer_MyAppoinments_Dropdown_Status, "Pending");	
				
				selectedStatus = browser.getDropdownSelectedValue(CustomerModule.Customer_MyAppoinments_Dropdown_Status);
				
				if(selectedStatus.equalsIgnoreCase("Pending")){
					browser.reportscomtep("Passed", "Verify Selected MyAppoinments_Status dropdown value",
							"MyAppoinments_Status dropdown value should be selected", "MyAppoinments_Status dropdown value selected as : "+ selectedStatus );
				} else {
					browser.reportscomtep("Failed", "Verify Selected MyAppoinments_Status dropdown value",
							"MyAppoinments_Status dropdown value should be selected", "MyAppoinments_Status dropdown value Not selected");
				}
				browser.ScrollToXY(0, 250);
				if (CustomerModule.Customer_AppointmentStatus_List.size()>0) {
					for(WebElement appointmentStatuselement : CustomerModule.Customer_AppointmentStatus_List){
						appointmentStatus = browser.getelementtext(appointmentStatuselement);
						System.out.println("AS: "+appointmentStatus);
						if(appointmentStatus.trim().equalsIgnoreCase("New") || appointmentStatus.trim().equalsIgnoreCase("Canceled") || appointmentStatus.trim().equalsIgnoreCase("")){
							canceledAppointmentStatustrue = true;
						}else if(appointmentStatus.equalsIgnoreCase("Completed")){
							canceledAppointmentStatusfalse = false;
						}
					}
					
					if(canceledAppointmentStatustrue && canceledAppointmentStatusfalse){
						browser.reportscomtep("Passed", "Verify AppointmentStatus for the bookings while selecting Status as 'Pending' ",
								"AppointmentStatus should be 'Canceled or New' for the bookings while selecting Status as 'Pending'", "AppointmentStatus displyed as 'New or Canceled'");
					}else{
						browser.reportscomtep("Failed", "Verify AppointmentStatus for the bookings while selecting Status as 'Pending' ",
								"AppointmentStatus should be 'Canceled or New' for the bookings while selecting Status as 'Pending'", "AppointmentStatus Not displyed as 'New or Canceled'");
					}									
					
				} else {
					browser.reportscomtep("Failed", "Verify AppointmentStatus for the bookings while selecting Status as 'Pending' ",
								"AppointmentStatus should be 'Canceled or New' for the bookings while selecting Status as 'Pending'", "Booking Records not displayed");
				}
				
				if (CustomerModule.Customer_PaymentStatus_List.size()>0) {
					for(WebElement paymentStatuselement : CustomerModule.Customer_PaymentStatus_List){
						paymentStatus = browser.getelementtext(paymentStatuselement);
						if(paymentStatus.trim().equalsIgnoreCase("Pending") || paymentStatus.trim().equalsIgnoreCase("Canceled") || paymentStatus.trim().equalsIgnoreCase("")){
							canceledPaymentStatustrue = true;
						}else if(paymentStatus.equalsIgnoreCase("Completed")){
							canceledPaymentStatusfalse = false;
						}
					}
					
					if(canceledPaymentStatustrue && canceledPaymentStatusfalse ){
						browser.reportscomtep("Passed", "Verify PaymentStatus for the bookings while selecting Status as 'Pending' ",
								"PaymentStatus should be 'Pending or Canceled' for the bookings while selecting Status as 'Pending'", "PaymentStatus displyed as 'Pending or Canceled" );
					}else{
						browser.reportscomtep("Failed", "Verify PaymentStatus for the bookings while selecting Status as 'Pending' ",
								"PaymentStatus should be 'Pending or Canceled' for the bookings while selecting Status as 'Pending'", "PaymentStatus Not displyed as 'Pending or Canceled" );
					}					
					
				} else {
					browser.reportscomtep("Failed", "Verify PaymentStatus for the bookings while selecting Status as 'Pending' ",
							"PaymentStatus should be 'Pending or Canceled' for the bookings while selecting Status as 'Pending'", "Booking Records not displayed");
				}
			} else {
				browser.reportscomtep("Failed", "Verify MyAppoinments Header is displayed ",
						"MyAppoinments Header should be displayed", "MyAppoinments Header not displayed");
			}
		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}

	/*********************
	 * TC_3_3_13 Check the Canceled bookings
	 *********************/

	public void checkThe_Canceled_Bookings() {
		try {
			//WebElement Status = driver.findElement(By.xpath("//*[@ng-model='appointment_status']"));
			Select Canceled = new Select(CustomerModule.Customer_MyAppoinments_Dropdown_Status);
			Canceled.selectByValue("canceled");
			Thread.sleep(3000);
			if (browser.elementisdisplayed(CustomerModule.Customer_PastAppointments_List)) {
				browser.reportscomtep("Passed", "","", "");
				Thread.sleep(3000);
			} else {
				browser.reportscomtep("Failed", "","","");
			}
		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	
	
/*************************Check whether My Account button is clickable	*************/
public void shearCircle_Verify_Customer_Myaccount_Buttonis_Clickable(String myAccountLinkName) {
	
	try {

		if (browser.elementisdisplayed(CustomerModule.Customer_Mydashboard_MyAccount_Button)) {		
			browser.reportscomtep("Passed", "Verify My Account Button is displayed in MyDashboard page",
					"My Account Button should be displayed in MyDashboard page", "My Account Button displayed in MyDashboard page");
			browser.click(CustomerModule.Customer_Mydashboard_MyAccount_Button);
			browser.Verify_elementisdisplayed_Report(CustomerModule.Customer_Mydashboard_Welcome_Name_Header, "Mydashboard HeaderName");
			switch(myAccountLinkName){
				case "My Favorites":						
					browser.click(CustomerModule.Customer_MyFavourites_Button);
					browser.Verify_elementisdisplayed_Report(
							CustomerModule.Customer_Myfavourites_Header, "MyFavourites Header");
					break;
				case "My Appointments":					
					browser.click(CustomerModule.Customer_MyAppoinments_Link);
					browser.Verify_elementisdisplayed_Report(
								CustomerModule.Customer_MyAppoinments_Header, "MyAppoinments Header");
					break;
				case "Settings":				
					browser.click(CustomerModule.Customer_Settings_Link);
					browser.Verify_elementisdisplayed_Report(
								CustomerModule.Customer_Settings_Header, "Mysettings Header");
					break;
			}
			
		
		} else {
			browser.reportscomtep("Failed", "Verify My Account Button is displayed in MyDashboard page",
					"My Account Button should be displayed in MyDashboard page", "My Account Button is not displayed in MyDashboard page");
		}
	}catch(Exception e){
		System.out.println("Error description: " + e.getStackTrace() );
	}			
 }

/******************TC_3_4_02 Check if the Cancel button is clickable*************/

public void check_CancelButton_IsClickable() {
	try {
		
			browser.click(CustomerModule.Customer_Mydashboard_Settings_Button);
			if (browser.elementisdisplayed(CustomerModule.Customer_Settings_Header)) {
				browser.reportscomtep("Passed", "Verify Settings header is displayed",
						"Settings header should be displayed", "Settings header  displayed");
				browser.ScrollToXY(0,250);
				browser.click(CustomerModule.Customer_Mydashboard_settings_cancel);
				if (browser.elementisdisplayed(CustomerModule.Customer_Mydashboard_Welcome_Name_Header)) {
					browser.reportscomtep("Passed", "Click on Cancel button and Verify Settings page Return to My Dashboard page",
							"Settings page should be Return to My Dashboard page",
							"Settings page Return to My Dashboard page");
				} else {
					browser.reportscomtep("Failed", "Click on Cancel button and Verify Settings page Return to My Dashboard page",
							"Settings page should be Return to My Dashboard page",
							"Settings page Not Return to My Dashboard page");
				}
			} else {
				browser.reportscomtep("Failed", "Verify Settings header is displayed",
						"Settings header should be displayed", "Settings header not displayed");
				}
		
	} catch (Exception e) {
		System.out.println("Error description: " + e.getStackTrace());

	}
}

/*********TC_3_4_03	Check the field validation******************/

public void check_SettingsPageField_Validation_withInvaliddata() {
	String customerFirstName = null;
	String customerLastName = null;
	String customerMobileNo = null;
	String customerAddress = null;
	String customerCity = null;
	String customerZipCode = null;
	String customerState = "";
	try {
		customerFirstName = browser.getdata("settings_InvalidFirstName");
		customerLastName = browser.getdata("settings_InvalidLastName");
		customerMobileNo = browser.getdata("settings_InvalidMobileNo");
		customerAddress = browser.getdata("settings_InvalidAddress");
		customerCity = browser.getdata("settings_InvalidCity");
		customerZipCode = browser.getdata("settings_InvalidZipCode");
		customerState = browser.getdata("settings_InvalidState");
		
			browser.click(CustomerModule.Customer_Mydashboard_Settings_Button);
			if (browser.elementisdisplayed(CustomerModule.Customer_Settings_Header)) {
				browser.reportscomtep("Passed", "Verify Settings header is displayed",
						"Settings header should be displayed", "Settings header  displayed");
				//browser.clearText(CustomerModule.Customer_Settings_FirstName);
				browser.sendkeys(CustomerModule.Customer_Settings_FirstName, customerFirstName);
				
				//browser.clearText(CustomerModule.Customer_Settings_LastName);
				browser.sendkeys(CustomerModule.Customer_Settings_LastName, customerLastName);
				
				//browser.clearText(CustomerModule.Customer_Mydashboard_settings_Phone);
				browser.sendkeys(CustomerModule.Customer_Mydashboard_settings_Phone, customerMobileNo);				
				
				//browser.clearText(CustomerModule.Customer_Mydashboard_settings_Address);
				browser.sendkeys(CustomerModule.Customer_Mydashboard_settings_Address, customerAddress);
				
				//browser.clearText(CustomerModule.Customer_Mydashboard_settings_city);
				browser.sendkeys(CustomerModule.Customer_Mydashboard_settings_city, customerCity);
												
				browser.ScrollToXY(0, 250);
				
				browser.selectByVisibleText(CustomerModule.Customer_Mydashboard_settings_State, customerState);
				
				//browser.clearText(CustomerModule.Customer_Mydashboard_settings_zipcode);
				browser.sendkeys(CustomerModule.Customer_Mydashboard_settings_zipcode, customerZipCode);							

				browser.click(CustomerModule.Customer_Mydashboard_settings_Update);
				browser.scrollUp(250);
				if (browser.elementisdisplayed(CustomerModule.Customer_ProfileUpdatedSuccessfully_Message)) {
					browser.reportscomtep("Passed",
							"Click on Update button and Verify Profile Updated Successfully message displayed",
							"Profile Updated Successfully message should be displayed",
							"Profile Updated Successfully message displayed");

				} else {
					browser.reportscomtep("Failed",
							"Click on Update button and Verify Profile Updated Successfully message displayed",
							"Profile Updated Successfully message should be displayed",
							"Profile Updated Successfully message displayed");
				}

			} else {
				browser.reportscomtep("Failed", "Verify Settings header is displayed",
						"Verify Settings header should be displayed", "Verify Settings header not displayed");
			}		

	} catch (Exception e) {
		System.out.println("Error description: " + e.getStackTrace());

	}
}

/******TC_3_4_04	Check the mandatory fields**********/


public void check_MandatoryFieldsinSettingsPage() {
	try {		
			browser.click(CustomerModule.Customer_Mydashboard_Settings_Button);
			if (browser.elementisdisplayed(CustomerModule.Customer_Settings_Header)) {
				browser.reportscomtep("Passed", "Verify Settings header is displayed",
						"Settings header should be displayed", "Settings header  displayed");
				browser.clearText(CustomerModule.Customer_Settings_FirstName);
				
				browser.clearText(CustomerModule.Customer_Settings_LastName);				
				
				browser.clearText(CustomerModule.Customer_Mydashboard_settings_Phone);						
				
				browser.clearText(CustomerModule.Customer_Mydashboard_settings_Address);				
				
				browser.clearText(CustomerModule.Customer_Mydashboard_settings_city);				
												
				browser.ScrollToXY(0, 250);			
				
				browser.clearText(CustomerModule.Customer_Mydashboard_settings_zipcode);
				
				browser.click(CustomerModule.Customer_Mydashboard_settings_Update);
				browser.scrollUp(250);
				if (browser.elementisdisplayed(CustomerModule.Customer_PleaseEnterFirstName_ErrorMessage)
						&& browser.elementisdisplayed(CustomerModule.Customer_PleaseEnterLastName_ErrorMessage)) {
					browser.reportscomtep("Passed",
							"Click on Update button with out entering mandatory fields and Verify Please Enter First Name and Last name ErrorMessage is dispalyed ",
							"First Name and Last name ErrorMessage should be dispalyed",
							"Please Enter First Name and Please enter Last name Error Message dispalyed");

				} else {
					browser.reportscomtep("Failed",
							"Click on Update button with out entering mandatory fields and Verify Please Enter First Name and Last name ErrorMessage is dispalyed ",
							"First Name and Last name  ErrorMessage should be dispalyed",
							"Please enter First Name and Please enter Last name  Error Message not dispalyed");
				}
			} else {
				browser.reportscomtep("Failed", "Verify Settings header is displayed",
						"Verify Settings header should be displayed", "Verify Settings header not displayed");
			}		

	} catch (Exception e) {
		System.out.println("Error description: " + e.getStackTrace());

	}
}
/*********TC_3_4_05	Check whether Change Password link is clickable********/
public void checkWhether_ChangePassword_LinkIs_Clickable() {
	try {
		if (browser.elementisdisplayed(CustomerModule.Customer_Settings_Header)) {
			browser.reportscomtep("Passed", "Verify Settings header is displayed",
					"Settings header should be displayed", "Settings header  displayed");
			browser.ScrollToXY(0, 250);
			browser.click(CustomerModule.Customer_ChangePassword_Link);
			if (browser.elementisdisplayed(CustomerModule.Customer_SecureYourProfileByChangingPassword_Header)) {
				browser.reportscomtep("Passed",
						"Click change password link and Verify settings page redirects to change password page displayed.",
						" Settings page should be redirects to change password page displayed.",
						" Settings page Redirects to change password page displayed.");
			} else {
				browser.reportscomtep("Failed",
						"Click change password link and Verify settings page redirects to change password page displayed.",
						" Settings page should be redirects to change password page displayed.",
						" Settings page Not Redirects to change password page displayed.");
			}
		} else {
			browser.reportscomtep("Failed", "Verify Settings header is displayed",
					"Verify Settings header should be displayed", "Verify Settings header not displayed");
		}

	} catch (Exception e) {
		System.out.println("Error description: " + e.getStackTrace());

	}
}

/**********TC_3_4_06	Check whether the password can be updated without entering any data***********/

	public void check_WhetherThePassword_CanbeUpdated_WithOut_EnteringAnyData() {
		try {
			if (browser.elementisdisplayed(CustomerModule.Customer_SecureYourProfileByChangingPassword_Header)) {
				browser.reportscomtep("Passed", "Verify Secure Your Profile by Changing Password Header is displayed ",
						"Secure Your Profile by Changing Password Header should be displayed",
						"Secure Your Profile by Changing Password Header displayed");
				browser.click(CustomerModule.Customer_Profile_ChangingPassword_Update_Button);
				if (browser.elementisdisplayed(CustomerModule.Customer_Oldpassword_Errormessage) && browser.elementisdisplayed(CustomerModule.Customer_Newpassword_Errormessage)) {
					browser.reportscomtep("Passed", "Click on Update button and Verify Current Password and New Password validation messages is displayed",
							"Current Password and New Password validation messages should be displayed",
							"Please enter Current Password and Please enter New Password validation messages is displayed");
				} else {
					browser.reportscomtep("Failed", "Click on Update button and Verify Current Password and New Password validation messages is displayed",
							"Current Password and New Password validation messages should be displayed",
							"Please enter Current Password and Please enter New Password validation messages Not displayed");					
				}
				
				browser.refreshBrowser(driver);	
				browser.explicitWaitUsingElementToBeClickable(CustomerModule.Customer_Profile_ChangingPassword_Update_Button);
			} else {
				browser.reportscomtep("Failed", "Verify Secure Your Profile by Changing Password Header is displayed ",
						"Secure Your Profile by Changing Password Header should be displayed",
						"Secure Your Profile by Changing Password Header not displayed");
			}
			
		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());

		}
	}

	/***********TC_3_4_07	Check whether the password can be updated by entering new password less than 6 characters/spaces******/
	
	public void enteringNew_PasswordLessThan_SixCharacters_Or_Spaces(String p_in_FinalAction) {
		String CustomerCurrentPassword = null;
		String newPwdLessThan6chars = null;
		String newPasswordWithspaces = null;
		try {
			CustomerCurrentPassword = browser.getdata("CustomerOldPassword");
			newPwdLessThan6chars = browser.getdata("CustomerNewPwdLessThan6chars");
			newPasswordWithspaces = browser.getdata("CustomerNewPasswordWithspaces");
			
			if (browser.elementisdisplayed(CustomerModule.Customer_SecureYourProfileByChangingPassword_Header)) {
				browser.reportscomtep("Passed", "Verify Secure Your Profile by Changing Password Header is displayed ",
				"Secure Your Profile by Changing Password Header should be displayed",
				"Secure Your Profile by Changing Password Header displayed");
				browser.sendkeys(CustomerModule.Customer_CurrentPassword_TextBox, CustomerCurrentPassword);
				switch (p_in_FinalAction) {
				case "Enter_NewPwdLessThan6chars":
					browser.sendkeys(CustomerModule.Customer_NewPassword_TextBox, newPwdLessThan6chars);
					CustomerModule.Customer_ReEnterPassword_textbox.click();
					if (browser.elementisdisplayed(CustomerModule.Customer_Pwd_Minimum6letters_ErrorMessage)) {
						browser.reportscomtep("Passed",
								"Enter new Password less than 6 chars and Verify new Password validation message is dispalyed.",
								"New Password validation message is dispalyed.",
								"Password Lenght should be minimum 6 letters validation message dispalyed");
					} else {
						browser.reportscomtep("Failed",
								"Enter new Password less than 6 chars and Verify new Password validation message is dispalyed.",
								"New Password validation message is dispalyed.",
								"Password Lenght should be minimum 6 letters validation message Not dispalyed");
		
					}
					break;
				case "Enter_NewPwddWithspaces":
					browser.sendkeys(CustomerModule.Customer_NewPassword_TextBox, newPasswordWithspaces);
					CustomerModule.Customer_ReEnterPassword_textbox.click();
					if (browser.elementisdisplayed(CustomerModule.Customer_Pwd_SpacePlease_ErrorMessage)) {
						browser.reportscomtep("Passed",
								"Enter new Password including spaces and Verify new Password validation message is dispalyed.",
								"New Password validation message is dispalyed.",
								"No white space please validation message dispalyed");
					} else {
						browser.reportscomtep("Failed",
								"Enter new Password including spaces and Verify new Password validation message is dispalyed.",
								"New Password validation message is dispalyed.",
								"No white space please validation message Not dispalyed");
					}
				}
				browser.refreshBrowser(driver);	
				browser.explicitWaitUsingElementToBeClickable(CustomerModule.Customer_Profile_ChangingPassword_Update_Button);

	} else {
		browser.reportscomtep("Failed", "Verify Secure Your Profile by Changing Password Header is displayed ",
				"Secure Your Profile by Changing Password Header should be displayed",
				"Secure Your Profile by Changing Password Header not displayed");
	}

} catch (Exception e) {
	System.out.println("Error description: " + e.getStackTrace());

}
}
	
	/***********TC_3_4_08	Check whether password can be updated by entering valid data**************/
	public void password_CanBeUpdatedBy_Entering_ValidData() {
		String CustomerOldPassword = null;
		String CustomerNewPassword = null;
		String CustomerRetypePassword = null;
		try {
			CustomerOldPassword = browser.getdata("CustomerOldPassword");
			CustomerNewPassword = browser.getdata("CustomerNewPassword");
			CustomerRetypePassword = browser.getdata("CustomerRetypePassword");
			if (browser.elementisdisplayed(CustomerModule.Customer_SecureYourProfileByChangingPassword_Header)) {
				browser.reportscomtep("Passed", "Verify Secure Your Profile by Changing Password Header is displayed ",
						"Secure Your Profile by Changing Password Header should be displayed",
						"Secure Your Profile by Changing Password Header displayed");				
				browser.sendkeys(CustomerModule.Customer_CurrentPassword_TextBox, CustomerOldPassword);
				browser.sendkeys(CustomerModule.Customer_NewPassword_TextBox, CustomerNewPassword);
				browser.sendkeys(CustomerModule.Customer_ReEnterPassword_textbox, CustomerRetypePassword);
				browser.click(CustomerModule.Customer_Profile_ChangingPassword_Update_Button);
				if (browser.elementisdisplayed(CustomerModule.Customer_PasswordUpdatedSuccessfully_Message)) {
					browser.reportscomtep("Passed", "Verify Password Updated Successfully Message is displayed",
							"Password Updated Successfully Message should be displayed",
							"Password Updated Successfully Message displayed");
				} else {
					browser.reportscomtep("Failed", "Verify Password Updated Successfully Message is displayed",
							"Password Updated Successfully Message should be displayed",
							"Password Updated Successfully Message not displayed");
				}
			} else {
				browser.reportscomtep("Failed", "Verify Secure Your Profile by Changing Password Header is displayed ",
						"Secure Your Profile by Changing Password Header should be displayed",
						"Secure Your Profile by Changing Password Header not displayed");
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());

		}
	}
	
	/**TC_3_4_09	Check whether the Cancel button is clickable and Redirects to My DDashboard***/
     

	public void verify_Cancel_Button_IsClickable_Changepasswordpage() {
		
	try {

		if (browser.elementisdisplayed(CustomerModule.Customer_ChangingPassword_Cancel_Button)) {		
			browser.reportscomtep("Passed", "Verify Cancel Button is displayed in Profile by changing password page",
					"Cancel Button should be displayed in Profile by changing password page", "Cancel Button is displayed in Profile by changing password page");
			browser.click(CustomerModule.Customer_ChangingPassword_Cancel_Button);
					
			if (browser.elementisdisplayed(CustomerModule.Customer_Mydashboard_Welcome_Name_Header)) {
				browser.reportscomtep("Passed", "Click Cancel button and verify Change Password page Return to My Dashboard",
						"Change Password page should be Return to My Dashboard",
						"Change Password page Return to My Dashboard");
			} else {
				browser.reportscomtep("Failed", "Click Cancel button and verify Change Password page Return to My Dashboard",
						"Change Password page should be Return to My Dashboard",
						"Change Password page Not Return to My Dashboard");
			}
						
		} else {
					
			browser.reportscomtep("Failed", "Verify Cancel Button is displayed in  your Profile by changing password page",
					"Cancel Button should be displayed in Profile by changing password page", "Cancel Button is not displayed in Profile by changing password page");
		}
	}catch(Exception e){
		System.out.println("Error description: " + e.getStackTrace() );
	}			
	}
	
	public void verify_PrepopulatedvaluesinSettingspage() {
		
		try {
			String firstName = "";
			String lastName = "";
			String emailId = "";
			String address = "";
			String city = "";
			String state = "";
			String country = "";
			String mobile = "";
			boolean gemderisslection = false;
			String zipCode = "";
			String birthMonth = "";
			String birthDay = "";
			String expctEmailID = "";
			
			expctEmailID = browser.getdata("CustomerValidEmail");
			browser.waitforelementtobevisible(CustomerModule.Customer_Mydashboard_Settings_Button, 20);		
			browser.click(CustomerModule.Customer_Mydashboard_Settings_Button);
			if (browser.elementisdisplayed(CustomerModule.Customer_Mydashboard_settings_header)) {		
				browser.reportscomtep("Passed", "Verify Settings header is displayed",
						"Settings header should be displayed", "Settings header displayed");
				
				firstName = browser.elementgetAttributevalue(CustomerModule.Customer_Settings_FirstName, "value");
				lastName = browser.elementgetAttributevalue(CustomerModule.Customer_Settings_LastName, "value");
				if(firstName!="" && lastName!=""){
					browser.reportscomtep("Passed", "Verify Prepopulated FirstName and LastName is displayed",
							"Prepopulated FirstName and LastName should be displayed", "Prepopulated FirstName :" + firstName +" and LastName : "+lastName +" displayed" );
				}else{
					browser.reportscomtep("Failed", "Verify Prepopulated FirstName and LastName is displayed",
							"Prepopulated FirstName and LastName should be displayed", "Prepopulated FirstName and LastName not displayed" );
				}
				
				emailId = browser.elementgetAttributevalue(CustomerModule.Customer_Settings_Email, "value");				
				if(emailId.trim().equalsIgnoreCase(expctEmailID)){
					browser.reportscomtep("Passed", "Verify Prepopulated Registered EmailID is displayed",
							"Prepopulated Registered EmailID should be displayed", "Prepopulated Registered EmailID :" + emailId +" displayed" );
				}else{
					browser.reportscomtep("Failed", "Verify Prepopulated Registered EmailID is displayed",
							"Prepopulated Registered EmailID should be displayed", "Prepopulated Registred EmailID not displayed" );
				}
				
				mobile = browser.elementgetAttributevalue(CustomerModule.Customer_Mydashboard_settings_Phone, "value");				
				if(mobile.trim()==""){
					browser.reportscomtep("Passed", "Verify Prepopulated Registered mobile is displayed",
							"Prepopulated Registered mobile should be displayed", "Prepopulated Registered mobile not displayed as expected if previously not added" );
				}else if(mobile.trim()!="" ){
					browser.reportscomtep("Passed", "Verify Prepopulated Registered mobile is displayed",
							"Prepopulated Registered mobile should be displayed", "Prepopulated Registered mobile :" + mobile +" displayed as expected if previously added" );
				}else{	
					browser.reportscomtep("Failed", "Verify Prepopulated Registered mobile is displayed",
							"Prepopulated Registered mobile should be displayed", "Mobile field having error" );
				}
				String genderType = "";
				if(CustomerModule.Customer_Settings_Gender_Male.isSelected()){
					genderType = browser.elementgetAttributevalue(CustomerModule.Customer_Settings_Gender_Male, "value");
					gemderisslection = true;
				}else if(CustomerModule.Customer_Settings_Gender_Female.isSelected()){
					genderType = browser.elementgetAttributevalue(CustomerModule.Customer_Settings_Gender_Female, "value");
					gemderisslection = true;
				}
			
				if(gemderisslection){
					browser.reportscomtep("Passed", "Verify PreSelected Gender.",
							"Gender should be preselected", "PreSelected Gender is: " + genderType);
				}else{
					browser.reportscomtep("Failed", "Verify PreSelected Gender.",
							"Gender should be preselected", "No PreSelected Gender");					
				}	
				
				browser.ScrollToElementBottom(CustomerModule.Customer_Mydashboard_settings_Update);
				
				address = browser.elementgetAttributevalue(CustomerModule.Customer_Mydashboard_settings_Address, "value");				
				if(address.trim()==""){
					browser.reportscomtep("Passed", "Verify Prepopulated address is displayed",
							"Prepopulated address should be displayed", "Prepopulated address not displayed as expected if previously not added" );
				}else if(address.trim()!="" ){
					browser.reportscomtep("Passed", "Verify Prepopulated address is displayed",
							"Prepopulated address should be displayed", "Prepopulated address :" + address +" displayed as expected if previously added" );
				}else{	
					browser.reportscomtep("Failed", "Verify Prepopulated address is displayed",
							"Prepopulated address should be displayed", "Address field having error" );
				}
				
				city = browser.elementgetAttributevalue(CustomerModule.Customer_Mydashboard_settings_city, "value");				
				if(city.trim()==""){
					browser.reportscomtep("Passed", "Verify Prepopulated City is displayed",
							"Prepopulated City should be displayed", "Prepopulated City not displayed as expected if previously not added" );
				}else if(city.trim()!="" ){
					browser.reportscomtep("Passed", "Verify Prepopulated City is displayed",
							"Prepopulated City should be displayed", "Prepopulated City :" + city +" displayed as expected if previously added" );
				}else{	
					browser.reportscomtep("Failed", "Verify Prepopulated City is displayed",
							"Prepopulated City should be displayed", "City field having error" );
				}				
				
				state = browser.getDropdownSelectedValue(CustomerModule.Customer_Mydashboard_settings_State);				
				if(state.trim()==""){
					browser.reportscomtep("Passed", "Verify PreSelected State is displayed",
							"PreSelected State should be displayed", "PreSelected State not displayed as expected if previously not Selected");
				}else if(state.trim()!="" ){
					browser.reportscomtep("Passed", "Verify PreSelected State is displayed",
							"PreSelected State should be displayed", "PreSelected State :" + state +" displayed as expected if previously Selected");
				}else{	
					browser.reportscomtep("Failed", "Verify PreSelected State is displayed",
							"PreSelected State should be displayed", "State field having error");
				}
				
				country = browser.getDropdownSelectedValue(CustomerModule.Customer_Mydashboard_settings_State);				
				if(country.trim()==""){
					browser.reportscomtep("Passed", "Verify PreSelected Country is displayed",
							"PreSelected Country should be displayed", "PreSelected Country not displayed as expected if previously not Selected");
				}else if(country.trim()!="" ){
					browser.reportscomtep("Passed", "Verify PreSelected Country is displayed",
							"PreSelected Country should be displayed", "PreSelected Country :" + country +" displayed as expected if previously Selected");
				}else{	
					browser.reportscomtep("Failed", "Verify PreSelected Country is displayed",
							"PreSelected Country should be displayed", "Country field having error");
				}
				
				birthMonth = browser.getDropdownSelectedValue(CustomerModule.Customer_Mydashboard_settings_Birthday_Month);				
				if(birthMonth.trim()==""){
					browser.reportscomtep("Passed", "Verify PreSelected Birth Month is displayed",
							"PreSelected Birth Month should be displayed", "PreSelected Birth Month not displayed as expected if previously not Selected");
				}else if(birthMonth.trim()!="" ){
					browser.reportscomtep("Passed", "Verify PreSelected Birth Month is displayed",
							"PreSelected Birth Month should be displayed", "PreSelected Birth Month :" + birthMonth +" displayed as expected if previously Selected");
				}else{	
					browser.reportscomtep("Failed", "Verify PreSelected Birth Month is displayed",
							"PreSelected Birth Month should be displayed", "Birth Month field having error");
				}
				
				birthDay = browser.getDropdownSelectedValue(CustomerModule.Customer_Mydashboard_settings_Birthday_date);				
				if(birthDay.trim()==""){
					browser.reportscomtep("Passed", "Verify PreSelected Birth Day is displayed",
							"PreSelected Birth Day should be displayed", "PreSelected Birth Day not displayed as expected if previously not Selected");
				}else if(birthDay.trim()!="" ){
					browser.reportscomtep("Passed", "Verify PreSelected Birth Day is displayed",
							"PreSelected Birth Day should be displayed", "PreSelected Birth Day :" + birthDay +" displayed as expected if previously Selected");
				}else{	
					browser.reportscomtep("Failed", "Verify PreSelected Birth Day is displayed",
							"PreSelected Birth Day should be displayed", "Birth Month field having error");
				}				
				zipCode = browser.elementgetAttributevalue(CustomerModule.Customer_Mydashboard_settings_zipcode, "value");				
				if(zipCode.trim()==""){
					browser.reportscomtep("Passed", "Verify Prepopulated ZipCode is displayed",
							"Prepopulated ZipCode should be displayed", "Prepopulated ZipCode not displayed as expected if previously not added" );
				}else if(zipCode.trim()!="" ){
					browser.reportscomtep("Passed", "Verify Prepopulated ZipCode is displayed",
							"Prepopulated ZipCode should be displayed", "Prepopulated ZipCode :" + zipCode +" displayed as expected if previously added" );
				}else{	
					browser.reportscomtep("Failed", "Verify Prepopulated ZipCode is displayed",
							"Prepopulated ZipCode should be displayed", "ZipCode field having error" );
				}	
				
				browser.Verify_elementisdisplayed_Report(CustomerModule.Customer_Mydashboard_settings_changepassword_lynk, "Click here to change password Link");
				
				browser.Verify_elementisdisplayed_Report(CustomerModule.Customer_Mydashboard_settings_Update, "Update Button");
				
				browser.Verify_elementisdisplayed_Report(CustomerModule.Customer_Mydashboard_settings_cancel, "Cancel Button");
				
			} else {
						
				browser.reportscomtep("Failed", "Verify Settings header is displayed",
						"Settings header should be displayed", "Settings header not displayed");
			}
		}catch(Exception e){
			System.out.println("Error description: " + e.getStackTrace() );
		}			
		}
		
	/*****TC_4_1_01	Verify the search box in Home page**********/

	public void verify_SearchBox_inHomePageFieldValidation() {
		try {
			if (browser.elementisdisplayed(CustomerModule.Home_H1_Header)) {
				browser.reportscomtep("Passed", "Verify ShearCircle Home page is displayed",
						"ShearCircle Home page should be displayed", " ShearCircle Home page displayed");
				browser.Verify_elementisdisplayed_Report(CustomerModule.home_FindSalon_Spa_Professionals_Textbox,
						"Salon/Spa/Professionals TextBox");
				browser.Verify_elementisdisplayed_Report(CustomerModule.home_Zip_City_State_Textbox,
						"ZipCode/City,State TextBox");
				browser.Verify_elementisdisplayed_Report(CustomerModule.home_Locate_Button, "Locate Button");
			}else{
				browser.reportscomtep("Failed", "Verify ShearCircle Home page is displayed",
						"ShearCircle Home page should be displayed", " ShearCircle Home page not displayed");
			}	
		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	
	/***************TC_4_1_02	Verify the search box in inner pages************/
	
	public void verify_SearchBoxIn_InnerPage_FieldValidations(String click_login_or_AboutUs) {
		try {
			if (browser.elementisdisplayed(CustomerModule.Home_H1_Header)) {
				
				browser.reportscomtep("Passed", "Verify ShearCircle Home page is displayed",
						"ShearCircle Home page should be displayed", " ShearCircle Home page displayed");

				switch (click_login_or_AboutUs) {
					case "Click_Login":
						browser.click(CustomerModule.Home_Login_Link);	
						browser.reportscomtep("Passed", "Click on Login button", "Login button should be clicked", "Login button clicked");
						
						browser.Verify_elementisdisplayed_Report(CustomerModule.customer_FindSalon_Spa_Professionals_Textbox,
								"Salon/Spa/Professionals TextBox in Login Page");
						browser.Verify_elementisdisplayed_Report(CustomerModule.customer_Zip_City_State_Textbox,
								"ZipCode/City,State TextBox in Login Page");
						browser.Verify_elementisdisplayed_Report(CustomerModule.customer_Search_Button, "Search Button in Login Page");
						browser.click(CustomerModule.Home_ShearCircle_Image);
						break;
					case "Click_AboutUs":
						browser.scrollintoviewelement(CustomerModule.Home_AboutUs_Link);
						browser.click(CustomerModule.Home_AboutUs_Link);
						browser.reportscomtep("Passed", "Click on AboutUs link", "AboutUs link should be clicked", "AboutUs link clicked");
						
						browser.Verify_elementisdisplayed_Report(CustomerModule.home_FindSalon_Spa_Professionals_Textbox,
								"Salon/Spa/Professionals TextBox in AboutUs Page");
						browser.Verify_elementisdisplayed_Report(CustomerModule.home_Zip_City_State_Textbox,
								"ZipCode/City,State TextBox in AboutUs Page");
						browser.Verify_elementisdisplayed_Report(CustomerModule.home_Locate_Button, "Search Button in AboutUs Page");
						browser.click(CustomerModule.Home_ShearCircle_Image);
						break;
				}			
				
			} else {
				browser.reportscomtep("Failed", "Verify ShearCircle Home page is displayed",
						"ShearCircle Home page should be displayed", " ShearCircle Home page not displayed");
			}
		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	
	
	/*****TC_4_1_04	Check the details in Search Results page**********/

	public void verify_searchItems_in_Search_Results_page() {
		try {
			String searchresultcount= "";
			String p_in_filters_list = "Accept Online Payments;Accept Cash On Service;Search Promotions;Search Jobs"; 
			String actFilters_name = "";	
			String actAllFilters= "";
			boolean filtersAvailability = false;
			String Service_names = "";
			String allServiceNames = "";
			int[] ratings_list = {5,4,3,2,1}; 
			String ratings_name ="";
			String allRatings = "";
			boolean ratingssAvailability = false;
			String exptDropdownlist = "Most Viewed;Recently Added";
			String DropdownList="";
			int itemCount=0;
			browser.scrollintoviewelement(CustomerModule.Home_SearchResultsPage_H1_Header);
			if (browser.elementisdisplayed(CustomerModule.Home_SearchResultsPage_H1_Header)) {
				browser.reportscomtep("Passed", "Verify SearchResults Page Header is displayed",
						"SearchResults Page Header should be displayed", "SearchResults Page Header displayed");
				searchresultcount = browser.getelementtext(CustomerModule.home_SearchResults_Message);
				browser.Verify_elementisdisplayed_Report(CustomerModule.home_SearchResults_Message,searchresultcount);
				
				if(CustomerModule.home_SearchResultssalons_firstpage_list.size()>0){
					browser.reportscomtep("Passed", "Verify List of all available Salons in SearchResults Page",
							"List of all available Salons should be displayed in SearchResults Page", "List of all available Salons displayed");
				}else if(CustomerModule.home_SearchResultssalons_firstpage_list.size()==0){
					browser.reportscomtep("Passed", "Verify List of all available Salons in SearchResults Page",
							"List of all available Salons should be displayed in SearchResults Page", "List of all available Salons displayed");
				}else{
					browser.reportscomtep("Failed", "Verify List of all available Salons in SearchResults Page",
							"List of all available Salons should be displayed in SearchResults Page", "List of all available Salons Not displayed");
				}		
				
				List<WebElement> Dropdown_Topmost_PartOfList = browser.getOptions(CustomerModule.SR_DropdownOnTopmostPartOf_List);
				itemCount = Dropdown_Topmost_PartOfList.size();
				if(itemCount>0){
					for(WebElement listvalue:Dropdown_Topmost_PartOfList) {
						DropdownList = DropdownList+";"+listvalue.getText();
						//System.out.println("Dropdown Topmost PartofList:"+DropdownList);
					}
					DropdownList = DropdownList.substring(2);					
				}
				if(DropdownList.equalsIgnoreCase(exptDropdownlist)){					
					DropdownList = DropdownList.replace(";", "\n");
					browser.reportscomtep("Passed", "Verify Topmost part of List Dropdown is displayed",
						"Topmost part of List Dropdown should be displayed",
						"Topmost part of List Dropdown displayed options as :" + DropdownList);
				}else{
					browser.reportscomtep("Failed", "Verify Topmost part of List Dropdown is displayed",
						"Topmost part of List Dropdown should be displayed",
						"Topmost part of List Dropdown displayed options");
				}	
							
				if (CustomerModule.SR_Filters_checkbox_label_list.size() > 0) {
					
						for (WebElement Checkbox : CustomerModule.SR_Filters_checkbox_label_list) {
							actFilters_name = Checkbox.getText();
							if (p_in_filters_list.toLowerCase().contains(actFilters_name.trim().toLowerCase())) {
								filtersAvailability = true;
								actAllFilters = actAllFilters + ";" + actFilters_name;								
							}
						}
					
					actAllFilters = actAllFilters.substring(1);
					if (actAllFilters.equalsIgnoreCase(p_in_filters_list)) {						
						browser.reportscomtep("Passed", "Verify Filters section is displayed with filters",
								"Filters section should be displayed with filters",
								"Filters section is displayed with filters as :" + actAllFilters);
					} else {
						browser.reportscomtep("Failed", "Verify Filters section is displayed with filters",
								"Filters section should be displayed with filters",
								"Filters section Not displayed with filters");
					}
				} else {
					browser.reportscomtep("Failed", "Verify Filters section is displayed with filters",
							"Filters section should be displayed with filters",
							"Filters section Not displayed with filters");
				}		
				
				if(CustomerModule.SR_Filters_checkbox_label_list.size()>0){
					for (WebElement Checkbox : CustomerModule.SR_Filters_checkbox_label_list) {
						Service_names = Checkbox.getText();
						if (Service_names != "") {
							allServiceNames = allServiceNames + "\n" + Service_names;
						}
					}
					
					if (allServiceNames!=""){
						allServiceNames = allServiceNames.substring(1);
						browser.reportscomtep("Passed", "Verify Services section is displayed with Services",
								"Services section  should be displayed with Services", "Services section is displayed with Services as :"+ allServiceNames);
					}else{
						browser.reportscomtep("Failed", "Verify Services section is displayed with Services",
								"Services section should be displayed with Services", "Services section Not displayed with Services");
					}
				}else{
					browser.reportscomtep("Failed", "Verify Services section is displayed with Services",
							"Services section should be displayed with Services", "Services section Not displayed with Services");
				}
				//int i = 1;
				browser.ScrollToElementBottom(CustomerModule.customer_1Rating_checkbox);
				if(CustomerModule.SR_Ratings_checkbox_list.size() > 0){
					/*for (int Ratingscheckbox : ratings_list) {
						for (WebElement Checkbox : CustomerModule.SR_Ratings_checkbox_list) {
							ratings_name = browser.elementgetAttributevalue(Checkbox,"value");							
							if (Ratingscheckbox==Integer.parseInt(ratings_name)) {
								ratingssAvailability = true;
								allRatings = allRatings + "\n" + ratings_name;
								break;								
							}
						}
						if (i ==3){
							break;
						}
						i++;
					}
*/
					//if(ratingssAvailability){
						//allRatings = allRatings.substring(1);
						browser.reportscomtep("Passed", "Verify Ratings Filter section is displayed with Ratings",
								"Ratings Filter section should be displayed with Ratings",
								"Ratings Filter section displayed with Ratings as :" + allRatings);
					}else{
						browser.reportscomtep("Failed", "Verify Ratings Filter section is displayed with Ratings",
								"Ratings Filter section should be displayed with Ratings",
								"Ratings Filter section displayed with Ratings");
					}
				
					
					
					browser.scrollintoviewelement(CustomerModule.customer_PageNavigation_Buttons);
					if(browser.elementisdisplayed(CustomerModule.customer_PageNavigation_Buttons)){
						browser.reportscomtep("Passed",
								"Verify Page navigation buttons at the bottom of the page is dispalyed",
								"Page navigation buttons at the bottom of the page should be dispalyed",
								"Page navigation buttons at the bottom of the page dispalyed");
					}else{
						browser.reportscomtep("Failed",
							"Verify Page navigation buttons at the bottom of the page is dispalyed",
							"Page navigation buttons at the bottom of the page should be dispalyed",
							"Page navigation buttons at the bottom of the page not dispalyed");
						
					}
					//browser.scrollUp(250);
								
					
				//}
				
				browser.click(CustomerModule.Home_ShearCircle_Image);
			}else{
				browser.reportscomtep("Failed", "Verify SearchResults Page Header is displayed",
						"SearchResults Page Header should be displayed", "SearchResults Page Header Not displayed");
			}	
		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	
/**************TC_4_1_03 Check the Locate button************/
	
	public void checkThe_Locate_Button() {
		try {
			browser.click(CustomerModule.Home_ShearCircle_Image);
			if (browser.elementisdisplayed(CustomerModule.Home_H1_Header)) {
				browser.reportscomtep("Passed", "Verify ShearCircle Home page is displayed",
						"ShearCircle Home page should be displayed", " ShearCircle Home page displayed");
				browser.click(CustomerModule.home_Locate_Button);
				if (browser.elementisdisplayed(CustomerModule.home_SearchResults_Message)) {
					browser.reportscomtep("Passed",
							"Click on Locate button without entering any search text and Verify Opens Search Results page is Displayed with all Salons are available",
							"Search Results page should be Displayed with all Salons are available",
							"Search Results page Displayed with all Salons are available");
					
				} else {
					browser.reportscomtep("Failed",
							"Click on Locate button without entering any search text and Verify Opens Search Results page is Displayed with all Salons are available",
							"Search Results page should be Displayed with all Salons are available",
							"Search Results page Not Displayed with all Salons are available");
				}
				
			} else {
				browser.reportscomtep("Failed", "Verify ShearCircle Home page is displayed",
						"ShearCircle Home page should be displayed", " ShearCircle Home page not displayed");
			}
		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	
	/**********TC_4_1_05 Check the search result by entering keyword in Salon/Spa/Professional box -(Name)******/

	public void checkSearchResult_ByEntering_keyword_SalonOrSpaOrProfessional(String click_Locate_Or_SearchIcon, String SalonOrSpaOrProfessional ) {
		try {
			String searchSalon = "";
			String searchSpa = "";
			String searchProfessional = "";
			String searchResults_Salon_Spa_Prof = "";
			String enteredSearchString = "";
			boolean searchResultsavailablity = false;
			searchSalon = browser.getdata("search_Salon");
			searchSpa = browser.getdata("search_Spa");
			searchProfessional = browser.getdata("search_Professional");
			
			browser.click(CustomerModule.Home_ShearCircle_Image);
			if (browser.elementisdisplayed(CustomerModule.Home_H1_Header)) {
				browser.reportscomtep("Passed", "Verify ShearCircle Home page is displayed",
						"ShearCircle Home page should be displayed", " ShearCircle Home page displayed");
				switch (click_Locate_Or_SearchIcon) {
					case "Click_Locate_Button":											
							switch (SalonOrSpaOrProfessional){
								case "Salon":
									browser.sendkeys(CustomerModule.home_FindSalon_Spa_Professionals_Textbox, searchSalon);
									break;
								case "Spa":
									browser.sendkeys(CustomerModule.home_FindSalon_Spa_Professionals_Textbox, searchSpa);
									break;
								case "Professional":
									browser.sendkeys(CustomerModule.home_FindSalon_Spa_Professionals_Textbox, searchProfessional);
									break;
							}						
						browser.click(CustomerModule.home_Locate_Button);						
						break;
					case "Click_SearchIcon":
						browser.click(CustomerModule.Home_Login_Link);
						switch (SalonOrSpaOrProfessional){
							case "Salon":
								browser.sendkeys(CustomerModule.customer_FindSalon_Spa_Professionals_Textbox, searchSalon);
								break;
							case "Spa":
								browser.sendkeys(CustomerModule.customer_FindSalon_Spa_Professionals_Textbox, searchSpa);
								break;
							case "Professional":
							browser.sendkeys(CustomerModule.customer_FindSalon_Spa_Professionals_Textbox, searchProfessional);
							break;
						}
						
						browser.click(CustomerModule.customer_Search_Button);					
						break;
				}			
				
				if(CustomerModule.customer_Search_SalonNames.size()>0){
					for(WebElement listvalue:CustomerModule.customer_Search_SalonNames){
						searchResults_Salon_Spa_Prof = listvalue.getText();					
						switch(SalonOrSpaOrProfessional){
							case "Salon":
								if(searchResults_Salon_Spa_Prof.contains(searchSalon)){
									enteredSearchString = "Salon: "+searchSalon;
									searchResultsavailablity = true;
									break;
								}
								break;
							case "Spa":
								if(searchResults_Salon_Spa_Prof.contains(searchSpa)){
									searchResultsavailablity = true;
									enteredSearchString = "Spa: "+searchSpa; 
									break;
								}
								break;
							case "Professional":
								if(searchResults_Salon_Spa_Prof.contains(searchProfessional)|| searchResults_Salon_Spa_Prof!=""){
									searchResultsavailablity = true;
									enteredSearchString = "Professional: "+searchProfessional;
									break;
								}
							break;
						}					
					}	
				}
				browser.waitforelementtobevisible(CustomerModule.home_SearchResults_Message, 20);
				if (browser.elementisdisplayed(CustomerModule.home_SearchResults_Message) && searchResultsavailablity) {
					browser.reportscomtep("Passed",
							"Enter Salon/Spa/Professional in search text box and click on Locate or Search button and verify Search results page dispalyed results with given keyword",
							"Search results page should be dispalyed results with given keyword",
							"Search results page dispalyed results with given keyword "+ enteredSearchString);
				} else {
					browser.reportscomtep("Failed",
							"Enter Salon/Spa/Professional in search text box and click on Locate or Search button and verify Search results page dispalyed results with given keyword",
							"Search results page should be dispalyed results with given keyword",
							"Search results page Not dispalyed results with given keyword "+ enteredSearchString);
				}
				browser.click(CustomerModule.Home_ShearCircle_Image);
			} else {
				browser.reportscomtep("Failed", "Verify ShearCircle Home page is displayed",
						"ShearCircle Home page should be displayed", " ShearCircle Home page not displayed");
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	
/***TC_4_1_06 Check the search result by entering keyword in ZipCode/City,State*****/
	
	public void ChecksearchresultbyenteringkeywordinZipCode_City_State(String click_Locate_Or_SearchIcon, String zip_City_State) {
		try {
			String searchZipcode = "";
			String searchCity = "";
			String searchState = "";			
			String searchResults_Zipcode_City_State = "";
			String enteredSearchString = "";
			boolean searchResultsavailablity = false;
			
			searchZipcode = browser.getdata("search_Zipcode");
			searchCity = browser.getdata("search_City");
			searchState = browser.getdata("search_State");
			if (browser.elementisdisplayed(CustomerModule.Home_H1_Header)) {
				browser.reportscomtep("Passed", "Verify ShearCircle Home page is displayed",
						"ShearCircle Home page should be displayed", " ShearCircle Home page displayed");
				switch (click_Locate_Or_SearchIcon) {
					case "Click_Locate_Button":						
						switch (zip_City_State){
							case "ZipCode":
								browser.sendkeys(CustomerModule.home_Zip_City_State_Textbox, searchZipcode);
								break;
							case "City":
								browser.sendkeys(CustomerModule.home_Zip_City_State_Textbox, searchCity);
								break;
							case "State":
								browser.sendkeys(CustomerModule.home_Zip_City_State_Textbox, searchState);
							break;
						}
						
						browser.click(CustomerModule.home_Locate_Button);						
						break;
					case "Click_SearchIcon":
						browser.click(CustomerModule.Home_Login_Link);
						switch (zip_City_State){
							case "ZipCode":
								browser.sendkeys(CustomerModule.customer_Zip_City_State_Textbox, searchZipcode);
								break;
							case "City":
								browser.sendkeys(CustomerModule.customer_Zip_City_State_Textbox, searchCity);
								break;
							case "State":
								browser.sendkeys(CustomerModule.customer_Zip_City_State_Textbox, searchState);
								break;
					}
						browser.click(CustomerModule.customer_Search_Button);						
						break;
				}
				
				browser.waitforelementtobevisible(CustomerModule.home_SearchResults_Message, 20);
				int i = 0;
				if(CustomerModule.customer_Search_SalonNames.size()>0){
					for(WebElement listvalue:CustomerModule.customer_Search_SalonNames){						
						searchResults_Zipcode_City_State = CustomerModule.customer_Search_SalonLocatonZipCodes.get(i).getText();
						switch(zip_City_State){
						case "ZipCode":
							if(searchResults_Zipcode_City_State.contains(searchZipcode)){
								enteredSearchString = "ZipCode: "+searchZipcode;
								searchResultsavailablity = true;
								break;
							}
							break;
						case "City":
							if(searchResults_Zipcode_City_State.contains(searchCity)){
								searchResultsavailablity = true;
								enteredSearchString = "City: "+searchCity; 
								break;
							}
							break;
						case "State":
							if(searchResults_Zipcode_City_State.contains(searchState)){
								searchResultsavailablity = true;
								enteredSearchString = "State: "+searchState;
								break;
							}
							break;
						}
						
					}
				}
				
				
				if (browser.elementisdisplayed(CustomerModule.home_SearchResults_Message) && searchResultsavailablity) {
					browser.reportscomtep("Passed",
							"Enter ZipCode/City/State in search text box and click on Locate or search button and verify Search results page dispalyed results with given keyword",
							"Search results page should be dispalyed results with given keyword",
							"Search results page dispalyed results with given keyword "+ enteredSearchString);
				} else {
					browser.reportscomtep("Failed",
							"Enter ZipCode/City/State in search text box and click on Locate or Search button and verify Search results page dispalyed results with given keyword",
							"Search results page should be dispalyed results with given keyword",
							"Search results page Not dispalyed results with given keyword "+ enteredSearchString);
				}
			
				browser.click(CustomerModule.Home_ShearCircle_Image);
			} else {
				browser.reportscomtep("Failed", "Verify ShearCircle Home page is displayed",
						"ShearCircle Home page should be displayed", " ShearCircle Home page not displayed");
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	
/***TC_4_1_07	Check the search result by entering keyword in both Name & Location textboxes*****/
	
	public void checkSearchResult_ByEntering_keyword_InBothNameAndLocation(String click_Locate_Or_SearchIcon) {
		try {
			String SalonOrSpaOrProfessional = "";
			String loacationZipcode = "";
			String actSalonName ="";
			String actZipcode = "";
			boolean salonszicodeavailablity = false;
			SalonOrSpaOrProfessional = browser.getdata("SalonOrSpaOrProfessional");
			loacationZipcode = browser.getdata("LoacationZipcode");
			if (browser.elementisdisplayed(CustomerModule.Home_H1_Header)) {
				browser.reportscomtep("Passed", "Verify ShearCircle Home page is displayed",
						"ShearCircle Home page should be displayed", " ShearCircle Home page displayed");
				switch (click_Locate_Or_SearchIcon) {
					case "Click_Locate_Button":
						browser.sendkeys(CustomerModule.home_FindSalon_Spa_Professionals_Textbox, SalonOrSpaOrProfessional);
						browser.sendkeys(CustomerModule.home_Zip_City_State_Textbox, loacationZipcode);
						browser.click(CustomerModule.home_Locate_Button);						
						break;
					case "Click_SearchIcon":
						browser.click(CustomerModule.Home_Login_Link);
						browser.sendkeys(CustomerModule.home_FindSalon_Spa_Professionals_Textbox, SalonOrSpaOrProfessional);
						browser.sendkeys(CustomerModule.home_Zip_City_State_Textbox, loacationZipcode);
						browser.click(CustomerModule.customer_Search_Button);						
						break;
				}
				
				browser.waitforelementtobevisible(CustomerModule.home_SearchResults_Message, 20);
				int i = 0;
				if(CustomerModule.customer_Search_SalonNames.size()>0){
					for(WebElement listvalue:CustomerModule.customer_Search_SalonNames){
						actSalonName = listvalue.getText();
						actZipcode = CustomerModule.customer_Search_SalonLocatonZipCodes.get(i).getText();
						if(SalonOrSpaOrProfessional.equalsIgnoreCase(actSalonName.trim()) && actZipcode.contains(loacationZipcode)){
							salonszicodeavailablity = true;
							break;
					}
				}
				
				
				if (browser.elementisdisplayed(CustomerModule.home_SearchResults_Message) && salonszicodeavailablity) {
					browser.reportscomtep("Passed",
							"Enter Salon/Spa/Professional, ZipCode/City/State in search text boxes and click on Locate button and verify Search results page dispalyed results with given keyword",
							"Search results page should be dispalyed results with given keyword",
							"Search results page dispalyed results with given keyword "+ SalonOrSpaOrProfessional + "\n" + loacationZipcode);
				} else {
					browser.reportscomtep("Failed",
							"Enter Salon/Spa/Professional, ZipCode/City/State in search text boxes and click on Locate button and verify Search results page dispalyed results with given keyword",
							"Search results page should be dispalyed results with given keyword",
							"Search results page Not dispalyed results with given keyword "+ SalonOrSpaOrProfessional + "\n" + loacationZipcode);
				}
				}
				browser.click(CustomerModule.Home_ShearCircle_Image);
			} else {
				browser.reportscomtep("Failed", "Verify ShearCircle Home page is displayed",
						"ShearCircle Home page should be displayed", " ShearCircle Home page not displayed");
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	
/***TC_4_1_08 Check the results by selecting a sub category from Home page*****/
	
	public void click_HomePage_NavigateBar_Menulinks(String click_Menulink) {
		try {	
			String searchSalon = "";
			String searchSpa = "";
			String searchProfessional = "";
			String searchResults_Salon_Spa_Prof = "";
			String enteredSearchString = "";
			String beautysubCategoryLink = null;
			String wellnesssubCategoryLink = null;
			String fitnesssubCategoryLink = null;
			boolean searchResultsavailablity = false;
			WebElement subcategorylink = null;
			beautysubCategoryLink = browser.getdata("BeautysubCategoryMenuLink");
			wellnesssubCategoryLink = browser.getdata("WellnesssubCategoryMenuLink");
			fitnesssubCategoryLink = browser.getdata("FitnesssubCategoryMenuLink");
			if (browser.elementisdisplayed(CustomerModule.Home_H1_Header)) {
				browser.reportscomtep("Passed", "Verify ShearCircle Home page is displayed",
						"ShearCircle Home page should be displayed", " ShearCircle Home page displayed");
				switch (click_Menulink) {
					case "Click_Beauty":						
						browser.click(CustomerModule.home_Beauty_Link);	
						subcategorylink = browser.getLinkwithLinkText(beautysubCategoryLink);
						browser.reportscomtep("Passed", "Click Beauty menulink and verify subcategory "+ beautysubCategoryLink +" Link is displayed",
								"Subcategory "+ beautysubCategoryLink +" Link should be displayed", "subcategory "+ beautysubCategoryLink +" Link displayed");
						browser.click(subcategorylink);	
						browser.reportscomtep("Passed", "Click Beauty subcategory as "+ beautysubCategoryLink +" Link in ShearCircle Home page",
								"Beauty subcategory as "+ beautysubCategoryLink +" Link should be clicked in ShearCircle Home page", "Clicked Beauty subcategory as "+ beautysubCategoryLink +" Link in ShearCircle Home page");
						break;
					case "Click_Wellness":
						browser.click(CustomerModule.home_Welless_Link);
						subcategorylink = browser.getLinkwithLinkText(wellnesssubCategoryLink);
						browser.reportscomtep("Passed", "Click Wellness menulink and verify subcategory "+ beautysubCategoryLink +" Link is displayed",
								"Subcategory "+ beautysubCategoryLink +" Link should be displayed", "subcategory "+ beautysubCategoryLink +" Link displayed");
						browser.click(subcategorylink);	
						browser.reportscomtep("Passed", "Click Wellness subcategory as "+ wellnesssubCategoryLink +" Link in ShearCircle Home page",
								"Wellness subcategory as "+ wellnesssubCategoryLink +" Link should be clicked in ShearCircle Home page", "Clicked Wellness subcategory as "+ wellnesssubCategoryLink +" Link in ShearCircle Home page");
						break;
					case "Click_Fitness":						
						browser.click(CustomerModule.home_Fitness_Link);
						subcategorylink = browser.getLinkwithLinkText(fitnesssubCategoryLink);
						browser.reportscomtep("Passed", "Click Fitness menulink and verify subcategory "+ beautysubCategoryLink +" Link is displayed",
								"Subcategory "+ beautysubCategoryLink +" Link should be displayed", "subcategory "+ beautysubCategoryLink +" Link displayed");
						browser.click(subcategorylink);	
						browser.reportscomtep("Passed", "Click Fitness subcategory as "+ fitnesssubCategoryLink +" Link in ShearCircle Home page",
								"Fitness subcategory as "+ fitnesssubCategoryLink +" Link should be clicked in ShearCircle Home page", "Clicked Fitness subcategory as "+ fitnesssubCategoryLink +" Link in ShearCircle Home page");
						break;
					/*case "Click_HowItWorks":
						browser.click(CustomerModule.home_Howitworks_Link);	
						browser.reportscomtep("Passed", click_Menulink+"Link in ShearCircle Home page",
								"ShearCircle Home page should be displayed", " ShearCircle Home page displayed");
						break;
					case "Click_Pricing":
						browser.click(CustomerModule.home_Pricing_Link);		
						browser.reportscomtep("Passed", "Click "+click_Menulink+"ShearCircle Home page is displayed",
								"ShearCircle Home page should be displayed", " ShearCircle Home page displayed");
						break;*/
				}			
								
				browser.waitforelementtobevisible(CustomerModule.home_SearchResults_Message, 20);
				if (browser.elementisdisplayed(CustomerModule.home_SearchResults_Message) && CustomerModule.customer_Search_SalonNames.size()>0) {
					browser.reportscomtep("Passed",
							"verify the list of Salons are displayed which provide the selected service/sub category (if available)",
							"The list of Salons should be displayed which provide the selected service/sub category",
							"The list of Salons are displayed which provide the selected service/sub category");
				}else if (browser.elementisdisplayed(CustomerModule.home_NoResultsFound_Message)){	
					browser.reportscomtep("Passed",
							"verify the list of Salons are displayed which provide the selected service/sub category (if available)",
							"The list of Salons should be displayed which provide the selected service/sub category",
							"The No results found for your search criteria Message displayed as expected if the selected service is not available with any salons");
					
				} else {
					browser.reportscomtep("Failed",
							"verify the list of Salons are displayed which provide the selected service/sub category (if available)",
							"The list of Salons should be displayed which provide the selected service/sub category",
							"The list of Salons are Not displayed which provide the selected service/sub category");
				}
				browser.click(CustomerModule.Home_ShearCircle_Image);
			} else {
				browser.reportscomtep("Failed", "Verify ShearCircle Home page is displayed",
						"ShearCircle Home page should be displayed", " ShearCircle Home page not displayed");
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	
/****TC_4_2_01	Invoke the search results page********/
	
	public void invokeTO_SearcResults_Page(){
		try{
			browser.click(CustomerModule.Home_ShearCircle_Image);
			if (browser.elementisdisplayed(CustomerModule.Home_H1_Header)) {
				browser.reportscomtep("Passed", "Verify ShearCircle Home page is displayed",
						"ShearCircle Home page should be displayed", " ShearCircle Home page displayed");
				browser.click(CustomerModule.home_Locate_Button);
				if (browser.elementisdisplayed(CustomerModule.home_SearchResults_Message)) {
					browser.reportscomtep("Passed",
							"Click on Locate button without entering any search text and Verify Opens Search Results page is Displayed with all Salons are available",
							"Search Results page should be Displayed with all Salons are available",
							"Search Results page Displayed with all Salons are available");

				} else {
					browser.reportscomtep("Failed",
							"Click on Locate button without entering any search text and Verify Opens Search Results page is Displayed with all Salons are available",
							"Search Results page should be Displayed with all Salons are available",
							"Search Results page Not Displayed with all Salons are available");
				}

			} else {
				browser.reportscomtep("Failed", "Verify ShearCircle Home page is displayed",
						"ShearCircle Home page should be displayed", " ShearCircle Home page not displayed");
			}
		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	
	/********
	 * TC_4_2_02 Check whether the filters are hidden by clicking the + sign in
	 * filter section
	 ****/

	public void check_FiltersAreHiddenBy_ClickOnPlusSignIn_FilterSection() {
		try {
			if (browser.elementisdisplayed(CustomerModule.SR_Filters_SectionDispalyed)) {
				browser.reportscomtep("Passed", "Verify Filter Section is displayed",
						"Filter Section should be displayed", "Filter Section displayed");
				browser.click(CustomerModule.SR_FiltersPlus_Icon);
				if (browser.elementisdisplayed(CustomerModule.SR_Filters_SectionDisappear)) {
					browser.reportscomtep("Passed", "click on Plus Icon and Filter Section was disappered ",
							"Filter Section Should be disappered ", "Filter Section disappered ");
				} else {
					browser.reportscomtep("Failed", "click on Plus Icon and Filter Section was disappered ",
							"Filter Section Should be disappered ", "Filter Section  not disappered ");
				}
			} else {
				browser.reportscomtep("Passed", "Verify Filter Section is displayed",
						"Filter Section should be displayed", "Filter Section displayed");
			}
		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}

	/**************
	 * TC_4_2_03 Check whether the filters are displayed by clicking the + sign
	 * in filter section
	 **********/

	public void check_FiltersAreDisplayedBy_ClickOnPlusSignIn_FilterSection() {
		try {
			if (browser.elementisdisplayed(CustomerModule.SR_Filters_SectionDisappear)) {
				browser.reportscomtep("Passed", "Verify Filter Section is dissppear",
						"Filter Section Should be dissppear", "Filter Section dissppear");
				browser.click(CustomerModule.SR_FiltersPlus_Icon);
				if (browser.elementisdisplayed(CustomerModule.SR_Filters_SectionDispalyed)) {
					browser.reportscomtep("Passed", "Cliks on Plus icon and Filters section is displayed",
							"Filters section Should be displayed ", "Filters section displayed ");
				} else {
					browser.reportscomtep("Passed", "Cliks on Plus icon and Filters section is displayed",
							"Filters section Should be displayed ", "Filters section not displayed ");
				}
			} else {
				browser.reportscomtep("Failed", "Verify Filter Section is dissppear",
						"Filter Section Should be dissppear", "Filter Section not dissppear");
			}
		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}

	
	/**********TC_4_2_04	Check the dropdown options next to search results count********/
	
	public void check_DropdownOptions_NextToSearchResults_Count() {
		try {
			int itemCount = 0;
			String DropdownList = "";
			String exptDropdownlist = "Most Viewed;Recently Added";
			if (browser.elementisdisplayed(CustomerModule.home_SearchResults_Message)) {
				browser.reportscomtep("Passed",
						" Verify Search Results page is Displayed with all Salons are available",
						"Search Results page should be Displayed with all Salons are available",
						"Search Results page Displayed with all Salons are available");
				List<WebElement> Dropdown_Options = browser
						.getOptions(CustomerModule.SR_DropdownOnTopmostPartOf_List);
				itemCount = Dropdown_Options.size();
				if (itemCount > 0) {
					for (WebElement listvalue : Dropdown_Options) {
						DropdownList = DropdownList + ";" + listvalue.getText();
					}
					DropdownList = DropdownList.substring(2);
				}
				if (DropdownList.equalsIgnoreCase(exptDropdownlist)) {
					DropdownList = DropdownList.replace(";", "\n");
					browser.reportscomtep("Passed", "Verify Dropdown options are displayed",
							"Dropdown options should be displayed",
							"Dropdown options displayed: " + DropdownList);
				} else {
					browser.reportscomtep("Failed", "Verify Dropdown options are displayed",
							"Verify Dropdown options should be displayed",
							"Dropdown options not displayed");
				}

			} else {
				browser.reportscomtep("Failed",
						" Verify Search Results page is Displayed with all Salons are available",
						"Search Results page should be Displayed with all Salons are available",
						"Search Results page Not Displayed with all Salons are available");
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	
	
/*************TC_4_2_05	Check the Most viewed option************/
	
	public void check_MostViewed_dropdownOption(){
		try{
			String selectedType="";			
							
			browser.selectByVisibleText(CustomerModule.SR_DropdownOnTopmostPartOf_List, "Most Viewed");
			
			selectedType = browser.getDropdownSelectedValue(CustomerModule.SR_DropdownOnTopmostPartOf_List);
			if(selectedType.equalsIgnoreCase("Most Viewed")){
				browser.reportscomtep("Passed", "Verify Selected Most Viewed dropdown option",
						"Most Viewed dropdown option should be selected", "Most Viewed dropdown option selected");
			} else {
				browser.reportscomtep("Failed", "Verify Selected Most Viewed dropdown option",
						"Most Viewed dropdown option should be selected", "Most Viewed dropdown option Not selected");		
			}
			
			browser.waitforelementtobevisible(CustomerModule.home_SearchResults_Message,10);
			if (browser.elementisdisplayed(CustomerModule.home_SearchResults_Message)){
				browser.reportscomtep("Passed",
						"Verify Search results page Displays the Search results with-- most viewed Salons first and the least viewed last",
						"Search results page should be displays the Search results with-- most viewed Salons first and the least viewed last",
						"Search results page Displays the Search results with-- most viewed Salons first and the least viewed last");
			} else {
				browser.reportscomtep("Failed",
						"Verify Search results page Displays the Search results with-- most viewed Salons first and the least viewed last",
						"Search results page should be displays the Search results with-- most viewed Salons first and the least viewed last",
						"Search results page Not Displays the Search results with-- most viewed Salons first and the least viewed last");
			}	
				
			
		}catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	/*************TC_4_2_06	Check the Newly Added option************/
	public void check_RecentlyAdded_dropdownOption(){
		try{
			String selectedType="";			
							
			browser.selectByVisibleText(CustomerModule.SR_DropdownOnTopmostPartOf_List, "Recently Added");
			
			selectedType = browser.getDropdownSelectedValue(CustomerModule.SR_DropdownOnTopmostPartOf_List);
			if(selectedType.equalsIgnoreCase("Recently Added")){
				browser.reportscomtep("Passed", "Verify Selected Recently Added dropdown option",
						"Recently Added dropdown option should be selected", "Recently Added dropdown option selected");
			} else {
				browser.reportscomtep("Failed", "Verify Selected Recently Added dropdown option",
						"Recently Added dropdown option should be selected", "Recently Added dropdown option Not selected");		
			}
			
			browser.waitforelementtobevisible(CustomerModule.home_SearchResults_Message,10);
			if (browser.elementisdisplayed(CustomerModule.home_SearchResults_Message)){
				browser.reportscomtep("Passed",
						"Verify Search results page Displays the Search results with the Recently added first",
						"Search results page should be displays the Search results with Recently added first",
						"Search results page Displays the Search results with Recently added first");
			} else {
				browser.reportscomtep("Failed",
						"Verify Search results page Displays the Search results with the Recently added first",
						"Search results page should be displays the Search results with Recently added first",
						"Search results page not Displays the Search results with Recently added first");
			}	
				
			
		}catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	/* TC_4_2_07 Check whether the correct results are displayed for Accept Online Payments*/
	public void ChecksearchresultforAcceptOnlinePayments() {
		try {
			String onlinepayment_filtercheckbox = "Accept Online Payments";
			String searchResults_PaymentType = "";
			String expct_SearchResults_PaymentType = "Online Payment";
			boolean searchResultsavailablity = false;	
			boolean searchResultsnotavailablity = true;		
				
				this.searchResults_select_Filters_checkbox(onlinepayment_filtercheckbox);				
				browser.waitforelementtobevisible(CustomerModule.home_SearchResults_Message, 20);				
				if(CustomerModule.customer_Search_SalonNames.size()>0 && CustomerModule.customer_OnlinePayment_SearchResults.size()>0){
					for(WebElement listvalue:CustomerModule.customer_OnlinePayment_SearchResults){	
						browser.scrollintoviewelement(listvalue);
						searchResults_PaymentType = listvalue.getText();						
						if(searchResults_PaymentType.trim().equalsIgnoreCase(expct_SearchResults_PaymentType)){								
							searchResultsavailablity = true;								
						}else{
							searchResultsnotavailablity = false;
						}	
						browser.scrollintoviewelement(CustomerModule.home_SearchResults_Message);
						if (browser.elementisdisplayed(CustomerModule.home_SearchResults_Message) && searchResultsavailablity && searchResultsnotavailablity){
							browser.reportscomtep("Passed",
									"Select fileter as "+onlinepayment_filtercheckbox+" and verify Search results page dispalyed list of Salons that Online payment",
									"Search results page should be dispalyed results with selected filter",
									"Search results page dispalyed list of Salons that accept Online payment");
						} else {
							browser.reportscomtep("Failed",
									"Select fileter as "+onlinepayment_filtercheckbox+" and verify Search results page dispalyed list of Salons that Online payment",
									"Search results page should be dispalyed results with selected filter",
									"Search results page Not dispalyed list of Salons that accept Online payment");
						}	
						
					}					
					
				}else if (browser.elementisdisplayed(CustomerModule.home_NoResultsFound_Message)){				
					browser.reportscomtep("Passed",
							"Select fileters as "+onlinepayment_filtercheckbox+" and verify Search results page dispalyed list of Salons",
							"Search results page should be dispalyed results with selected filters",
							onlinepayment_filtercheckbox+" salons list Not displayed in Search Reasults page as expected if the selected service is not available");				
				}		
				this.searchResults_Unselect_Filters_checkbox(onlinepayment_filtercheckbox);

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	
	/* TC_4_2_08 Check whether the correct results are displayed for Accept Cash On Service*/
	public void ChecksearchresultforAcceptCashOnService() {
		try {
			String filterscheckbox = "Accept Cash On Service";
			String searchResults_PaymentType = "";
			String expct_SearchResults_PaymentType = "Cash On Service";
			boolean searchResultsavailablity = false;	
			boolean searchResultsnotavailablity = true;		
				
				this.searchResults_select_Filters_checkbox(filterscheckbox);
				
				browser.waitforelementtobevisible(CustomerModule.home_SearchResults_Message, 20);				
				if(CustomerModule.customer_Search_SalonNames.size()>0 && CustomerModule.customer_CashOnService_SearchResults.size()>0){
					for(WebElement listvalue:CustomerModule.customer_CashOnService_SearchResults){	
						browser.scrollintoviewelement(listvalue);
						searchResults_PaymentType = listvalue.getText();						
						if(searchResults_PaymentType.trim().equalsIgnoreCase(expct_SearchResults_PaymentType)){								
							searchResultsavailablity = true;								
						}else{
							searchResultsnotavailablity = false;
						}				
					}
					
					browser.scrollintoviewelement(CustomerModule.home_SearchResults_Message);
					if (browser.elementisdisplayed(CustomerModule.home_SearchResults_Message) && searchResultsavailablity && searchResultsnotavailablity){
						browser.reportscomtep("Passed",
								"Select fileter as "+filterscheckbox+" and verify Search results page dispalyed list of Salons that Cash On Services",
								"Search results page should be dispalyed results with selected filter",
								"Search results page dispalyed list of Salons that accept Cash On Services");
					} else {
						browser.reportscomtep("Failed",
								"Select fileter as "+filterscheckbox+" and verify Search results page dispalyed list of Salons that Cash On Services",
								"Search results page should be dispalyed results with selected filter",
								"Search results page Not dispalyed list of Salons that accept Cash On Services");
					}	
				}else if (browser.elementisdisplayed(CustomerModule.home_NoResultsFound_Message)){				
					browser.reportscomtep("Passed",
							"Select fileters as "+filterscheckbox+" and verify Search results page dispalyed list of Salons",
							"Search results page should be dispalyed results with selected filters",
							filterscheckbox+" salons list Not displayed in Search Reasults page as expected if the selected service is not available");				
				}			
				
				this.searchResults_Unselect_Filters_checkbox(filterscheckbox);
			

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	
	/* TC_4_2_09 Check whether the correct results are displayed for Search Promotions*/
	public void checksearchresultsdisplayedforPromotions() {
		try {
			String filterscheckbox = "Search Promotions";
			String searchResults_Bookme = "";
			String expct_SearchResults_Bookme = "Book Me";
			boolean searchResultsavailablity = false;	
			boolean searchResultsnotavailablity = true;		
				
				this.searchResults_select_Filters_checkbox(filterscheckbox);
				
				browser.waitforelementtobevisible(CustomerModule.home_SearchResults_Message, 20);				
				if(CustomerModule.customer_Search_SalonNames.size()>0 && CustomerModule.customer_SearchResults_Bookme_Buttons_List.size()>0){
					for(WebElement listvalue:CustomerModule.customer_SearchResults_Bookme_Buttons_List){	
						browser.scrollintoviewelement(listvalue);
						searchResults_Bookme = listvalue.getText();						
						if(searchResults_Bookme.trim().equalsIgnoreCase(expct_SearchResults_Bookme)){								
							searchResultsavailablity = true;								
						}else{
							searchResultsnotavailablity = false;
						}				
					}
					
					browser.scrollintoviewelement(CustomerModule.home_SearchResults_Message);
					if (browser.elementisdisplayed(CustomerModule.home_SearchResults_Message) && searchResultsavailablity && searchResultsnotavailablity){
						browser.reportscomtep("Passed",
								"Select fileter as "+filterscheckbox+" and verify Search results page dispalyed list of Salons that having Promotions",
								"Search results page should be dispalyed results with selected filter",
								"Search results page dispalyed list of Salons that having Promotions");
					} else {
						browser.reportscomtep("Failed",
								"Select fileter as "+filterscheckbox+" and verify Search results page dispalyed list of Salons that having Promotions",
								"Search results page should be dispalyed results with selected filter",
								"Search results page Not dispalyed list of Salons that having Promotions");
					}	
					
					CustomerModule.customer_SearchResults_Bookme_Buttons_List.get(0).click();
					browser.waitforelementtobevisible(CustomerModule.Customer_Promotions_Tab, 20);
					
					if (browser.elementisdisplayed(CustomerModule.Customer_Promotions_Tab)){
						browser.reportscomtep("Passed",
								"Click on Book Me button and verify the Promotions Tab is displayed in the Business Page",
								"Promotions Tab should be displayed in the Business Page",
								"Promotions Tab is displayed in the Business Page");
					} else {
						browser.reportscomtep("Failed",
								"Click on Book Me button and verify the Promotions Tab is displayed in the Business Page",
								"Promotions Tab should be displayed in the Business Page",
								"Promotions Tab is Not displayed in the Business Page");
					}
				}else if (browser.elementisdisplayed(CustomerModule.home_NoResultsFound_Message)){				
					browser.reportscomtep("Passed",
							"Select fileters as "+filterscheckbox+" and verify Search results page dispalyed list of Salons",
							"Search results page should be dispalyed results with selected filters",
							filterscheckbox+" salons list Not displayed in Search Reasults page as expected if the selected service is not available");				
				}					
				
				browser.click(CustomerModule.customer_Search_Button);

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	
	/* TC_4_2_10 Check whether the correct results are displayed for Search Jobs*/
	public void checksearchresultsdisplayedforSearchJobs() {
		try {
			String filterscheckbox = "Search Jobs";
			String searchResults_Bookme = "";
			String expct_SearchResults_Bookme = "Book Me";
			boolean searchResultsavailablity = false;	
			boolean searchResultsnotavailablity = true;		
				
				this.searchResults_select_Filters_checkbox(filterscheckbox);
				
				browser.waitforelementtobevisible(CustomerModule.home_SearchResults_Message, 20);				
				if(CustomerModule.customer_Search_SalonNames.size()>0 && CustomerModule.customer_SearchResults_Bookme_Buttons_List.size()>0){
					for(WebElement listvalue:CustomerModule.customer_SearchResults_Bookme_Buttons_List){	
						browser.scrollintoviewelement(listvalue);
						searchResults_Bookme = listvalue.getText();						
						if(searchResults_Bookme.trim().equalsIgnoreCase(expct_SearchResults_Bookme)){								
							searchResultsavailablity = true;								
						}else{
							searchResultsnotavailablity = false;
						}				
					}
					
					browser.scrollintoviewelement(CustomerModule.home_SearchResults_Message);
					if (browser.elementisdisplayed(CustomerModule.home_SearchResults_Message) && searchResultsavailablity && searchResultsnotavailablity){
						browser.reportscomtep("Passed",
								"Select fileter as "+filterscheckbox+" and verify Search results page dispalyed list of Salons that having Jobs",
								"Search results page should be dispalyed results with selected filter",
								"Search results page dispalyed list of Salons that having Jobs");
					} else {
						browser.reportscomtep("Failed",
								"Select fileter as "+filterscheckbox+" and verify Search results page dispalyed list of Salons that having Jobs",
								"Search results page should be dispalyed results with selected filter",
								"Search results page Not dispalyed list of Salons that having Jobs");
					}	
					
					CustomerModule.customer_SearchResults_Bookme_Buttons_List.get(0).click();
					browser.waitforelementtobevisible(CustomerModule.Customer_Jobs_Tab, 20);
					
					if (browser.elementisdisplayed(CustomerModule.Customer_Jobs_Tab)){
						browser.reportscomtep("Passed",
								"Click on Book Me button and verify the Jobs Tab is displayed in the Business Page",
								"Jobs Tab should be displayed in the Business Page",
								"Jobs Tab is displayed in the Business Page");
					} else {
						browser.reportscomtep("Failed",
								"Click on Book Me button and verify the Jobs Tab is displayed in the Business Page",
								"Jobs Tab should be displayed in the Business Page",
								"Jobs Tab is Not displayed in the Business Page");
					}
					
				}else if (browser.elementisdisplayed(CustomerModule.home_NoResultsFound_Message)){				
					browser.reportscomtep("Passed",
							"Select fileters as "+filterscheckbox+" and verify Search results page dispalyed list of Salons",
							"Search results page should be dispalyed results with selected filters",
							filterscheckbox+" salons list Not displayed in Search Reasults page as expected if the selected service is not available");				
				}
				browser.click(CustomerModule.customer_Search_Button);
		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	
	/* TC_4_2_11 Check whether the correct results are displayed when selecting all 4 filters*/
	public void checksearchresultsdisplayed_SellectingAllFilters() {
		try {
			String filtersonlinepaymentcheckbox = "Accept Online Payments";
			String filtersCashOnServicecheckbox = "Accept Cash On Service";
			String filtersPromotionscheckbox = "Search Promotions";
			String filtersJobscheckbox = "Search Jobs";
			String allFilterOptions = "Accept Online Payments, Accept Cash On Service, Search Promotions, Search Jobs";
			String expct_SearchResults_OnlinePaymentType = "Online Payment";
			String expct_SearchResults_CashPaymentType = "Accept Cash On Service";
			String searchResults_Bookme = "";
			String searchResults_OLPaymentType = "";
			String searchResults_COPaymentType = "";
			String expct_SearchResults_Bookme = "Book Me";
			boolean sROPavailablity = false;	
			boolean sROPnotavailablity = true;	
			
			boolean sRCPavailablity = false;	
			boolean sRCPnotavailablity = true;	
				
				this.searchResults_select_Filters_checkbox(filtersonlinepaymentcheckbox);
				this.searchResults_select_Filters_checkbox(filtersCashOnServicecheckbox);
				this.searchResults_select_Filters_checkbox(filtersPromotionscheckbox);
				this.searchResults_select_Filters_checkbox(filtersJobscheckbox);
				
				browser.waitforelementtobevisible(CustomerModule.home_SearchResults_Message, 20);				
				if(CustomerModule.customer_OnlinePayment_SearchResults.size()>0 && CustomerModule.customer_CashOnService_SearchResults.size()>0){
					for(WebElement listvalue:CustomerModule.customer_OnlinePayment_SearchResults){	
						browser.scrollintoviewelement(listvalue);
						searchResults_OLPaymentType = listvalue.getText();						
						if(searchResults_OLPaymentType.trim().equalsIgnoreCase(expct_SearchResults_OnlinePaymentType)){								
							sROPavailablity = true;								
						}else{
							sROPnotavailablity = false;
						}				
					}		
				
					for(WebElement listvalue:CustomerModule.customer_CashOnService_SearchResults){	
						browser.scrollintoviewelement(listvalue);
						searchResults_COPaymentType = listvalue.getText();						
						if(searchResults_COPaymentType.trim().equalsIgnoreCase(expct_SearchResults_CashPaymentType)){								
							sRCPavailablity = true;								
						}else{
							sRCPnotavailablity = false;
						}				
					}
					if (sROPavailablity && sROPnotavailablity && sRCPavailablity && sRCPnotavailablity){
						browser.reportscomtep("Passed",
								"Select All Filters checkboxes and verify the list of Salons displayed that have all the selected options",
								"The list of Salons should be displayed that have all the selected options",
								"The list of Salons displayed that have all the selected options as:" + allFilterOptions );
					} else {
						browser.reportscomtep("Failed",
								"Select All Filters checkboxes and verify the list of Salons displayed that have all the selected options",
								"The list of Salons should be displayed that have all the selected options",
								"The list of Salons Not displayed that have all the selected options as:" + allFilterOptions);
					}
					browser.scrollintoviewelement(CustomerModule.home_SearchResults_Message);
					CustomerModule.customer_SearchResults_Bookme_Buttons_List.get(0).click();
					browser.waitforelementtobevisible(CustomerModule.Customer_Jobs_Tab, 20);
					
					if (browser.elementisdisplayed(CustomerModule.Customer_Jobs_Tab) && browser.elementisdisplayed(CustomerModule.Customer_Promotions_Tab) && sROPavailablity && sROPnotavailablity && sRCPavailablity && sRCPnotavailablity){
						browser.reportscomtep("Passed",
								"Select All Filters checkboxes and verify the list of Salons displayed that have all the selected options",
								"The list of Salons should be displayed that have all the selected options",
								"The list of Salons displayed that have all the selected options as:" + allFilterOptions );
					} else {
						browser.reportscomtep("Failed",
								"Select All Filters checkboxes and verify the list of Salons displayed that have all the selected options",
								"The list of Salons should be displayed that have all the selected options",
								"The list of Salons Not displayed that have all the selected options as:" + allFilterOptions);
					}
					
				}else if (browser.elementisdisplayed(CustomerModule.home_NoResultsFound_Message)){				
					browser.reportscomtep("Passed",
							"Select fileters as "+allFilterOptions+" and verify Search results page dispalyed list of Salons",
							"Search results page should be dispalyed results with selected filters",
							allFilterOptions+" salons list Not displayed in Search Reasults page as expected if the selected service is not available");				
				}	
				
				browser.click(CustomerModule.customer_Search_Button);

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}	
	
	/*****TC_4_2_12 check correct results are displayed for services filters********/
	public void check_CorrectResults_DisplayedFor_ServicesFilters() {
		try {
			int NumberOfHaircut_SalonsList = 0;
			String SR_Message = "";
			String serviceName = null;
			WebElement SR_Services_HairCut_service = null;
			serviceName = browser.getdata("filter_one_ServieName");
			if (browser.elementisdisplayed(CustomerModule.SR_Filters_SectionDispalyed)) {
				browser.reportscomtep("Passed", "Verify the Search Results page of the Filters Section is displayed",
						"Search Results page of the Filters Section should be displayed",
						"Search Results page of the Filters text  displayed");
				//browser.click(CustomerModule.SR_Services_Haircut_CheckBox);
				this.searchResults_select_Services_checkbox(serviceName);
				
				SR_Message = browser.getelementtext(CustomerModule.home_SearchResults_Message);
				NumberOfHaircut_SalonsList = Integer.parseInt(SR_Message.replaceAll("\\D", ""));
				if (NumberOfHaircut_SalonsList != 0) {
					browser.reportscomtep("Passed",
							"Verify "+serviceName+" salons list is displayed in Search Reasults page",
							serviceName+" salons list should be displayed in Search Reasults page",
							serviceName+" salons list "+ NumberOfHaircut_SalonsList +" displayed in Search Reasults page");
					browser.click(CustomerModule.SR_Services_BookMe_Button);
					if (browser.elementisdisplayed(CustomerModule.SR_Services_Business_Page)) {
						browser.reportscomtep("Passed",
								"click on BookMe button and verify Services tab is displayed in Business page",
								"Services tab should be displayed in Business page",
								"Services tab displayed in Business page");
						SR_Services_HairCut_service = browser.getelementwithXpath("//*[@id='services']//div/label[contains(text(),'"+serviceName.substring(1)+"')]");
						System.out.println("//*[@id='services']//div/label[contains(text(),'"+serviceName.substring(1)+"')]");
						if (browser.elementisdisplayed(SR_Services_HairCut_service)) {
							browser.reportscomtep("Passed",
									"Verify "+serviceName+" service is displayed under the services tab",
									serviceName+" service should be displayed under the services tab",
									serviceName+" service displayed under the services tab");
						} else {
							browser.reportscomtep("Failed",
									"Verify "+serviceName+" service is displayed under the services tab",
									serviceName+" service should be displayed under the services tab",
									serviceName+" service Not displayed under the services tab");
						}
					} else {
						browser.reportscomtep("Failed",
								"click on BookMe button and verify Services tab is displayed in Business page",
								"Services tab should be displayed in Business page",
								"Services tab Not displayed in Business page");
					}
				} else {
					browser.reportscomtep("Passed",
							"Verify "+serviceName+" salons list is displayed in Search Reasults page",
							serviceName+" salons list should be displayed in Search Reasults page",
							serviceName+" salons list Not displayed  in Search Reasults page as expected if the selected service is not available");
				}
				browser.click(CustomerModule.customer_Search_Button);
			} else {
				browser.reportscomtep("Failed", "Verify the Search Results page of the Filters Section is displayed",
						"Search Results page of the Filters Section should be displayed",
						"Search Results page of the Filters Section not displayed");
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	
	/**********TC_4_2_13 Check whether the correct results are displayed for multiple services********/
	public void check_CorrectResultsAre_DisplayedFor_MultipleServicesFilters() {
		try {
			int NumberOfHaircut_SalonsList = 0;
			String SR_Message = "";
			String serviceName = "";
			WebElement BP_serviceElement = null;
			String[] serviceList = null;
			
			serviceName = browser.getdata("filter_multiple_ServieNames");			
			if (browser.elementisdisplayed(CustomerModule.SR_Filters_SectionDispalyed)) {
				browser.reportscomtep("Passed", "Verify the Search Results page of the Filters Section is displayed",
						"Search Results page of the Filters Section should be displayed",
						"Search Results page of the Filters Section  displayed");
				this.searchResults_select_Services_checkbox(serviceName);				
				//this.searchResults_select_Services_checkboxMultiple(serviceName,Selcet_serviceName2,Selcet_serviceName3);
				SR_Message = browser.getelementtext(CustomerModule.home_SearchResults_Message);
				NumberOfHaircut_SalonsList = Integer.parseInt(SR_Message.replaceAll("\\D", ""));
				if (NumberOfHaircut_SalonsList != 0) {
					browser.reportscomtep("Passed",
							"Verify selected" + serviceName + " salons list is displayed in Search Reasults page",
							serviceName + " salons list should be displayed in Search Reasults page",
							serviceName + " salons list " + NumberOfHaircut_SalonsList	+ " displayed in Search Reasults page");
							browser.click(CustomerModule.SR_Services_BookMe_Button);
							if (browser.elementisdisplayed(CustomerModule.SR_Services_Business_Page)) {
								browser.reportscomtep("Passed",
										"click on BookMe button and verify Services tab is displayed in Business page",
										"Services tab should be displayed in Business page",
										"Services tab displayed in Business page");										
								serviceList = serviceName.split(";");								
								BP_serviceElement = browser.getelementwithXpath("//*[@id='services']//div/label[contains(text(),'"+serviceList[1].substring(1)+"')]");
								System.out.println("//*[@id='services']//div/label[contains(text(),'"+serviceList[1].substring(1)+"')]");
								if (browser.elementisdisplayed(BP_serviceElement)) {
									browser.reportscomtep("Passed",
											"Verify "+serviceName+" service are displayed under the services tab",
											serviceName+" service are should be displayed under the services tab",
											serviceName+" service are displayed under the services tab");
								} else {
									browser.reportscomtep("Failed",
											"Verify  "+serviceName+" service are displayed under the services tab",
											serviceName+" service are should be displayed under the services tab",
											serviceName+" service are Not displayed under the services tab");
								}
							} else {
								browser.reportscomtep("Failed",
										"click on BookMe button and verify Services tab is displayed in Business page",
										"Services tab should be displayed in Business page",
										"Services tab Not displayed in Business page");
							}

				} else if (NumberOfHaircut_SalonsList == 0) {
					browser.reportscomtep("Passed",
							"Verify " + serviceName +" salons list is not displayed in Search Reasults page",
							serviceName + " salons list is displayed in Search Reasults page salons list should not be displayed in Search Reasults page",
							serviceName + " salons " + NumberOfHaircut_SalonsList + " not displayed in Search Reasults page");
				}
			} else {
				browser.reportscomtep("Failed", "Verify the Search Results page of the Filters Section is displayed",
						"Search Results page of the Filters Section should be displayed",
						"Search Results page of the Filters Section not displayed");
			}
		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	
	/*****TC_4_2_16 Check whether the correct results are displayed when a combination of all filters are selected********/
	public void check_CorrectResults_combinationofallfiltersareselected() {
		try {					
			String filtersPromotionscheckbox = "Search Promotions";			
			String allFilterOptions = "Accept Online Payments, Search Promotions";			
			String serviceName = null;	
			String searchResults_CashPaymentType = "";
			boolean sRCashPavailablity = false;
			boolean sRCashPnotavailablity = true;			
			String filter_multiple_Ratings = null;			
			String filtersCashOnServicecheckbox = "Accept Cash On Service";			
			String expct_SearchResults_CashPaymentType = "Cash On Services";
			WebElement BP_serviceElement = null;
			String[] serviceList = null;
			
			serviceName = browser.getdata("filter_tow_ServieNames");
			filter_multiple_Ratings = browser.getdata("filter_multiple_Ratings");
			if (browser.elementisdisplayed(CustomerModule.SR_Filters_SectionDispalyed)) {
				browser.reportscomtep("Passed", "Verify the Search Results page of the Filters Section is displayed",
						"Search Results page of the Filters Section should be displayed",
						"Search Results page of the Filters text  displayed");
								
				this.searchResults_select_Filters_checkbox(filtersCashOnServicecheckbox);				
				this.searchResults_select_Filters_checkbox(filtersPromotionscheckbox);
				this.searchResults_select_Services_checkbox(serviceName);
				
				//browser.waitforelementtobevisible(CustomerModule.Home_SearchResultsPage_H1_Header, 20);
				//browser.scrollintoviewelement(CustomerModule.Home_SearchResultsPage_H1_Header);
				if(CustomerModule.customer_CashOnService_SearchResults.size()>0){
					for(WebElement listvalue:CustomerModule.customer_CashOnService_SearchResults){	
						browser.scrollintoviewelement(listvalue);
						searchResults_CashPaymentType = listvalue.getText();						
						if(searchResults_CashPaymentType.trim().equalsIgnoreCase(expct_SearchResults_CashPaymentType)){								
							sRCashPavailablity = true;								
						}else{
							sRCashPnotavailablity = false;
						}				
					}
				}				
				
				if (sRCashPavailablity && sRCashPnotavailablity){					
					browser.reportscomtep("Passed",
							"Selected fileters as "+allFilterOptions+","+serviceName+", "+ filter_multiple_Ratings+" and verify Search results page dispalyed list of Salons",
							"Search results page should be dispalyed results with selected filters",
							"Search results page dispalyed list of Salons that "+allFilterOptions+","+serviceName+", "+ filter_multiple_Ratings);
					
					browser.scrollintoviewelement(CustomerModule.home_SearchResults_Message);
					CustomerModule.customer_SearchResults_Bookme_Buttons_List.get(0).click();
					browser.waitforelementtobevisible(CustomerModule.Customer_Promotions_Tab, 20);
					
					if (browser.elementisdisplayed(CustomerModule.SR_Services_Business_Page)) {
						browser.reportscomtep("Passed",
								"click on BookMe button and verify Services tab is displayed in Business page",
								"Services tab should be displayed in Business page",
								"Services tab displayed in Business page");					
						serviceList = serviceName.split(";");								
						BP_serviceElement = browser.getelementwithXpath("//*[@id='services']//div/label[contains(text(),'"+serviceList[1].substring(1)+"')]");
						if (browser.elementisdisplayed(CustomerModule.Customer_Promotions_Tab) && browser.elementisdisplayed(BP_serviceElement)) {
							browser.reportscomtep("Passed",
									"Verify Promotions Tab and "+serviceName+" service are displayed under the services tab",
									"Promotions Tab and "+serviceName+" service are should be displayed under the services tab",
									"Promotions Tab and "+serviceName+" service are displayed under the services tab");
						} else {
							browser.reportscomtep("Failed",
									"Verify Promotions Tab and "+serviceName+" service are displayed under the services tab",
									"Promotions Tab and "+serviceName+" service are should be displayed under the services tab",
									"Promotions Tab and "+serviceName+" service are Not displayed under the services tab");
						}
					} else {
						browser.reportscomtep("Failed",
								"click on BookMe button and verify Services tab is displayed in Business page",
								"Services tab should be displayed in Business page",
								"Services tab Not displayed in Business page");
					}
					
					browser.click(CustomerModule.customer_Search_Button);
				} else if (browser.elementisdisplayed(CustomerModule.home_NoResultsFound_Message)){				
					browser.reportscomtep("Passed",
							"Selected fileters as "+allFilterOptions+","+serviceName+", "+ filter_multiple_Ratings+" and verify Search results page dispalyed list of Salons",
							"Search results page should be dispalyed results with selected filters",
							allFilterOptions+","+serviceName+", "+ filter_multiple_Ratings+" salons list Not displayed in Search Reasults page as expected if the selected service is not available");
				} else {
					browser.reportscomtep("Failed",
							"Selected fileters as "+allFilterOptions+","+serviceName+", "+ filter_multiple_Ratings+" and verify Search results page dispalyed list of Salons",
							"Search results page should be dispalyed results with selected filters",
							"Search results page Not dispalyed list of Salons that "+allFilterOptions+","+serviceName+", "+ filter_multiple_Ratings);
				}			
			
			}else{
				
				browser.reportscomtep("Failed", "Verify the Search Results page of the Filters Section is displayed",
						"Search Results page of the Filters Section should be displayed",
						"Search Results page of the Filters Section not displayed");
			}

		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}
	
	
	
	public void searchResults_select_Filters_checkbox(String p_in_filters){
		String filters_name = "";
		boolean filters_selection = false;
		int checkbox = 0;		
		try {
		
		if(p_in_filters!="" && CustomerModule.SR_Filters_checkbox_label_list.size()>0) {
			for(WebElement Checkbox:CustomerModule.SR_Filters_checkbox_label_list){			
				filters_name = Checkbox.getText();				
				if(p_in_filters.trim().equalsIgnoreCase(filters_name)) {					
					//browser.check_Checkbox(CustomerModule.SR_Filters_checkbox_list.get(checkbox));
					CustomerModule.SR_Filters_checkbox_list.get(checkbox).click();
					filters_selection = true;
					break;
				}				
				checkbox++;
			}
		}else{
			browser.reportscomtep("Failed", "Verify filters "+ p_in_filters +" checkbox is displayed",
					"filters "+ p_in_filters +" checkbox should be displayed",
					"filters "+ p_in_filters +" checkbox Not displayed");
		}
		
		if(filters_selection) {
			browser.reportscomtep("Passed", "Verify filters "+ p_in_filters +" checkbox is selected",
					"filters "+ p_in_filters +" checkbox should be selected",
					"filters "+ p_in_filters +" checkbox selected");
		}else {
			browser.reportscomtep("Failed", "Verify filters "+ p_in_filters +" checkbox is selected",
					"filters "+ p_in_filters +" checkbox should be selected",
					"filters "+ p_in_filters +" checkbox Not selected");
		}
					
		}catch(Exception e) {
			System.out.println(e.getStackTrace());
		}
	}	
	
	public void searchResults_Unselect_Filters_checkbox(String p_in_filters){
		String filters_name = "";
		boolean filters_selection = false;
		int checkbox = 0;		
		try {
		
		if(p_in_filters!="" && CustomerModule.SR_Filters_checkbox_label_list.size()>0) {
			for(WebElement Checkbox:CustomerModule.SR_Filters_checkbox_label_list){			
				filters_name = Checkbox.getText();				
				if(p_in_filters.trim().equalsIgnoreCase(filters_name)) {					
					//browser.check_Checkbox(CustomerModule.SR_Filters_checkbox_list.get(checkbox));
					if(CustomerModule.SR_Filters_checkbox_list.get(checkbox).isSelected()){
						CustomerModule.SR_Filters_checkbox_list.get(checkbox).click();						
						break;
					}
					
				}				
				checkbox++;
			}
		}else{
			browser.reportscomtep("Failed", "Verify filters "+ p_in_filters +" checkbox is displayed",
					"filters "+ p_in_filters +" checkbox should be displayed",
					"filters "+ p_in_filters +" checkbox Not displayed");
		}		
		
					
		}catch(Exception e) {
			System.out.println(e.getStackTrace());
		}
	}
	
	public void searchResults_select_Services_checkbox(String p_in_filters_Service){
		String service_name = "";		
		boolean service_selection = false;
		int checkbox = 0;
		int servicesLength = 0;
		String[] serviceList ;
		
		serviceList = p_in_filters_Service.split(";");
		servicesLength = serviceList.length;	
		
		try {
		
			if(p_in_filters_Service!="" && CustomerModule.SR_Servies_checkbox_list.size()>0) {
				for(int loop_i = 0; loop_i<=servicesLength-1; loop_i++){				
					for(WebElement Checkbox:CustomerModule.SR_Servies_checkbox_label_list){			
						service_name = Checkbox.getText();				
						if(service_name.trim().equalsIgnoreCase(serviceList[loop_i])) {					
							//browser.check_Checkbox(CustomerModule.SR_Filters_checkbox_list.get(checkbox));
							CustomerModule.SR_Servies_checkbox_list.get(checkbox).click();
							Thread.sleep(2000);
							//if(CustomerModule.SR_Servies_checkbox_list.get(checkbox).isSelected()){
								service_selection = true;
								break;
							//}
							
						}				
						checkbox++;
					}
				}
				
			}else{
				browser.reportscomtep("Failed", "Verify Service "+ p_in_filters_Service +" checkbox is displayed",
						"Service "+ p_in_filters_Service +" checkbox should be displayed",
						"Service "+ p_in_filters_Service +" checkbox Not displayed");
			}
			
			if(service_selection) {
				browser.reportscomtep("Passed", "Verify Service "+ p_in_filters_Service +" checkbox is selected",
						"Service "+ p_in_filters_Service +" checkbox should be selected",
						"Service "+ p_in_filters_Service +" checkbox selected");
			}else {
				browser.reportscomtep("Failed", "Verify Service "+ p_in_filters_Service +" checkbox is selected",
						"Service "+ p_in_filters_Service +" checkbox should be selected",
						"Service "+ p_in_filters_Service +" checkbox Not selected");
			}
					
		}catch(Exception e) {
			System.out.println(e.getStackTrace());
		}
	}
	
	
	
	/*public void searchResults_select_RatingsFilter(String p_in_filters_Ratings){
		String Rating_Name= "";
		boolean Rating_selection = false;
		int loop_i= 0;	
		try {
		if(p_in_filters_Ratings!="" && CustomerModule.SR_Ratings_checkbox_list.size()>0) {
			for(WebElement Checkbox:CustomerModule.SR_Ratings_checkboxLabel_list){
				browser.scrollintoviewelement(Checkbox);
				Rating_Name = Checkbox.getAttribute("value");
				if(p_in_filters_Ratings.equalsIgnoreCase(Rating_Name)) {					
					CustomerModule.SR_Ratings_checkbox_list.get(loop_i).click();
					Rating_selection = true;
					break;
				}	
				loop_i++;
			}
		}else{
			browser.reportscomtep("Failed", "Verify Service "+ p_in_filters_Ratings +" checkbox is displayed",
					"Service "+ p_in_filters_Ratings +" checkbox should be displayed",
					"Service "+ p_in_filters_Ratings +" checkbox Not displayed");
		}
		
		if(Rating_selection) {
			browser.reportscomtep("Passed", "Verify Service "+ p_in_filters_Ratings +" checkbox is selected",
					"Service "+ p_in_filters_Ratings +" checkbox should be selected",
					"Service "+ p_in_filters_Ratings +" checkbox selected");
		}else {
			browser.reportscomtep("Failed", "Verify Service "+ p_in_filters_Ratings +" checkbox is selected",
					"Service "+ p_in_filters_Ratings +" checkbox should be selected",
					"Service "+ p_in_filters_Ratings +" checkbox Not selected");
		}
					
		}catch(Exception e) {
			System.out.println(e.getStackTrace());
		}
	}
	
	
	*//****TC_4_2_14	Check whether the correct results are displayed for Ratings filter******//*
	
	public void check_Correct_ResultsAre_DisplayedFor_Ratings_Filter() {
		try {
			int NumberOfHaircut_SalonsList = 0;
			String SR_Message = "";
			String Select_StarRating1 = "";
			Select_StarRating1 = browser.getdata("Select_StarRating1");
			if (browser.elementisdisplayed(CustomerModule.SR_Filters_SectionDispalyed)) {
				browser.reportscomtep("Passed", "Verify the Search Results page of the Filters Section is displayed",
						"Search Results page of the Filters Section should be displayed",
						"Search Results page of the Filters Section displayed");
				this.searchResults_select_RatingsFilter(Select_StarRating1);
				SR_Message = browser.getelementtext(CustomerModule.home_SearchResults_Message);
				NumberOfHaircut_SalonsList = Integer.parseInt(SR_Message.replaceAll("\\D", ""));
				if (NumberOfHaircut_SalonsList != 0 && browser.elementisdisplayed(CustomerModule.SR_Services_FourStar_rating)) {
					browser.reportscomtep("Passed",
							"Verify " + Select_StarRating1
									+ " star rating salons list is displayed in Search Reasults page",
							Select_StarRating1
									+ " star rating salons list is displayed in Search Reasults page salons list should be displayed in Search Reasults page",
							Select_StarRating1 + " star rating salons " + NumberOfHaircut_SalonsList
									+ "  displayed in Search Reasults page");
								} else if (NumberOfHaircut_SalonsList == 0) {
					browser.reportscomtep("Passed",
							"Verify " + Select_StarRating1
									+ " star rating salons list is not displayed in Search Reasults page",
							Select_StarRating1
									+ " star rating salons list is displayed in Search Reasults page salons list should not be displayed in Search Reasults page",
							Select_StarRating1 + " star rating salons " + NumberOfHaircut_SalonsList
									+ " not displayed in Search Reasults page");
				}
			} else {
				browser.reportscomtep("Failed", "Verify the Search Results page of the Filters Section is displayed",
						"Search Results page of the Filters Section should be displayed",
						"Search Results page of the Filters Section not displayed");

			}
		} catch (Exception e) {
			System.out.println("Error description: " + e.getStackTrace());
		}
	}*/

}