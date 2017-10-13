package TestNG_Driver;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import Web_Browser.Customer_Registraion.Customer_Registration_Page_Components;
import Web_Browser.Login_Page.Login_Components;
import Web_Browser.Professional_Registraion.Professional_Registration_Page_Components;
import Web_Browser.browserLaunch.browserlaunch;

public class Test_Driver2 {
	public static WebDriver driver;
	@BeforeTest
	public void launchapplication(){
		//String url = "https://shearcircle.com/testbed/home";
		String url = "http://demo.guru99.com/selenium/newtours/";
		browserlaunch browserlaunch = new browserlaunch();
		browserlaunch.getDriver("chrome");
		browserlaunch.launchbowser_application(url);		
	}
	
		
	@Test
	public void test2(){
		try{			
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
