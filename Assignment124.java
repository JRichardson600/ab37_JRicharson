/* J_Richardson_AB_37
 * Assignment -124
Launch Growtechminds xpath form do the folllowing  
1. Write an Xpath for books
2. Write an Xpath for Mobiles
3. Write an Xpath for Clothes
4. Write an Xpath for Chocolates*/

package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment124 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://grotechminds.com/x-path/");// launch FB
		driver.manage().window().maximize();

		Thread.sleep(3000);

		WebElement folders_dd = driver.findElement(By.xpath("//span[@class='folder']"));//tagName[@attributeName=attributeValue]
		Thread.sleep(3000);
		folders_dd.click();
	
		
		WebElement books_dd = driver.findElement(By.xpath("(//span[@class='folder'])[1]"));//xpath for books
		Thread.sleep(2000);
		books_dd.click();
		Thread.sleep(2000);
		
		WebElement mobiles_dd = driver.findElement(By.xpath("(//span[@class='folder'])[15]"));//xpath for mobiles
		Thread.sleep(2000);
		mobiles_dd.click();
		
		
		WebElement clothes_dd = driver.findElement(By.xpath("(//span[@class='folder'])[24]"));//xpath for clothes
		Thread.sleep(2000);
		clothes_dd.click();
		
		
		WebElement choco_dd = driver.findElement(By.xpath("(//span[@class='folder'])[31]"));//xpath for choco
		Thread.sleep(2000);
		choco_dd.click();
		
		
		WebElement beverages_dd = driver.findElement(By.xpath("(//span[@class='folder'])[33]"));//xpath for beverages
		Thread.sleep(2000);
		beverages_dd.click();
		
	}

}