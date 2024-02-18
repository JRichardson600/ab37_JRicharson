/* J_Richardson_AB_37
 * Assignment -122
Launch GrowTechminds registraion form,
Enter "Manish Kumar Tiwari" in the firstname and 
copy paste in all 4 text fields using arrowdown*/

package Assignments;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment122 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://grotechminds.com/registration/");//launch FB
		driver.manage().window().maximize();
		WebElement firstname_tf = driver.findElement(By.xpath("//input[@id=\"fname\"]"));// googlr search text fiels
		firstname_tf.sendKeys("Manish Kumar Tiwari");
		firstname_tf.sendKeys(Keys.CONTROL + "a");
		firstname_tf.sendKeys(Keys.CONTROL + "c");

		WebElement lastname_tf = driver.findElement(By.xpath("//input[@id=\"lname\"]"));
		lastname_tf.sendKeys(Keys.CONTROL + "v");
		
		WebElement username_tf = driver.findElement(By.xpath("//input[@id=\"Username\"]"));
		username_tf.sendKeys(Keys.CONTROL + "v");
		
		WebElement password_tf = driver.findElement(By.xpath("//input[@id=\"password\"]"));
		password_tf.sendKeys(Keys.CONTROL + "v");
		
//		Thread.sleep(7500);
//		driver.close();
	}

}