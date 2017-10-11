package Web_Browser.browserLaunch;

//import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;

import Web_Browser.Web_Browser;
import Web_Browser.Login_Page.Login_page_objects;

public class browserlaunch {
	public static WebDriver driver;
	public Login_page_objects Login;
	public browserlaunch() {
		Login = PageFactory.initElements(driver, Login_page_objects.class);
	}
	Web_Browser browser = new Web_Browser();
	public WebDriver getDriver(String drivertype){
		try{
		if (drivertype.equalsIgnoreCase("IE")) {
			 System.setProperty("webdriver.ie.driver", "E:\\Selenium_Softwares\\IEDriverServer_Win32_3.5.1\\IEDriverServer.exe");
			 driver = new InternetExplorerDriver();		
		} else if (drivertype.equalsIgnoreCase("Firefox"))  {
			System.setProperty("webdriver.gecko.driver", "C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
			driver = new FirefoxDriver();
		} else if (drivertype.equalsIgnoreCase("chrome"))  {
			System.setProperty("webdriver.chrome.driver", "E:\\Selenium_Softwares\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}		
		
		}catch (Exception e){
			System.out.println("Driver not found Exception: " + e);
		}
		return driver;
	}
	
	public void launchbowser_application(String baseUrl){	
	    try {   
		    driver.get(baseUrl + "");
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);    
		    String apptitle = driver.getTitle();
		    if (apptitle.equalsIgnoreCase(baseUrl)){
		    System.out.println("Browser Tilte:"+apptitle);     
		    }
		    
			if(browser.elmentisdisplayed(Login.ShearCircle_Image)) {
			  System.out.println("ShearCircle Image displayed");
			 }else {
				  System.out.println("ShearCircle Image not displayed");
			 }
			  
		  }catch(Exception e){
				  System.out.println("Exception: "+e); 
		  }
	
	}

}
