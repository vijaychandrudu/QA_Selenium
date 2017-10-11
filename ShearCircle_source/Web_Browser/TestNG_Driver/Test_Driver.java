package Web_Browser.TestNG_Driver;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import Web_Browser.Customer_Registraion.Customer_Registration_Page_Components;
import Web_Browser.Login_Page.Login_Components;
import Web_Browser.Professional_Registraion.Professional_Registration_Page_Components;
import Web_Browser.browserLaunch.browserlaunch;

public class Test_Driver {
	public static WebDriver driver;
	@BeforeTest
	public void launchapplication(){
		//String url = "https://shearcircle.com/testbed/home";
		String url = "http://demo.guru99.com/selenium/newtours/";
		browserlaunch browserlaunch = new browserlaunch();
		browserlaunch.getDriver("chrome");
		browserlaunch.launchbowser_application(url);
		Login_Components login = new Login_Components(driver);		
		login.customer_login();
		
	}
	
	@Test
	public void test1(){
		try{			
			String customeremail = "test@test.com";
			String Password = "Password1";
			Login_Components login = new Login_Components(driver);
			//Customer_Registration_Page_Components cregistration = new Customer_Registration_Page_Components(driver);
			//cregistration.Customer_Registration(customeremail, Password);	
			login.customer_login();
		}catch(Exception e){
			System.out.println("Error description:"+e.getStackTrace());
		}
		
	}
	
	@Test
	public void test2(){
		try{
			//String customeremail = "test@test.com";
			//String Password = "Password1";
			//Login_Components login = new Login_Components();
			Professional_Registration_Page_Components pregistration = new Professional_Registration_Page_Components(driver);
			pregistration.Professional_Registration();
			
		}catch(Exception e){
			System.out.println("Error description:"+e.getStackTrace());
		}
		
	}
	
	
	@Test
	public void test3(){
		System.out.println("test3");
	}
	
	@Test
	public void test4(){
		System.out.println("test4");
	}

}
