/* J_Richardson_AB_37
 * Assignment -127
Launch www.flipkart.com page,
search for books and 
click on second autosuggestion use xpath to locate autosuggestions.*/

package Assignments;

import java.util.List;

//import java.util.Arrays;
//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment127 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");// launch flipkart
		driver.manage().window().maximize();

		WebElement lastName_dd = driver.findElement(By.name("q"));// tagName[@attributeName=attributeValue]
		Thread.sleep(1000);
		lastName_dd.sendKeys("Books");
		Thread.sleep(3000);

		List<WebElement> results = driver.findElements(By.xpath("(//div[@class='YGcVZO _2VHNef'])"));
		int count_am_sug = results.size();
		Thread.sleep(3000);
		results.get(count_am_sug - 7).click(); // selecting 6 element from top
	}

}