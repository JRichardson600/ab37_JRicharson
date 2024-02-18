/* J_Richardson_AB_37
 * Assignment -132
Launch growtechminds drag and 
drop page,
do drag a image and 
drop it in target place,
do the reverse of it.*/

package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment132 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/drag-and-drop/");// launch flipkart website
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(5000);

		WebElement drag = driver.findElement(By.id("div1"));// locate the element
		WebElement drop = driver.findElement(By.id("div2"));

		Actions a1 = new Actions(driver);
		Thread.sleep(2000);
		a1.dragAndDrop(drag, drop).perform(); // (moving from drag >> drop)
		Thread.sleep(5000);
		a1.dragAndDrop(drop, drag).perform();// (Reverting-moving from drop >> drag)
	}
}
