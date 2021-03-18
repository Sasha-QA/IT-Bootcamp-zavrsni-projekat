package object;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class NewAcc {

	public static final String NEW_ACCOUNT = "https://www.humanity.com/wizard-setup2/";
	public static final String COMPANY = "//*[@id=\"root\"]/div/div/form/div[1]/div/div[1]/div/div/input";
	public static final String INDUSTRY = "//*[@id=\"root\"]/div/div/form/div[1]/div/div[2]/div/div/span";
	public static final String FUNCTIONAL_ROLE = "//*[@id=\"root\"]/div/div/form/div[1]/div/div[3]/div/div/span";
	public static final String PHONE = "//*[@id=\"root\"]/div/div/form/div[1]/div/div[4]/div/input";
	public static final String PASSWORD = "//*[@id=\"root\"]/div/div/form/div[1]/div/div[5]/div/input";
	public static final String CONFIRM_PASSWORD = "//*[@id=\"root\"]/div/div/form/div[1]/div/div[6]/div/input";
	public static final String SUBMIT = "//*[@id=\"root\"]/div/div/form/div[2]/span/input";

	public static void startNew(WebDriver driver) {
		
		driver.navigate().to(NEW_ACCOUNT);
		
	}
	
	public static void enterCompany(WebDriver driver) {

		driver.findElement(By.xpath(COMPANY)).click();
	}

	public static void enterIndustry(WebDriver driver) {

		driver.findElement(By.xpath(INDUSTRY)).click();
		driver.findElement(By.xpath(INDUSTRY)).sendKeys(Keys.ARROW_DOWN);
	}

	public static void enterRole(WebDriver driver) {

		driver.findElement(By.xpath(FUNCTIONAL_ROLE)).click();
	}

	public static void enterPhone(WebDriver driver) {

		driver.findElement(By.xpath(PHONE)).click();
	}

	public static void enterPass(WebDriver driver) {

		driver.findElement(By.xpath(PASSWORD)).click();
	}

	public static void enterConfirm(WebDriver driver) {

		driver.findElement(By.xpath(CONFIRM_PASSWORD)).click();
	}

	public static void enterSubmit(WebDriver driver) {

		driver.findElement(By.xpath(SUBMIT)).click();
	}
	
}
