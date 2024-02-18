/* J_Richardson_AB_37
 * Assignment -128
Launch amazon india search for shoes,
select 30th shoe and
add it to the cart inspect shoes using xpath*/

package Assignments;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment128 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");// launch amazon
		driver.manage().window().maximize();

		WebElement search_tf = driver.findElement(By.id("twotabsearchtextbox"));// tagName[@attributeName=attributeValue]
		Thread.sleep(1000);
		search_tf.sendKeys("Shoes");
		search_tf.sendKeys(Keys.ENTER);
		Thread.sleep(3000);

		List<WebElement> results = driver.findElements(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])"));
		//int count_am_sug = results.size();
		System.out.println(results.size());
		Thread.sleep(3000);
		results.get(results.size() - 39).click(); 
		
		
	}

}