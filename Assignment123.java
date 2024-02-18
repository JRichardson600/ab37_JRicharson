/* J_Richardson_AB_37
 * Assignment -123
Launch grotechminds registration form and 
locate dropdowns skills,
country
and religion perform action on them*/

package Assignments;

//import java.util.Arrays;
//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment123 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://grotechminds.com/registration/");// launch FB
		driver.manage().window().maximize();

		Thread.sleep(10000);

		WebElement skills_dd = driver.findElement(By.id("Skills"));// country dropdown
		Select s1 = new Select(skills_dd);
		s1.selectByIndex(2);// passing random values

		WebElement skillsNT_dd = driver.findElement(By.id("nontechnicalskills"));// country dropdown
		Select s2 = new Select(skillsNT_dd);
		s2.selectByIndex(2);// passing random values

		WebElement country_dd = driver.findElement(By.id("Country"));// country dropdown
		Select s3 = new Select(country_dd);
		s3.selectByIndex(2);// passing random values

		WebElement religion_dd = driver.findElement(By.id("Relegion"));// Religion dropdown
		Select s4 = new Select(religion_dd);
		s4.selectByIndex(3);// passing random values

	}

}