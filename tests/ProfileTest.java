package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import object.ExsAcc;
import object.Home;
import object.Profile;

public class ProfileTest {

	private static WebDriver driver;

	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sasha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test(priority = 0)
	public static void startPage() {

		Home.startPage(driver);
		Home.logIn(driver);
		Home.logInEmail(driver);
		driver.findElement(By.xpath(Home.LOGIN_EMAIL)).sendKeys("salence@12345.com");
		Home.logInPass(driver);
		driver.findElement(By.xpath(Home.LOGIN_PASSWORD)).sendKeys("Sale12!");
		Home.logInButton(driver);

	}

	@Test(priority = 1)
	public static void testEmployee() {

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		ExsAcc.clickProfile(driver);
		ExsAcc.addEmployee(driver);

		for (int i = 1; i < 6; i++) {

			int j = i - 1;
			WebElement name = driver.findElement(By.id("_asf" + i));
			name.sendKeys(ExsAcc.apachePoi("podaci.xlsx", j, 0));
			WebElement sur = driver.findElement(By.id("_asl" + i));
			sur.sendKeys(ExsAcc.apachePoi("podaci.xlsx", j, 1));
			WebElement mail = driver.findElement(By.id("_ase" + i));
			mail.sendKeys(ExsAcc.apachePoi("podaci.xlsx", j, 2));
		}

		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
		driver.findElement(By.xpath(ExsAcc.SAVE_EMPLOYEE));

		/*
		 * SoftAssert sa = new SoftAssert();
		 * 
		 * String actual = driver.getCurrentUrl(); String expected = Profile.STAFF_LIST;
		 * 
		 * sa.assertEquals(actual, expected); sa.assertAll();
		 */
	}

	@Test(priority = 2)
	public static void testOne() {

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		Profile.staff(driver);
		Profile.empOne(driver);

		SoftAssert sa = new SoftAssert();

		String actual = driver.getCurrentUrl();
		String expected = Profile.EP_ONE;

		sa.assertEquals(actual, expected);
		sa.assertAll();
	}

	@Test(priority = 3)
	public static void testTwo() {

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		Profile.staff(driver);
		Profile.empTwo(driver);

		SoftAssert sa = new SoftAssert();

		String actual = driver.getCurrentUrl();
		String expected = Profile.EP_TWO;

		sa.assertEquals(actual, expected);
		sa.assertAll();
	}

	@Test(priority = 4)
	public static void testThree() {

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		Profile.staff(driver);
		Profile.empThree(driver);

		SoftAssert sa = new SoftAssert();

		String actual = driver.getCurrentUrl();
		String expected = Profile.EP_THREE;

		sa.assertEquals(actual, expected);
		sa.assertAll();
	}

	@Test(priority = 5)
	public static void testFour() {

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		Profile.staff(driver);
		Profile.empFour(driver);

		SoftAssert sa = new SoftAssert();

		String actual = driver.getCurrentUrl();
		String expected = Profile.EP_FOUR;

		sa.assertEquals(actual, expected);
		sa.assertAll();
	}

	@Test(priority = 6)
	public static void testFive() {

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		Profile.staff(driver);
		Profile.empFive(driver);

		SoftAssert sa = new SoftAssert();

		String actual = driver.getCurrentUrl();
		String expected = Profile.EP_FIVE;

		sa.assertEquals(actual, expected);
		sa.assertAll();
	}

	@Test(priority = 7)
	public static void testEdit() {

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		Profile.staff(driver);
		Profile.empOne(driver);
		Profile.editEmp(driver);
		Profile.empName(driver);
		driver.findElement(By.xpath(Profile.EDIT_NAME)).clear();
		driver.findElement(By.xpath(Profile.EDIT_NAME)).sendKeys("Mile");
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
		Profile.updateEmp(driver);

		SoftAssert sa = new SoftAssert();

		String actual = driver.getCurrentUrl();
		String expected = Profile.EP_ONE;

		sa.assertEquals(actual, expected);
		sa.assertAll();
	}
	
}
