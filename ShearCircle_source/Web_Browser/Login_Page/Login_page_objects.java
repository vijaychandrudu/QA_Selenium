package Web_Browser.Login_Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_page_objects {
	@FindBy(xpath="//div/div[1]/a/img")
    public WebElement ShearCircle_Image;
	
	@FindBy(xpath="//*[@id='navbar-collapse-1']/span/a[text()='Login']")
    public WebElement Login_Link;
	
	@FindBy(xpath="//*[@id='navbar-collapse-1']/span/a[contains(text(),'Circle')]")
    public WebElement JoinOurCircle_Link;
	
	@FindBy(xpath="//*[@id='username']")
    public WebElement Login_UserName_textbox;
	@FindBy(xpath="//*[@id='password']")
    public WebElement Login_PassWord_textbox;
	@FindBy(xpath="//*[@id='login_form']/div/p/a/u")
    public WebElement Login_forgotPassword_textbox;
	@FindBy(xpath="//*[@id='login_form']/div/div/center/button")
    public WebElement Login_signin_button;
	@FindBy(xpath="//*[@id='customBtn']")
    public WebElement Login_google_textbox;
	@FindBy(xpath="//*[@id='fbLink']")
    public WebElement Login_facebook_textbox;
	@FindBy(xpath="//section/div/h5/a/u")
    public WebElement Login_JoinOurCircle_textbox;

}
