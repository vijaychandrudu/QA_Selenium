package Web_Browser.Login_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import TestNG_Driver.Test_Driver;
import Web_Browser.Web_Browser;
import Web_Browser.browserLaunch.browserlaunch;

public class Login_Components extends browserlaunch{
	
public WebDriver getdriver;
public Login_page_objects Login;
public Login_Components(WebDriver getdriver) {
	Login = PageFactory.initElements(getdriver, Login_page_objects.class);
	System.out.println(getdriver.getWindowHandle());
}

Web_Browser browser = new Web_Browser();

public void customer_login(String p_in_UserName, String p_in_Password){
	
	//String p_in_UserName = "test";    
    //String p_in_Password = "test";  
    
          
	browser.click(Login.Login_Link);    
    browser.sendkeys(Login.Login_UserName_textbox, p_in_UserName);
    browser.sendkeys(Login.Login_PassWord_textbox, p_in_Password);
    browser.click(Login.Login_signin_button);     
  

}
}
