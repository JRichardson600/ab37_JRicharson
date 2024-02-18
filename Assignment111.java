/* J_Richardson_AB_37
 * Assignment -111
Get the title of flipkart.com and save each word in an array*/

package Assignments;

import java.util.Arrays;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment111 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		String a = driver.getTitle();
		System.out.println("Title of flipkart.com = " + a);// get title

		String c[] = a.split(" ");
		
//		char[] c = a.toCharArray();

		System.out.println("After split = " + Arrays.toString(c));// save each word in an array

	}

}
