package Web_Browser.Professional_Registraion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Web_Browser.Web_Browser;
import Web_Browser.Professional_Registraion.Professional_Registration_Page_Objects;

public class Professional_Registration_Page_Components {
	public WebDriver driver;
	public Professional_Registration_Page_Objects PF;
	public Professional_Registration_Page_Components(WebDriver driver) {
		PF = PageFactory.initElements(driver, Professional_Registration_Page_Objects.class);
				
	}
	Web_Browser browser = new Web_Browser();
	public void Professional_Registration(){
		browser.sendkeys(PF.PF_FirstName_textbox,"FName");
		browser.sendkeys(PF.PF_LastName_textbox,"Lname");
		browser.sendkeys(PF.PF_Email_textbox,"test5@test.com");
		browser.sendkeys(PF.PF_businessName_textbox,"abc123");
		browser.sendkeys(PF.PF_Subdomain_textbox,"shearcircle.com");
		browser.sendkeys(PF.PF_Password_textbox,"akhil");
		browser.sendkeys(PF.PF_ReEnterPassword_textbox,"akhil");
		browser.check_Checkbox(PF.PF_Termsofservice_checkbox);
		browser.check_Checkbox(PF.PF_billingagrement_checkbox);
		
	}
	
}
