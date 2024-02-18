/* J_Richardson_AB_37
 * Assignment -131
Launch Flipkart hover over fashion and click on men's T-shirt*/

package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment131 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");// launch flipkart website
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(5000);

		WebElement fashion = driver.findElement(By.xpath("//div[@class='_1ch8e_'][1]"));// locate the element

		Actions a1 = new Actions(driver);// use the actions class-format>> Actions refVar = new Actions(driver)
		a1.moveToElement(fashion).perform();// to perform the hover-Overformat>>
											// refVar.moveToElement(locatorName).perform();
		WebElement mens_Tshirt = driver.findElement(By.linkText("Men's T-Shirts"));// locate the element in the dropdown
		Thread.sleep(5000);
		mens_Tshirt.click();// perform the actions

	}

}
