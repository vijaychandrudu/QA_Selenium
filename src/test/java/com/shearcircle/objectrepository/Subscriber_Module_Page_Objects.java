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
	
	
	
	
	
	
	
}
