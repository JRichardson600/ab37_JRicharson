/* J_Richardson_AB_37
 * Assignment -135
launch goibibo page select from bnaglore and 
to delhi and select the first autosuggestions ,
select any future date and 
select one adult click on search button. */

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

public class Assignment135 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		// TODO Auto-generated method stub

		EdgeDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.goibibo.com/");

		WebElement First_frame = driver.findElement(By.name("destination_publishing_iframe_ibibo_0_name"));

		WebElement close_btn = driver.findElement(By.xpath("//span[@class='logSprite icClose']"));
		close_btn.click();

		driver.manage().window().maximize();
		// driver.switchTo().alert().dismiss();

		WebElement bannerClose_btn = driver.findElement(By.xpath("//p[@class='sc-jlwm9r-1 ewETUe']"));
		bannerClose_btn.click();

		// From
		WebElement from_tf = driver.findElement(By.xpath("(//p[.='Enter city or airport'])[1]"));
		from_tf.click();// first select the from_tf

		WebElement from_tf1 = driver.findElement(By.xpath("//input[@type='text']"));
		from_tf1.sendKeys("blr");// send values to the TF

		WebElement from_tf2 = driver.findElement(By.xpath("(//div[@class='sc-12foipm-45 gfqMUQ'])[1]"));
		from_tf2.click();// first select the to_tf

		// To
		WebElement to_tf = driver.findElement(By.xpath("//input[@type='text']"));
		to_tf.sendKeys("new delhi");// first select the to_tf

		WebElement to_tf1 = driver.findElement(By.xpath("(//div[@class='sc-12foipm-45 gfqMUQ'])"));
		to_tf1.click();// first select the to_tf

		// date selection
		WebElement journeyDate = driver.findElement(By.xpath("(//p[@class='fsw__date'])[18]"));
		journeyDate.click();

		// Click on done 
		WebElement done_btn = driver.findElement(By.xpath("(//span[@class='fswTrvl__done'])"));
		done_btn.click();

		// select adult count
		WebElement adult = driver.findElement(By.xpath("(//span[@class='sc-12foipm-64 dGRyPm'])[2]"));
		adult.click();

		// select premium class
		WebElement premiumClass = driver.findElement(By.xpath("(//li[@class='sc-12foipm-59 jfdntO'])[1]"));
		premiumClass.click();
	
		// submit details adult,class
		WebElement doneDetails = driver.findElement(By.xpath("//a[@class='sc-12foipm-77 jYnAuG']"));
		doneDetails.click();
		
		// select radio button
		WebElement radioBtn = driver.findElement(By.xpath("//span[.='armed forces']"));
		radioBtn.click();
		
		// search flight
		WebElement searchFlight = driver.findElement(By.xpath("//span[.='SEARCH FLIGHTS']"));
		searchFlight.click();

	}

}