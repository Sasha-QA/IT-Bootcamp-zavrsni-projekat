package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import object.ExsAcc;
import object.Home;

public class ExsTest {

	private static WebDriver driver;

	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sasha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test(priority = 0)
	public static void testPay() {

		Home.startPage(driver);
		Home.logIn(driver);
		Home.logInEmail(driver);
		driver.findElement(By.xpath(Home.LOGIN_EMAIL)).sendKeys("salence@12345.com");
		Home.logInPass(driver);
		driver.findElement(By.xpath(Home.LOGIN_PASSWORD)).sendKeys("Sale12!");
		Home.logInButton(driver);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		ExsAcc.clickPayroll(driver);

		String actual = driver.getCurrentUrl();
		String expected = ExsAcc.PAYROLL;

		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actual, expected);
		sa.assertAll();
	}

	@Test(priority = 1)
	public static void testDash() {

		ExsAcc.clickDash(driver);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String actual = driver.getCurrentUrl();
		String expected = ExsAcc.DASHBOARD;
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actual, expected);
		sa.assertAll();

	}

	@Test(priority = 12)
	public static void testAvail() {

		ExsAcc.clickAvailability(driver);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		String actual = driver.getCurrentUrl();
		String expected = ExsAcc.AVAILABILITY;
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actual, expected);
		sa.assertAll();
	}

	@Test(priority = 2)
	public static void testHumanity() {
		
		ExsAcc.clickHumanity(driver);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String actual = driver.getCurrentUrl();
		String expected = ExsAcc.HUMANITY;
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actual, expected);
		sa.assertAll();
	}

	@Test(priority = 3)
	public static void testReport() {

		ExsAcc.clickReport(driver);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String actual = driver.getCurrentUrl();
		String expected = ExsAcc.REPORT;
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actual, expected);
		sa.assertAll();

	}

	@Test(priority = 4)
	public static void testShift() {

		ExsAcc.clickShift(driver);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		String actual = driver.getCurrentUrl();
		String expected = ExsAcc.SHIFT_DAY;
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actual, expected);
		sa.assertAll();

	}

	@Test(priority = 5)
	public static void testTime() {

		ExsAcc.clickTime(driver);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String actual = driver.getCurrentUrl();
		String expected = ExsAcc.TIMECLOCK;
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actual, expected);
		sa.assertAll();

	}

	@Test(priority = 6)
	public static void testLeave() {

		ExsAcc.clickLeave(driver);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		String actual = driver.getCurrentUrl();
		String expected = ExsAcc.LEAVE;
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actual, expected);
		sa.assertAll();

	}

	@Test(priority = 7)
	public static void testTrain() {

		ExsAcc.clickTrain(driver);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		String actual = driver.getCurrentUrl();
		String expected = ExsAcc.TRAINING;
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actual, expected);
		sa.assertAll();

	}

	@Test(priority = 8)
	public static void testStaff() {

		ExsAcc.clickStaff(driver);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String actual = driver.getCurrentUrl();
		String expected = ExsAcc.STAFF;
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actual, expected);
		sa.assertAll();

	}

	@Test(priority = 9)
	public static void testHelp() {

		ExsAcc.clickHelp(driver);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String actual = driver.getCurrentUrl();
		String expected = ExsAcc.HELP;
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actual, expected);
		sa.assertAll();

	}

	@Test(priority = 10)
	public static void testProfile() {

		ExsAcc.clickProfile(driver);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String actual = driver.getCurrentUrl();
		String expected = ExsAcc.PROFIL_URL;
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actual, expected);
		sa.assertAll();

	}

	@Test(priority = 11)
	public static void testSettings() {

		ExsAcc.clickSettings(driver);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String actual = driver.getCurrentUrl();
		String expected = ExsAcc.SETTINGS_URL;
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actual, expected);
		sa.assertAll();

	}

	
}
