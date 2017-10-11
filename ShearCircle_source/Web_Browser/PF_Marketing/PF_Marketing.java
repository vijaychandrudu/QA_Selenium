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
	public WebElement PF_Db_Services_addnewgroup;
		
	@FindBy(xpath="//div/input[@name='group_name']")
	public WebElement PF_Db_Services_addgroup_groupName;
	
	@FindBy(xpath="//button[@class='btn btn-primary ng-scope']")
	public WebElement PF_Db_Services_addgroup_ADd;
		
	@FindBy(xpath="//*[@id=\"serviceAddUpdateForm\"]//div[@class='modal-footer']/button[@class='btn btn-default']")
	public WebElement PF_Db_Services_addgroup_Close;

	@FindBy(xpath="//div[1]/span/a[@class='btn btn-sm btn-primary']")
	public WebElement PF_Db_Services_addnewservice;

	@FindBy(xpath="//*[@class='form-control  ng-pristine ng-empty ng-invalid ng-invalid-required ng-touched']")
	public WebElement PF_Db_Services_addnewservice_serviceName;

	@FindBy(xpath="//div/span/button[@class='btn btn-success']")
	public WebElement PF_Db_Services_addnewgroup1;

}
