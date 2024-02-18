/* J_Richardson_AB_37
 * Assignment -118
Login to facebook.com using xpath locator(Relative xpath)*/

package Assignments;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment118 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");//launch FB
		driver.manage().window().maximize();
	
		driver.findElement(By.xpath("(//input)[3]")).sendKeys("rj5482gmail.com");//username
		driver.findElement(By.xpath("(//input)[4]")).sendKeys("9916455168");//password-pass always incorrect psw
		driver.findElement(By.xpath("(//button)")).click();
		
//		Thread.sleep(7500);
//		driver.close();
	}

}