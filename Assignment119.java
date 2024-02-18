/* J_Richardson_AB_37
 * Assignment -119
launch amazon.in 
select category dropdown,
select Books using arrow down key then search for software in search text field 
and press enter using keys function.*/

package Assignments;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment119 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");// launch FB
		driver.manage().window().maximize();

		for (int i = 0; i < 12; i++) {
			driver.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ARROW_DOWN );
		}



		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Software Testing");
		driver.findElement(By.id("nav-search-submit-button")).click();

		Thread.sleep(7500);
		driver.close();
	}

}