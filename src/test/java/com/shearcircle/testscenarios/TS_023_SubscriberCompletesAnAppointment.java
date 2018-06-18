package com.shearcircle.testscenarios;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.shearcircle.pagecomponents.Subscriber_Module_Page_Components;
import com.shearcircle.utilities.CommonFunctions;
import com.shearcircle.utilities.StaticVariables;

import utils.ExtentReports.ExtentTestManager;

public class TS_023_SubscriberCompletesAnAppointment extends StaticVariables {
	public String TestDataPath;
	public Subscriber_Module_Page_Components SR;
	public CommonFunctions cfn;
	public static WebDriver driver;

	public TS_023_SubscriberCompletesAnAppointment() throws IOException, InterruptedException{
		cfn = new CommonFunctions();		
	}
		
	@BeforeClass
	@Parameters("browser")
	public void beforeclass(@Optional("chrome") String browser) throws IOException, InterruptedException {
		TestDataPath = cfn.TestDataPathOf("SubscriberTestData.properties");
		Browser = browser;
		// cfn.getAndOpenBrowser(browser);
		driver = cfn.getDriver();
		SR = new Subscriber_Module_Page_Components(driver);
		defaultWindowHandle = driver.getWindowHandle();
	}
	
	
	@AfterMethod
	public void StatusScreenShots(ITestResult testResult) throws IOException, InterruptedException {
		cfn.ScreenshotOnPassFail(testResult);
		Thread.sleep(1000);
	}

	/*@AfterClass
	public void afterClass() {
		driver.quit();
	}*/
	
	@Test(priority = 23001, description = "TC_001 SubScriber visits ShearCircle page")
	public void TC_001_SubScriber_visitsShearCircle() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_001 SubScriber visits ShearCircle page");
		SR.launchApplication();
	}

	@Test(priority = 23002, description = "TC_002 SubScriber clicks Login Button")
	public void TC_002_SubScriberr_clicks_LogIn_Button() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_002 SubScriber clicks Login Button");
		SR.logIn_ToDashboard();
	}

	@Test(priority = 23003, description = "TC_003 Check the +New Appointments button")
	public void TC_003_SubScriberr_open_AppointmentsPages() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_003 Check the +New Appointments button");
		SR.open_AppointmentsPage();
	}
	@Test(priority = 23004, description = "TC_23_001 Check whether the Checkout button is displayed for booking with status as Confirmed")
	public void TC_23_001_CheckoutButton_IsDisplayed_ForBookingwithStatusAsConfirmed() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_23_001 Check whether the Checkout button is displayed for booking with status as Confirmed");
		SR.CheckoutButton_IsDisplayed_ForBookingwithStatusAsConfirmed();
	}
	@Test(priority = 23005, description = "TC_23_002 Check whether the Checkout button is functioning")
	public void TC_23_002_Checkwhether_CheckoutButton_IsFunctioning() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_23_002 Check whether the Checkout button is functioning");
		SR.Checkwhether_CheckoutButton_IsFunctioning();
	}
	@Test(priority = 23006, description = "TC_23_003 Check whether the service amount and other details are correct in the billing page")
	public void TC_23_003_checkwhether_ServiceAmountAnd_OtherDetails_AreCorrectInThe_BillingPage() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_23_003 Check whether the service amount and other details are correct in the billing page");
		SR.checkwhether_ServiceAmountAnd_OtherDetails_AreCorrectInThe_BillingPage();
	}
	@Test(priority = 23007, description = "TC_23_004 Check whether discount can be applied for the service")
	public void TC_23_004_cheeckwhether_DiscountCanBe_AappliedFor_TheService() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_23_004 Check whether discount can be applied for the service");
		SR.cheeckwhether_DiscountCanBe_AappliedFor_TheService();
	}
	@Test(priority = 23008, description = "TC_23_005 Check whether removing the discount value,updates the total price")
	public void TC_23_005_check_RemovingDiscount_ValueUpdates_TheTotalPrice() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_23_005 Check whether removing the discount value,updates the total price");
		SR.check_RemovingDiscount_ValueUpdates_TheTotalPrice();
	}
	@Test(priority = 23009, description = "TC_23_006 Check whether discount value >100 can be applied")
	public void TC_23_006_checkWhether_DiscountValueGreaterThan100CanBe_Applied() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_23_006 Check whether discount value >100 can be applied");
		SR.checkWhether_DiscountValueGreaterThan100CanBe_Applied();
	}
	@Test(priority = 23010, description = "TC_23_007 Check the +Products button")
	public void TC_23_007_checkAddProductsButton() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_23_007 Check the +Products button");
		SR.checkAddProductsButton();
	}
	@Test(priority = 23011, description = "TC_23_008 Check whether product can be added")
	public void TC_23_008_checkWhether_ProductCanBeAdded() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_23_008 Check whether product can be added");
		SR.checkWhether_ProductCanBeAdded();
	}
	@Test(priority = 23012, description = "TC_23_009 Check whether the product quantity can be increased/decreased")
	public void TC_23_009_checkwhether_TheroductQuantityCanBe_IncreasedOrdecreased() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_23_009 Check whether the product quantity can be increased/decreased");
		SR.checkwhether_TheroductQuantityCanBe_IncreasedOrdecreased("Increasedquantity");
	}
	@Test(priority = 23013, description = "TC_23_010 Check whether discount can be applied for the product")
	public void TC_23_010_checkwhether_DiscountCanBe_AppliedforTheProduct() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_23_010 Check whether discount can be applied for the product");
		SR.checkwhether_DiscountCanBe_AppliedforTheProduct();
	}
	/*@Test(priority = 23014, description = "TC_23_011 Check whether discount can be applied for the product")
	public void TC_23_011_checkwhether_DiscountCanBe_AppliedforTheProduct() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_23_011 Check whether discount can be applied for the product");
		SR.checkwhether_DiscountCanBe_AppliedforTheProduct();
	}*/
	@Test(priority = 23015, description = "TC_23_012 Check the Proceed to Collect Amount button")
	public void TC_23_012_checkProceed_ToCollectAmountButton() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_23_012 Check the Proceed to Collect Amount button");
		SR.checkProceed_ToCollectAmountButton();
	}
	@Test(priority = 23016, description = "TC_23_013 Check whether tip amount can be added")
	public void TC_23_013_checkwhether_TipAmount_CanBeAdded() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_23_013 Check whether tip amount can be added");
		SR.checkwhether_TipAmount_CanBeAdded();
	}
	@Test(priority = 23017, description = "TC_23_014 Check whether an appointment can be completed")
	public void TC_23_014_checkwhetherAnAppointment_CanBeCompleted() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_23_014 Check whether an appointment can be completed");
		SR.checkwhetherAnAppointment_CanBeCompleted();
	}
	/*@Test(priority = 23018, description = "TC_23_014 Check whether an appointment can be completed")
	public void TC_23_015_checkwhetherAnAppointment_CanBeCompleted() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_23_014 Check whether an appointment can be completed");
		SR.checkwhetherAnAppointment_CanBeCompleted();
	}*/
}