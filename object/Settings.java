package object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Settings {
	
	public static final String XPATH_LANGUAGE = "//*[@id=\"language\"]";
	public static final String NOTIFICATION = "//*[@id=\"_cd_staff\"]/div[2]/div[2]/div[1]/a[6]";
	public static final String MAIL_BOX ="//*[@id=\"email[pref]\"]";
	public static final String SMS_BOX="//*[@id=\"sms[pref]\"]";
	public static final String PUSH_BOX="//*[@id=\"mobile_push[pref]\"]";
	public static final String SAVE="//*[@id=\"notif-settings\"]";
	public static final String UPLOAD ="//*[@id=\"fileupload\"]";
	public static final String SUBMIT ="//*[@id=\"NewEmployeeForm\"]/table/tbody/tr[42]/td/input";
	
	public static void clickLanguage(WebDriver driver) {
		
		driver.findElement(By.xpath(ExsAcc.XPATH_ICON)).click();
		driver.findElement(By.xpath(ExsAcc.XPATH_SETTINGS)).click();
		driver.findElement(By.xpath(XPATH_LANGUAGE)).click();
	}

	public static void picture(WebDriver driver) {
		
		driver.findElement(By.xpath(UPLOAD)).click();
	}
	
	public static void submit(WebDriver driver) {
		
		driver.findElement(By.xpath(SUBMIT)).click();
	}
	
	public static void setNot(WebDriver driver) {
		
		driver.findElement(By.xpath(NOTIFICATION)).click();
	}
	
	public static void setMail(WebDriver driver) {
		
		driver.findElement(By.xpath(MAIL_BOX)).click();
	}
	
	public static void setSMS(WebDriver driver) {
		
		driver.findElement(By.xpath(SMS_BOX)).click();
	}
	
	public static void setPush(WebDriver driver) {
		
		driver.findElement(By.xpath(PUSH_BOX)).click();
	}
	
	public static void setSave(WebDriver driver) {
		
		driver.findElement(By.xpath(SAVE)).click();
	}
}
