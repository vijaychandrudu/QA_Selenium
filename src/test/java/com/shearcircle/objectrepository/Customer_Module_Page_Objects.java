package com.shearcircle.objectrepository;

import java.util.List;

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
	
	@FindBy(xpath="//*[@id='navbar-collapse-1']/span/a[text()='My Account ']")
	public WebElement Customer_Mydashboard_MyAccount_Button;	

	//div[@class='modal-header']/h3/parent::div/following-sibling::div[@class='modal-footer']/button[text()='Close' and @class='btn btn-primary']
	@FindBy(xpath="//div/div/h3[contains(text(),'Welcome')]")
	public WebElement Customer_Mydashboard_Welcome_Name_Header;
	
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


	@FindBy(xpath="//*[@id='filters_col']//li/a[text()=' My Favorites']")
	public WebElement Customer_MyFavourites_Button;

	@FindBy(xpath="//*[@id='filters_col']//a[text()=' My Appointments']")
	public WebElement Customer_Myappoinments_Button;

	@FindBy(xpath="h3[contains(text(),'My App')]")
	public WebElement Customer_Mydashboard_Myappoinments_header;

	@FindBy(xpath="//table/tbody/tr[2]/td/h3[text()='No Appointments Found']")
	public WebElement Customer_Myappoinments_Noappoinments_Message;

	@FindBy(xpath="//div/div/table[@class='table styapp']")
	public WebElement Customer_Myappoinments_Table;
	
	@FindBy(xpath="//div/div/table[@class='table styapp']/tbody/tr/td//a[text()=' View']")
	public List<WebElement> Customer_Myappoinments_View_Buttons;

	@FindBy(xpath="/html/body/div[3]/div/div[2]/div/div/div/div[2]")
	public WebElement Customer_Myappoinments_pagebookings;

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
	
	@FindBy(xpath="/html/body//tr[2]/td/a[@class='btn btn-xs btn-success']")
	public WebElement Customer_Mydashboard_Myappoinments_View;

	@FindBy(xpath="/html/body//div/p[@class='text-center ng-binding']")
	public WebElement Customer_Mydashboard_Myappoinments_arrow_pagenumbers;
	
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
	public WebElement Customer_Mydashboard_Settings_Button;

	@FindBy(xpath="//*[@id='edit_profile']/div/div/div/div/h3[text()='Settings']")
	public WebElement Customer_Mydashboard_settings_header;

	@FindBy(xpath="//*[@id='navbar-collapse-1']/span/a[text()='Logout']")
	public WebElement Customer_Mydashboard_Logout;

	@FindBy(xpath="//*[@id='navbar-collapse-1']/span/a[text()='My Account ']")
	public WebElement Customer_Mydashboard_Myaccount;
	
	@FindBy(xpath="//*[@id='navbar-collapse-1']/form/div")
	public WebElement Customer_Mydashboard_searchbar;

	@FindBy(xpath="//*[@id='sub_content']/h1[text()='My Dashboard']")
	public WebElement Customer_Mydashboard_header;

	@FindBy(xpath="//div/h3[text()='Favorites']")
	public WebElement Customer_Myfavourites_Header;

	@FindBy(xpath="//nav/div/ul/li/a[text()=' My Favorites']")
	public WebElement Customer_Myfavourites_Link;

	@FindBy(xpath="//div/div[@class='col-md-12']/div[2]/div[1]")
	public WebElement Customer_Myfavourites_businesslist;
	
	@FindBy(xpath="//div[2]/h4[text()='No Favorites Added Yet']")
	public WebElement Customer_Myfavourites_NoList_Message;
	
	@FindBy(xpath="//div[2]/div/div/div/div[2]/div[1]//a[text()='Book Me']")
	public WebElement Customer_myfavourites_Bookme_Button;
	
	@FindBy(xpath="//div[1]/div/div/div/a[text()='Remove']")
	public WebElement Customer_myfavourites_Remove_Button;
	
	@FindBy(xpath="/html/body/div[@class='sweet-alert showSweetAlert visible']")
	public WebElement Customer_Myfavourites_Remove_Header;
	
	@FindBy(xpath="//div/div/button[@class='confirm']")
	public WebElement Customer_Myfavourites_Remove_Popup_ok;
	
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
	public WebElement Customer_Settings_FirstName;
	
	@FindBy(xpath="//div/div/nav/div/ul/li[@class='active']/a")
	public WebElement Customer_Settings_Link;


	@FindBy(xpath="//*[@id='edit_profile']//input[@name='lastname']")
	public WebElement Customer_Settings_LastName;

	@FindBy(xpath="//*[@id='edit_profile']//input[@name='username']")
	public WebElement Customer_Settings_Email;

	@FindBy(xpath="//*[@id='edit_profile']//input[@value='Male']")
	public WebElement Customer_Settings_Gender_Male;
	
	@FindBy(xpath="//*[@id='edit_profile']//input[@value='Female']")
	public WebElement Customer_Settings_Gender_Female;
	
	@FindBy(xpath="//*[@id='edit_profile']//input[@value='Female']")
	public WebElement Customer_Settings_Header;

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

/*********************TC_3_3_03************************/
    
    @FindBy(xpath="//a[contains(text(),'My App')]")
    public WebElement Customer_MyAppoinments_Link;
    
    @FindBy(xpath="//h3[contains(text(),'My App')]")
    public WebElement Customer_MyAppoinments_Header;
    
    @FindBy(xpath="//div[2]/select")
    public WebElement Customer_MyAppoinments_Type_Dropdown;    
       
    @FindBy(xpath="//td[contains(text(),'157')]")
    public WebElement Customer_AppointmentID_Text;
    

    @FindBy(xpath="//tbody/tr[2]/td/a[text()=' View']")
    public WebElement Customer_ClicksOnView_Button;
    

    @FindBy(xpath="//h1[text()='View Booking Summary']")
    public WebElement Customer_ViewBookingSummary_Text;    

    @FindBy(xpath="//*[contains(text(),'Appointment I')]")
    public WebElement Customer_AppointmentID_Heading;
    
    /***************TC_3_3_04***************/
    @FindBy(xpath="//*[text()='1']")
    public WebElement Customer_Page1_Link;
    
    @FindBy(xpath="//p/ul[@class='pagination']/li/a[text()='1']/parent::li")
    public WebElement Customer_FirstPageActive_Link;

    
    /*@FindBy(xpath="//*[text()='2']")
    public WebElement Customer_Page2_Link;*/
    
    @FindBy(xpath="//*[text()='1']")
    public WebElement Customer_FirstPageShowing_Link;
    
    @FindBy(xpath="//*[@rel='next']")
    public WebElement Customer_NavigateToNextPage_Link;
    
    @FindBy(css=" p > ul > li:nth-child(3)>a")
    public WebElement Customer_NextPageShowing_Link;
    
    @FindBy(xpath="//p/ul[@class='pagination']/li/a[text()='2']/parent::li")
    public WebElement Customer_NextPageActive_Link;

    @FindBy(xpath="//*[text()='>>']")
    public WebElement Customer_NavigateToLastPage_Link;
    
    @FindBy(css=" p > ul > li:last-child>a")
    public WebElement Customer_LastPageShowing_Link;
    
    @FindBy(xpath="//p/ul[@class='pagination']/li[5]/a/parent::li")
    public WebElement Customer_LastPageActive_Link;
    
   /*******************TC_3_3_05****************/
    
    @FindBy(xpath="//*[@rel='prev']")
    public WebElement Customer_NaviagateToPreviousPage_Link;
    
    @FindBy(xpath="//*[text()='19']")
    public WebElement Customer_Page19_Link;
    
    
    @FindBy(xpath="//*[@rel='start']")
    public WebElement Customer_NaviagateToFirstPage_Link;
    
    /*****************TC_3_3_06***************/
    
    @FindBy(xpath="//*[text()='3']")
    public WebElement Customer_Page3_Link;
    
    @FindBy(xpath="//div/div[2]/p/ul/li/a")
    public List<WebElement> Customer_PageNumber_Links;
    
    @FindBy(xpath="//div/div[2]/p/ul/li[5]")
    public WebElement Customer_Page_Links;
    
    /********************TC_3_3_07*********************/
    
    @FindBy(xpath="//*[@ng-model='filter']")
    public WebElement Customer_Dropdown_Type;    
    
   /* @FindBy(xpath="//div[2]/select/option")
   public  List<WebElement> Customer_Displays_Listof_Type;
    
    @FindBy(xpath="/html/body/div[3]//div[2]/select/option[contains(text(),'Upc')]")
    public WebElement Customer_DropdownOption_UpcomingAppointments;
    
    @FindBy(xpath="/html/body/div[3]//div[2]/select/option[contains(text(),'Past')]")
    public WebElement Customer_DropdownOption_PastAppointments; */
    
    /**********************TC_3_3_08*****************************/
    
    @FindBy(xpath="//*[@ng-model='appointment_status']")
    public WebElement Customer_MyAppoinments_Dropdown_Status;
    
  /*  @FindBy(xpath="html/body//div[1]/div[3]/select/option[contains(text(),'Co')]")
    public WebElement Customer_DropdownOption_Completed;
    
    @FindBy(xpath="html/body//div[1]/div[3]/select/option")
    public List<WebElement> Customer_Displays_ListOf_Status;
    
    @FindBy(xpath="html/body//div[1]/div[3]/select/option[contains(text(),'P')]")
    public WebElement Customer_DropdownOption_Pending;
    
    @FindBy(xpath="html/body//div[1]/div[3]/select/option[contains(text(),'Ca')]")
    public WebElement  Customer_DropdownOption_Canceled;*/
    
    /*************TC_3_3_09***********************************/
   
    @FindBy(xpath="//*[contains(text(),'No Appoint')]")
    public WebElement Customer_UpcomingAppointments_Message ;
    
    /*************TC_3_3_10***********************************/
    
    @FindBy(xpath="//table[@class='table styapp']")
    public WebElement Customer_PastAppointments_List;
    
    /*************************TC_3_3_11**************/
   
    @FindBy(xpath="//table[@class='table styapp']")
    public WebElement Customer_Completed_List;

	

}
