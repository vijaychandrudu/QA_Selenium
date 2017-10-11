package Web_Browser.Professional_Registraion;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Professional_Registration_Page_Objects {
	
	@FindBy(xpath="//*[@id='firstname']")
    public WebElement PF_FirstName_textbox;
	
	@FindBy(xpath="//input[@name='lastname']")
	public WebElement PF_LastName_textbox;
	
	@FindBy(xpath="//input[@name='username']")
	public WebElement PF_Email_textbox;
	
	@FindBy(xpath="//input[@name='business_name']")
	public WebElement PF_businessName_textbox;
	
	@FindBy(xpath="//input[@name='subdomain']")
	public WebElement PF_Subdomain_textbox;
	
	@FindBy(xpath="//*[@id='password']")
	public WebElement PF_Password_textbox;
	
	@FindBy(xpath="//input[@name='cnf_password']")
	public WebElement PF_ReEnterPassword_textbox;
	
	@FindBy(xpath="//input[@name='has_agreed']")
	public WebElement PF_Termsofservice_checkbox;
	
	@FindBy(xpath="//input[@name='accepted_billing_agreement']")
	public WebElement PF_billingagrement_checkbox;
	
	@FindBy(xpath="//*[@id='register_form']/div/button[contains(text(),'free trial')]")
	public WebElement PF_joinourcircle_button;
	
	@FindBy(xpath="//input[@name='business_name']")
	public WebElement PF_signin_button;
	

}
