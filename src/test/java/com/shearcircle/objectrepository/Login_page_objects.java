package com.shearcircle.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_page_objects {
	
	@FindBy(xpath="//div/div[1]/a/img")
    public WebElement Home_ShearCircle_Image;
	
	@FindBy(xpath="//*[contains(@id,'navbar-collapse')]/span/a[text()='Login']")
    public WebElement Home_Login_Link;		
	@FindBy(xpath="//*[@id='navbar-collapse-1']/span/a[contains(text(),'Circle')]")
    public WebElement Home_JoinOurCircle_Link;
	
	@FindBy(xpath="//*[@id='sub_content']/h1")
    public WebElement Login_Page_Header;	
	
	@FindBy(xpath="//div/h5[contains(text(),'have an account yet')]//following-sibling::a/u")
    public WebElement Login_DonthaveaccountJoinOurCircle_Link;
	
	@FindBy(xpath="//*[@id='sub_content']/h1")
    public WebElement Joinourcircle_Page_Header;	
	
	@FindBy(xpath="//*[@id='username']")
    public WebElement Login_UserName_textbox;
	@FindBy(xpath="//*[@id='password']")
    public WebElement Login_PassWord_textbox;
	@FindBy(xpath="//*[@id=\"login_form\"]/div/p/a/u[text()='Forgot Your Password ?']")
    public WebElement Login_forgotPassword_Link;
	@FindBy(xpath="//*[@id='login_form']/div/div/center/button[text()='Sign in']")
    public WebElement Login_signin_button;
	@FindBy(xpath="//*[@id='customBtn']")
    public WebElement Login_Google_Link;
	@FindBy(xpath="//*[@id='fbLink']")
    public WebElement Login_Facebook_Link;
	@FindBy(xpath="//section/div/h5/a/u")
    public WebElement Login_JoinOurCircle_Link;
	
	@FindBy(xpath="//*[@id='navbar-collapse-1']/span/a[text()='Logout']")
    public WebElement Customer_Logout_Button;
	
	@FindBy(xpath="//h4[@id='infoText']")
    public WebElement Login_ErrorMessage_Text;
	
	@FindBy(xpath="//input[@id='username']/parent::div")
    public WebElement Login_UserName_Errormessage_Text;
	
	@FindBy(xpath="//input[@id='password']/parent::div")
    public WebElement Login_PasswordErrorMessage_Text;
	
	@FindBy(xpath="//*[@id='sub_content']/h1[text()='My Dashboard']")
    public WebElement Customer_MyDashboard_Text;
	
	
	@FindBy(xpath="//div/h2/strong[text()='Reset Password']")
    public WebElement ResetPassword_Header;
	
	@FindBy(xpath="//form[@id='forgot_password_form']/div/*[@id='username']")
    public WebElement ResetPassword_UserName_textbox;
	
	@FindBy(xpath="//*[@id='forgot_password_form']/div/button[text()='Send instructions to reset password']")
    public WebElement ResetPassword_SendInstruction_Link;
	
	@FindBy(xpath="//div/h5/a/u[text()='Cancel']")
    public WebElement ResetPassword_Cancel_textbox;
	
	@FindBy(xpath="//div/div/h4[@class='valid-message']")
    public WebElement ResetPassword_ValidMessage_text;
	
	@FindBy(xpath="//div/div/h4[@class='invalid-message']")
    public WebElement ResetPassword_InvalidMessage_text;	

	
	
	
	@FindBy(xpath="//*[@id='content']")
	public WebElement Facebook_Account_Header;	
	@FindBy(xpath="//div[@id='email_container']/div/input[@id='email']")
	public WebElement Facebook_EmailorPhone_Textbox;	 
	@FindBy(xpath="//*[@id='pass']")
	public WebElement Facebook_Password_Textbox;	 
	@FindBy(xpath="//*[@id='u_0_0' and @value='Log In']")
	public WebElement Facebook_Login_Link;
	@FindBy(xpath="//*[@name='__CONFIRM__']")
	public WebElement Facebook_Continue_Link;
	@FindBy(xpath="//* [@class='animated zoomIn']")
	public WebElement Facebook_MyDashboard_Header;
	@FindBy(xpath="//*[@class='animated zoomIn']")
	public WebElement Facebook_RegisterWithShearCircle_Header;

	
	
	/**** google*****/
	@FindBy(xpath="//*[@class='FgbZLd']")
	public WebElement Google_Tocontinue_shearcircle_Text;
	@FindBy(xpath="//*[@id='identifierLink']")           
	public WebElement Google_Use_another_account_Link;		
	@FindBy(xpath="//*[@id='identifierId']")                
	public WebElement Google_EmailorPhone_Textbox;	
	@FindBy(xpath="//*[@id='identifierNext']")
	public WebElement Google_Next_Link;	
	@FindBy(xpath="//*[@name='password']")
	public WebElement Google_Password_Textbox;
	@FindBy(xpath="//*[@id='passwordNext']/content/span[text()='Next']")
	public WebElement Google_PasswordNext_Link;	
	@FindBy(xpath="//*[@id='sub_content']")
	public WebElement Google_MyDashboard_Header;
	@FindBy(xpath="//*[@class='animated zoomIn']")
	public WebElement Google_RegisterWithShearCircle_header;

}
