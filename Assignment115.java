/* J_Richardson_AB_37
 * Assignment -115
Launch Google.com and click on gmail using linkText.*/

package Assignments;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment115 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Gmail")).click();// using linkText

	}

}