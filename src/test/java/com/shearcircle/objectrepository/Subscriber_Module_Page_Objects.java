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

	
	@FindBy(xpath = "html/body/section[1]/nav/div/div[2]/ul[2]/li/ul/li[5]/a")
	public WebElement Subscriber_HumanIcon_logout_link;
	@FindBy(xpath = "html/body/section[1]/nav/div/div[2]/ul[2]/li/ul/li[1]/a")
	public WebElement Subscriber_HumanIcon_MySettings_link;
	
	@FindBy(xpath = ".//*[@id='infoText']")
	public WebElement Subscriber_InvalidUserErrMsg;
	
	
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
	@FindBy (xpath = "//*[@id='cke_1_contents']/iframe")
	public WebElement Settings_page_Overview_iframe;
	@FindBy (xpath = "/html/body/p")
	public WebElement Settings_page_Overview_Textarea;
	@FindBy (xpath = "//*[@id='update_profile']/div/label[text()='Address ']")
	public WebElement Settings_page_label_Address;
	@FindBy (xpath = "//*[@id='update_profile']/div/textarea[@name='address']")
	public WebElement Settings_page_input_Address ;	
	@FindBy (xpath = "//*[@id='update_profile']//input[@ng-model='profileData.website']")
	public WebElement Settings_page_input_Website;	
	@FindBy (xpath = "//*[@id='update_profile']/div/label[text()='Contact Number']")
	public WebElement Settings_page_label_Contact_Number;
	@FindBy (xpath = "//*[@id='update_profile']/div/input[@name='mobile']")
	public WebElement Settings_page_input_ContactNum ;	
	@FindBy (xpath = "//*[@id='update_profile']/div/label[text()=' Business Type ']")
	public WebElement Settings_page_label_Business_Type;
	@FindBy (xpath = "//*[@id='update_profile']/div[8]/div/input[@type='text']")
	public WebElement Settings_page_input_Business_Type ;	
	@FindBy (xpath = "//*[@id='update_profile']/div/label[text()='State']")
	public WebElement Settings_page_label_State;
	@FindBy (xpath = "//*[@id='update_profile']/div/select[@name='state']")
	public WebElement Settings_page_input_State ;
	@FindBy (xpath = "//*[@id=\"update_profile\"]/div/div/select[@name='timezone']")
	public WebElement Settings_page_input_Time_Zone;
	@FindBy (xpath = "//*[@id='update_profile']/button[text()='Save Changes']")
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
	@FindBy (xpath = "//*[@id='online_booking']//select[contains(@ng-model,'advance_notice_time')]")
	public WebElement Online_Booking_Client_appointment_upto;	
	@FindBy (xpath = "//*[@id='online_booking']//select[contains(@ng-model,'max_advance_time_in_months')]")
	public WebElement Online_Booking_Client_appointment_nomorethan;
	@FindBy (xpath = "//*[@id='online_booking']/div/div[1]//h4[contains(text(),'Cancellation N')]")
	public WebElement Online_Booking_Cancellation_Notice_Header;
	@FindBy (xpath = "//*[@id='online_booking']//select[contains(@ng-model,'cancellation_time')]")
	public WebElement Online_Booking_Cancellation_in_advance;
	@FindBy (xpath = "//*[@id='cancellation_policy']")
	public WebElement Online_Booking_Cancellation_CancellatiNotice;
	@FindBy (xpath = "//*[@id='provider_widget_allows_employee_selection']/input[@value=1]")
	public WebElement Online_Booking_Checkbox_Staff_Member_Selection;
	@FindBy (xpath = "//*[@id='online_booking']//h2[text()='Online Booking Tools']")
	public WebElement Online_Bookings_Settings_Header;
	@FindBy (xpath = "//form[@ng-submit='saveOnlineBookingSettings()']//div[3]//div[@class='text-left']//input[@id='submit-button']")
	public WebElement Save_Button_Online_Booking_Page;

	@FindBy (xpath = "//body/div/p[text()='Updated Successfully']")                  
	public WebElement Updates_successfully_msg_popup;
	@FindBy (xpath = "//body/div/p[text()='Updated successfully']")                  
	public WebElement Updates_msg_popup_successful;
	
	
	@FindBy (xpath = "//*[@id='yourTabWrapper']//a[text()='Calendar']")
	public WebElement Calender_Settings_tab;
	@FindBy (xpath = "//*[@id='calendar']//h3[text()='Calendar Settings']")
	public WebElement Calender_Settings_Header;
	@FindBy (xpath = "//*[@id='calenderSettingsForm']")
	public WebElement Calender_Settings_FormPage;
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
	@FindBy (xpath = "//*[@id='referalSourceForm']//input[@type='submit']")
	public WebElement Staff_Notification_save_changes_button;

	@FindBy (xpath = "//h3[text()='Payment Settings']")
	public WebElement Payment_Settings_Header;
	@FindBy(xpath="//*[@id='savePaymentDetailsForm']//label[text()='Online Payment:']")
	public WebElement Payment_Settings_OnlinePaymentLabel;
	@FindBy (xpath = "//*[@id='savePaymentDetailsForm']//label/input[@ng-model='paymentData.paypal' and @name='3']")
	public WebElement Payment_Settings_Paypal_Yes_radio_button;
	@FindBy(xpath="//*[@id='savePaymentDetailsForm']//label[text()='Cash on Service:']")
	public WebElement Payment_Settings_CashOnServiceLabel;
	@FindBy (xpath = "//*[@id='savePaymentDetailsForm']//label/input[@ng-model='paymentData.paypal' and @name='4']")
	public WebElement Payment_Settings_Paypal_No_radio_button;
	@FindBy (xpath = "//*[@id='savePaymentDetailsForm']//label/input[@ng-model='paymentData.cash' and @name='5']")
	public WebElement Payment_Settings_Cash_on_service_Yes_radio_button;
	@FindBy (xpath = "//*[@id='savePaymentDetailsForm']//label/input[@ng-model='paymentData.cash' and @name='6']")
	public WebElement Payment_Settings_Cash_on_service_No_radio_button;
	@FindBy(xpath="//*[@id='savePaymentDetailsForm']/div[3]//button[text()='Save']")
	public WebElement Payment_Settings_SaveButton;
	@FindBy(xpath="//p[text()='Payment Settings Updated Successfully']")
	public WebElement Payment_Settings_PSUSuccessfully;
	
	
	
	@FindBy (xpath = "//h3[text()='Manage Menu']")
	public WebElement Manage_Menu_Header;
	@FindBy(xpath="//*[@id='savePaymentDetailsForm']//label[text()='Services:']")
	public WebElement Manage_Menu_ServicesLabel;
	@FindBy (xpath = "//*[@id='savePaymentDetailsForm']//input[@name='7']")
	public WebElement Manage_Menu_services_yes_radio_button;
	@FindBy(xpath="//*[@id='savePaymentDetailsForm']//label[text()='Overview:']")
	public WebElement Manage_Menu_OverViewLabel;
	@FindBy (xpath = "//*[@id='savePaymentDetailsForm']//input[@name='9']")
	public WebElement Manage_Menu_overview_yes_radio_button;
	@FindBy(xpath="//*[@id='savePaymentDetailsForm']//label[text()='Reviews:']")
	public WebElement Manage_Menu_ReviwesLabel;
	@FindBy (xpath = "//*[@id='savePaymentDetailsForm']//input[@name='11']")
	public WebElement Manage_Menu_review_yes_radio_button;
	@FindBy(xpath="//*[@id='savePaymentDetailsForm']//label[text()='Inquiry:']")
	public WebElement Manage_Menu_InquiryLabel;
	@FindBy (xpath = "//*[@id='savePaymentDetailsForm']//input[@name='13']")
	public WebElement Manage_Menu_inquiry_yes_radio_button;
	@FindBy(xpath="//*[@id='savePaymentDetailsForm']//label[text()='Promotions:']")
	public WebElement Manage_Menu_PromotionsLabel;
	@FindBy (xpath = "//*[@id='savePaymentDetailsForm']//input[@name='15']")
	public WebElement Manage_Menu_promotions_yes_radio_button;
	@FindBy(xpath="//*[@id='savePaymentDetailsForm']//label[text()='Videos:']")
	public WebElement Manage_Menu_VideosLabel;
	@FindBy (xpath = "//*[@id='savePaymentDetailsForm']//input[@name='17']")
	public WebElement Manage_Menu_videos_yes_radio_button;
	@FindBy (xpath = "//*[@id='savePaymentDetailsForm']//input[@name='18']")
	public WebElement Manage_Menu_videos_no_radio_button;
	@FindBy(xpath="//*[@id='savePaymentDetailsForm']//label[text()='Photos:']")
	public WebElement Manage_Menu_PhotosLabel;
	@FindBy (xpath = "//*[@id='savePaymentDetailsForm']//input[@name='19']")
	public WebElement Manage_Menu_photos_yes_radio_button;
	@FindBy (xpath = "//*[@id='savePaymentDetailsForm']//input[@name='20']")
	public WebElement Manage_Menu_photos_no_radio_button;
	@FindBy(xpath="//*[@id='savePaymentDetailsForm']//label[text()='Contact Us:']")
	public WebElement Manage_Menu_ContactUsLabel;
	@FindBy (xpath = "//*[@id='savePaymentDetailsForm']//input[@name='21']")
	public WebElement Manage_Menu_contact_us_yes_radio_button;
	@FindBy(xpath="//*[@id='savePaymentDetailsForm']//label[text()='Jobs:']")
	public WebElement Manage_Menu_JobsLabel;
	@FindBy (xpath = "//*[@id='savePaymentDetailsForm']//input[@name='23']")
	public WebElement Manage_Menu_jobs_yes_radio_button;
	@FindBy (xpath = "//*[@id='savePaymentDetailsForm']/div[10]/div/button[text()='Save']")
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
	
	@FindBy(xpath="//*[@id='businessHoursDiv']//div/label/input[@ng-model='work_schedule.is_working_day']")
	public List<WebElement> Business_hours_CBDayList;
	
	@FindBy(xpath="//*[@id='businessHoursDiv']//div/label")
	public List<WebElement> Business_hours_DayLabelList;
	
	@FindBy(xpath="//*[@id='businessHoursDiv']//select[@ng-model='work_schedule.opening_hours']")
	public List<WebElement> Business_hours_Opening_hoursList;
	
	@FindBy(xpath="//*[@id='businessHoursDiv']//select[@ng-model='work_schedule.closing_hours']")
	public List<WebElement> Business_hours_closing_hoursList;
	
	@FindBy(xpath="//*[text()='Updated successfully']")
	public WebElement Business_hours_US_Popup;
	
	/*********TC_9_037 Check whether the Add Holiday button is clickable*****/
	
	@FindBy(xpath="//*[@id='add_holiday']//*[text()='Add Holiday']")
	public WebElement BusinessHours_AH_PopupHeader;
	
	@FindBy(xpath="//*[@id='add_holiday']//input[@name='start_date']")
	public WebElement BusinessHours_AH_StartDate_TB;
	
	@FindBy(xpath="//*[@id='add_holiday']//input[@name='end_date']")
	public WebElement BusinessHours_AH_EndDate_TB;
	
	@FindBy(xpath="//*[@id='add_holiday']//input[@name='comment']")
	public WebElement BusinessHours_AH_Descriptionfield;
	
	@FindBy(xpath="//*[@id='add_holiday']//button[text()='Close']")
	public WebElement BusinessHours_AH_CloseButton;
	
	@FindBy(xpath="//*[@id='add_holiday']//button[text()='Save']")
	public WebElement BusinessHours_AH_SaveButton;
	
	
	/*********TC_9_039 Check the field validations in Add Holiday popup**********/
	
	@FindBy(xpath="//*[@id='add_holiday']//em[text()='Please enter start date']")
	public WebElement BusinessHours_AH_StartDate_EM;
	
	@FindBy(xpath="//*[@id='add_holiday']//em[text()='Please enter end date']")
	public WebElement BusinessHours_AH_EndDate_EM;
	
	@FindBy(xpath="//*[@id='add_holiday']//em[text()='Please enter comment']")
	public WebElement BusinessHours_AH_Comment_EM;
	
	
	/***************new*********/
	
	@FindBy(xpath="//*[@id='searchResultsContainerBox']//div/a/h3")
	public WebElement BusinessDetails_BN_In_BP;
	
	@FindBy(xpath="//*[@id='searchResultsContainerBox']//div/a/h3")
	public WebElement BusinessDetails_MBN_In_BP;
	
	@FindBy(xpath="//*[@id='searchResultsContainerBox']//div/ul/li[text()=' Cash On Services']")
	public WebElement PaymentSettings_CashOnService_InBP;
	
	@FindBy(xpath="//div/h1/b[text()='Customer?']//parent::h1/following-sibling::a[text()='Join Our Circle']")
	public WebElement Subscriber_AreYouCustomer_JoinOurCircle_Button;
	
	@FindBy(xpath="//*[@id='sub_content']/h1")
	public WebElement Subscriber_JC_Page;
	
	@FindBy(xpath="//*[@id='register_form']")
	public WebElement Subscriber_JCP_Registration_Form;
	
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
	
	@FindBy(xpath="//div/h3[text()='Privacy Policy']")
	public WebElement Subscriber_PrivacyPolicy_Alert;
	
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
	
	@FindBy(xpath = "html/body/section[1]/nav/div/div[2]/ul[2]/li/a")
	public WebElement Subscriber_HumanIcon;
	
	
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
	
	@FindBy(xpath ="//*[text()='Manage Circle ']")
	public WebElement Subscriber_ManageCircle_Dropdown_Link;
	
	@FindBy(xpath="//div/div[2]/ul[1]/li[8]/ul/li/a")
	public WebElement Subscriber_ManageCircle_Dropdown_List;
	
	@FindBy(xpath="//a[text()='Staff']")
	public WebElement Subscriber_ManageCircle_Staff_DDvalue;
	/*
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
	
	@FindBy(xpath="//*[@id='savePaymentDetailsForm']//label[text()='Online Payment:']")
	public WebElement Payment_Settings_OnlinePaymentLabel;
	@FindBy(xpath="//*[@id='savePaymentDetailsForm']//label[text()='Cash on Service:']")
	public WebElement Payment_Settings_CashOnServiceLabel;
	
	@FindBy(xpath = "//*[@id='yourTabWrapper']/li/a[text()='Manage Menu']")
	public WebElement Settings_page_Manage_Menu;
	@FindBy(xpath = "//*[@id='yourTabWrapper']/li/a[text()='Business Hours']")
	public WebElement Settings_page_tabs_Business_Hours;
	@FindBy(xpath = "//*[@id='yourTabWrapper']/li/a[text()='Social Links']")
	public WebElement Settings_page_tabs_Social_Links;	
	@FindBy (xpath = "//*[@id='update_profile']/div/input[@type='business_name']")
	public WebElement Settings_page_input_Business_Name;
	@FindBy (xpath = "//*[@id='update_profile']/div/div/input[@name='subdomain']")
	public WebElement Settings_page_input_Subdomain ;
	@FindBy (xpath = "//*[@id='update_profile']/div/textarea[@name='address']")
	public WebElement Settings_page_input_Address ;
	@FindBy (xpath = "//*[@id='update_profile']/button[text()='Save Changes']")
	public WebElement Settings_Save_Change_Button;	
	@FindBy (xpath = "//*[@id='update_profile']/div/input[@name='mobile']")
	public WebElement Settings_page_input_ContactNum ;
	@FindBy (xpath = "//*[@id='update_profile']/div[8]/div/input[@type='text']")
	public WebElement Settings_page_input_Business_Type ;
	@FindBy (xpath = "//*[@id='update_profile']/div/select[@name='state']")
	public WebElement Settings_page_input_State ;
	@FindBy (xpath = "//*[@id='cke_1_contents']/iframe")
	public WebElement Settings_page_Overview_Textarea;
	@FindBy (xpath = "//*[@id='update_profile']//input[@ng-model='profileData.website']")
	public WebElement Settings_page_input_Website;	
	@FindBy (xpath = "//*[@id='update_profile']/div/label[text()='Contact Number']")
	public WebElement Settings_page_label_Contact_Number;
	
	@FindBy (xpath = "//*[@id=\"update_profile\"]/div/div/select[@name='timezone']")
	public WebElement Settings_page_input_Time_Zone;
	@FindBy (xpath = "//*[@id='update_profile']/div/div/em[@for='subdomain']")
	public WebElement Settings_error_msg_save_with_invalid_entries;*/
	
	
	
	/*@FindBy (xpath = "//p[text()='Profile updated successfully']")
	public WebElement Subscriber_updatedsuccessfullymsg;
	@FindBy (xpath = "//div//div/button[text()='OK']")
	public WebElement Popup_msg_Alert_OK_Button;
	@FindBy (xpath = "//*[@id='update_profile']/div/div/em[text()='The entered subdomain is already registered.']")
	public WebElement subdomainalreadyregisteredmsg;
	@FindBy (xpath = "//*[@id='online_booking']//h2[text()='Online Booking Tools']")
	public WebElement Online_Bookings_Settings_Header;
	@FindBy (xpath = "//form[@ng-submit='saveOnlineBookingSettings()']//div[3]//div[@class='text-left']//input[@id='submit-button']")
	public WebElement Save_Button_Online_Booking_Page;
	@FindBy (xpath = "//*[@id='online_booking']/div/div/form/div/div/div/label[text()='Enable']/input")
	public WebElement Online_Booking_Enable_checkbox_clicked;
	@FindBy (xpath = "//*[@id='online_booking']//select[contains(@ng-model,'max_advance_time_in_months')]")
	public WebElement Online_Booking_Client_appointment_nomorethan;	
	//Required clarification
	@FindBy (xpath = "//*[@id='online_booking']//select[contains(@ng-model,'advance_notice_time')]")
	public WebElement Online_Booking_Client_appointment_upto;
	@FindBy (xpath = "//*[@id='online_booking']/div/div[1]/form/div[2]/div[1]/div[1]/h4")
	public WebElement Online_Booking_Booking_Policy_Header;
	  Object mismatch  
	@FindBy (xpath = "//*[@id='online_booking']/div/div[1]//h4[contains(text(),'Cancellation N')]")
	public WebElement Online_Booking_Cancellation_Notice_Header;
	@FindBy (xpath = "//*[@id='online_booking']//select[contains(@ng-model,'cancellation_time')]")
	public WebElement Online_Booking_Cancellation_in_advance;
	@FindBy (xpath = "//*[@id='cancellation_policy']")
	public WebElement Online_Booking_Cancellation_CancellatiNotice;
	@FindBy (xpath = "//*[@id='provider_widget_allows_employee_selection']/input[@value=1]")
	public WebElement Online_Booking_Checkbox_Staff_Member_Selection;
	
	@FindBy (xpath = "//*[@id='online_booking']//h2[text()='Online Booking Tools']")	                
	public WebElement Updates_successfully_msg_popup;
	@FindBy (xpath = "//body/div/p[text()='Updated successfully']")                  
	public WebElement Updates_msg_popup_successful;	
	
	@FindBy (xpath = "//*[@id='yourTabWrapper']//a[text()='Calendar']")
	public WebElement Calender_Settings_tab;
	@FindBy (xpath = "//*[@id='calendar']//h3[text()='Calendar Settings']")
	public WebElement Calender_Settings_Header;
	@FindBy (xpath = "//*[@id='calenderSettingsForm']")
	public WebElement Calender_Settings_FormPage;
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
	@FindBy (xpath = "//*[@id='referalSourceForm']//input[@type='submit']")
	public WebElement Staff_Notification_save_changes_button;
	
	@FindBy(xpath="//*[@id='savePaymentDetailsForm']/div[3]//button[text()='Save']")
	public WebElement Payment_Settings_SaveButton;
	@FindBy(xpath="//p[text()='Payment Settings Updated Successfully']")
	public WebElement Payment_Settings_PSUSuccessfully;
*//****added***//*
	
	
	*//*******0006****************//*
	
	
	
	//Scenario TS_09
		
	@FindBy (xpath = "//*[@id='update_profile']/div/label[text()='Business Name ']")
	public WebElement Settings_page_label_Business_Name;

	@FindBy (xpath = "//*[@id='update_profile']/div/label[text()='Subdomain ']")
	public WebElement Settings_page_label_Subdomain;
	
	@FindBy (xpath = "//*[@id='update_profile']/div/label[text()='Overview ']")
	public WebElement Settings_page_label_Overview;
	
	@FindBy (xpath = "//*[@id='update_profile']/div/label[text()='Address ']")
	public WebElement Settings_page_label_Address;	
	
	@FindBy (xpath = "//*[@id='update_profile']/div/label[text()=' Business Type ']")
	public WebElement Settings_page_label_Business_Type;
		
	@FindBy (xpath = "//*[@id='update_profile']/div/label[text()='State']")
	public WebElement Settings_page_label_State;
	

	@FindBy (xpath = "//*[@id='yourTabWrapper']/li/a[text()='Online Booking']")
	public WebElement Online_Booking_tab;
	
	@FindBy (xpath = "//*[@id='online_booking']/div/div/form/div/div/div/label[text()='Disable']/input")	                 
	public WebElement Online_Booking_Enable_checkbox_not_clicked;		
	
	@FindBy (xpath = "//*[@id='online_booking']/div/div[1]/form/div[2]/div[3]/div/h4")
	public WebElement Online_Booking_Cancellation_Policy_Header;
	
	
	@FindBy (xpath = "//*[@id=\"online_booking\"]/div/div[1]/form/div[2]/div[1]/div[2]/div[1]/div/select")
	public WebElement Online_Booking_in_advance_dropdown_list;
	@FindBy (xpath = "//*[@id=\"online_booking\"]/div/div[1]/form/div[2]/div[1]/div[2]/div[2]/div/select")
	public WebElement Online_Booking_till_future_dropdown_list;	
	
	
	@FindBy (xpath = "//*[@id='calendar']//div[@ng-if='calenderErrorMsg']")
	public WebElement Calender_Settings_error_msg;	

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
	@FindBy(xpath="//*[@id='savePaymentDetailsForm']//label[text()='Services:']")
	public WebElement Manage_Menu_ServicesLabel;
	@FindBy(xpath="//*[@id='savePaymentDetailsForm']//label[text()='Overview:']")
	public WebElement Manage_Menu_OverViewLabel;
	@FindBy(xpath="//*[@id='savePaymentDetailsForm']//label[text()='Reviews:']")
	public WebElement Manage_Menu_ReviwesLabel;
	@FindBy(xpath="//*[@id='savePaymentDetailsForm']//label[text()='Inquiry:']")
	public WebElement Manage_Menu_InquiryLabel;
	@FindBy(xpath="//*[@id='savePaymentDetailsForm']//label[text()='Promotions:']")
	public WebElement Manage_Menu_PromotionsLabel;
	@FindBy(xpath="//*[@id='savePaymentDetailsForm']//label[text()='Videos:']")
	public WebElement Manage_Menu_VideosLabel;
	@FindBy(xpath="//*[@id='savePaymentDetailsForm']//label[text()='Photos:']")
	public WebElement Manage_Menu_PhotosLabel;
	@FindBy(xpath="//*[@id='savePaymentDetailsForm']//label[text()='Contact Us:']")
	public WebElement Manage_Menu_ContactUsLabel;
	@FindBy(xpath="//*[@id='savePaymentDetailsForm']//label[text()='Jobs:']")
	public WebElement Manage_Menu_JobsLabel;
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
	
	
	
	
	
	@FindBy(xpath="//*[@id='businessHoursDiv']//div/label/input[@ng-model='work_schedule.is_working_day']")
	public List<WebElement> Business_hours_CBDayList;
	
	@FindBy(xpath="//*[@id='businessHoursDiv']//div/label")
	public List<WebElement> Business_hours_DayLabelList;
	
	@FindBy(xpath="//*[@id='businessHoursDiv']//select[@ng-model='work_schedule.opening_hours']")
	public List<WebElement> Business_hours_Opening_hoursList;
	
	@FindBy(xpath="//*[@id='businessHoursDiv']//select[@ng-model='work_schedule.closing_hours']")
	public List<WebElement> Business_hours_closing_hoursList;
	
	@FindBy(xpath="//*[text()='Updated successfully']")
	public WebElement Business_hours_US_Popup;
	
*//*********TC_9_037 Check whether the Add Holiday button is clickable*****//*
	
	@FindBy(xpath="//*[@id='add_holiday']//*[text()='Add Holiday']")
	public WebElement BusinessHours_AH_PopupHeader;
	
	@FindBy(xpath="//*[@id='add_holiday']//input[@name='start_date']")
	public WebElement BusinessHours_AH_StartDate_TB;
	
	@FindBy(xpath="//*[@id='add_holiday']//input[@name='end_date']")
	public WebElement BusinessHours_AH_EndDate_TB;
	
	@FindBy(xpath="//*[@id='add_holiday']//input[@name='comment']")
	public WebElement BusinessHours_AH_Descriptionfield;
	
	@FindBy(xpath="//*[@id='add_holiday']//button[text()='Close']")
	public WebElement BusinessHours_AH_CloseButton;
	
	@FindBy(xpath="//*[@id='add_holiday']//button[text()='Save']")
	public WebElement BusinessHours_AH_SaveButton;
	
	
	*//*********TC_9_039 Check the field validations in Add Holiday popup**********//*
	
	@FindBy(xpath="//*[@id='add_holiday']//em[text()='Please enter start date']")
	public WebElement BusinessHours_AH_StartDate_EM;
	
	@FindBy(xpath="//*[@id='add_holiday']//em[text()='Please enter end date']")
	public WebElement BusinessHours_AH_EndDate_EM;
	
	@FindBy(xpath="//*[@id='add_holiday']//em[text()='Please enter comment']")
	public WebElement BusinessHours_AH_Comment_EM;
	
	
	*//***************new*********//*
	
	@FindBy(xpath="//*[@id='searchResultsContainerBox']//div/a/h3")
	public WebElement BusinessDetails_BN_In_BP;
	
	@FindBy(xpath="//*[@id='searchResultsContainerBox']//div/a/h3")
	public WebElement BusinessDetails_MBN_In_BP;
	
	@FindBy(xpath="//*[@id='searchResultsContainerBox']//div/ul/li[text()=' Cash On Services']")
	public WebElement PaymentSettings_CashOnService_InBP;*/
	
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
	
	
	@FindBy(xpath="//*[@id='editServiceForm']/div/h4[text()='Add New Service']")
	public WebElement ServiceMenu_editNewServicePopup_Header;
	
	@FindBy(xpath="//*[@id='editServiceForm']//button[text()='Disable']")
	public WebElement SM_EditNewServicePopup_DisableButton;
	
	@FindBy(xpath="//*[@id='editServiceForm']//button[text()='Enable']")
	public WebElement SM_EditNewServicePopup_EnableButton;
	
	@FindBy(xpath="//*[@id='editServiceForm']//button[text()='Delete']")
	public WebElement SM_EditNewServicePopup_DeleteButton;
	
	@FindBy(xpath="//button[text()='Yes, Disable it!']")
	public WebElement SM_EditNewServicePopup_YesDisableIt_Button;
	
	
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
	
/**TC_13_001 Open Payment Processing page***/
	
	@FindBy(xpath="//a[text()='Payment Processing']")
	public WebElement PaymentProcessing_DropdownValue;
	
	@FindBy(xpath="//h3[text()='Payment Processing ']")
	public WebElement PaymentProcessing_Page_Header;
	
	@FindBy(xpath="//div[@ng-bind-html='show_description(cmsContent.description)']")
	public WebElement PaymentProcessing_ContentOnSC_PaymentProcessingetc_TextData;
	
	@FindBy(xpath="//a[text()='Bring your PayPal to ShearCircle ']")
	public WebElement PaymentProcessing_BYPSC_Button;
	
	@FindBy(xpath="//img[contains(@src,'logo_paypal_')]")
	public WebElement PaymentProcessing_PayPalMerchantSignu_Popup;

/******TC_19_001 Open Clients page***********/
	
	@FindBy(xpath="//a[text()='Clients']")
	public WebElement Clients_MenuLink;
	
	@FindBy(xpath="//h3[text()='Clients']")
	public WebElement Clients_PageHeader;
	
	@FindBy(xpath="//*[@placeholder='Search Name or Mobile ']")
	public WebElement Clients_SearchBox;
	
	@FindBy(xpath="//*[text()='New Client']")
	public WebElement Clients_NewClients_Button;
	
	@FindBy(xpath="//section/div/div[@class='dashboar_content datatable_section']")
	public WebElement Clients_Table_Form;
	
	@FindBy(xpath="//section/div/div[2]//table/thead/tr/th[text()='Name']")
	public WebElement Clients_Name_TableHeader;
	
	@FindBy(xpath="//section/div/div[2]//table/thead/tr/th[text()='Mobile Number']")
	public WebElement Clients_Mobile_TableHeader;
	
	@FindBy(xpath="//section/div/div[2]//table/thead/tr/th[text()='Email']")
	public WebElement Clients_Email_TableHeader;
	
	@FindBy(xpath="//section/div/div[2]//table/thead/tr/th[text()='Gender']")
	public WebElement Clients_Gender_TableHeader;
	
	/****TC_19_002 Check the New Client button****/
	
	@FindBy(xpath="//*[@id='addClientForm']/div[1]/h4")
	public WebElement Clients_AddNewClient_Popup_Header;
	
	@FindBy(xpath="//*[@type='email']")
	public WebElement Clients_Email_TextBox;
	
	@FindBy(xpath="//*[@name='mobile']")
	public WebElement Clients_MobileNumber_TextBox;
	
	@FindBy(xpath="//*[@name='mobile']")
	public WebElement Clients_Name_TextBox;
	
	@FindBy(xpath="//*[@name='firstname']")
	public WebElement Clients_FirstName_TextBox;
	
	@FindBy(xpath="//*[@name='lastname']")
	public WebElement Clients_LastName_TextBox;
	
	@FindBy(xpath="//*[@name='address']")
	public WebElement Clients_Address_TextBox;
	
	@FindBy(xpath="//*[@name='city']")
	public WebElement Clients_City_TextBox;
	
	@FindBy(xpath="//*[@name='state']")
	public WebElement Clients_State_TextBox;
	
	@FindBy(xpath="//*[@name='zipcode']")
	public WebElement Clients_ZipCode_TextBox;
	
	@FindBy(xpath="//*[@id='addClientForm']//textarea")
	public WebElement Clients_Notes_TextBox;
	
	@FindBy(xpath="//select[@ng-model='client.notification_setting']")
	public WebElement Clients_SendNotificationsBy_DropDown;
	
	@FindBy(xpath="//select[@name='referal_source_id']")
	public WebElement Clients_ReferralSource_DropDown;
	
	@FindBy(xpath="//select[@name='country']")
	public WebElement Clients_Country_DropDown;
	
	@FindBy(xpath="//div/label/input[@type='radio']")
	public List<WebElement> Clients_Gender_List;
	
	@FindBy(xpath="//button[text()='Close']")
	public WebElement Clients_Close_Button;
	
	@FindBy(xpath="//button[text()='Add Client']")
	public WebElement Clients_AddClients_Button;
	
	/****TC_19_003 Check the mandatory fields in Add New Client popup*****/
	@FindBy(xpath="//em[text()='Enter email']")
	public WebElement Clients_Email_Em;
	
	@FindBy(xpath="//em[text()='Enter firstname']")
	public WebElement Clients_FirstName_Em;
	
	@FindBy(xpath="//em[text()='Enter lastname']")
	public WebElement Clients_LastName_Em;
	
	@FindBy(xpath="//button[text()='OK']")
	public WebElement Confirmatio_OK_Button;
	
	/*************TC_19_004 Check whether a new client can be added*/
	
	@FindBy(xpath="//table/tbody/tr/td[1]")
	public List<WebElement> Clients_Names_List;
	
	@FindBy(xpath="//button[@ng-click='updateClient()']")
	public WebElement Clients_UpadateChanges_Button;
	
	@FindBy(xpath="//button[text()='Delete']")
	public WebElement Client_Delete_Button;

	@FindBy(xpath="//button[text()='Yes, delete it!']")
	public WebElement Client_YesDeleteIt_Button;
	
	@FindBy(xpath="//*[@class='tab-content p-t-2']")
	public WebElement Client_xpath;
	
/*********TS020_Subscriber clicks POS menu******/
	
	/****TC_20_001 Open POS page****/
	
	@FindBy(xpath="//a[text()='POS ']")
	public WebElement POS_MenuLink;
	
	@FindBy(xpath="//h3[contains(text(),'Bookings')]")
	public WebElement Pos_BookingsPage_Header;
	
	@FindBy(xpath="//*[text()='Create Sale Order']")
	public WebElement Pos_BP_CreateSaleOrder_button;
	
	@FindBy(xpath="//table/thead/tr/th")
	public List<WebElement> POS_BP_Table_HeaderDetails_List;
	
	@FindBy(xpath="//*[@placeholder='Search Booking ID ']")
	public WebElement POS_BP_SearchBox;
	
	@FindBy(xpath="//table/tbody/tr/td/h4[text()='No data found']")
	public WebElement POS_BP_NoDataFound_Text;
	
	@FindBy(xpath="//section[2]/div[1]/div[2]//table/tbody/tr")
	public List<WebElement> POS_BP_Details_List;
	
	@FindBy(xpath="//table/tbody/tr[contains(@ng-repeat,'bookings_list')]/td[1]")
	public List<WebElement> POS_BookingId_List;
	
	@FindBy(xpath="//table/tbody/tr/td[5]/a[text()=' View']")
	public List<WebElement> POS_BP_View_ButtonList;
	
	@FindBy(xpath="//table/tbody/tr/td[5]/button[text()=' Delete']")
	public List<WebElement> POS_BP_Delete_ButtonList;
	
	@FindBy(xpath="//*[@id='container_pin']//h3[contains(text(),'POS Booking ID : #')]")
	public WebElement POS_BookingId_H3_header;
	
	/******TC_20_002 Check the Create Sale Order button**********/
	
	@FindBy(xpath="//*[text()='Add New Sale']")
	public WebElement POS_AddNewSale_PopupHeader;
	
	@FindBy(xpath="//*[@ng-click='addProducts()']")
	public WebElement POS_AddProduct_Button;
	
	@FindBy(xpath="//*[@ng-click='addServices()']")
	public WebElement POS_AddService_Button;
	
	@FindBy(xpath="//*[text()='Order Services/Products']")
	public WebElement POS_OrderTemplate_Header;
	
	@FindBy(xpath="//*[text()='Service Name']")
	public WebElement POS_ServiceName;
	
	@FindBy(xpath="//*[text()='Product Name']")
	public WebElement POS_ProductName;
	
	@FindBy(xpath="//div[2]/table/tbody/tr[2]/th[text()='Qty']")
	public WebElement POS_Service_QuantityHeader;
	
	@FindBy(xpath="//div[2]/table/tbody/tr[4]/th[text()='Qty']")
	public WebElement POS_Product_QuantityHeader;
	
	@FindBy(xpath="//div[2]/table/tbody/tr[2]/th[text()='Price']")
	public WebElement POS_Service_PriceHeader;
	
	@FindBy(xpath="//div[2]/table/tbody/tr[4]/th[text()='Price']")
	public WebElement POS_Product_PriceHeader;
	
	@FindBy(xpath="//div[2]/table/tbody/tr[2]/th[text()='Discount ']")
	public WebElement POS_Service_DiscountHeader;
	
	@FindBy(xpath="//div[2]/table/tbody/tr[4]/th[text()='Discount ']")
	public WebElement POS_Product_DiscountHeader;

	@FindBy(xpath="//div[2]/table/tbody/tr[2]/th[text()='Staff ']")
	public WebElement POS_Service_StaffHeader;
	
	@FindBy(xpath="//div[2]/table/tbody/tr[4]/th[text()='Staff ']")
	public WebElement POS_Product_StaffHeader;
	
	@FindBy(xpath="//div[2]/table/tbody/tr[2]/th[text()='Total Price']")
	public WebElement POS_Service_TotalPriceHeader;
	
	@FindBy(xpath="//div[2]/table/tbody/tr[4]/th[text()='Total Price']")
	public WebElement POS_Product_TotalPriceHeader;
	
	@FindBy(xpath="//div[2]/table/tbody/tr[2]/th[text()='Action']")
	public WebElement POS_Service_ActionHeader;
	
	@FindBy(xpath="//div[2]/table/tbody/tr[4]/th[text()='Action']")
	public WebElement POS_Product_ActionHeader;
	
	@FindBy(xpath="//*[text()='Close']")
	public WebElement POS_Close_button;
	
	@FindBy(xpath="//*[text()='Create']")
	public WebElement POS_Create_Button;
	
	/********TC_20_003 Check the +Products button in Add New Sale popup********/
	
	@FindBy(xpath="//div[@ng-if='productsOpen']/ul/li/strong")
	public List<WebElement> POS_ANSP_ProductNameList;
	
	@FindBy(xpath="//ul/li/i[@class='fa fa-plus']")
	public List<WebElement> POS_ANSP_PlusSignprefixed_List;
	
	@FindBy(xpath="//div[@ng-if='productsOpen']/ul/li/span")
	public List<WebElement> POS_ANSP_ProductPriceList;
	
	@FindBy(xpath="//div[@ng-if='productsOpen']")
	public WebElement POS_ANSP_ProductOpenTable;
	
	/****TC_20_004 Check whether product(s) can be added******/
	
	@FindBy(xpath="//*[@id='add_new_offline_booking']//table/tbody/tr[4]/th")
	public List<WebElement> POS_ANSP_AddedProductHeader_th_list;
	
	@FindBy(xpath="//table/tbody/tr[contains(@ng-if,'Product')]/td[1]")
	public WebElement POS_ANSP_AddedProduct_Name;
	
	@FindBy(xpath="//table/tbody/tr[contains(@ng-if,'Product')]/td/input[@ng-model='bd.qty']")
	public WebElement POS_ANSP_AddedProduct_Qty;
	
	@FindBy(xpath="//table/tbody/tr[contains(@ng-if,'Product')]/td/input[@ng-model='bd.applied_price']")
	public WebElement POS_ANSP_AddedProduct_Price;
	
	@FindBy(xpath="//table/tbody/tr[contains(@ng-if,'Product')]/td/input[contains(@ng-model,'bd.discount_in_percentage')]")
	public WebElement POS_ANSP_AddedProduct_Discount;
	
	@FindBy(xpath="//table/tbody/tr[contains(@ng-if,'Product')]/td/div/select[@ng-model='bd.staff_id']")
	public WebElement POS_ANSP_AddedProduct_Staff;
	
	@FindBy(xpath="//table/tbody/tr[contains(@ng-if,'Product')]/td[6]")
	public WebElement POS_ANSP_AddedProduct_TotalPrice;
	
	@FindBy(xpath="//table/tbody/tr[contains(@ng-if,'Product')]/td/button")
	public WebElement POS_ANSP_AddedProduct_CloseButton;

	@FindBy(xpath="//*[@id='add_new_offline_booking']//table/tbody/tr")
	public List<WebElement> POS_ANSP_AddedProduct_tr_list;
	
	@FindBy(xpath="//*[@id='add_new_offline_booking']//div/label/i[@class='fa fa-plus']")
	public List<WebElement> POS_asb_serviceswithplus_list;
	
	@FindBy(xpath="//*[@id='add_new_offline_booking']//div//strong[contains(@ng-if,'special_price')]")
	public List<WebElement> POS_asb_servicesprice_list;
	
	@FindBy(xpath="//*[@id='add_new_offline_booking']//table/tbody/tr[2]/th")
	public List<WebElement> POS_ANSP_AddedservicetHeader_th_list;
	
	@FindBy(xpath="//*[@id='add_new_offline_booking']//table/tbody/tr[contains(@ng-if,'Service')]")
	public WebElement POS_asb_addedservices_tr;
	
	@FindBy(xpath="//*[@id='add_new_offline_booking']//table/tbody/tr[contains(@ng-if,'Product')]")
	public WebElement POS_asb_addedProduct_tr;
	
	@FindBy(xpath="//*[@id='add_new_offline_booking']//table/tbody/tr[contains(@ng-if,'Service')]/td[1]")
	public WebElement POS_asb_addedservicesname_text;
	
	@FindBy(xpath="//*[@id='add_new_offline_booking']//table/tbody/tr[contains(@ng-if,'Service')]/td/input[contains(@ng-model,'qty')]")
	public WebElement POS_asb_addedservicesqty_text;
	
	@FindBy(xpath="//*[@id='add_new_offline_booking']//table/tbody/tr[contains(@ng-if,'Service')]/td/input[contains(@ng-model,'price')]")
	public WebElement POS_asb_addedservicesprice_text;
	
	@FindBy(xpath="//*[@id='add_new_offline_booking']//table/tbody/tr[contains(@ng-if,'Service')]/td/input[contains(@ng-model,'discount_in_percentage')]")
	public WebElement POS_asb_addedservicesdiscount_textbox;
	
	@FindBy(xpath="//*[@id='add_new_offline_booking']//table/tbody/tr[contains(@ng-if,'Service')]/td//select[contains(@ng-model,'staff')]")
	public WebElement POS_asb_addedserviceschoosestaff_dropsown;
	
	@FindBy(xpath="//*[@id='add_new_offline_booking']//table/tbody/tr[contains(@ng-if,'Service')]/td[@class='text-left ng-binding']")
	public WebElement POS_asb_addedservicestotalprice_text;
	
	@FindBy(xpath="//*[@id='add_new_offline_booking']//table/tbody/tr[contains(@ng-if,'Service')]/td/button")
	public WebElement POS_asb_addedservicesclose_button;
		
	@FindBy(xpath="//table[@class='table styapp']/tbody/tr/td[1]")
	public List<WebElement> Appointments_AllAppointments_BookingId_List;	
	
	@FindBy(xpath="//*[@id='choosePaymentOptionsPopup']//h4[text()='Choose Payment Options']")
	public WebElement POS_asb_ChoosePaymentOptions_popup_header;
	
	@FindBy(xpath="//*[@id='choosePaymentOptionsPopup']//input[contains(@ng-click,'cash')]")
	public WebElement POS_asb_ChoosePaymentOptions_popup_rbutton;
	
	@FindBy(xpath="//*[@id='choosePaymentOptionsPopup']//button[text()='Proceed to Checkout']")
	public WebElement POS_asb_CPO_popup_ProceedtoCheckout_button;
	
	@FindBy(xpath="//h2[text()='Are you sure?']")
	public WebElement POS_asb_Areyousure_popup_Header;
	
	@FindBy(xpath="//button[text()='Cancel']")
	public WebElement POS_asb_ays_popup_Cancel_Button;
	
	@FindBy(xpath="//button[text()='Yes, proceed to checkout!']")
	public WebElement POS_asb_ays_popup_YesProceedtocheckout_Button;
	
	@FindBy(xpath="/html/body/div[2]/h2[text()='Success!']")
	public WebElement POS_asb_Success_popup_Header;
	
	@FindBy(xpath="/html/body/div[2]/p[contains(text(),'Booking Created, Request id')]")
	public WebElement POS_asb_Success_popup_BookingID_text;
	
	@FindBy(xpath="//button[text()='OK']")
	public WebElement POS_asb_Success_popup_OK_button;
	
	@FindBy(xpath="//*[@id='container_pin']//table/tbody/tr[1]/td[1]")
	public WebElement POS_Invoice_ServiceName_text;	
	
	@FindBy(xpath="//*[@id='container_pin']//table/tbody/tr[1]/td[4]")
	public WebElement POS_Invoice_ServiceQty_text;
	
	@FindBy(xpath="//*[@id='container_pin']//table/tbody/tr[1]/td[3]")
	public WebElement POS_Invoice_ServicePrice_text;
	
	@FindBy(xpath="//*[@id='container_pin']//table/tbody/tr[2]/td[1]")
	public WebElement POS_Invoice_ProductName_text;	
	
	@FindBy(xpath="//*[@id='container_pin']//table/tbody/tr[2]/td[4]")
	public WebElement POS_Invoice_ProductQty_text;
	
	@FindBy(xpath="//*[@id='container_pin']//table/tbody/tr[2]/td[3]")
	public WebElement POS_Invoice_ProductPrice_text;
	
	@FindBy(xpath="//a[text()=' Email Receipt']")
	public WebElement POS_Invoice_EmailReceipt_Link;
	
	@FindBy(xpath="//a[text()=' Download']")
	public WebElement POS_Invoice_Download_Link;
	
	@FindBy(xpath="//div/a[text()=' Return To POS Bookings']")
	public WebElement POS_Invoice_ReturntoPOSBookings_Link;
	
	@FindBy(xpath="//div[2]/fieldset/input[@placeholder='Email Address']")
	public WebElement POS_Invoice_Popup_EmailAddress_input;
	
	@FindBy(xpath="//div/button[text()='OK']")
	public WebElement POS_Invoice_Popup_OK_button;
	
	@FindBy(xpath="//div/button[text()='Cancel']")
	public WebElement POS_Invoice_Popup_CAncel_button;
	
	@FindBy(xpath="//div/p[text()='Email send successfully']")
	public WebElement POS_Invoice_ESS_Popup_MEssage;
	
	@FindBy(xpath="//div/button[text()='OK']")
	public WebElement POS_Invoice_ESS_Popup_OK_button;
	
	
	
	/***TC_21_002******/
	
	@FindBy(xpath="//*[@id='addStaffForm']//div[@class='col-md-8 detser']")
	public WebElement Appointments_BSP_ServiceDetails_Table;
	
	/***TS014_Subscriber clicks on Manage Products under Manage
    Circle Menu********/
	/***TC_14_001 Open Manage Products page*****/
	
	@FindBy(xpath="//*[text()='Manage Products']")
	public WebElement ManageProducts_DropDown_Value;
	
	@FindBy(xpath="//div[@class='col-md-9']/h3[text()='Products']")
	public WebElement ManageProducts_Products_Page;
	
	@FindBy(xpath="//*[@id='products']//*[text()='No Data found']")
	public WebElement ManageProducts_Products_NoDatafound;

	@FindBy(xpath="//*[@id='yourTabWrapper']/li[4]")
	public WebElement ManageProducts_AllProducts_Tab;

	@FindBy(xpath="//table/tbody/tr[1]/td/button")
	public List<WebElement> ManageProducts_Action_Buttons_List;
	
	@FindBy(xpath="//*[@id='products']/div/div[1]/table/tbody/tr/td[@class='col-md-3']")
	public List<WebElement> ManageProducts_RelaventAction_Buttons_List;
	
	@FindBy(xpath="//*[@id='products']/div/div[1]/table/tbody/tr")
	public List<WebElement> ManageProducts_Produts_List;
	
	@FindBy(xpath="//a[text()='Categories']")
	public WebElement ManageProduct_Categories_Tab;
	
	@FindBy(xpath="//a[text()='Brands']")
	public WebElement ManageProduct_Brands_Tab;
	
	@FindBy(xpath="//a[text()='Suppliers']")
	public WebElement ManageProduct_Suppliers_Tab;
	
	@FindBy(xpath="//a[text()='Add New Product']")
	public WebElement ManageProduct_AddNewProduct_Tab;
	
	/******
	 * TC_14_002 Check the details & action buttons in All Products tab (when products are added)
	 ***********/
	
	@FindBy(xpath="//*[@id='products']/div/div[1]/table/thead/tr/th")
	public List<WebElement> ManageProduct_Product_Table_headersList;
	
	@FindBy(xpath="//*[@id='products']/div/div[1]/table/tbody/tr/td[1]")
	public List<WebElement>  ManageProduct_ProductName_List;
	
	/*****TC_14_003 Check the Categories tab*********/
	
	@FindBy(xpath="//h3[text()='Categories']")
	public WebElement ManageProduct_CategoriesPage_Header;
	
	@FindBy(xpath="//*[@id='categories']//*[text()='No Data found']")
	public WebElement ManageProducts_CP_NoDatafound;
	
	@FindBy(xpath="//*[@id='categories']//*[text()='New Category']")
	public WebElement ManageProduct_CP_NewCategory_Button;
	
	@FindBy(xpath="//*[@id='categories']/div/div[1]/table/tbody/tr")
	public List<WebElement> ManageProducts_CP_Categories_List;
	
	@FindBy(xpath="//*[@id='categories']/div/div[1]/table/thead/tr/th")
	public List<WebElement> ManageProduct_CP_TableHeadersList;
	
	@FindBy(xpath="//*[@id='categories']/div/div[1]/table/tbody/tr/td[1]")
	public List<WebElement> ManageProduct_CP_categoryName_List;
	
	@FindBy(xpath="//*[@id='categories']/div/div[1]/table/tbody/tr/td[2]")
	public List<WebElement> ManageProduct_CP_ProductAssigned_List;
	
	/*****TC_14_004 Check whether new category can be added**********/
	
	@FindBy(xpath="//*[@id='categoryModalPopUp']//h4")
	public WebElement ManageProduct_CP_AddCategory_PopupHeader;
	
	@FindBy(xpath="//*[@id='categoryModalPopUp']//input[@ng-model='categoryData.name']")
	public WebElement ManageProduct_CP_ACP_CategoryTextBox;
	
	@FindBy(xpath="//*[@id='categoryModalPopUp']//button[text()='Save']")
	public WebElement ManageProduct_CP_ACP_SaveButton;
	
	/********TC_14_005 Check whether a Category name can be modified**************/
	
	@FindBy(xpath="//*[@id='categoryModalPopUp']//h4")
	public WebElement ManageProduct_CP_ECP_Header;
	
	/**TC_14_006 Check whether a category can be deleted*********/
	
	@FindBy(xpath="//*[@id='categoryModalPopUp']//button[text()='Delete']")
	public WebElement ManageProduct_CP_ACP_DeleteButton;
	
	@FindBy(xpath="//button[text()='Yes']")
	public WebElement ManageProduct_CP_ACP_YesConformationPopup_Button;
	
	/*****TC_14_007 Check the Brands tab*****/
	
	@FindBy(xpath="//*[@id='brands']//div[1]/h3[text()='Brands']")
	public WebElement ManageProduct_CP_BrandsPage_Header;
	
	@FindBy(xpath="//*[@id='brands']//*[text()='New Brand']")
	public WebElement ManageProduct_BP_NewBrand_Button;
	
	@FindBy(xpath="//*[@id='brands']//*[text()='No Data found']")
	public WebElement ManageProducts_Brands_NoDatafound;
	
	@FindBy(xpath="//*[@id='brands']/div/div[1]/table/tbody/tr")
	public List<WebElement> ManageProduct_BP_Brand_List;
	
	@FindBy(xpath="//*[@id='brands']/div/div[1]/table/thead/tr/th")
	public List<WebElement> ManageProduct_BP_TableHeadersList;

	@FindBy(xpath="//*[@id='brands']/div/div[1]/table/tbody/tr/td[1]")
	public List<WebElement> ManageProduct_BP_BrandName_List;
	
	@FindBy(xpath="//*[@id='brands']/div/div[1]/table/tbody/tr/td[2]")
	public List<WebElement> ManageProduct_BP_ProductsAssigned_List;
	
	/****TC_14_008 Check whether a New Brand can be added *****/
	
	@FindBy(xpath="//*[@id='brandsModalPopUp']//*[text()='Add Brand']")
	public WebElement ManageProduct_BP_AddBrand_PopupHeader;
	
	@FindBy(xpath="//*[@id='brandsModalPopUp']//input[@ng-model='brandData.name']")
	public WebElement ManageProduct_BP_ABP_BrandTextBox;
	
	@FindBy(xpath="//*[@id='brandsModalPopUp']//button[text()='Save']")
	public WebElement ManageProduct_BP_ABP_SaveButton;
	
	/********TC_14_010 Check whether a brand can be deleted********/
	@FindBy(xpath="//*[@id='brandsModalPopUp']//*[text()='Edit Brand']")
	public WebElement ManageProduct_BP_EBP_Header;
	
	@FindBy(xpath="//*[@id='brandsModalPopUp']//button[text()='Delete']")
	public WebElement ManageProduct_BP_ACP_DeleteButton;
	
	@FindBy(xpath="//button[text()='Yes']")
	public WebElement ManageProduct_BP_ACP_YesConformationPopup_Button;

	/***TC_14_011 Check the Suppliers tab********/
	
	@FindBy(xpath="//*[@id='suppliers']//div[1]/h3[text()='Suppliers']")
	public WebElement ManageProduct_SuppliersPage_Header;
	
	@FindBy(xpath="//*[@id='suppliers']//*[text()='No Data found']")
	public WebElement ManageProducts_Suppliers_NoDatafound;
	
	@FindBy(xpath="//*[@id='suppliers']//*[text()='New Supplier']")
	public WebElement ManageProduct_SP_NewSupplier_Button;
	
	@FindBy(xpath="//*[@id='suppliers']/div/div[1]/table/thead/tr/th")
	public List<WebElement> ManageProduct_SP_TableHeadersList;
	
	@FindBy(xpath="//*[@id='suppliers']/div/div[1]/table/tbody/tr/td[1]")
	public List<WebElement> ManageProduct_SP_SuppliersName_List;
	
	@FindBy(xpath="//*[@id='suppliers']/div/div[1]/table/tbody/tr/td[4]")
	public List<WebElement> ManageProduct_SP_ProductAssigned_List;
	
	/****TC_14_012 Check whether a new supplier can be added *****/
	
	@FindBy(xpath="//*[@id='supplierModalPopUp']//h4")
	public WebElement ManageProduct_SP_AddSupplierPopup_Header;
	
	@FindBy(xpath="//*[@id='categoryDataForm']//input[@name='supplier_name']")
	public WebElement ManageProduct_Suppliers_ASP_SupplierName_TextBox;
	
	@FindBy(xpath="//*[@id='categoryDataForm']//input[@name='supplier_mobile']")
	public WebElement ManageProduct_Suppliers_ASP_SupplierMobile_TextBox;
	
	@FindBy(xpath="//*[@name='supplier_description']")
	public WebElement ManageProduct_Suppliers_ASP_SupplieDescription_TextBox;
	
	@FindBy(xpath="//*[@id='categoryDataForm']//input[@name='contact_person_name']")
	public WebElement ManageProduct_Suppliers_ASP_ContactPersonName_TextBox;
	
	@FindBy(xpath="//*[@id='categoryDataForm']//input[@name='contact_person_email']")
	public WebElement ManageProduct_Suppliers_ASP_ContactPersonEmail_TextBox;
	
	@FindBy(xpath="//*[@id='categoryDataForm']//input[@name='contact_person_website']")
	public WebElement ManageProduct_Suppliers_ASP_ContactPersonWebSite_TextBox;
	
	@FindBy(xpath="//*[@id='categoryDataForm']//input[@name='contact_person_mobile']")
	public WebElement ManageProduct_Suppliers_ASP_ContactPersonMobile_TextBox;
	
	@FindBy(xpath="//textarea[@name='contact_person_address']")
	public WebElement ManageProduct_Suppliers_ASP_ContactPersonAddress_TextBox;
	
	@FindBy(xpath="//*[@ng-submit='addorUpdateSupplier()']/button[text()='Save']")
	public WebElement ManageProduct_Suppliers_ASP_SaveButton;
	
	/********TC_14_013 Check whether Supplier name/details can be edited********/
	@FindBy(xpath="//*[@id='supplierModalPopUp']//h4[text()='Edit Supplier']")
	public WebElement ManageProduct_Suppliers_ESP_Header;

	/***TC_14_014 Check whether Supplier can be deleted********/
	
	@FindBy(xpath="//button[text()='Delete']")
	public WebElement ManageProduct_Suppliers_ASP_DeleteButton;
	
	@FindBy(xpath="//button[text()='Yes']")
	public WebElement ManageProduct_Suppliers_ASP_YesConformationPopup_Button;
	
	/*****TC_14_015 Check Add New Product tab************/
	
	@FindBy(xpath="//h3[text()='Add New Product']")
	public WebElement ManageProduct_AddNewProduct_PageHeader;
	
	@FindBy(xpath="//*[@id='addProductTab']//div/input[@name='product_name']")
	public WebElement ManageProduct_AddNewProduct_ProductName_Textbox;
	
	@FindBy(xpath="//*[@id='addProductTab']//div/textarea[@name='product_description']")
	public WebElement ManageProduct_AddNewProduct_ProductDescription_Textbox;
	
	@FindBy(xpath="//*[@id='addProductTab']//div/input[@ng-model='productData.supply_price']")
	public WebElement ManageProduct_AddNewProduct_SupplyPrice_Textbox;
	
	@FindBy(xpath="//*[@id='addProductTab']//div/input[@ng-model='productData.retail_price']")
	public WebElement ManageProduct_AddNewProduct_RetailPrice_Textbox;
	
	@FindBy(xpath="//*[@id='addProductTab']//div/input[@ng-model='productData.special_price']")
	public WebElement ManageProduct_AddNewProduct_SpecialPrice_Textbox;
	
	@FindBy(xpath="//*[@id='addProductTab']//div[1]/select")
	public WebElement ManageProduct_AddNewProduct_Brand_DropdownValues;
	
	@FindBy(xpath="//*[@id='addProductTab']//div[2]/select")
	public WebElement ManageProduct_AddNewProduct_Category_DropdownValues;
	
	@FindBy(xpath="//*[@id='addProductTab']//div[3]/select")
	public WebElement ManageProduct_AddNewProduct_Supplier_DropdownValues;
	
	@FindBy(xpath="//*[@id='addProductTab']//button[@title='Add New Brand']")
	public WebElement ManageProduct_AddNewProduct_AddNewBrand_Button;
	
	@FindBy(xpath="//*[@id='addProductTab']//button[@title='Add New Category']")
	public WebElement ManageProduct_AddNewProduct_AddNewCategory_Button;
	
	@FindBy(xpath="//*[@id='addProductTab']//button[@title='Add New Supplier']")
	public WebElement ManageProduct_AddNewProduct_AddNewSupplier_Button;
	
	@FindBy(xpath="//*[@id='addProductTab']//button[text()='Save']")
	public WebElement ManageProduct_AddNewProduct_Save_Button;
	
	@FindBy(xpath="//*[@id='addProductTab']//div/input")
	public List<WebElement> ManageProduct_AddNewProduct_Input_TextBox_List;
	
	/******TC_14_017 Check whether a new brand can be added in Add New Product page*****/
	
	@FindBy(xpath="//*[@id='brandsModalPopUp']//*[text()='Add Brand']")
	public WebElement ManageProduct_AddNewProduct_AddBrand_PopupHeader;
	
	@FindBy(xpath="//*[@id='brandsModalPopUp']//input[@ng-model='brandData.name']")
	public WebElement ManageProduct_AddNewProduct_ABP_BrandTextBox;
	
	@FindBy(xpath="//*[@id='brandsModalPopUp']//button[text()='Save']")
	public WebElement ManageProduct_AddNewProduct_ABP_SaveButton;
	
	/************TC_14_018 Check whether a new Category can be added in Add New Product page******/
	
	@FindBy(xpath="//*[text()='Add Category']")
	public WebElement ManageProduct_AddNewProduct_AddCategory_PopupHeader;
	
	@FindBy(xpath="//input[@ng-model='categoryData.name']")
	public WebElement ManageProduct_AddNewProduct_AddCategory_CategoryTextBox;
	
	@FindBy(xpath="//*[@id='categoryModalPopUp']//button[text()='Save']")
	public WebElement ManageProduct_AddNewProduct_AddCategory_SaveButton;
	
	/***TC_14_019 Check whether a new Supplier can be added in Add New Product page***/
	
	@FindBy(xpath="//*[text()='Add Supplier']")
	public WebElement ManageProduct_AddNewProduct_AddSupplierPopup_Header;
	
	@FindBy(xpath="//*[@id='categoryDataForm']//input[@name='supplier_name']")
	public WebElement ManageProduct_AddNewProduct_ASP_SupplierName_TextBox;
	
	@FindBy(xpath="//*[@id='categoryDataForm']//input[@name='supplier_mobile']")
	public WebElement ManageProduct_AddNewProduct_ASP_SupplierMobile_TextBox;
	
	@FindBy(xpath="//*[@name='supplier_description']")
	public WebElement ManageProduct_AddNewProduct_ASP_SupplieDescription_TextBox;
	
	@FindBy(xpath="//*[@id='categoryDataForm']//input[@name='contact_person_name']")
	public WebElement ManageProduct_AddNewProduct_ASP_ContactPersonName_TextBox;
	
	@FindBy(xpath="//*[@id='categoryDataForm']//input[@name='contact_person_email']")
	public WebElement ManageProduct_AddNewProduct_ASP_ContactPersonEmail_TextBox;
	
	@FindBy(xpath="//*[@id='categoryDataForm']//input[@name='contact_person_website']")
	public WebElement ManageProduct_AddNewProduct_ASP_ContactPersonWebSite_TextBox;
	
	@FindBy(xpath="//*[@id='categoryDataForm']//input[@name='contact_person_mobile']")
	public WebElement ManageProduct_AddNewProduct_ASP_ContactPersonMobile_TextBox;
	
	@FindBy(xpath="//textarea[@name='contact_person_address']")
	public WebElement ManageProduct_AddNewProduct_ASP_ContactPersonAddress_TextBox;
	
	@FindBy(xpath="//*[@ng-submit='addorUpdateSupplier()']/button[text()='Save']")
	public WebElement ManageProduct_AddNewProduct_ASP_SaveButton;
	
	/*****TC_14_020 Check whether a product detail/price can be changed*********/
	
	@FindBy(xpath="//*[@id='productModalPopUp']//h4[text()='Edit Product']")
	public WebElement ManageProduct_AllProduct_EditProductPopup_Header;

	@FindBy(xpath="//*[@id='productModalPopUp']//input[@ng-model='productData.product_name']")
	public WebElement ManageProduct_AllProduct_EPP_ProductName_TextBox;
	
	@FindBy(xpath="//*[@id='productModalPopUp']//input[@ng-model='productData.retail_price']")
	public WebElement ManageProduct_AllProduct_EPP_ProductRetailPrice_TextBox;
	
	@FindBy(xpath="//*[@id='products']/div/div[1]/table/tbody/tr/td[2]")
	public List<WebElement> ManageProduct_AllProduct_RetailPrice_List;
	
	@FindBy(xpath="//*[@id='productModalPopUp']//button[text()='Save']")
	public WebElement ManageProduct_AllProduct_EPP_Save_Button;
	
	/*****TC_14_021 Check whether a product can be deleted********/
	
	@FindBy(xpath="//*[@id='productModalPopUp']//button[text()='Delete']")
	public WebElement ManageProduct_AllProduct_EPP_Delete_Button;
	
	@FindBy(xpath="//button[text()='Yes']")
	public WebElement ManageProduct_AllProduct_EPP_Yes_Button;
	
	
	/*******TC_14_022 Check the Add Stock (+) button*********/
	
	@FindBy(xpath="//*[@id='increaseStockPopup']//h4")
	public WebElement ManageProduct_AllProduct_AddStockForTheHealthTips_PopupHeader;
	
	@FindBy(xpath="//*[@id='products']//button[@ng-click='increaseStockAction(item)']")
	public List<WebElement>  ManageProduct_AllProduct_IncreaseStockAction_ButtonList;
	
	@FindBy(xpath="//*[@id='increaseStockPopup']//input[@ng-model='increaseProductItem.qty']")
	public WebElement ManageProduct_AllProduct_AddStockForTheHealthTips_Quality_Textbox;
	
	@FindBy(xpath="//*[@id='increaseStockPopup']//input[@ng-model='increaseProductItem.supply_price']")
	public WebElement ManageProduct_AllProduct_AddStockForTheHealthTips_SupplyPrice_TextBox;
	
	@FindBy(xpath="//*[@id='increaseStockPopup']//select[@ng-model='increaseProductItem.action']")
	public WebElement ManageProduct_AllProduct_AddStockForTheHealthTips_AdjustmentReason_SelectionValues;
	
	@FindBy(xpath="//*[@id='increaseStockPopup']//input[@name='save_price_for_next_time']")
	public WebElement ManageProduct_AllProduct_AddStockForTheHealthTips_SavePriceForNexttime_CheckBox;
	
	@FindBy(xpath="//*[@id='increaseStockPopup']//button[text()='Save']")
	public WebElement ManageProduct_AllProduct_AddStockForTheHealthTips_Save_Button;
	
	@FindBy(xpath="//*[@id='increaseStockPopup']//button[text()='Cancel']")
	public WebElement ManageProduct_AllProduct_AddStockForTheHealthTips_Cancel_Button;

	@FindBy(xpath="//*[@id='products']/div/div[1]/table/tbody/tr/td[3]")
	public List<WebElement> ManageProduct_AllProduct_StockOnHand_List;
	
	/**********TC_14_024 Check the decrease stock (-) button*********/
	@FindBy(xpath="//*[@id='products']//button[@ng-click='decreaseStockAction(item)']")
	public List<WebElement>  ManageProduct_AllProduct_DecreaseStockAction_ButtonList;
	
	@FindBy(xpath="//*[@id='decreaseStockPopup']//h4[text()='Decrease Stock for the Health Tips']")
	public WebElement ManageProduct_AllProduct_DecreaseStockForTheHealthTips_PopupHeader;
	
	@FindBy(xpath="//*[@id='decreaseStockPopup']//input[@ng-model='decreaseProductItem.qty']")
	public WebElement ManageProduct_AllProduct_DecreaseStockForTheHealthTips_Quality_Textbox;
	
	@FindBy(xpath="//*[@id='decreaseStockPopup']//select[@name='action']")
	public WebElement ManageProduct_AllProduct_DecreaseStockForTheHealthTips_AdjustmentReason_SelectionValues;
	
	@FindBy(xpath="//*[@id='decreaseStockPopup']//button[text()='Save']")
	public WebElement ManageProduct_AllProduct_DecreaseStockForTheHealthTips_Save_Button;
	
	@FindBy(xpath="//*[@id='decreaseStockPopup']//button[text()='Cancel']")
	public WebElement ManageProduct_AllProduct_DecreaseStockForTheHealthTips_Cancel_Button;
	
	/***************TC_14_026 Check the stock history**********/
	@FindBy(xpath="//*[@id='products']//button[@ng-click='viewStockHistory(item)']")
	public List<WebElement>  ManageProduct_AllProduct_ViewStockHistoryAction_ButtonList;
	
	@FindBy(xpath="//*[@id='stockHistoryPopup']//h4[text()='Stock History for the Health Tips']")
	public WebElement ManageProduct_AllProduct_StockHistoryForTheHealthTips_PopuHeader;
	
	@FindBy(xpath="//*[@id='stockHistoryPopup']//table/thead/tr/th")
	public List<WebElement> ManageProduct_AllProduct_StockHistoryForTheHealthTips_TableHeaderList;
	
	@FindBy(xpath="//*[@id='stockHistoryPopup']//table/tbody/tr")
	public List<WebElement> ManageProduct_AllProduct_StockHistoryForTheHealthTips_Actionperformed_List;
	
	/**********TS021_Subscriber clicks on Appointments menu**********/
	/*****TC_21_001 Open Appointments page*****/
	
	@FindBy(xpath="//a[text()='Appointments']")
	public WebElement Appointments_Menu_Link;
	
	@FindBy(xpath="//div[@class='dashboard_title']//h3[contains(text(),'Appointments')]")
	public WebElement Appointments_AppointmentsPage_Header;
	
	@FindBy(xpath="//*[text()='No Appointments found']")
	public WebElement Appointments_NoAppointmentsFound_Text;
	
	@FindBy(xpath="//h4[text()='All Appointments']")
	public WebElement Appointments_AllAppointments_Text;
	
	@FindBy(xpath="//table/tbody/tr/td[@data-label='Booking Id']")
	public List<WebElement> Appointments_AllAppointments_BookingID_List;

	@FindBy(xpath="//table[@class='table styapp']/thead//th")
	public List<WebElement> Appointments_AllAppointments_TableHeaders_List;
	
	@FindBy(xpath="//select[@name='date_range']")
	public WebElement Appointments_AllAppointments_FilterByDate;
	
	@FindBy(xpath="//select[@ng-model='selectedStaff']")
	public WebElement Appointments_AllAppointments_FilterByStaff;
	
	@FindBy(xpath="//select[@ng-model='appointment_status']")
	public WebElement Appointments_AllAppointments_FilterByAppointmentStatus;
	
	@FindBy(xpath="//button[@ng-click='trackByTransactionAction()']")
	public WebElement Appointments_AllAppointments_TrackTransactionStatus_Button;
	
	@FindBy(xpath="//*[@ng-click='addNewAppointment()']")
	public WebElement Appointments_AllAppointments_AddNewAppointment_Button;
	
	@FindBy(xpath="//*[@ng-model='searchAppointmentById']")
	public WebElement Appointments_AllAppointments_SearchBox;
	
	/*@FindBy(xpath="//table[@class='table styapp']/tbody/tr/td[2]")
	public List<WebElement> Appointments_AllAppointments_AppointmentTime_List;
	
	@FindBy(xpath="//table[@class='table styapp']/tbody/tr/td[3]")
	public List<WebElement> Appointments_AllAppointments_CustomerName_List;*/
	
	@FindBy(xpath="//table[@class='table styapp']/tbody/tr")
	public List<WebElement> Appointments_AllAppointments_List;
	
	@FindBy(xpath="//table[@class='table styapp']/tbody/tr/td[8]")
	public List<WebElement> Appointments_AllAppointments_StatusList;
	
	/***TC_21_002******/
	
	@FindBy(xpath="//*[@id='addStaffForm']/div[1]/h4")
	public WebElement Appointments_BookingSummaryPopupAnd_Id;
	
	@FindBy(xpath="//*[@id='addStaffForm']//strong[2]")
	public WebElement Appointments_BSP_StaffBooked_Name;
	
	@FindBy(xpath="//*[@id='addStaffForm']//strong[3]")
	public WebElement Appointments_BSP_AppointmentDateAndTime;
	
	@FindBy(xpath="//*[@id='addStaffForm']//table/thead/tr/th")
	public List<WebElement> Appointments_BSP_SelectedServices_TableHeadersList;
	
	@FindBy(xpath="//*[@id='addStaffForm']//table/tbody/tr/th")
	public List<WebElement> Appointments_BSP_CustomerDetails_TableHeadersList;
	
	@FindBy(xpath="//*[@id='addStaffForm']//div[2]/table/tbody/tr/td")
	public List<WebElement> Appointments_BSP_CustomerDetails_TableDataValue;
	
	@FindBy(xpath="//*[@id='addStaffForm']//div[1]/table/tbody/tr/td")
	public List<WebElement> Appointments_BSP_SelectedService_DetailsDataValue;
	
	@FindBy(xpath="//*[@id='addStaffForm']//a[text()='  View Appointment']")
	public WebElement Appointments_BSP_ViewAppointment_Button;
	
	@FindBy(xpath="//*[@id='addStaffForm']//div/a[text()='  Check Out']")
	public WebElement Appointments_BSP_CheckOut_Button;
	
	@FindBy(xpath="//*[@id='addStaffForm']/div[1]/button[@class='close']")
	public WebElement Appointments_BSP_Close_Button;
	
	/****TC_21_003 Check the available options for booking with status as New**********/
	
	@FindBy(xpath="//table[@class='table styapp']//*[text()='New']//preceding::td[7]")
	public List<WebElement> Appointments_AllAppointments_BookingIDHavig_NewStatus;
	
	@FindBy(xpath="//table[@class='table styapp']//button[text()='New']")
	public List<WebElement>  Appointments_AllAppointments_NewStatusButton_List;
	
	@FindBy(xpath="//ul[@class='pagination']/li/a")
	public List<WebElement>  Appointments_AllAppointments_PaginationButton_List;
	
	@FindBy(xpath="//*[@id='addStaffForm']//div/button[@ng-click='doCancelAppointment(bookingView)']")
	public WebElement Appointments_BSP_CancelBooking_Button;
	
	@FindBy(xpath="//*[@id='addStaffForm']//div/button[@ng-click='doRescheduleAppointment(bookingView)']")
	public WebElement Appointments_BSP_Reschedule_Button;
	
	@FindBy(xpath="//*[@id='addStaffForm']//div/button[text()='Confirmed']")
	public WebElement Appointments_BSP_Confirmed_Button;
	
	
	
	/********TC_21_004 Check whether available timeslots are displayed when we click on Reschedule button.************/
	
	@FindBy(xpath="//*[@id='reschedulePopup']/div/div/div[1]/h4[contains(text(),'Reschedule Time for ')]")
	public WebElement Appointments_RescheduleTimeForAppointment_PopupHeader;
	
	@FindBy(xpath="//*[@id='reschedulePopup']//h4[text()='Available Times']")
	public WebElement Appointments_RTAPP_AvailableTimes;
	
	@FindBy(xpath="//*[@id='cal2']/div[2]//div[@class='cell-content']")
	public List<WebElement>  Appointments_RTAPP_AvailableTimesDayList;
	
	@FindBy(xpath="//*[@id='reschedulePopup']//h4[@ng-if='availableProfessionalTimeslots.length == 0']")
	public WebElement  Appointments_RTAPP_NoAvailableTime_Slots;
	
	/******TC_21_005 Check whether an appointment can be Rescheduled**********/
	
	@FindBy(xpath="//*[@id='reschedulePopup']//div[@class='col-md-11 ng-binding']")
	public List<WebElement> Appointments_RTAPP_AvailableTimes_List;
	
	@FindBy(xpath="//*[text()='Yes, Proceed to reschedule!']")
	public WebElement Appointments_RTAPP_YesProceedToReschedulePopup;
	
	/****TC_21_007 Check whether the Customer receives reschedule notification*******/
	
	
	/***TC_21_009 Check the available options in a Cancelled booking*****///
	@FindBy(xpath="//table/tbody/tr/td/label[text()='Cancelled']")
	public List<WebElement> Appointments_AllAppointments_CancelledStatus_List;
	
	@FindBy(xpath="//table[@class='table styapp']//*[text()='Cancelled']//preceding::td[7]")
	public List<WebElement> Appointments_AllAppointments_BookingIDHavig_CancelledStatus;
	
	/****TC_21_012 Check the options available for booking with status as Completed***/
	
	@FindBy(xpath="//table/tbody/tr/td/button[text()='Completed']")
	public List<WebElement> Appointments_AllAppointments_CompletedStatus_List;
	
	@FindBy(xpath="//table[@class='table styapp']//*[text()='Completed']//preceding::td[7]")
	public List<WebElement> Appointments_AllAppointments_BookingIDHavig_CompletedStatus;
	
	/***TC_21_013 Check whether receipt/invoice can be viewed for Completed booking*****/
	
	@FindBy(xpath="//*[@id='container_pin']")
	public WebElement Appointments_AllAppointments_ReceiptPDF_Page;
	
	@FindBy(xpath="//*[@class='container']//a")
	public List<WebElement> Appointments_AllAppointments_ReceiptPDF_OptionList;
	
	@FindBy(xpath="//*[text()='Enter recipient email address']")
	public WebElement Appointments_AllAppointments_EmailPopup;
	
	@FindBy(xpath="//input[@placeholder='Email Address']")
	public WebElement Appointments_AllAppointments_EmailTextBox;
		
	/***TC_21_017 Check whether an appointment can be confirmed************/
	@FindBy(xpath="//table/tbody/tr/td/button[text()='Confirmed']")
	public List<WebElement>  Appointments_AllAppointments_ConfirmedStatus_List;
	
	@FindBy(xpath="//table[@class='table styapp']//*[text()='Confirmed']//preceding::td[7]")
	public List<WebElement> Appointments_AllAppointments_BookingIDHavig_ConfirmedStatus;
	
	@FindBy(xpath="//div[@class='datatable_x_scroll table-mobile']")
	public WebElement Appointments_AllAppointments_FilterTable;
	
	/***TC_21_021 Check filter by date Custom Range**/
	
	@FindBy(xpath="//div[@class='xdsoft_calendar']/table/tbody/tr/td")
	public List<WebElement>  Appointments_FromDate_List;
	
	/*******TC_21_024 Check the search box**********/
	
	@FindBy(xpath="//button[@ng-click='updateFilterAppointments()']")
	public WebElement Appointments_AllAppointments_SeacrchIcon_Button;
	
	/*****TS022_Subscriber creates a Walk-in Appointment****/
	/****TC_22_001 Check the +New Appointments button****/
	
	@FindBy(xpath="//*[@id='addBookingForm']/div[1]//*[text()='New Booking']")
	public  WebElement NewAppointments_NewBooking_PageHeader;
	
	@FindBy(xpath="//*[@id='addBookingForm']//label/input")
	public  List<WebElement> NewAppointments_Serviece_CheckBox_List;
	
	@FindBy(xpath="//*[@id='addBookingForm']//label")
	public  List<WebElement> NewAppointments_ServiecesName_List;
	
	@FindBy(xpath="//*[@id='addBookingForm']//div/span")
	public List<WebElement> NewAppointments_Servieces_Duration_List;
	
	@FindBy(xpath="//*[@id='addBookingForm']//strong")
	public List<WebElement> NewAppointments_Servieces_PriceList;
	
	/***TC_22_002 Check whether single/multipleservices can be selected****/
	
	@FindBy(xpath="//*[@id='addBookingForm']//table/tbody/tr/td/strong/span")
	public List<WebElement> NewAppointments_Servieces_UpadateDetails_List;
	
	@FindBy(xpath="//*[@id='addBookingForm']/div[2]/div/div/div[2]/table")
	public WebElement  NewAppointments_Servieces_UpadtedTable;
	
	@FindBy(xpath="//*[@id='addBookingForm']//button[text()='Next']")
	public WebElement NewAppointments_Next_Button;
	
	/*****TC_22_003 Check the Next button in services page***/
	@FindBy(xpath="//*[@id='addBookingForm']//div[@ng-if='availableStaff.length > 0']")
	public WebElement NewAppointments_StaffPage;
	
	@FindBy(xpath="//*[@id='addBookingForm']//label/object/img")
	public List<WebElement> NewAppointments_Staff_List;
	
	@FindBy(xpath="//*[@id='addBookingForm']//button[text()='Back']")
	public WebElement NewAppointments_Back_Button;
	
	/*****TC_22_004 Check whether the Back button in Staff page returns to Service page****/
	@FindBy(xpath="//*[@id='addBookingForm']/div[2]/div/div/div[1]/div")
	public WebElement  NewAppointments_Service_Page;
	
	@FindBy(xpath="//*[@id='addBookingForm']//table/tbody/tr[@class='ng-scope']")
	public List<WebElement> NewAppointments_UpdateSelectedService_List;
	
	/***TC_22_006 Check the Next button in Staff selection page****/
	@FindBy(xpath="//*[@id='addBookingForm']/div[2]/div/div/div[@ng-if='enableCustomerForm']")
	public WebElement NewAppointments_CustomerDetails_Page;
	
	@FindBy(xpath="//*[@id='addBookingForm']//*[@id='email']")
	public WebElement NewAppointments_CustomerEmail_TextBox;
	
	@FindBy(xpath="//*[@id='addBookingForm']//*[@id='customer_name']")
	public WebElement NewAppointments_CustomerName_TextBox;
	
	@FindBy(xpath="//*[@id='addBookingForm']//*[@id='mobile']")
	public WebElement NewAppointments_CustomerMobile_TextBox;
	
	@FindBy(xpath="//*[@id='addBookingForm']//center/img")
	public WebElement NewAppointments_StaffImage;
	
	/***TC_22_009 Check whether available timeslots are displayed******/
	
	@FindBy(xpath="//*[@id='addBookingForm']//h5[@ng-if='availableProfessionalTimeslots.length == 0']")
	public WebElement NewAppointments_AvailableNoTimeslots;
	
	@FindBy(xpath="//*[@id='addBookingForm']//h4[text()='Available Times']")
	public WebElement NewAppointments_AvailableTimes_Header;
	
	@FindBy(xpath="//*[@id='newBookingCalendar']//div/div[@class='cell-content']")
	public List<WebElement>  NewAppointments_AvailableTimesDayList;
	
	@FindBy(xpath="//*[@id='addBookingForm']//div[@class='col-md-11 ng-binding']")
	public List<WebElement> NewAppointments_AvailableTimes_List;
	
	@FindBy(xpath="//*[text()='Yes, Proceed to reschedule!']")
	public WebElement NewAppointments_YesProceedToPopup;


}
