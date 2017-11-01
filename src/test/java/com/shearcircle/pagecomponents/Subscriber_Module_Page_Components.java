package com.shearcircle.pagecomponents;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.shearcircle.objectrepository.Login_page_objects;
import com.shearcircle.objectrepository.Subscriber_Module_Page_Objects;
import com.shearcircle.utilities.CommonFunctions;
import com.shearcircle.utilities.StaticVariables;



public class Subscriber_Module_Page_Components extends StaticVariables {
	CommonFunctions browser;
	String TestDataPath;
	// public static WebDriver driver;
	public Subscriber_Module_Page_Objects SCobjects;
	public Login_page_objects Login;


	public Subscriber_Module_Page_Components() throws IOException {
		browser = new CommonFunctions();
		TestDataPath = browser.TestDataPathOf("SubscriberTestData.properties");
		SCobjects = PageFactory.initElements(driver, Subscriber_Module_Page_Objects.class);
		Login = PageFactory.initElements(driver, Login_page_objects.class);
	}

	// Application launch
	public void launchApplication() {
		String baseUrl = null;
		try {
			browser.loaddata(TestDataPath);
			baseUrl = browser.getdata("TestBedURL");
			driver.get(baseUrl + "");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			String apptitle = driver.getTitle();
			if (apptitle.equalsIgnoreCase(baseUrl)) {
				System.out.println("Browser Tilte:" + apptitle);
			}

			if (browser.elmentisdisplayed(Login.Home_ShearCircle_Image)) {
				System.out.println("ShearCircle Image displayed");
			} else {
				System.out.println("ShearCircle Image not displayed");
			}

		} catch (Exception e) {
			System.out.println("Exception: " + e);
		}
	}
public void Subscriber_Registration(){
		
		String FirstName = null;
		String LastName = null;
		String ProfessionalEmail = null;
		String Password = null;
		String BusinessName = null;
		String Subdomain = null;
		browser.loaddata(TestDataPath);
		FirstName = browser.getdata("FirstName");
		LastName = browser.getdata("LastName");
		BusinessName = browser.getdata("BusinessName");
		Password = browser.getdata("Password");
		ProfessionalEmail = browser.getdata("ProfessionalEmail");
		Subdomain = browser.getdata("Subdomain");
		try {	
		
		if(browser.elmentisdisplayed(Login.Home_JoinOurCircle_Link)) {
			browser.reportscomtep("Passed", "Verify JoinCircle link is displayed"  , "JoinCircle link should be displayed", "JoinCircle link is displayed");
			browser.click(Login.Home_JoinOurCircle_Link);
			//browser.wait(5);
	
					browser.Verify_elmentisdisplayed_Report(SCobjects.Subscriber_FirstName_Textbox, "FirstName textbox");
					browser.sendkeys(SCobjects.Subscriber_FirstName_Textbox,FirstName);
					browser.Verify_elmentisdisplayed_Report(SCobjects.Subscriber_LastName_Textbox, "LastName textbox");
					browser.sendkeys(SCobjects.Subscriber_LastName_Textbox,LastName);
					browser.Verify_elmentisdisplayed_Report(SCobjects.Subscriber_Email_Textbox, "Email textbox");
					browser.sendkeys(SCobjects.Subscriber_Email_Textbox,ProfessionalEmail);
					browser.Verify_elmentisdisplayed_Report(SCobjects.Subscriber_BusinessName_Textbox, "buisiness textbox");
					browser.sendkeys(SCobjects.Subscriber_BusinessName_Textbox,BusinessName);
					browser.Verify_elmentisdisplayed_Report(SCobjects.Subscriber_Subdomain_textbox, "Subdomain textbox");
					browser.sendkeys(SCobjects.Subscriber_Subdomain_textbox,Subdomain);
					browser.Verify_elmentisdisplayed_Report(SCobjects.Subscriber_Password_textbox, "Password textbox");
					browser.sendkeys(SCobjects.Subscriber_Password_textbox,Password);
					browser.Verify_elmentisdisplayed_Report(SCobjects.Subscriber_ReEnterPassword_textbox, "ReEnteredPassword textbox");
					browser.sendkeys(SCobjects.Subscriber_ReEnterPassword_textbox,Password);
					browser.Verify_elmentisdisplayed_Report(SCobjects.Subscriber_Termsofservice_checkbox, "Termsofservice checkbox");
					browser.check_Checkbox(SCobjects.Subscriber_Termsofservice_checkbox);
					browser.Verify_elmentisdisplayed_Report(SCobjects.Subscriber_billingagrement_checkbox, "billingagrement Checkbox");
					browser.check_Checkbox(SCobjects.Subscriber_billingagrement_checkbox);
					browser.Verify_elmentisdisplayed_Report(SCobjects.Subscriber_joinourcircle_button, "JoinCircle Button");
					browser.click(SCobjects.Subscriber_joinourcircle_button);
				}
			
		}catch(Exception e) {
			System.out.println("Error description: " + e.getStackTrace() );
		}
					
	}
	
	public void visitsJoinOurCirclepage () throws Exception {
		launchApplication();
		
		
	}

	public void TS02() throws Exception {

		launchApplication();

	}

}
