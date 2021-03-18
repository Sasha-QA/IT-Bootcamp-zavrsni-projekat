package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import object.ExsAcc;
import object.Home;
import object.Profile;
import object.Settings;

public class SettingsTest {

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
	public static void testSettings() {

		ExsAcc.clickSettings(driver);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		String actual = driver.getCurrentUrl();
		String expected = ExsAcc.SETTINGS_URL;
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actual, expected);
		sa.assertAll();

	}

	@Test(priority = 2)
	public static void testLang() {

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		Settings.clickLanguage(driver);
		Select language = new Select(driver.findElement(By.name("language")));
		language.selectByVisibleText("American English");
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
		Settings.submit(driver);
		driver.navigate().refresh();

		driver.findElement(By.name("сат"));
		String actual = driver.getCurrentUrl();
		String expected = ExsAcc.TIMECLOCK;

		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actual, expected);
		sa.assertAll();

	}

	@Test(priority = 3)
	public static void testPicture() {

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.HOME);
		Settings.picture(driver);
		WebElement pic = driver.switchTo().activeElement();
		pic.sendKeys("C:\\Users\\Sasha\\eclipse-workspace\\zavrsniProjekat\\slika");
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
		Settings.submit(driver);

		driver.close();
	}

	@Test(priority = 4)
	public static void testNotification() {

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		Settings.setNot(driver);
		Settings.setMail(driver);
		Settings.setSMS(driver);
		Settings.setPush(driver);
		Settings.setSMS(driver);
		Settings.setSave(driver);
	}

	@Test(priority = 5)
	public static void testExtra() {

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		ExsAcc.clickProfile(driver);
		Profile.enterNick(driver);
		driver.findElement(By.xpath(Profile.NICKNAME)).sendKeys("salence");
		Profile.enterWage(driver);
		driver.findElement(By.xpath(Profile.WAGE)).sendKeys("25");
		Settings.submit(driver);
	}
}
