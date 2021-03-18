package object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home {
	
	public static final String HOMEPAGE = "https://www.humanity.com/";
	public static final String ESCAPE_NOTE = "//*[@id=\"tcp-modal\"]/div/div/div[1]/button";
	public static final String TRIAL_HEADER = "//*[@id=\"navbarSupportedContent\"]/div/a[3]";
	public static final String TRIAL_CENTER = "//*[@id=\"free-trial-link-01\"]";
	public static final String NAME_HEADER = "//*[@id=\"popup-form\"]/div[1]/input";
	public static final String EMAIL_HEADER = "//*[@id=\"popup-form\"]/div[2]/input";
	public static final String NAME = "//*[@id=\"top-form\"]/div/div[1]/input";
	public static final String EMAIL = "//*[@id=\"top-form\"]/div/div[2]/input";
	public static final String SUBMIT = "//*[@id=\"popup-free-trial-link\"]";
	public static final String ABOUT_HOVER = "//*[@id=\"navbarSupportedContent\"]/ul/li[6]/a";
	public static final String ABOUT_US = "//*[@id=\"navbarSupportedContent\"]/ul/li[6]/ul/li[1]/a/p[1]";
	public static final String POP_UP_BTN = "//*[@id=\"intercom-container\"]/div/div/div[1]/div/div";
	public static final String OK_COOKIES = "//*[@id=\"cf-root\"]/div/div/div/div[2]/div[2]/div[1]/button";
	public static final String POP_UP_MSG = "//*[@id=\\\"intercom-container\\\"]/div/div/div[2]/div/div/div[1]/div/div[1]/div/div[1]/div/div[2]/div[1]/div/div/span[1]";
	public static final String LOGIN = "//*[@id=\"navbarSupportedContent\"]/div/a[2]/p";
	public static final String LOGIN_EMAIL = "//*[@id=\"email\"]";
	public static final String LOGIN_PASSWORD = "//*[@id=\"password\"]";
	public static final String LOGIN_BUTTON = "//*[@id=\"LoginForm\"]/div[3]/div/button[1]";

	public static void startPage(WebDriver driver) {

		driver.manage().window().maximize();

		driver.navigate().to(HOMEPAGE);

		driver.findElement(By.xpath(ESCAPE_NOTE)).click();

		driver.findElement(By.xpath(OK_COOKIES)).click();

	/*	Actions builder = new Actions(driver);

		WebElement we = driver.findElement(By.xpath(POP_UP_MSG));
		
		WebElement we1 = driver.findElement(By.cssSelector("div.intercom-lr0ri6 es6hgh14"));
		
		builder.moveToElement(we).perform();
		
		builder.moveToElement(we1).click().perform();
*/
	}

	public static void centerName(WebDriver driver) {

		driver.findElement(By.xpath(NAME)).click();

	}

	public static void centerEmail(WebDriver driver) {

		driver.findElement(By.xpath(EMAIL)).click();

	}

	public static void centerButton(WebDriver driver) {

		driver.findElement(By.xpath(TRIAL_CENTER)).click();

	}

	public static void signUpHeader(WebDriver driver) {

		driver.findElement(By.xpath(TRIAL_HEADER)).click();

	}

	public static void headerName(WebDriver driver) {

		driver.findElement(By.xpath(NAME_HEADER)).click();

	}

	public static void headerEmail(WebDriver driver) {

		driver.findElement(By.xpath(EMAIL_HEADER)).click();

	}

	public static void headerClick(WebDriver driver) {

		driver.findElement(By.xpath(SUBMIT)).click();

	}

	public static void aboutUs(WebDriver driver) {

		driver.findElement(By.xpath(ABOUT_HOVER)).click();

		driver.findElement(By.xpath(ABOUT_US)).click();
	}

	public static void logIn(WebDriver driver) {

		driver.findElement(By.xpath(LOGIN)).click();
	}

	public static void logInEmail(WebDriver driver) {

		driver.findElement(By.xpath(LOGIN_EMAIL)).click();
	}

	public static void logInPass(WebDriver driver) {

		driver.findElement(By.xpath(LOGIN_PASSWORD)).click();
	}

	public static void logInButton(WebDriver driver) {

		driver.findElement(By.xpath(LOGIN_BUTTON)).click();
	}

}
