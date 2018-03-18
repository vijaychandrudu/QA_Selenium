package com.shearcircle.objectrepository;

import java.util.List;

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
	@FindBy(xpath = ".//*[@id='register_form']/div[8]/div/label/input")
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
	
	
/****added***/
	@FindBy(xpath="//div/h3[text()='Privacy Policy']")
	public WebElement Subscriber_PrivacyPolicy_Alert;
	
	@FindBy(xpath="//*[@id='register_form']")
	public WebElement Subscriber_JCP_Registration_Form;
	
	@FindBy(xpath="//*[@id='sub_content']/h1")
	public WebElement Subscriber_JC_Page;
	
	@FindBy(xpath = ".//*[@id='sub_content']/h1")
	public WebElement Subscriber_SigIn_Page;
	
	@FindBy(xpath="//div/h2/b[text()='Join Now']")
	public WebElement Subscriber_JCP_JoinNow_Header;
	
	@FindBy(xpath="//*[@id='register_form']//u[text()='Terms of Service']")
	public WebElement Subscriber_JCP_TermsOfService_Link;
	
	@FindBy(xpath="//*[@id='register_form']//u[text()='Privacy Policy']")
	public WebElement Subscriber_JCP_PrivacyPolicye_Link;
	
	@FindBy(xpath="//*[@id='register_form']//u[text()='Billing Agreement']")
	public WebElement Subscriber_JCP_BillingAgreement_Link;
	
	@FindBy(xpath=".//*[@id='register_form']/div[4]/em")
	public WebElement Subscriber_BusinessNameErrMsg;
	
	@FindBy(xpath = "//*[@id='register_form']/div[5]/div/em")
	public WebElement Subscriber_SubDomainErrMsg;
	
	@FindBy(xpath="//div/h1/b[text()='Customer?']//parent::h1/following-sibling::a[text()='Join Our Circle']")
	public WebElement Subscriber_AreYouCustomer_JoinOurCircle_Button;
	
	@FindBy(xpath="/html/body/section[2]")
	public WebElement Subscriber_DashBoard_Page;
	
	@FindBy(xpath="//*[@id='step3Form']/div[3]/div[2]/input")
	public WebElement Subscriber_BusinessDetails_PleaseEnterPhoneNo_Editbox;
	
	@FindBy(xpath="//*[text()='Service Menu']")
	public WebElement Subscriber_ServiceMenu_Page; 
	
	@FindBy(xpath = "//h3[text()='Staff']")
	public WebElement Subscriber_StaffPage;
	
	
	@FindBy(xpath="//*[text()='No appointments found']")
	public WebElement Subscriber_NoAppointmentsFound_Popup;
	
	
	@FindBy(xpath="//button[text()='OK']")
	public WebElement Subscriber_NoAppointmentsFound_Popup_OKButton;
	
	/*******0006****************/
	
	@FindBy(xpath = "//*[@id='editProfile']/div[1]/div[1]/input")
	public WebElement Subscriber_UP_FNTextBox;
	
	@FindBy(xpath = "//*[@id='editProfile']/div[1]/div[2]/input")
	public WebElement Subscriber_UP_LNTextBox;
	
	@FindBy(xpath = "//*[@id='editProfile']/div[2]/div[1]/input")
	public WebElement Subscriber_UP_Email_TextBox;
	
	@FindBy(xpath="//*[@id='editProfile']/div[2]/div[2]/div/label[2]/input")
	public WebElement  Subscriber_UP_Male_SelectonButton;
	
	@FindBy(xpath="//*[@id='editProfile']/div[2]/div[2]/div/label[3]/input")
	public WebElement  Subscriber_UP_Female_SelectonButton;
	
	@FindBy(xpath="//div/div[2]/div/img")
	public WebElement Subscriber_UP_Logo;
	
	@FindBy(xpath="//*[@id='profile_view_header_background_image']/div/span[1]/center/button")
	public WebElement Subscriber_UP_Cover_Image;
	
	//Scenario TS_09
	@FindBy (xpath = "//p[text()='Profile updated successfully']")
	public WebElement Subscriber_updatedsuccessfullymsg;
	@FindBy (xpath = "//div//div/button[text()='OK']")
	public WebElement Popup_msg_Alert_OK_Button;
	@FindBy (xpath = "//*[@id='update_profile']/div/div/em[text()='The entered subdomain is already registered.']")
	public WebElement subdomainalreadyregisteredmsg;
	@FindBy(xpath = "html/body/section[1]/nav/div/div[2]/ul[2]/li/ul/li[4]/a")
	public WebElement Subscriber_Business_Settings_link;
	
	@FindBy(xpath = "//*[@id='yourTabWrapper']/li/a[text()='Business Details'] ")
	public WebElement Settings_page_tabs_Business_Details;
	@FindBy(xpath = "//*[@id='yourTabWrapper']/li/a[text()='Online Booking']")
	public WebElement Settings_page_tabs_Online_Bookings;
	@FindBy(xpath = "//*[@id='yourTabWrapper']/li/a[text()='Calendar']")
	public WebElement Settings_page_tabs_Calender;
	@FindBy(xpath = "//*[@id='yourTabWrapper']/li/a[text()='Staff Notifications']")
	public WebElement Settings_page_tabs_Staff_Notifications;
	@FindBy(xpath = "//*[@id='yourTabWrapper']/li/a[text()='Payment Settings']")
	public WebElement Settings_page_tabs_Payment_Settings;
	@FindBy(xpath = "//*[@id='yourTabWrapper']/li/a[text()='Manage Menu']")
	public WebElement Settings_page_Manage_Menu;
	@FindBy(xpath = "//*[@id='yourTabWrapper']/li/a[text()='Business Hours']")
	public WebElement Settings_page_tabs_Business_Hours;
	@FindBy(xpath = "//*[@id='yourTabWrapper']/li/a[text()='Social Links']")
	public WebElement Settings_page_tabs_Social_Links;

	@FindBy (xpath = "//*[@id='update_profile']/div/label[text()='Business Name ']")
	public WebElement Settings_page_label_Business_Name;
	@FindBy (xpath = "//*[@id='update_profile']/div/input[@type='business_name']")
	public WebElement Settings_page_input_Business_Name;

	@FindBy (xpath = "//*[@id='update_profile']/div/label[text()='Subdomain ']")
	public WebElement Settings_page_label_Subdomain;
	@FindBy (xpath = "//*[@id='update_profile']/div/div/input[@name='subdomain']")
	public WebElement Settings_page_input_Subdomain ;
	@FindBy (xpath = "//*[@id='update_profile']/div/label[text()='Overview ']")
	public WebElement Settings_page_label_Overview;
	@FindBy (xpath = "//*[@id='update_profile']/div/label[text()='Address ']")
	public WebElement Settings_page_label_Address;
	@FindBy (xpath = "//*[@id='update_profile']/div/textarea[@name='address']")
	public WebElement Settings_page_input_Address ;	
	@FindBy (xpath = "//*[@id=\"update_profile\"]/div/div/input[@ng-model='profileData.website']")
	public WebElement Settings_page_input_Website;	
	@FindBy (xpath = "//*[@id='update_profile']/div/label[text()='Contact Number']")
	public WebElement Settings_page_label_Contact_Number;
	@FindBy (xpath = "//*[@id='update_profile']/div/input[@name='mobile']")
	public WebElement Settings_page_input_ContactNum ;	
	@FindBy (xpath = "//*[@id='update_profile']/div/label[text()=' Business Type ']")
	public WebElement Settings_page_label_Business_Type;
	@FindBy (xpath = "//*[@id='update_profile']/div/div/input[@type='text']")
	public WebElement Settings_page_input_Business_Type ;	
	@FindBy (xpath = "//*[@id='update_profile']/div/label[text()='State']")
	public WebElement Settings_page_label_State;
	@FindBy (xpath = "//*[@id='update_profile']/div/select[@name='state']")
	public WebElement Settings_page_input_State ;
	@FindBy (xpath = "//*[@id=\"update_profile\"]/div/div/select[@name='timezone']")
	public WebElement Settings_page_input_Time_Zone;
	@FindBy (xpath = "//*[@id=\'update_profile\']/button[@type='submit']")
	public WebElement Settings_Save_Change_Button;	
	@FindBy (xpath = "//*[@id='update_profile']/div/div/em[@for='subdomain']")
	public WebElement Settings_error_msg_save_with_invalid_entries;

	@FindBy (xpath = "//*[@id='yourTabWrapper']/li/a[text()='Online Booking']")
	public WebElement Online_Booking_tab;
	@FindBy (xpath = "//*[@id='online_booking']/div/div/form/div/div/div/label[text()='Enable']/input")
	public WebElement Online_Booking_Enable_checkbox_clicked;
	@FindBy (xpath = "//*[@id='online_booking']/div/div/form/div/div/div/label[text()='Disable']/input")	                 
	public WebElement Online_Booking_Enable_checkbox_not_clicked;
	@FindBy (xpath = "//*[@id='online_booking']/div/div[1]/form/div[2]/div[1]/div[1]/h4")
	public WebElement Online_Booking_Booking_Policy_Header;	
	@FindBy (xpath = "//*[@id='online_booking']/div/div[1]/form/div[2]/div[1]/div[2]/div[1]")
	public WebElement Online_Booking_Client_appointment_upto;	
	@FindBy (xpath = "//*[@id='online_booking']/div/div[1]/form/div[2]/div[1]/div[2]/div[2]")
	public WebElement Online_Booking_Client_appointment_nomorethan;
	@FindBy (xpath = "//*[@id='online_booking']/div/div[1]/form/div[2]/div[2]/div[1]/h4")
	public WebElement Online_Booking_Cancellation_Notice_Header;
	@FindBy (xpath = "//*[@id='online_booking']/div/div[1]/form/div[2]/div[2]/div[2]/div")
	public WebElement Online_Booking_Cancellation_in_advance;
	@FindBy (xpath = "//*[@id='online_booking']/div/div[1]/form/div[2]/div[3]/div/h4")
	public WebElement Online_Booking_Cancellation_Policy_Header;
	@FindBy (xpath = "//*[@id='provider_widget_allows_employee_selection']/input[@ng-model='onlineBookingSettings.allows_employee_selection']")
	public WebElement Online_Booking_Checkbox_Staff_Member_Selection;
	@FindBy (xpath = "//*[@id=\"online_booking\"]//h3[text()='Online Booking Settings']")
	public WebElement Online_Bookings_Settings_Header;
	@FindBy (xpath = "//form[@ng-submit='saveOnlineBookingSettings()']//div[3]//div[@class='text-left']//input[@id='submit-button']")
	public WebElement Save_Button_Online_Booking_Page;
	@FindBy (xpath = "//*[@id=\"online_booking\"]/div/div[1]/form/div[2]/div[1]/div[2]/div[1]/div/select")
	public WebElement Online_Booking_in_advance_dropdown_list;
	@FindBy (xpath = "//*[@id=\"online_booking\"]/div/div[1]/form/div[2]/div[1]/div[2]/div[2]/div/select")
	public WebElement Online_Booking_till_future_dropdown_list;
	
	@FindBy (xpath = "//body/div/p[text()='Updated Successfully']")                  
	public WebElement Updates_successfully_msg_popup;
	@FindBy (xpath = "//body/div/p[text()='Updated successfully']")                  
	public WebElement Updates_msg_popup_successful;
	
	
	@FindBy (xpath = "//*[@id='yourTabWrapper']//a[text()='Calendar']")
	public WebElement Calender_Settings_tab;
	@FindBy (xpath = "//*[@id='calendar']//h3[text()='Calendar Settings']")
	public WebElement Calender_Settings_Header;
	@FindBy (xpath = "//*[@id='calendar']//div[@ng-if='calenderErrorMsg']")
	public WebElement Calender_Settings_error_msg;
	@FindBy (xpath= "//*[@id='calenderSettingsForm']//select[@name='time_slot_interval']")
	public WebElement Calender_Settings_Time_Interval_Dropdown;
	@FindBy (xpath = "//*[@id='calenderSettingsForm']//select[@name='view_type']")
	public WebElement Calender_Settings_Default_View_Dropdown;
	@FindBy (xpath = "//*[@id='calenderSettingsForm']//select[@name='week_start_day']")
	public WebElement Calender_Settings_week_start_day_Dropdown;
	@FindBy (xpath = "//*[@id=\"calenderSettingsForm\"]/button[text()='Save Changes']")
	public WebElement Calender_Settings_Save_Changes_Button;
	@FindBy (xpath = "//*[@id='calenderSettingsForm']/button")
	public WebElement Calender_Settings_Save_Button;
	
	@FindBy (xpath = "//*[@id='yourTabWrapper']//a[text()='Staff Notifications']")
	public WebElement Staff_Notification_tab;
	@FindBy (xpath = "//*[@id='referalSourceForm']//h2[text()='Enable Staff Notifications']")
	public WebElement Staff_Notification_Header;
	@FindBy (xpath = "//*[@id=\"referalSourceForm\"]//label[text()='Enable']/input")
	public WebElement Staff_Notification_Enble_checkbox;
	@FindBy (xpath = "//*[@id='provider_widget_allows_employee_selection' and contains(.,'MEMBERS BOOKED')]/input")
	public WebElement Staff_Notification_send_to_staff_members_checkbox;
	@FindBy (xpath = "//*[@id='provider_widget_allows_employee_selection' and contains(.,'EMAIL ADDRESS')]/input")
	public WebElement Staff_Notification_send_to_email_address;
	@FindBy (xpath = "//form[@ng-submit='saveStaffNotificationSettings()']//div[3]//div[@class='text-left']//input[@id='submit-button']")
	public WebElement Staff_Notification_save_changes_button;

	@FindBy (xpath = "//h3[text()='Payment Settings']")
	public WebElement Payment_Settings_Header;
	@FindBy (xpath = "//*[@id='savePaymentDetailsForm']//label/input[@ng-model='paymentData.paypal' and @name='3']")
	public WebElement Payment_Settings_Paypal_Yes_radio_button;
	@FindBy (xpath = "//*[@id='savePaymentDetailsForm']//label/input[@ng-model='paymentData.paypal' and @name='4']")
	public WebElement Payment_Settings_Paypal_No_radio_button;
	@FindBy (xpath = "//*[@id='savePaymentDetailsForm']//label/input[@ng-model='paymentData.cash' and @name='5']")
	public WebElement Payment_Settings_Cash_on_service_Yes_radio_button;
	@FindBy (xpath = "//*[@id='savePaymentDetailsForm']//label/input[@ng-model='paymentData.cash' and @name='6']")
	public WebElement Payment_Settings_Cash_on_service_No_radio_button;
	
	@FindBy (xpath = "//h3[text()='Manage Menu']")
	public WebElement Manage_Menu_Header;
	@FindBy (xpath = "//*[@id='savePaymentDetailsForm']//input[@name='7']")
	public WebElement Manage_Menu_services_yes_radio_button;
	@FindBy (xpath = "//*[@id='savePaymentDetailsForm']//input[@name='9']")
	public WebElement Manage_Menu_overview_yes_radio_button;
	@FindBy (xpath = "//*[@id='savePaymentDetailsForm']//input[@name='11']")
	public WebElement Manage_Menu_review_yes_radio_button;
	@FindBy (xpath = "//*[@id='savePaymentDetailsForm']//input[@name='13']")
	public WebElement Manage_Menu_inquiry_yes_radio_button;
	@FindBy (xpath = "//*[@id='savePaymentDetailsForm']//input[@name='15']")
	public WebElement Manage_Menu_promotions_yes_radio_button;
	@FindBy (xpath = "//*[@id='savePaymentDetailsForm']//input[@name='17']")
	public WebElement Manage_Menu_videos_yes_radio_button;
	@FindBy (xpath = "//*[@id='savePaymentDetailsForm']//input[@name='18']")
	public WebElement Manage_Menu_videos_no_radio_button;
	@FindBy (xpath = "//*[@id='savePaymentDetailsForm']//input[@name='19']")
	public WebElement Manage_Menu_photos_yes_radio_button;
	@FindBy (xpath = "//*[@id='savePaymentDetailsForm']//input[@name='20']")
	public WebElement Manage_Menu_photos_no_radio_button;
	@FindBy (xpath = "//*[@id='savePaymentDetailsForm']//input[@name='21']")
	public WebElement Manage_Menu_contact_us_yes_radio_button;
	@FindBy (xpath = "//*[@id='savePaymentDetailsForm']//input[@name='23']")
	public WebElement Manage_Menu_jobs_yes_radio_button;
	@FindBy (xpath = "//form[@ng-submit='saveProfessionalMenuSettings()']/div/div/button[text()='Save']")
	public WebElement Manage_Menu_save_button;
	@FindBy (xpath = "//*[@id='navbar-collapse-1']/form/div/div/div/input[@placeholder='Salon/Spa/Professionals']")
	public WebElement Professional_search_box;
	@FindBy (xpath = "//*[@id='navbar-collapse-1']/form/div/div/button/i[@class='icon-search']")
	public WebElement Professional_search_icon;
	@FindBy (xpath = "//*[@id='searchResultsContainerBox']/div[2]/div[1]/div[1]/div/a/h3")
	public WebElement Professional_search_result;
	@FindBy (xpath = "//*[@id='container_pin']/div/ul/li/a[@href='#videos']")
	public WebElement Business_page_videos_tab;
	@FindBy (xpath = "//*[@id='container_pin']/div/ul/li/a[@href='#photos']")
	public WebElement Business_page_photos_tab;
	
	@FindBy (xpath = "//*[@id='savePaymentDetailsForm']/div/div/input[@placeholder='Enter your facebook page or profile link']")
	public WebElement Social_links_Facebook_field;
	@FindBy (xpath = "//*[@id='savePaymentDetailsForm']/div/div/input[@placeholder='Enter your Instagram profile link']")
	public WebElement Social_links_Instagram_field;
	@FindBy (xpath = "//*[@id='savePaymentDetailsForm']/div/div/input[@placeholder='Enter your Google Plus page or profile link']")
	public WebElement Social_links_google_plus_field;
	@FindBy (xpath = "//h3[text()='Social Links']")
	public WebElement Social_Links_Header;
	@FindBy (xpath = "//form[@ng-submit='savePaymentSettings()'][@id='savePaymentDetailsForm']/div/div/button[text()='Save']")
	public WebElement Social_Links_Save_button;
	@FindBy (xpath = "//form[@ng-submit='saveLinks()'][@id='savePaymentDetailsForm']/div/div/button[text()='Save']")
	public WebElement Social_Links_Save_button_after_text_entry;
	@FindBy (xpath = "//h2[text()='Success']")
	public WebElement success_pop_up;
	
	@FindBy (xpath = "//body//button[@ng-click='addHoliday()']")
	public WebElement add_holiday_button;
	@FindBy (xpath = "//h3[text()='Business Hours']")
	public WebElement Business_hours_header;
	@FindBy (xpath = "//button[text()='Update']")
	public WebElement Update_button;
	
	@FindBy(xpath ="//*[text()='Manage Circle ']")
	public WebElement Subscriber_ManageCircle_Dropdown_Link;
	
	@FindBy(xpath="//div/div[2]/ul[1]/li[8]/ul/li/a")
	public WebElement Subscriber_ManageCircle_Dropdown_List;
	
	@FindBy(xpath="//a[text()='Staff']")
	public WebElement Subscriber_ManageCircle_Staff_DDvalue;
	
	
	
/*********TS011_Subscriber clicks on Services in Manage Circle Menu**************/
	
	/**********TC_11_001 Open the Service page*******/
	
	@FindBy(xpath="//a[text()='Jobs Postings']")
	public WebElement JobsPosting_DropdownValue_Link;
	
	@FindBy(xpath="//a[text()='Services']")
	public WebElement ManageCircle_Services_Dropdown_Link;
	
	@FindBy(xpath="//*[text()='Service Menu']")
	public WebElement SreviceMenu_PageHeader;
	
	@FindBy(xpath="//div[@class='dashboar_content']//button[text()=' New Group']")
	public WebElement SreviceMenu_AddNewGroupAtLoginFirstTime_Button;
	
	@FindBy(xpath="//div[2]/span/button[text()=' New Group']")
	public WebElement SreviceMenu_AddNewGroup_Button;
	
	@FindBy(xpath="//div/div/div/div/div/span/a")
	public List<WebElement>ServiceMenu_AddNewService_Buttons_List;
	  
	@FindBy(xpath="//div[2]/div/div/div/div/div/h3")
	public List<WebElement> SreviceMenu_SericeAddAlready_NameList;
	
	@FindBy(xpath="//div/div/div/div[1]/div[2]/table/tbody/tr/th")
	public List<WebElement> SericeMenu_ServicesUnderIndividualGroup_List;
	
	/***TC_11_002 Check the details under individual Group******/
	
	@FindBy(xpath="//div[2]/div/div/div/div/div/h3/i")
	public List<WebElement>ServiceMenu_GroupNameWithEdit_ButtonList;
	
	@FindBy(xpath="//div[@class='panel-body']/table")
	public WebElement SM_Tabularform;
	
	@FindBy(xpath="//div[1]/div[2]/table/thead/tr/th[text()='Service Name']")
	public WebElement ServiceMenu_ServiceName_TableHeader;
	
	@FindBy(xpath="//div[1]/div[2]/table/thead/tr/th[text()='For']")
	public WebElement ServiceMenu_For_TableHeader;
	
	@FindBy(xpath="//div[@class='panel-body']/table/tbody/tr/td[text()='everyone' or text()='Male' or text()='Female']")
	public WebElement ServiceMenu_For_MenOrWomwnOrEveryOne_Details;
	
	@FindBy(xpath="//div[1]/div[2]/table/thead/tr/th[text()='Duration']")
	public WebElement ServiceMenu_Duration_TableHeader;
	
	@FindBy(xpath="//div[1]/div[2]/table/thead/tr/th[text()='Actual Price']")
	public WebElement ServiceMenu_ActualPrice_TableHeader;
	
	@FindBy(xpath="//div[1]/div[2]/table/thead/tr/th[text()='Sale Price']")
	public WebElement ServiceMenu_SalePrice_TableHeader;
	
	@FindBy(xpath="//div[1]/div[2]/table/thead/tr/th[text()='Online Booking']")
	public WebElement ServiceMenu_OnlineBooking_TableHeader;
	
	@FindBy(xpath="//div[1]/div[2]/table/tbody/tr[1]/td[text()='No' or text()='Yes']")
	public WebElement Service_OnlineBooking_YesOrNo_Details;
	
	@FindBy(xpath="//div[1]/div[2]/table/thead/tr/th[text()='Action']")
	public WebElement ServiceMenu_Action_TableHeader;
	
	@FindBy(xpath="//div[1]/div[2]/table/tbody/tr/td[6]/button[text()=' Edit']")
	public WebElement ServiceMenu_Action_UnedrServiceEditButton;
	
	@FindBy(xpath="//table/tbody/tr/td/button[text()=' Edit']")
	public List<WebElement>ServiceMenu_servicenameEdit_ButtonList;
	
	
	
	/****TC_11_003 Check whether a New Group can be added****/
	
	@FindBy(xpath="//*[@id='serviceAddUpdateForm']/div/div[1]/h4[text()='New Service Group ']")
	public WebElement ServiceMenu_NewServiceGroup_Popup_Header;
	
	@FindBy(xpath="//*[@name='group_name']")
	public WebElement ServiceMenu_NewServiceGroupPopup_GroupName_TextBox;
	
	@FindBy(xpath="//*[@id='serviceAddUpdateForm']//button[text()='Add']")
	public WebElement ServiceMenu_NewServiceGroupPopup_AddButton;
	
	@FindBy(xpath="//*[@id='serviceAddUpdateForm']//button[text()='Close']")
	public WebElement ServiceMenu_NewServiceGroupPopup_CloseButton;
	
	@FindBy(xpath="//button[text()='OK']")
	public WebElement ServiceMenu_Popup_OK_Button;
	
	/*****TC_11_004 Check whether New Group can be added without tying group name***/
	
	@FindBy(xpath="//*[text()='This field is required']")
	public WebElement ServiceMenu_NewServiceGroupPopup_EM;
	
	/*****TC_11_005 Check whether the Group name can be edited*****/
	
	@FindBy(xpath="//*[@id='serviceAddUpdateForm']/div/div[3]/button[text()='Save changes']")
	public WebElement ServiceMenu_NewServiceGroupPopup_SavechangesButton;
	
	/****TC_11_006 Check whether a group can be deleted*****/
	
	@FindBy(xpath="//*[@id='serviceAddUpdateForm']/div/div[3]/button[text()='Delete']")
	public WebElement ServiceMenu_NewServiceGroupPopup_DeleteButton;
	
	@FindBy(xpath="//button[text()='Yes, delete it!']")
	public WebElement ServiceMenu_NewServiceGroupPopup_YesDeleteItButton;
	
	
	/*****TC_11_007 Check the action & details when +New Service button is clicked****/
	
	@FindBy(xpath="//*[@id='saveServiceForm']/div/h4[text()='Add New Service']")
	public WebElement ServiceMenu_AddNewServicePopup_Header;
	
	@FindBy(xpath="//*[@id='saveServiceForm']/div/div[1]/div/ul/li[1]/a[text()='Details']")
	public WebElement ServiceMenu_AddNewServicePopup_DetailsTab;
	
	@FindBy(xpath="//*[@id='saveServiceForm']/div/div[1]/div/ul/li[2]/a[text()='Staff']")
	public WebElement ServiceMenu_AddNewServicePopup_StaffTab;
	
	@FindBy(xpath="//*[@id='details']/div/div[1]/div[1]/input")
	public WebElement SM_AddNewServicePopup_ServiceName_TextBox;
	
	@FindBy(xpath="//div[@id='add_new_service']//*[@id='treatment_type']")
	public WebElement SM_AddNewServicePopup_Treatment_Typedropdown;
	
	@FindBy(xpath="//div[@id='add_new_service']//*[@id='available_for']")
	public WebElement SM_AddNewServicePopup_AvailableFor_DropdownList;
	
	@FindBy(xpath="//*[@id='details']/div/div[2]/div[2]/div[@class='checkbox']/label")
	public WebElement SM_AddNewServicePopup_EnableOnlineBookings_CheckBox;
	
	@FindBy(xpath="//*[@id='details']/div/div[3]/div/div[1]/div/select[@name='duration']")
	public WebElement SM_AddNewServicePopup_DurationDropdown_List;
	
	@FindBy(xpath="//*[@id='details']/div/div[3]/div/div/input[@name='full_price']")
	public WebElement SM_AddNewServicePopup_FullPriceField_TextBox;
	
	@FindBy(xpath="//*[@id='details']/div/div[3]/div/div/input[@name='special_price']")
	public WebElement SM_AddNewServicePopup_SpecialPriceField_TextBox;
	
	@FindBy(xpath="//*[@id='saveServiceForm']/div/div[2]/button[text()='Close']")
	public WebElement SM_AddNewServicePopup_Close_Button;
	
	@FindBy(xpath="//*[@id='saveServiceForm']/div/div[2]/button[text()='Save changes']")
	public WebElement SM_AddNewServicePopup_SaveChanges_Button;
	
	@FindBy(xpath="//div/div/div/label/input[@id='selectAllStaff']")
	public WebElement SM_AddNewServicePopup_Staff_SelectAll_CheckBox;
	
	@FindBy(xpath="//div/div/div/label/input[@class='select_staff']")
	public List<WebElement> SM_ANSP_Staff_Individual_CheckBox_List;
	
	@FindBy(xpath="//*[@id='editServiceForm']/div/div[1]/div/ul/li[1]/a[text()='Details']")
	public WebElement ServiceMenu_editNewServicePopup_DetailsTab;
	
	@FindBy(xpath="//*[@id='editServiceForm']/div/div/div/ul/li/a[text()='Staff']")
	public WebElement ServiceMenu_editServicePopup_StaffTab;
	
	@FindBy(xpath="//*[@id='editServiceForm']//input[@id='service_name']")
	public WebElement SM_editServicePopup_ServiceName_TextBox;
	
	@FindBy(xpath="//div[@id='edit_service_form']//*[@id='treatment_type']")
	public WebElement SM_editServicePopup_Treatment_Typedropdown;
	
	@FindBy(xpath="//div[@id='edit_service_form']//*[@id='available_for']")
	public WebElement SM_editServicePopup_AvailableFor_DropdownList;
	
	@FindBy(xpath="//*[@id='edit_service_form']//div[@class='checkbox']/label/input[@name='is_booking_enabled']")
	public WebElement SM_editServicePopup_EnableOnlineBookings_CheckBox;
	
	@FindBy(xpath="//*[@id='edit_service_form']//div/select[@name='duration']")
	public WebElement SM_editServicePopup_DurationDropdown_List;
	
	@FindBy(xpath="//*[@id='edit_service_form']//input[@name='full_price']")
	public WebElement SM_editServicePopup_FullPriceField_TextBox;
	
	@FindBy(xpath="//*[@id='edit_service_form']//input[@name='special_price']")
	public WebElement SM_editServicePopup_SpecialPriceField_TextBox;
	
	@FindBy(xpath="//*[@id='edit_service_form']//button[text()='Close']")
	public WebElement SM_editServicePopup_Close_Button;
	
	@FindBy(xpath="//*[@id='edit_service_form']//button[text()='Save changes']")
	public WebElement SM_editServicePopup_SaveChanges_Button;
	
	@FindBy(xpath="//div[@id='edit_service_form']//label/input[@id='selectAllStaff2']")
	public WebElement SM_editServicePopup_Staff_SelectAll_CheckBox;
	
	@FindBy(xpath="//div[@id='edit_service_form']//label/input[@class='select_staff2']")
	public List<WebElement> SM_editSP_Staff_Individual_CheckBox_List;
	
	/*********TC_11_008 Check the mandatory fields in Add new service popup***********/
	
	@FindBy(xpath="//*[@id='details']/div/div[1]/div[1]/em")
	public WebElement SM_AddNewServicePopup_ServiceName_EM;
	
	@FindBy(xpath="//*[@id='details']/div/div[1]/div[2]/div/em")
	public WebElement SM_AddNewServicePopup_TreatmentType_EM;
	
	@FindBy(xpath="//*[@id='details']/div/div[3]/div/div[1]/div/em")
	public WebElement SM_AddNewServicePopup_Duration_EM;
	
	@FindBy(xpath="//*[@id='details']/div/div[3]/div/div[2]/em")
	public WebElement SM_AddNewServicePopup_FullPrice_EM;
	
	@FindBy(xpath="//h3[text()='Staff']")
	public WebElement Subscriber_Staff_Page;
	
	@FindBy(xpath="//div/input[@placeholder='Search Name or Mobile ']")
	public WebElement Subscriber_Staff_SearchNameorMobile_Textbox;
	 
	@FindBy(xpath="//*[text()='New Staff']")
	public WebElement Subscriber_Staff_NewStaff_Button;
	
	@FindBy(xpath="//div[@class='container-fluid']/table/tbody/tr/td")
	public List<WebElement> Subscriber_Staff_DetailsList;
	
	@FindBy(xpath="//div/div/div/div[2]/div[2]/table/tbody/tr/th")
	public List<WebElement> SericeMenu_ServicesUndersecondGroup_List;
	
	
	/********TC_12_002	Check the details in staff page******/	
	
	@FindBy(xpath="//table/thead/tr/th[text()='Name']")
	public WebElement Staff_Name_Text;
	
	@FindBy(xpath="//table/thead/tr/th[text()='Mobile Number']")
	public WebElement Staff_MobileNumber_Text;
	
	@FindBy(xpath="//table/thead/tr/th[text()='Email']")
	public WebElement Staff_Email_Text;
	
	@FindBy(xpath="//table/thead/tr/th[text()='Appointments']")
	public WebElement Staff_AppointmentsStaff_Text;
	
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Calendar bookings')]")
	public WebElement Staff_ApmntCalenderDetails;
	
	@FindBy(xpath="//table/thead/tr/th[text()='Created at']")
	public WebElement Staff_CreatedatText;
	
	@FindBy(xpath="//table/thead/tr/th[text()='Profile image']")
	public WebElement Staff_ProfileImage_Text;
	
	@FindBy(xpath="//table/tbody/tr[1]/td[6]/button")
	public WebElement Staff_EditButton;
	
		
	/*********TC_12_003	Check the New Staff button****/
	
	@FindBy(xpath="//*[text()='Add New Staff']")
	public WebElement Staff_AddNewStaff_Header;
	
	@FindBy(xpath="//*[text()='Details']")
	public WebElement Staff_DetailsTab;
	
	@FindBy(xpath="//*[@name='firstname']")
	public WebElement Staff_FirstName_TextBox;	

	@FindBy(xpath="//*[@name='lastname']")
	public WebElement Staff_LastName_TextBox;	

	@FindBy(xpath="//*[@name='mobile']")
	public WebElement Staff_MobileNumber_TextBox;	

	@FindBy(xpath="//*[@name='email']")
	public WebElement Staff_Email_TextBox;	

	@FindBy(xpath="//div[@class='checkbox']/label/input[@name='is_appointment_booking_enabled']")
	public WebElement Staff_EnableApnmtBkngs_Checkbox;	

	@FindBy(xpath="//*[text()='Work schedule ']")
	public WebElement Staff_Workschedule;
	
	@FindBy(xpath="//*[text()=' Day']")
	public WebElement Staff_Day_Text;
	
	@FindBy(xpath="//*[text()='Opening Hours ']")
	public WebElement Staff_OpeningHours;
	
	@FindBy(xpath="//*[text()=' Closing Hours ']")
	public WebElement Staff_ClosingHours;
	
	@FindBy(xpath="//*[@href='#services']")
	public WebElement Staff_Services_Tab;
	
	@FindBy(xpath="//*[@id='services']/div[2]/div/div/div/label/input")
	public List<WebElement> Staff_Services_SelectServices_CheckboxList;
	
	
	@FindBy(xpath="//input[@id='selectAllServices']")
	public WebElement Staff_Services_SelectAllService_Checkbox;
	
	@FindBy(xpath="//*[text()='Close']")
	public WebElement Staff_Close_Button;
	
	@FindBy(xpath="//*[text()='Add Staff']")
	public WebElement Staff_AddStaff_Button;

	/*****TC_12_004	Check the Mandatory fields in Add new staff popup*****/
	
	@FindBy(xpath="//em[text()='Please enter firstname']")
	public WebElement Staff_PleaseEnterFirstname_ErrorMessage;
	
	@FindBy(xpath="//em[text()='Please enter lastname']")
	public WebElement Staff_PleaseEnterlastname_ErrorMessag;
	
	/************TC_12_005	Check if a Staff can be added******/
	
	@FindBy(xpath="//*[@id='details']/div/div[3]//input[@type='checkbox']")
	public List<WebElement> Staff_DateAndSelect_OpeningAndClosing_Hours_list;

	
	@FindBy(xpath="//*[@class='confirm']")
	public WebElement Staff_Popup_ClickLink;
	
	
	/***TC_12_006	Check if a Staff details can be modified***/
	
	@FindBy(xpath="//table/tbody/tr/td[1]")
	public List <WebElement> Staff_Name_List;
	
	@FindBy(xpath="//*[@id='addStaffForm']/div[1]/h4")
	public WebElement Staff_EditStaff_Popup;
	
	
	@FindBy(xpath="//*[text()='Update changes']")
	public WebElement Staff_UpdateChanges_Button;
	
	/****TC_12_007	Check whether a Staff can be deleted****/
	
	@FindBy(xpath="//*[text()='Delete']")
	public WebElement Staff_Delete_Button;
	
	@FindBy(xpath="//*[text()='Yes, delete it!']")
	public WebElement Staff_YesDeleteIt_Button;
	
	/********TC_12_008	Check whether a profile image can be added for Staff****/
	
	@FindBy(xpath="//*[text()='Upload Profile Picture']")
	public WebElement Staff_UploadProfilePicture_Header;
	 
	@FindBy(xpath="//*[@class='profile-image']")
	public WebElement Staff_Profile_Image;
	
	
	/**************TC_12_009 Check the Search box******/
	
	@FindBy(xpath="//*[@placeholder='Search Name or Mobile ']")
	public WebElement Staff_Search_NameOrMobile_Box;
	
	@FindBy(xpath="//div[@class='input-group-btn']/button")
	public WebElement Staff_Search_Button;
	
	@FindBy(xpath="//div[@class='container-fluid']/table/tbody/tr")
	public List<WebElement> Staff_SearchFilter_List;
	
	@FindBy(xpath="//section/div/div[2]/div")
	public WebElement Staff_SearchFilter_Table;
	
	
	
	
	
}
