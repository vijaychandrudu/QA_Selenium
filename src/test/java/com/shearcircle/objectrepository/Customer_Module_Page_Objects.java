package com.shearcircle.objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Customer_Module_Page_Objects{

//object information
	
	@FindBy(xpath="//*[@id='sub_content']/h1[text()='Register With ShearCircle']")	
    public WebElement Customer_RegisterWithShearCircle_Header;	

	@FindBy(xpath="//div/h1/b[text()='Customer?']//parent::h1/following-sibling::a[text()='Join Our Circle']")	
    public WebElement customerJoinCircle_Link;	
	
	@FindBy(xpath="//div/h1/b[text()='Professional?']//parent::h1/following-sibling::a[text()='Join Our Circle']")	
    public WebElement ProfessionalJoinCircle_Link;	
	
	@FindBy(xpath="//div/h2/b[text()='Join Now']")	
    public WebElement Customer_JoinNow_Header;	
	
		
	@FindBy(xpath="//*[@id=\"position\"]/div/ul/li[text()='Customer']")	
    public WebElement Customer_Joincircle_navigation;	
	@FindBy(xpath="//*[@id='position']/div/ul/li[text()='Professional']")	
    public WebElement Subscriber_Joincircle_navigation;		
	@FindBy(xpath="//*[@name='firstname']")	
    public WebElement Customer_FirstName_textbox;	
	@FindBy(xpath="//input[@name='lastname']")
	public WebElement Customer_LastName_textbox;	
	@FindBy(xpath="//input[@name='username']")
	public WebElement Customer_Email_textbox;
	@FindBy(xpath="//*[@id='password']")
	public WebElement Customer_Password_textbox;
	@FindBy(xpath="//input[@name='cnf_password']")
	public WebElement Customer_ReEnterPassword_textbox;
	@FindBy(xpath="//input[@name='has_agreed']")
	public WebElement Customer_Termsofservice_checkbox;
	@FindBy(xpath="//input[@name='accepted_billing_agreement']")
	public WebElement Customer_billingagrement_checkbox;
	@FindBy(xpath="//*[@id='register_form']/div/button")
	public WebElement Customer_joinourcircle_button;
	@FindBy(xpath="//div/h5/a/u['Sign in']")
	public WebElement Customer_signin_button;
	
	@FindBy(xpath="//div/h2[text()='Congratulations..!']")
	public WebElement Customer_Success_Message;
	
	@FindBy(xpath="//div/p[contains(text(),'Registration successful')]")
	public WebElement Customer_Success_Message1;
	
	@FindBy(xpath="//div/div/button[@class='confirm']")
	public WebElement Customer_Confirmation_OK_Button;	
			
	@FindBy(xpath="//*[@id='register_form']/div/em[@for='firstname']")
	public WebElement Customer_invalidFirstname_errorMessage;	
	
	@FindBy(xpath="//*[@id='register_form']/div/em[@for='lastname']")
	public WebElement Customer_invalidLastname_errorMessage;	
		
	@FindBy(xpath="//*[@id='register_form']/div/em[text()='Please enter a valid email address']")
	public WebElement Customer_invalidEmail_errorMessage;
	
	@FindBy(xpath="//*[@id='register_form']/div/em[@for='password']")
	public WebElement Customer_invalidPassword_errorMessage;
	
	@FindBy(xpath="//*[@id='register_form']/div/em[@for='cnf_password']")
	public WebElement Customer_invalidRePassword_errorMessage;
	
	@FindBy(xpath="//*[@id='register_form']/div//em[@for='has_agreed']")
	public WebElement Customer_AcceptTermsandConditons_errorMessage;
	
	@FindBy(xpath="//*[@id='register_form']/div//em[@for='accepted_billing_agreement']")
	public WebElement Customer_AcceptourbillingAgreement_errorMessage;	
	
	@FindBy(xpath="//*[@id='register_form']//u[text()='Terms of Service']/parent::a")
	public WebElement Customer_termsofservice_hyperlynk;

	@FindBy(xpath="//*[@id='register_form']//u[text()='Privacy Policy']/parent::a")
	public WebElement Customer_privacypolycy_hyperlynk;

	@FindBy(xpath="//*[@id='register_form']//u[text()='Billing Agreement']/parent::a")
	public WebElement Customer_billingaggrement_hyperlynk;

	@FindBy(xpath="//*[@id='myModalLabel'][text()='Terms and Conditions']")
	public WebElement Customer_termsofservice_hyperlynk_header;
	
	@FindBy(xpath="/html/body/div[3]/div/div/div/div/button[text()='Close']")
	public WebElement Customer_Termsofservice_Close_Button;

	@FindBy(xpath="//section[2]/div/h5/a/u[text()='Sign in']")
	public WebElement Customer_signin_hyperlynk;

	@FindBy(xpath="//*[@id='myModalLabel'][text()='Privacy Policy']")
	public WebElement Customer_privacypolycy_hyperlynk_header;
	
	@FindBy(xpath="/html/body/div[4]/div/div/div/div/button[text()='Close']")
	public WebElement Customer_Privacypolycy_Close_Button;

	@FindBy(xpath="//*[@id='myModalLabel'][text()='Billing Agreement']")
	public WebElement Customer_billingaggrement_hyperlynk_header;
	
	@FindBy(xpath="/html/body/div[5]/div/div/div/div/button[text()='Close']")
	public WebElement Customer_Billingaggrement_Close_Button;

	@FindBy(xpath="//*[@id='sub_content']/h1")
	public WebElement Customer_signin_hyperlynk_header;	
	
	
	//div[@class='modal-header']/h3/parent::div/following-sibling::div[@class='modal-footer']/button[text()='Close' and @class='btn btn-primary']
	@FindBy(xpath="//div/div/h3[contains(text(),'Welcome')]")
	public WebElement Customer_Mydashboard_fullname;
	
	@FindBy(xpath="//div/div/div/div/div/div/p")
	public WebElement Customer_Mydashboard_LastLoginDatetime;	
	
	@FindBy(xpath="//div/div/div/div[text()='Upcoming']")
	public WebElement Customer_Mydashboard_upcomingbookings;
	
	@FindBy(xpath="//div/div/div/div[text()='Upcoming']/following-sibling::div/h4")
	public WebElement Customer_Mydashboard_upcomingbookings_count;

	@FindBy(xpath="//div/div[text()='Past Bookings']")
	public WebElement Customer_Mydashboard_Pastbookings;
	
	@FindBy(xpath="//div/div[text()='Past Bookings']/following-sibling::div/h4")
	public WebElement Customer_Mydashboard_Pastbookings_count;

	@FindBy(xpath="//div[3]//div/div/button[text()=' Change Profile Picture']")
	public WebElement Customer_Mydashboard_changeProfilepicture;
	
	@FindBy(xpath="//div/div/div/div/div/div/img")
	public WebElement Customer_Mydashboard_Profilepicture;


	@FindBy(xpath="//*[@id='filters_col']//li[@class='active']/a[text()=' My Dashboard']")
	public WebElement Customer_Mydashboard_myfavourites;

	@FindBy(xpath="//*[@id='filters_col']//a[text()=' My Appointments']")
	public WebElement Customer_Mydashboard_Myappoinments;

	@FindBy(xpath="/html/body/div/div/div/div/div/div[@class='col-md-12']")
	public WebElement Customer_Mydashboard_Myappoinments_header;

	@FindBy(xpath="//table/tbody/tr[2]/td/h3[text()='No Appointments Found']")
	public WebElement Customer_Mydashboard_Myappoinments_Noappoinments_header;

	@FindBy(xpath="/html/body/div/div/div/div/div/div[@class='col-md-12']")
	public WebElement Customer_Mydashboard_Myappoinments_selectedappoinments_header;

	@FindBy(xpath="//div/table/tbody/tr/th[text()='# ID']")
	public WebElement Customer_Mydashboard_Myappoinments_ID;

	@FindBy(xpath="//div/table/tbody/tr/th[text()='Appointment Date & Time']")
	public WebElement Customer_Mydashboard_Myappoinments_Datetime;

	@FindBy(xpath="//div/table/tbody/tr/th[text()='Business Name']")
	public WebElement Customer_Mydashboard_Myappoinments_businessname;

	@FindBy(xpath="//div/table/tbody/tr/th[text()='Business Name']")
	public WebElement Customer_Mydashboard_Myappoinments_amount;

	@FindBy(xpath="//div/table/tbody/tr/th[text()='Business Name']")
	public WebElement Customer_Mydashboard_Myappoinments_appoinmentstatus;

	@FindBy(xpath="//div/table/tbody/tr/th[text()='Business Name']")
	public WebElement Customer_Mydashboard_Myappoinments_paymentstatus;

	@FindBy(xpath="//div/table/tbody/tr/th[text()='Business Name']")
	public WebElement Customer_Mydashboard_Myappoinments_action;
	
	@FindBy(xpath="//div/div/select/option[text()='Type']")
	public WebElement Customer_Mydashboard_Myappoinments_type;

	@FindBy(xpath="//div/div/select/option[text()='Upcoming Appointments']")
	public WebElement Customer_Mydashboard_Myappoinments_upcomingappinments;

	@FindBy(xpath="//div/div/select/option[text()='Past Appointments']")
	public WebElement Customer_Mydashboard_Myappoinments_pastappinments;
	
	@FindBy(xpath="//div/div/select/option[text()='Status']")
	public WebElement Customer_Mydashboard_Myappoinments_status;

	@FindBy(xpath="//div/div/select/option[text()='Completed']")
	public WebElement Customer_Mydashboard_Myappoinments_status_completed;

	@FindBy(xpath="//div/div/select/option[text()='Pending']")
	public WebElement Customer_Mydashboard_Myappoinments_status_pending;

	@FindBy(xpath="//div/div/select/option[text()='Canceled']")
	public WebElement Customer_Mydashboard_Myappoinments_status_cancelled;

	@FindBy(xpath="//*[@id='filters_col']//a[text()=' Settings']")
	public WebElement Customer_Mydashboard_settings;

	@FindBy(xpath="//*[@id='filters_col']//a[@href='https://shearcircle.com/testbed/customer/settings']")
	public WebElement Customer_Mydashboard_settings_header;

	@FindBy(xpath="//*[@id='navbar-collapse-1']/span/a[text()='Logout']")
	public WebElement Customer_Mydashboard_Logout;

	@FindBy(xpath="//*[@id='navbar-collapse-1']/span/a[text()='My Account ']")
	public WebElement Customer_Mydashboard_Myaccount;
	
	@FindBy(xpath="//*[@id='navbar-collapse-1']/form/div")
	public WebElement Customer_Mydashboard_searchbar;

	@FindBy(xpath="//*[@id='sub_content']/h1[text()='My Dashboard']")
	public WebElement Customer_Mydashboard_header;

	@FindBy(xpath="/html/body/div/div/div/div/div/div[@class='col-md-12']")
	public WebElement Customer_Mydashboard_myfavourites_header;

	@FindBy(xpath="/html/body/div[3]/div/div[2]/div/div/div/div[2]/div[2]")
	public WebElement Customer_Mydashboard_myfavourites_businesslist;
	
	@FindBy(xpath="//div[2]/div/div/div/div[2]/div[1]//a[text()='Book Me']")
	public WebElement Customer_Mydashboard_myfavourites_businesslist_bookme;
	
	@FindBy(xpath="//div[1]/div/div/div/a[text()='Remove']")
	public WebElement Customer_Mydashboard_myfavourites_businesslist_remove;
	
	@FindBy(xpath="/html/body/div[@class='sweet-alert showSweetAlert visible']")
	public WebElement Customer_Mydashboard_myfavourites_businesslist_remove_header;
	
	@FindBy(xpath="//div/div/button[@class='confirm']")
	public WebElement Customer_Mydashboard_myfavourites_businesslist_remove_header_ok;
	
	@FindBy(xpath="//*[@id='container_pin']//a[@aria-controls='services']")
	public WebElement Customer_Mydashboard_myfavourites_bookme_services;

	@FindBy(xpath="//*[@id='container_pin']//a[@aria-controls='overview']")
	public WebElement Customer_Mydashboard_myfavourites_bookme_overview;

	@FindBy(xpath="//*[@id='container_pin']/div/ul/li/a[@aria-controls='reviews']")
	public WebElement Customer_Mydashboard_myfavourites_bookme_reviews;

	@FindBy(xpath="//*[@id='container_pin']//a[@aria-controls='feedbacks']")
	public WebElement Customer_Mydashboard_myfavourites_bookme_inquiry;

	@FindBy(xpath="//*[@id='container_pin']//a[@aria-controls='promotions']")
	public WebElement Customer_Mydashboard_myfavourites_bookme_promotions;

	@FindBy(xpath="//*[@id='container_pin']//a[@aria-controls='videos']")
	public WebElement Customer_Mydashboard_myfavourites_bookme_videos;

	@FindBy(xpath="//*[@id='container_pin']//a[@href='#photos']")
	public WebElement Customer_Mydashboard_myfavourites_bookme_photos;

	@FindBy(xpath="//*[@id='contact_us_tab']/i")
	public WebElement Customer_Mydashboard_myfavourites_bookme_contactus;

	@FindBy(xpath="//*[@id='container_pin']//a[@href='#jobs']")
	public WebElement Customer_Mydashboard_myfavourites_bookme_jobs;

	@FindBy(xpath="//*[@id='sub_content']//button")
	public WebElement Customer_Mydashboard_myfavourites_bookme_markedasfavourite;

	@FindBy(xpath="//*[@id='position']//a/img")
	public WebElement Customer_Mydashboard_myfavourites_bookme_share;
	
	@FindBy(xpath="//*[@id='sub_content']//div[@class='media-body']")
	public WebElement Customer_Mydashboard_myfavourites_bookme_digitekheader;

	@FindBy(xpath="//*[@id='edit_profile']//input[@name='firstname']")
	public WebElement Customer_Mydashboard_settings_FirstName;

	@FindBy(xpath="//*[@id='edit_profile']//input[@name='lastname']")
	public WebElement Customer_Mydashboard_settings_LastName;

	@FindBy(xpath="//*[@id='edit_profile']//input[@name='username']")
	public WebElement Customer_Mydashboard_settings_Email;

	@FindBy(xpath="//*[@id='edit_profile']//input[@value='Male']")
	public WebElement Customer_Mydashboard_settings_Gender_Male;
	
	@FindBy(xpath="//*[@id='edit_profile']//input[@value='Female']")
	public WebElement Customer_Mydashboard_settings_Gender_Female;
	
	
	@FindBy(xpath="//*[@id='edit_profile']//input[@name='mobile']")
	public WebElement Customer_Mydashboard_settings_Phone;
	
	@FindBy(xpath="//*[@id='edit_profile']//input[@name='address']")
	public WebElement Customer_Mydashboard_settings_Address;
	
	@FindBy(xpath="//*[@id='edit_profile']//input[@name='city']")
	public WebElement Customer_Mydashboard_settings_city;
	
	@FindBy(xpath="//*[@id='edit_profile']//div/select[@name='state']")
	public WebElement Customer_Mydashboard_settings_State;
	
	@FindBy(xpath="//*[@id='edit_profile']//select[@ng-model='profileData.country']")
	public WebElement Customer_Mydashboard_settings_Country;

	@FindBy(xpath="//*[@id='edit_profile']//input[@name='zipcode']")
	public WebElement Customer_Mydashboard_settings_zipcode;

	@FindBy(xpath="//div[@style='padding-left:0px']//select")
	public WebElement Customer_Mydashboard_settings_Birthday_date;

	@FindBy(xpath="//div[@style='padding-right:0px']//select")
	public WebElement Customer_Mydashboard_settings_Birthday_Month;

	@FindBy(xpath="//*[@id='edit_profile']//a[text()='Click here to change password']")
	public WebElement Customer_Mydashboard_settings_changepassword_lynk;

	@FindBy(xpath="//*[@id='edit_profile']//a[text()='CANCEL']")
	public WebElement Customer_Mydashboard_settings_cancel;

	@FindBy(xpath="//*[@id='edit_profile']//input[@value='UPDATE']")
	public WebElement Customer_Mydashboard_settings_Update;

	
	

}
