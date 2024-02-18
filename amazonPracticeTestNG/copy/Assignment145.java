/* J_Richardson_AB_37
 * Assignment -145
write testNG classes for the following 
1.login to amazon
 2.search for a pen  
 3.select anyone from the search result 
 4.logout*/

//2.Login>>Search>>Pen>>Open One>>Pen deatils>>Logout

package amazonPracticeTestNG.copy;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Assignment145 extends Launch_quit {
	@Test
	public void login_Search_Pen_logout() throws InterruptedException {

		WebElement amsearch_tf = driver.findElement(By.id("twotabsearchtextbox"));
		Thread.sleep(1000);
		amsearch_tf.sendKeys("shoes");

		WebElement search_btn = driver.findElement(By.id("nav-search-submit-button"));
		Thread.sleep(1000);
		search_btn.click();

		WebElement shoes1 = driver
				.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[30]"));
		Thread.sleep(1000);
		shoes1.click();

		Set<String> selected_shoe = driver.getWindowHandles();

		Iterator<String> pcId = selected_shoe.iterator();

		String parendId = pcId.next();// parent id from parentandchild
		String childId = pcId.next();// 1st childid

		System.out.println(parendId);
		System.out.println(childId);

		driver.switchTo().window(childId);// moved the control to child window
		Thread.sleep(3000);

//		WebElement addToCart_btn = driver.findElement(By.id("add-to-cart-button"));
//		Thread.sleep(2000);
//		addToCart_btn.click();
//		Thread.sleep(1000);

	}
}
