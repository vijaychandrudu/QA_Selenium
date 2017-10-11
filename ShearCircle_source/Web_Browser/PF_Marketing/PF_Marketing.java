package Web_Browser.PF_Marketing;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PF_Marketing {

	@FindBy(xpath="//*[@id='contact_us_form']/div//input[@ng-model='contact.name']")
    public WebElement PF_Db_Marketing_Name;
	
	@FindBy(xpath="//*[@id=\"contact_us_form\"]//div/textarea")
	public WebElement PF_Db_Marketing_offerDetails;
	
	@FindBy(xpath="//div/input[@ng-model='contact.name']")
	public WebElement PF_Db_Marketing_Uploadcreativity;
	
	@FindBy(xpath="//div/input[@ng-model='contact.name']")
	public WebElement PF_Db_Marketing_submit;
	
	@FindBy(xpath="//div/span/button[@class='btn btn-success']")
	public WebElement PF_Db_Services_addgroup;
		
	@FindBy(xpath="//div/input[@name='group_name']")
	public WebElement PF_Db_Services_addgroup_groupName;

}
