package com.shearcircle.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Subscriber_Module_Page_Objects {

	@FindBy(xpath = "//input[@name='business_name']")
	public WebElement Subscriber_Signin_Button;
	
	@FindBy(xpath = "//*[@id='firstname']")
	public WebElement Subscriber_FirstName_Textbox;

	@FindBy(xpath = "//input[@name='lastname']")
	public WebElement Subscriber_LastName_Textbox;

	@FindBy(xpath = "//input[@name='username']")
	public WebElement Subscriber_Email_Textbox;

	@FindBy(xpath = "//input[@name='business_name']")
	public WebElement Subscriber_BusinessName_Textbox;

	@FindBy(xpath = "//input[@name='subdomain']")
	public WebElement Subscriber_Subdomain_textbox;

	@FindBy(xpath = "//*[@id='password']")
	public WebElement Subscriber_Password_textbox;

	@FindBy(xpath = "//input[@name='cnf_password']")
	public WebElement Subscriber_ReEnterPassword_textbox;

	@FindBy(xpath = "//input[@name='has_agreed']")
	public WebElement Subscriber_Termsofservice_checkbox;

	@FindBy(xpath = "//input[@name='accepted_billing_agreement']")
	public WebElement Subscriber_billingagrement_checkbox;

	@FindBy(xpath = "//*[@id='register_form']/div/button[contains(text(),'free trial')]")
	public WebElement Subscriber_joinourcircle_button;

	@FindBy(xpath = "//div/div/button[@class='btn btn-block btn-primary']")
	public WebElement Subscriber_Db_MC_Promotion_AddNEw;

	@FindBy(xpath = "//*[@id='service_category']")
	public WebElement Subscriber_Db_MC_Promotion_Servicecategory;

	@FindBy(xpath = "//*[@id='ptitle']")
	public WebElement Subscriber_Db_MC_Promotion_title;

	@FindBy(xpath = "//*[@id='addUpdatePromotion']/div/textarea")
	public WebElement Subscriber_Db_MC_Promotion_Descreption;
	@FindBy(xpath = "//*[@id='up_image']")
	public WebElement Subscriber_Db_MC_Promotion_choosefile_Button;
	@FindBy(xpath = "//*[@id='promotion_code']")
	public WebElement Subscriber_Db_MC_Promotion_Pcode;
	@FindBy(xpath = "//*[@id='dis_amt_percentage']")
	public WebElement Subscriber_Db_MC_Promotion_discount;
	@FindBy(xpath = "//*[@id='valid_from']")
	public WebElement Subscriber_Db_MC_Promotion_validfrom;
	@FindBy(xpath = "//*[@id='expiry_date']")
	public WebElement Subscriber_Db_MC_Promotion_Expirydate_Text;

	@FindBy(xpath = "//*[@id='add_new_promotion']//div/button[@class='btn btn-primary']")
	public WebElement Subscriber_Db_MC_Promotion_Save_Button;
	@FindBy(xpath = "//*[@id='add_new_promotion']//button[@class='btn btn-default']")
	public WebElement Subscriber_Db_MC_Promotion_close_Button;
	@FindBy(xpath = "//div/a[@class='btn btn-block btn-primary']")
	public WebElement Subscriber_Db_MC_Staff_newstaff_Button;
	@FindBy(xpath = "//div/input[@ng-model='searchStaffByKeyword']")
	public WebElement Subscriber_Db_MC_Staff_search_Edit;
	@FindBy(xpath = "//*[@id='details']//div/input[@name='firstname']")
	public WebElement Subscriber_Db_MC_Staff_addstaff_FN;
	@FindBy(xpath = "//*[@id='details']//div/input[@name='lastname']")
	public WebElement Subscriber_Db_MC_Staff_addstaff_LN;

	@FindBy(xpath = "//*[@id='details']/div/div[1]//input[@name='mobile']")
	public WebElement Subscriber_Db_MC_Staff_addstaff_MN;

	@FindBy(xpath = "//*[@id='details']//input[@name='email']")
	public WebElement Subscriber_Db_MC_Staff_addstaff_email;
	@FindBy(xpath = "//*[@id='details']/div/div[3]/div//div/label/input[1]")
	public WebElement Subscriber_Db_MC_Staff_addstaff_day;

	@FindBy(xpath = "//*[@id='details']//label/input[@name='is_appointment_booking_enabled']")
	public WebElement Subscriber_Db_MC_Staff_addstaff_checkbox;

	@FindBy(xpath = "//*[@id='addStaffForm']//div/button[@class='btn btn-default pull-right']")
	public WebElement Subscriber_Db_MC_Staff_addstaff_button;
	@FindBy(xpath = "//*[@id='addStaffForm']//div/button[@class='btn btn-default pull-right']")
	public WebElement Subscriber_Db_MC_Staff_addstaff_close_button;
	@FindBy(xpath = "//*[@id='addStaffForm']//li/a[@aria-controls='services']")
	public WebElement Subscriber_Db_MC_Staff_addstaff_services;
	@FindBy(xpath = "//*[@id='selectAllServices']")
	public WebElement Subscriber_Db_MC_Staff_addstaff_selectall;

	@FindBy(xpath = "//*[@id=\"services\"]//div/div/label/input")
	public WebElement Subscriber_Db_MC_Staff_addstaff_selectcheckbox;

	@FindBy(xpath = "//*[@id='contact_us_form']/div//input[@ng-model='contact.name']")
	public WebElement Subscriber_Db_Marketing_Name;

	@FindBy(xpath = "//*[@id=\"contact_us_form\"]//div/textarea")
	public WebElement Subscriber_Db_Marketing_offerDetails;

	@FindBy(xpath = "//div/input[@ng-model='contact.name']")
	public WebElement Subscriber_Db_Marketing_Uploadcreativity;

	@FindBy(xpath = "//div/input[@ng-model='contact.name']")
	public WebElement Subscriber_Db_Marketing_submit;

	@FindBy(xpath = "//div/span/button[@class='btn btn-success']")
	public WebElement Subscriber_Db_Services_addnewgroup;

	@FindBy(xpath = "//div/input[@name='group_name']")
	public WebElement Subscriber_Db_Services_addgroup_groupName;

	@FindBy(xpath = "//button[@class='btn btn-primary ng-scope']")
	public WebElement Subscriber_Db_Services_addgroup_ADd;

	@FindBy(xpath = "//*[@id=\"serviceAddUpdateForm\"]//div[@class='modal-footer']/button[@class='btn btn-default']")
	public WebElement Subscriber_Db_Services_addgroup_Close;
	@FindBy(xpath = "//div[1]/span/a[@class='btn btn-sm btn-primary']")
	public WebElement Subscriber_Db_Services_addnewservice;
	@FindBy(xpath = "//*[@class='form-control  ng-pristine ng-empty ng-invalid ng-invalid-required ng-touched']")
	public WebElement Subscriber_Db_Services_addnewservice_serviceName;
	@FindBy(xpath = "//div/span/button[@class='btn btn-success']")
	public WebElement Subscriber_Db_Services_addnewgroup1;

}
