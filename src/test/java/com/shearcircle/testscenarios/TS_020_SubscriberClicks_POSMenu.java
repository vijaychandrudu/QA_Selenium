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

public class TS_020_SubscriberClicks_POSMenu extends StaticVariables {
	public String TestDataPath;
	public Subscriber_Module_Page_Components SR;
	public CommonFunctions cfn;
	public static WebDriver driver;

	public TS_020_SubscriberClicks_POSMenu() throws IOException, InterruptedException {
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

	/*
	 * @AfterClass public void afterClass() { driver.quit(); }
	 */

	@Test(priority = 20001, description = "TC_001 SubScriber visits ShearCircle page")
	public void TC_001_SubScriber_visitsShearCircle() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_001 SubScriber visits ShearCircle page");
		SR.launchApplication();
	}

	@Test(priority = 20002, description = "TC_002 SubScriber clicks Login Button")
	public void TC_002_SubScriberr_clicks_LogIn_Button() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_002 SubScriber clicks Login Button");
		SR.logIn_ToDashboard();
	}

	@Test(priority = 20003, description = "TC_20_001 Open POS page")
	public void TC_20_001_SubScriberr_open_POSPage() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_20_001  Open POS page");
		SR.open_POSPage();
	}

	@Test(priority = 20004, description = "TC_20_002 Check the Create Sale Order button")
	public void TC_20_002_SubScriberr_check_CreateSaleOrder_Button() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_20_002 Check the Create Sale Order button");
		SR.check_CreateSaleOrder_Button();
	}

	@Test(priority = 20005, description = "TC_20_003 Check the +Products button in Add New Sale popup")
	public void TC_20_003_SubScriberr_check_AddProductsButton_InAddNewSalePopup() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_20_003 Check the +Products button in Add New Sale popup");
		SR.check_AddProductsButton_InAddNewSalePopup();
	}
	
	@Test(priority = 20006, description = "TC_20_004 Check whether product(s) can be added")
	public void TC_20_004_SubScriberr_Check_whether_products_can_added() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_20_004 Check whether product(s) can be added");
		SR.Check_whether_products_can_added();
	}
	
	@Test(priority = 20007, description = "TC_20_005  Check whether multiple quantity of a product can be added")
	public void TC_20_005_SubScriberr_Check_multiplequantity_product_can_added() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_20_005  Check whether multiple quantity of a product can be added");
		SR.Check_multiplequantity_product_can_added();
	}
	
	@Test(priority = 20008, description = "TC_20_006  Check whether a product quantity can be decreased/increased in the orders template")
	public void TC_20_006_SubScriberr_Check_productquantity_decreased_increased_in_orderstemplat() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_20_006  Check whether a product quantity can be decreased/increased in the orders template");
		SR.Check_productquantity_decreased_increased_in_orderstemplat();
	}
	
	@Test(priority = 20009, description = "TC_20_007  Check whether discount can be applied to the product")
	public void TC_20_007_SubScriberr_Check_discount_applied_to_product() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_20_007  Check whether discount can be applied to the product");
		SR.Check_discount_applied_to_product();
	}
	
	@Test(priority = 20010, description = "TC_20_008 Check whether a product can be deleted from the orders")
	public void TC_20_008_SubScriberr_Check_product_deleted_from_orders() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_20_008 Check whether a product can be deleted from the orders");
		SR.Check_product_deleted_from_orders();
	}

}
