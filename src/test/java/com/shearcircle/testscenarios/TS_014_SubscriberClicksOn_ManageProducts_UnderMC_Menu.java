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

public class TS_014_SubscriberClicksOn_ManageProducts_UnderMC_Menu extends StaticVariables {
	public String TestDataPath;
	public Subscriber_Module_Page_Components SR;
	public CommonFunctions cfn;
	public static WebDriver driver;

	public TS_014_SubscriberClicksOn_ManageProducts_UnderMC_Menu() throws IOException, InterruptedException {
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

	@Test(priority = 14001, description = "TC_001 SubScriber visits ShearCircle page")
	public void TC_001_SubScriber_visitsShearCircle() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_001 SubScriber visits ShearCircle page");
		SR.launchApplication();
	}

	@Test(priority = 14002, description = "TC_002 SubScriber clicks Login Button")
	public void TC_002_SubScriberr_clicks_LogIn_Button() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_002 SubScriber clicks Login Button");
		SR.logIn_ToDashboard();
	}

	@Test(priority = 14003, description = "TC_14_001 Open Manage Products page")
	public void TC_14_001_SubScriberr_openManageProducts_Page() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_14_001 Open Manage Products page");
		SR.openManageProducts_Page();
	}

	@Test(priority = 14004, description = "TC_14_002 Check the details & action buttons in All Products tab (when products are added)")
	public void TC_14_002_SubScriberr_check_DetailsAndactionButtons_InAllProductsTab() throws IOException {
		ExtentTestManager.getTest().setDescription(
				"TC_14_002 Check the details & action buttons in All Products tab (when products are added)");
		SR.check_DetailsAndactionButtons_InAllProductsTab();
	}

	@Test(priority = 14005, description = "TC_14_003 Check the Categories tab")
	public void TC_14_003_SubScriber_check_CategoriesTab() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_14_003 Check the Categories tab");
		SR.check_CategoriesTab();
	}

	@Test(priority = 14006, description = "TC_14_004 Check whether new category can be added")
	public void TC_14_004_SubScriber_checkWhether_NewCategory_Added() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_14_004 Check whether new category can be added");
		SR.checkWhether_NewCategory_Added();
	}

	@Test(priority = 14007, description = "TC_14_005 Check whether a Category name can be modified")
	public void TC_14_005_SubScriber_checkWhether_CategoryName_Modified() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_14_005 Check whether a Category name can be modified");
		SR.checkWhether_CategoryName_Modified();
	}

	@Test(priority = 14008, description = "TC_14_006 Check whether a category can be deleted")
	public void TC_14_006_SubScriber_checkWhether_CategoryName_Deleted() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_14_006 Check whether a category can be deleted");
		SR.checkWhether_CategoryName_Deleted();
		// SR.checkWhether_NewCategory_Added();
	}

	@Test(priority = 14009, description = "TC_14_007 Check the Brands tab")
	public void TC_14_007_SubScriber_check_BrandsTab() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_14_007 Check the Brands tab");
		SR.check_BrandsTab();
	}

	@Test(priority = 14010, description = "TC_14_008 Check whether a New Brand can be added")
	public void TC_14_008_SubScriber_checkWhether_NewBrand_Added() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_14_008 Check whether a New Brand can be added");
		SR.checkWhether_NewBrand_Added();
	}

	@Test(priority = 14011, description = "TC_14_009 Check whether a Brand Name can be modified")
	public void TC_14_009_SubScriber_checkWhether_BrandName_Modified() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_14_009 Check whether a Brand Name can be modified");
		SR.checkWhether_BrandName_Modified();
	}

	@Test(priority = 14012, description = "TC_14_010 Check whether a brand can be deleted")
	public void TC_14_010_Subscriber_checkWhether_BrandName_Deleted() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_14_010 Check whether a brand can be deleted");
		SR.checkWhether_BrandName_Deleted();
		// SR.checkWhether_NewBrand_Added();
	}

	@Test(priority = 14013, description = "TC_14_011 Check the Suppliers tab")
	public void TC_14_011_Subscriber_check_SuppliersTab() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_14_011 Check the Suppliers tab");
		SR.check_SuppliersTab();
	}

	@Test(priority = 14014, description = "TC_14_012 Check whether a new supplier can be added")
	public void TC_14_012_Subscriber_checkWhether_NewSupplier_Added() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_14_012 Check whether a new supplier can be added");
		SR.checkWhether_NewSupplier_Added();
	}

	@Test(priority = 14015, description = "TC_14_013 Check whether Supplier name/details can be edited")
	public void TC_14_013_Subscriber_checkWhether_SupplierName_Modified() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_14_013 Check whether Supplier name/details can be edited");
		SR.checkWhether_SupplierName_Modified();
	}

	@Test(priority = 14016, description = "TC_14_014 Check whether Supplier can be deleted")
	public void TC_14_014_Subscriber_checkWhether_SuppliersName_Deleted() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_14_014 Check whether Supplier can be deleted");
		SR.checkWhether_SuppliersName_Deleted();
		// SR.checkWhether_NewSupplier_Added();
	}

	@Test(priority = 14017, description = "TC_14_015 Check Add New Product tab")
	public void TC_14_015_Subscriber_check_AddNewProductTab() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_14_015 Check Add New Product tab");
		SR.check_AddNewProductTab();
	}

	@Test(priority = 14018, description = "TC_14_016 Check whether a Product can be added")
	public void TC_14_016_Subscriber_check_AddNewProductTab() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_14_016 Check whether a Product can be added");
		SR.checkWhether_Product_Added();
	}

	@Test(priority = 14019, description = "TC_14_017 Check whether a new brand can be added in Add New Product page")
	public void TC_14_017_Subscriber_checkWhether_NewBrandAdded_InAddNewProductPage() throws IOException {
		ExtentTestManager.getTest()
				.setDescription("TC_14_017 Check whether a new brand can be added in Add New Product page");
		SR.checkWhether_NewBrandAdded_InAddNewProductPage();
	}

	@Test(priority = 14020, description = "TC_14_018 Check whether a new Category can be added in Add New Product page")
	public void TC_14_018_Subscriber_checkWhether_NewCategoryAdded_InAddNewProductPage() throws IOException {
		ExtentTestManager.getTest()
				.setDescription("TC_14_018 Check whether a new Category can be added in Add New Product page");
		SR.checkWhether_NewCategoryAdded_InAddNewProductPage();
	}

	@Test(priority = 14021, description = "TC_14_019 Check whether a new Supplier can be added in Add New Product page")
	public void TC_14_019_Subscriber_checWhether_NewSupplierAdded_InAddNewProductPage() throws IOException {
		ExtentTestManager.getTest()
				.setDescription("TC_14_019 Check whether a new Supplier can be added in Add New Product page");
		SR.checkWhether_NewSupplierAdded_InAddNewProductPage();
	}

	@Test(priority = 14022, description = "TC_14_020 Check whether a product detail/price can be changed")
	public void TC_14_020_Subscriber_checkWhether_ProductDetailOrPricr_change() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_14_020 Check whether a product detail/price can be changed");
		SR.checkWhether_ProductDetailOrPricr_change("ProductCahnge_Details");
	}

	@Test(priority = 14023, description = "TC_14_021 Check whether a product can be deleted")
	public void TC_14_021_Subscriber_checkWhethe_Product_Deleted() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_14_021 Check whether a product can be deleted");
		SR.checkWhethe_Product_Deleted();
	}

	@Test(priority = 14024, description = "TC_14_022 Check the Decrease stock (+) button")
	public void TC_14_022_Subscriber_check_AddStock_Button() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_14_022 Check the Decrease stock (+) button");
		SR.check_AddStock_Button();
	}

	@Test(priority = 14025, description = "TC_14_023 Check whether a stock can be added")
	public void TC_14_023_Subscriber_checkWhether_StockAdded() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_14_023 Check whether a stock can be added");
		SR.checkWhether_StockAdded();
	}

	@Test(priority = 14026, description = "TC_14_024 Check the decrease stock (-) button")
	public void TC_14_024_Subscriber_check_DecreaseStock_Button() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_14_024 Check the decrease stock (-) button");
		SR.check_DecreaseStock_Button();
	}

	@Test(priority = 14027, description = "TC_14_025 Check whether a stock can be decreased")
	public void TC_14_025_Subscriber_check_Stock_Decreased() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_14_025 Check whether a stock can be decreased");
		SR.check_Stock_Decreased();
	}

	@Test(priority = 14028, description = "TC_14_026 Check the stock history")
	public void TC_14_026_Subscriber_check_Stock_History() throws IOException {
		ExtentTestManager.getTest().setDescription("TC_14_026 Check the stock history");
		SR.check_Stock_History();
	}

}