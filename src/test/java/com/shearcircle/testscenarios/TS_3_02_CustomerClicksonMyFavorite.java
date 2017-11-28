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

import com.shearcircle.pagecomponents.Customer_Module_Page_Components;
import com.shearcircle.utilities.CommonFunctions;
import com.shearcircle.utilities.StaticVariables;

public class TS_3_02_CustomerClicksonMyFavorite extends StaticVariables {
	public String TestDataPath;
	public Customer_Module_Page_Components CR;
	public CommonFunctions cfn;
	public static WebDriver driver;
	
	public TS_3_02_CustomerClicksonMyFavorite() throws IOException, InterruptedException{
		cfn = new CommonFunctions();		
	}
		
	@BeforeClass
	@Parameters("browser")
	public void beforeclass(@Optional("chrome") String browser) throws IOException, InterruptedException {
		TestDataPath = cfn.TestDataPathOf("CustomerTestData.properties");
		Browser = browser;
		cfn.getAndOpenBrowser(browser);		
		driver = cfn.getDriver();		
		CR = new Customer_Module_Page_Components(driver);
		defaultWindowHandle = driver.getWindowHandle();
	}
	
	
	@AfterMethod
	public void StatusScreenShots(ITestResult testResult) throws IOException, InterruptedException {
		cfn.ScreenshotOnPassFail(testResult);
		Thread.sleep(1000);
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}
	
	@Test(priority=0, description="Customer visits ShearCircle page" )
	public void TC_001_Customer_visitsShearCircle() throws IOException {			
		CR.ShearCircle_LaunchApplication();			
	}
	
	@Test(priority=1, description="Customer clicks Login Button " )
	public void Customer_clicks_JoinOurCircleButton() throws IOException {			
		CR.ShearCircle_Click_Login_OR_JoinOurCircle("Click_Login");			
	}
	
	@Test(priority=2, description="Customer Login with registered Username(Email id) & Password " )
	public void Customer_CheckRegisterWithShearCirclepage() throws IOException {			
		CR.ShearCircle_Customer_Login_valid_invalid_combination("Enter_Valid_EmailandPassword");			
	}
	@Test(priority=3, description="TC_3_2_001 Check the info in My Favorite for first time login/ without previously adding Favorites")
	public void TC_3_2_01_Customer_CheckMyFavoritesFirsttimelogin_Or_Withoutadding() throws IOException {			
		CR.verify_MyFavorites_firsttimeloginorwithoutpreviouslyadded();			
	}
	
	@Test(priority=4, description="TC_3_2_002 Check the info in My Favorite where Salons are already added as Favorites")
	public void TC_3_2_02_Customer_CheckMyFavouritesalreadyAdded() throws IOException {			
		CR.verify_MyFavoritewhereSalonsarealreadyadded();			
	}	
	@Test(priority=5, description="TC_3_2_003 Check whether Book Me button is clickable")
	public void TC_3_2_03_Customer_CheckwhetherBookMebuttonisclickable() throws IOException {			
		CR.shearCircle_Verify_Bookme_Button_InmyFavourites();			
	}
	
	@Test(priority=6, description="TC_3_2_004 Check whether a Salon can be removed from Favorites")
	public void TC_3_2_03_Customer_CheckwhetheraSaloncanberemovedfromFavorites() throws IOException {			
		CR.shearCircle_Verify_Customer_RemoveButton_in_Myfavourites();			
	}
	
	

}
