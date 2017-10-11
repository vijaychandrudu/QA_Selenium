package Web_Browser.Customer_Registraion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Web_Browser.Web_Browser;

public class Customer_Registration_Page_Components {
	public WebDriver driver;
	public Customer_Registration_Page_Objects CR;
	public Customer_Registration_Page_Components(WebDriver driver) {
		CR = PageFactory.initElements(driver, Customer_Registration_Page_Objects.class);
				
	}
	Web_Browser browser = new Web_Browser();
	public void Customer_Registration(String p_in_email, String p_in_Password){
		String FirstName = "FName";
		String LastName = "LName";
	
		try{
			browser.sendkeys(CR.CR_FirstName_textbox,FirstName);
			browser.sendkeys(CR.CR_LastName_textbox,LastName);
			browser.sendkeys(CR.CR_Email_textbox,p_in_email);
			browser.sendkeys(CR.CR_Password_textbox,p_in_Password);
			browser.sendkeys(CR.CR_ReEnterPassword_textbox,p_in_Password);			
			browser.check_Checkbox(CR.CR_Termsofservice_checkbox);
			browser.check_Checkbox(CR.CR_billingagrement_checkbox);

		}catch(Exception e){
			System.out.println("Error in description: " + e.getStackTrace() );
		}
				
	}
	
}
