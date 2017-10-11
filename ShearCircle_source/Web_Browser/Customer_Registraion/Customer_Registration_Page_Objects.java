package Web_Browser.Customer_Registraion;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Customer_Registration_Page_Objects{
	@FindBy(xpath="//*[@name='firstname']")	
    public WebElement CR_FirstName_textbox;	
	@FindBy(xpath="//input[@name='lastname']")
	public WebElement CR_LastName_textbox;	
	@FindBy(xpath="//input[@name='username']")
	public WebElement CR_Email_textbox;
	@FindBy(xpath="//*[@id='password']")
	public WebElement CR_Password_textbox;
	@FindBy(xpath="//input[@name='cnf_password']")
	public WebElement CR_ReEnterPassword_textbox;
	@FindBy(xpath="//input[@name='has_agreed']")
	public WebElement CR_Termsofservice_checkbox;
	@FindBy(xpath="//input[@name='accepted_billing_agreement']")
	public WebElement CR_billingagrement_checkbox;
	@FindBy(xpath="//*[@id='register_form']/div/button")
	public WebElement CR_joinourcircle_button;
	@FindBy(xpath="//div/h5/a/u['Sign in']")
	public WebElement CR_signin_button;
		
}
