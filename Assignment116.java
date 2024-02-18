/* J_Richardson_AB_37
 * Assignment -116
Launch Amazon.in and Click on 1.UAE 2.UK 3.US,using partial link text.*/
//ask doubt

package Assignments;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment116 {

	public static void main(String[] args) {
		// ChromeDriver driver = new ChromeDriver();

		String a[] = { "United Arab Emirates", "United Kingdom", "United States" };

		for (int i = 0; i < 3; i++) {
			FirefoxDriver driver = new FirefoxDriver();
			driver.get("https://www.amazon.in/");
			driver.findElement(By.partialLinkText(a[i])).click();
			System.out.println(a[i]+driver.getTitle());

		}

	}

}