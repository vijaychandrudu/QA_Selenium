package com.shearcircle.testscenarios;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
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
		//cfn.getAndOpenBrowser(browser);		
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
	public void logOut(){
		CR.Customer_JoinOurCircle_LogOutpage();
		driver.quit();
	}
	
	@Test(priority=30201, description="Customer visits ShearCircle page")
	public void TC_3_2_1_Customer_visitsShearCircle() throws IOException {			
		CR.ShearCircle_LaunchApplication();			
	}
	
	@Test(priority=30202, description="Customer clicks Login Button ")
	public void TC_3_2_2_Customer_clicks_JoinOurCircleButton() throws IOException {			
		CR.ShearCircle_Click_Login_OR_JoinOurCircle("Click_Login");			
	}
	
	@Test(priority=30203, description="Customer Login with registered Username(Email id) & Password " )
	public void TC_3_2_3_Customer_CheckRegisterWithShearCirclepage() throws IOException {			
		CR.ShearCircle_Customer_Login_valid_invalid_combination("Enter_Valid_EmailandPassword");			
	}
	/*@Test(priority=3, description="TC_3_2_01 Check the info in My Favorite for first time login/ without previously adding Favorites")
	public void TC_3_2_1_Customer_CheckMyFavoritesFirsttimelogin_Or_Withoutadding() throws IOException {			
		CR.verify_MyFavorites_firsttimeloginorwithoutpreviouslyadded();			
	}
	*/
	@Test(priority=30205, description="TC_3_2_02 Check the info in My Favorite where Salons are already added as Favorites")
	public void TC_3_2_02_Customer_CheckMyFavouritesalreadyAdded() throws IOException {			
		CR.verify_MyFavoritewhereSalonsarealreadyadded();			
	}	
	@Test(priority=30206, description="TC_3_2_03 Check whether Book Me button is clickable")
	public void TC_3_2_03_Customer_CheckwhetherBookMebuttonisclickable() throws IOException {			
		CR.shearCircle_Verify_Bookme_Button_InmyFavourites();			
	}
	
	@Test(priority=30207, description="TC_3_2_04 Check whether a Salon can be removed from Favorites")
	public void TC_3_2_04_Customer_CheckwhetheraSaloncanberemovedfromFavorites() throws IOException {	
		CR.shearCircle_Verify_Customer_Myaccount_Buttonis_Clickable("My Favorites");
		CR.shearCircle_Verify_Customer_RemoveButton_in_Myfavourites();			
	}
	
	

}
