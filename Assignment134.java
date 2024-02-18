/* J_Richardson_AB_37
 * Assignment -134
Launch amazon search for any product and
 add to card and try to make debit/credit card method of payment */

package AssignmentDDT;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment134 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		// TODO Auto-generated method stub

		FileInputStream f1 = new FileInputStream(
				"C:\\Users\\Richard\\eclipse-workspace\\SeleniumAssignment\\ExcellSheetDDT\\TC1.xlsx");// location
																											// of
		// excelsheet-format>>FileInputStream
		// refVar= new
		// FileInputStream("location
		// of the excelsheet")

		Workbook wb = WorkbookFactory.create(f1);// open the excelsheet
		// String usn =
		// wb.getSheet("login").getRow(1).getCell(0).getStringCellValue();// fetching
		// the
		// cellVal+ue(1,0)(row,column) ex-1,0

		String usn1 = NumberToTextConverter.toText(wb.getSheet("login").getRow(1).getCell(1).getNumericCellValue());
		String psw = wb.getSheet("login").getRow(1).getCell(2).getStringCellValue();// get the sheet no from
																					// ExeclSheet(ex--paymentDeatils"").getRowvalue(0(x
																					// cordinate)).getRowvalue(0(y
																					// cordinate)).getvalue

		EdgeDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(
				"https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26tag%3Dgooghydrabk1-21%26ref%3Dnav_custrec_signin%26adgrpid%3D150668181581%26hvpone%3D%26hvptwo%3D%26hvadid%3D678802104140%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D8366720646713754005%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9062044%26hvtargid%3Dkwd-10544572015%26hydadcr%3D5621_2412643&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		driver.findElement(By.id("ap_email")).sendKeys(usn1);
		Thread.sleep(5000);
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys(psw);// 1.find element 2.locate 3.perform
																// action-send text
		Thread.sleep(5000);
		driver.findElement(By.id("signInSubmit")).click();
		driver.manage().window().maximize();

//		driver.get("https://www.flipkart.com/");
		WebElement amsearch_tf = driver.findElement(By.id("twotabsearchtextbox"));
		Thread.sleep(1000);
		amsearch_tf.sendKeys("shoes");

		WebElement search_btn = driver.findElement(By.id("nav-search-submit-button"));
		Thread.sleep(1000);
		search_btn.click();

		WebElement shoes1 = driver
				.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[30]"));
		Thread.sleep(1000);
		shoes1.click();

		Set<String> selected_shoe = driver.getWindowHandles();

		Iterator<String> pcId = selected_shoe.iterator();

		String parendId = pcId.next();// parent id from parentandchild
		String childId = pcId.next();// 1st childid

//		System.out.println(parendId);
//		System.out.println(childId);

		driver.switchTo().window(childId);// moved the control to child window
		Thread.sleep(3000);

		WebElement addToCart_btn = driver.findElement(By.id("add-to-cart-button"));
		Thread.sleep(2000);
		addToCart_btn.click();
		Thread.sleep(1000);

		WebElement proced_btn = driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']"));
		Thread.sleep(2000);
		proced_btn.click();
		Thread.sleep(1000);

		WebElement useThisAdd_btn = driver.findElement(By.xpath("//span[@id='shipToThisAddressButton']"));
		Thread.sleep(2000);
		useThisAdd_btn.click();
		Thread.sleep(1000);

		WebElement credDebit_Rbtn = driver.findElement(By.xpath("//input[@value='SelectableAddCreditCard']"));
		Thread.sleep(2000);
		credDebit_Rbtn.click();
		Thread.sleep(1000);

		WebElement Card_Details = driver.findElement(By.linkText("Enter card details"));
		Card_Details.click();

		WebElement First_frame = driver.findElement(By.name("ApxSecureIframe"));
		driver.switchTo().frame(First_frame);

		WebElement Card_no = driver.findElement(By.name("addCreditCardNumber"));
		Card_no.sendKeys("987654324");

	}

}