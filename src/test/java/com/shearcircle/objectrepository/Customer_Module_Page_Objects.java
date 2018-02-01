package com.shearcircle.objectrepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Customer_Module_Page_Objects{

//object information
	
	@FindBy(xpath="//div/div[1]/a/img")
    public WebElement Home_ShearCircle_Image;
	
	@FindBy(xpath="//*[@id='sub_content']/div/div/h1[text()='Book Appointments with Professionals Near You']")
    public WebElement Home_H1_Header;
	
	@FindBy(xpath="//*[contains(@id,'navbar-collapse')]/span/a[text()='Login']")
    public WebElement Home_Login_Link;		
	@FindBy(xpath="//*[@id='navbar-collapse-1']/span/a[contains(text(),'Circle')]")
    public WebElement Home_JoinOurCircle_Link;
	@FindBy(xpath="//ul/li/a[text()='About Us']")
    public WebElement Home_AboutUs_Link;
	
	@FindBy(xpath="//*[@id='navbar-collapse-1']/ul/li/a[text()='Beauty ']")
    public WebElement home_Beauty_Link;
	
	@FindBy(xpath="//*[@id='navbar-collapse-1']/ul/li/a[text()='Wellness ']")
    public WebElement home_Welless_Link;
	
	@FindBy(xpath="//*[@id='navbar-collapse-1']/ul/li/a[text()='Fitness ']")
    public WebElement home_Fitness_Link;
	
	@FindBy(xpath="//*[@id='navbar-collapse-1']/ul/li/a[text()='How it works']")
    public WebElement home_Howitworks_Link;
	
	@FindBy(xpath="//*[@id='navbar-collapse-1']/ul/li/a[text()='Pricing']")
    public WebElement home_Pricing_Link;
	
	@FindBy(xpath="//*[@id='sub_content']//input[@name='q']")
    public WebElement home_FindSalon_Spa_Professionals_Textbox;
	
	@FindBy(xpath="//*[@id='sub_content']//input[@name='loc']")
    public WebElement home_Zip_City_State_Textbox;
	
	@FindBy(xpath="//*[@id='sub_content']//input[@value='Locate']")
    public WebElement home_Locate_Button;	
	
	@FindBy(xpath="//*[@id='sub_content']/h1[contains(text(),'results for your search criteria')]")
    public WebElement Home_SearchResultsPage_H1_Header;
	
	@FindBy(xpath="//*[@id='searchResultsContainerBox']//div[contains(text(),'results for your search criteria')]")
    public WebElement home_SearchResults_Message; 
	
	@FindBy(xpath="//*[@id='searchResultsContainerBox']/div/h3[text()='No results found for your search criteria']")
    public WebElement home_NoResultsFound_Message; 
	
	@FindBy(xpath="//*[@id='searchResultsContainerBox']//div[contains(text(),'results for your search criteria')]")
    public List<WebElement> home_SearchResultssalons_firstpage_list; 
	
	@FindBy(xpath="//*[@id='filters_col_bt']/i")
	public WebElement SR_FiltersPlus_Icon;	
	
	@FindBy(xpath="//*[@id='filters_col']//div[@class='collapse in']")
	public WebElement SR_Filters_SectionDispalyed;
	
	@FindBy(xpath="//*[@class='collapsed']")
	public WebElement SR_Filters_SectionDisappear;
	
	@FindBy(xpath="//*[@id='collapseFilters']/div[1]/div[1]/ul/li")
    public List<WebElement> SR_Filters_checkbox_label_list;
	
	@FindBy(xpath="//*[@id='collapseFilters']/div[1]/div[1]/ul/li//ins")
    public List<WebElement> SR_Filters_checkbox_list;
	
	@FindBy(xpath="//*[@id='collapseFilters']/div[1]/div[1]/ul/li/label/div[@class='icheckbox_square-grey checked']/ins")
    public List<WebElement> SR_Filters_checkedcheckbox_list;
	
	@FindBy(xpath="//*[@id='niceScroll']/li//ins")
    public List<WebElement> SR_Servies_checkbox_list;
	
	@FindBy(xpath="//*[@id='niceScroll']/li")
    public List<WebElement> SR_Servies_checkbox_label_list;
	
	@FindBy(xpath="//*[@id='niceScroll']/li//div[@class='icheckbox_square-grey checked']/ins")
    public List<WebElement> SR_services_checkedcheckbox_list;
	
	@FindBy(xpath="//*[@id='collapseFilters']/div/h6[text()='Rating']/parent::div/ul/li//input")
    public List<WebElement> SR_Ratings_checkbox_Label_list;
	
	@FindBy(xpath="//*[@id='collapseFilters']/div/h6[text()='Rating']/parent::div/ul/li//ins")
    public List<WebElement> SR_Ratings_checkbox_list;
	
	@FindBy(xpath="//*[@id='collapseFilters']/div/h6[text()='Rating']/parent::div/ul/li//div[@class='icheckbox_square-grey checked']/ins")
    public List<WebElement> SR_Ratings_checkedcheckbox_list;
	
	@FindBy(xpath="//*[@id='collapseFilters']/div[2]/ul/li[5]/label/div/input")
    public WebElement customer_1Rating_checkbox;	
	
	@FindBy(xpath="//*[contains(@id,'myRating')]")
    public List<WebElement> SR_Ratings_Salons_list;
	
	@FindBy(xpath="//*[@id='searchResultsContainerBox']/p/ul[@class='pagination']")
    public WebElement customer_PageNavigation_Buttons;
	 
	@FindBy(xpath="//*[@id='sort_rating']")
	public WebElement SR_DropdownOnTopmostPartOf_List;
	
	@FindBy(xpath="//*[@id='navbar-collapse-1']//input[@name='q']")
    public WebElement customer_FindSalon_Spa_Professionals_Textbox;
	
	@FindBy(xpath="//*[@id='navbar-collapse-1']//input[@name='loc']")
    public WebElement customer_Zip_City_State_Textbox;
	
	@FindBy(xpath="//*[@id='navbar-collapse-1']//i[@class='icon-search']/parent::button")
    public WebElement customer_Search_Button;
	
	@FindBy(xpath="//*[@id='position']/div/ul/li/a[text()='Home']")
    public WebElement customer_Home_Link;
	
	@FindBy(xpath="//*[@id='searchResultsContainerBox']//div/a/h3")
    public List<WebElement> customer_Search_SalonNames;
	
	@FindBy(xpath="//*[@id='searchResultsContainerBox']//div[@class='strip_list ng-scope']//div[@class='location ng-binding']")
    public List<WebElement> customer_Search_SalonLocatonZipCodes;
	
	@FindBy(xpath="//*[@id='sub_content']/h1[text()='Register With ShearCircle']")	
    public WebElement Customer_RegisterWithShearCircle_Header;	

	@FindBy(xpath="//div/h1/b[text()='Customer?']//parent::h1/following-sibling::a[text()='Join Our Circle']")	
    public WebElement customerJoinCircle_Link;	
	
	@FindBy(xpath="//div/h1/b[text()='Professional?']//parent::h1/following-sibling::a[text()='Join Our Circle']")	
    public WebElement ProfessionalJoinCircle_Link;	
	
	@FindBy(xpath="//div/h2/b[text()='Join Now']")	
    public WebElement Customer_JoinNow_Header;	
	
	@FindBy(xpath="//*[@id='searchResultsContainerBox']//div/ul/li[text()=' Online Payment']")
    public List<WebElement> customer_OnlinePayment_SearchResults;
	
	@FindBy(xpath="//*[@id='searchResultsContainerBox']//div/ul/li[text()=' Cash On Services']")
    public List<WebElement> customer_CashOnService_SearchResults;
	
	@FindBy(xpath="//*[@id='searchResultsContainerBox']//div/div/a[text()='Book Me']")
    public List<WebElement> customer_SearchResults_Bookme_Buttons_List;
	
	@FindBy(xpath="//*[@id='container_pin']/div/ul/li/a[text()=' Promotions']")	
    public WebElement Customer_Promotions_Tab;
	
	@FindBy(xpath="//*[@id='container_pin']/div/ul/li/a[text()=' Jobs']")	
    public WebElement Customer_Jobs_Tab;
	
	@FindBy(xpath="//*[@id='niceScroll']/li[4]/label/div")
	public WebElement SR_Services_Haircut_CheckBox;
	
	@FindBy(xpath="//*[@id='searchResultsContainerBox']/div[2]/div[1]/div[2]/div/div/a")
	public WebElement SR_Services_BookMe_Button;
	
	@FindBy(xpath="//a[@aria-controls='services']")
	public WebElement SR_Services_Business_Page;
	
	@FindBy(xpath="//*[@id='services']//div/label[text()=' Haircut']")
	public WebElement SR_Services_HairCut_service;
		
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
	
	@FindBy(xpath="//*[@id='filters_col']//div/nav/div/ul/li/a[text()=' My Dashboard']")
	public WebElement Customer_MyDashboard_Button;
	
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
	
	@FindBy(xpath="//*[@id='profile_image']")
	public WebElement Customer_Mydashboard_ChooseFile_Button;
	
	@FindBy(xpath="//div/div/div/div/div/div/img")
	public WebElement Customer_Mydashboard_Profilepicture;
	
	@FindBy(xpath="//*[@id='sub_content']/h1[contains(text(),'results for')]")	
    public WebElement Customer_Search_Resultspage_Header;	

	@FindBy(xpath="//*[@id='navbar-collapse-1']/form//button/i[@class='icon-search']/parent::button")
	public WebElement Customer_Mydashboard_Search_Button;


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
	
	@FindBy(xpath="//ul/li/a[text()=' Settings']")
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
	
	@FindBy(xpath="//h4[text()='Profile Updated Successfully']")
	public WebElement Customer_ProfileUpdatedSuccessfully_Message;
	
	@FindBy(xpath = "//*[text()='Please enter firstname']")
	public WebElement Customer_PleaseEnterFirstName_ErrorMessage;

	@FindBy(xpath = "//*[text()='Please enter lastname']")
	public WebElement Customer_PleaseEnterLastName_ErrorMessage;
	
	@FindBy(xpath = "//*[text()='Click here to change password']")
	public WebElement Customer_ChangePassword_Link;
	
	@FindBy(xpath="//*[text()='Secure Your Profile by Changing Password']")
	public WebElement Customer_SecureYourProfileByChangingPassword_Header;
	
	@FindBy(xpath="//*[@id='update_profile']//div/input[@type='submit']")
	public WebElement Customer_Profile_ChangingPassword_Update_Button;
	
	@FindBy(xpath = "//*[@name='current_password']")
	public WebElement Customer_CurrentPassword_TextBox;
	
	@FindBy(xpath = "//*[@name='password']")
	public WebElement Customer_NewPassword_TextBox;
	
	@FindBy(xpath = "//*[@id='update_profile']//div/a[text()='CANCEL']")
	public WebElement Customer_ChangingPassword_Cancel_Button;
	
	@FindBy(xpath = "//*[@name='cnf_password']")
	public WebElement Customer_RetypePassword_TextBox;
    
    @FindBy(xpath="//*[text()='Password Updated Successfully']")
    public WebElement Customer_PasswordUpdatedSuccessfully_Message;
    
	
	@FindBy(xpath="//*[text()='Please enter Current Password']")
	public WebElement Customer_Oldpassword_Errormessage;

	@FindBy(xpath="//*[text()='Please enter New Password']")
	public WebElement Customer_Newpassword_Errormessage;
	
	@FindBy(xpath = "//*[text()='No white space please']")
	public WebElement Customer_Pwd_SpacePlease_ErrorMessage;
	
	@FindBy(xpath = "//*[text()='Password Lenght should be minimum 6 letters']")
	public WebElement Customer_Pwd_Minimum6letters_ErrorMessage;
	
	

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
   
    @FindBy(xpath="//table/tbody/tr/td[5]")
    public List<WebElement> Customer_AppointmentStatus_List;
    
    @FindBy(xpath="//table/tbody/tr/td[6]/span")
    public List<WebElement> Customer_PaymentStatus_List;
    
    
    @FindBy(xpath="/html/body/div[@class='sweet-alert showSweetAlert visible']")
    public WebElement Customer_Popup_Alert_Addtofavourite;
    @FindBy(xpath="//*[@id='sub_content']/div/div/div/div/div")
    public WebElement Customer_Salon_Logo_Address;
    @FindBy(xpath="//*[@class='icon-search']")
    public WebElement Customer_Search_Button;
	@FindBy(xpath="//*[@id='sub_content']")
	public WebElement Customer_ResultsForYourSearchCriteria_Header;
	@FindBy(xpath="//*[@id='searchResultsContainerBox']/div[2]/div/div/div/div/a[text()='Book Me']")
	public WebElement Customer_BookMe_Text;
	@FindBy(xpath="//*[text()='Book Services']")
	public WebElement Customer_BookService_Heading;
	@FindBy(xpath="//*[@href='#services']")
	public WebElement Customer_Services_Tab;
	@FindBy(xpath="//*[contains(@href, '#overview')]")
	public WebElement Customer_Overview_Tab;
	//@FindBy(xpath="//*[@id='overview']")
	//public WebElement Customer_Business_Overview_Text;
	@FindBy(xpath="//*[contains(@href, '#reviews')]")
	public WebElement Customer_Reviews_Tab;
	@FindBy(xpath="//*[@id='container_pin']/div/div")
	public WebElement Customer_CustomerReviews_texts;
	@FindBy(xpath="//*[contains(@href, '#feedbacks')]")
	public WebElement Customer_Inquiry_Tab;
	@FindBy(xpath="//*[@id='feedbacks']/div/div")
	public WebElement Customer_SendInquiryToThe_Professional_Text;	
    @FindBy(xpath="//*[@id='promotions']/div/div")
    public WebElement Customer_Available_Coupons;
	@FindBy(xpath="//*[contains(@href, '#videos')]")
	public WebElement Customer_Videos_Tab;
	@FindBy(xpath="//*[@id='videos']")
	public WebElement Customer_Videos_Available;
	@FindBy(xpath="//*[contains(@href, '#photos')]")
	public WebElement Customer_Photos_Tab;
	@FindBy(xpath="//*[contains(@href, '#contact_info_page')]")
	public WebElement Customer_ContactUs_Tab;
	@FindBy(xpath="//*[@id='map_canvas']")
	public WebElement Customer_Locationon_Map;
	@FindBy(xpath="//*[@class='lead']/small")
 /*	public WebElement Customer_Address_Text;
	@FindBy(xpath="//*[@class='lead ng-binding']")*/
	public WebElement Customer_Phonenumber_Text;
	@FindBy(xpath="//*[@class='lead ng-scope']/a")
	public WebElement Customer_URL_Text;
	@FindBy(xpath="//*[@class='cp-social-list']")
	public WebElement Customer_Social_Links;
	@FindBy(xpath="//*[@class='table table-bordered']")
	public WebElement Customer_WorkingHours_Table;	
	@FindBy(xpath="//*[@class='col-md-6']/button")
	public WebElement Customer_AddtoFavorite_button;
	@FindBy(xpath="//*[@class='a2a_dd']")
	public WebElement Customer_Share_Button;
	@FindBy(xpath="//*[@class='media-object img-thumbnail']")
	public WebElement Customer_Business_Logo;
	@FindBy(xpath="//*[@id='sub_content']/div/div/div[@class='col-md-6']/div/div")
	public WebElement Customer_BusinessName_Address_Text;
	
	@FindBy(xpath="/html/body/div[@class='sweet-alert showSweetAlert visible']")
    public WebElement Customer_Popup_Alert_Addtofavourite_withLogin;
	
	@FindBy(xpath="//button[text()='OK']")
    public WebElement Customer_Popup_Alert_OK_Button;
 
    @FindBy(xpath="//*[@id='sub_content']/div//button")
    public WebElement Customer_Markedas_Addtofavourite_Button;
    
    @FindBy(xpath="//*[@id='overview']/h3")
    public WebElement Customer_OverviewTab_Selon_name;
    
    @FindBy(xpath="//*[@id='overview']/h3//following-sibling::div")
    public WebElement Customer_OverviewTab_Selon_description;
    
    @FindBy(xpath="//*[@id='reviews']/div[1]/div/div/h4")
    public WebElement Customer_ReviewTab_Customer_name;
    
    @FindBy(xpath="//*[@id='myRating2']")
    public WebElement Customer_ReviewTab_Customer_StarRating;    
       
    @FindBy(xpath="//*[@id='reviews']/div[1]/div/div/h4//following-sibling::p")
    public WebElement Customer_ReviewTab_Customer_ReviewText;
    
    @FindBy(xpath="//*[@id='services']//h4[1]")
	public WebElement Service_GroupName;
    
    @FindBy(xpath="//*[@id='services']//i[contains(@class,'fa fa')]")
	public List<WebElement> Customer_SubService_GenderList;

    @FindBy(xpath="//*[@id='services']/div/div/div/div/div[2]/div//div[@class='row ng-scope']/div[2]/span")
	public List<WebElement> Customer_SubService_TimeSlotList;
	    
    @FindBy(xpath="//*[@id='services']/div/div/div/div//div[@class='row ng-scope']/div[3]/strong") 
	public List<WebElement> Customer_SubService_PriceList;

    @FindBy(xpath="//*[@id='services']//label[@class='ng-binding']")
	public List<WebElement> Customer_SubService_CheckBoxLabels;
    
    @FindBy(xpath="//*[@id='inquiryForm']/div/em[text()='Please enter email address']")
	public WebElement Customer_Inquiry_Email_ErrorMessage;
    
    @FindBy(xpath="//*[@id='inquiryForm']/div/em[text()='Please enter mobile number']")
	public WebElement Customer_Inquiry_mobileNo_ErrorMessage;
    
    @FindBy(xpath="//*[@id='feedbacks']/div/div/h3")
	public WebElement Customer_Feedback_Header;
	
	@FindBy(xpath="//*[@id='inquiryForm']//input[@name='name']")
	public WebElement Customer_Feedback_Name_Textbox;
	
	@FindBy(xpath="//*[@id='inquiryForm']//input[@name='email']")
	public WebElement Customer_Feedback_Email_Textbox;
	
	@FindBy(xpath="//*[@id='inquiryForm']//input[@name='mobile']")
	public WebElement Customer_Feedback_Mobileno_Textbox;
	
	@FindBy(xpath="//*[@id='inquiryForm']/div/textarea")
	public WebElement Customer_Feedback_Message_Text;
	
	@FindBy(xpath="//*[@id='uploadPhotos']")
	public WebElement Customer_Feedback_UloadPhoto_Button;
	
	@FindBy(xpath="//*[@id='inquiryForm']/div/button")
	public WebElement Customer_Feedback_Submit_Button;
	@FindBy(xpath="//div[@class='sweet-alert showSweetAlert visible']")
	public WebElement Customer_Inquiry_Success_Popup;
	 
	@FindBy(xpath="//div/div/div/button[text()='OK']")
	public WebElement Customer_Inquiry_Success_Popup_OK_Button;
	
	@FindBy(xpath="//*[@id='inquiryForm']/div/textarea[@name='feedback']")
	public WebElement Customer_Inquiry_YourMessage_textarea;
    
	@FindBy(xpath="//*[@id='promotions']/div/div/h3")
	public WebElement Customer_Promotions_Header;
	
	@FindBy(xpath="//*[@id='promotions']//div[@class='row promotionwrapper']/div")
	public List<WebElement> Customer_Promotions_List;
	
	/*@FindBy(xpath="//*[@id='videos']/div/div/div/div[contains(@ng-repeat,'video_item in profile')]")
	public List<WebElement> Customer_Videos_List;*/
	
	@FindBy(xpath="//*[contains(@id,'player_uid_')]/div[1]/video")
	public List<WebElement> Customer_Videos_List;
	
	
	@FindBy(xpath="//*[@id='videos']/h3[contains(text(),'Video')]")
	public WebElement Customer_Videos_Header;
	
	@FindBy(xpath="//*[contains(@id,'player_uid')]/div/button[@class='ytp-large-play-button ytp-button']")
	public List<WebElement> Customer_Videos_Center_PlayButtons_List;
	
	@FindBy(xpath="//*[contains(@id,'player_uid')]/div/div[2]/div/button[@class='ytp-play-button ytp-button']")
	public List<WebElement> Customer_Videos_buttom_PlayButtons_List;
	
	@FindBy(xpath="//*[@id='photos']/h3[contains(text(),'Photo')]")
	public WebElement Customer_PhotoGallery_Header;
	
	@FindBy(xpath="//*[@id='photos']/div/div/a/strong")
	public List<WebElement> Customer_Photos_Titles_List;
	
	@FindBy(xpath="//*[@id='contact_info_page']/div/div/p/small")
    public WebElement Customer_ContactTab_Address;
 
    @FindBy(xpath="//div/div/p[@class='lead ng-binding']")
    public WebElement Customer_ContactTab_Phoneno;
 
    @FindBy(xpath="//*[@id='contact_info_page']/div/div/p/a/i[@class='icon-globe']")
    public WebElement Customer_ContactTab_Website;
    
    @FindBy(xpath="//*[@id='hplogo']/a/img")
    public WebElement Customer_ContactTab_Website_image;
 
    @FindBy(xpath="//*[@id='contact_info_page']/div/div/ul")
    public WebElement Customer_ContactTab_SocialLinks;
 
    @FindBy(xpath="//div/div/table/tbody/tr/td[@class='ng-binding']")
    public WebElement Customer_ContactTab_BusinessHours;
    
    @FindBy(xpath="//*[@id='map_canvas']/div/div/div[1]/div[3]/div")
    public WebElement Customer_ContactTab_Map;
    
    @FindBy(xpath="//div/div/ul/li/a/i[@class='social_facebook']")
    public WebElement Customer_ContactTab_Facebook;
    
    @FindBy(xpath="//div/div/div[@class='clearfix loggedout_menubar']")
    public WebElement Customer_ContactTab_Facebook_Header;   
    
    @FindBy(xpath="//ul/li/a/i[@class='social_googleplus']/parent::a")
    public WebElement Customer_ContactTab_Google;
   
    @FindBy(xpath="//div/div/div[@class='E5Wbl']")
    public WebElement Customer_ContactTab_Googleheader;
    
    @FindBy(xpath="//*[@id='contact_info_page']/div/div/ul/li/a/i[@class='icon-instagram-filled']")
    public WebElement Customer_ContactTab_Instagram;
    
    @FindBy(xpath="//header/div/div/a[text()='Instagram']")
    public WebElement Customer_ContactTab_Instagram_Header;
    
    @FindBy(xpath="//*[@id='jobs']/h3")
    public WebElement Customer_Jobs_Header;
    
    @FindBy(xpath="//*[@id='tab-jobs-first']/div/div/div/h4")
	public List<WebElement> Customer_ViewJobs_Titles_List;
    
    @FindBy(xpath="//*[@id='tab-jobs-first']/div/div//a")
	public List<WebElement> Customer_ViewJob_buttons_List;
    
    @FindBy(xpath="//*[@id='main_menu']//div[contains(@ng-bind-html,'show_description')]/h2[1]")
    public WebElement Customer_Jobs_Descreption_Header;
   
    @FindBy(xpath="//div/div/a[text()='APPLY FOR JOB']")
    public WebElement Customer_Jobs_ApplyforJob_Button;
   
    @FindBy(xpath="//*[@id='main_menu']/h2[contains(text(),'Job')]")
    public WebElement Customer_JobRequirement_Header;
    
    @FindBy(xpath="//*[@id='main_menu']/h2[contains(text(),'Apply')]")
    public WebElement Customer_Jobs_ApplyJob_Header;
   
    @FindBy(xpath="//*@id='jobApplyForm']/div/div/div/input[@name='resume']")
    public WebElement Customer_Jobs_UPloadButton;
   
    @FindBy(xpath="//*[@id='jobApplyForm']/input[@type='submit']")
    public WebElement Customer_Jobs_ApplyButton;
    
    @FindBy(xpath="//*[@id='jobApplyForm']//input[@name='firstname']")
	public WebElement Customer_Jobs_Firstname;
    
    @FindBy(xpath="//*[@id='jobApplyForm']//input[@name='lastname']")
	public WebElement Customer_Jobs_Lastname;
    
    @FindBy(xpath="//*[@id='jobApplyForm']//input[@name='email']")
	public WebElement Customer_Jobs_Email;
    
    @FindBy(xpath="//*[@id='jobApplyForm']//input[@name='address']")
	public WebElement Customer_Jobs_Address;
    
    @FindBy(xpath="//*[@id='jobApplyForm']//input[@name='city']")
	public WebElement Customer_Jobs_City;
    
    @FindBy(xpath="//*[@id='jobApplyForm']//select[@name='state']")
	public WebElement Customer_Jobs_State;
    
    @FindBy(xpath="//*[@id='jobApplyForm']//input[@name='postal_code']")
	public WebElement Customer_Jobs_Postalcode;
    
    @FindBy(xpath="//*[@id='jobApplyForm']//input[@name='current_salary']")
	public WebElement Customer_Jobs_Currentsalary;
    
    @FindBy(xpath="//*[@id='jobApplyForm']//input[@name='expected_salary']")
	public WebElement Customer_Jobs_Expectsalary;
    
    @FindBy(xpath="//*[@id='jobApplyForm']//select[@name='iam']")
	public WebElement Customer_Jobs_Iam;
    
    @FindBy(xpath="//*[@id='jobApplyForm']//select[@name='license_type']")
	public WebElement Customer_Jobs_Licencetype;
    
    @FindBy(xpath="//*[@id='jobApplyForm']//select[@name='license_state']")
	public WebElement Customer_Jobs_Licencestate;
    		    
    @FindBy(xpath="//*[@id='jobApplyForm']//select[@name='experience']")
	public WebElement Customer_Jobs_Experience;
    
    @FindBy(xpath="//*[@id='jobApplyForm']//select[@name='hours_available']")
	public WebElement Customer_Jobs_Hours;
    
    @FindBy(xpath="//*[@id='services']//label[@class='ng-binding']/input")
	public List<WebElement> Services_CheckBox_List;
	
	@FindBy(xpath="//b[@class='ng-binding']")
	public WebElement Services_Numberof_SelectServicesAndPrice_Message;	
	
	@FindBy(xpath="//*[@class='well']")
	public WebElement Services_PopUp;
	
	 @FindBy(xpath="//div/div/em[text()='First Name is required']")
	public WebElement Customer_Jobs_Firstname_ErrorMessage;
    
    @FindBy(xpath="//div/div/em[text()='Last Name is required']")
	public WebElement Customer_Jobs_Lastname_ErrorMessage;
    
    @FindBy(xpath="//div/div/em[text()='Email id is required']")
	public WebElement Customer_Jobs_Email_ErrorMessage;
    
    @FindBy(xpath="//div/div/em[text()='Address is required']")
	public WebElement Customer_Jobs_Address_ErrorMessage;
    
    @FindBy(xpath="//div/div/em[text()='City name is required']")
	public WebElement Customer_Jobs_City_ErrorMessage;
    
    @FindBy(xpath="//div/div/em[text()='State is required']")
	public WebElement Customer_Jobs_State_ErrorMessage;
    
    @FindBy(xpath="//div/div/em[text()='Postal Code is required']")
	public WebElement Customer_Jobs_Postalcode_ErrorMessage;
    
    @FindBy(xpath="//div/div/em[text()='Current salary is required']")
	public WebElement Customer_Jobs_Currentsalary_ErrorMessage;
    
    @FindBy(xpath="//div/div/em[text()='Expected salary is required']")
	public WebElement Customer_Jobs_Expectsalary_ErrorMessage;
    
    @FindBy(xpath="//div/div/em[text()='This field is required']")
	public WebElement Customer_Jobs_Iam_ErrorMessage;
    
    @FindBy(xpath="//div/div/em[text()='License type is required']")
	public WebElement Customer_Jobs_LicenceType_ErrorMessage;
    
    @FindBy(xpath="//div/div/em[text()='License state is required']")
	public WebElement Customer_Jobs_Licencestate_ErrorMessage;
    		    
    @FindBy(xpath="//div/div/em[text()='Experience is required']")
	public WebElement Customer_Jobs_Experience_ErrorMessage;
    
    @FindBy(xpath="//div/div/em[@for='hours_available']")
	public WebElement Customer_Jobs_Hours_ErrorMessage;
    @FindBy(xpath="/html/body/section/div[2]/div/div/div/div[2]/button")
	public WebElement Services_BookNow_Button;
	
	@FindBy(xpath="//*[@class='btn btn_back pull-right btn-sm']")
	public WebElement Services_ProfessionalPage_BackButton;
	
	@FindBy(xpath="//*[text()='Choose Professional']")
	public WebElement ProfessionalPage_ChooseProfessional_Text;
	
	@FindBy(xpath="//div[@class='row imageCheck center flag']//div[contains(@ng-repeat,'ap in availableStaff')]")
	public List<WebElement> ProfessionalPage_StylistsOrProfessionalsList;
	
	@FindBy(xpath="//div[contains(@ng-repeat,'ap in availableStaff')]//img[@class='img-thumbnail']")
	public List<WebElement> ProfessionalPage_StylistsOrProfessional_Image_list;
	
	@FindBy(xpath="//div[contains(@ng-repeat,'ap in availableStaff')]/span[@class='styname ng-binding']")
	public List<WebElement> ProfessionalPage_Professional_Name_list;

	@FindBy(xpath="//*[text()='Service Details']")
	public WebElement ProfessionalPage_ServiceDetails_Header;
	
	
	@FindBy(xpath="//table/tbody/tr[4]/td/strong")
	public WebElement ProfessionalPage_Total_Services;
	
	@FindBy(xpath="//tbody/tr[5]/td/strong")
	public WebElement ProfessionalPage_Total_Hours;
	
	@FindBy(xpath="//table/tbody/tr[6]/td/strong")
	public WebElement ProfessionalPage_Total_Amount;
	
	@FindBy(xpath="//table/tbody/tr[4]/td/strong/span")
	public WebElement ProfessionalPage_SumOfAllService;
	
	@FindBy(xpath="//tbody/tr[5]/td/strong/span")
	public WebElement ProfessionalPage__SumOfAllService_Duartion;
	
	@FindBy(xpath="//table/tbody/tr[6]/td/strong/sapn")
	public WebElement ProfessionalPage_SumOfAllService_Price;
	
	
	/*********TC_6_1_08******/
	@FindBy(xpath="//*[text()='Choose Date and Time']")
	public WebElement Professional_ChooseDateAndTime_Page;
	
	/**TC_6_1_09***/
	@FindBy(xpath="//*[@id='newBookingCalendar']")
	public WebElement ChooseCalendeandTime_Calendar;
	
	@FindBy(xpath="//*[text()='Available Times']")
	public WebElement ChooseCalendeandTime_AvailableTimesSlots_text;
	
	@FindBy(xpath="//*[@id='container_pin']//div[@ng-click='goToBookingDetails(apt)']")
	public List<WebElement> ChooseCalendeandTime_AvailableTimeslots_list;
	
	@FindBy(xpath="//*[contains(text(),'No slots available for booking on ')]")
	public WebElement ChooseCalendeandTime_AvailableNoTimesSlots;
	
	@FindBy(xpath="//*[@id='container_pin']/div//center/img")
	public WebElement ChooseCalendeandTime_SelectedProfessional_image;
	
	@FindBy(xpath="//*[@id='container_pin']//table")
	public WebElement ChooseDateAndTime_ServiceDetails_Table;
	
	@FindBy(xpath="//*[@id='container_pin']//a[text()=' Back']")
	public WebElement ChooseDateAndTime_Back_Button;
	
	@FindBy(xpath="//div[2]/div[1]/center/img")
	public WebElement Professional_SelectedStaff_image;
	
	/****TC_6_1_10****/
	
	@FindBy(xpath="//*[@id='container_pin']//table")
	public WebElement ChooseProfessionalPage_ServiceDetails_Table;
	
	/****TC_6_1_11****/
	
		
	@FindBy(xpath="//body/div/p[contains(text(),'Your Booking date is')]")
	public WebElement ChooseDateAndTime_SelectedDateTime;	
	
	@FindBy(xpath="//*[@class='cancel']")
	public WebElement ChooseDateAndTime_Popup_CancelButton;
	
	@FindBy(xpath="//*[text()='Yes, Proceed to book!']")
	public WebElement ChooseDateAndTime_Popup_ProceedToBookButton;
	
	@FindBy(xpath="//*[text()='Booking Summary']")
	public WebElement Professional_BookingSummary_Page;
	
	/****TC_6_1_12****/
	 
	@FindBy(xpath="//*[text()='Booking Details']")
	public WebElement BookingSummary_BookingDetails;
	
	@FindBy(xpath="//table/thead/tr/th[1]/text()")
	public WebElement BookingSummry_SerialNumber;
	
	@FindBy(xpath="//table/thead/tr/th[2]/text()")
	public WebElement BookingSummary_ServiceOrProductName;
	
	@FindBy(xpath="//table/thead/tr/th[3]/text()")
	public WebElement BookingSummary_Duration;
	
	@FindBy(xpath="//table/thead/tr/th[4]/text()")
	public WebElement BookingSummary_Price;
	
	@FindBy(xpath="//table/thead/tr/th[5]/text()")
	public WebElement BookingSummary_Quantity;
	
	@FindBy(xpath="//table/thead/tr/th[6]/text()")
	public WebElement BookingSummary_TotalPrice;
	
	@FindBy(xpath="//table/tfoot/tr[1]/th")
	public WebElement BookingSummary_ToatlDuration;
	
	@FindBy(xpath="//table/tfoot/tr[2]/th")
	public WebElement BookingSummary_SubTotal;
	

	@FindBy(xpath="//table/tfoot/tr[3]/th")
	public WebElement BookingSummary_HaveAPromocode;
	

	@FindBy(xpath="//table/tfoot/tr[2]/th")
	public WebElement BookingSummary_GrandTotal;
	
	@FindBy(xpath="//*[@class='image img-thumbnail img-responsive']")
	public WebElement BookingSummary_Selected_Professional_Image;
	
	@FindBy(xpath="//*[text()='Appointment Scheduled Time']")
	public WebElement BookingSummary_AppointmentScheduledTime;
	
	@FindBy(xpath="//*[@id='container_pin']//div[2]/h3")
	public WebElement BookingSummary_DateAndTime;
	
	@FindBy(xpath="//table/tbody/tr[1]/th")
	public WebElement BookingSummary_ShopName;
	
	@FindBy(xpath="//table/tbody/tr[2]/th")
	public WebElement BookingSummary_ContactNumber;
	
	@FindBy(xpath="//table/tbody/tr[3]/th")
	public WebElement BookingSummary_Email;
	
	@FindBy(xpath="//table/tbody/tr[4]/th")
	public WebElement BookingSummary_Address;
	
	@FindBy(xpath="//*[text()='Please select payment method ']")
	public WebElement BookingSummary_PleaseSelect_PaymentMethod;
	
	@FindBy(xpath="//div/label[1]/img")
	public WebElement BookingSummary_PayPal;
	
	@FindBy(xpath="//*[@id='container_pin']//div/label/input[@name='payment_type']")
	public WebElement BookingSummary_PayByCash_radiobutton;
	
	@FindBy(xpath="//button[@href='#']")
	public WebElement BookingSummary_BackButton;
	
	@FindBy(xpath="//*[text()='Confirm Booking']")
	public WebElement BookingSummary_ConfirmBooking_button;	
	
	
	
	/***TC_6_1_15*/
	
	@FindBy(xpath="//*[@id='myModal']//*[@id='myModalLabel']")
	public WebElement BookingSummary_Login_Text;
	
	@FindBy(xpath="//u[text()='Get It Back']")
	public WebElement BookingSummary_ForgotPassword_Link;
	
	@FindBy(xpath="//u[text()='Register Now']")
	public WebElement BookingSummary_RegisterNow_Link;
	
	@FindBy(xpath="//*[text()='Sign in']")
	public WebElement BookingSummary_Popup_SignIn_Link;
	
	@FindBy(xpath="//strong[text()='Reset Password']")
	public WebElement BookingSummary_ResetPassword_Page;
	
	@FindBy(xpath="//*[@class='text-center thinfont']")
	public WebElement BookingSummary_Registration_Page;
	
	@FindBy(xpath="//*[text()='Click to Sign in']")
	public WebElement BookingSummary_ClickTo_SignIn_Link ;
	
	@FindBy(xpath="//*[@id='username']")
	public WebElement BookingSummary_LoginPopup_Username_TextBox ;
	
	@FindBy(xpath="//*[@id='password']")
	public WebElement BookingSummary_LoginPopup_Password_TextBox;
	
	@FindBy(xpath="//*[text()='Sign in']")
	public WebElement BookingSummary_LoginPopup_SignIn_Link;
	
	@FindBy(xpath="//*[@id='myModal']/div/div/div/button/span/i[@class='fa fa-close']")
	public WebElement BookingSummary_LoginPopup_Close;
	
	@FindBy(xpath="//*[text()='User details not found']")
	public WebElement BookingSummary_LoginPopup_UserDetailsNotFound_Message;
	
	@FindBy(xpath="//*[text()='View Booking Summary']")
	public WebElement BookingSummary_ViewBookingSummary_Page;
	
	@FindBy(xpath="//*[contains(text(),'Appointment ID')]")
	public WebElement ViewBookingSummary_AppointmentID;
	
	@FindBy(xpath="//*[@id='container_pin']//div[2]/div/div[1]")
	public WebElement ViewBookingSummary_ServiceProviderDetails;
	
	@FindBy(xpath="//*[@id='container_pin']//div[2]/div/div[2]")
	public WebElement ViewBookingSummary_CustomerDetails;
	
	@FindBy(xpath="//*[@id='container_pin']//div[3]//div/div[1]")
	public WebElement ViewBookingSummary_Appointment_DateAndTime;
	
	@FindBy(xpath="//*[@id='container_pin']//h4[contains(text(),'Payment Status ')]")
	public WebElement ViewBookingSummary_PaymentStatus;
	
	@FindBy(xpath="//*[@id='container_pin']//h4[contains(text(),'Appointment Status ')]")
	public WebElement ViewBookingSummary_AppointmentStatus;
	
	@FindBy(xpath="//*[@id='container_pin']//div[1]/div[4]")
	public WebElement ViewBookingSummary_ServiceDetails;
	
	@FindBy(xpath="//*[text()=' Print']")
	public WebElement ViewBookingSummary_Print_Button;

	@FindBy(xpath="//*[@id='plugin']")
	public WebElement ViewBookingSummary_Printable_PDF ;

}
