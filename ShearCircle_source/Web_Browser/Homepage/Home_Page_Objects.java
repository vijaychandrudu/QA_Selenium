package Web_Browser.Homepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home_Page_Objects {
	@FindBy(xpath="//*[contains(@id,'navbar-collapse')]/span/a[text()='Login']")
    public WebElement Home_Login_Button;
	@FindBy(xpath="//*[contains(@id,'navbar-collapse')]/span/a[text()='Join Our Circle ']")
	public WebElement home_JoinOurCircle_textbox;

	
}
