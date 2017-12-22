package com.shearcircle.objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Subscriber_Module_Page_Objects {

	@FindBy(xpath = "//*[@id='navbar-collapse-1']/span/a[2]")
	public WebElement Subscriber_JoinOurCircle_Button;

	@FindBy(xpath = ".//*[@id='navbar-collapse-1']/span/a[2]")
	public WebElement Subscriber_Customer_JoinOurCircle_Button;

	@FindBy(xpath = "//div/h1/b[text()='Professional?']//parent::h1/following-sibling::a[text()='Join Our Circle']")
	public WebElement Subscriber_Professional_JoinOurCircle_Button;

	@FindBy(xpath = ".//*[@id='firstname']")
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
	@FindBy(xpath = " .//*[@id='register_form']/div[8]/div/label/input")
	public WebElement Subscriber_Termsofservice_checkbox;

	@FindBy(xpath = "//input[@name='accepted_billing_agreement']")
	public WebElement Subscriber_billingAgrement_checkbox;

	@FindBy(xpath = "//*[@id='register_form']/div/button[contains(text(),'free trial')]")
	public WebElement Subscriber_StartFreeTrial_button;

	// Error messages locater
	@FindBy(xpath = ".//*[@id='register_form']/div[1]/em")
	public WebElement Subscriber_FirstnameErrMsg;
	@FindBy(xpath = ".//*[@id='register_form']/div[2]/em")
	public WebElement Subscriber_LastnameErrMsg;
	@FindBy(xpath = ".//*[@id='register_form']/div[3]/em")
	public WebElement Subscriber_EmailaddressErrMsg;
	@FindBy(xpath = ".//*[@id='register_form']/div[5]/em")
	public WebElement Subscriber_SubDomainErrMsg;
	@FindBy(xpath = ".//*[@id='register_form']/div[6]/em")
	public WebElement Subscriber_PasswordErrMsg;
	@FindBy(xpath = ".//*[@id='register_form']/div[7]/em")
	public WebElement Subscriber_ReEnterPasswordErrMsg;
	@FindBy(xpath = ".//*[@id='register_form']/div[8]/div/em/em")
	public WebElement Subscriber_TermsErrMsg;
	@FindBy(xpath = ".//*[@id='register_form']/div[9]/div/label/em")
	public WebElement Subscriber_BillingAgreementErrMsg;
	@FindBy(linkText = "Terms of Service")
	public WebElement Subscriber_TermsOfService_link;
	@FindBy(linkText = "Privacy Policy")
	public WebElement Subscriber_PrivacyPolicy_link;
	@FindBy(xpath = ".//*[@id='myModalLabel']")
	public WebElement Subscriber_TemrsAndConditions_Alert;
	@FindBy(xpath = "html/body/div[3]/div/div/div/div[1]/button")
	public WebElement Subscriber_TemrsAndConditions_Close;
	@FindBy(xpath = "html/body/div[4]/div/div/div/div[1]/button")
	public WebElement Subscriber_PrivacyPolicy_Close;

	@FindBy(xpath = "html/body/section[2]/div/h5/a/u")
	public WebElement Subscriber_Sign_Link;
	@FindBy(xpath = "html/body/section[2]/div/div/div/div/h2")
	public WebElement Subscriber_Alreadyhaveanaccount;
	@FindBy(xpath = ".//*[@id='register_form']/div[5]/div/em")
	public WebElement Subscriber_Subdomain_errMsg;

	@FindBy(xpath = ".//*[@id='navbar-collapse-1']/span/a[1]")
	public WebElement Subscriber_Login_Button;
	@FindBy(xpath = "//*[@id='username']")
	public WebElement Subscriber_UserName_TextBox;
	@FindBy(xpath = "//*[@id='password']")
	public WebElement Subscriber_Password_TextBox;
	@FindBy(xpath = ".//*[@id='login_form']/div[3]/div/center/button")
	public WebElement Subscriber_SignIn_Button;

	// DashBoard Page
	@FindBy(xpath = "html/body/section[2]/div/div/div[1]/div[1]/div/div")
	public WebElement Subscriber_TodaysAppointment_Text;
	@FindBy(xpath = "html/body/section[2]/div/div/div[1]/div[1]/div/table/tbody/tr/td")
	public WebElement Subscriber_NoAppointments_Text;
	@FindBy(xpath = "html/body/section[2]/div/div/div[1]/div[2]/div/h3")
	public WebElement Subscriber_WelcomeBusinessName_Text;
	@FindBy(xpath = "html/body/section[2]/div/div/div[1]/div[2]/div/div[2]/font")
	public WebElement Subscriber_LastLoginDateAndTime;
	@FindBy(xpath = "html/body/section[2]/div/div/div[1]/div[2]/div/center/img")
	public WebElement Subscriber_DefaultSClogo;
	@FindBy(xpath = "html/body/section[2]/div/div/div[2]/div[1]/div/span")
	public WebElement Subscriber_TodaysEarningsAmount;
	@FindBy(xpath = "html/body/section[2]/div/div/div[2]/div[2]/div/span")
	public WebElement Subscriber_ThisMonthsEarningsAmount;
	@FindBy(xpath = "html/body/section[2]/div/div/div[2]/div[3]/div/span")
	public WebElement Subscriber_TotalEarningsAmount;

	@FindBy(xpath = "html/body/section[2]/div/div/div[3]/div[1]/div/table/tbody/tr[1]/td[1]/b")
	public WebElement Subscriber_TotalServiceOffered_Text;
	@FindBy(xpath = "html/body/section[2]/div/div/div[3]/div[1]/div/table/tbody/tr[1]/td[2]/span")
	public WebElement Subscriber_TotalServiceOfferedCount;
	@FindBy(xpath = "html/body/section[2]/div/div/div[3]/div[1]/div/table/tbody/tr[2]/td[1]/b")
	public WebElement Subscriber_TotalProductOffered_Text;
	@FindBy(xpath = "html/body/section[2]/div/div/div[3]/div[1]/div/table/tbody/tr[2]/td[2]/span")
	public WebElement Subscriber_TotalProductOfferedCount;
	@FindBy(xpath = "html/body/section[2]/div/div/div[3]/div[1]/div/table/tbody/tr[3]/td[1]/b")
	public WebElement Subscriber_MyClientList_Text;
	@FindBy(xpath = "html/body/section[2]/div/div/div[3]/div[1]/div/table/tbody/tr[3]/td[2]/span")
	public WebElement Subscriber_MyClientListCount;
	@FindBy(xpath = "html/body/section[2]/div/div/div[3]/div[1]/div/table/tbody/tr[4]/td[1]/b")
	public WebElement Subscriber_TotalStaff_Text;
	@FindBy(xpath = "html/body/section[2]/div/div/div[3]/div[1]/div/table/tbody/tr[4]/td[2]/span")
	public WebElement Subscriber_TotalStaffCount;
	@FindBy(xpath = "html/body/section[2]/div/div/div[3]/div[1]/div/table/tbody/tr[5]/td[1]/b")
	public WebElement Subscriber_TotalOnlineOrders_Text;
	@FindBy(xpath = "html/body/section[2]/div/div/div[3]/div[1]/div/table/tbody/tr[5]/td[2]/span")
	public WebElement Subscriber_TotalOnlineOrdersCount;
	@FindBy(xpath = "html/body/section[2]/div/div/div[3]/div[1]/div/table/tbody/tr[6]/td[1]/b")
	public WebElement Subscriber_TotalOfflineOrders_Text;
	@FindBy(xpath = "html/body/section[2]/div/div/div[3]/div[1]/div/table/tbody/tr[6]/td[2]/span")
	public WebElement Subscriber_TotalOfflineOrdersCount;

	@FindBy(xpath = "html/body/section[2]/div/div/div[3]/div[2]/div/div[1]")
	public WebElement Subscriber_SubscriptionDetails_text;
	@FindBy(xpath = "html/body/section[2]/div/div/div[3]/div[2]/div/div[2]/div")
	public WebElement Subscriber_TrialCircleLogo;
	@FindBy(xpath = "html/body/section[2]/div/div/div[3]/div[2]/div/div[2]/h4")
	public WebElement Subscriber_TrailVersionText;
	@FindBy(xpath = "html/body/section[2]/div/div/div[3]/div[2]/div/div[2]/small")
	public WebElement Subscriber_TrialExpiresOn;
	@FindBy(xpath = "html/body/section[2]/div/div/div[1]/div[1]/div/div/a/small")
	public WebElement Subscriber_ViewAll_Link;
	@FindBy(xpath = "html/body/section[2]/section/div[1]/div[1]/div/div/div[1]/div[1]/h3")
	public WebElement Subscriber_Appointments_Text;
	@FindBy(xpath = "html/body/section[2]/div/div/div[1]/div[2]/div/a/small")
	public WebElement Subscriber_ManageProfile_link;
	@FindBy(xpath = "html/body/section[2]/div/div[1]/div/div/div/div/h3")
	public WebElement Subscriber_UpdateProfileDetails;
	@FindBy(xpath = ".//*[@id='products']/div/div[1]/div[1]/div/div/div/h3")
	public WebElement Subscriber_Products;
	@FindBy(xpath = "html/body/section[2]/section/div/div[1]/div/div/div/div[1]/h3")
	public WebElement Subscriber_Clients;
	@FindBy(xpath = "html/body/section[2]/div[1]/div[1]/div/div/div/div[1]/h3")
	public WebElement Subscriber_Bookingspage;
	@FindBy(xpath = "html/body/section[1]/nav/div/div[2]/ul[2]/li/a")
	public WebElement Subscriber_UserIcon;
	@FindBy(xpath = "html/body/section[1]/nav/div/div[2]/ul[2]/li/ul/li[5]/a")
	public WebElement Subscriber_Logout;
	@FindBy(xpath = ".//*[@id='infoText']")
	public WebElement Subscriber_Invalidcredentials;

	@FindBy(xpath = "")
	public WebElement Subscriber_;

	// TS_003

	// YopMail Locaters
	@FindBy(xpath = "//*[@id='login']")
	public WebElement Subscriber_Yopmail_Text;

	@FindBy(xpath = "//*[@id='f']/table/tbody/tr[1]/td[3]/input")
	public WebElement Subscriber_Yopmail_CheckInbox;

	@FindBy(xpath = "//*[@id='m1']/div/a/span[1]/span[2]")
	public WebElement Subscriber_Yopmail_ClickEmail;

	@FindBy(xpath = "//*[@id='mailmillieu']/div[2]/table/tbody/tr/td/a")
	public WebElement Subscriber_Yopmail_ClickVerifyEmailAddress;
	// *[@id="mailmillieu"]/div[2]/table/tbody/tr/td/a

	@FindBy(xpath = "//*[@id='mailhaut']/div[1]")
	public WebElement Subscriber_Yopmail_GetWelcomeEmailText;

	// Human Icon
	/*
	 * @FindBy(xpath = "/html/body/section[1]/nav/div/div[2]/ul[2]/li/a") public
	 * WebElement Subscriber_HumanIconOnTopMenu;
	 */

	@FindBy(xpath = "html/body/section[1]/nav/div/div[2]/ul[2]/li/ul/li[3]/a")
	public WebElement Subscriber_ClickOnChangePassword;

	@FindBy(xpath = ".//*[@id='update_profile_password']/div/div[1]/div/h3")
	public WebElement Subscriber_UpdateProfilePassword;

	@FindBy(xpath = ".//*[@id='update_profile_password']/div/div[5]/div/div/input")
	public WebElement Subscriber_ClickUpdateButton;

	@FindBy(xpath = ".//*[@id='update_profile_password']/div/div[5]/div/div/a")
	public WebElement Subscriber_ClickCancelButton;

	@FindBy(xpath = ".//*[@id='update_profile_password']/div/div[3]/div/div/em")
	public WebElement Subscriber_GetOldPasswordMessage;

	@FindBy(xpath = ".//*[@id='update_profile_password']/div/div[4]/div[1]/div/em")
	public WebElement Subscriber_GetNewPasswordMessage;

	@FindBy(xpath = ".//*[@id='update_profile_password']/div/div[4]/div[2]/div/em")
	public WebElement Subscriber_RetypePasswordMessage;

	@FindBy(xpath = ".//*[@id='update_profile_password']/div/div[3]/div/div/input")
	public WebElement Subscriber_EnterOldPasswordText;

	@FindBy(xpath = ".//*[@id='password']")
	public WebElement Subscriber_EnterNewPasswordText;

	@FindBy(xpath = ".//*[@id='update_profile_password']/div/div[4]/div[2]/div/input")
	public WebElement Subscriber_EnterRetypePasswordText;

	@FindBy(xpath = ".//*[@id='update_profile_password']/div/div[2]/div/div[2]/h4")
	public WebElement Subscriber_InvalidCurrentPassword;

	@FindBy(xpath = ".//*[@id='update_profile_password']/div/div[2]/div/div[1]/h4")
	public WebElement Subscriber_PasswordUpdatedSuccessfully;

	@FindBy(xpath = "//div/div/button[@class='btn btn-block btn-primary']")
	public WebElement Subscriber_Db_MC_Promotion_AddNew;

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

	// TS004
	@FindBy(xpath = "html/body/section[2]/div/div/div/div/h2/b")
	public WebElement Subscriber_SignIn_Text;
	@FindBy(xpath = ".//*[@id='navbar-collapse-1']/span/a[2]")
	public WebElement Subscriber_MyAccount;
	@FindBy(xpath = ".//*[@id='sub_content']/h1")
	public WebElement Subscriber_WhatDescribesYouBest_Text;
	@FindBy(xpath = ".//*[@id='navbar-collapse-1']/span/a[1]")
	public WebElement Subscriber_WhatDescribesYouBest_logout_Text;
	@FindBy(xpath = ".//*[@id='validateStep2']/button")
	public WebElement Subscriber_WhatDescribesYouBest_NextStep;
	@FindBy(xpath = ".//*[@id='described_service']/em")
	public WebElement Subscriber_WhatDescribesYouBest_Pleasechooseservice;
	@FindBy(xpath = "//*[@id='validateStep2']/div[6]/label")
	public WebElement Subscriber_WhatDescribesYouBest_OtherService;
	@FindBy(xpath = "//*[@id='validateStep2']/div[7]/div/input")
	public WebElement Subscriber_WhatDescribesYouBest_AddService_Text;
	@FindBy(xpath = ".//*[@id='validateStep2']/div[7]/div/span/button")
	public WebElement Subscriber_WhatDescribesYouBest_AddService_button;
	@FindBy(xpath = "html/body/section[2]/div/h2")
	public WebElement Subscriber_WhatDescribesYouBest_YourBusinessDetails;
	@FindBy(xpath = ".//*[@id='step3Form']/div[5]/button")
	public WebElement Subscriber_WhatDescribesYouBest_BusinessDetailsNextStep;
	@FindBy(xpath = ".//*[@id='step3Form']/div[1]/div/em")
	public WebElement Subscriber_BusinessDetails_PleaseEnterAddress_Text;
	@FindBy(xpath = ".//*[@id='step3Form']/div[1]/div/input")
	public WebElement Subscriber_BusinessDetails_PleaseEnterAddress_Editbox;
	@FindBy(xpath = ".//*[@id='step3Form']/div[2]/div[1]/em")
	public WebElement Subscriber_BusinessDetails_PleaseEnterCity_Text;
	@FindBy(xpath = ".//*[@id='step3Form']/div[2]/div[1]/input")
	public WebElement Subscriber_BusinessDetails_PleaseEnterCity_Editbox;
	@FindBy(xpath = ".//*[@id='step3Form']/div[3]/div[1]/em")
	public WebElement Subscriber_BusinessDetails_PleaseEnterZipcode_Text;
	@FindBy(xpath = ".//*[@id='step3Form']/div[3]/div[1]/input")
	public WebElement Subscriber_BusinessDetails_PleaseEnterZipcode_Editbox;
	@FindBy(xpath = ".//*[@id='step3Form']/div[2]/div[2]/select")
	public WebElement Subscriber_BusinessDetails_PleaseEnterState_Dropdownbox;

	@FindBy(xpath = "html/body/section[1]/nav/div/div[2]/ul[2]/li/a")
	public WebElement Subscriber_HumanIcon;
	@FindBy(xpath = "html/body/section[1]/nav/div/div[2]/ul[2]/li/ul/li[5]/a")
	public WebElement Subscriber_HumanIcon_logout_link;
	@FindBy(xpath = "html/body/section[1]/nav/div/div[2]/ul[2]/li/ul/li[1]/a")
	public WebElement Subscriber_HumanIcon_MySettings_link;
	
	@FindBy(xpath = ".//*[@id='infoText']")
	public WebElement Subscriber_InvalidUserErrMsg;
	
	

}
