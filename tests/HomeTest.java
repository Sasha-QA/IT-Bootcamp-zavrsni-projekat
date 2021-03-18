package tests;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import object.ExsAcc;
import object.ExsAcc;
import object.Home;
import object.NewAcc;

public class HomeTest {
	
	private static WebDriver driver;

	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sasha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test (priority = 0)
	public static void startPage() {
		Home.startPage(driver);
	}

	@Test
	public static void testHeader() {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Home.signUpHeader(driver);
		Home.headerName(driver);
		driver.findElement(By.xpath(Home.NAME_HEADER)).sendKeys("User Dvaaa");
		Home.headerEmail(driver);
		driver.findElement(By.xpath(Home.EMAIL_HEADER)).sendKeys("user22@dva.com");
		Home.headerClick(driver);

		String actual = driver.getCurrentUrl();
		String expected = NewAcc.NEW_ACCOUNT;

		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actual, expected);
		sa.assertAll();
	}

	@Test
	public static void testLogIn() {

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.navigate().to(Home.HOMEPAGE);
		Home.logIn(driver);
		Home.logInEmail(driver);
		driver.findElement(By.xpath(Home.LOGIN_EMAIL)).sendKeys("salence@12345.com");
		Home.logInPass(driver);
		driver.findElement(By.xpath(Home.LOGIN_PASSWORD)).sendKeys("Sale12!");
		Home.logInButton(driver);

		String actual = driver.getCurrentUrl();
		String expected = ExsAcc.EXSISTING_ACC;

		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actual, expected);
		sa.assertAll();
	}

	@Test
	public static void testCenter() {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.navigate().to(Home.HOMEPAGE);
		Home.centerName(driver);
		driver.findElement(By.xpath(Home.NAME)).sendKeys("User jedaaan");
		Home.centerEmail(driver);
		driver.findElement(By.xpath(Home.EMAIL)).sendKeys("user.11@de.be");
		Home.centerButton(driver);

		String actual = driver.getCurrentUrl();
		String expected = NewAcc.NEW_ACCOUNT;

		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actual, expected);
		sa.assertAll();
	}

	@Test

	public static void testAbout() {

		Home.aboutUs(driver);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		TakesScreenshot scr = ((TakesScreenshot) driver);

		File file = scr.getScreenshotAs(OutputType.FILE);

		try {
			FileUtils.copyFile(file, new File("./slika/Skrinsott.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		String actual = driver.getCurrentUrl();
		String expected = "https://www.humanity.com/about";

		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actual, expected);
		sa.assertAll();
	}

	@Test

	public static void testNewUser() {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		NewAcc.startNew(driver);
		Home.centerName(driver);
		driver.findElement(By.xpath(Home.NAME)).sendKeys("Grok Grok");
		Home.centerEmail(driver);
		driver.findElement(By.xpath(Home.EMAIL)).sendKeys("groki@de.gr");
		Home.centerButton(driver);
		NewAcc.enterCompany(driver);
		driver.findElement(By.xpath(NewAcc.COMPANY)).sendKeys("Tri mala praseta");
		NewAcc.enterIndustry(driver);
		driver.findElement(By.linkText("Construction/Contractors")).click();
		NewAcc.enterRole(driver);
		driver.findElement(By.linkText("Operations")).click();
		NewAcc.enterPhone(driver);
		driver.findElement(By.xpath(NewAcc.PHONE)).sendKeys("333555666");
		NewAcc.enterPass(driver);
		driver.findElement(By.xpath(NewAcc.PASSWORD)).sendKeys("PrvoDrugoTrece123");
		NewAcc.enterConfirm(driver);
		driver.findElement(By.xpath(NewAcc.CONFIRM_PASSWORD)).sendKeys("PrvoDrugoTrece123");
		NewAcc.enterSubmit(driver);

	}


}
