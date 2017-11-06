package com.shearcircle.objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Customer_Module_Page_Objects{
//object information

	@FindBy(xpath="//*[@id='sub_content']/h1[text()='Register With ShearCircle']")	
    public WebElement Customer_RegisterWithShearCircle_Header;	
	
	@FindBy(xpath="//div/h1/b[text()='Customer?']//parent::h1/following-sibling::a[text()='Join Our Circle']")	
    public WebElement customerJoinCircle_Link;	
	
	@FindBy(xpath="//div/h1/b[text()='Professional?']//parent::h1/following-sibling::a[text()='Join Our Circle']")	
    public WebElement ProfessionalJoinCircle_Link;	
	
	@FindBy(xpath="//div/h2/b[text()='Join Now']")	
    public WebElement Customer_JoinNow_Header;	
	
	public WebElement CustomerReg_JoinNow_Header;	
	@FindBy(xpath="//*[@id=\"position\"]/div/ul/li[text()='Customer']")	
    public WebElement Customer_Joincircle_navigation;	
	@FindBy(xpath="//*[@id='position']/div/ul/li[text()='Professional']")	
    public WebElement Subscriber_Joincircle_navigation;		
	@FindBy(xpath="//*[@name='firstname']")	
    public WebElement Customer_FirstName_textbox;	
	@FindBy(xpath="//input[@name='lastname']")
	public WebElement Customer_LastName_textbox;	
	@FindBy(xpath="//input[@name='username']")
	public WebElement Customer_Email_textbox;
	@FindBy(xpath="//*[@id='password']")
	public WebElement Customer_Password_textbox;
	@FindBy(xpath="//input[@name='cnf_password']")
	public WebElement Customer_ReEnterPassword_textbox;
	@FindBy(xpath="//input[@name='has_agreed']")
	public WebElement Customer_Termsofservice_checkbox;
	@FindBy(xpath="//input[@name='accepted_billing_agreement']")
	public WebElement Customer_billingagrement_checkbox;
	@FindBy(xpath="//*[@id='register_form']/div/button")
	public WebElement Customer_joinourcircle_button;
	@FindBy(xpath="//div/h5/a/u['Sign in']")
	public WebElement Customer_signin_button;
	
	@FindBy(xpath="//div/h2[text()='Congratulations..!']")
	public WebElement Customer_Success_Message;
	
	@FindBy(xpath="//div/p[contains(text(),'Registration successful')]")
	public WebElement Customer_Success_Message1;
	
	@FindBy(xpath="//div/div/button[@class='confirm']")
	public WebElement Customer_Confirmation_OK_Button;	
			
	@FindBy(xpath="//*[@id='register_form']/div/em[@for='firstname']")
	public WebElement Customer_invalidFirstname_errorMessage;	
	
	@FindBy(xpath="//*[@id='register_form']/div/em[@for='lastname']")
	public WebElement Customer_invalidLastname_errorMessage;	
		
	@FindBy(xpath="//*[@id='register_form']/div/em[text()='The entered email is already registered.']")
	public WebElement Customer_invalidEmail_errorMessage;
	
	@FindBy(xpath="//*[@id='register_form']/div/em[@for='password']")
	public WebElement Customer_invalidPassword_errorMessage;
	
	@FindBy(xpath="//*[@id='register_form']/div/em[@for='cnf_password']")
	public WebElement Customer_invalidRePassword_errorMessage;
	
	@FindBy(xpath="//*[@id='register_form']/div//em[@for='has_agreed']")
	public WebElement Customer_AcceptTermsandConditons_errorMessage;
	
	@FindBy(xpath="//*[@id='register_form']/div//em[@for='accepted_billing_agreement']")
	public WebElement Customer_AcceptourbillingAgreement_errorMessage;	
	
	@FindBy(xpath="//*[@id='register_form']//u[text()='Terms of Service']")
	public WebElement Customer_termsofservice_hyperlynk;

	@FindBy(xpath="//*[@id='register_form']//u[text()='Privacy Policy']")
	public WebElement Customer_privacypolycy_hyperlynk;

	@FindBy(xpath="//*[@id='register_form']//u[text()='Billing Agreement']")
	public WebElement Customer_billingaggrement_hyperlynk;

	@FindBy(xpath="//*[@id='myModalLabel'][text()='Terms and Conditions']")
	public WebElement Customer_termsofservice_hyperlynk_header;

	@FindBy(xpath="//section[2]/div/h5/a/u[text()='Sign in']")
	public WebElement Customer_signin_hyperlynk;

	@FindBy(xpath="//*[@id='myModalLabel'][text()='Privacy Policy']")
	public WebElement Customer_privacypolycy_hyperlynk_header;

	@FindBy(xpath="//*[@id='myModalLabel'][text()='Billing Agreement']")
	public WebElement Customer_billingaggrement_hyperlynk_header;

	@FindBy(xpath="//*[@id='sub_content']/h1")
	public WebElement Customer_signin_hyperlynk_header;
	
	
	
	

}
