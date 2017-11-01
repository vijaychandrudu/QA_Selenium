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
	public Customer_Module_Page_Objects SCRegistration;
	public Login_page_objects Login;
	public CommonFunctions browser;	
	String TestDataPath = null;
	public Customer_Module_Page_Components() throws IOException {			
		TestDataPath = browser.TestDataPathOf("CustomerTestData.properties");
		SCRegistration = PageFactory.initElements(driver, Customer_Module_Page_Objects.class);
		Login = PageFactory.initElements(driver, Login_page_objects.class);
	}
	//Application launch
	public void launchApplication(){
		String baseUrl = null;
	    try {   
	    	browser.loaddata(TestDataPath);
	    	baseUrl = browser.getdata("TestBedURL");
		    driver.get(baseUrl + "");
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);  
		    //driver.wait(5);
		    String apptitle = driver.getTitle();
		    if (apptitle.equalsIgnoreCase(baseUrl)){
		    System.out.println("Browser Tilte:"+apptitle);     
		    }		    
			
		    if(browser.elmentisdisplayed(Login.Home_ShearCircle_Image)) {
				 System.out.println("ShearCircle Image displayed");
			 }else {
				 System.out.println("ShearCircle Image not displayed");
			 }
			  
		  }catch(Exception e){
				  System.out.println("Exception: "+e); 
		  }	
	}	
	
	public void customer_Registration(){
		String FirstName = null;
		String LastName = null;
		String customerEmail = null;
		String Password = null;
		browser.loaddata(TestDataPath);
		FirstName = browser.getdata("FirstName");
		LastName = browser.getdata("LastName");
		customerEmail = browser.getdata("customerEmail");
		Password = browser.getdata("Password");
		
		try{
			if(browser.elmentisdisplayed(Login.Home_JoinOurCircle_Link)) {
				browser.reportscomtep("Passed", "Verify JoinCircle link is displayed"  , "JoinCircle link should be displayed", "JoinCircle link is displayed");
				browser.click(Login.Home_JoinOurCircle_Link);
				//browser.wait(5);
				if(browser.elmentisdisplayed(SCRegistration.Customer_customerJoinCircle_Link)){
					browser.reportscomtep("Passed", "Verify Customer JoinCircle link is displayed"  , "Customer JoinCircle link should be displayed", "Customer JoinCircle link is displayed");
					browser.click(SCRegistration.Customer_customerJoinCircle_Link);
					//browser.wait(5);
					if(browser.elmentisdisplayed(SCRegistration.Customer_JoinNow_Header)){
						
						browser.Verify_elmentisdisplayed_Report(SCRegistration.Customer_FirstName_textbox, "FirstName textbox");
						browser.sendkeys(SCRegistration.Customer_FirstName_textbox,FirstName);
						browser.Verify_elmentisdisplayed_Report(SCRegistration.Customer_LastName_textbox, "LastName textbox");
						browser.sendkeys(SCRegistration.Customer_LastName_textbox,LastName);
						browser.Verify_elmentisdisplayed_Report(SCRegistration.Customer_Email_textbox, "Email textbox");
						browser.sendkeys(SCRegistration.Customer_Email_textbox,customerEmail);
						browser.Verify_elmentisdisplayed_Report(SCRegistration.Customer_Password_textbox, "Password textbox");
						browser.sendkeys(SCRegistration.Customer_Password_textbox,Password);
						browser.Verify_elmentisdisplayed_Report(SCRegistration.Customer_ReEnterPassword_textbox, "ReEnteredPassword textbox");
						browser.sendkeys(SCRegistration.Customer_ReEnterPassword_textbox,Password);
						browser.Verify_elmentisdisplayed_Report(SCRegistration.Customer_Termsofservice_checkbox, "Termsofservice checkbox");
						browser.check_Checkbox(SCRegistration.Customer_Termsofservice_checkbox);
						browser.Verify_elmentisdisplayed_Report(SCRegistration.Customer_billingagrement_checkbox, "billingagrement Checkbox");
						browser.check_Checkbox(SCRegistration.Customer_billingagrement_checkbox);
						browser.Verify_elmentisdisplayed_Report(SCRegistration.Customer_joinourcircle_button, "JoinCircle Button");
						browser.click(SCRegistration.Customer_joinourcircle_button);
						
					}
				}else {
					browser.reportscomtep("Failed", "Verify Customer JoinCircle link is displayed"  , "Customer JoinCircle link should be displayed", "Customer JoinCircle link not displayed");
				}
			}else {
				browser.reportscomtep("Failed", "Verify JoinCircle link is displayed"  , "JoinCircle link should be displayed", "JoinCircle link not displayed");
			}
			
		}catch(Exception e){
			System.out.println("Error description: " + e.getStackTrace() );
		}			
		
	}
	
	public void ShearCircle_Verify_Customer_forgotPassword(String p_in_Valid_or_Invalid, String p_in_FinalAction) {
		String customerValidEmail = null;		
		String customerInValidEmail = null;
		String invalid_Message;
		String valid_Message;
		
		browser.loaddata(TestDataPath);
		customerValidEmail = browser.getdata("customerValidEmail");
		customerInValidEmail = browser.getdata("customerInValidEmail");
		invalid_Message = "No records for the Username";
		valid_Message = "Password Reset Instructions Sent Successfully";
		String getmessage = null;
		try{
			if(browser.elmentisdisplayed(Login.Home_Login_Link)) {
				browser.reportscomtep("Passed", "Verify Login link is displayed"  , "Login link should be displayed", "Login link is displayed");
				browser.click(Login.Home_Login_Link);
				//browser.wait(5);
				if(browser.elmentisdisplayed(Login.Login_forgotPassword_Link)){
					browser.reportscomtep("Passed", "Verify Forgotpassword link is displayed"  , "Forgotpassword link should be displayed", "Forgotpassword link is displayed");
					browser.click(Login.Login_forgotPassword_Link);
					//browser.wait(5);
					if(browser.elmentisdisplayed(Login.ResetPassword_Header)){
						browser.reportscomtep("Passed", "Verify Reset Password is displayed"  , "Reset Password should be displayed", "Reset Password is displayed");
						
						browser.Verify_elmentisdisplayed_Report(Login.ResetPassword_UserName_textbox, "UserName textbox");
						browser.Verify_elmentisdisplayed_Report(Login.ResetPassword_SendInstruction_Link, "Send Instruction ForgotPassword Button");
						browser.Verify_elmentisdisplayed_Report(Login.ResetPassword_Cancel_textbox, "Cancel Link");
						
						if(p_in_Valid_or_Invalid.equalsIgnoreCase("Valid")) {
							browser.sendkeys(Login.ResetPassword_UserName_textbox,customerValidEmail);
							
						}else if(p_in_Valid_or_Invalid.equalsIgnoreCase("InValid")){
							browser.sendkeys(Login.ResetPassword_UserName_textbox,customerInValidEmail);
						}
						
						switch(p_in_FinalAction) {
							case "Click Send instructions to reset password":
								browser.click(Login.ResetPassword_SendInstruction_Link);
								
								if(p_in_Valid_or_Invalid.equalsIgnoreCase("Valid")) {
									getmessage = browser.getelementtext(Login.ResetPassword_ValidMessage_text);
									if(valid_Message.equalsIgnoreCase(getmessage)) {
										browser.reportscomtep("Passed", p_in_FinalAction+" and Verify Reset Password Successful message is displayed"  , "Reset Password Successful message should be displayed", "Reset Password Successful message displayed as : "+ getmessage);
									}else {
										browser.reportscomtep("Failed", p_in_FinalAction+ " and Verify Reset Password Successful message is displayed"  , "Reset Password Successful message should be displayed", "Reset Password Successful message Not displayed as :"+valid_Message);
									}								
								}else if(p_in_Valid_or_Invalid.equalsIgnoreCase("InValid")){
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
								if(browser.elmentisdisplayed(Login.Login_forgotPassword_Link)) {
									browser.reportscomtep("Passed", p_in_FinalAction+ " and Verify Customer navigate Reset Password page"  , "Customer should be navigate Reset Password page", "Customer navigated Reset Password page");
								}else {
									browser.reportscomtep("Failed", p_in_FinalAction+ " and Verify Customer navigate Reset Password page"  , "Customer should be navigate Reset Password page", "Customer Not navigated Reset Password page");
									
								}
							break;
						}					
						
						
					}else {
						browser.reportscomtep("Failed", "Verify Reset Password is displayed"  , "Reset Password should be displayed", "Reset Password is Not displayed");
					}
						
				}else {
					browser.reportscomtep("Failed", "Verify Forgotpassword link is displayed"  , "Forgotpassword link should be displayed", "Forgotpassword link is displayed");
				}
			}else {
				browser.reportscomtep("Failed", "Verify Login link is displayed"  , "Login link should be displayed", "Login link is not displayed");
			}
			
		}catch(Exception e){
			System.out.println("Error description: " + e.getStackTrace() );
		}	
	}
	
	
	public void joinourcircle() {
		 browser.loaddata(TestDataPath);
		 try {
		 if(browser.elmentisdisplayed(Login.Home_JoinOurCircle_Link)) {
				browser.reportscomtep("Passed", "Verify JoinCircle link is displayed"  , "JoinCircle link should be displayed", "JoinCircle link is displayed");
				browser.click(Login.Home_JoinOurCircle_Link);
				//browser.wait(5);
				if(browser.elmentisdisplayed(SCRegistration.Customer_customerJoinCircle_Link)){
					browser.reportscomtep("Passed", "Verify Customer JoinCircle link is displayed"  , "Customer JoinCircle link should be displayed", "Customer JoinCircle link is displayed");
					if(browser.elmentisdisplayed(SCRegistration.Customer_ProfessionalJoinCircle_Link)){
						browser.reportscomtep("Passed", "Verify Profession JoinCircle link is displayed"  , "Profession JoinCircle link should be displayed", "Profession JoinCircle link is displayed");
					}else {
				     browser.reportscomtep("Failed", "Verify Customer JoinCircle link is displayed"  , "Customer JoinCircle link should be displayed", "Customer JoinCircle link not displayed");
					}
				
					 }else {
					browser.reportscomtep("Failed", "Verify Profession JoinCircle link is displayed"  , "Profession JoinCircle link should be displayed", "Customer JoinCircle link not displayed");
							}
		 }else {
				browser.reportscomtep("Failed", "Verify JoinCircle link is displayed"  , "JoinCircle link should be displayed", "JoinCircle link not displayed");
			}
		 
		 }catch(Exception e){
			System.out.println("Error description: " + e.getStackTrace() );
		}			
	 }
}