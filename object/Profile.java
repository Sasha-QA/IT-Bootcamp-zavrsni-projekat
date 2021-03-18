package object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Profile {

	public static final String STAFF_LIST = "https://slashy.humanity.com/app/staff/list/";
	public static final String EP_ONE ="https://slashy.humanity.com/app/staff/detail/6089815/";
	public static final String EP_TWO ="https://slashy.humanity.com/app/staff/detail/6089819/";
	public static final String EP_THREE ="https://slashy.humanity.com/app/staff/detail/6089816/";
	public static final String EP_FOUR = "https://slashy.humanity.com/app/staff/detail/6089817/";
	public static final String EP_FIVE ="https://slashy.humanity.com/app/staff/detail/6089818/";
	public static final String EDIT_DETAILS="//*[@id=\"_cd_staff\"]/div[2]/div[2]/div[1]/a[2]";
	public static final String EDIT_NAME ="//*[@id=\"first_name\"]";
	public static final String UPDATE_BUTTON="//*[@id=\"NewEmployeeForm\"]/table/tbody/tr[39]/td/input";
	public static final String NICKNAME ="//*[@id=\"nick_name\"]";
	public static final String WAGE = "//*[@id=\"wage\"]";
	
	public static void staff(WebDriver driver) {
		
		driver.findElement(By.xpath(STAFF_LIST)).click();
	}
	
	public static void empOne(WebDriver driver) {
		
		driver.findElement(By.linkText("dragan macan")).click();
	}
	
	public static void empTwo(WebDriver driver) {
		
		driver.findElement(By.linkText("dragi vlauca")).click();
	}
	
	public static void empThree(WebDriver driver) {
		
		driver.findElement(By.linkText("gagi ljepota")).click();
	}
	
	public static void empFour(WebDriver driver) {
		
		driver.findElement(By.linkText("gale belutak")).click();
	}
	
	public static void empFive(WebDriver driver) {
		
		driver.findElement(By.linkText("grogi prase")).click();
	}
	
	public static void editEmp(WebDriver driver) {
		
		driver.findElement(By.xpath(EDIT_DETAILS)).click();
	}
	
	public static void empName(WebDriver driver) {
		
		driver.findElement(By.xpath(EDIT_NAME)).click();
	}
	
	public static void updateEmp(WebDriver driver) {
		
		driver.findElement(By.xpath(UPDATE_BUTTON)).click();
	}
	
	public static void enterNick(WebDriver driver) {
		
		driver.findElement(By.xpath(NICKNAME)).click();
	}
	
	public static void enterWage(WebDriver driver) {
		
		driver.findElement(By.xpath(WAGE)).click();
	}
}
