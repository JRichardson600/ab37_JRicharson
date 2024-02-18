/* J_Richardson_AB_37
 * Assignment -125
Perform any action on
the disabled component
and find out which
exceeption we are getting*/

package Assignments;

//import java.util.Arrays;
//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment125 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();

		driver.get("file:///C:/Users/Richard/OneDrive/Documents/learningHTML1.html");// launch FB
		driver.manage().window().maximize();

		Thread.sleep(3000);

		WebElement lastName_dd = driver.findElement(By.id("121"));// tagName[@attributeName=attributeValue]
		Thread.sleep(3000);
		lastName_dd.sendKeys("abc");

	}

}