/* J_Richardson_AB_37
 * Assignment -112
Login to Facebook using id,name locator*/

package Assignments;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment112 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("rj5482@.com");// using id - username
		driver.findElement(By.id("pass")).sendKeys("xxxsdasxx");// using id - password
		
		driver.findElement(By.id("login")).click();// using name - click on the login  button
	}

}