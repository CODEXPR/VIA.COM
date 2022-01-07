package Testcases;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Base.TestBase;
import Pages.Booking_Hotels;
import Pages.DashboardPage;
import Pages.LoginPage;
import Pages.Search_hotels;
import util.ExcelReader;

import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
	Search_hotels sh;
	LoginPage lp;
	DashboardPage dp;
	ExcelReader reader;
	Booking_Hotels bh;

	@BeforeTest
	public void extentReportSetup() {
		reportSetup();
	}

	@BeforeMethod
	public void browserSetUp() {
		System.out.println(2);
//logger.info("Trying to do Browser Setup");
		initialization();
		lp = new LoginPage();
		sh = new Search_hotels();
		bh = new Booking_Hotels();
	}

	@Test
	public void validateTitleTest() {
		System.out.println(1);
		logger.info("Execution of validateTitleTest started!!!");
//we will not write entire code over here
		String expectedTitle = "Online Hotel Booking | Book Cheap, Budget & Star Hotels on Via.com";
		String actualTitle = lp.validateTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		logger.info("Execution of validateTitleTest completed!!!");
		ExtentTest test = extent.createTest("Validate Title Test");
		test.log(Status.PASS, "TC Passed");
	}

	@Test(enabled = true)
	public void validateLoginTest() {
		logger.info("Execution of validateLoginTest started!!!");
		dp = lp.validateLogin(prop.getProperty("username"), prop.getProperty("password"));
		logger.info("Execution of validateLoginTest completed!!!");
		ExtentTest test = extent.createTest("Validate Login Test");
		test.log(Status.PASS, "TC Passed");
	}
	@Test(enabled = true)
	public void validateSearchTest() {
		logger.info("Execution of validateSearchTest started!!!");
		sh.validateSearch(prop.getProperty("destination"));
		logger.info("Execution of validateSearchTTest completed!!!");
		ExtentTest test = extent.createTest("ValidateSearchTest");
		test.log(Status.PASS, "TC Passed");
	}
	@Test(enabled = true)
	public void validateBookingTest() {
		logger.info("Execution of validateBookingTest started!!!");
		bh.validateBooking(prop.getProperty("selectRoom"), prop.getProperty("bookRoom"));
		logger.info("Execution of validateBookingRoom completed!!!");
		ExtentTest test = extent.createTest("Validate Booking Test");
		test.log(Status.PASS, "TC Passed");
	}
//@Test(enabled = false, dataProvider = "getLoginData")
//public void validateLoginUserRole(String uname, String pass) {
//lp.validateLogin(uname, pass);
//}

	@AfterMethod
	public void closeSetUp() {
		tearDown();
	}

	@AfterSuite
	public void generateReport() {
		extent.flush();
	}

//@DataProvider(name = "getLoginData")
//public Object[][] getLoginData() {
//String excelPath = "./src/test/resources/TestData/Auto (1).xlsx";
//String sheetName = "data";
//reader = new ExcelReader(excelPath, sheetName);
//return reader.getTestData();
//}
}