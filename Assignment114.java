/* J_Richardson_AB_37
 * Assignment -114
Launch Amazon and click on mobile tab.*/

package Assignments;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment114 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
		//driver.findElement(By.tes("email")).sendKeys("jrichardson5482@gmail.com");// using name - email
		driver.findElement(By.linkText("Mobiles")).click();//using linkText

	}

}