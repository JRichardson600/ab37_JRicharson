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

public class Assignment132_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/drag-and-drop/");
		driver.manage().window().maximize();
		WebElement drag = driver.findElement(By.id("drag7"));
		WebElement drop = driver.findElement(By.id("div2"));
		Actions a1 = new Actions(driver);
		a1.dragAndDrop(drag, drop).perform();
		WebElement drop1 = driver.findElement(By.xpath("(//div[@id='div1'])[7]"));
		a1.dragAndDrop(drop, drop1).perform();
	}
}
