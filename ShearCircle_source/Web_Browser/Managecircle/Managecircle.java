package Web_Browser.Managecircle;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Managecircle {
	@FindBy(xpath="//div/div/button[@class='btn btn-block btn-primary']")
    public WebElement PF_Db_MC_Promotion_AddNEw;
	
	@FindBy(xpath="//*[@id='service_category']")
	public WebElement PF_Db_MC_Promotion_Servicecategory;
	
	@FindBy(xpath="//*[@id='ptitle']")
	public WebElement PF_Db_MC_Promotion_title;
	
	@FindBy(xpath="//*[@id='addUpdatePromotion']/div/textarea")
	public WebElement PF_Db_MC_Promotion_Descreption;

	@FindBy(xpath="//*[@id='up_image']")
	public WebElement PF_Db_MC_Promotion_choosefile_Button;

	@FindBy(xpath="//*[@id='promotion_code']")
	public WebElement PF_Db_MC_Promotion_Pcode;

	@FindBy(xpath="//*[@id='dis_amt_percentage']")
	public WebElement PF_Db_MC_Promotion_discount;

	@FindBy(xpath="//*[@id='valid_from']")
	public WebElement PF_Db_MC_Promotion_validfrom;

	@FindBy(xpath="//*[@id='expiry_date']")
	public WebElement PF_Db_MC_Promotion_Expirydate_Text;
	
	@FindBy(xpath="//*[@id='add_new_promotion']//div/button[@class='btn btn-primary']")
	public WebElement PF_Db_MC_Promotion_Save_Button;

	@FindBy(xpath="//*[@id='add_new_promotion']//button[@class='btn btn-default']")
	public WebElement PF_Db_MC_Promotion_close_Button;

	@FindBy(xpath="//div/a[@class='btn btn-block btn-primary']")
	public WebElement PF_Db_MC_Staff_newstaff_Button;

	@FindBy(xpath="//div/input[@ng-model='searchStaffByKeyword']")
	public WebElement PF_Db_MC_Staff_search_Edit;

	@FindBy(xpath="//*[@id=\"details\"]/div/div[1]/div[1]/div[1]/input")
	public WebElement PF_Db_MC_Staff_addstaff_FN;


	
	
}
