/* J_Richardson_AB_37
 * Assignment -120
Launch GrowTechminds registraion form,
for firstname textfield enter name as Manish Kumar Tiwari,
remove Tiwari from it using Keys option*/

package Assignments;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment120 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://grotechminds.com/registration/");//launch FB
		driver.manage().window().maximize();
		WebElement firstname_tf = driver.findElement(By.xpath("//input[@id=\"fname\"]"));// googlr search text fiels
		firstname_tf.sendKeys("Manish Kumar Tiwari");
		
		for(int i=0;i<6;i++) {
			firstname_tf.sendKeys(Keys.BACK_SPACE);
		}
		
		
//		Thread.sleep(7500);
//		driver.close();
	}

}