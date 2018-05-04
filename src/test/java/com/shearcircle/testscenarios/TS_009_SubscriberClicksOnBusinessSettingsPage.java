package com.shearcircle.testscenarios;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.shearcircle.pagecomponents.Subscriber_Module_Page_Components;
import com.shearcircle.utilities.CommonFunctions;
import com.shearcircle.utilities.StaticVariables;
import com.shearcircle.utilities.CommonFunctions;

public class TS_009_SubscriberClicksOnBusinessSettingsPage extends StaticVariables {
	
	public Subscriber_Module_Page_Components SR;
	public String TestDataPath;
	public CommonFunctions cfn;
	public static WebDriver driver;

	public TS_009_SubscriberClicksOnBusinessSettingsPage() throws IOException, InterruptedException {
		cfn = new CommonFunctions();
	}
	@BeforeClass
	@Parameters("browser")
	public void beforeclass(@Optional("chrome") String browser) throws IOException, InterruptedException {
		TestDataPath = cfn.TestDataPathOf("SubscriberTestData.properties");
		Browser = browser;
		driver = cfn.getDriver();
		SR = new Subscriber_Module_Page_Components(driver);
		defaultWindowHandle = driver.getWindowHandle();
	}

	@AfterMethod
	public void StatusScreenShots(ITestResult testResult) throws Exception {
		cfn.ScreenshotOnPassFail(testResult);
		Thread.sleep(1000);
		
	}

	/*@AfterClass
	public void afterClass() {
		 driver.quit();
	}*/

		
    @Test(priority = 901, description = "Launch Application")
    public void launchapplication() throws Exception { 
    SR.launchApplication();
    }
    
    @Test(priority = 902, description = "Log into Subscriber Account")
    public void login() throws Exception { 
    SR.logIn_ToDashboard();
    }
	
	@Test(priority = 903, description = "Open Business Settings page")
	public void TC_9_001_openbusinesssettingspage() throws Exception { 
		SR.openbusinesssettingspage();
		
	}
	
	@Test(priority = 904, description = "Check the info/tabs in Business Settings page")
	public void TC_9_002_businesspagetabsvalidation() throws Exception { 
		SR.businesspagetabsvalidation();
	}
	
	@Test(priority = 905, description = "Check the info in Business Details tab")
	public void TC_9_003_checkinfoinbusinessdetailstab() throws Exception { 
		SR.checkinfoinbusinessdetailstab();
	}
	
	@Test(priority = 906, description = "Save changes without adding data in mandatory fields")
	public void TC_9_004_savechangeswithoutaddinganydata() throws Exception { 
		SR.savechangeswithoutaddinganydata();
	}
	
	@Test(priority = 907, description = "Save changes by adding data in mandatory fields")
	public void TC_9_005_checkpopupmessgaeonsavingvaliddata() throws Exception { 
		SR.checkpopupmessgaeonsavingvaliddata();
	}
	
	@Test(priority = 908 , description = "Check whether Business Name can be modified")
	public void TC_9_007_checkbusinessnamecanbemodified() throws Exception { 
		SR.checkbusinessnamecanbemodified();
	}
	
	@Test(priority = 909 , description = "Check whether Subdomain can be changed to an existing one")
	public void TC_9_009_checkexistsubdomainnamecanbemodified() throws Exception { 
		SR.checkexistsubdomainnamecanbemodified();
	}
	
	@Test(priority = 9010 , description = "Check whether the Subdomain can be modified to a non existing one")
	public void TC_9_010_checknonexistsubdomainnamecanbemodified() throws Exception { 
		SR.checknonexistsubdomainnamecanbemodified();
	}
	
	@Test(priority = 9011 , description = "Check the info in Online Booking tab")
	public void TC_9_011_validateinfoinonlinebookingtab() throws Exception { 
		SR.validateinfoinonlinebookingtab();
	}
	
	@Test(priority = 9012 , description = "Check the mandatory fields in Online Booking tab")
	public void TC_9_012_verifyonlineinfofields() throws Exception { 
		SR.verifyonlineinfofields("WithAddingData");
	}
	
	@Test(priority = 9013 , description = "Check whether Booking Policy is applied")
	public void TC_9_013_checkbookingpolicyisapplied() throws Exception { 
		SR.checkbookingpolicyisapplied();
	
	}
	
	@Test(priority = 9014 , description = "Check the info in Calendar tab")
	public void TC_9_016_checkinfoincalendartab() throws Exception { 
		SR.checkinfoincalendartab();
	}
	
	@Test(priority = 9015 , description = "Check whether the Calender settings can be saved")
	public void TC_9_017_checkcalendersettingscanbesaved() throws Exception { 
		SR.checkcalendersettingscanbesaved();
	}
	
	@Test(priority = 9016 , description = "Check the tabs in Staff Notification page")
	public void TC_9_019_verifytabsinstaffnotificationpage() throws Exception { 
		SR.verifytabsinstaffnotificationpage();
	}
	
	@Test(priority = 9017 , description = "Check for validations in Staff Notification page")
	public void TC_9_020_checkvalidationinstaffnotificationpage() throws Exception { 
		SR.checkvalidationinstaffnotificationpage();
	}
	
	@Test(priority = 9018 , description = "Check the info in Payment Settings")
	public void TC_9_025_checkinfoinpaymentsettings() throws Exception { 
		SR.checkinfoinpaymentsettings();
	
}
	@Test(priority = 9019 , description = "Check the info in Manage Menu")
	public void TC_9_029_checkinfoinmanagemenu() throws Exception { 
		SR.checkinfoinmanagemenu();
	
}
	
	@Test(priority = 9020 , description = "Verify the changes in Manage Menu")
	public void TC_9_030_verifychangesinmanagemenu() throws Exception { 
		SR.verifychangesinmanagemenu();
	
}
	@Test(priority = 9021, description = "Log into Subscriber Account")
    public void login2() throws Exception { 
    SR.logIn_ToDashboard();
    }
	
	@Test(priority = 9022, description = "Open Business Settings page")
	public void TC_9_001_openbusinesssettingspage2() throws Exception { 
		SR.openbusinesssettingspage();
		
}
	
	@Test(priority = 9023, description = "Check info in Social Links tab")
	public void TC_9_031_checkinfoonsociallinkstab() throws Exception { 
		SR.checkinfoonsociallinkstab();
		
	}
	@Test(priority = 9024, description = "Check if the Save button is clickable after adding data in any field")
	public void TC_9_032_dataentryfieldvalidity() throws Exception { 
		SR.dataentryfieldvalidity();
		
	}
}