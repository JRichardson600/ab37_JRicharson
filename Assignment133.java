/* J_Richardson_AB_37
 * Assignment -133
Launch growtechminds registration page and 
handle drop down print all the option names present in dropdowns */

package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Assignment133 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");// launch flipkart website
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);

		WebElement country_dd = driver.findElement(By.id("Country"));// cpuntry dropdown

		Select s1 = new Select(country_dd);// to handle dropdown
		Thread.sleep(3000);
		/* s1.selectByVisibleText("India"); */
		List<WebElement> s2 = s1.getOptions();
		int count = s2.size();
		System.out.println(count);

		for (int i = 0; i <= s2.size() - 1; i++) {
			WebElement a1 = s2.get(i);
			String text_message = a1.getText(); // get all the link
			System.out.println(text_message);// print all the linkTexts
		}

		WebElement Skills_dd = driver.findElement(By.id("Skills"));// cpuntry dropdown
		Select s3 = new Select(Skills_dd);// to handle dropdown
		List<WebElement> s4 = s3.getOptions();
		int count1 = s4.size();
		System.out.println(count1);

		for (int i = 0; i <= s4.size() - 1; i++) {
			WebElement a1 = s4.get(i);
			String text_message = a1.getText(); // get all the link
			System.out.println(text_message);// print all the linkTexts
		}

		WebElement Relegion_dd = driver.findElement(By.id("Relegion"));// cpuntry dropdown
		Select s5 = new Select(Relegion_dd);// to handle dropdown
		List<WebElement> s6 = s5.getOptions();
		int count2 = s6.size();
		System.out.println(count2);

		for (int i = 0; i <= s6.size() - 1; i++) {
			WebElement a1 = s6.get(i);
			String text_message = a1.getText(); // get all the link
			System.out.println(text_message);// print all the linkTexts
		}
	}
}