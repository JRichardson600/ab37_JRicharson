package amazonPracticeTestNG.copy;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Launch_quit {
	WebDriver driver;

	@BeforeMethod
	@Parameters("browser")
	public void launch(String name_of_browser) throws EncryptedDocumentException, IOException {

		if (name_of_browser.equals("chrome")) {
			driver = new ChromeDriver();
		}
		if (name_of_browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		if (name_of_browser.equals("edge")) {
			driver = new EdgeDriver();
		}

		FileInputStream f1 = new FileInputStream(
				"C:\\Users\\Richard\\eclipse-workspace\\Selenium\\ExcelSheet\\TC1.xlsx");

		Workbook wb = WorkbookFactory.create(f1);// open the excelsheet

		String fname = wb.getSheet("login").getRow(1).getCell(0).getStringCellValue();

		String mobNum = NumberToTextConverter.toText(wb.getSheet("login").getRow(1).getCell(1).getNumericCellValue());

		String psw = wb.getSheet("login").getRow(1).getCell(2).getStringCellValue();

		driver.get(
				"https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26tag%3Dgooghydrabk1-21%26ref%3Dnav_custrec_signin%26adgrpid%3D150668181581%26hvpone%3D%26hvptwo%3D%26hvadid%3D678802104140%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D8366720646713754005%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9062044%26hvtargid%3Dkwd-10544572015%26hydadcr%3D5621_2412643&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");

		driver.manage().window().maximize();// maximizing the window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("ap_email")).sendKeys(mobNum);
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys(psw);
		driver.findElement(By.id("signInSubmit")).click();
	}

	@AfterMethod
	public void quit() throws InterruptedException {
		WebElement hover_over_btn = driver.findElement(By.xpath("(//span[@class='nav-icon nav-arrow'])[2]"));

		Actions a1 = new Actions(driver);
		a1.moveToElement(hover_over_btn).perform();

		// Thread.sleep(5000);

		WebElement sign_out_btn = driver.findElement(By.xpath("(//span[@class='nav-text'])[20]"));
		sign_out_btn.click();

		//driver.quit();
	}

}
