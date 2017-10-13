package TestNG_Driver;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import Web_Browser.Customer_Registraion.Customer_Registration_Page_Components;
import Web_Browser.Login_Page.Login_Components;
import Web_Browser.Professional_Registraion.Professional_Registration_Page_Components;
import Web_Browser.browserLaunch.browserlaunch;

public class Test_Driver {
	public static WebDriver driver;
	
	@BeforeTest
	@Parameters({"ApplicationURL"})
	public void launchapplication(){
		String url = "https://shearcircle.com/testbed/home";
		//String url = "http://demo.guru99.com/selenium/newtours/";
		browserlaunch browserlaunch = new browserlaunch();
		browserlaunch.getDriver("chrome");
		browserlaunch.launchbowser_application(url);		
	}
	
	@Test
	@Parameters({"customeremail","cust_Password"})
	public void test1(String customeremail, String cust_Password){
		try{
			Customer_Registration_Page_Components cregistration = new Customer_Registration_Page_Components(driver);
			cregistration.Customer_Registration(customeremail, cust_Password);	
			
		}catch(Exception e){
			System.out.println("Error description:"+e.getStackTrace());
		}
		
	}	
	
	@Test
	@Parameters({"customeremail","cust_Password"})
	public void test2(String customeremail, String cust_Password){
		try{			
			Login_Components login = new Login_Components(driver);				
			login.customer_login(customeremail, cust_Password );
		}catch(Exception e){
			System.out.println("Error description:"+e.getStackTrace());
		}
		
	}	
	
}
