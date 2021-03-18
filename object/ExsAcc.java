package object;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ExsAcc {

	public static final String EXSISTING_ACC = "https://slashy.humanity.com/app/dashboard/";
	public static final String DASHBOARD = "https://slashy.humanity.com/app/dashboard/";
	public static final String SHIFT_DAY = "https://slashy.humanity.com/app/schedule/employee/day/overview/overview/26%2c1%2c2021/";
	public static final String TIMECLOCK = "https://slashy.humanity.com/app/timeclock/";
	public static final String LEAVE = "https://slashy.humanity.com/app/requests/vacation/";
	public static final String TRAINING = "https://slashy.humanity.com/app/training/";
	public static final String STAFF = "https://slashy.humanity.com/app/staff/list/load/true/";
	public static final String AVAILABILITY = "https://slashy.humanity.com/fe/availability/#/requests/week/2021-02-21/1";
	public static final String PAYROLL = "https://slashy.humanity.com/app/payroll/scheduled-hours/";
	public static final String REPORT = "https://slashy.humanity.com/app/reports/dashboard/";
	public static final String HELP = "https://slashy.humanity.com/app/admin/settings/";
	public static final String PROFIL_URL = "https://slashy.humanity.com/app/staff/detail/6081161/";
	public static final String SETTINGS_URL = "https://slashy.humanity.com/app/staff/edit/6081161/";
	public static final String HUMANITY = "https://slashy.humanity.com/app/dashboard/";
	private static final String XPATH_DASH = "//*[@id=\"sn_dashboard\"]";
	private static final String XPATH_SHIFT = "//*[@id=\"sn_schedule\"]";
	private static final String XPATH_TIME = "//*[@id=\"sn_timeclock\"]";
	private static final String XPATH_LEAVE = "//*[@id=\"sn_requests\"]";
	private static final String XPATH_TRAIN = "//*[@id=\"sn_training\"]";
	private static final String XPATH_REPORT = "//*[@id=\"sn_reports\"]";
	private static final String XPATH_HELP = "//*[@id=\"sn_admin\"]/span";
	public static final String XPATH_ICON = "//*[@id=\"tr_avatar\"]";
	public static final String XPATH_PROFILE = "//*[@id=\"userm\"]/div/a[1]";
	public static final String XPATH_SETTINGS = "//*[@id=\"userm\"]/div/a[2]";
	private static final String XPATH_HUMANITY = "//*[@id=\"_nav\"]/div[1]/img";
	public static final String ADD_EMPLOYEE = "//*[@id=\"act_primary\"]";
	public static final String SAVE_EMPLOYEE = "//*[@id=\"_as_save_multiple\"]";
	
	public static void clickDash(WebDriver driver) {

		driver.findElement(By.xpath(XPATH_DASH)).click();
	}

	public static void clickHumanity(WebDriver driver) {

		driver.findElement(By.xpath(XPATH_HUMANITY)).click();
	}

	public static void clickShift(WebDriver driver) {
		driver.findElement(By.xpath(XPATH_SHIFT)).click();
	}

	public static void clickTime(WebDriver driver) {
		driver.findElement(By.xpath(XPATH_TIME)).click();
	}

	public static void clickLeave(WebDriver driver) {
		driver.findElement(By.xpath(XPATH_LEAVE)).click();
	}

	public static void clickTrain(WebDriver driver) {
		driver.findElement(By.xpath(XPATH_TRAIN)).click();
	}

	public static void clickStaff(WebDriver driver) {
		driver.findElement(By.linkText("Staff")).click();
	}

	public static void clickAvailability(WebDriver driver) {
		driver.findElement(By.linkText("Availability")).click();
	}

	public static void clickPayroll(WebDriver driver) {
		driver.findElement(By.linkText("Payroll")).click();
	}

	public static void clickReport(WebDriver driver) {
		driver.findElement(By.xpath(XPATH_REPORT)).click();
	}

	public static void clickHelp(WebDriver driver) {
		driver.findElement(By.xpath(XPATH_HELP)).click();
	}

	public static void clickProfile(WebDriver driver) {
		driver.findElement(By.xpath(XPATH_ICON)).click();
		driver.findElement(By.xpath(XPATH_PROFILE)).click();
	}

	public static void clickSettings(WebDriver driver) {
		driver.findElement(By.xpath(XPATH_ICON)).click();
		driver.findElement(By.xpath(XPATH_SETTINGS)).click();
	}

	public static void addEmployee(WebDriver driver) {
		driver.findElement(By.xpath(ADD_EMPLOYEE)).click();
	}

	public static void saveEmployee(WebDriver driver) {
		driver.findElement(By.linkText("Save Employees")).click();
	}

	public static String apachePoi(String name, int cel, int same) {

		File file = new File(name);
		InputStream inp = null;
		try {
			inp = new FileInputStream(name);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		XSSFWorkbook wb = null;
		try {
			wb = new XSSFWorkbook(inp);
		} catch (IOException e) {

			e.printStackTrace();
		}

		Sheet sheet = wb.getSheetAt(0);
		Row row = sheet.getRow(cel);
		Cell cell = row.getCell(same);

		String data = cell.getStringCellValue();
		return data.toString();
	}
	
}
