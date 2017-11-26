package com.shearcircle.pagecomponents;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.shearcircle.objectrepository.Customer_Module_Page_Objects;
import com.shearcircle.objectrepository.Login_page_objects;
import com.shearcircle.utilities.CommonFunctions;
import com.shearcircle.utilities.StaticVariables;

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
			
			GetRandomNo = browser.getRandomNumberInRange(000, 9999);
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
			String Actual_FirstNameErrorMessage = null;
			String Actual_LastNameErrorMessage = null;
			String Actual_invalidEmailErrorMessage=null;
			String Actual_invalidPasswordErrorMessage=null;
			String Actual_invalidRePasswordErrorMessage=null;
			
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
				
				browser.sendkeys(CustomerModule.Customer_Password_textbox,Password);
				
				browser.sendkeys(CustomerModule.Customer_ReEnterPassword_textbox,ConfirmPassword);
				
				browser.check_Checkbox(CustomerModule.Customer_Termsofservice_checkbox);
				
				browser.check_Checkbox(CustomerModule.Customer_billingagrement_checkbox);
				
				browser.click(CustomerModule.Customer_joinourcircle_button);	
				
				if(browser.elementisdisplayed(CustomerModule.Customer_invalidFirstname_errorMessage)){
					Actual_FirstNameErrorMessage = browser.getelementtext(CustomerModule.Customer_invalidFirstname_errorMessage);
					browser.assertEquals(Actual_FirstNameErrorMessage,Expct_FirstNameErrorMessage);
				}
				
				if(browser.elementisdisplayed(CustomerModule.Customer_invalidLastname_errorMessage)){
					Actual_LastNameErrorMessage = browser.getelementtext(CustomerModule.Customer_invalidLastname_errorMessage);
					browser.assertEquals(Actual_LastNameErrorMessage,Expct_LastNameErrorMessage);
				}
				
				if(browser.elementisdisplayed(CustomerModule.Customer_invalidEmail_errorMessage)){
					Actual_invalidEmailErrorMessage = browser.getelementtext(CustomerModule.Customer_invalidEmail_errorMessage);
					browser.assertEquals(Actual_invalidEmailErrorMessage,Expct_invalidEmailErrorMessage);
				}
				
				if(browser.elementisdisplayed(CustomerModule.Customer_invalidPassword_errorMessage)){
					Actual_invalidPasswordErrorMessage = browser.getelementtext(CustomerModule.Customer_invalidPassword_errorMessage);
					browser.assertEquals(Actual_invalidPasswordErrorMessage,Expct_invalidPasswordErrorMessage);
				}
				
				if(browser.elementisdisplayed(CustomerModule.Customer_invalidRePassword_errorMessage)){
					Actual_invalidRePasswordErrorMessage = browser.getelementtext(CustomerModule.Customer_invalidRePassword_errorMessage);
					browser.assertEquals(Actual_invalidRePasswordErrorMessage,Expct_invalidRePasswordErrorMessage);
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
			CustomerValidEmail = browser.getdata("CustomerValidEmail");
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
					browser.click(CustomerModule.Customer_Termsofservice_Close_Button);
				}else {
					browser.reportscomtep("Failed", "Verify terms of service header is displayed"  , "terms of service header should be displayed", "terms of service header is not displayed");
				}
				browser.click(CustomerModule.Customer_privacypolycy_hyperlynk);
				
				if(browser.elementisdisplayed(CustomerModule.Customer_privacypolycy_hyperlynk_header)){
					browser.reportscomtep("Passed", "Verify privacy polycy header is displayed"  , "privacy polycy header should be displayed", "privacy polycy header is displayed");
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
				browser.reportscomtep("Passed", "Verify Don't have an account yet JoinCircle, Login with FaceBood and Login with Google buttons are displayed", "Don't have an account yet JoinCircle, Login with FaceBood and Login with Google buttons should be displayed", "Don't have an account yet JoinCircle, Login with FaceBood and Login with Google buttons displayed");
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
				browser.reportscomtep("Failed", "Verify Don't have an account yet JoinCircle, Login with FaceBood and Login with Google buttons are displayed", "Don't have an account yet JoinCircle, Login with FaceBood and Login with Google buttons should be displayed", "Don't have an account yet JoinCircle, Login with FaceBood and Login with Google buttons Not displayed");
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
		CustomerValidEmail = browser.getdata("CustomerValidEmail");			
		CustomerValidPassword = browser.getdata("CustomerValidPassword");
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
					browser.reportscomtep("Passed", "click LogOut button link and verify Customer sent to ShearCircle Home page"  , "Customer will sent to ShearCircle Home page", "Customer sent to ShearCircle Home page");					
					
				}else {
					browser.reportscomtep("Failed", "click LogOut button link and verify Customer sent to ShearCircle Home page"  , "Customer will sent to ShearCircle Home page", "Customer Not sent to ShearCircle Home page");				
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
					WelcomeFullName = browser.getelementtext(CustomerModule.Customer_Mydashboard_fullname);
					browser.Verify_elementisdisplayed_Report(CustomerModule.Customer_Mydashboard_fullname, WelcomeFullName);
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
					
					if(browser.elementisdisplayed(CustomerModule.Customer_Mydashboard_myfavourites_header)){
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
					
					if(browser.elementisdisplayed(CustomerModule.Customer_Mydashboard_myfavourites_header)){
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
					
					if(browser.elementisdisplayed(CustomerModule.Customer_Mydashboard_myfavourites_header)){
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
						browser.Verify_elementisdisplayed_Report(CustomerModule.Customer_Mydashboard_fullname,
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
								"Mydashboard bookme share");

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
					browser.wait(5);
					if(browser.elementisdisplayed(CustomerModule.Customer_Mydashboard_myfavourites_businesslist_remove_header)){
						browser.reportscomtep("Passed", "Verify Removed popup is displayed"  , "Removed popup should be displayed", "Removed popup is displayed");
						browser.click(CustomerModule.Customer_Mydashboard_myfavourites_businesslist_remove_header_ok);
					
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

	public void shearCircle_Verify_Customer_clickson_Myappoinments() {
			
		try {

			if (browser.elementisdisplayed(CustomerModule.Customer_Mydashboard_header)) {

				browser.reportscomtep("Passed", "Verify Customer Registration form My dashboard header is displayed",
						"Customer Registration form My dashboard header should be displayed",
						"Customer Registration form My dashboard header is displayed");

				browser.click(CustomerModule.Customer_Myappoinments_Button);
				

				if (browser.elementisdisplayed(
						CustomerModule.Customer_Mydashboard_Myappoinments_Noappoinments_header)) {
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

					/*
					 * }else if(browser.elementisdisplayed(CustomerModule.
					 * Customer_Mydashboard_Myappoinments_selectedappoinments_header
					 * )){ browser.reportscomtep("passed",
					 * "Verify selected appoinments is displayed" ,
					 * "selected appoinments should be displayed",
					 * " selected appoinments is  displayed");
					 * 
					 * }else { browser.reportscomtep("Failed",
					 * "Verify selected appoinments is displayed" ,
					 * "selected appoinments should be displayed",
					 * " selected appoinments is not displayed");
					 * 
					 * 
					 * }
					 */
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

	public void shearCircle_Verify_Customer_clickson_Settings() {

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
	}

	/*****************************  Check whether My Appointments is clickable	  *************************/

	public void shearCircle_Verify_Customer_Clickson_MyAppoinments() {
			
		try {

			if (browser.elementisdisplayed(CustomerModule.Customer_Mydashboard_header)) {

				browser.reportscomtep("Passed", "Verify Customer My dashboard header is displayed",
						"Customer My dashboard header should be displayed",
						"Customers My dashboard header is displayed");

				browser.click(CustomerModule.Customer_Myappoinments_Button);
		
				if (browser.elementisdisplayed(
						CustomerModule.Customer_Mydashboard_Myappoinments_header)) {
					browser.reportscomtep("Passed", "verify My appoinments header is displayed ",
							"My appoinments header should be displayed", "My appoinments header is displayed");
					browser.Verify_elementisdisplayed_Report(
							CustomerModule.Customer_Mydashboard_Myappoinments_Noappoinments_header,
							"Mydashbord Noappoinments header");

					browser.Verify_elementisdisplayed_Report(
							CustomerModule.Customer_Mydashboard_Myappoinments_selectedappoinments_header,
							"Mydashboard selected appoinments header");

				} else {
					browser.reportscomtep("Failed", "verify My appoinments header is displayed ",
							"My appoinments header should be displayed", "My appoinments header is not displayed");
					
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
	
	/*****************************  Check whether Settings is clickable	  *************************/

	public void shearCircle_Verify_Customer_Clickson_Settings() {
			
		try {

			if (browser.elementisdisplayed(CustomerModule.Customer_Mydashboard_header)) {

				browser.reportscomtep("Passed", "Verify Customer My dashboard header is displayed",
						"Customer My dashboard header should be displayed",
						"Customers My dashboard header is displayed");

				browser.click(CustomerModule.Customer_Mydashboard_Settings_Button);
		
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

				} else {
					browser.reportscomtep("Failed", "Verify settings header is displayed",
							"settings header should be displayed", "settings header is not displayed");
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
		/*****************************  Check the info in My Appointments for first time login/ without creating any bookings	  *************************/

	public void shearCircle_Verify_Customer_Clickson_MyAppoinments_firsttime_Login() {
		
		try {

			if (browser.elementisdisplayed(CustomerModule.Customer_Mydashboard_header)) {

				browser.reportscomtep("Passed", "Verify Customer My dashboard header is displayed",
						"Customer My dashboard header should be displayed",
						"Customers My dashboard header is displayed");

				browser.click(CustomerModule.Customer_Myappoinments_Button);
				if(browser.elementisdisplayed(CustomerModule.Customer_Mydashboard_Myappoinments_Noappoinments_header)){
					browser.reportscomtep("Passed", "Verify No Appoinments is displayed",
												"No Appoinments should be displayed", "No Appoinments is displayed");
					browser.Verify_elementisdisplayed_Report(CustomerModule.Customer_Mydashboard_Myappoinments_Noappoinments_header,
							"Mydashboard Noappoinments header");
					browser.Verify_elementisdisplayed_Report(CustomerModule.Customer_Mydashboard_Myappoinments_type,
							"Mydashboard Myappoinments Type");

					browser.Verify_elementisdisplayed_Report(CustomerModule.Customer_Mydashboard_Myappoinments_status,
							"Mydashboard Myappoinments Status");

				}else{
					browser.reportscomtep("Failed", "Verify No Appoinments is displayed",
							"No Appoinments should be displayed", "No Appoinments is not displayed");
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
	/*****************************  Check info in My Appointments for account that has made bookings previously		  *************************/

	public void shearCircle_Verify_Customer_Clickson_MyAppoinments_Accountholder_Login() {
		
		try {

			if (browser.elementisdisplayed(CustomerModule.Customer_Mydashboard_header)) {

				browser.reportscomtep("Passed", "Verify Customer My dashboard header is displayed",
						"Customer My dashboard header should be displayed",
						"Customers My dashboard header is displayed");

				browser.click(CustomerModule.Customer_Myappoinments_Button);
			if (browser.elementisdisplayed(CustomerModule.Customer_Mydashboard_Myappoinments_selectedappoinments_header)) {
					browser.reportscomtep("Passed", "Verify list of appoinments is displayed with view button",
							"list of appoinments with view button should be displayed", "list of appoinments  with view button is displayed");
					
					browser.Verify_elementisdisplayed_Report(CustomerModule.Customer_Mydashboard_Myappoinments_View,
							"Mydashboard appoinments View");
					browser.Verify_elementisdisplayed_Report(CustomerModule.Customer_Mydashboard_Myappoinments_pagebookings,
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
	
			}

